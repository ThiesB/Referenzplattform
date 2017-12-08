import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ReferenzplattformSharedModule } from '../../shared';
import {
    IndustriesService,
    IndustriesPopupService,
    IndustriesComponent,
    IndustriesDetailComponent,
    IndustriesDialogComponent,
    IndustriesPopupComponent,
    IndustriesDeletePopupComponent,
    IndustriesDeleteDialogComponent,
    industriesRoute,
    industriesPopupRoute,
} from './';

const ENTITY_STATES = [
    ...industriesRoute,
    ...industriesPopupRoute,
];

@NgModule({
    imports: [
        ReferenzplattformSharedModule,
        RouterModule.forChild(ENTITY_STATES)
    ],
    declarations: [
        IndustriesComponent,
        IndustriesDetailComponent,
        IndustriesDialogComponent,
        IndustriesDeleteDialogComponent,
        IndustriesPopupComponent,
        IndustriesDeletePopupComponent,
    ],
    entryComponents: [
        IndustriesComponent,
        IndustriesDialogComponent,
        IndustriesPopupComponent,
        IndustriesDeleteDialogComponent,
        IndustriesDeletePopupComponent,
    ],
    providers: [
        IndustriesService,
        IndustriesPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ReferenzplattformIndustriesModule {}
