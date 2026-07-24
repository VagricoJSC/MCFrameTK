<#import "/macro/ClassDef.ftl" as CDEF>
	/**
	 * ${S("METHOD")}オペレーション.<p>
	 *
<#if S("MEMO") != "">
<#list S("MEMO")?split("\n") as lToken>
	<#if !lToken?starts_with("@Rev")>
	 * ${lToken}<br>
	</#if>
</#list>
</#if>
	 */
	abstract public class ${S("METHOD")} extends ${S("EXTENDS_CLASS")}<#if A("IMPLE_IFS")?size!=0> implements<#list A("IMPLE_IFS") as impIf> ${impIf}<#if impIf_has_next>,</#if></#list></#if> {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "${S("METHOD_ID")}";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
<#assign TEL_UP_BS=A("TELEGRAM_UP_L_BLOCK_IDS")>
<#list TEL_UP_BS as aBlockId>
	<#if S("SPEC_ID")==S("TELEGRAM_UP_${aBlockId_index}_L_BLOCK_SPEC_ID")>
		/** このオペレーションへの上り電文パラメータの第${aBlockId_index}ブロックのコンテナField定義 */
		private final <@CDEF.CONT_DEF body=aBlockId/> up${aBlockId_index};
	<#else>
		// up${aBlockId_index} は自動生成されません。
		//     up${aBlockId_index} は、superOperationのフィールドを使用します。
	</#if>
</#list>
<#assign TEL_DOWN_BS=A("TELEGRAM_DOWN_L_BLOCK_IDS")>
<#list TEL_DOWN_BS as aBlockId>
	<#if S("SPEC_ID")==S("TELEGRAM_DOWN_${aBlockId_index}_L_BLOCK_SPEC_ID")>
		/** このオペレーションからの下り電文パラメータの第${aBlockId_index}ブロックのコンテナField定義 */
		private final <@CDEF.CONT_DEF body=aBlockId/> down${aBlockId_index};
	<#else>
		// down${aBlockId_index} は自動生成されません。
		//     down${aBlockId_index} は、superOperationのフィールドを使用します。
	</#if>
</#list>
<#list A("SHORTAGE_L_BLOCK_IDS_FOR_TEL_AND_SUBOPE") as aBlockId>
	<#if !B("${aBlockId}_IS_EI")>
		/** [${aBlockId}]ブロックのコンテナField定義 */
		private final <@CDEF.CONT_DEF body=aBlockId/> a${aBlockId};
	</#if>
</#list>
		
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#if !B("${aGrpId}_IS_OVERRIDE")>
		/**
		 * 連携情報 ${aGrpId}<p>
		 *
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		 * 連携先 <@REL_CLASS_HTML grp=aGrpId ope=sOpeId/> （{@link #${sOpeId}}）<br>
	</#list>
		 */
		public final String ${aGrpId} = "${aGrpId}";
</#if>

	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		/**
		 * <@REL_LABEL grp=aGrpId ope=sOpeId /> ${sOpeId}<p>
		 *
		 * <@REL_LABEL grp=aGrpId ope=sOpeId />クラス <#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")=="OPE"||S("${aGrpId}_${sOpeId}_TARGET_TYPE")=="OPI">{@link </#if><@REL_CLASS_HTML grp=aGrpId ope=sOpeId/><#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")=="OPE"||S("${aGrpId}_${sOpeId}_TARGET_TYPE")=="OPI">}</#if><br>
	<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS") as bId>
		 * 第${bId_index+1} 上りブロッククラス <@UP_DEF_HTML grp=aGrpId ope=sOpeId inx=bId/> （{@link #${sOpeId}_up${bId_index}}）<br>
	</#list>
	<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS") as bId>
		 * 第${bId_index+1} 下りブロッククラス <@DOWN_DEF_HTML grp=aGrpId ope=sOpeId inx=bId/> （{@link #${sOpeId}_down${bId_index}}）<br>
	</#list>
		 */
<#if !B("${aGrpId}_${sOpeId}_IS_OVERRIDE")>
		public final <@REL_CLASS grp=aGrpId ope=sOpeId/> ${sOpeId};
</#if>
	</#list>
		// 連携ロジック上り
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#assign UPBLKS=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS")>
		<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
			<#if UPBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>
		public final <@UP_DEF grp=aGrpId ope=sOpeId inx=bId/> ${sOpeId}_up${bId_index};
			</#if>
		</#list>
	</#list>
		// 連携ロジック下り
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#assign DOWNBLKS=A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS")>
		<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
			<#if DOWNBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
		public final <@DOWN_DEF grp=aGrpId ope=sOpeId inx=bId/> ${sOpeId}_down${bId_index};
			</#if>
		</#list>
	</#list>
