import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { ReferenzplattformCustomerReferencesModule } from './customer-references/customer-references.module';
import { ReferenzplattformConsultingDivisionModule } from './consulting-division/consulting-division.module';
import { ReferenzplattformCustomersModule } from './customers/customers.module';
import { ReferenzplattformIndustriesModule } from './industries/industries.module';
import { ReferenzplattformProjectRolesModule } from './project-roles/project-roles.module';
import { ReferenzplattformServiceComponentsModule } from './service-components/service-components.module';
import { ReferenzplattformDownloadsModule } from './downloads/downloads.module';
import { ReferenzplattformDocumentTypesModule } from './document-types/document-types.module';
import { ReferenzplattformLanguagesModule } from './languages/languages.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        ReferenzplattformCustomerReferencesModule,
        ReferenzplattformConsultingDivisionModule,
        ReferenzplattformCustomersModule,
        ReferenzplattformIndustriesModule,
        ReferenzplattformProjectRolesModule,
        ReferenzplattformServiceComponentsModule,
        ReferenzplattformDownloadsModule,
        ReferenzplattformDocumentTypesModule,
        ReferenzplattformLanguagesModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ReferenzplattformEntityModule {}
