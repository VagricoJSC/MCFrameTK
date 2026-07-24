	/**
	 * 
	 * 自身のMCDMLAgentをインスタンス化します。
	 *
	 * @return MCDMLAgent 自身のMCDMLAgent
	 */
	protected MCDMLAgent createDMLAgent(){
		return new ${S("BLOCK_ID")}_DML("${S("BLOCK_ID")}_L", ${S("BLOCK_ID")}_R.columnAliasArray());
	}

	/**
	 * 
	 * 現在のDMLAgentの複製を返します。
	 *
	 * 
	 * @return MCDMLAgent 複製された自身のMCDMLAgent
	 */
	public ${S("BLOCK_ID")}_DML cloneDMLAgent() {
		return (${S("BLOCK_ID")}_DML)getDMLAgent().clone();
	}

	/**
	 * 
	 * 現在のDMLAgentを置き変えます。<P>
	 *
	 * @param agent 置き換えるDMLAgent
	 */
	public void setDMLAgent(${S("BLOCK_ID")}_DML agent) {
		super.setDMLAgent(agent);
	}

	/**
	 * 表ロックを行います。 
	 * ロックのモードは、 MCLockTableModeで指定します。<BR>
	 * 
	 * @param mode モード
	 * @param nowait NOWAITで実行する場合は、true
	 */
	public static void execLockTable(MCLockTableMode mode, boolean nowait) {
		MCDBList._execLockTable(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, mode, nowait);
	}

	/**
	 * DB上のレコード件数を取得します。<P>
	 * 
	 * {@link #dbSelect()}と同じ検索条件で、SELECT COUNT(*) FROM ～を
	 * 実行し、件数を返します。<BR>
	 * 
	 * @return int 件数
	 */
	public static int execDbCount() {
		return MCDBList._dbCount(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class);
	}

	/**
	 * DB上のレコード件数を検索条件を指定し、取得します。<P>
	 * 
	 * {@link #dbSelect(String, MCRow)}に検索条件を指定し、SELECT COUNT(*) FROM ～を
	 * 実行し、件数を返します。<BR>
	 * WHERE句のバインド変数に対する値は、引数のRowを使用します。
	 * 
	 * @param where WHERE句の文字列
	 * @param r バインド変数の値のRow
	 * @return int 件数
	 */
	public static int execDbCount(String where, MCRow r) {
		return MCDBList._dbCount(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, where, r);
	}

	/**
	 * DB上のレコード件数を検索条件を指定し、取得します。<P>
	 * 
	 * {@link #dbSelect()}に検索条件を指定し、SELECT COUNT(*) FROM ～を
	 * 実行し、件数を返します。<BR>
	 * WHERE句のバインド変数は「:n」のみ(nは数字) 記述してください。<BR>
	 * バインド値は配列で指定し、「:n」のインデックスは「1」から
	 * 開始してください。<BR>
	 * 「:n」のインデックスの指定より、バインド値の配列が少ない場合は
	 * MCException[FCBCC0111]が発生します。<BR>
	 * 
	 * @param where WHERE句の文字列
	 * @param values バインド値の配列
	 * @return int 件数
	 * @throws MCException 
	 * 			[FCBCC0111] インデックスの指定より、バインド値の配列が少ない場合
	 */
	public static int execDbCount(String where, Comparable<?>... values) {
		return MCDBList._dbCount(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, where, values);
	}

	/**
	 * 検索条件を指定し、DB上のレコードを削除します。<P>
	 *
	 * 引数のListを使用し、バッチ更新によるDELETE実行を行います。<BR>
	 * WHERE句のバインド変数は、Rowの項目名を記述してください。<BR>
	 * 
	 * @param where WHERE句の文字列
	 * @param ls バインド値のList
	 */
	public static void execDbDelete(String where, MCList<? extends MCRow> ls) {
		MCDBList._dbDelete(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, where, ls);
	}

	/**
	 * SET句、WHERE句を指定し、DB上のレコードを更新します。<P>
	 *
	 * 引数のListを使用し、バッチ更新によるUPDATE実行を行います。<BR>
	 * SET句は、Rowの項目名を指定してください。<BR><BR>
	 * WHERE句のバインド変数は、Rowの項目名を記述してください。<BR>
	 * また、バインド変数の先頭には「:@」を記述するようにしてください。<BR>
	 * ex)<BR>
	 *  execDbUpdate(ls, "ITEM_CD = :@ITEM_CD AND DEPT_CD = :@DEPT_CD", "ITEM_NAME");<BR>
	 *
	 * @param ls バインド値のList
	 * @param where WHERE句の文字列
	 * @param set SET句の項目名の配列
	 */
	public static void execDbUpdate(MCList<? extends MCRow> ls, String where, String... set) {
		MCDBList._dbUpdate(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, ls, where, set);
	}

	/**
	 * SET句、WHERE句を指定し、DB上のレコードを更新します。<P>
	 *
	 * 引数のListを使用し、UPDATE実行を行います。<BR>
	 * SET句は「項目名 = :バインド変数」の形式で指定してください。<BR>
	 * WHERE句のバインド変数は、Rowの項目名を記述してください。<BR>
	 * また、SET句、WHERE句のバインド変数の先頭には「:@」を記述するようにしてください。<BR>
	 * ex)<BR>
	 *  execDbUpdateClause(ls, "ITEM_CD = :@ITEM_CD AND DEPT_CD = :@DEPT_CD", "ITEM_NAME = :@ITEM_NAME");<BR>
	 *
	 * @param ls バインド値のList
	 * @param where WHERE句の文字列
	 * @param set SET句の配列
	 */
	public static void execDbUpdateClause(MCList<? extends MCRow> ls, String where, String... set) {
		MCDBList._dbUpdateClause(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, ls, where, set);
	}