</#list>
		
		// コンストラクタ
		protected ${S("METHOD")}() {
			
			// このオペレーションのコンテナ初期化
<#list TEL_UP_BS as aBlockId>
	<#if S("SPEC_ID")==S("TELEGRAM_UP_${aBlockId_index}_L_BLOCK_SPEC_ID")>
			up${aBlockId_index} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_IS_LIST")&&B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
	<#else>
			// up${aBlockId_index} の初期化は、superOperationのコンストラクタで行います。
	</#if>
</#list>
<#list TEL_DOWN_BS as aBlockId>
	<#if S("SPEC_ID")==S("TELEGRAM_DOWN_${aBlockId_index}_L_BLOCK_SPEC_ID")>
			down${aBlockId_index} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_IS_LIST")&&B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
	<#else>
			// down${aBlockId_index} の初期化は、superOperationのコンストラクタで行います。
	</#if>
</#list>
<#list A("SHORTAGE_L_BLOCK_IDS_FOR_TEL_AND_SUBOPE") as aBlockId>
	<#if !B("${aBlockId}_IS_EI")>
			a${aBlockId} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_IS_LIST")&&B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
	</#if>
</#list>

			// 連携オペレーションの初期化
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#if !B("${aGrpId}_${sOpeId}_IS_OVERRIDE")>
	<#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")="DBC">
			${sOpeId} = MCController.create(${S("${aGrpId}_${sOpeId}_TARGET_ID")}_R.create("T1"));
	</#if>
	<#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")="OPE">
			${sOpeId} = <#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">(${S("${aGrpId}_${sOpeId}_TARGET_PACKAGE_CLASS")}.${S("${aGrpId}_${sOpeId}_TARGET_METHOD")})</#if>${S("${aGrpId}_${sOpeId}_TARGET_PACKAGE_CLASS")}.crt${S("${aGrpId}_${sOpeId}_TARGET_METHOD")}();
<#-- PjIDがFW,MC以外でキャストするのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
	</#if>
	<#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")="OPI">
			${sOpeId} = createOperation("${S("${aGrpId}_${sOpeId}_TARGET_MODULE_ID")}","${S("${aGrpId}_${sOpeId}_TARGET_LOGIC_ID")}","${S("${aGrpId}_${sOpeId}_TARGET_METHOD")}",<@REL_CLASS grp=aGrpId ope=sOpeId/>.class);
	</#if>
	<#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")="SQL">
<#-- 「UPブロックがRow」&& 「DOWNブロックは指定なし || DOWNブロックはLIST」-->
		<#if (B("${aGrpId}_${sOpeId}_HAS_UP_SRC_BLOCK")&&B(S(aGrpId + "_" + sOpeId + "_UP_SRC_BLOCK_FACT_ID") + "_IS_ROW"))&&(!B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")||B(S(aGrpId + "_" + sOpeId + "_DOWN_DEST_BLOCK_FACT_ID") + "_IS_LIST"))>
<#assign u_s_b_f_id=S("${aGrpId}_${sOpeId}_UP_SRC_BLOCK_FACT_ID")/>
			${sOpeId} = new MCSQLController(${S("${aGrpId}_${sOpeId}_TARGET_PACKAGE_CLASS")}.${S("${aGrpId}_${sOpeId}_TARGET_ID")}, <@CDEF.CONT_CLASS_NAME body0=u_s_b_f_id/>.create<#if B(u_s_b_f_id + "_IS_LIST")&&B(u_s_b_f_id + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX u_s_b_f_id/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=u_s_b_f_id/>)<#if B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")>, <@CDEF.CONT_CLASS_NAME body0=S("${aGrpId}_${sOpeId}_DOWN_DEST_BLOCK_FACT_ID")/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=S("${aGrpId}_${sOpeId}_DOWN_DEST_BLOCK_FACT_ID")/>)</#if>);
		</#if>
<#-- 「UPブロックがList && DOWNブロックがList」||「UPブロックがList && DOWNブロックは指定なし」||「UPブロックは指定なし && DOWNブロックがList -->
		<#if B("${aGrpId}_${sOpeId}_HAS_UP_SRC_BLOCK")||B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")>
<#assign u_s_b_f_id=S("${aGrpId}_${sOpeId}_UP_SRC_BLOCK_FACT_ID")/>
			<#if (!B("${aGrpId}_${sOpeId}_HAS_UP_SRC_BLOCK")||B(S(aGrpId + "_" + sOpeId + "_UP_SRC_BLOCK_FACT_ID") + "_IS_LIST"))&&(!B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")||B(S(aGrpId + "_" + sOpeId + "_DOWN_DEST_BLOCK_FACT_ID") + "_IS_LIST"))>
			${sOpeId} = new MCSQLController(${S("${aGrpId}_${sOpeId}_TARGET_PACKAGE_CLASS")}.${S("${aGrpId}_${sOpeId}_TARGET_ID")}, null, <#if B("${aGrpId}_${sOpeId}_HAS_UP_SRC_BLOCK")><@CDEF.CONT_CLASS_NAME body0=u_s_b_f_id/>.create<#if B(u_s_b_f_id + "_IS_LIST")&&B(u_s_b_f_id + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX u_s_b_f_id/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=u_s_b_f_id/>)<#else>null</#if>, <#if B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")><@CDEF.CONT_CLASS_NAME body0=S("${aGrpId}_${sOpeId}_DOWN_DEST_BLOCK_FACT_ID")/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=S("${aGrpId}_${sOpeId}_DOWN_DEST_BLOCK_FACT_ID")/>)<#else>null</#if>);
			</#if>
		</#if>
	</#if>
</#if>
</#list></#list>
			
			// 連携オペレーションのコンテナ取得
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#assign UPBLKS=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS")>
		<#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")="OPE"||S("${aGrpId}_${sOpeId}_TARGET_TYPE")="OPI">
			<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
<#assign inx_str=S("${aGrpId}_${sOpeId}_${bId}_UP_DEST_INDEX")>
<#if inx_str==""><#assign inx_str=bId_index></#if>
				<#if UPBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>
			${sOpeId}_up${bId_index} = (<@UP_DEF grp=aGrpId ope=sOpeId inx=bId/>)${sOpeId}.up(${inx_str});
				</#if>
			</#list>
		<#else>
			<#if B("${aGrpId}_${sOpeId}_HAS_UP_SRC_BLOCK")>
<#assign BID=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS")?first>
				<#if UPBLKS?seq_contains(BID)&&!B("${aGrpId}_${sOpeId}_${BID}_UP_BLOCK_IS_OVERRIDE")>
			${sOpeId}_up0 = (<@UP_DEF grp=aGrpId ope=sOpeId inx=""/>)${sOpeId}.up(<@ZERO_ONE code_s=S("${aGrpId}_${sOpeId}_UP_DEST_CODE_S")/>);
				</#if>
			</#if>
		</#if>
	</#list>
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#assign DOWNBLKS=A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS")>
		<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
<#assign inx_str=S("${aGrpId}_${sOpeId}_${bId}_DOWN_SRC_INDEX")>
<#if inx_str==""><#assign inx_str=bId_index></#if>
			<#if DOWNBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
			${sOpeId}_down${bId_index} = (<@DOWN_DEF grp=aGrpId ope=sOpeId inx=bId/>)${sOpeId}.down(${inx_str});
			</#if>
		</#list>
	</#list>
</#list>

			// オペレーション、オペレーショングループの登録
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#if !B("${aGrpId}_${sOpeId}_IS_OVERRIDE")>
	<#if S("${aGrpId}_${sOpeId}_TARGET_TYPE")="OPI">
			appendIfOpe(${aGrpId}, ${sOpeId});
	<#else>
			appendOpe(${aGrpId}, ${sOpeId});
	</#if>
</#if>
</#list>
</#list>
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
		 * ${aGrpId}<br>
<#assign upRel=false>
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
<#assign b = S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")>
		 * <#if TEL_UP_BS?seq_contains(b)>up${TEL_UP_BS?seq_index_of(b)}()<#else>a${b}</#if> => <@UP_DEF_HTML grp=aGrpId ope=sOpeId inx=bId/> （{@link #${sOpeId}_up${bId_index}}）<br>
<#assign upRel=true>
		</#list>
	</#list>
	<#if !upRel>
		 * （上りブロック定義なし）<br>
	</#if>
</#list>
		 */
		public void mapUpContainers(String key) {
<#if S("CLASS_SUFFIX")=="MC"||S("CLASS_SUFFIX")=="FW">
			super.mapUpContainers(key);
</#if><#-- PjIDがFW,MCかどうかでsuperメソッド読み出し箇所が変わるのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#if S("${aGrpId}_SUBOPE_UP_BLOCK_IDS_SIZE")!="0">
			if (key.equals(${aGrpId})) {
				up_${aGrpId}(<#rt>
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
${sOpeId}_up${bId_index}, <#rt>
		</#list>
</#list>
<@RIGHTTRIM trim_chars=",">
<#list A("${aGrpId}_UP_SRC_BLOCK_IDS_SCS") as aBlockId><#if TEL_UP_BS?seq_contains(aBlockId)>up${TEL_UP_BS?seq_index_of(aBlockId)}()<#else><#if A("SHORTAGE_L_BLOCK_IDS_FOR_TEL_AND_SUBOPE")?seq_contains(aBlockId)&&!B("${aBlockId}_IS_EI")>a${aBlockId}<#else>${aBlockId}()</#if></#if>, </#list></@RIGHTTRIM>);
<#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">
				return;
</#if><#-- PjIDがFW,MC以外でreturnするのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
			}
</#if>
</#list>
<#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">
			super.mapUpContainers(key);
</#if><#-- PjIDがFW,MCかどうかでsuperメソッド読み出し箇所が変わるのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
		 * ${aGrpId}<br>
<#assign downRel=false>
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
<#assign b = S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")>
		 * <@DOWN_DEF_HTML grp=aGrpId ope=sOpeId inx=bId/>（{@link #${sOpeId}_down${bId_index}}）=> <#if TEL_DOWN_BS?seq_contains(b)>down${TEL_DOWN_BS?seq_index_of(b)}()<#else>a${b}</#if><br>
<#assign downRel=true>
		</#list>
	</#list>
	<#if !downRel>
		 * （下りブロック定義なし）<br>
	</#if>
</#list>
		 */
		public void mapDownContainers(String key) {
<#if S("CLASS_SUFFIX")=="MC"||S("CLASS_SUFFIX")=="FW">
			super.mapDownContainers(key);
</#if><#-- PjIDがFW,MCかどうかでsuperメソッド読み出し箇所が変わるのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#if S("${aGrpId}_SUBOPE_DOWN_BLOCK_IDS_SIZE")!="0">
			if (key.equals(${aGrpId})) {
				down_${aGrpId}(<#rt>
<#list A("${aGrpId}_DOWN_DEST_BLOCK_IDS_SCS") as aBlockId><#if TEL_DOWN_BS?seq_contains(aBlockId)>down${TEL_DOWN_BS?seq_index_of(aBlockId)}()<#else><#if A("SHORTAGE_L_BLOCK_IDS_FOR_TEL_AND_SUBOPE")?seq_contains(aBlockId)&&!B("${aBlockId}_IS_EI")>a${aBlockId}<#else>${aBlockId}()</#if></#if>, </#list><#rt>
<@RIGHTTRIM trim_chars=",">
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
${sOpeId}_down${bId_index}, <#rt>
		</#list>
</#list></@RIGHTTRIM>);
<#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">
				return;
</#if><#-- PjIDがFW,MC以外でreturnするのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
			}
</#if>
</#list>
<#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">
			super.mapDownContainers(key);
</#if><#-- PjIDがFW,MCかどうかでsuperメソッド読み出し箇所が変わるのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
		}

		public MCContainer up(int i) {
<#list TEL_UP_BS as aBlockId>
			if (i == ${aBlockId_index}) return up${aBlockId_index}();
</#list>
			return null;
		}
		
		public MCContainer down(int i) {
<#list TEL_DOWN_BS as aBlockId>
			if (i == ${aBlockId_index}) return down${aBlockId_index}();
</#list>
			return null;
		}

		public void exec() {
			clear();
			invoke((${S("CLASS")})${S("CLASS")}_${S("CLASS_SUFFIX")}_A.this);
		}
		
		protected void clear() {
<#list A("TELEGRAM_DOWN_BLOCK_IDS") as aBlockId>
			down${aBlockId_index}().clear();
</#list>
		}
<#list A("BLOCK_IDS") as aBlockId>
		/**
		 * ${aBlockId}ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public <@CDEF.CONT_ROW_DEF body=aBlockId/> create${aBlockId}R(){
			return <@CDEF.CONT_ROW_DEF body=aBlockId/>.create();
		}

		<#if B("${aBlockId}_IS_LIST")>
		/**
		 * ${aBlockId}ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public <@CDEF.GETTER_RET_TYPE body=aBlockId/> create${aBlockId}L(){
			return <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
		}

		</#if>
</#list>
		//-------------------------外部 I/F--------------------------
<#list TEL_UP_BS as aBlockId>
	<#if S("SPEC_ID")==S("TELEGRAM_UP_${aBlockId_index}_L_BLOCK_SPEC_ID")>
<#assign telItemList = telItems("UP",aBlockId_index)?word_list>
		/**
		 * 上り電文の第${aBlockId_index}ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第${aBlockId_index}ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
<#list A(aBlockId + "_ITEM_IDS_SCS") as anItemId>
<#if telItemList?seq_contains(anItemId)>
	<#if B("TELEGRAM_UP_${aBlockId_index}_${anItemId}_IS_REQUIRED")>
		 * 	<tr bgcolor="#ffccff"><td>*</td><#rt>
	<#else>
		 * 	<tr><td><br></td><#rt>
	</#if><#lt><td>${anItemId}</td></tr>
</#if>
</#list>
		 * </table>
		 *
		 * @see <@CDEF.CONT_CLASS_NAME body0=aBlockId/>
		 */
		public <@CDEF.GETTER_RET_TYPE body=aBlockId/> up${aBlockId_index}() {
			return up${aBlockId_index};
		}

	<#else>
		//
		// up${aBlockId_index}() は自動生成されません。
		//     up${aBlockId_index} のアクセサはsuperOperationのメソッドを使用します。
		//
	</#if>
</#list>

<#list TEL_DOWN_BS as aBlockId>
	<#if S("SPEC_ID")==S("TELEGRAM_DOWN_${aBlockId_index}_L_BLOCK_SPEC_ID")>
<#assign telItemList = telItems("DOWN",aBlockId_index)?word_list>
		/**
		 * 下り電文の第${aBlockId_index}ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第${aBlockId_index}ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
<#list A(aBlockId + "_ITEM_IDS_SCS") as anItemId>
<#if telItemList?seq_contains(anItemId)>
	<#if B("TELEGRAM_DOWN_${aBlockId_index}_${anItemId}_IS_REQUIRED")>
		 * 	<tr bgcolor="#ffccff"><td>*</td><#rt>
	<#else>
		 * 	<tr><td><br></td><#rt>
	</#if><#lt><td>${anItemId}</td></tr>
</#if>
</#list>
		 * </table>
		 *
		 * @see <@CDEF.CONT_CLASS_NAME body0=aBlockId/>
		 */
		public <@CDEF.UD_GETTER_RET_TYPE body=aBlockId ud="DOWN"/> down${aBlockId_index}() {
			return down${aBlockId_index};
		}

	<#else>
		//
		// down${aBlockId_index}() は自動生成されません。
		//     down${aBlockId_index} のアクセサはsuperOperationのメソッドを使用します。
		//
	</#if>
</#list>

<#list A("SHORTAGE_L_BLOCK_IDS_FOR_TEL_AND_SUBOPE") as aBlockId>
	<#if !B("${aBlockId}_IS_EI")>
		/**
		 * [${aBlockId}]ブロックのコンテナa${aBlockId}${S("${aBlockId}_CODE_S")}を返します。
		 *
		 * @return ${aBlockId}${S("${aBlockId}_CODE_S")}
		 */
		public <@CDEF.GETTER_RET_TYPE body=aBlockId/> ${aBlockId}() {
			return a${aBlockId};
		}

	</#if>
</#list>

		@Override
		public MCOperationInfo getOperationInfo(){
			return ((${S("CLASS")})${S("CLASS")}_${S("CLASS_SUFFIX")}_A.this).info;
		}

<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#if S("${aGrpId}_UP_SRC_BLOCK_IDS_SIZE")!="0">
		//-----------------------${aGrpId}専用up関連メソッド--------------------------
		/**
		 * オペレーショングループ${aGrpId}の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_${aGrpId}(<#rt>
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
<@UP_DEF grp=aGrpId ope=sOpeId inx=bId/> dest${sOpeId_index}_${bId_index}, <#rt>
		</#list>
</#list>
<@RIGHTTRIM trim_chars=",">
<#list A("${aGrpId}_UP_SRC_BLOCK_IDS_SCS") as aBlockId>
<@CDEF.CONT_DEF body=aBlockId/> src_${aBlockId}, </#list></@RIGHTTRIM>){
<#if B("EI")&&B("${aGrpId}_IS_OVERRIDE")>
			super.up_${aGrpId}(<#rt>
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#assign UPBLKS=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS")>
		<#if B("${aGrpId}_${sOpeId}_IS_OVERRIDE")>
			<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
				<#if !UPBLKS?seq_contains(bId)||B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>
dest${sOpeId_index}_${bId_index}, <#rt>
				</#if>
			</#list>
		</#if>
	</#list>
	<#assign UPSRCBLKS=A("${aGrpId}_UP_SRC_BLOCK_IDS")>
	<@RIGHTTRIM trim_chars=",">
	<#list A("${aGrpId}_UP_SRC_BLOCK_IDS_SCS") as aBlockId>
		<#if !UPSRCBLKS?seq_contains(aBlockId)||B("${aGrpId}_${aBlockId}_UP_SRC_BLOCK_IS_OVERRIDE")>
src_${aBlockId}, </#if></#list></@RIGHTTRIM>);
</#if>
<#-- <#list A("${aGrpId}_SUBOPE_IDS") as sOpeId> -->
<#-- 	<#assign UPBLKS=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS")> -->
<#-- 	<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId> -->
<#-- 		<#if !B("EI")||(UPBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE"))> -->
<#-- 			<#if S("${aGrpId}_${sOpeId}_${bId}_UP_DEST_CODE_S")="R"> -->
<#-- 			createMap_up_${aGrpId}_${sOpeId}_${bId_index}().copy(dest${sOpeId_index}_${bId_index}, src_${S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")}); -->
<#-- 			<#else> -->
<#-- 			new MCListMapper(createMap_up_${aGrpId}_${sOpeId}_${bId_index}()).addAll(dest${sOpeId_index}_${bId_index}, src_${S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")});	 -->		
<#-- 			</#if> -->
<#-- 		</#if> -->
<#-- 	</#list> -->
<#-- </#list> -->
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
	<#assign UPBLKS=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS")>
	<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
		<#if !B("EI")||(UPBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE"))>
			up_${aGrpId}_${sOpeId}_${bId_index}(dest${sOpeId_index}_${bId_index}, src_${S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")});
		</#if>
	</#list>
</#list>
		}
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
	<#assign UPBLKS=A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS")>
	<#if B("${aGrpId}_${sOpeId}_HAS_UP_SRC_BLOCK")>
		<#list A("${aGrpId}_${sOpeId}_UP_BLOCK_IDS_SCS") as bId>
		
			<#if UPBLKS?seq_contains(bId)>
		/**
		 * 連携処理${aGrpId}_${sOpeId}の上りブロック${bId_index}のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_${aGrpId}_${sOpeId}_${bId_index}() {
			<#if !B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>
			MCRowMapper map = new Map_up_${aGrpId}_${sOpeId}_${bId_index}();
			<#else>
			MCRowMapper map = super.createMap_up_${aGrpId}_${sOpeId}_${bId_index}();
				<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_UP_ITEM_IDS") as dItemId>
			map.addColumnPathMap("${S("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_UP_ITEM_CODE")}", "${dItemId}");
				</#list>
			</#if>
			return map;
		}
			<#if !B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の上りブロック${bId_index}のためのRowMapperクラス。<p>
		 */
		public class Map_up_${aGrpId}_${sOpeId}_${bId_index} extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
			<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_UP_ITEM_IDS") as dItemId>
				addColumnPathMap("${S("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_UP_ITEM_CODE")}", "${dItemId}");
			</#list>
			}
		}
			</#if>
<#if S("${aGrpId}_${sOpeId}_${bId}_UP_DEST_CODE_S")="R">
	<#if !B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の上りブロック${bId_index}のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_${aGrpId}_${sOpeId}_${bId_index}(<@UP_DEF grp=aGrpId ope=sOpeId inx=bId/> dest, <@CDEF.CONT_DEF body=S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")/> src) {
			createMap_up_${aGrpId}_${sOpeId}_${bId_index}().copy(dest, src);
		}
	</#if>
<#else>
	<#if !B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の上りブロック${bId_index}のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_${aGrpId}_${sOpeId}_${bId_index}(<@UP_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/> r_dest, <@CDEF.CONT_ROW_DEF body=S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")/> r_src) {
		}
	</#if>
	<#if !B("EI")||!B("${aGrpId}_${sOpeId}_${bId}_UP_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の上りブロック${bId_index}のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_${aGrpId}_${sOpeId}_${bId_index}(<@UP_DEF grp=aGrpId ope=sOpeId inx=bId/> dest, <@CDEF.CONT_DEF body=S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")/> src) {
			MCRowMapper _rm = createMap_up_${aGrpId}_${sOpeId}_${bId_index}();
			for(<@CDEF.CONT_ROW_DEF body=S("${aGrpId}_${sOpeId}_${bId}_UP_SRC_BLOCK_ID")/> r_src : src){
				<@UP_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/> r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_${aGrpId}_${sOpeId}_${bId_index}(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	</#if>
</#if>
			</#if>
		</#list>
	</#if>
</#list>
</#if>
</#list>

<#list A("SUBOPE_GROUP_IDS") as aGrpId>
<#if S("${aGrpId}_DOWN_DEST_BLOCK_IDS_SIZE")!="0">
		//-----------------------${aGrpId}専用down関連メソッド--------------------------
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
	<#if sOpeId_index!=0>
		<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS") as bId>
			<#if !B("EI")||!B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のJoinKey<p>
		 */
		protected MCJoinKey<<@DOWN_DEF grp=aGrpId ope=sOpeId inx=bId/>> ${aGrpId}_${sOpeId}_${bId_index}_jk;
			</#if>
		</#list>
	</#if>
</#list>

		/**
		 * オペレーショングループ${aGrpId}の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_${aGrpId}(<#rt>
<#list A("${aGrpId}_DOWN_DEST_BLOCK_IDS_SCS") as aBlockId>
<#--<@CDEF.CONT_DEF body=aBlockId/> a<@CDEF.CONT_CLASS_NAME body0=aBlockId/>, <#rt>-->
<@CDEF.CONT_DEF body=aBlockId/> dest_${aBlockId}, <#rt>
</#list>
<@RIGHTTRIM trim_chars=",">
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
<@DOWN_DEF grp=aGrpId ope=sOpeId inx=bId/> src${sOpeId_index}_${bId_index}, <#rt>
		</#list>
</#list></@RIGHTTRIM>){
<#if B("EI")&&B("${aGrpId}_IS_OVERRIDE")>
			super.down_${aGrpId}(<#rt>
	<#assign DOWNDESTBLKS=A("${aGrpId}_DOWN_DEST_BLOCK_IDS")>
	<#list A("${aGrpId}_DOWN_DEST_BLOCK_IDS_SCS") as aBlockId>
		<#if !DOWNDESTBLKS?seq_contains(aBlockId)||B("${aGrpId}_${aBlockId}_DOWN_DEST_BLOCK_IS_OVERRIDE")>
dest_${aBlockId}, </#if><#rt>
	</#list>
	<@RIGHTTRIM trim_chars=",">
	<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
		<#assign DOWNBLKS=A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS")>
		<#if B("${aGrpId}_${sOpeId}_IS_OVERRIDE")>
			<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
				<#if !DOWNBLKS?seq_contains(bId)||B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
src${sOpeId_index}_${bId_index}, <#rt>
				</#if>
			</#list>
		</#if>
</#list></@RIGHTTRIM>);
</#if>
<#-- <#list A("${aGrpId}_SUBOPE_IDS") as sOpeId> -->
<#-- 	<#assign DOWNBLKS=A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS")> -->
<#-- 	<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId> -->
<#-- 		<#if !B("EI")||(DOWNBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE"))> -->
<#-- 			<#if sOpeId_index=0> -->
<#-- 				<#if S("${aGrpId}_${sOpeId}_${bId}_DOWN_SRC_CODE_S")="R"> -->
<#-- 			createMap_down_${aGrpId}_${sOpeId}_${bId_index}().copy(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")}, src${sOpeId_index}_${bId_index}); -->
<#-- 				<#else> -->
<#-- 			new MCListMapper(createMap_down_${aGrpId}_${sOpeId}_${bId_index}()).addAll(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")}, src${sOpeId_index}_${bId_index});	 -->		
<#-- 				</#if> -->
<#-- 			<#else> -->
<#-- 			join_${aGrpId}_${sOpeId}_${bId_index}(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")}, src${sOpeId_index}_${bId_index}); -->
<#-- 			new MCListMapper(createMap_down_${aGrpId}_${sOpeId}_${bId_index}()).join(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")}, ${aGrpId}_${sOpeId}_${bId_index}_jk);	 -->		
<#-- 			</#if> -->
<#-- 		</#if> -->
<#-- 	</#list> -->
<#-- </#list> -->
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
	<#assign DOWNBLKS=A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS")>
	<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
		<#if !B("EI")||(DOWNBLKS?seq_contains(bId)&&!B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE"))>
		<#if sOpeId_index=0>
			down_${aGrpId}_${sOpeId}_${bId_index}(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")}, src${sOpeId_index}_${bId_index});
			<#else>
			join_${aGrpId}_${sOpeId}_${bId_index}(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")}, src${sOpeId_index}_${bId_index});
			down_${aGrpId}_${sOpeId}_${bId_index}(dest_${S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")});
			</#if>
		</#if>
	</#list>
</#list>
		}
<#list A("${aGrpId}_SUBOPE_IDS") as sOpeId>
<#assign DOWNBLKS=A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS")>
<#if sOpeId_index=0>
<#if B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")>
<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS_SCS") as bId>
<#if DOWNBLKS?seq_contains(bId)>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_${aGrpId}_${sOpeId}_${bId_index}() {
			<#if !B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
			MCRowMapper map = new Map_down_${aGrpId}_${sOpeId}_${bId_index}();
			<#else>
			MCRowMapper map = super.createMap_down_${aGrpId}_${sOpeId}_${bId_index}();
				<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_ITEM_IDS") as dItemId>
			map.addColumnPathMap("${dItemId}", "${S("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_DOWN_ITEM_CODE")}");
				</#list>
			</#if>
			return map;
		}
			<#if !B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のためのRowMapperクラス。<p>
		 */
		public class Map_down_${aGrpId}_${sOpeId}_${bId_index} extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
			<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_ITEM_IDS") as dItemId>
				addColumnPathMap("${dItemId}", "${S("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_DOWN_ITEM_CODE")}");
			</#list>
			}
		}
			</#if>
<#if S(S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID") + "_CODE_S")=="R">
	<#if !B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_${aGrpId}_${sOpeId}_${bId_index}(${S(S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID") + "_FACT_ID")}R r_dest, <@DOWN_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/> r_src) {
			createMap_down_${aGrpId}_${sOpeId}_${bId_index}().copy(r_dest, r_src);
		}
	</#if>
<#else>
	<#if !B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_${aGrpId}_${sOpeId}_${bId_index}(${S(S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID") + "_FACT_ID")}R r_dest, <@DOWN_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/> r_src) {
		}
	</#if>
	<#if !B("EI")||!B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_${aGrpId}_${sOpeId}_${bId_index}(<@CDEF.CONT_DEF body=S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")/> dest, <@DOWN_DEF grp=aGrpId ope=sOpeId inx=bId/> src) {
			MCRowMapper _rm = createMap_down_${aGrpId}_${sOpeId}_${bId_index}();
			for(<@DOWN_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/> r_src : src){
				${S(S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID") + "_FACT_ID")}R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_${aGrpId}_${sOpeId}_${bId_index}(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	</#if>
</#if>
</#if>
</#list>
</#if><#else><#-- sOpeId_index が 1 以上の場合 -->
<#if B("${aGrpId}_${sOpeId}_HAS_DOWN_DEST_BLOCK")>
<#list A("${aGrpId}_${sOpeId}_DOWN_BLOCK_IDS") as bId>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のJoinKeyを作成する。<p>
		 */
		protected void join_${aGrpId}_${sOpeId}_${bId_index}(<@CDEF.CONT_DEF body=S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")/> dest, <@DOWN_DEF grp=aGrpId ope=sOpeId inx=bId/> src){
			String[] dest_cols ={
	<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_JK_IDS") as jkId>
				"${S("${aGrpId}_${sOpeId}_${bId}_${jkId}_SUBOPE_DOWN_ITEM_STICK_ID")}"<#if jkId_has_next>, </#if>
	</#list>
				};
			String[] src_cols = {
	<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_JK_IDS") as jkId>
				"${S("${aGrpId}_${sOpeId}_${bId}_${jkId}_SUBOPE_DOWN_ITEM_CODE")}"<#if jkId_has_next>, </#if>
	</#list>
				};
			${aGrpId}_${sOpeId}_${bId_index}_jk = dest.join(dest_cols, src, src_cols);
		}

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_${aGrpId}_${sOpeId}_${bId_index}() {
			<#if !B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
			MCRowMapper map = new Map_down_${aGrpId}_${sOpeId}_${bId_index}();
			<#else>
			MCRowMapper map = super.createMap_down_${aGrpId}_${sOpeId}_${bId_index}();
				<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_ITEM_IDS") as dItemId>
					<#if !B("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_DOWN_ITEM_JK")>
			map.addColumnPathMap("${dItemId}", "${S("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_DOWN_ITEM_CODE")}");
					</#if>
				</#list>
			</#if>
			return map;
		}
			<#if !B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のためのRowMapperクラス。<p>
		 */
		public class Map_down_${aGrpId}_${sOpeId}_${bId_index} extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
			<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_ITEM_IDS") as dItemId>
				<#if !B("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_DOWN_ITEM_JK")>
				addColumnPathMap("${dItemId}", "${S("${aGrpId}_${sOpeId}_${bId}_${dItemId}_SUBOPE_DOWN_ITEM_CODE")}");
				</#if>
			</#list>
			}
		}
			</#if>

		/**
		 * 連携処理${aGrpId}_${sOpeId}の下りブロック${bId_index}のJoin処理を行う。<p>
		 *
		 * @param dest コピー先のList
		 */
		protected void down_${aGrpId}_${sOpeId}_${bId_index}(<@CDEF.CONT_DEF body=S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_ID")/> dest){
	<#if B("${aGrpId}_${sOpeId}_${bId}_DOWN_BLOCK_IS_OVERRIDE")>
			super.down_${aGrpId}_${sOpeId}_${bId_index}(dest);
	</#if>
			if(${aGrpId}_${sOpeId}_${bId_index}_jk == null) return;
			for(${S(S("${aGrpId}_${sOpeId}_${bId}_DOWN_DEST_BLOCK_FACT_ID") + "_FACT_ID")}R r_dest : dest){
				<@DOWN_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/> jRow = (<@DOWN_ROW_DEF grp=aGrpId ope=sOpeId inx=bId/>)r_dest.getJoinedRow(${aGrpId}_${sOpeId}_${bId_index}_jk);
				if(jRow == null) continue;
<#list A("${aGrpId}_${sOpeId}_${bId}_SUBOPE_DOWN_ITEM_IDS") as anItemId>
	<#if !B("${aGrpId}_${sOpeId}_${bId}_${anItemId}_SUBOPE_DOWN_ITEM_JK")>
				r_dest.${S("${aGrpId}_${sOpeId}_${bId}_${anItemId}_SUBOPE_DOWN_ITEM_STICK_ACCESSOR")}(jRow.${S("${aGrpId}_${sOpeId}_${bId}_${anItemId}_SUBOPE_DOWN_ITEM_ACCESSOR")}());
	</#if>
</#list>
			}
		}
</#list></#if></#if>
</#list>
</#if>
</#list>
	}

<#macro DBC_DEF t code_s>
<@_DBC_DEF t code_s ">" "<"/></#macro>

<#macro _DBC_DEF t code_s gth lth>
<#if code_s="L">MCList${lth}${t}_R${gth}<#else>${t}_${code_s}</#if></#macro>

<#macro ZERO_ONE code_s>
<#if code_s="R">0<#else>1</#if></#macro>

<#macro REL_CLASS grp ope>
<@_REL_CLASS grp ope ">" "<"/>
</#macro>

<#macro REL_CLASS_HTML grp ope>
<@_REL_CLASS grp ope "&gt;" "&lt;"/>
</#macro>

<#macro _REL_CLASS grp ope gth lth>
<#if S("${grp}_${ope}_TARGET_TYPE")="DBC">MCDBSubOperation${lth}${S("${grp}_${ope}_TARGET_ID")}_R${gth}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="OPE">${S("${grp}_${ope}_TARGET_PACKAGE_CLASS")}.${S("${grp}_${ope}_TARGET_METHOD")}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="OPI">${S("${grp}_${ope}_TARGET_INTERFACE_CLASS")}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="SQL">MCSQLController</#if><#t>
</#macro>

<#macro _UP_DEF grp ope inx gth lth>
<#if S("${grp}_${ope}_TARGET_TYPE")="DBC"><@_DBC_DEF S("${grp}_${ope}_TARGET_ID") S("${grp}_${ope}_UP_DEST_CODE_S") gth lth/></#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="OPE"||S("${grp}_${ope}_TARGET_TYPE")="OPI">${S("${grp}_${ope}_${inx}_UP_DEST_CLASS_DEF")?replace(">", gth)?replace("<", lth)}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="SQL"><@CDEF._CONT_DEF S("${grp}_${ope}_UP_SRC_BLOCK_FACT_ID") gth lth/></#if><#t>
</#macro>

<#macro UP_DEF grp ope inx>
<@_UP_DEF grp ope inx ">" "<"/>
</#macro>

<#macro UP_DEF_HTML grp ope inx>
<@_UP_DEF grp ope inx "&gt;" "&lt;"/>
</#macro>

<#macro UP_ROW_DEF grp ope inx>
<#if S("${grp}_${ope}_TARGET_TYPE")="DBC"><@DBC_DEF t=S("${grp}_${ope}_TARGET_ID") code_s="R"/></#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="OPE"||S("${grp}_${ope}_TARGET_TYPE")="OPI">${S("${grp}_${ope}_${inx}_UP_DEST_ROW_DEF")}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="SQL"><@CDEF.CONT_ROW_DEF body=S("${grp}_${ope}_UP_SRC_BLOCK_FACT_ID")/></#if><#t>
</#macro>

<#macro _DOWN_DEF grp ope inx gth lth>
<#if S("${grp}_${ope}_TARGET_TYPE")="DBC"><@_DBC_DEF S("${grp}_${ope}_TARGET_ID") S("${grp}_${ope}_DOWN_SRC_CODE_S") gth lth/></#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="OPE"||S("${grp}_${ope}_TARGET_TYPE")="OPI">${S("${grp}_${ope}_${inx}_DOWN_SRC_CLASS_DEF")?replace(">", gth)?replace("<", lth)}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="SQL"><@CDEF._CONT_DEF S("${grp}_${ope}_DOWN_DEST_BLOCK_FACT_ID") gth lth/></#if><#t>
</#macro>

<#macro DOWN_DEF grp ope inx>
<@_DOWN_DEF grp ope inx ">" "<"/>
</#macro>

<#macro DOWN_DEF_HTML grp ope inx>
<@_DOWN_DEF grp ope inx "&gt;" "&lt;"/>
</#macro>

<#macro DOWN_ROW_DEF grp ope inx>
<#if S("${grp}_${ope}_TARGET_TYPE")="DBC"><@DBC_DEF t=S("${grp}_${ope}_TARGET_ID") code_s="R"/></#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="OPE"||S("${grp}_${ope}_TARGET_TYPE")="OPI">${S("${grp}_${ope}_${inx}_DOWN_SRC_ROW_DEF")}</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")="SQL"><@CDEF.CONT_ROW_DEF body=S("${grp}_${ope}_DOWN_DEST_BLOCK_FACT_ID")/></#if><#t>
</#macro>

<#macro REL_LABEL grp ope>
<#if S("${grp}_${ope}_TARGET_TYPE")=="DBC">DBC連携</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")=="OPE"||S("${grp}_${ope}_TARGET_TYPE")=="OPI">連携オペレーション</#if><#t>
<#if S("${grp}_${ope}_TARGET_TYPE")=="SQL">SQL連携</#if><#t>
</#macro>

<#function telItems UD bId>
<#assign tList="">
<#list A("TELEGRAM_${UD}_${bId}_ITEM_IDS_SCS") as anItemId>
<#assign tList = tList + " " + anItemId>
</#list>
<#return tList>
</#function>
