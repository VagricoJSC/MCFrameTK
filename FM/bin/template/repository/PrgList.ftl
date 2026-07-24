Mod.ID,プログラム名,Panel/Logic,Program ID,Class Name,オペレーション名,Operation ID,Method Name,備考
,,,,,,,ShareB.依存数・SuperB.継承数,ShareB.・SuperB.
,,,,,,,電文数,電文ID
,,,,,,,InnerRow数,利用Row
<#list A("MODULE_IDS") as mId>
<#list A(mId + "_LGC_IDS") as lgcId>
<#list A(mId + "_" + lgcId + "_OPE_IDS") as opeId>
${mId},${S(mId + "_" + lgcId + "_" + opeId + "_NAME")},Logic,${lgcId},${S(mId + "_" + lgcId + "_" + opeId + "_CLASS")},<#rt>
${S(mId + "_" + lgcId + "_" + opeId + "_METHOD_NAME")},${opeId},${S(mId + "_" + lgcId + "_" + opeId + "_METHOD")},"${S(mId + "_" + lgcId + "_" + opeId + "_MEMO")}"
<#if S(mId + "_" + lgcId + "_" + opeId + "_BLOCK_NUM")!=""&&S(mId + "_" + lgcId + "_" + opeId + "_BLOCK_NUM")!="0">
,,,,,,ShareB.・SuperB.：,(${S(mId + "_" + lgcId + "_" + opeId + "_SHARE_BLOCK_NUM")} + ${S(mId + "_" + lgcId + "_" + opeId + "_SUPER_BLOCK_NUM")}) / ${S(mId + "_" + lgcId + "_" + opeId + "_BLOCK_NUM")},<@LIST key=mId + "_" + lgcId + "_" + opeId + "_DPD_BLOCKS"/><#rt>
</#if>
<#if A(mId + "_" + lgcId + "_" + opeId + "_TELEGRAM_IDS")?size!=0>
,,,,,,電文：,"${A(mId + "_" + lgcId + "_" + opeId + "_TELEGRAM_IDS")?size}",<@LIST key=mId + "_" + lgcId + "_" + opeId + "_TELEGRAM_IDS"/><#rt>
</#if>
<#if A(mId + "_" + lgcId + "_" + opeId + "_DPD_PARTS")?size!=0>
,,,,,,I.Row：,IRow: ${S(mId + "_" + lgcId + "_" + opeId + "_INNER_ROW_NUM")},<@LIST key=mId + "_" + lgcId + "_" + opeId + "_DPD_PARTS"/><#rt>
</#if>
</#list>
</#list>
</#list>


<#include F("FTL.REPO.ERR_PART")/>

<#macro LIST key>
"<#list A(key) as value>${value}<#if value_has_next>,</#if></#list>"
</#macro>