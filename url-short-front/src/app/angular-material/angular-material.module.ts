import { NgModule } from '@angular/core';

import { MatButtonModule } from "@angular/material/button";
import { MatCardModule } from "@angular/material/card";
import { MatSlideToggleModule } from "@angular/material/slide-toggle";
import { MatIconModule } from "@angular/material/icon";
import { MatTabsModule } from "@angular/material/tabs";
import { MatToolbarModule } from "@angular/material/toolbar";
import { MatTooltipModule } from "@angular/material/tooltip";
import { MatProgressSpinnerModule } from "@angular/material/progress-spinner";
import { MatGridListModule } from "@angular/material/grid-list";
import { MatOptionModule } from "@angular/material/core";
import { MatSelectModule } from "@angular/material/select";
import { MatSidenavModule } from "@angular/material/sidenav";
import { MatDividerModule } from "@angular/material/divider";
import { MatListModule } from "@angular/material/list";
import { ScrollingModule } from "@angular/cdk/scrolling";
import { MatDialogModule } from "@angular/material/dialog";
import { MatInputModule } from "@angular/material/input";
import { MatFormFieldModule } from "@angular/material/form-field";

@NgModule({
	declarations: [],
	imports: [
		MatToolbarModule,
		MatIconModule,
		MatButtonModule,
		MatFormFieldModule,
		MatTabsModule,
		MatTooltipModule,
		MatCardModule,
		MatSlideToggleModule,
		MatProgressSpinnerModule,
		MatGridListModule,
		MatInputModule,
		MatOptionModule,
		MatSelectModule,
		MatSidenavModule,
		MatDividerModule,
		MatListModule,
		ScrollingModule,
		MatDialogModule,
	],
	exports: [
		MatToolbarModule,
		MatIconModule,
		MatButtonModule,
		MatFormFieldModule,
		MatTabsModule,
		MatCardModule,
		MatSlideToggleModule,
		MatTooltipModule,
		MatProgressSpinnerModule,
		MatGridListModule,
		MatInputModule,
		MatOptionModule,
		MatSelectModule,
		MatSidenavModule,
		MatDividerModule,
		MatListModule,
		ScrollingModule,
		MatDialogModule,
	],
})
export class AngularMaterialModule { }
