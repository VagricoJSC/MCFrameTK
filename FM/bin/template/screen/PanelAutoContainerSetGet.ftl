<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/Panel.ftl" as PANEL>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_EI")>
	/** [${aBlockId}]ブロックのコンテナField定義 */
	private final <@CDEF.CONT_DEF body=aBlockId/> a${aBlockId}${S("${aBlockId}_CODE_S")};
</#if>
</#list>

<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
<#if B("${aBlockId}_IS_ROW")&&!B("${aBlockId}_IS_EI")>
	/**
	 * 項目コピーによってa${aBlockId}${S("${aBlockId}_CODE_S")}を設定します。
	 *
	 * a${aBlockId}${S("${aBlockId}_CODE_S")}のインスタンスは変更されません。
	 *
	 * @param row ${aBlockId}${S("${aBlockId}_CODE_S")}
	 */
	public void set${aBlockId}${S("${aBlockId}_CODE_S")}(<@CDEF.CONT_DEF body=aBlockId/> row) {
		if (row != null) {
			MCRow.copyall(get${aBlockId}${S("${aBlockId}_CODE_S")}(), row);
		}
	}

</#if>
<#if B("${aBlockId}_IS_LIST")>
<#--<#if !B("${aBlockId}_IS_OVERRIDE")>--><#if !B("${aBlockId}_IS_EI")>
	/**
	 * コピーによってa${aBlockId}${S("${aBlockId}_CODE_S")}を設定します。
	 *
	 * a${aBlockId}${S("${aBlockId}_CODE_S")}のインスタンスは変更されません。
	 *
	 * @param dataset ${aBlockId}${S("${aBlockId}_CODE_S")}
	 */
	public void set${aBlockId}${S("${aBlockId}_CODE_S")}(<#if !B("${aBlockId}_FACT_IS_GENE_LIST")&&B("${aBlockId}_IS_OVERRIDE")>MCList<#else><@CDEF.CONT_DEF body=aBlockId/></#if> aList) {
		if (get${aBlockId}${S("${aBlockId}_CODE_S")}() != aList) {
			get${aBlockId}${S("${aBlockId}_CODE_S")}().setAll(aList);
		}
	}

</#if></#if>
<#--<#if !B("${aBlockId}_IS_OVERRIDE")>--><#if !B("${aBlockId}_IS_EI")>
	/**
	 * [${aBlockId}]ブロックのコンテナa${aBlockId}${S("${aBlockId}_CODE_S")}を返します。
	 *
	 * @return ${aBlockId}${S("${aBlockId}_CODE_S")}
	 */
	public <@CDEF.GETTER_RET_TYPE body=aBlockId/> get${aBlockId}${S("${aBlockId}_CODE_S")}() {
		return a${aBlockId}${S("${aBlockId}_CODE_S")};
	}

</#if>
<#if !B("${aBlockId}_IS_EI")>
	/**
	 * a${aBlockId}Rを作成します。
	 *
	 * @return ${aBlockId}R
	 */
	public <@CDEF.CONT_ROW_DEF body=aBlockId/> create${aBlockId}R() {
		return <@CDEF.CONT_ROW_DEF body=aBlockId/>.create();
	}

<#if B("${aBlockId}_IS_LIST")>
	/**
	 * a${aBlockId}Lを作成します。
	 *
	 * @return ${aBlockId}L
	 */
	public <@CDEF.GETTER_RET_TYPE body=aBlockId/> create${aBlockId}L() {
		return <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
	}

</#if></#if>
<#-- GUI部品インスタンス初期化遅延 ***** -->
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
<#if !B("${aBlockId}_IS_OVERRIDE")>
	/**
	 * ${aBlockId}Tableを初期化します。
	 */
	protected void create${aBlockId}Table(){
		if(${aBlockId}Table == null){
			${aBlockId}Table = beansFactory.create<#if S("${aBlockId}_COMPONENT")="CGT">ColumnGroup<#elseif S("${aBlockId}_COMPONENT")="LYT">Layout</#if>Table<#if S("${aBlockId}_COMPONENT")="TBL2"||S("${aBlockId}_COMPONENT")="TBL">2</#if>("${aBlockId}.table");
		}
	}

</#if></#if>
<#-- ***** GUI部品インスタンス初期化遅延 -->
</#list>
	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
		if(!MCCollectionUtil.contains(ret, get${aBlockId}${S("${aBlockId}_CODE_S")}())) ret.add(get${aBlockId}${S("${aBlockId}_CODE_S")}());
</#list>
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
		if(aCnt == get${aBlockId}${S("${aBlockId}_CODE_S")}()) return "${aBlockId}";
		</#list>
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
		if(bId.equals("${aBlockId}")) return get${aBlockId}${S("${aBlockId}_CODE_S")}();
		</#list>
		return super.getContainer(bId);
	}
