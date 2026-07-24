Mod.ID,プログラム名,Panel/Logic,Program ID,Class Name,備考
,,,,ShareB.依存数・SuperB.継承数,ShareB.・SuperB.
,,,,電文数,電文ID
,,,,部品数・InnerRow数,利用部品・利用Row
<#list A("MODULE_IDS") as mId>
<#list A(mId + "_SCR_IDS") as scrId>
${mId},${S(mId + "_" + scrId + "_NAME")},Panel,${scrId},${S(mId + "_" + scrId + "_CLASS")},"${S(mId + "_" + scrId + "_MEMO")}"
<#if S(mId + "_" + scrId + "_BLOCK_NUM")!=""&&S(mId + "_" + scrId + "_BLOCK_NUM")!="0">
,,,ShareB.・SuperB.：,(${S(mId + "_" + scrId + "_SHARE_BLOCK_NUM")} + ${S(mId + "_" + scrId + "_SUPER_BLOCK_NUM")}) / ${S(mId + "_" + scrId + "_BLOCK_NUM")},<@LIST key=mId + "_" + scrId + "_DPD_BLOCKS"/><#rt>
</#if>
<#if A(mId + "_" + scrId + "_TELEGRAM_IDS")?size!=0>
,,,電文：,"${A(mId + "_" + scrId + "_TELEGRAM_IDS")?size}",<@LIST key=mId + "_" + scrId + "_TELEGRAM_IDS"/><#rt>
</#if>
<#if A(mId + "_" + scrId + "_TELEGRAM_ERRS")?size!=0>
<#assign e=0>
<#list A(mId + "_" + scrId + "_TELEGRAM_ERRS") as err>
<#assign e=e+1>
,,,電文エラー${e}：,"${err}",
</#list>
</#if>
<#if A(mId + "_" + scrId + "_DPD_PARTS")?size!=0>
,,,部品・I.Row：,部品: <@PLUS a=S(mId + "_" + scrId + "_EMSCR_NUM") b=S(mId + "_" + scrId + "_EMCLM_NUM")/>  IRow: ${S(mId + "_" + scrId + "_INNER_ROW_NUM")},<@LIST key=mId + "_" + scrId + "_DPD_PARTS"/><#rt>
</#if>
</#list>
</#list>

<#include F("FTL.REPO.ERR_PART")/>

<#macro LIST key>
"<#list A(key) as value>${value}<#if value_has_next>,</#if></#list>"
</#macro>

<#macro PLUS a b>
<#if a!="0">${a}</#if><#if a!="0"&&b!="0">+</#if><#if b!="0">${b}</#if><#rt>
</#macro>