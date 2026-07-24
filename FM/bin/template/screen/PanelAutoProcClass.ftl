<#import "/macro/ClassDef.ftl" as CDEF>
	/**
	 * [${aTelId?replace(".","_")}]の定型処理のInnerClass
	 */
	protected class ${aTelId?replace(".","_")}Bridge extends <#if S(aTelId + "_SUPER_BRIDGE_CLASS")=="">MCCallerPanelBridge<#else>${S(aTelId + "_SUPER_BRIDGE_CLASS")}</#if> {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_${aTelId?replace(".","_")};

		/** コンストラクタ */
		protected ${aTelId?replace(".","_")}Bridge() {
			p_${aTelId?replace(".","_")} = new MCParam(PDef.${aTelId?replace(".","_")}_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.${aTelId?replace(".","_")}_INFO);
			param.setReqSrcId(getScreenID());
			// Up
<#list A("${aTelId}_UP_BLOCK_IDS") as aTelUpBlockId>
			param.addUpBlock(<@CDEF.CONT_CLASS_NAME body0=S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID")/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID")/>));
</#list>
			// Down
<#list A("${aTelId}_DOWN_BLOCK_IDS") as aTelDownBlockId>
			param.addDownBlock(<@CDEF.CONT_CLASS_NAME body0=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/>));
</#list>

			p_${aTelId?replace(".","_")} = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_${aTelId?replace(".","_")}.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
<#list A("${aTelId}_UP_BLOCK_IDS") as aTelUpBlockId>
			p_${aTelId?replace(".","_")}.addUpBlock(get${S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID")}${S("${aTelId}_UP_${aTelUpBlockId}_CODE_S")}()<#if S("${aTelId}_UP_${aTelUpBlockId}_CODE_S")="L">.shallowClone()</#if>);
</#list>
		}

		protected MCContainer up(int i) {
			return p_${aTelId?replace(".","_")}.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_${aTelId?replace(".","_")}.getContainerParam().getDownBlock(i);
		}
		
<#list A("${aTelId}_UP_BLOCK_IDS") as aTelUpBlockId>
<#if S("SPEC_ID")==S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_SPEC_ID")>
	<#--<#if !(B(S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID") + "_IS_LIST")&&B(S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID") + "_IS_OVERRIDE"))>-->
		protected <@CDEF.GETTER_RET_TYPE body=S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID")/> up${aTelUpBlockId}() {
			return (<@CDEF.CONT_DEF body=S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID")/>)up(${aTelUpBlockId});
		}
	<#--<#else>
		//
		// up${aTelUpBlockId}() は自動生成されません。
		//     （継承定義されたList型のブロックのためのアクセサは自動生成されません。）
		//
	</#if>-->
<#else>
		//
		// up${aTelUpBlockId}() は自動生成されません。
		//     up${aTelUpBlockId} のアクセサはsuperScreenのメソッドを使用します。
		//
</#if>
</#list>

<#list A("${aTelId}_DOWN_BLOCK_IDS") as aTelDownBlockId>
<#if S("SPEC_ID")==S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_SPEC_ID")>
	<#--<#if !(B(S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID") + "_IS_LIST")&&B(S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID") + "_IS_OVERRIDE"))>-->
		protected <@CDEF.GETTER_RET_TYPE body=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/> down${aTelDownBlockId}() {
			return (<@CDEF.CONT_DEF body=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/>)down(${aTelDownBlockId});
		}
	<#--<#else>
		//
		// down${aTelDownBlockId}() は自動生成されません。
		//     （継承定義されたList型のブロックのためのアクセサは自動生成されません。）
		//
	</#if>-->
<#else>
		// down${aTelDownBlockId}() は自動生成されません。
		//     down${aTelDownBlockId}() は、superScreenのメソッドを使用します。
</#if>
</#list>

		protected void setupDownParam() {
<#list A("${aTelId}_DOWN_BLOCK_IDS") as aTelDownBlockId>
			p_${aTelId?replace(".","_")}.addDownBlock(<@CDEF.CONT_CLASS_NAME body0=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/>));
</#list>
		}
		protected MCParam param() {
			return p_${aTelId?replace(".","_")};
		}

		protected void show() {
<#list A("${aTelId}_DOWN_BLOCK_IDS") as aTelDownBlockId>
			set${S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")}${S("${aTelId}_DOWN_${aTelDownBlockId}_CODE_S")}((<#if B(S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID") + "_IS_LIST")&&B(S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID") + "_IS_OVERRIDE")>MCList<#else><@CDEF.CONT_DEF body=S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")/></#if>)p_${aTelId?replace(".","_")}.getContainerParam().getDownBlock(${aTelDownBlockId}));
</#list>
		}

		protected void clear() {
<#list A("${aTelId}_DOWN_BLOCK_IDS") as aTelDownBlockId>
			get${S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")}${S("${aTelId}_DOWN_${aTelDownBlockId}_CODE_S")}().clear();
</#list>
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
<#list A("${aTelId}_UP_BLOCK_IDS") as aTelUpBlockId>
			result.add(get${S("${aTelId}_UP_${aTelUpBlockId}_L_BLOCK_ID")}${S("${aTelId}_UP_${aTelUpBlockId}_CODE_S")}());
</#list>
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
<#list A("${aTelId}_DOWN_BLOCK_IDS") as aTelDownBlockId>
			result.add(get${S("${aTelId}_DOWN_${aTelDownBlockId}_L_BLOCK_ID")}${S("${aTelId}_DOWN_${aTelDownBlockId}_CODE_S")}());
</#list>
			return result;
		}
	}
	