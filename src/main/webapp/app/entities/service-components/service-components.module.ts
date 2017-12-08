import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ReferenzplattformSharedModule } from '../../shared';
import {
    ServiceComponentsService,
    ServiceComponentsPopupService,
    ServiceComponentsComponent,
    ServiceComponentsDetailComponent,
    ServiceComponentsDialogComponent,
    ServiceComponentsPopupComponent,
    ServiceComponentsDeletePopupComponent,
    ServiceComponentsDeleteDialogComponent,
    serviceComponentsRoute,
    serviceComponentsPopupRoute,
} from './';

const ENTITY_STATES = [
    ...serviceComponentsRoute,
    ...serviceComponentsPopupRoute,
];

@NgModule({
    imports: [
        ReferenzplattformSharedModule,
        RouterModule.forChild(ENTITY_STATES)
    ],
    declarations: [
        ServiceComponentsComponent,
        ServiceComponentsDetailComponent,
        ServiceComponentsDialogComponent,
        ServiceComponentsDeleteDialogComponent,
        ServiceComponentsPopupComponent,
        ServiceComponentsDeletePopupComponent,
    ],
    entryComponents: [
        ServiceComponentsComponent,
        ServiceComponentsDialogComponent,
        ServiceComponentsPopupComponent,
        ServiceComponentsDeleteDialogComponent,
        ServiceComponentsDeletePopupComponent,
    ],
    providers: [
        ServiceComponentsService,
        ServiceComponentsPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ReferenzplattformServiceComponentsModule {}
