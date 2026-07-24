<html><body>
<p>画面プログラムリスト　　　　　${S("SYSTEM_DATE")} 作成</p>
<table border=1 cellspacing=0 cellpadding=2 >
<tr>	<th rowspan=2>Mod.</th>
	<th colspan=2>Program</th>

	<th rowspan=2>Class Name</th>
	<th rowspan=2>備考</th>	</tr>
<tr>
	<th>名称</th>
	<th>ID</th>

			</tr>
<tr>	<th></th>
	<th></th>
	<th colspan=2>ShareB.依存数・SuperB.継承数</th>
	<th>ShareB.・SuperB.</tr>	</tr>
<tr>	<th></th>
	<th></th>
	<th colspan=2>電文数</th>
	<th>電文ID</th>	</tr>
<tr>	<th></th>
	<th></th>
	<th colspan=2>部品数・InnerRow数</th>
	<th>利用部品・利用Row</th>	</tr>

<#list A("MODULE_IDS") as mId>
<#list A(mId + "_SCR_IDS") as scrId>
<tr>	<td>${mId}</td>
	<td>${S(mId + "_" + scrId + "_NAME")}</td>
	<td>${scrId}</td>
	<td>${S(mId + "_" + scrId + "_CLASS")}</td>
	<td>${S(mId + "_" + scrId + "_MEMO")}</td>	</tr>
<#if S(mId + "_" + scrId + "_BLOCK_NUM")!=""&&S(mId + "_" + scrId + "_BLOCK_NUM")!="0">
<tr>	<td></td>
	<td></td>
	<td colspan=2>ShareB.・SuperB.：</td>
	<td>(${S(mId + "_" + scrId + "_SHARE_BLOCK_NUM")} + ${S(mId + "_" + scrId + "_SUPER_BLOCK_NUM")}) / ${S(mId + "_" + scrId + "_BLOCK_NUM")}</td>
	<td><@LIST key=mId + "_" + scrId + "_DPD_BLOCKS"/></td>	</tr>
</#if>
<#if A(mId + "_" + scrId + "_TELEGRAM_IDS")?size!=0>
<tr>	<td></td>
	<td colspan=2>電文：</td>
	<td>${A(mId + "_" + scrId + "_TELEGRAM_IDS")?size}</td>
	<td><@LIST key=mId + "_" + scrId + "_TELEGRAM_IDS"/></td>	</tr>
</#if>
<#if A(mId + "_" + scrId + "_TELEGRAM_ERRS")?size!=0>
<#assign e=0>
<#list A(mId + "_" + scrId + "_TELEGRAM_ERRS") as err>
<#assign e=e+1>
<tr>	<td></td>
	<td>電文エラー${e}：</td>
	<td colspan=4 bgcolor=RED
<#list err?split("\n") as lToken>
  ${lToken}<br>
</#list>
	</td>
</tr>
</#list>
</#if>
<#if A(mId + "_" + scrId + "_DPD_PARTS")?size!=0>
<tr>	<td></td>
	<td colspan=2>部品・I.Row：</td>
	<td>部品: <@PLUS a=S(mId + "_" + scrId + "_EMSCR_NUM") b=S(mId + "_" + scrId + "_EMCLM_NUM")/>  IRow: ${S(mId + "_" + scrId + "_INNER_ROW_NUM")}</td>
	<td><@LIST key=mId + "_" + scrId + "_DPD_PARTS"/></td>	</tr>
</#if>
</#list>
</#list>
</table>
<#include F("FTL.REPO.ERR_PART_HTML")/>

</body>
</html>

<#macro LIST key>
<#list A(key) as value>${value}<#if value_has_next>,</#if></#list>
</#macro>

<#macro PLUS a b>
<#if a!="0">${a}</#if><#if a!="0"&&b!="0">+</#if><#if b!="0">${b}</#if><#rt>
</#macro>