import { Component, OnInit } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { HttpClient } from "@angular/common/http";

interface statsObject {
	originalURL: String;
	shortURL: String;
	timesAccessed: number;
	timesShortened: number;
}

@Component({
	selector: "app-root",
	templateUrl: "./app.component.html",
	styleUrls: ["./app.component.css"],
})
export class AppComponent implements OnInit {
	title = "url-short-front";
	form: FormGroup;
	showStats: boolean;
	stats: statsObject;

	constructor(private http: HttpClient) {
		this.form = new FormGroup({
			url: new FormControl(null, [Validators.required]),
		});
		this.showStats = false;
		this.stats = {
			originalURL: "",
			shortURL: "",
			timesShortened: 0,
			timesAccessed: 0,
		};
	}

	ngOnInit(): void {}

	submitURL(): void {
		console.log(this.form.get("url"));

		this.http
			.post("http://localhost:8080/shorten", {
				originalURL: this.form.get("url")?.value,
			})
			.subscribe((postRes) => {
				console.log(postRes);

				this.http
					.get<{
						originalURL: String;
						shortURL: String;
						timesAccessed: number;
						timesShortened: number;
					}>("http://localhost:8080/stats/" + postRes)
					.subscribe((getRes) => {
						console.log(getRes);

						this.showStats = true;
						this.stats = getRes;
					});
			});
	}
}
