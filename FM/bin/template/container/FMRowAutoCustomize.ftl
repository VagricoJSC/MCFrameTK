<#--2007/12/21 MoochiFrameManagerのコンテナを自動生成する際のftlカスタマイズメモ

MoochiFrameManagerでは自動生成されたRowコンテナを各Builderで利用しているが
その構造要件から、（Auto,EIクラスに）ジェネリクス定義を追加している。
この特別自動生成のために、FrameMangerのコンテナ自動生成の際には、このftlに修正を加える必要がある。

FM用特別自動生成のために修正したファイル：
bin/template/container/RowEi.ftl
bin/template/container/RowCustom.ftl
bin/template/container/RowAutoBody.ftl

修正内容：
RowAutoBody.ftl
２行目に <#import "/container/FMRowAutoCustomize.ftl" as FMD> を追加。
クラス名の後ろに <@FMD.CLASS_G_DEC lay="A"/> を追加。
スーパークラス名の後ろに <@FMD.S_CLASS_G_DEC lay="A"/> を追加。

RowCustom.ftl
２行目に <#import "/container/FMRowAutoCustomize.ftl" as FMD> を追加。
クラス名の後ろに <@FMD.CLASS_G_DEC lay="C"/> を追加。
スーパークラス名の後ろに <@FMD.S_CLASS_G_DEC lay="C"/> を追加。

RowEi.ftl
２行目に <#import "/container/FMRowAutoCustomize.ftl" as FMD> を追加。
クラス名の後ろに <@FMD.CLASS_G_DEC lay="E"/> を追加。
スーパークラス名の後ろに <@FMD.S_CLASS_G_DEC lay="E"/> を追加。
-->
<#macro CLASS_G_DEC lay>
<#return><#-- ← FM自動生成の場合にはコメントアウトすること。-->
<#if lay=="A"&&(S("BLOCK_ID")=="FMSpec"||S("BLOCK_ID")=="FMBlock"||S("BLOCK_ID")=="FMItem"||S("BLOCK_ID")=="FMInnerSpec"||S("BLOCK_ID")=="FMInnerBlock"||S("BLOCK_ID")=="FMInnerItem")><#else>
<#if S("BLOCK_ID")?ends_with("Spec")><T extends ${S("BLOCK_ID")?replace("Spec","")}BlockR></#if><#rt>
<#if S("BLOCK_ID")?ends_with("Block")><T extends ${S("BLOCK_ID")?replace("Block","")}ItemR, E extends ${S("BLOCK_ID")?replace("Block","")}SpecR></#if><#rt>
<#if S("BLOCK_ID")?ends_with("Item")><E extends ${S("BLOCK_ID")?replace("Item","")}BlockR></#if><#rt>
</#if>
</#macro>

<#macro S_CLASS_G_DEC lay>
<#return><#-- ← FM自動生成の場合にはコメントアウトすること。-->
<#if (lay=="A"||lay=="C")&&(S("BLOCK_ID")=="FMSpec"||S("BLOCK_ID")=="FMBlock"||S("BLOCK_ID")=="FMItem"||S("BLOCK_ID")=="FMInnerSpec"||S("BLOCK_ID")=="FMInnerBlock"||S("BLOCK_ID")=="FMInnerItem")><#else>
<#if S("BLOCK_ID")?ends_with("Spec")><T></#if><#rt>
<#if S("BLOCK_ID")?ends_with("Block")><T, E></#if><#rt>
<#if S("BLOCK_ID")?ends_with("Item")><E></#if><#rt>
</#if>
</#macro>
