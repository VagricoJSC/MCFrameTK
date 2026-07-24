<html><body>
<p>オペレーションプログラムリスト　　　　　${S("SYSTEM_DATE")} 作成</p>
<table border=1 cellspacing=0 cellpadding=2 >
<tr>	<th rowspan=2>Mod.</th>
	<th colspan=2>Program</th>

	<th rowspan=2>Class Name</th>
	<th colspan=2>Operation</th>

	<th rowspan=2>Method Name</th>
	<th rowspan=2>備考</th>	</tr>
<tr>
	<th>名称</th>
	<th>ID</th>

	<th>名称</th>
	<th>ID</th>

			</tr>
<tr>	<th></th>
	<th></th>
	<th></th>
	<th colspan=4>ShareB.依存数・SuperB.継承数</th>
	<th>ShareB.・SuperB.</th>	</tr>
<tr>	<th></th>
	<th></th>
	<th></th>
	<th></th>
	<th colspan=3>電文数</th>
	<th>電文ID</th>	</tr>
<tr>	<th></th>
	<th></th>
	<th></th>
	<th></th>
	<th colspan=3>InnerRow数</th>
	<th>利用Row</th>	</tr>
<#list A("MODULE_IDS") as mId>
<#list A(mId + "_LGC_IDS") as lgcId>
<#list A(mId + "_" + lgcId + "_OPE_IDS") as opeId>
<tr>	<td>${mId}</td>
	<td>${S(mId + "_" + lgcId + "_" + opeId + "_NAME")}</td>
	<td>${lgcId}</td>
	<td>${S(mId + "_" + lgcId + "_" + opeId + "_CLASS")}</td>
	<td>${S(mId + "_" + lgcId + "_" + opeId + "_METHOD_NAME")}</td>
	<td>${opeId}</td>
	<td>${S(mId + "_" + lgcId + "_" + opeId + "_METHOD")}</td>
	<td>${S(mId + "_" + lgcId + "_" + opeId + "_MEMO")}</td></tr>
<#if S(mId + "_" + lgcId + "_" + opeId + "_BLOCK_NUM")!=""&&S(mId + "_" + lgcId + "_" + opeId + "_BLOCK_NUM")!="0">
<tr>	<td></td>
	<td></td>
	<td></td>
	<td colspan=2>ShareB.・SuperB.：</td>
	<td colspan=2>(${S(mId + "_" + lgcId + "_" + opeId + "_SHARE_BLOCK_NUM")} + ${S(mId + "_" + lgcId + "_" + opeId + "_SUPER_BLOCK_NUM")}) / ${S(mId + "_" + lgcId + "_" + opeId + "_BLOCK_NUM")}</td>
	<td><@LIST key=mId + "_" + lgcId + "_" + opeId + "_DPD_BLOCKS"/></td></tr>
</#if>
<#if A(mId + "_" + lgcId + "_" + opeId + "_TELEGRAM_IDS")?size!=0>
<tr>	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td colspan=2>電文：</td>
	<td>${A(mId + "_" + lgcId + "_" + opeId + "_TELEGRAM_IDS")?size}</td>
	<td><@LIST key=mId + "_" + lgcId + "_" + opeId + "_TELEGRAM_IDS"/></td></tr>
</#if>
<#if A(mId + "_" + lgcId + "_" + opeId + "_DPD_PARTS")?size!=0>
<tr>	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td colspan=2>I.Row：,</td>
	<td>IRow: ${S(mId + "_" + lgcId + "_" + opeId + "_INNER_ROW_NUM")}</td>
	<td><@LIST key=mId + "_" + lgcId + "_" + opeId + "_DPD_PARTS"/></td></tr>
</#if>
</#list>
</#list>
</#list>
</table>
<#include F("FTL.REPO.ERR_PART_HTML")/>

</body>
</html>

<#macro LIST key>
<#list A(key) as value>${value}<#if value_has_next>,</#if></#list>
</#macro>