<#if A(S("BLOCK_ID") + "_KEY_ITEM_IDS2")?size!=0>
	/**
	 * 
	 * SELECTをキー項目の検索条件で実行し、自身に実行結果を格納します。
	 * <P>
	 * 実行時には、自身に格納されていたRowは、全て破棄されます。
	 * <BR>
	 */
	public int dbSelectKey(<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS2") as anItemId><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="R">${S(S("BLOCK_ID") + "_" + anItemId + "_ROW_CLASS")}<#else>${S(S("BLOCK_ID") + "_" + anItemId + "_CLASS")}</#if> a${anItemId}<#if anItemId_has_next>, </#if></#list> ){
		${S("BLOCK_ID")}_R aRow = ${S("BLOCK_ID")}_R.create();
<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
		aRow.${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}(a${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}.${S(S("BLOCK_ID") + "_" + anItemId + "_TER_ACCESSOR")}());
<#else>
		aRow.${anItemId}(a${anItemId});
</#if>
</#list>
		return dbSelectKey(aRow);
	}

	/**
	 * 
	 * SELECT FOR UPDATE をキー項目の検索条件で実行し、自身に実行結果を格納します。
	 * <P>
	 * 実行時には、自身に格納されていたRowは、全て破棄されます。
	 * <BR>
	 */
	public int dbSelectKeyForUpdate(<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS2") as anItemId><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="R">${S(S("BLOCK_ID") + "_" + anItemId + "_ROW_CLASS")}<#else>${S(S("BLOCK_ID") + "_" + anItemId + "_CLASS")}</#if> a${anItemId}<#if anItemId_has_next>, </#if></#list> ){
		${S("BLOCK_ID")}_R aRow = ${S("BLOCK_ID")}_R.create();
<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
		aRow.${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}(a${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}.${S(S("BLOCK_ID") + "_" + anItemId + "_TER_ACCESSOR")}());
<#else>
		aRow.${anItemId}(a${anItemId});
</#if>
</#list>
		return dbSelectKeyForUpdate(aRow);
	}

	/**
	 * 
	 * SELECT FOR UPDATE NO WAIT をキー項目の検索条件で実行し、自身に実行結果を格納します。
	 * <P>
	 * 実行時には、自身に格納されていたRowは、全て破棄されます。
	 * <BR>
	 */
	public int dbSelectKeyForUpdateNoWait(<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS2") as anItemId><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="R">${S(S("BLOCK_ID") + "_" + anItemId + "_ROW_CLASS")}<#else>${S(S("BLOCK_ID") + "_" + anItemId + "_CLASS")}</#if> a${anItemId}<#if anItemId_has_next>, </#if></#list> ){
		${S("BLOCK_ID")}_R aRow = ${S("BLOCK_ID")}_R.create();
<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
		aRow.${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}(a${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}.${S(S("BLOCK_ID") + "_" + anItemId + "_TER_ACCESSOR")}());
<#else>
		aRow.${anItemId}(a${anItemId});
</#if>
</#list>
		return dbSelectKeyForUpdateNoWait(aRow);
	}

	/**
	 * DB上のレコード件数をキー項目の検索条件で取得します。<P>
	 * 
	 * {@link #dbSelectKey(MCRow)}と同じ検索条件で、SELECT COUNT(*) FROM ～を
	 * 実行し、件数を返します。<BR>
	 * 
	 * @param r バインド変数の値のRow
	 * @return int 件数
	 */
	public static int execDbCountKey(MCRow r) {
		return MCDBList._dbCountKey(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, r);
	}

	/**
	 * DB上のレコード件数をキー項目の検索条件で取得します。<P>
	 * 
	 * {@link #dbSelectKey(MCList)}と同じ検索条件で、SELECT COUNT(*) FROM ～を
	 * 実行し、件数を返します。<BR>
	 * 
	 * @param ls バインド変数の値のList
	 * @return int 件数
	 */
	public static int execDbCountKey(MCList<? extends MCRow> ls) {
		return MCDBList._dbCountKey(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, ls);
	}

	/**
	 * DB上のレコード件数をキー項目の検索条件で取得します。<P>
	 * 
	 * {@link #dbSelectKey(<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS2") as anItemId><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="R">${S(S("BLOCK_ID") + "_" + anItemId + "_ROW_CLASS")}<#else>${S(S("BLOCK_ID") + "_" + anItemId + "_CLASS")}</#if><#if anItemId_has_next>, </#if></#list> )}と同じ検索条件で、SELECT COUNT(*) FROM ～を
	 * 実行し、件数を返します。<BR>
	 * 
	 * @return int 件数
	 */
	public static int execDbCountKey(<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS2") as anItemId><#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="R">${S(S("BLOCK_ID") + "_" + anItemId + "_ROW_CLASS")}<#else>${S(S("BLOCK_ID") + "_" + anItemId + "_CLASS")}</#if> a${anItemId}<#if anItemId_has_next>, </#if></#list> ){
		${S("BLOCK_ID")}_R aRow = ${S("BLOCK_ID")}_R.create();
<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
		aRow.${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}(a${S(S("BLOCK_ID") + "_" + anItemId + "_DEPEND_ITEM_ID")}.${S(S("BLOCK_ID") + "_" + anItemId + "_TER_ACCESSOR")}());
<#else>
		aRow.${anItemId}(a${anItemId});
</#if>
</#list>
		return ${S("BLOCK_ID")}_L.execDbCountKey(aRow);
	}

	/**
	 * SET句を指定し、DB上のレコードを更新します。<P>
	 *
	 * 引数のListを使用し、バッチ更新によるUPDATE実行を行います。<BR>
	 * SET句は、Rowの項目名を指定してください。<BR><BR>
	 * WHERE句は、定義されているキー項目が条件になります。<BR>
	 *
	 * @param ls バインド値のList
	 * @param set SET句の項目名の配列
	 */
	public static void execDbUpdateKey(MCList<? extends MCRow> ls, String... set) {
		MCDBList._dbUpdateKey(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, ls, set);
	}

	/**
	 * SET句を指定し、DB上のレコードを更新します。<P>
	 *
	 * 引数のListを使用し、UPDATE実行を行います。<BR>
	 * SET句は「項目名 = :バインド変数」の形式で指定してください。<BR>
	 * バインド変数の先頭には「:@」を記述するようにしてください。<BR>
	 * WHERE句は、定義されているキー項目が条件になります。<BR>
	 *
	 * @param ls バインド値のList
	 * @param set SET句の配列
	 */
	public static void execDbUpdateKeyClause(MCList<? extends MCRow> ls, String... set) {
		MCDBList._dbUpdateKeyClause(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, ls, set);
	}	

	/**
	 * DB上のレコードを削除します。<P>
	 *
	 * 引数のListを使用し、バッチ更新によるDELETE実行を行います。<BR>
	 * WHERE句は、定義されているキー項目が条件になります。<BR>
	 *
	 * @param ls バインド値のList
	 */
	public static void execDbDeleteKey(MCList<? extends MCRow> ls) {
		MCDBList._dbDeleteKey(${S("BLOCK_ID")}_L.class, ${S("BLOCK_ID")}_R.class, ls);
	}
</#if>

