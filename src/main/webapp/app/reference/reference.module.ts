import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ReferenzplattformSharedModule } from '../shared';

import { REFERENCE_ROUTE, ReferenceComponent } from './';

@NgModule({
    imports: [
        ReferenzplattformSharedModule,
        RouterModule.forChild([ REFERENCE_ROUTE ])
    ],
    declarations: [
        ReferenceComponent,
    ],
    entryComponents: [
    ],
    providers: [
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ReferenzplattformReferenceModule {}
