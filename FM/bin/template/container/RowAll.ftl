<#import "/container/RowEi.ftl" as R_EI>
<#assign CLASS_MODIFIER=S(S("BLOCK_ID") + "_MODIFIER") + " "/>
<#assign CLASS_NAME=S("BLOCK_ID") + B("IS_DAO")?string("_","") + "R"/>
<#assign SUPER_CLASS_NAME=S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")/>
<#include F("FTL.ROW.AUTO_BODY")/>
<@R_EI.CREATE/>

<@R_EI.CREATE_BY_NAME/>
<#if B("IS_DAO")&&!FMCONST_B("DB.DBC_GENE_630")>

	/**
	 * DMLAgent‚Ì‰Šú‰»ˆ—
	 *
	 */
<@DML_AB.DML_INIT M_SIG="initDMLAgent" ARG_CLASS="MCDMLAgent" ARG_NAME="dml"/>
</#if>
}