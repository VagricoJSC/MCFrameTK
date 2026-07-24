
package mcframe.serverMAUA.MAUAL0010;
import mcframe.commonCore.container.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;


//LOGIC_SETTING_IMPORT (START)
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
//LOGIC_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MAUAL_List_MC_A extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {

	/** 
	  * GpGrp:汎用分類<p>
	  * 汎用分類マスタから有効な汎用分類データを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getGpGrp(MCRow row) {
		MCList<MAM_GP_GRP_R> rslt = MCList.create(MAM_GP_GRP_R.class);
		MAM_GP_GRP_R dbc = MAM_GP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getGpGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.GpGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.GpGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getGpGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.GpGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getGpGrp_SubColumns(row, down);
	}
	/** 
	  * GpGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getGpGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_GP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, GpGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * GpGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getGpGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_GP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * GpGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getGpGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getGpGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(GpGrpCols.outAll());
	}


	/** 
	  * AcDpt:会計部門<p>
	  * 会計部門マスタから部門情報を取得する<br>
・適用日で絞り込む場合は、以下を指定をする<br>
　　適用日を指定する場合：dtに適用日を指定する<br>
　　運用日付を使用する場合：dtを未指定にし、mode_today_flgに「true」を指定する<br>
・適用日で絞り込まない場合は、ignore_dt_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcDpt(MCRow row) {
		MCList<MAM_AC_DPT_R> rslt = MCList.create(MAM_AC_DPT_R.class);
		MAM_AC_DPT_R dbc = MAM_AC_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcDpt_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcDpt");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcDpt").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcDpt_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcDpt");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcDpt_SubColumns(row, down);
	}
	/** 
	  * AcDpt:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcDpt_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcDptCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcDpt:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcDpt_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcDpt:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcDpt_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcDpt_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcDptCols.outAll());
	}


	/** 
	  * AcSubtypem:予備科目区分<p>
	  * 引数の予備科目区分に対応する科目区分情報を、予備科目区分マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSubtypem(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSubtypem_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSubtypem");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSubtypem").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSubtypem_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSubtypem");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSubtypem_SubColumns(row, down);
	}
	/** 
	  * AcSubtypem:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSubtypem_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSubtypemCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSubtypem:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSubtypem_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSubtypem:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSubtypem_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSubtypem_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSubtypemCols.outAll());
	}


	/** 
	  * AcTax:会計税<p>
	  * 会計税マスタから、税（会計システムで使用する税）情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcTax(MCRow row) {
		MCList<MAM_AC_TAX_R> rslt = MCList.create(MAM_AC_TAX_R.class);
		MAM_AC_TAX_R dbc = MAM_AC_TAX_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcTax_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcTax");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcTax").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcTax_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcTax");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcTax_SubColumns(row, down);
	}
	/** 
	  * AcTax:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_TAX_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcTaxCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcTax:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcTax_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_TAX_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcTax:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcTax_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcTax_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcTaxCols.outAll());
	}


	/** 
	  * SubAccount:補助勘定科目<p>
	  * 引数の勘定科目に対応する補助勘定科目情報を、補助勘定科目マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSubAccount(MCRow row) {
		MCList<MAM_SUB_ACCOUNT_R> rslt = MCList.create(MAM_SUB_ACCOUNT_R.class);
		MAM_SUB_ACCOUNT_R dbc = MAM_SUB_ACCOUNT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSubAccount_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SubAccount");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SubAccount").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSubAccount_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SubAccount");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSubAccount_SubColumns(row, down);
	}
	/** 
	  * SubAccount:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSubAccount_Set(MCRow row, MCQueryApiBuilder builder, MAM_SUB_ACCOUNT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SubAccountCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SubAccount:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSubAccount_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SUB_ACCOUNT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SubAccount:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSubAccount_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSubAccount_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SubAccountCols.outAll());
	}


	/** 
	  * AutoJnlKey:自動仕訳キー<p>
	  * 会計伝票区分に対して自動仕訳情報を判断するためのキーを、自動仕訳キーマスタから取得する<br>
自動仕訳マスタを参照する場合に使用する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAutoJnlKey(MCRow row) {
		MCList<MAM_AUTO_JNL_KEY_R> rslt = MCList.create(MAM_AUTO_JNL_KEY_R.class);
		MAM_AUTO_JNL_KEY_R dbc = MAM_AUTO_JNL_KEY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAutoJnlKey_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AutoJnlKey");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AutoJnlKey").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAutoJnlKey_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AutoJnlKey");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAutoJnlKey_SubColumns(row, down);
	}
	/** 
	  * AutoJnlKey:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAutoJnlKey_Set(MCRow row, MCQueryApiBuilder builder, MAM_AUTO_JNL_KEY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AutoJnlKeyCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AutoJnlKey:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAutoJnlKey_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AUTO_JNL_KEY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AutoJnlKey:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAutoJnlKey_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAutoJnlKey_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AutoJnlKeyCols.outAll());
	}


	/** 
	  * NoteRsn:手形理由<p>
	  * 手形理由情報を手形理由マスタから取得する<br>
手形データを会計システムへ連携する場合に、指定する勘定科目ＣＤを判断するために使用する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getNoteRsn(MCRow row) {
		MCList<MAM_NOTE_RSN_R> rslt = MCList.create(MAM_NOTE_RSN_R.class);
		MAM_NOTE_RSN_R dbc = MAM_NOTE_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getNoteRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.NoteRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.NoteRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getNoteRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.NoteRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getNoteRsn_SubColumns(row, down);
	}
	/** 
	  * NoteRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getNoteRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_NOTE_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, NoteRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * NoteRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getNoteRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_NOTE_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * NoteRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getNoteRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getNoteRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(NoteRsnCols.outAll());
	}


	/** 
	  * JnlAct:仕訳実行<p>
	  * 自動仕訳実行するグループを、仕訳実行マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getJnlAct(MCRow row) {
		MCList<MAM_JNL_ACT_R> rslt = MCList.create(MAM_JNL_ACT_R.class);
		MAM_JNL_ACT_R dbc = MAM_JNL_ACT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getJnlAct_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.JnlAct");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.JnlAct").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getJnlAct_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.JnlAct");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getJnlAct_SubColumns(row, down);
	}
	/** 
	  * JnlAct:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getJnlAct_Set(MCRow row, MCQueryApiBuilder builder, MAM_JNL_ACT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, JnlActCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * JnlAct:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getJnlAct_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_JNL_ACT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * JnlAct:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getJnlAct_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getJnlAct_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(JnlActCols.outAll());
	}


	/** 
	  * JnlGrp:仕訳グループ<p>
	  * 仕訳グループマスタから仕訳グループを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getJnlGrp(MCRow row) {
		MCList<MAM_JNL_GRP_R> rslt = MCList.create(MAM_JNL_GRP_R.class);
		MAM_JNL_GRP_R dbc = MAM_JNL_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getJnlGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.JnlGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.JnlGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getJnlGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.JnlGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getJnlGrp_SubColumns(row, down);
	}
	/** 
	  * JnlGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getJnlGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_JNL_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, JnlGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * JnlGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getJnlGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_JNL_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * JnlGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getJnlGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getJnlGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(JnlGrpCols.outAll());
	}


	/** 
	  * JnlPtnBase:自動仕訳パタン種類<p>
	  * 自動仕訳パタン基本マスタから自動仕訳パタンの種類を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getJnlPtnBase(MCRow row) {
		MCList<MAM_JNL_PTN_BASE_R> rslt = MCList.create(MAM_JNL_PTN_BASE_R.class);
		MAM_JNL_PTN_BASE_R dbc = MAM_JNL_PTN_BASE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getJnlPtnBase_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.JnlPtnBase");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.JnlPtnBase").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getJnlPtnBase_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.JnlPtnBase");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getJnlPtnBase_SubColumns(row, down);
	}
	/** 
	  * JnlPtnBase:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getJnlPtnBase_Set(MCRow row, MCQueryApiBuilder builder, MAM_JNL_PTN_BASE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, JnlPtnBaseCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * JnlPtnBase:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getJnlPtnBase_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_JNL_PTN_BASE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * JnlPtnBase:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getJnlPtnBase_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getJnlPtnBase_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(JnlPtnBaseCols.outAll());
	}


	/** 
	  * AcRsn:会計理由<p>
	  * 会計理由マスタから、自動仕訳処理で仕訳条件として使用するための会計理由情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcRsn(MCRow row) {
		MCList<MAM_AC_RSN_R> rslt = MCList.create(MAM_AC_RSN_R.class);
		MAM_AC_RSN_R dbc = MAM_AC_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcRsn_SubColumns(row, down);
	}
	/** 
	  * AcRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcRsnCols.outAll());
	}


	/** 
	  * BankAc:口座<p>
	  * 入金口座や支払口座を管理するための口座情報を、口座マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBankAc(MCRow row) {
		MCList<MAM_BANK_AC_R> rslt = MCList.create(MAM_BANK_AC_R.class);
		MAM_BANK_AC_R dbc = MAM_BANK_AC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBankAc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BankAc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BankAc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBankAc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BankAc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBankAc_SubColumns(row, down);
	}
	/** 
	  * BankAc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBankAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BankAcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BankAc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBankAc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BankAc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBankAc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBankAc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BankAcCols.outAll());
	}


	/** 
	  * ItmJnl:品目仕訳<p>
	  * 自動仕訳処理で勘定科目を決める条件として使用する仕訳情報を、品目仕訳マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmJnl(MCRow row) {
		MCList<MAM_ITM_JNL_R> rslt = MCList.create(MAM_ITM_JNL_R.class);
		MAM_ITM_JNL_R dbc = MAM_ITM_JNL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmJnl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmJnl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmJnl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmJnl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmJnl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmJnl_SubColumns(row, down);
	}
	/** 
	  * ItmJnl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmJnl_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_JNL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmJnlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmJnl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmJnl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_JNL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmJnl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmJnl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmJnl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmJnlCols.outAll());
	}


	/** 
	  * Cur:通貨<p>
	  * 通貨マスタから通貨情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCur(MCRow row) {
		MCList<MAM_CUR_R> rslt = MCList.create(MAM_CUR_R.class);
		MAM_CUR_R dbc = MAM_CUR_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCur_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Cur");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Cur").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCur_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Cur");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCur_SubColumns(row, down);
	}
	/** 
	  * Cur:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCur_Set(MCRow row, MCQueryApiBuilder builder, MAM_CUR_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CurCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Cur:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCur_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CUR_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Cur:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCur_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCur_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CurCols.outAll());
	}


	/** 
	  * AllocGrp:総量引当場所グループ<p>
	  * 総量引当機能で使用される総量引当場所グループ情報を、総量引当場所グループマスタから取得する<br>
NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAllocGrp(MCRow row) {
		MCList<MAM_ALLOC_GRP_R> rslt = MCList.create(MAM_ALLOC_GRP_R.class);
		MAM_ALLOC_GRP_R dbc = MAM_ALLOC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAllocGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AllocGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AllocGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAllocGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AllocGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAllocGrp_SubColumns(row, down);
	}
	/** 
	  * AllocGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAllocGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AllocGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AllocGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAllocGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALLOC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AllocGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAllocGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAllocGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AllocGrpCols.outAll());
	}


	/** 
	  * Bank:銀行<p>
	  * 銀行マスタから銀行情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBank(MCRow row) {
		MCList<MAM_BANK_R> rslt = MCList.create(MAM_BANK_R.class);
		MAM_BANK_R dbc = MAM_BANK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBank_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Bank");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Bank").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBank_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Bank");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBank_SubColumns(row, down);
	}
	/** 
	  * Bank:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBank_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BankCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Bank:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBank_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BANK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Bank:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBank_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBank_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BankCols.outAll());
	}


	/** 
	  * BankBranch:銀行支店<p>
	  * 引数の銀行ＣＤに対する銀行支店情報を、銀行支店マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBankBranch(MCRow row) {
		MCList<MAM_BANK_BRANCH_R> rslt = MCList.create(MAM_BANK_BRANCH_R.class);
		MAM_BANK_BRANCH_R dbc = MAM_BANK_BRANCH_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBankBranch_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BankBranch");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BankBranch").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBankBranch_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BankBranch");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBankBranch_SubColumns(row, down);
	}
	/** 
	  * BankBranch:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBankBranch_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_BRANCH_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BankBranchCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BankBranch:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBankBranch_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BANK_BRANCH_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BankBranch:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBankBranch_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBankBranch_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BankBranchCols.outAll());
	}


	/** 
	  * CalBase:カレンダ<p>
	  * カレンダＣＤとカレンダ名を、カレンダ基本マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalBase(MCRow row) {
		MCList<MAM_CAL_BASE_R> rslt = MCList.create(MAM_CAL_BASE_R.class);
		MAM_CAL_BASE_R dbc = MAM_CAL_BASE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalBase_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CalBase");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CalBase").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalBase_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CalBase");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalBase_SubColumns(row, down);
	}
	/** 
	  * CalBase:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalBase_Set(MCRow row, MCQueryApiBuilder builder, MAM_CAL_BASE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalBaseCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalBase:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalBase_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CAL_BASE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalBase:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalBase_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalBase_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalBaseCols.outAll());
	}


	/** 
	  * Cntry:国<p>
	  * 国マスタから国情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCntry(MCRow row) {
		MCList<MAM_CNTRY_R> rslt = MCList.create(MAM_CNTRY_R.class);
		MAM_CNTRY_R dbc = MAM_CNTRY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCntry_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Cntry");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Cntry").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCntry_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Cntry");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCntry_SubColumns(row, down);
	}
	/** 
	  * Cntry:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCntry_Set(MCRow row, MCQueryApiBuilder builder, MAM_CNTRY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CntryCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Cntry:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCntry_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CNTRY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Cntry:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCntry_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCntry_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CntryCols.outAll());
	}


	/** 
	  * LgGrp:物流グループ<p>
	  * 物流グループマスタから物流グループ情報を取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・ワーキンググループで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgGrp(MCRow row) {
		MCList<MAM_LG_GRP_R> rslt = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R dbc = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgGrp_SubColumns(row, down);
	}
	/** 
	  * LgGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgGrpCols.outAll());
	}


	/** 
	  * LocGrp:製造場所グループ<p>
	  * 製造場所グループ情報を製造場所グループマスタから取得する<br>
・製造場所場所マスタのワーキンググループＣＤで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLocGrp(MCRow row) {
		MCList<MAM_LOC_GRP_R> rslt = MCList.create(MAM_LOC_GRP_R.class);
		MAM_LOC_GRP_R dbc = MAM_LOC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLocGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LocGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LocGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLocGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LocGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLocGrp_SubColumns(row, down);
	}
	/** 
	  * LocGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLocGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LocGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LocGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLocGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LocGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLocGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLocGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LocGrpCols.outAll());
	}


	/** 
	  * SlipForm:伝票帳票<p>
	  * 伝票帳票マスタから伝票帳票情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlipForm(MCRow row) {
		MCList<MAM_SLIP_FORM_R> rslt = MCList.create(MAM_SLIP_FORM_R.class);
		MAM_SLIP_FORM_R dbc = MAM_SLIP_FORM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlipForm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlipForm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlipForm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlipForm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlipForm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlipForm_SubColumns(row, down);
	}
	/** 
	  * SlipForm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlipForm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLIP_FORM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlipFormCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlipForm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlipForm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLIP_FORM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlipForm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlipForm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlipForm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlipFormCols.outAll());
	}


	/** 
	  * Trnspt:輸送方法<p>
	  * 輸送方法マスタから輸送方法情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTrnspt(MCRow row) {
		MCList<MAM_TRNSPT_R> rslt = MCList.create(MAM_TRNSPT_R.class);
		MAM_TRNSPT_R dbc = MAM_TRNSPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTrnspt_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Trnspt");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Trnspt").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTrnspt_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Trnspt");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTrnspt_SubColumns(row, down);
	}
	/** 
	  * Trnspt:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTrnspt_Set(MCRow row, MCQueryApiBuilder builder, MAM_TRNSPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, TrnsptCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Trnspt:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTrnspt_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TRNSPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Trnspt:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTrnspt_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTrnspt_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(TrnsptCols.outAll());
	}


	/** 
	  * Unit:単位<p>
	  * 単位マスタから単位情報を取得する<br>
引数の基準単位ＣＤに値が設定されている場合、単位ＣＤと基準単位ＣＤを基に単位換算マスタを外部結合して、単位換算マスタの換算基準数量と換算数量を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getUnit(MCRow row) {
		MCList<MAM_UNIT_R> rslt = MCList.create(MAM_UNIT_R.class);
		MAM_UNIT_R dbc = MAM_UNIT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getUnit_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Unit");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Unit").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getUnit_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Unit");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getUnit_SubColumns(row, down);
	}
	/** 
	  * Unit:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getUnit_Set(MCRow row, MCQueryApiBuilder builder, MAM_UNIT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, UnitCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Unit:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getUnit_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_UNIT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Unit:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getUnit_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getUnit_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(UnitCols.outAll());
	}


	/** 
	  * Area:地域<p>
	  * 地域マスタから地域情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArea(MCRow row) {
		MCList<MAM_AREA_R> rslt = MCList.create(MAM_AREA_R.class);
		MAM_AREA_R dbc = MAM_AREA_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArea_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Area");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Area").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArea_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Area");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArea_SubColumns(row, down);
	}
	/** 
	  * Area:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArea_Set(MCRow row, MCQueryApiBuilder builder, MAM_AREA_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AreaCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Area:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArea_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AREA_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Area:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArea_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArea_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AreaCols.outAll());
	}


	/** 
	  * Xrate:為替レート<p>
	  * 為替レートの種類に対するコードと名称を、為替レート基本マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getXrate(MCRow row) {
		MCList<MAM_XRATE_R> rslt = MCList.create(MAM_XRATE_R.class);
		MAM_XRATE_R dbc = MAM_XRATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getXrate_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Xrate");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Xrate").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getXrate_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Xrate");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getXrate_SubColumns(row, down);
	}
	/** 
	  * Xrate:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getXrate_Set(MCRow row, MCQueryApiBuilder builder, MAM_XRATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, XrateCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Xrate:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getXrate_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_XRATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Xrate:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getXrate_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getXrate_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(XrateCols.outAll());
	}


	/** 
	  * HsGrp:ＨＳ分類<p>
	  * ＨＳ分類マスタからＨＳ分類情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getHsGrp(MCRow row) {
		MCList<MAM_HS_GRP_R> rslt = MCList.create(MAM_HS_GRP_R.class);
		MAM_HS_GRP_R dbc = MAM_HS_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getHsGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.HsGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.HsGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getHsGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.HsGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getHsGrp_SubColumns(row, down);
	}
	/** 
	  * HsGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getHsGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_HS_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, HsGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * HsGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getHsGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_HS_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * HsGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getHsGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getHsGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(HsGrpCols.outAll());
	}


	/** 
	  * Hs:ＨＳ<p>
	  * ＨＳマスタからＨＳ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getHs(MCRow row) {
		MCList<MAM_HS_R> rslt = MCList.create(MAM_HS_R.class);
		MAM_HS_R dbc = MAM_HS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getHs_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Hs");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Hs").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getHs_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Hs");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getHs_SubColumns(row, down);
	}
	/** 
	  * Hs:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getHs_Set(MCRow row, MCQueryApiBuilder builder, MAM_HS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, HsCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Hs:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getHs_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_HS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Hs:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getHs_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getHs_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(HsCols.outAll());
	}


	/** 
	  * ItmGrp:品目分類<p>
	  * 品目分類マスタから属性情報を取得する<br>
品目分類区分に「null」を指定した場合は「null」を返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp_SubColumns(row, down);
	}
	/** 
	  * ItmGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrpCols.outAll());
	}


	/** 
	  * AcItmGrp:会計品目分類<p>
	  * 会計品目分類マスタから、品目に対する会計品目分類情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcItmGrp(MCRow row) {
		MCList<MAM_AC_ITM_GRP_R> rslt = MCList.create(MAM_AC_ITM_GRP_R.class);
		MAM_AC_ITM_GRP_R dbc = MAM_AC_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcItmGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcItmGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcItmGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcItmGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcItmGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcItmGrp_SubColumns(row, down);
	}
	/** 
	  * AcItmGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcItmGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcItmGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcItmGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcItmGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcItmGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcItmGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcItmGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcItmGrpCols.outAll());
	}


	/** 
	  * BizRsn:業務理由<p>
	  * 実績に設定できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBizRsn_SubColumns(row, down);
	}
	/** 
	  * BizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BizRsnCols.outAll());
	}


	/** 
	  * WkRsn:工数理由<p>
	  * 工数実績に対する理由情報を、工数理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWkRsn(MCRow row) {
		MCList<MAM_WK_RSN_R> rslt = MCList.create(MAM_WK_RSN_R.class);
		MAM_WK_RSN_R dbc = MAM_WK_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWkRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.WkRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.WkRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWkRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.WkRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWkRsn_SubColumns(row, down);
	}
	/** 
	  * WkRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWkRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_WK_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WkRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * WkRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWkRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WK_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * WkRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWkRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWkRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WkRsnCols.outAll());
	}


	/** 
	  * WkCost:工数管理<p>
	  * 工数管理マスタから工数管理情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWkCost(MCRow row) {
		MCList<MAM_WK_COST_R> rslt = MCList.create(MAM_WK_COST_R.class);
		MAM_WK_COST_R dbc = MAM_WK_COST_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWkCost_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.WkCost");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.WkCost").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWkCost_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.WkCost");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWkCost_SubColumns(row, down);
	}
	/** 
	  * WkCost:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWkCost_Set(MCRow row, MCQueryApiBuilder builder, MAM_WK_COST_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WkCostCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * WkCost:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWkCost_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WK_COST_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * WkCost:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWkCost_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWkCost_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WkCostCols.outAll());
	}


	/** 
	  * Oper:工程<p>
	  * 工程マスタから工程情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getOper(MCRow row) {
		MCList<MAM_OPER_R> rslt = MCList.create(MAM_OPER_R.class);
		MAM_OPER_R dbc = MAM_OPER_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getOper_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Oper");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Oper").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getOper_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Oper");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getOper_SubColumns(row, down);
	}
	/** 
	  * Oper:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getOper_Set(MCRow row, MCQueryApiBuilder builder, MAM_OPER_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, OperCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Oper:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getOper_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_OPER_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Oper:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getOper_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getOper_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(OperCols.outAll());
	}


	/** 
	  * BpGrp:取引先分類<p>
	  * 取引先分類マスタから属性情報を取得する<br>
取引先分類区分に「null」を指定した場合は「null」を返す<br>
取引先分類区分が未指定の場合は、検索条件としては無効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp_SubColumns(row, down);
	}
	/** 
	  * BpGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrpCols.outAll());
	}


	/** 
	  * Tterm:取引条件<p>
	  * 取引先（得意先や発注先）に対する取引条件を、取引条件マスタから取得する<br>
取引条件区分に「null」を指定した場合は「null」を返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTterm(MCRow row) {
		MCList<MAM_TTERM_R> rslt = MCList.create(MAM_TTERM_R.class);
		MAM_TTERM_R dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTterm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Tterm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Tterm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTterm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Tterm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTterm_SubColumns(row, down);
	}
	/** 
	  * Tterm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTterm_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, TtermCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Tterm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTterm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Tterm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTterm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTterm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(TtermCols.outAll());
	}


	/** 
	  * SetoffGrp:相殺グループ<p>
	  * 債権債務を相殺可能とするグループ情報を、相殺グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSetoffGrp(MCRow row) {
		MCList<MAM_SETOFF_GRP_R> rslt = MCList.create(MAM_SETOFF_GRP_R.class);
		MAM_SETOFF_GRP_R dbc = MAM_SETOFF_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSetoffGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SetoffGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SetoffGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSetoffGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SetoffGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSetoffGrp_SubColumns(row, down);
	}
	/** 
	  * SetoffGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSetoffGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_SETOFF_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SetoffGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SetoffGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSetoffGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SETOFF_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SetoffGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSetoffGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSetoffGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SetoffGrpCols.outAll());
	}


	/** 
	  * EximPort:港<p>
	  * 輸出入における港情報を、港マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getEximPort(MCRow row) {
		MCList<MAM_EXIM_PORT_R> rslt = MCList.create(MAM_EXIM_PORT_R.class);
		MAM_EXIM_PORT_R dbc = MAM_EXIM_PORT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getEximPort_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.EximPort");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.EximPort").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getEximPort_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.EximPort");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getEximPort_SubColumns(row, down);
	}
	/** 
	  * EximPort:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getEximPort_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXIM_PORT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, EximPortCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * EximPort:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getEximPort_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXIM_PORT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * EximPort:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getEximPort_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getEximPort_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(EximPortCols.outAll());
	}


	/** 
	  * ExCntnr:輸出梱包容器<p>
	  * 輸出梱包容器マスタから輸出梱包容器情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExCntnr(MCRow row) {
		MCList<MAM_EX_CNTNR_R> rslt = MCList.create(MAM_EX_CNTNR_R.class);
		MAM_EX_CNTNR_R dbc = MAM_EX_CNTNR_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExCntnr_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExCntnr");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExCntnr").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExCntnr_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExCntnr");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExCntnr_SubColumns(row, down);
	}
	/** 
	  * ExCntnr:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExCntnr_Set(MCRow row, MCQueryApiBuilder builder, MAM_EX_CNTNR_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExCntnrCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExCntnr:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExCntnr_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EX_CNTNR_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExCntnr:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExCntnr_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExCntnr_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExCntnrCols.outAll());
	}


	/** 
	  * StkGd:格付<p>
	  * 在庫に対する格付情報を格付マスタから取得する<br>
・見積、受注登録が可能な格付に限定したい場合は、slo_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStkGd(MCRow row) {
		MCList<MAM_STK_GD_R> rslt = MCList.create(MAM_STK_GD_R.class);
		MAM_STK_GD_R dbc = MAM_STK_GD_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStkGd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.StkGd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.StkGd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStkGd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.StkGd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStkGd_SubColumns(row, down);
	}
	/** 
	  * StkGd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStkGd_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StkGdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StkGd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStkGd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StkGd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStkGd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStkGd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StkGdCols.outAll());
	}


	/** 
	  * Trd:取引<p>
	  * 取引情報を取引マスタから取得する<br>
引数の取引パタン区分を指定した場合は、対応する取引情報を取得する<br>
引数の機能ＩＤを指定した場合は、取引パタン区分を取引パタン制御情報から抽出し、抽出した取引パタン区分に対応する取引情報を取得する<br>
引数の機能IDは、引数の取引パタン区分が未指定か「null」の場合に有効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTrd(MCRow row) {
		MCList<MAM_TRD_R> rslt = MCList.create(MAM_TRD_R.class);
		MAM_TRD_R dbc = MAM_TRD_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTrd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Trd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Trd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTrd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Trd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTrd_SubColumns(row, down);
	}
	/** 
	  * Trd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTrd_Set(MCRow row, MCQueryApiBuilder builder, MAM_TRD_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, TrdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Trd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTrd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TRD_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Trd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTrd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTrd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(TrdCols.outAll());
	}


	/** 
	  * SlsUpriGrp:販売単価分類<p>
	  * 同一の販売単価を使用する品目のグループ情報を、販売単価分類マスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsUpriGrp(MCRow row) {
		MCList<MAM_SLS_UPRI_GRP_R> rslt = MCList.create(MAM_SLS_UPRI_GRP_R.class);
		MAM_SLS_UPRI_GRP_R dbc = MAM_SLS_UPRI_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsUpriGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsUpriGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsUpriGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsUpriGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsUpriGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsUpriGrp_SubColumns(row, down);
	}
	/** 
	  * SlsUpriGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsUpriGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_UPRI_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsUpriGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsUpriGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsUpriGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_UPRI_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsUpriGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsUpriGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsUpriGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsUpriGrpCols.outAll());
	}


	/** 
	  * SlsUpriRank:販売単価ランク<p>
	  * 取引先に応じて販売単価を変更するためのランク情報を、販売単価ランクマスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsUpriRank(MCRow row) {
		MCList<MAM_SLS_UPRI_RANK_R> rslt = MCList.create(MAM_SLS_UPRI_RANK_R.class);
		MAM_SLS_UPRI_RANK_R dbc = MAM_SLS_UPRI_RANK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsUpriRank_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsUpriRank");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsUpriRank").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsUpriRank_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsUpriRank");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsUpriRank_SubColumns(row, down);
	}
	/** 
	  * SlsUpriRank:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsUpriRank_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_UPRI_RANK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsUpriRankCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsUpriRank:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsUpriRank_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_UPRI_RANK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsUpriRank:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsUpriRank_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsUpriRank_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsUpriRankCols.outAll());
	}


	/** 
	  * ItmShipGrp:品目出荷グループ<p>
	  * 受注時の在庫引当を制御する品目のグループ情報を、品目出荷グループマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmShipGrp(MCRow row) {
		MCList<MAM_ITM_SHIP_GRP_R> rslt = MCList.create(MAM_ITM_SHIP_GRP_R.class);
		MAM_ITM_SHIP_GRP_R dbc = MAM_ITM_SHIP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmShipGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmShipGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmShipGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmShipGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmShipGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmShipGrp_SubColumns(row, down);
	}
	/** 
	  * ItmShipGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmShipGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SHIP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmShipGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmShipGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmShipGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SHIP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmShipGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmShipGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmShipGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmShipGrpCols.outAll());
	}


	/** 
	  * ShipValid:出荷有効期限グループ<p>
	  * 有効期限に対するルールを制御するグループ情報を、出荷有効期限グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipValid(MCRow row) {
		MCList<MAM_SHIP_VALID_R> rslt = MCList.create(MAM_SHIP_VALID_R.class);
		MAM_SHIP_VALID_R dbc = MAM_SHIP_VALID_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipValid_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ShipValid");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ShipValid").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipValid_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ShipValid");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipValid_SubColumns(row, down);
	}
	/** 
	  * ShipValid:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipValid_Set(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_VALID_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipValidCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipValid:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipValid_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_VALID_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipValid:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipValid_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipValid_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipValidCols.outAll());
	}


	/** 
	  * ExpnsGrp:原価費目グループ<p>
	  * 原価費目グループマスタから原価費目グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExpnsGrp(MCRow row) {
		MCList<MAM_EXPNS_GRP_R> rslt = MCList.create(MAM_EXPNS_GRP_R.class);
		MAM_EXPNS_GRP_R dbc = MAM_EXPNS_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExpnsGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExpnsGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExpnsGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExpnsGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExpnsGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExpnsGrp_SubColumns(row, down);
	}
	/** 
	  * ExpnsGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExpnsGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExpnsGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExpnsGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExpnsGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExpnsGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExpnsGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExpnsGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExpnsGrpCols.outAll());
	}


	/** 
	  * Expns:原価費目<p>
	  * 原価費目マスタから原価費目情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExpns(MCRow row) {
		MCList<MAM_EXPNS_R> rslt = MCList.create(MAM_EXPNS_R.class);
		MAM_EXPNS_R dbc = MAM_EXPNS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExpns_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Expns");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Expns").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExpns_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Expns");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExpns_SubColumns(row, down);
	}
	/** 
	  * Expns:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExpns_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExpnsCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Expns:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExpns_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Expns:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExpns_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExpns_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExpnsCols.outAll());
	}


	/** 
	  * CostMenu:原価メニュー<p>
	  * 原価メニューマスタから原価メニュー情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostMenu(MCRow row) {
		MCList<MAM_COST_MENU_R> rslt = MCList.create(MAM_COST_MENU_R.class);
		MAM_COST_MENU_R dbc = MAM_COST_MENU_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostMenu_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostMenu");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostMenu").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostMenu_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostMenu");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostMenu_SubColumns(row, down);
	}
	/** 
	  * CostMenu:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostMenu_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_MENU_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostMenuCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostMenu:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostMenu_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_MENU_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostMenu:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostMenu_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostMenu_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostMenuCols.outAll());
	}


	/** 
	  * PfGrp:購買内示グループ<p>
	  * 購買内示グループマスタから購買内示グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPfGrp(MCRow row) {
		MCList<MAM_PF_GRP_R> rslt = MCList.create(MAM_PF_GRP_R.class);
		MAM_PF_GRP_R dbc = MAM_PF_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPfGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PfGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PfGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPfGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PfGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPfGrp_SubColumns(row, down);
	}
	/** 
	  * PfGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPfGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_PF_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PfGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PfGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPfGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PF_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PfGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPfGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPfGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PfGrpCols.outAll());
	}


	/** 
	  * Site:工場・物流倉庫<p>
	  * 工場や物流倉庫などの場所情報を、工場・物流倉庫マスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSite(MCRow row) {
		MCList<MAM_SITE_R> rslt = MCList.create(MAM_SITE_R.class);
		MAM_SITE_R dbc = MAM_SITE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSite_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Site");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Site").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSite_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Site");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSite_SubColumns(row, down);
	}
	/** 
	  * Site:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSite_Set(MCRow row, MCQueryApiBuilder builder, MAM_SITE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SiteCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Site:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSite_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SITE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Site:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSite_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSite_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SiteCols.outAll());
	}


	/** 
	  * Wg:ワーキンググループ<p>
	  * ワーキンググループマスタに登録されているワーキンググループ（ワーキンググループ）情報を取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Wg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Wg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Wg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWg_SubColumns(row, down);
	}
	/** 
	  * Wg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Wg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Wg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WgCols.outAll());
	}


	/** 
	  * StrLn:棚・ライン<p>
	  * 引数の場所に対応する棚やラインの情報を、棚・ラインマスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStrLn(MCRow row) {
		MCList<MAM_STR_LN_R> rslt = MCList.create(MAM_STR_LN_R.class);
		MAM_STR_LN_R dbc = MAM_STR_LN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStrLn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.StrLn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.StrLn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStrLn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.StrLn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStrLn_SubColumns(row, down);
	}
	/** 
	  * StrLn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStrLn_Set(MCRow row, MCQueryApiBuilder builder, MAM_STR_LN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StrLnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StrLn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStrLn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STR_LN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StrLn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStrLn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStrLn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StrLnCols.outAll());
	}


	/** 
	  * ItmTypD:品目区分詳細<p>
	  * 引数の品目区分に対応する品目区分の詳細情報を、品目区分詳細マスタから取得する<br>
品目区分詳細ＣＤに「null」を指定した場合は「null」を返す<br>
品目区分詳細ＣＤが未指定の場合は、検索条件としては無効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmTypD(MCRow row) {
		MCList<MAM_ITM_TYP_D_R> rslt = MCList.create(MAM_ITM_TYP_D_R.class);
		MAM_ITM_TYP_D_R dbc = MAM_ITM_TYP_D_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmTypD_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmTypD");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmTypD").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmTypD_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmTypD");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmTypD_SubColumns(row, down);
	}
	/** 
	  * ItmTypD:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmTypD_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_TYP_D_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmTypDCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmTypD:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmTypD_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_TYP_D_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmTypD:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmTypD_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmTypD_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmTypDCols.outAll());
	}


	/** 
	  * Spec:仕様<p>
	  * 仕様マスタから仕様情報（色やサイズ）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSpec(MCRow row) {
		MCList<MAM_SPEC_R> rslt = MCList.create(MAM_SPEC_R.class);
		MAM_SPEC_R dbc = MAM_SPEC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSpec_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Spec");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Spec").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSpec_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Spec");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSpec_SubColumns(row, down);
	}
	/** 
	  * Spec:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSpec_Set(MCRow row, MCQueryApiBuilder builder, MAM_SPEC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SpecCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Spec:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSpec_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SPEC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Spec:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSpec_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSpec_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SpecCols.outAll());
	}


	/** 
	  * SpecDesc:仕様項目<p>
	  * 引数の仕様ＣＤに対応する仕様項目を、仕様項目マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSpecDesc(MCRow row) {
		MCList<MAM_SPEC_DESC_R> rslt = MCList.create(MAM_SPEC_DESC_R.class);
		MAM_SPEC_DESC_R dbc = MAM_SPEC_DESC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSpecDesc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SpecDesc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SpecDesc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSpecDesc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SpecDesc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSpecDesc_SubColumns(row, down);
	}
	/** 
	  * SpecDesc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSpecDesc_Set(MCRow row, MCQueryApiBuilder builder, MAM_SPEC_DESC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SpecDescCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SpecDesc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSpecDesc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SPEC_DESC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SpecDesc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSpecDesc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSpecDesc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SpecDescCols.outAll());
	}


	/** 
	  * ItmSpecGrp:品目仕様分類<p>
	  * 類似仕様を持つ品目を分類するための情報を、品目仕様分類マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmSpecGrp(MCRow row) {
		MCList<MAM_ITM_SPEC_GRP_R> rslt = MCList.create(MAM_ITM_SPEC_GRP_R.class);
		MAM_ITM_SPEC_GRP_R dbc = MAM_ITM_SPEC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmSpecGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmSpecGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmSpecGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmSpecGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmSpecGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmSpecGrp_SubColumns(row, down);
	}
	/** 
	  * ItmSpecGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmSpecGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SPEC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmSpecGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmSpecGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmSpecGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SPEC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmSpecGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmSpecGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmSpecGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmSpecGrpCols.outAll());
	}


	/** 
	  * ItmCompGrp:品目構成グループ<p>
	  * 構成主品目に対して選択可能なオプションをグループ化するための情報を、品目構成グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmCompGrp(MCRow row) {
		MCList<MAM_ITM_COMP_GRP_R> rslt = MCList.create(MAM_ITM_COMP_GRP_R.class);
		MAM_ITM_COMP_GRP_R dbc = MAM_ITM_COMP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmCompGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmCompGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmCompGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmCompGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmCompGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmCompGrp_SubColumns(row, down);
	}
	/** 
	  * ItmCompGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmCompGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_COMP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmCompGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmCompGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmCompGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_COMP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmCompGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmCompGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmCompGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmCompGrpCols.outAll());
	}


	/** 
	  * Co:会社<p>
	  * 会社マスタから自社情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCo(MCRow row) {
		MCList<MAM_CO_R> rslt = MCList.create(MAM_CO_R.class);
		MAM_CO_R dbc = MAM_CO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Co");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Co").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Co");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCo_SubColumns(row, down);
	}
	/** 
	  * Co:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCo_Set(MCRow row, MCQueryApiBuilder builder, MAM_CO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Co:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Co:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CoCols.outAll());
	}


	/** 
	  * DptLvl:部門階層<p>
	  * 部門階層マスタから部門階層を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDptLvl(MCRow row) {
		MCList<MAM_DPT_LVL_R> rslt = MCList.create(MAM_DPT_LVL_R.class);
		MAM_DPT_LVL_R dbc = MAM_DPT_LVL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDptLvl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DptLvl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DptLvl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDptLvl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DptLvl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDptLvl_SubColumns(row, down);
	}
	/** 
	  * DptLvl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDptLvl_Set(MCRow row, MCQueryApiBuilder builder, MAM_DPT_LVL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DptLvlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DptLvl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDptLvl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_DPT_LVL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DptLvl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDptLvl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDptLvl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DptLvlCols.outAll());
	}


	/** 
	  * Da:データアクセス<p>
	  * データアクセス基本マスタからデータアクセス権限情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDa(MCRow row) {
		MCList<MAM_DA_R> rslt = MCList.create(MAM_DA_R.class);
		MAM_DA_R dbc = MAM_DA_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDa_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Da");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Da").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDa_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Da");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDa_SubColumns(row, down);
	}
	/** 
	  * Da:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDa_Set(MCRow row, MCQueryApiBuilder builder, MAM_DA_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DaCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Da:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDa_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_DA_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Da:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDa_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDa_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DaCols.outAll());
	}


	/** 
	  * AprvRole:承認役割<p>
	  * 承認役割マスタから承認役割情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAprvRole(MCRow row) {
		MCList<MAM_APRV_ROLE_R> rslt = MCList.create(MAM_APRV_ROLE_R.class);
		MAM_APRV_ROLE_R dbc = MAM_APRV_ROLE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAprvRole_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AprvRole");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AprvRole").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAprvRole_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AprvRole");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAprvRole_SubColumns(row, down);
	}
	/** 
	  * AprvRole:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAprvRole_Set(MCRow row, MCQueryApiBuilder builder, MAM_APRV_ROLE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AprvRoleCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AprvRole:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAprvRole_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_APRV_ROLE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AprvRole:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAprvRole_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAprvRole_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AprvRoleCols.outAll());
	}


	/** 
	  * NumPtn:発番パタン<p>
	  * 引数の発番業務区分に対応する発番パタンを、発番パタンマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getNumPtn(MCRow row) {
		MCList<MAM_NUM_PTN_R> rslt = MCList.create(MAM_NUM_PTN_R.class);
		MAM_NUM_PTN_R dbc = MAM_NUM_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getNumPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.NumPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.NumPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getNumPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.NumPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getNumPtn_SubColumns(row, down);
	}
	/** 
	  * NumPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getNumPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_NUM_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, NumPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * NumPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getNumPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_NUM_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * NumPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getNumPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getNumPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(NumPtnCols.outAll());
	}


	/** 
	  * Term:対象期間<p>
	  * 対象期間マスタから「期」に関する情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTerm(MCRow row) {
		MCList<MAM_TERM_R> rslt = MCList.create(MAM_TERM_R.class);
		MAM_TERM_R dbc = MAM_TERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTerm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Term");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Term").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTerm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Term");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTerm_SubColumns(row, down);
	}
	/** 
	  * Term:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTerm_Set(MCRow row, MCQueryApiBuilder builder, MAM_TERM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, TermCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Term:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTerm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TERM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Term:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTerm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTerm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(TermCols.outAll());
	}


	/** 
	  * AcSubtyp1:科目区分値（予備科目区分１）<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分１）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSubtyp1(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSubtyp1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSubtyp1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSubtyp1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSubtyp1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSubtyp1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSubtyp1_SubColumns(row, down);
	}
	/** 
	  * AcSubtyp1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSubtyp1_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSubtyp1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSubtyp1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSubtyp1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSubtyp1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSubtyp1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSubtyp1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSubtyp1Cols.outAll());
	}


	/** 
	  * AcSubtyp2:科目区分値（予備科目区分２）<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分２）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSubtyp2(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSubtyp2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSubtyp2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSubtyp2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSubtyp2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSubtyp2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSubtyp2_SubColumns(row, down);
	}
	/** 
	  * AcSubtyp2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSubtyp2_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSubtyp2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSubtyp2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSubtyp2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSubtyp2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSubtyp2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSubtyp2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSubtyp2Cols.outAll());
	}


	/** 
	  * AcSubtyp3:科目区分値（予備科目区分３）<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分３）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSubtyp3(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSubtyp3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSubtyp3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSubtyp3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSubtyp3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSubtyp3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSubtyp3_SubColumns(row, down);
	}
	/** 
	  * AcSubtyp3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSubtyp3_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSubtyp3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSubtyp3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSubtyp3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSubtyp3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSubtyp3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSubtyp3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSubtyp3Cols.outAll());
	}


	/** 
	  * AcSubtyp4:科目区分値（予備科目区分４）<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分４）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSubtyp4(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSubtyp4_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSubtyp4");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSubtyp4").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSubtyp4_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSubtyp4");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSubtyp4_SubColumns(row, down);
	}
	/** 
	  * AcSubtyp4:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSubtyp4_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSubtyp4Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSubtyp4:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSubtyp4_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSubtyp4:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSubtyp4_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSubtyp4_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSubtyp4Cols.outAll());
	}


	/** 
	  * AcSubtyp5:科目区分値（予備科目区分５）<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分５）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSubtyp5(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSubtyp5_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSubtyp5");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSubtyp5").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSubtyp5_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSubtyp5");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSubtyp5_SubColumns(row, down);
	}
	/** 
	  * AcSubtyp5:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSubtyp5_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSubtyp5Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSubtyp5:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSubtyp5_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSubtyp5:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSubtyp5_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSubtyp5_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSubtyp5Cols.outAll());
	}


	/** 
	  * ApSubtyp:科目区分値（ＡＰ科目区分）<p>
	  * 予備科目区分マスタから科目区分値（ＡＰ科目区分）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getApSubtyp(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getApSubtyp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ApSubtyp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ApSubtyp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getApSubtyp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ApSubtyp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getApSubtyp_SubColumns(row, down);
	}
	/** 
	  * ApSubtyp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getApSubtyp_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ApSubtypCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ApSubtyp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getApSubtyp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ApSubtyp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getApSubtyp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getApSubtyp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ApSubtypCols.outAll());
	}


	/** 
	  * ArSubtyp:科目区分値（ＡＲ科目区分）<p>
	  * 予備科目区分マスタから科目区分値（ＡＲ科目区分）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArSubtyp(MCRow row) {
		MCList<MAM_AC_SUBTYPEM_R> rslt = MCList.create(MAM_AC_SUBTYPEM_R.class);
		MAM_AC_SUBTYPEM_R dbc = MAM_AC_SUBTYPEM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArSubtyp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ArSubtyp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ArSubtyp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArSubtyp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ArSubtyp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArSubtyp_SubColumns(row, down);
	}
	/** 
	  * ArSubtyp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArSubtyp_Set(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ArSubtypCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ArSubtyp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArSubtyp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_AC_SUBTYPEM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ArSubtyp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArSubtyp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArSubtyp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ArSubtypCols.outAll());
	}


	/** 
	  * Tax:税<p>
	  * 税マスタから税（消費税）情報を取得する<br>
・内税で絞り込む場合は、tax_flgに「true」または「false」を指定する<br>
・売上で絞り込む場合は、sls_flgに「true」または「false」を指定する<br>
・仕入で絞り込む場合は、purc_flgに「true」または「false」を指定する<br>
・支給で絞り込む場合は、prov_flgに「true」または「false」を指定する<br>

	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTax(MCRow row) {
		MCList<MAM_TAX_R> rslt = MCList.create(MAM_TAX_R.class);
		MAM_TAX_R dbc = MAM_TAX_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTax_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Tax");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Tax").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTax_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Tax");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTax_SubColumns(row, down);
	}
	/** 
	  * Tax:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, TaxCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Tax:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTax_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Tax:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTax_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTax_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(TaxCols.outAll());
	}


	/** 
	  * SlsTax:売上税<p>
	  * 税マスタから売上税（消費税）情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsTax(MCRow row) {
		MCList<MAM_TAX_R> rslt = MCList.create(MAM_TAX_R.class);
		MAM_TAX_R dbc = MAM_TAX_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsTax_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsTax");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsTax").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsTax_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsTax");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsTax_SubColumns(row, down);
	}
	/** 
	  * SlsTax:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsTaxCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsTax:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsTax_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsTax:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsTax_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsTax_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsTaxCols.outAll());
	}


	/** 
	  * PurcTax:仕入税<p>
	  * 税マスタから仕入税（消費税）情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPurcTax(MCRow row) {
		MCList<MAM_TAX_R> rslt = MCList.create(MAM_TAX_R.class);
		MAM_TAX_R dbc = MAM_TAX_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPurcTax_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PurcTax");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PurcTax").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPurcTax_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PurcTax");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPurcTax_SubColumns(row, down);
	}
	/** 
	  * PurcTax:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPurcTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PurcTaxCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PurcTax:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPurcTax_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PurcTax:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPurcTax_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPurcTax_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PurcTaxCols.outAll());
	}


	/** 
	  * ProvTax:支給税<p>
	  * 税マスタから支給税（消費税）情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getProvTax(MCRow row) {
		MCList<MAM_TAX_R> rslt = MCList.create(MAM_TAX_R.class);
		MAM_TAX_R dbc = MAM_TAX_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getProvTax_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ProvTax");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ProvTax").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getProvTax_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ProvTax");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getProvTax_SubColumns(row, down);
	}
	/** 
	  * ProvTax:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getProvTax_Set(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ProvTaxCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ProvTax:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getProvTax_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TAX_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ProvTax:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getProvTax_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getProvTax_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ProvTaxCols.outAll());
	}


	/** 
	  * PoPrint:注文書表示<p>
	  * 発注処理における注文書に表示する内容の情報を、注文書表示マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPoPrint(MCRow row) {
		MCList<MAM_PO_PRINT_R> rslt = MCList.create(MAM_PO_PRINT_R.class);
		MAM_PO_PRINT_R dbc = MAM_PO_PRINT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPoPrint_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PoPrint");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PoPrint").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPoPrint_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PoPrint");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPoPrint_SubColumns(row, down);
	}
	/** 
	  * PoPrint:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPoPrint_Set(MCRow row, MCQueryApiBuilder builder, MAM_PO_PRINT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PoPrintCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PoPrint:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPoPrint_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PO_PRINT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PoPrint:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPoPrint_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPoPrint_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PoPrintCols.outAll());
	}


	/** 
	  * JnlPtnSeq:連番（自動仕訳パタン）<p>
	  * 引数の仕訳パタンＣＤに対応する連番を、自動仕訳パタンマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getJnlPtnSeq(MCRow row) {
		MCList<MAM_JNL_PTN_R> rslt = MCList.create(MAM_JNL_PTN_R.class);
		MAM_JNL_PTN_R dbc = MAM_JNL_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getJnlPtnSeq_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.JnlPtnSeq");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.JnlPtnSeq").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getJnlPtnSeq_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.JnlPtnSeq");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getJnlPtnSeq_SubColumns(row, down);
	}
	/** 
	  * JnlPtnSeq:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getJnlPtnSeq_Set(MCRow row, MCQueryApiBuilder builder, MAM_JNL_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, JnlPtnSeqCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * JnlPtnSeq:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getJnlPtnSeq_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_JNL_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * JnlPtnSeq:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getJnlPtnSeq_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getJnlPtnSeq_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(JnlPtnSeqCols.outAll());
	}


	/** 
	  * CalcPtn:計算パタン<p>
	  * 計算パタンマスタから計算パタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcPtn(MCRow row) {
		MCList<MAM_CALC_PTN_R> rslt = MCList.create(MAM_CALC_PTN_R.class);
		MAM_CALC_PTN_R dbc = MAM_CALC_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CalcPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CalcPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CalcPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcPtn_SubColumns(row, down);
	}
	/** 
	  * CalcPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcPtnCols.outAll());
	}


	/** 
	  * CalcGrp:計算グループ<p>
	  * 計算グループマスタから計算グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcGrp(MCRow row) {
		MCList<MAM_CALC_GRP_R> rslt = MCList.create(MAM_CALC_GRP_R.class);
		MAM_CALC_GRP_R dbc = MAM_CALC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CalcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CalcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CalcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcGrp_SubColumns(row, down);
	}
	/** 
	  * CalcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcGrpCols.outAll());
	}


	/** 
	  * CostIo:受払表<p>
	  * 原価個別受払表マスタから受払表情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostIo(MCRow row) {
		MCList<MAM_COST_IO_R> rslt = MCList.create(MAM_COST_IO_R.class);
		MAM_COST_IO_R dbc = MAM_COST_IO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostIo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostIo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostIo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostIo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostIo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostIo_SubColumns(row, down);
	}
	/** 
	  * CostIo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostIo_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_IO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostIoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostIo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostIo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_IO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostIo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostIo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostIo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostIoCols.outAll());
	}


	/** 
	  * CostIoConf:受払項目<p>
	  * 引数の受払表ＩＤに対応する受払項目を取得する<br>
受払集計単位区分で絞り込める
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostIoConf(MCRow row) {
		MCList<MAM_COST_IO_CONF_R> rslt = MCList.create(MAM_COST_IO_CONF_R.class);
		MAM_COST_IO_CONF_R dbc = MAM_COST_IO_CONF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostIoConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostIoConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostIoConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostIoConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostIoConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostIoConf_SubColumns(row, down);
	}
	/** 
	  * CostIoConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostIoConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_IO_CONF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostIoConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostIoConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostIoConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_IO_CONF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostIoConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostIoConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostIoConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostIoConfCols.outAll());
	}


	/** 
	  * AlcPtn:配賦パタン<p>
	  * 配賦パタンマスタから配賦パタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcPtn(MCRow row) {
		MCList<MAM_ALC_PTN_R> rslt = MCList.create(MAM_ALC_PTN_R.class);
		MAM_ALC_PTN_R dbc = MAM_ALC_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcPtn_SubColumns(row, down);
	}
	/** 
	  * AlcPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcPtnCols.outAll());
	}


	/** 
	  * AlcAcGrp:配賦科目グループ<p>
	  * 配賦科目グループマスタから配賦科目グループ情報を取得する<br>
配賦科目グループ区分に「null」を指定した場合は「null」を返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcAcGrp(MCRow row) {
		MCList<MAM_ALC_AC_GRP_R> rslt = MCList.create(MAM_ALC_AC_GRP_R.class);
		MAM_ALC_AC_GRP_R dbc = MAM_ALC_AC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcAcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcAcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcAcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcAcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcAcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcAcGrp_SubColumns(row, down);
	}
	/** 
	  * AlcAcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcAcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcAcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcAcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcAcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcAcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcAcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcAcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcAcGrpCols.outAll());
	}


	/** 
	  * AlcAc:配賦科目<p>
	  * 配賦科目マスタから配賦科目情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcAc(MCRow row) {
		MCList<MAM_ALC_AC_R> rslt = MCList.create(MAM_ALC_AC_R.class);
		MAM_ALC_AC_R dbc = MAM_ALC_AC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcAc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcAc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcAc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcAc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcAc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcAc_SubColumns(row, down);
	}
	/** 
	  * AlcAc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcAcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcAc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcAc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcAc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcAc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcAc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcAcCols.outAll());
	}


	/** 
	  * ItmGrp1:品目分類（品目分類区分１）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分１）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp1(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp1_SubColumns(row, down);
	}
	/** 
	  * ItmGrp1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp1Cols.outAll());
	}


	/** 
	  * ItmGrp2:品目分類（品目分類区分２）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分２）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp2(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp2_SubColumns(row, down);
	}
	/** 
	  * ItmGrp2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp2Cols.outAll());
	}


	/** 
	  * ItmGrp3:品目分類（品目分類区分３）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分３）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp3(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp3_SubColumns(row, down);
	}
	/** 
	  * ItmGrp3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp3Cols.outAll());
	}


	/** 
	  * ItmGrp4:品目分類（品目分類区分４）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分４）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp4(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp4_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp4");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp4").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp4_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp4");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp4_SubColumns(row, down);
	}
	/** 
	  * ItmGrp4:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp4_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp4Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp4:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp4_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp4:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp4_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp4_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp4Cols.outAll());
	}


	/** 
	  * ItmGrp5:品目分類（品目分類区分５）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分５）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp5(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp5_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp5");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp5").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp5_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp5");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp5_SubColumns(row, down);
	}
	/** 
	  * ItmGrp5:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp5_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp5Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp5:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp5_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp5:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp5_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp5_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp5Cols.outAll());
	}


	/** 
	  * ItmGrp6:品目分類（品目分類区分６）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分６）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp6(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp6_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp6");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp6").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp6_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp6");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp6_SubColumns(row, down);
	}
	/** 
	  * ItmGrp6:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp6_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp6Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp6:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp6_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp6:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp6_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp6_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp6Cols.outAll());
	}


	/** 
	  * ItmGrp7:品目分類（品目分類区分７）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分７）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp7(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp7_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp7");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp7").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp7_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp7");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp7_SubColumns(row, down);
	}
	/** 
	  * ItmGrp7:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp7_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp7Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp7:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp7_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp7:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp7_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp7_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp7Cols.outAll());
	}


	/** 
	  * ItmGrp8:品目分類（品目分類区分８）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分８）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp8(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp8_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp8");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp8").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp8_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp8");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp8_SubColumns(row, down);
	}
	/** 
	  * ItmGrp8:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp8_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp8Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp8:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp8_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp8:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp8_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp8_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp8Cols.outAll());
	}


	/** 
	  * ItmGrp9:品目分類（品目分類区分９）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分９）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp9(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp9_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp9");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp9").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp9_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp9");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp9_SubColumns(row, down);
	}
	/** 
	  * ItmGrp9:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp9_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp9Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp9:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp9_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp9:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp9_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp9_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp9Cols.outAll());
	}


	/** 
	  * ItmGrp10:品目分類（品目分類区分１０）<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分１０）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmGrp10(MCRow row) {
		MCList<MAM_ITM_GRP_R> rslt = MCList.create(MAM_ITM_GRP_R.class);
		MAM_ITM_GRP_R dbc = MAM_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmGrp10_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmGrp10");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmGrp10").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmGrp10_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmGrp10");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmGrp10_SubColumns(row, down);
	}
	/** 
	  * ItmGrp10:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmGrp10_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmGrp10Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmGrp10:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmGrp10_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmGrp10:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmGrp10_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmGrp10_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmGrp10Cols.outAll());
	}


	/** 
	  * BpGrp1:取引先分類（取引先分類区分１）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分１）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp1(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp1_SubColumns(row, down);
	}
	/** 
	  * BpGrp1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp1_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp1Cols.outAll());
	}


	/** 
	  * BpGrp2:取引先分類（取引先分類区分２）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分２）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp2(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp2_SubColumns(row, down);
	}
	/** 
	  * BpGrp2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp2_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp2Cols.outAll());
	}


	/** 
	  * BpGrp3:取引先分類（取引先分類区分３）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分３）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp3(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp3_SubColumns(row, down);
	}
	/** 
	  * BpGrp3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp3_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp3Cols.outAll());
	}


	/** 
	  * BpGrp4:取引先分類（取引先分類区分４）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分４）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp4(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp4_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp4");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp4").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp4_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp4");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp4_SubColumns(row, down);
	}
	/** 
	  * BpGrp4:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp4_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp4Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp4:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp4_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp4:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp4_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp4_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp4Cols.outAll());
	}


	/** 
	  * BpGrp5:取引先分類（取引先分類区分５）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分５）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp5(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp5_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp5");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp5").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp5_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp5");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp5_SubColumns(row, down);
	}
	/** 
	  * BpGrp5:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp5_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp5Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp5:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp5_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp5:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp5_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp5_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp5Cols.outAll());
	}


	/** 
	  * BpGrp6:取引先分類（取引先分類区分６）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分６）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp6(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp6_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp6");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp6").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp6_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp6");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp6_SubColumns(row, down);
	}
	/** 
	  * BpGrp6:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp6_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp6Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp6:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp6_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp6:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp6_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp6_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp6Cols.outAll());
	}


	/** 
	  * BpGrp7:取引先分類（取引先分類区分７）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分７）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp7(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp7_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp7");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp7").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp7_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp7");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp7_SubColumns(row, down);
	}
	/** 
	  * BpGrp7:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp7_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp7Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp7:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp7_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp7:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp7_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp7_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp7Cols.outAll());
	}


	/** 
	  * BpGrp8:取引先分類（取引先分類区分８）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分８）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp8(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp8_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp8");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp8").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp8_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp8");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp8_SubColumns(row, down);
	}
	/** 
	  * BpGrp8:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp8_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp8Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp8:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp8_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp8:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp8_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp8_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp8Cols.outAll());
	}


	/** 
	  * BpGrp9:取引先分類（取引先分類区分９）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分９）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp9(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp9_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp9");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp9").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp9_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp9");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp9_SubColumns(row, down);
	}
	/** 
	  * BpGrp9:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp9_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp9Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp9:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp9_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp9:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp9_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp9_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp9Cols.outAll());
	}


	/** 
	  * BpGrp10:取引先分類（取引先分類区分１０）<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分１０）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpGrp10(MCRow row) {
		MCList<MAM_BP_GRP_R> rslt = MCList.create(MAM_BP_GRP_R.class);
		MAM_BP_GRP_R dbc = MAM_BP_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpGrp10_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpGrp10");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpGrp10").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpGrp10_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpGrp10");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpGrp10_SubColumns(row, down);
	}
	/** 
	  * BpGrp10:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpGrp10_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpGrp10Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpGrp10:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpGrp10_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpGrp10:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpGrp10_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpGrp10_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpGrp10Cols.outAll());
	}


	/** 
	  * CostIoNotInCostIoConf:受払表（個別受払表構成未登録）<p>
	  * 原価個別受払表構成マスタに未登録の受払表を、原価個別受払表マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostIoNotInCostIoConf(MCRow row) {
		MCList<MAM_COST_IO_R> rslt = MCList.create(MAM_COST_IO_R.class);
		MAM_COST_IO_R dbc = MAM_COST_IO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostIoNotInCostIoConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostIoNotInCostIoConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostIoNotInCostIoConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostIoNotInCostIoConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostIoNotInCostIoConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostIoNotInCostIoConf_SubColumns(row, down);
	}
	/** 
	  * CostIoNotInCostIoConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostIoNotInCostIoConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_IO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostIoNotInCostIoConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostIoNotInCostIoConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostIoNotInCostIoConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_IO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostIoNotInCostIoConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostIoNotInCostIoConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostIoNotInCostIoConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostIoNotInCostIoConfCols.outAll());
	}


	/** 
	  * CalcCtg:計算カテゴリ<p>
	  * 計算カテゴリマスタから計算カテゴリ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcCtg(MCRow row) {
		MCList<MAM_CALC_CTG_R> rslt = MCList.create(MAM_CALC_CTG_R.class);
		MAM_CALC_CTG_R dbc = MAM_CALC_CTG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcCtg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CalcCtg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CalcCtg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcCtg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CalcCtg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcCtg_SubColumns(row, down);
	}
	/** 
	  * CalcCtg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcCtg_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_CTG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcCtgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcCtg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcCtg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_CTG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcCtg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcCtg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcCtg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcCtgCols.outAll());
	}


	/** 
	  * AlcAcGrp1:配賦科目グループ（区分１）<p>
	  * 配賦科目グループ区分１に属する配賦科目グループ情報を、配賦科目グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcAcGrp1(MCRow row) {
		MCList<MAM_ALC_AC_GRP_R> rslt = MCList.create(MAM_ALC_AC_GRP_R.class);
		MAM_ALC_AC_GRP_R dbc = MAM_ALC_AC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcAcGrp1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcAcGrp1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcAcGrp1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcAcGrp1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcAcGrp1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcAcGrp1_SubColumns(row, down);
	}
	/** 
	  * AlcAcGrp1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcAcGrp1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcAcGrp1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcAcGrp1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcAcGrp1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcAcGrp1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcAcGrp1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcAcGrp1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcAcGrp1Cols.outAll());
	}


	/** 
	  * AlcAcGrp2:配賦科目グループ（区分２）<p>
	  * 配賦科目グループ区分２に属する配賦科目グループ情報を、配賦科目グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcAcGrp2(MCRow row) {
		MCList<MAM_ALC_AC_GRP_R> rslt = MCList.create(MAM_ALC_AC_GRP_R.class);
		MAM_ALC_AC_GRP_R dbc = MAM_ALC_AC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcAcGrp2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcAcGrp2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcAcGrp2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcAcGrp2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcAcGrp2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcAcGrp2_SubColumns(row, down);
	}
	/** 
	  * AlcAcGrp2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcAcGrp2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcAcGrp2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcAcGrp2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcAcGrp2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcAcGrp2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcAcGrp2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcAcGrp2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcAcGrp2Cols.outAll());
	}


	/** 
	  * AlcAcGrp3:配賦科目グループ（区分３）<p>
	  * 配賦科目グループ区分３に属する配賦科目グループ情報を、配賦科目グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcAcGrp3(MCRow row) {
		MCList<MAM_ALC_AC_GRP_R> rslt = MCList.create(MAM_ALC_AC_GRP_R.class);
		MAM_ALC_AC_GRP_R dbc = MAM_ALC_AC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcAcGrp3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcAcGrp3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcAcGrp3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcAcGrp3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcAcGrp3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcAcGrp3_SubColumns(row, down);
	}
	/** 
	  * AlcAcGrp3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcAcGrp3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcAcGrp3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcAcGrp3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcAcGrp3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_AC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcAcGrp3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcAcGrp3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcAcGrp3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcAcGrp3Cols.outAll());
	}


	/** 
	  * Tterm1:取引条件（区分１）<p>
	  * 取引条件区分１に属する取引条件情報を、取引条件マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTterm1(MCRow row) {
		MCList<MAM_TTERM_R> rslt = MCList.create(MAM_TTERM_R.class);
		MAM_TTERM_R dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTterm1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Tterm1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Tterm1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTterm1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Tterm1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTterm1_SubColumns(row, down);
	}
	/** 
	  * Tterm1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTterm1_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, Tterm1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Tterm1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTterm1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Tterm1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTterm1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTterm1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(Tterm1Cols.outAll());
	}


	/** 
	  * Tterm2:取引条件（区分２）<p>
	  * 取引条件区分２に属する取引条件情報を、取引条件マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTterm2(MCRow row) {
		MCList<MAM_TTERM_R> rslt = MCList.create(MAM_TTERM_R.class);
		MAM_TTERM_R dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTterm2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Tterm2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Tterm2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTterm2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Tterm2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTterm2_SubColumns(row, down);
	}
	/** 
	  * Tterm2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTterm2_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, Tterm2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Tterm2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTterm2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Tterm2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTterm2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTterm2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(Tterm2Cols.outAll());
	}


	/** 
	  * Tterm3:取引条件（区分３）<p>
	  * 取引条件区分３に属する取引条件情報を、取引条件マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getTterm3(MCRow row) {
		MCList<MAM_TTERM_R> rslt = MCList.create(MAM_TTERM_R.class);
		MAM_TTERM_R dbc = MAM_TTERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getTterm3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Tterm3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Tterm3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getTterm3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Tterm3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getTterm3_SubColumns(row, down);
	}
	/** 
	  * Tterm3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getTterm3_Set(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, Tterm3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Tterm3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getTterm3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_TTERM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Tterm3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getTterm3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getTterm3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(Tterm3Cols.outAll());
	}


	/** 
	  * SlsAnly:販売分析<p>
	  * 引数の販売分析区分に対応するグループ情報を、販売分析マスタから取得する<br>
得意先をグルーピングして販売データを参照する際のグループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsAnly(MCRow row) {
		MCList<MAM_SLS_ANLY_R> rslt = MCList.create(MAM_SLS_ANLY_R.class);
		MAM_SLS_ANLY_R dbc = MAM_SLS_ANLY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsAnly_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsAnly");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsAnly").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsAnly_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsAnly");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsAnly_SubColumns(row, down);
	}
	/** 
	  * SlsAnly:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsAnly_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsAnlyCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsAnly:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsAnly_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsAnly:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsAnly_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsAnly_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsAnlyCols.outAll());
	}


	/** 
	  * SlsAnly1:販売分析（区分１）<p>
	  * 販売分析区分１に属する販売分析情報を、販売分析マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsAnly1(MCRow row) {
		MCList<MAM_SLS_ANLY_R> rslt = MCList.create(MAM_SLS_ANLY_R.class);
		MAM_SLS_ANLY_R dbc = MAM_SLS_ANLY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsAnly1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsAnly1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsAnly1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsAnly1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsAnly1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsAnly1_SubColumns(row, down);
	}
	/** 
	  * SlsAnly1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsAnly1_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsAnly1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsAnly1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsAnly1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsAnly1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsAnly1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsAnly1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsAnly1Cols.outAll());
	}


	/** 
	  * SlsAnly2:販売分析（区分２）<p>
	  * 販売分析区分２に属する販売分析情報を、販売分析マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsAnly2(MCRow row) {
		MCList<MAM_SLS_ANLY_R> rslt = MCList.create(MAM_SLS_ANLY_R.class);
		MAM_SLS_ANLY_R dbc = MAM_SLS_ANLY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsAnly2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsAnly2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsAnly2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsAnly2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsAnly2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsAnly2_SubColumns(row, down);
	}
	/** 
	  * SlsAnly2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsAnly2_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsAnly2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsAnly2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsAnly2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsAnly2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsAnly2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsAnly2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsAnly2Cols.outAll());
	}


	/** 
	  * SlsAnly3:販売分析（区分３）<p>
	  * 販売分析区分３に属する販売分析情報を、販売分析マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsAnly3(MCRow row) {
		MCList<MAM_SLS_ANLY_R> rslt = MCList.create(MAM_SLS_ANLY_R.class);
		MAM_SLS_ANLY_R dbc = MAM_SLS_ANLY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsAnly3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsAnly3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsAnly3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsAnly3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsAnly3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsAnly3_SubColumns(row, down);
	}
	/** 
	  * SlsAnly3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsAnly3_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsAnly3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsAnly3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsAnly3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ANLY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsAnly3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsAnly3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsAnly3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsAnly3Cols.outAll());
	}


	/** 
	  * PurcBizRsn:業務理由（仕入）<p>
	  * 仕入（経費含む）や入荷を計上するときに使用する理由情報を、業務理由マスタから取得する<br>
・経費購買のみに絞り込む場合は、xpns_purc_flgに「true」を指定する<br>
・経費購買以外に絞り込む場合は、not_xpns_purc_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPurcBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPurcBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PurcBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PurcBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPurcBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PurcBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPurcBizRsn_SubColumns(row, down);
	}
	/** 
	  * PurcBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPurcBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PurcBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PurcBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPurcBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PurcBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPurcBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPurcBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PurcBizRsnCols.outAll());
	}


	/** 
	  * PurcRtnBizRsn:業務理由（仕入返品）<p>
	  * 仕入返品（経費含む）や入荷返品を計上するときに使用する理由情報を、業務理由マスタから取得する<br>
・経費購買のみに絞り込む場合は、xpns_purc_flgに「true」を指定する<br>
・経費購買以外に絞り込む場合は、not_xpns_purc_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPurcRtnBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPurcRtnBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PurcRtnBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PurcRtnBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPurcRtnBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PurcRtnBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPurcRtnBizRsn_SubColumns(row, down);
	}
	/** 
	  * PurcRtnBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPurcRtnBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PurcRtnBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PurcRtnBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPurcRtnBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PurcRtnBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPurcRtnBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPurcRtnBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PurcRtnBizRsnCols.outAll());
	}


	/** 
	  * PurcDscntBizRsn:業務理由（仕入調整）<p>
	  * 仕入値引や仕入値増を計上するときに使用する理由情報を、業務理由マスタから取得する<br>
・仕入調整管轄区分で絞り込む場合は、purc_dscnt_loc_mng_typに管轄区分を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPurcDscntBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPurcDscntBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PurcDscntBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PurcDscntBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPurcDscntBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PurcDscntBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPurcDscntBizRsn_SubColumns(row, down);
	}
	/** 
	  * PurcDscntBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPurcDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PurcDscntBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PurcDscntBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPurcDscntBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PurcDscntBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPurcDscntBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPurcDscntBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PurcDscntBizRsnCols.outAll());
	}


	/** 
	  * SPurcDscntBizRsn:業務理由（生産資産仕入調整）<p>
	  * 生産資産に対する仕入値引や仕入値増を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSPurcDscntBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSPurcDscntBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SPurcDscntBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SPurcDscntBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSPurcDscntBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SPurcDscntBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSPurcDscntBizRsn_SubColumns(row, down);
	}
	/** 
	  * SPurcDscntBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSPurcDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SPurcDscntBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SPurcDscntBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSPurcDscntBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SPurcDscntBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSPurcDscntBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSPurcDscntBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SPurcDscntBizRsnCols.outAll());
	}


	/** 
	  * HPurcDscntBizRsn:業務理由（販売資産仕入調整）<p>
	  * 販売資産に対する仕入値引、仕入値増計上時に使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getHPurcDscntBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getHPurcDscntBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.HPurcDscntBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.HPurcDscntBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getHPurcDscntBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.HPurcDscntBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getHPurcDscntBizRsn_SubColumns(row, down);
	}
	/** 
	  * HPurcDscntBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getHPurcDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, HPurcDscntBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * HPurcDscntBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getHPurcDscntBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * HPurcDscntBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getHPurcDscntBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getHPurcDscntBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(HPurcDscntBizRsnCols.outAll());
	}


	/** 
	  * SlsBizRsn:業務理由（売上）<p>
	  * 売上（経費含む）や出荷の計上をするときに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsBizRsn_SubColumns(row, down);
	}
	/** 
	  * SlsBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsBizRsnCols.outAll());
	}


	/** 
	  * SlsRtnBizRsn:業務理由（売上返品）<p>
	  * 売上返品（経費含む）や出荷返品を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsRtnBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsRtnBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsRtnBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsRtnBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsRtnBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsRtnBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsRtnBizRsn_SubColumns(row, down);
	}
	/** 
	  * SlsRtnBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsRtnBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsRtnBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsRtnBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsRtnBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsRtnBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsRtnBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsRtnBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsRtnBizRsnCols.outAll());
	}


	/** 
	  * SlsDscntBizRsn:業務理由（売上調整）<p>
	  * 売上値引や売上返品を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsDscntBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsDscntBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsDscntBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsDscntBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsDscntBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsDscntBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsDscntBizRsn_SubColumns(row, down);
	}
	/** 
	  * SlsDscntBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsDscntBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsDscntBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsDscntBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsDscntBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsDscntBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsDscntBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsDscntBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsDscntBizRsnCols.outAll());
	}


	/** 
	  * AcxfrGrBizRsn:業務理由（他勘定入庫）<p>
	  * 他勘定入庫計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcxfrGrBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcxfrGrBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcxfrGrBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcxfrGrBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcxfrGrBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcxfrGrBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcxfrGrBizRsn_SubColumns(row, down);
	}
	/** 
	  * AcxfrGrBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcxfrGrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcxfrGrBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcxfrGrBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcxfrGrBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcxfrGrBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcxfrGrBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcxfrGrBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcxfrGrBizRsnCols.outAll());
	}


	/** 
	  * AcxfrGiBizRsn:業務理由（他勘定出庫）<p>
	  * 他勘定出庫を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcxfrGiBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcxfrGiBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcxfrGiBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcxfrGiBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcxfrGiBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcxfrGiBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcxfrGiBizRsn_SubColumns(row, down);
	}
	/** 
	  * AcxfrGiBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcxfrGiBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcxfrGiBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcxfrGiBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcxfrGiBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcxfrGiBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcxfrGiBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcxfrGiBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcxfrGiBizRsnCols.outAll());
	}


	/** 
	  * DispBizRsn:業務理由（廃棄）<p>
	  * 廃棄計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDispBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDispBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DispBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DispBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDispBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DispBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDispBizRsn_SubColumns(row, down);
	}
	/** 
	  * DispBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDispBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DispBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DispBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDispBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DispBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDispBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDispBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DispBizRsnCols.outAll());
	}


	/** 
	  * StkXfrBizRsn:業務理由（在庫振替）<p>
	  * 在庫振替計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStkXfrBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStkXfrBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.StkXfrBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.StkXfrBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStkXfrBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.StkXfrBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStkXfrBizRsn_SubColumns(row, down);
	}
	/** 
	  * StkXfrBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStkXfrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StkXfrBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StkXfrBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStkXfrBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StkXfrBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStkXfrBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStkXfrBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StkXfrBizRsnCols.outAll());
	}


	/** 
	  * XfrBizRsn:業務理由（移送）<p>
	  * 移送計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getXfrBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getXfrBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.XfrBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.XfrBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getXfrBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.XfrBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getXfrBizRsn_SubColumns(row, down);
	}
	/** 
	  * XfrBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getXfrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, XfrBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * XfrBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getXfrBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * XfrBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getXfrBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getXfrBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(XfrBizRsnCols.outAll());
	}


	/** 
	  * YieldBizRsn:業務理由（出来高）<p>
	  * 製造出来高計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getYieldBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getYieldBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.YieldBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.YieldBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getYieldBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.YieldBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getYieldBizRsn_SubColumns(row, down);
	}
	/** 
	  * YieldBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getYieldBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, YieldBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * YieldBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getYieldBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * YieldBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getYieldBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getYieldBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(YieldBizRsnCols.outAll());
	}


	/** 
	  * LossBizRsn:業務理由（ロス）<p>
	  * 投入ロスを計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLossBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLossBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LossBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LossBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLossBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LossBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLossBizRsn_SubColumns(row, down);
	}
	/** 
	  * LossBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLossBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LossBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LossBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLossBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LossBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLossBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLossBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LossBizRsnCols.outAll());
	}


	/** 
	  * DfctBizRsn:業務理由（検査不良）<p>
	  * 検査不良計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDfctBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDfctBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DfctBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DfctBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDfctBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DfctBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDfctBizRsn_SubColumns(row, down);
	}
	/** 
	  * DfctBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDfctBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DfctBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DfctBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDfctBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DfctBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDfctBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDfctBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DfctBizRsnCols.outAll());
	}


	/** 
	  * SloStkGd:格付（受注）<p>
	  * 見積、受注登録が可能な格付（出荷可能な格付）情報を、格付マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSloStkGd(MCRow row) {
		MCList<MAM_STK_GD_R> rslt = MCList.create(MAM_STK_GD_R.class);
		MAM_STK_GD_R dbc = MAM_STK_GD_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSloStkGd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SloStkGd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SloStkGd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSloStkGd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SloStkGd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSloStkGd_SubColumns(row, down);
	}
	/** 
	  * SloStkGd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSloStkGd_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SloStkGdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SloStkGd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSloStkGd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SloStkGd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSloStkGd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSloStkGd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SloStkGdCols.outAll());
	}


	/** 
	  * FeedStkGd:格付（投入引当対象）<p>
	  * 投入引当可能な格付情報を、格付マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getFeedStkGd(MCRow row) {
		MCList<MAM_STK_GD_R> rslt = MCList.create(MAM_STK_GD_R.class);
		MAM_STK_GD_R dbc = MAM_STK_GD_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getFeedStkGd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.FeedStkGd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.FeedStkGd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getFeedStkGd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.FeedStkGd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getFeedStkGd_SubColumns(row, down);
	}
	/** 
	  * FeedStkGd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getFeedStkGd_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, FeedStkGdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * FeedStkGd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getFeedStkGd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STK_GD_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * FeedStkGd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getFeedStkGd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getFeedStkGd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(FeedStkGdCols.outAll());
	}


	/** 
	  * SlsWg:ワーキンググループ（販売）<p>
	  * 販売機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsWg_SubColumns(row, down);
	}
	/** 
	  * SlsWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsWgCols.outAll());
	}


	/** 
	  * LgWg:ワーキンググループ（物流）<p>
	  * 物流機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgWg_SubColumns(row, down);
	}
	/** 
	  * LgWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgWgCols.outAll());
	}


	/** 
	  * MfgWg:ワーキンググループ（製造）<p>
	  * 製造機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getMfgWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getMfgWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.MfgWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.MfgWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getMfgWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.MfgWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getMfgWg_SubColumns(row, down);
	}
	/** 
	  * MfgWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getMfgWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, MfgWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * MfgWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getMfgWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * MfgWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getMfgWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getMfgWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(MfgWgCols.outAll());
	}


	/** 
	  * PurcWg:ワーキンググループ（購買）<p>
	  * 購買機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPurcWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPurcWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PurcWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PurcWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPurcWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PurcWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPurcWg_SubColumns(row, down);
	}
	/** 
	  * PurcWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPurcWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PurcWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PurcWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPurcWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PurcWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPurcWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPurcWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PurcWgCols.outAll());
	}


	/** 
	  * ArWg:ワーキンググループ（債権）<p>
	  * 債権機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ArWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ArWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ArWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArWg_SubColumns(row, down);
	}
	/** 
	  * ArWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ArWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ArWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ArWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ArWgCols.outAll());
	}


	/** 
	  * ApWg:ワーキンググループ（債務）<p>
	  * 債務機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getApWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getApWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ApWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ApWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getApWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ApWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getApWg_SubColumns(row, down);
	}
	/** 
	  * ApWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getApWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ApWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ApWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getApWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ApWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getApWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getApWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ApWgCols.outAll());
	}


	/** 
	  * SdWg:ワーキンググループ（需給）<p>
	  * 需給機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSdWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSdWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SdWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SdWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSdWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SdWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSdWg_SubColumns(row, down);
	}
	/** 
	  * SdWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSdWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SdWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SdWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSdWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SdWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSdWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSdWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SdWgCols.outAll());
	}


	/** 
	  * IntBankAc:社内口座<p>
	  * 口座マスタから社内口座情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getIntBankAc(MCRow row) {
		MCList<MAM_BANK_AC_R> rslt = MCList.create(MAM_BANK_AC_R.class);
		MAM_BANK_AC_R dbc = MAM_BANK_AC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getIntBankAc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.IntBankAc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.IntBankAc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getIntBankAc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.IntBankAc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getIntBankAc_SubColumns(row, down);
	}
	/** 
	  * IntBankAc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getIntBankAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, IntBankAcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * IntBankAc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getIntBankAc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * IntBankAc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getIntBankAc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getIntBankAc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(IntBankAcCols.outAll());
	}


	/** 
	  * ExtBankAc:社外口座<p>
	  * 口座マスタから社外口座情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExtBankAc(MCRow row) {
		MCList<MAM_BANK_AC_R> rslt = MCList.create(MAM_BANK_AC_R.class);
		MAM_BANK_AC_R dbc = MAM_BANK_AC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExtBankAc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExtBankAc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExtBankAc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExtBankAc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExtBankAc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExtBankAc_SubColumns(row, down);
	}
	/** 
	  * ExtBankAc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExtBankAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExtBankAcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExtBankAc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExtBankAc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BANK_AC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExtBankAc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExtBankAc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExtBankAc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExtBankAcCols.outAll());
	}


	/** 
	  * CostSls:原価売上分類<p>
	  * 引数の売上分類区分に対応する原価売上分類情報を、原価売上分類マスタから取得する<br>

	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostSls(MCRow row) {
		MCList<MAM_COST_SLS_R> rslt = MCList.create(MAM_COST_SLS_R.class);
		MAM_COST_SLS_R dbc = MAM_COST_SLS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostSls_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostSls");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostSls").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostSls_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostSls");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostSls_SubColumns(row, down);
	}
	/** 
	  * CostSls:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostSls_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostSlsCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostSls:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostSls_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostSls:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostSls_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostSls_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostSlsCols.outAll());
	}


	/** 
	  * CostSls1:原価売上分類（区分１）<p>
	  * 売上分類区分１に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostSls1(MCRow row) {
		MCList<MAM_COST_SLS_R> rslt = MCList.create(MAM_COST_SLS_R.class);
		MAM_COST_SLS_R dbc = MAM_COST_SLS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostSls1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostSls1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostSls1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostSls1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostSls1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostSls1_SubColumns(row, down);
	}
	/** 
	  * CostSls1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostSls1_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostSls1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostSls1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostSls1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostSls1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostSls1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostSls1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostSls1Cols.outAll());
	}


	/** 
	  * CostSls2:原価売上分類（区分２）<p>
	  * 売上分類区分２に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostSls2(MCRow row) {
		MCList<MAM_COST_SLS_R> rslt = MCList.create(MAM_COST_SLS_R.class);
		MAM_COST_SLS_R dbc = MAM_COST_SLS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostSls2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostSls2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostSls2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostSls2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostSls2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostSls2_SubColumns(row, down);
	}
	/** 
	  * CostSls2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostSls2_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostSls2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostSls2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostSls2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostSls2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostSls2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostSls2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostSls2Cols.outAll());
	}


	/** 
	  * CostSls3:原価売上分類（区分３）<p>
	  * 売上分類区分３に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostSls3(MCRow row) {
		MCList<MAM_COST_SLS_R> rslt = MCList.create(MAM_COST_SLS_R.class);
		MAM_COST_SLS_R dbc = MAM_COST_SLS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostSls3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostSls3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostSls3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostSls3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostSls3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostSls3_SubColumns(row, down);
	}
	/** 
	  * CostSls3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostSls3_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostSls3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostSls3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostSls3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostSls3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostSls3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostSls3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostSls3Cols.outAll());
	}


	/** 
	  * CostSls4:原価売上分類（区分４）<p>
	  * 売上分類区分４に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostSls4(MCRow row) {
		MCList<MAM_COST_SLS_R> rslt = MCList.create(MAM_COST_SLS_R.class);
		MAM_COST_SLS_R dbc = MAM_COST_SLS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostSls4_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostSls4");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostSls4").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostSls4_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostSls4");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostSls4_SubColumns(row, down);
	}
	/** 
	  * CostSls4:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostSls4_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostSls4Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostSls4:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostSls4_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostSls4:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostSls4_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostSls4_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostSls4Cols.outAll());
	}


	/** 
	  * CostSls5:原価売上分類（区分５）<p>
	  * 売上分類区分５に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostSls5(MCRow row) {
		MCList<MAM_COST_SLS_R> rslt = MCList.create(MAM_COST_SLS_R.class);
		MAM_COST_SLS_R dbc = MAM_COST_SLS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostSls5_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostSls5");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostSls5").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostSls5_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostSls5");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostSls5_SubColumns(row, down);
	}
	/** 
	  * CostSls5:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostSls5_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostSls5Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostSls5:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostSls5_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostSls5:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostSls5_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostSls5_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostSls5Cols.outAll());
	}


	/** 
	  * GpAlc:汎用配賦分類<p>
	  * 汎用配賦分類マスタから汎用配賦情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getGpAlc(MCRow row) {
		MCList<MAM_GP_ALC_R> rslt = MCList.create(MAM_GP_ALC_R.class);
		MAM_GP_ALC_R dbc = MAM_GP_ALC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getGpAlc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.GpAlc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.GpAlc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getGpAlc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.GpAlc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getGpAlc_SubColumns(row, down);
	}
	/** 
	  * GpAlc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getGpAlc_Set(MCRow row, MCQueryApiBuilder builder, MAM_GP_ALC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, GpAlcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * GpAlc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getGpAlc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_GP_ALC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * GpAlc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getGpAlc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getGpAlc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(GpAlcCols.outAll());
	}


	/** 
	  * Sttl:決済方法<p>
	  * 債権債務機能で使用する決済方法（現金や振込など）の情報を、決済方法マスタから取得する<br>
・税ＣＤを取得する場合は、dtに適用日を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSttl(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSttl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Sttl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Sttl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSttl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Sttl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSttl_SubColumns(row, down);
	}
	/** 
	  * Sttl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSttl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SttlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Sttl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSttl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Sttl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSttl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSttl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SttlCols.outAll());
	}


	/** 
	  * ArSttlSetoffDrWtax:債権決済方法（相殺（借方）・源泉税）<p>
	  * 債権債務機能で使用する決済方法（相殺（借方）、源泉税）情報を、決済方法マスタから取得する<br>
・税ＣＤを取得する場合は、dtに適用日を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArSttlSetoffDrWtax(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArSttlSetoffDrWtax_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ArSttlSetoffDrWtax");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ArSttlSetoffDrWtax").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArSttlSetoffDrWtax_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ArSttlSetoffDrWtax");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArSttlSetoffDrWtax_SubColumns(row, down);
	}
	/** 
	  * ArSttlSetoffDrWtax:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArSttlSetoffDrWtax_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ArSttlSetoffDrWtaxCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ArSttlSetoffDrWtax:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArSttlSetoffDrWtax_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ArSttlSetoffDrWtax:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArSttlSetoffDrWtax_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArSttlSetoffDrWtax_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ArSttlSetoffDrWtaxCols.outAll());
	}


	/** 
	  * PreAlcPtn:一次配賦パタン<p>
	  * 一次配賦パタンマスタから一次配賦パタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcPtn(MCRow row) {
		MCList<MAM_PRE_ALC_PTN_R> rslt = MCList.create(MAM_PRE_ALC_PTN_R.class);
		MAM_PRE_ALC_PTN_R dbc = MAM_PRE_ALC_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PreAlcPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PreAlcPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PreAlcPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcPtn_SubColumns(row, down);
	}
	/** 
	  * PreAlcPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcPtnCols.outAll());
	}


	/** 
	  * AlcCoef:配賦係数<p>
	  * 配賦係数マスタから配賦係数情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcCoef(MCRow row) {
		MCList<MAM_ALC_COEF_R> rslt = MCList.create(MAM_ALC_COEF_R.class);
		MAM_ALC_COEF_R dbc = MAM_ALC_COEF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcCoef_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcCoef");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcCoef").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcCoef_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcCoef");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcCoef_SubColumns(row, down);
	}
	/** 
	  * AlcCoef:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcCoef_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_COEF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcCoefCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcCoef:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcCoef_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_COEF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcCoef:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcCoef_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcCoef_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcCoefCols.outAll());
	}


	/** 
	  * CostDpt:原価部門<p>
	  * 原価部門マスタから原価部門情報を取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する<br>
・適用年月で絞り込む場合は、以下の設定をする<br>
　　適用年月を指定する場合：ymに期を指定する（mode_this_month_flgは無効になる）<br>
　　運用年月を使用する場合：ymを未指定にし、mode_this_month_flgに「true」を指定する<br>
　　※いずれの場合も、ymに「null」を指定した場合は「null」を返す<br>
・適用年月で絞り込まない場合は、ignore_ym_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostDpt(MCRow row) {
		MCList<MAM_COST_DPT_R> rslt = MCList.create(MAM_COST_DPT_R.class);
		MAM_COST_DPT_R dbc = MAM_COST_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostDpt_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostDpt");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostDpt").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostDpt_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostDpt");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostDpt_SubColumns(row, down);
	}
	/** 
	  * CostDpt:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostDpt_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostDptCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostDpt:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostDpt_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostDpt:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostDpt_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostDpt_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostDptCols.outAll());
	}


	/** 
	  * PreAlcDpt:配賦先部門パタン（全部）<p>
	  * 一次配賦先部門マスタから期と配賦先部門パタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcDpt(MCRow row) {
		MCList<MAM_PRE_ALC_DPT_R> rslt = MCList.create(MAM_PRE_ALC_DPT_R.class);
		MAM_PRE_ALC_DPT_R dbc = MAM_PRE_ALC_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcDpt_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PreAlcDpt");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PreAlcDpt").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcDpt_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PreAlcDpt");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcDpt_SubColumns(row, down);
	}
	/** 
	  * PreAlcDpt:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcDpt_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcDptCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcDpt:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcDpt_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcDpt:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcDpt_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcDpt_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcDptCols.outAll());
	}


	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:配賦方法_配賦パタン（費目別原価または利益）<p>
	  * 配賦方法区分に「4:費目別原価」または「5:利益」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsExpnsCostOrProfit(MCRow row) {
		MCList<MAM_ALC_RULE_R> rslt = MCList.create(MAM_ALC_RULE_R.class);
		MAM_ALC_RULE_R dbc = MAM_ALC_RULE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcRuleAlcPtnAsExpnsCostOrProfit_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcRuleAlcPtnAsExpnsCostOrProfit");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcRuleAlcPtnAsExpnsCostOrProfit").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcRuleAlcPtnAsExpnsCostOrProfit_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcRuleAlcPtnAsExpnsCostOrProfit");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcRuleAlcPtnAsExpnsCostOrProfit_SubColumns(row, down);
	}
	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcRuleAlcPtnAsExpnsCostOrProfit_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcRuleAlcPtnAsExpnsCostOrProfitCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcRuleAlcPtnAsExpnsCostOrProfit_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcRuleAlcPtnAsExpnsCostOrProfit_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcRuleAlcPtnAsExpnsCostOrProfit_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcRuleAlcPtnAsExpnsCostOrProfitCols.outAll());
	}


	/** 
	  * PreAlcRate:一次配賦基準<p>
	  * 一次配賦基準マスタから一次配賦基準情報を取得する<br>
一次配賦パタンＣＤに「null」を指定した場合は「null」を返す<br>
一次配賦パタンＣＤが未指定の場合は、検索条件としては無効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRate(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRate_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PreAlcRate");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PreAlcRate").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRate_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PreAlcRate");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRate_SubColumns(row, down);
	}
	/** 
	  * PreAlcRate:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRate_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRate:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRate_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRate:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRate_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRate_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateCols.outAll());
	}


	/** 
	  * PreAlcRateInPreAlcCtg:一次配賦基準（一次配賦基準カテゴリ登録済）<p>
	  * 一次配賦基準マスタから一次配賦基準を取得する<br>
一次配賦基準カテゴリマスタにも存在するもののみ取得する<br>
・計画月次比率で絞り込む場合は、pln_mly_flg_strに「true」を指定する（「false」は無効）<br>
・実績月次比率で絞り込む場合は、act_mly_flg_strに「true」を指定する（「false」は無効）<br>
・上記の条件をor条件で絞り込む場合は、or_flg_strに「true」を指定する<br>
　※or_flg_strは、pln_mly_flg_strとact_mly_flg_strの両方とも「true」の場合のみ有効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRateInPreAlcCtg(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRateInPreAlcCtg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PreAlcRateInPreAlcCtg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PreAlcRateInPreAlcCtg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRateInPreAlcCtg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PreAlcRateInPreAlcCtg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRateInPreAlcCtg_SubColumns(row, down);
	}
	/** 
	  * PreAlcRateInPreAlcCtg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRateInPreAlcCtg_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateInPreAlcCtgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRateInPreAlcCtg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRateInPreAlcCtg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRateInPreAlcCtg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRateInPreAlcCtg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRateInPreAlcCtg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateInPreAlcCtgCols.outAll());
	}


	/** 
	  * PreAlcRateNotPreAlcPtn:一次配賦基準（月次比率絞り込み）<p>
	  * 一次配賦基準マスタから一次配賦基準を取得する<br>
・計画月次比率で絞り込む場合は、pln_mly_flg_strに「true」を指定する（「false」は無効）<br>
・実績月次比率で絞り込む場合は、act_mly_flg_strに「true」を指定する（「false」は無効）<br>
・上記の条件をor条件で絞り込む場合は、or_flg_strに「true」を指定する<br>
　※or_flg_strは、pln_mly_flg_strとact_mly_flg_strの両方とも「true」の場合のみ有効<br>

	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcRateNotPreAlcPtn(MCRow row) {
		MCList<MAM_PRE_ALC_RATE_R> rslt = MCList.create(MAM_PRE_ALC_RATE_R.class);
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcRateNotPreAlcPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PreAlcRateNotPreAlcPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PreAlcRateNotPreAlcPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcRateNotPreAlcPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PreAlcRateNotPreAlcPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcRateNotPreAlcPtn_SubColumns(row, down);
	}
	/** 
	  * PreAlcRateNotPreAlcPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcRateNotPreAlcPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcRateNotPreAlcPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcRateNotPreAlcPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcRateNotPreAlcPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_RATE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcRateNotPreAlcPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcRateNotPreAlcPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcRateNotPreAlcPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcRateNotPreAlcPtnCols.outAll());
	}


	/** 
	  * CostCtg:原価品群<p>
	  * 原価品群マスタから原価品群情報を取得する<br>
品群構成区分に「null」を指定した場合は「null」を返す<br>
品群構成区分が未指定の場合は、検索条件としては無効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostCtg(MCRow row) {
		MCList<MAM_COST_CTG_R> rslt = MCList.create(MAM_COST_CTG_R.class);
		MAM_COST_CTG_R dbc = MAM_COST_CTG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostCtg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostCtg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostCtg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostCtg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostCtg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostCtg_SubColumns(row, down);
	}
	/** 
	  * CostCtg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostCtg_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_CTG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostCtgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostCtg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostCtg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_CTG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostCtg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostCtg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostCtg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostCtgCols.outAll());
	}


	/** 
	  * DptBase:部門（基本）<p>
	  * 部門基本マスタから部門のコードと名称を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDptBase(MCRow row) {
		MCList<MAM_DPT_BASE_R> rslt = MCList.create(MAM_DPT_BASE_R.class);
		MAM_DPT_BASE_R dbc = MAM_DPT_BASE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDptBase_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DptBase");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DptBase").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDptBase_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DptBase");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDptBase_SubColumns(row, down);
	}
	/** 
	  * DptBase:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDptBase_Set(MCRow row, MCQueryApiBuilder builder, MAM_DPT_BASE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DptBaseCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DptBase:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDptBase_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_DPT_BASE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DptBase:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDptBase_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDptBase_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DptBaseCols.outAll());
	}


	/** 
	  * DptHis:組織変更履歴<p>
	  * 組織変更履歴マスタから履歴情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDptHis(MCRow row) {
		MCList<MAM_DPT_HIS_R> rslt = MCList.create(MAM_DPT_HIS_R.class);
		MAM_DPT_HIS_R dbc = MAM_DPT_HIS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDptHis_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DptHis");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DptHis").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDptHis_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DptHis");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDptHis_SubColumns(row, down);
	}
	/** 
	  * DptHis:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDptHis_Set(MCRow row, MCQueryApiBuilder builder, MAM_DPT_HIS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DptHisCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DptHis:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDptHis_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_DPT_HIS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DptHis:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDptHis_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDptHis_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DptHisCols.outAll());
	}


	/** 
	  * AlcCoefAsConfig:配賦係数（配賦係数構成マスタ）<p>
	  * 配賦係数構成区分に「1:配賦係数構成マスタ」が設定されている配賦係数情報を、配賦方法マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcCoefAsConfig(MCRow row) {
		MCList<MAM_ALC_COEF_R> rslt = MCList.create(MAM_ALC_COEF_R.class);
		MAM_ALC_COEF_R dbc = MAM_ALC_COEF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcCoefAsConfig_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcCoefAsConfig");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcCoefAsConfig").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcCoefAsConfig_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcCoefAsConfig");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcCoefAsConfig_SubColumns(row, down);
	}
	/** 
	  * AlcCoefAsConfig:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcCoefAsConfig_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_COEF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcCoefAsConfigCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcCoefAsConfig:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcCoefAsConfig_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_COEF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcCoefAsConfig:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcCoefAsConfig_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcCoefAsConfig_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcCoefAsConfigCols.outAll());
	}


	/** 
	  * AlcCoefAsNotConfig:配賦係数（配賦係数構成マスタ以外）<p>
	  * 配賦係数構成区分に「1:配賦係数構成マスタ」以外が設定されている配賦係数情報を、配賦方法マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcCoefAsNotConfig(MCRow row) {
		MCList<MAM_ALC_COEF_R> rslt = MCList.create(MAM_ALC_COEF_R.class);
		MAM_ALC_COEF_R dbc = MAM_ALC_COEF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcCoefAsNotConfig_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcCoefAsNotConfig");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcCoefAsNotConfig").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcCoefAsNotConfig_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcCoefAsNotConfig");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcCoefAsNotConfig_SubColumns(row, down);
	}
	/** 
	  * AlcCoefAsNotConfig:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcCoefAsNotConfig_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_COEF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcCoefAsNotConfigCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcCoefAsNotConfig:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcCoefAsNotConfig_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_COEF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcCoefAsNotConfig:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcCoefAsNotConfig_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcCoefAsNotConfig_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcCoefAsNotConfigCols.outAll());
	}


	/** 
	  * DptAlcGrp:部門配賦グループ<p>
	  * 原価部門マスタから部門配賦グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDptAlcGrp(MCRow row) {
		MCList<MAM_COST_DPT_R> rslt = MCList.create(MAM_COST_DPT_R.class);
		MAM_COST_DPT_R dbc = MAM_COST_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDptAlcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DptAlcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DptAlcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDptAlcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DptAlcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDptAlcGrp_SubColumns(row, down);
	}
	/** 
	  * DptAlcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDptAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DptAlcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DptAlcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDptAlcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DptAlcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDptAlcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDptAlcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DptAlcGrpCols.outAll());
	}


	/** 
	  * LocAlcGrp:場所配賦グループ<p>
	  * 場所マスタから場所配賦グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLocAlcGrp(MCRow row) {
		MCList<MAM_LOC_R> rslt = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R dbc = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLocAlcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LocAlcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LocAlcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLocAlcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LocAlcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLocAlcGrp_SubColumns(row, down);
	}
	/** 
	  * LocAlcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLocAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LocAlcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LocAlcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLocAlcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LocAlcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLocAlcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLocAlcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LocAlcGrpCols.outAll());
	}


	/** 
	  * OperAlcGrp:工程配賦グループ<p>
	  * 工程マスタから工程配賦グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getOperAlcGrp(MCRow row) {
		MCList<MAM_OPER_R> rslt = MCList.create(MAM_OPER_R.class);
		MAM_OPER_R dbc = MAM_OPER_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getOperAlcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.OperAlcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.OperAlcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getOperAlcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.OperAlcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getOperAlcGrp_SubColumns(row, down);
	}
	/** 
	  * OperAlcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getOperAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_OPER_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, OperAlcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * OperAlcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getOperAlcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_OPER_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * OperAlcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getOperAlcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getOperAlcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(OperAlcGrpCols.outAll());
	}


	/** 
	  * BpAlcGrp:取引先配賦グループ<p>
	  * 取引先マスタから取引先配賦グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpAlcGrp(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpAlcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpAlcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpAlcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpAlcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpAlcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpAlcGrp_SubColumns(row, down);
	}
	/** 
	  * BpAlcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpAlcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpAlcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpAlcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpAlcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpAlcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpAlcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpAlcGrpCols.outAll());
	}


	/** 
	  * CtgAlcGrp:品群配賦グループ<p>
	  * 原価品群マスタから品群配賦グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCtgAlcGrp(MCRow row) {
		MCList<MAM_COST_CTG_R> rslt = MCList.create(MAM_COST_CTG_R.class);
		MAM_COST_CTG_R dbc = MAM_COST_CTG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCtgAlcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CtgAlcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CtgAlcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCtgAlcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CtgAlcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCtgAlcGrp_SubColumns(row, down);
	}
	/** 
	  * CtgAlcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCtgAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_CTG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CtgAlcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CtgAlcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCtgAlcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_CTG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CtgAlcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCtgAlcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCtgAlcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CtgAlcGrpCols.outAll());
	}


	/** 
	  * ItmAlcGrp:品目配賦グループ<p>
	  * 品目マスタから品目配賦グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmAlcGrp(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmAlcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmAlcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmAlcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmAlcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmAlcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmAlcGrp_SubColumns(row, down);
	}
	/** 
	  * ItmAlcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmAlcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmAlcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmAlcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmAlcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmAlcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmAlcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmAlcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmAlcGrpCols.outAll());
	}


	/** 
	  * RptCmpPtn:原価レポート比較パタン<p>
	  * 原価レポート比較マスタから比較パタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptCmpPtn(MCRow row) {
		MCList<MAM_RPT_CMP_R> rslt = MCList.create(MAM_RPT_CMP_R.class);
		MAM_RPT_CMP_R dbc = MAM_RPT_CMP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptCmpPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptCmpPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptCmpPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptCmpPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptCmpPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptCmpPtn_SubColumns(row, down);
	}
	/** 
	  * RptCmpPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptCmpPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptCmpPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptCmpPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptCmpPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptCmpPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptCmpPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptCmpPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptCmpPtnCols.outAll());
	}


	/** 
	  * RptCmpCol:原価レポート比較項目<p>
	  * 原価レポート比較構成マスタから項目情報を全件取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptCmpCol(MCRow row) {
		MCList<MAM_RPT_CMP_CONF_R> rslt = MCList.create(MAM_RPT_CMP_CONF_R.class);
		MAM_RPT_CMP_CONF_R dbc = MAM_RPT_CMP_CONF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptCmpCol_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptCmpCol");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptCmpCol").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptCmpCol_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptCmpCol");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptCmpCol_SubColumns(row, down);
	}
	/** 
	  * RptCmpCol:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptCmpCol_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_CONF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptCmpColCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptCmpCol:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptCmpCol_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_CONF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptCmpCol:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptCmpCol_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptCmpCol_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptCmpColCols.outAll());
	}


	/** 
	  * CalcGrpRptCmpConf:計算グループ（原価レポート比較構成マスタ）<p>
	  * 計算グループ情報を計算グループレポートマスタから取得する<br>
原価レポート比較マスタに存在するものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCalcGrpRptCmpConf(MCRow row) {
		MCList<MAM_CALC_GRP_R> rslt = MCList.create(MAM_CALC_GRP_R.class);
		MAM_CALC_GRP_R dbc = MAM_CALC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCalcGrpRptCmpConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CalcGrpRptCmpConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CalcGrpRptCmpConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCalcGrpRptCmpConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CalcGrpRptCmpConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCalcGrpRptCmpConf_SubColumns(row, down);
	}
	/** 
	  * CalcGrpRptCmpConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCalcGrpRptCmpConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CalcGrpRptCmpConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CalcGrpRptCmpConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCalcGrpRptCmpConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CalcGrpRptCmpConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCalcGrpRptCmpConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCalcGrpRptCmpConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CalcGrpRptCmpConfCols.outAll());
	}


	/** 
	  * ColCmpPtnRptCmpConf:項目（原価レポート比較集計マスタ）<p>
	  * 原価レポート比較構成マスタから項目情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getColCmpPtnRptCmpConf(MCRow row) {
		MCList<MAM_RPT_CMP_CONF_R> rslt = MCList.create(MAM_RPT_CMP_CONF_R.class);
		MAM_RPT_CMP_CONF_R dbc = MAM_RPT_CMP_CONF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getColCmpPtnRptCmpConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ColCmpPtnRptCmpConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ColCmpPtnRptCmpConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getColCmpPtnRptCmpConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ColCmpPtnRptCmpConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getColCmpPtnRptCmpConf_SubColumns(row, down);
	}
	/** 
	  * ColCmpPtnRptCmpConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getColCmpPtnRptCmpConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_CONF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ColCmpPtnRptCmpConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ColCmpPtnRptCmpConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getColCmpPtnRptCmpConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CMP_CONF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ColCmpPtnRptCmpConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getColCmpPtnRptCmpConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getColCmpPtnRptCmpConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ColCmpPtnRptCmpConfCols.outAll());
	}


	/** 
	  * RptPtn:原価レポートパタン<p>
	  * 原価レポートパタンマスタからレポートパタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptPtn(MCRow row) {
		MCList<MAM_RPT_PTN_R> rslt = MCList.create(MAM_RPT_PTN_R.class);
		MAM_RPT_PTN_R dbc = MAM_RPT_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptPtn_SubColumns(row, down);
	}
	/** 
	  * RptPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptPtnCols.outAll());
	}


	/** 
	  * LgOrMfgWg:ワーキンググループ（物流または製造）<p>
	  * 物流または製造機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgOrMfgWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgOrMfgWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgOrMfgWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgOrMfgWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgOrMfgWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgOrMfgWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgOrMfgWg_SubColumns(row, down);
	}
	/** 
	  * LgOrMfgWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgOrMfgWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgOrMfgWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgOrMfgWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgOrMfgWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgOrMfgWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgOrMfgWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgOrMfgWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgOrMfgWgCols.outAll());
	}


	/** 
	  * LgGrpForLoc:物流グループ（場所設定可）<p>
	  * 場所設定が可能な物流グループ情報を、物流グループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・ワーキンググループで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgGrpForLoc(MCRow row) {
		MCList<MAM_LG_GRP_R> rslt = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R dbc = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgGrpForLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgGrpForLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgGrpForLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgGrpForLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgGrpForLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgGrpForLoc_SubColumns(row, down);
	}
	/** 
	  * LgGrpForLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgGrpForLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgGrpForLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgGrpForLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgGrpForLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgGrpForLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgGrpForLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgGrpForLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgGrpForLocCols.outAll());
	}


	/** 
	  * RptKey:原価レポートキー<p>
	  * 原価レポートキーマスタから原価レポートキー情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptKey(MCRow row) {
		MCList<MAM_RPT_KEY_R> rslt = MCList.create(MAM_RPT_KEY_R.class);
		MAM_RPT_KEY_R dbc = MAM_RPT_KEY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptKey_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptKey");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptKey").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptKey_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptKey");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptKey_SubColumns(row, down);
	}
	/** 
	  * RptKey:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptKey_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptKeyCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptKey:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptKey_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptKey:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptKey_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptKey_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptKeyCols.outAll());
	}


	/** 
	  * RptKeyWithTyp:原価レポートキー（区分も表示）<p>
	  * レポートキー区分を含む原価レポートキー情報を、原価レポートキーマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptKeyWithTyp(MCRow row) {
		MCList<MAM_RPT_KEY_R> rslt = MCList.create(MAM_RPT_KEY_R.class);
		MAM_RPT_KEY_R dbc = MAM_RPT_KEY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptKeyWithTyp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptKeyWithTyp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptKeyWithTyp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptKeyWithTyp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptKeyWithTyp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptKeyWithTyp_SubColumns(row, down);
	}
	/** 
	  * RptKeyWithTyp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptKeyWithTyp_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptKeyWithTypCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptKeyWithTyp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptKeyWithTyp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptKeyWithTyp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptKeyWithTyp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptKeyWithTyp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptKeyWithTypCols.outAll());
	}


	/** 
	  * RptRow:原価レポート行<p>
	  * 原価レポート構成マスタからレポート行情報を取得する<br>
引数のレポートパタンＣＤに「null」を指定した場合は「null」を返す<br>

	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptRow(MCRow row) {
		MCList<MAM_RPT_CONF_R> rslt = MCList.create(MAM_RPT_CONF_R.class);
		MAM_RPT_CONF_R dbc = MAM_RPT_CONF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptRow_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptRow");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptRow").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptRow_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptRow");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptRow_SubColumns(row, down);
	}
	/** 
	  * RptRow:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptRow_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CONF_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptRowCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptRow:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptRow_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_CONF_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptRow:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptRow_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptRow_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptRowCols.outAll());
	}


	/** 
	  * CostCalcGrp:計算グループ（原価計算）<p>
	  * 計算区分に「2：原価計算（在庫対象外）」または「3：原価計算（在庫計算）」が設定されている計算グループ情報を、計算グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostCalcGrp(MCRow row) {
		MCList<MAM_CALC_GRP_R> rslt = MCList.create(MAM_CALC_GRP_R.class);
		MAM_CALC_GRP_R dbc = MAM_CALC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostCalcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostCalcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostCalcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostCalcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostCalcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostCalcGrp_SubColumns(row, down);
	}
	/** 
	  * CostCalcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostCalcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostCalcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostCalcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostCalcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostCalcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostCalcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostCalcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostCalcGrpCols.outAll());
	}


	/** 
	  * SlsItmGrpBtm:品目体系（最下層）<p>
	  * 販売品目体系マスタから品目体系情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsItmGrpBtm(MCRow row) {
		MCList<MAM_SLS_ITM_GRP_R> rslt = MCList.create(MAM_SLS_ITM_GRP_R.class);
		MAM_SLS_ITM_GRP_R dbc = MAM_SLS_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsItmGrpBtm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsItmGrpBtm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsItmGrpBtm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsItmGrpBtm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsItmGrpBtm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsItmGrpBtm_SubColumns(row, down);
	}
	/** 
	  * SlsItmGrpBtm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsItmGrpBtm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsItmGrpBtmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsItmGrpBtm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsItmGrpBtm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsItmGrpBtm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsItmGrpBtm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsItmGrpBtm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsItmGrpBtmCols.outAll());
	}


	/** 
	  * ArSttl:債権決済方法<p>
	  * 債権に関する決済方法情報を、決済方法マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArSttl(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArSttl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ArSttl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ArSttl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArSttl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ArSttl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArSttl_SubColumns(row, down);
	}
	/** 
	  * ArSttl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArSttl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ArSttlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ArSttl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArSttl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ArSttl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArSttl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArSttl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ArSttlCols.outAll());
	}


	/** 
	  * InspPoint:検査項目<p>
	  * 検査項目マスタから検査項目情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getInspPoint(MCRow row) {
		MCList<MAM_INSP_POINT_R> rslt = MCList.create(MAM_INSP_POINT_R.class);
		MAM_INSP_POINT_R dbc = MAM_INSP_POINT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getInspPoint_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.InspPoint");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.InspPoint").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getInspPoint_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.InspPoint");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getInspPoint_SubColumns(row, down);
	}
	/** 
	  * InspPoint:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getInspPoint_Set(MCRow row, MCQueryApiBuilder builder, MAM_INSP_POINT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, InspPointCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * InspPoint:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getInspPoint_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_INSP_POINT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * InspPoint:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getInspPoint_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getInspPoint_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(InspPointCols.outAll());
	}


	/** 
	  * ItmSub1:枝番１<p>
	  * 以下の引数に対応する枝番１および品目情報を、品目マスタから取得する<br>
　品目、検索区分（品目入力補助検索区分）<br>
マスタ画面以外では使用できない<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmSub1(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmSub1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmSub1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmSub1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmSub1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmSub1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmSub1_SubColumns(row, down);
	}
	/** 
	  * ItmSub1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmSub1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmSub1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmSub1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmSub1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmSub1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmSub1Cols.outAll());
	}


	/** 
	  * ItmSub2:枝番２<p>
	  * 以下の引数に対応する枝番２および品目情報を、品目マスタから取得する<br>
　品目、枝番１、検索区分（品目入力補助検索区分）<br>
マスタ画面以外では使用できない<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmSub2(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmSub2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmSub2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmSub2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmSub2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmSub2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmSub2_SubColumns(row, down);
	}
	/** 
	  * ItmSub2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmSub2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmSub2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmSub2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmSub2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmSub2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmSub2Cols.outAll());
	}


	/** 
	  * ItmSub3:枝番３<p>
	  * 以下の引数に対応する枝番３および品目情報を、品目マスタから取得する<br>
　品目、枝番１、枝番２、検索区分（品目入力補助検索区分）<br>
マスタ画面以外では使用できない<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmSub3(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmSub3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmSub3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmSub3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmSub3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmSub3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmSub3_SubColumns(row, down);
	}
	/** 
	  * ItmSub3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmSub3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmSub3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmSub3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmSub3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmSub3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmSub3Cols.outAll());
	}


	/** 
	  * PreAlcDptInTerm:配賦先部門パタン（期ごと）<p>
	  * 引数の期に対応する配賦先部門パタン情報を、一次配賦先部門マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPreAlcDptInTerm(MCRow row) {
		MCList<MAM_PRE_ALC_DPT_R> rslt = MCList.create(MAM_PRE_ALC_DPT_R.class);
		MAM_PRE_ALC_DPT_R dbc = MAM_PRE_ALC_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPreAlcDptInTerm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PreAlcDptInTerm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PreAlcDptInTerm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPreAlcDptInTerm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PreAlcDptInTerm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPreAlcDptInTerm_SubColumns(row, down);
	}
	/** 
	  * PreAlcDptInTerm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPreAlcDptInTerm_Set(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PreAlcDptInTermCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PreAlcDptInTerm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPreAlcDptInTerm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_PRE_ALC_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PreAlcDptInTerm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPreAlcDptInTerm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPreAlcDptInTerm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PreAlcDptInTermCols.outAll());
	}


	/** 
	  * RptKeyWithTypNotInRptKeyConf:原価レポートキー（レポートキー構成未登録）<p>
	  * 原価レポートキー構成マスタに未登録のレポートキー情報を、原価レポートキーマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptKeyWithTypNotInRptKeyConf(MCRow row) {
		MCList<MAM_RPT_KEY_R> rslt = MCList.create(MAM_RPT_KEY_R.class);
		MAM_RPT_KEY_R dbc = MAM_RPT_KEY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptKeyWithTypNotInRptKeyConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptKeyWithTypNotInRptKeyConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptKeyWithTypNotInRptKeyConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptKeyWithTypNotInRptKeyConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptKeyWithTypNotInRptKeyConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptKeyWithTypNotInRptKeyConf_SubColumns(row, down);
	}
	/** 
	  * RptKeyWithTypNotInRptKeyConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptKeyWithTypNotInRptKeyConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptKeyWithTypNotInRptKeyConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptKeyWithTypNotInRptKeyConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptKeyWithTypNotInRptKeyConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_KEY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptKeyWithTypNotInRptKeyConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptKeyWithTypNotInRptKeyConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptKeyWithTypNotInRptKeyConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptKeyWithTypNotInRptKeyConfCols.outAll());
	}


	/** 
	  * RptPtnNotInRptConf:原価レポートパタン（レポート構成未登録）<p>
	  * 原価レポート構成マスタに存在しないレポートパタン情報を、原価レポートパタンマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptPtnNotInRptConf(MCRow row) {
		MCList<MAM_RPT_PTN_R> rslt = MCList.create(MAM_RPT_PTN_R.class);
		MAM_RPT_PTN_R dbc = MAM_RPT_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptPtnNotInRptConf_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptPtnNotInRptConf");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptPtnNotInRptConf").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptPtnNotInRptConf_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptPtnNotInRptConf");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptPtnNotInRptConf_SubColumns(row, down);
	}
	/** 
	  * RptPtnNotInRptConf:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptPtnNotInRptConf_Set(MCRow row, MCQueryApiBuilder builder, MAM_RPT_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptPtnNotInRptConfCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptPtnNotInRptConf:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptPtnNotInRptConf_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RPT_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptPtnNotInRptConf:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptPtnNotInRptConf_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptPtnNotInRptConf_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptPtnNotInRptConfCols.outAll());
	}


	/** 
	  * InspPtn:検査パタン<p>
	  * 検査パタンマスタから検査パタン情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getInspPtn(MCRow row) {
		MCList<MAM_INSP_PTN_R> rslt = MCList.create(MAM_INSP_PTN_R.class);
		MAM_INSP_PTN_R dbc = MAM_INSP_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getInspPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.InspPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.InspPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getInspPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.InspPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getInspPtn_SubColumns(row, down);
	}
	/** 
	  * InspPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getInspPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_INSP_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, InspPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * InspPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getInspPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_INSP_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * InspPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getInspPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getInspPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(InspPtnCols.outAll());
	}


	/** 
	  * ProdOrSgaExpns:原価費目（製造・売上原価費目または販売・一般管理費目）<p>
	  * 費目区分に「1：製造・売上原価費目」または「2：販売・一般管理費目」が設定されている費目情報を、原価費目マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getProdOrSgaExpns(MCRow row) {
		MCList<MAM_EXPNS_R> rslt = MCList.create(MAM_EXPNS_R.class);
		MAM_EXPNS_R dbc = MAM_EXPNS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getProdOrSgaExpns_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ProdOrSgaExpns");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ProdOrSgaExpns").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getProdOrSgaExpns_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ProdOrSgaExpns");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getProdOrSgaExpns_SubColumns(row, down);
	}
	/** 
	  * ProdOrSgaExpns:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getProdOrSgaExpns_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ProdOrSgaExpnsCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ProdOrSgaExpns:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getProdOrSgaExpns_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXPNS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ProdOrSgaExpns:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getProdOrSgaExpns_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getProdOrSgaExpns_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ProdOrSgaExpnsCols.outAll());
	}


	/** 
	  * AlcRuleAlcPtnAsWk:配賦方法_配賦パタン（工数）<p>
	  * 配賦方法区分に「1:工数」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsWk(MCRow row) {
		MCList<MAM_ALC_RULE_R> rslt = MCList.create(MAM_ALC_RULE_R.class);
		MAM_ALC_RULE_R dbc = MAM_ALC_RULE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcRuleAlcPtnAsWk_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcRuleAlcPtnAsWk");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcRuleAlcPtnAsWk").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcRuleAlcPtnAsWk_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcRuleAlcPtnAsWk");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcRuleAlcPtnAsWk_SubColumns(row, down);
	}
	/** 
	  * AlcRuleAlcPtnAsWk:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcRuleAlcPtnAsWk_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcRuleAlcPtnAsWkCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcRuleAlcPtnAsWk:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcRuleAlcPtnAsWk_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcRuleAlcPtnAsWk:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcRuleAlcPtnAsWk_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcRuleAlcPtnAsWk_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcRuleAlcPtnAsWkCols.outAll());
	}


	/** 
	  * ExtSys:外部システム<p>
	  * 外部システムマスタから外部システム情報を取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExtSys(MCRow row) {
		MCList<MAM_EXT_SYS_R> rslt = MCList.create(MAM_EXT_SYS_R.class);
		MAM_EXT_SYS_R dbc = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExtSys_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExtSys");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExtSys").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExtSys_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExtSys");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExtSys_SubColumns(row, down);
	}
	/** 
	  * ExtSys:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExtSys_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExtSysCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExtSys:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExtSys_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExtSys:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExtSys_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExtSys_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExtSysCols.outAll());
	}


	/** 
	  * AprvRt:承認ルートパタン<p>
	  * 承認ルートパタンマスタから承認ルートパタン情報を取得する<br>
・承認機能区分で絞り込む場合は、aprv_func_typに承認機能区分を指定する<br>
　aprv_func_typに「null」を指定した場合は「null」を返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAprvRt(MCRow row) {
		MCList<MAM_APRV_RT_R> rslt = MCList.create(MAM_APRV_RT_R.class);
		MAM_APRV_RT_R dbc = MAM_APRV_RT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAprvRt_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AprvRt");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AprvRt").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAprvRt_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AprvRt");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAprvRt_SubColumns(row, down);
	}
	/** 
	  * AprvRt:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAprvRt_Set(MCRow row, MCQueryApiBuilder builder, MAM_APRV_RT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AprvRtCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AprvRt:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAprvRt_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_APRV_RT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AprvRt:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAprvRt_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAprvRt_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AprvRtCols.outAll());
	}


	/** 
	  * LgOrMfgOrSlsWg:ワーキンググループ（物流または製造または販売）<p>
	  * 物流または製造または販売機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgOrMfgOrSlsWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgOrMfgOrSlsWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgOrMfgOrSlsWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgOrMfgOrSlsWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgOrMfgOrSlsWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgOrMfgOrSlsWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgOrMfgOrSlsWg_SubColumns(row, down);
	}
	/** 
	  * LgOrMfgOrSlsWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgOrMfgOrSlsWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgOrMfgOrSlsWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgOrMfgOrSlsWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgOrMfgOrSlsWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgOrMfgOrSlsWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgOrMfgOrSlsWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgOrMfgOrSlsWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgOrMfgOrSlsWgCols.outAll());
	}


	/** 
	  * ItmInspPtn:品目検査パタン<p>
	  * 以下の引数に対応する検査パタン情報を、品目検査パタンマスタから取得する<br>
　品目、枝番１－３、適用日
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmInspPtn(MCRow row) {
		MCList<MAM_ITM_INSP_PTN_R> rslt = MCList.create(MAM_ITM_INSP_PTN_R.class);
		MAM_ITM_INSP_PTN_R dbc = MAM_ITM_INSP_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmInspPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmInspPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmInspPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmInspPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmInspPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmInspPtn_SubColumns(row, down);
	}
	/** 
	  * ItmInspPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmInspPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_INSP_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmInspPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmInspPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmInspPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_INSP_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmInspPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmInspPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmInspPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmInspPtnCols.outAll());
	}


	/** 
	  * LgGrpNotForLoc:物流グループ（場所設定不可）<p>
	  * 場所設定が不可能な物流グループ情報を、物流グループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・ワーキンググループで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgGrpNotForLoc(MCRow row) {
		MCList<MAM_LG_GRP_R> rslt = MCList.create(MAM_LG_GRP_R.class);
		MAM_LG_GRP_R dbc = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgGrpNotForLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgGrpNotForLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgGrpNotForLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgGrpNotForLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgGrpNotForLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgGrpNotForLoc_SubColumns(row, down);
	}
	/** 
	  * LgGrpNotForLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgGrpNotForLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgGrpNotForLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgGrpNotForLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgGrpNotForLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LG_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgGrpNotForLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgGrpNotForLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgGrpNotForLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgGrpNotForLocCols.outAll());
	}


	/** 
	  * ItmInspPtnAsSpec:品目検査パタン（抜取規格検査）<p>
	  * 以下の引数に対応する検査パタン情報を、品目検査パタンマスタから取得する<br>
　品目、枝番１－３、適用日<br>
検査方法区分に「4:抜取規格検査」が設定されているものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmInspPtnAsSpec(MCRow row) {
		MCList<MAM_ITM_INSP_PTN_R> rslt = MCList.create(MAM_ITM_INSP_PTN_R.class);
		MAM_ITM_INSP_PTN_R dbc = MAM_ITM_INSP_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmInspPtnAsSpec_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmInspPtnAsSpec");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmInspPtnAsSpec").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmInspPtnAsSpec_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmInspPtnAsSpec");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmInspPtnAsSpec_SubColumns(row, down);
	}
	/** 
	  * ItmInspPtnAsSpec:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmInspPtnAsSpec_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_INSP_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmInspPtnAsSpecCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmInspPtnAsSpec:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmInspPtnAsSpec_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_INSP_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmInspPtnAsSpec:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmInspPtnAsSpec_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmInspPtnAsSpec_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmInspPtnAsSpecCols.outAll());
	}


	/** 
	  * ShipTerm:出荷条件<p>
	  * 出荷条件マスタに登録されている出荷条件ＣＤを取得する<br>
出荷元物流グループＣＤと出荷先物流グループＣＤを共に指定している場合、対応する出荷作業グループ情報も取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipTerm(MCRow row) {
		MCList<MAM_SHIP_TERM_R> rslt = MCList.create(MAM_SHIP_TERM_R.class);
		MAM_SHIP_TERM_R dbc = MAM_SHIP_TERM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipTerm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ShipTerm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ShipTerm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipTerm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ShipTerm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipTerm_SubColumns(row, down);
	}
	/** 
	  * ShipTerm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipTerm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_TERM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipTermCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipTerm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipTerm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_TERM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipTerm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipTerm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipTerm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipTermCols.outAll());
	}


	/** 
	  * MpsGrp:ＭＰＳグループ<p>
	  * ＭＰＳグループマスタからＭＰＳグループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getMpsGrp(MCRow row) {
		MCList<MAM_MPS_GRP_R> rslt = MCList.create(MAM_MPS_GRP_R.class);
		MAM_MPS_GRP_R dbc = MAM_MPS_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getMpsGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.MpsGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.MpsGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getMpsGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.MpsGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getMpsGrp_SubColumns(row, down);
	}
	/** 
	  * MpsGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getMpsGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_MPS_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, MpsGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * MpsGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getMpsGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_MPS_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * MpsGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getMpsGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getMpsGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(MpsGrpCols.outAll());
	}


	/** 
	  * BomPtn:構成パタン<p>
	  * 構成表マスタから構成パタンを取得します。
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBomPtn(MCRow row) {
		MCList<MAM_BOM_R> rslt = MCList.create(MAM_BOM_R.class);
		MAM_BOM_R dbc = MAM_BOM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBomPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BomPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BomPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBomPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BomPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBomPtn_SubColumns(row, down);
	}
	/** 
	  * BomPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBomPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BOM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BomPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BomPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBomPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BOM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BomPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBomPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBomPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BomPtnCols.outAll());
	}


	/** 
	  * BomPtnParChd:構成パタン（親子）<p>
	  * 構成表マスタから構成パタン（親・子どちらに登録されている構成パタン）を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBomPtnParChd(MCRow row) {
		MCList<MAM_BOM_R> rslt = MCList.create(MAM_BOM_R.class);
		MAM_BOM_R dbc = MAM_BOM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBomPtnParChd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BomPtnParChd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BomPtnParChd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBomPtnParChd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BomPtnParChd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBomPtnParChd_SubColumns(row, down);
	}
	/** 
	  * BomPtnParChd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBomPtnParChd_Set(MCRow row, MCQueryApiBuilder builder, MAM_BOM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BomPtnParChdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BomPtnParChd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBomPtnParChd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BOM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BomPtnParChd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBomPtnParChd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBomPtnParChd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BomPtnParChdCols.outAll());
	}


	/** 
	  * CtgGrp:品群グループ<p>
	  * 原価品群グループマスタから品群グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCtgGrp(MCRow row) {
		MCList<MAM_CTG_GRP_R> rslt = MCList.create(MAM_CTG_GRP_R.class);
		MAM_CTG_GRP_R dbc = MAM_CTG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCtgGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CtgGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CtgGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCtgGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CtgGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCtgGrp_SubColumns(row, down);
	}
	/** 
	  * CtgGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCtgGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_CTG_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CtgGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CtgGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCtgGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CTG_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CtgGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCtgGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCtgGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CtgGrpCols.outAll());
	}


	/** 
	  * WkDay:勤務種類<p>
	  * 勤務種類マスタから勤務種類情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getWkDay(MCRow row) {
		MCList<MAM_WK_DAY_R> rslt = MCList.create(MAM_WK_DAY_R.class);
		MAM_WK_DAY_R dbc = MAM_WK_DAY_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getWkDay_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.WkDay");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.WkDay").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getWkDay_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.WkDay");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getWkDay_SubColumns(row, down);
	}
	/** 
	  * WkDay:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getWkDay_Set(MCRow row, MCQueryApiBuilder builder, MAM_WK_DAY_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, WkDayCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * WkDay:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getWkDay_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WK_DAY_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * WkDay:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getWkDay_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getWkDay_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(WkDayCols.outAll());
	}


	/** 
	  * Rsrc:資源<p>
	  * 資産マスタから資産情報を取得する<br>
引数の場所ＣＤを指定した場合は、場所マスタの資源ＣＤ１、資源ＣＤ２に設定されている資源ＣＤのみを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRsrc(MCRow row) {
		MCList<MAM_RSRC_R> rslt = MCList.create(MAM_RSRC_R.class);
		MAM_RSRC_R dbc = MAM_RSRC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRsrc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Rsrc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Rsrc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRsrc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Rsrc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRsrc_SubColumns(row, down);
	}
	/** 
	  * Rsrc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRsrc_Set(MCRow row, MCQueryApiBuilder builder, MAM_RSRC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RsrcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Rsrc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRsrc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_RSRC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Rsrc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRsrc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRsrc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RsrcCols.outAll());
	}


	/** 
	  * SetGrp:品揃グループ<p>
	  * 品揃グループマスタから品揃グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSetGrp(MCRow row) {
		MCList<MAM_SET_GRP_R> rslt = MCList.create(MAM_SET_GRP_R.class);
		MAM_SET_GRP_R dbc = MAM_SET_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSetGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SetGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SetGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSetGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SetGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSetGrp_SubColumns(row, down);
	}
	/** 
	  * SetGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSetGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_SET_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SetGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SetGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSetGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SET_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SetGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSetGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSetGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SetGrpCols.outAll());
	}


	/** 
	  * PlmWg:ワーキンググループ（ＰＬＭ）<p>
	  * ＰＬＭ機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getPlmWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getPlmWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.PlmWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.PlmWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getPlmWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.PlmWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getPlmWg_SubColumns(row, down);
	}
	/** 
	  * PlmWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getPlmWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, PlmWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * PlmWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getPlmWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * PlmWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getPlmWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getPlmWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(PlmWgCols.outAll());
	}


	/** 
	  * StktkBizRsn:業務理由（棚卸）<p>
	  * 棚卸時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStktkBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStktkBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.StktkBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.StktkBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStktkBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.StktkBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStktkBizRsn_SubColumns(row, down);
	}
	/** 
	  * StktkBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStktkBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StktkBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StktkBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStktkBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StktkBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStktkBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStktkBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StktkBizRsnCols.outAll());
	}


	/** 
	  * ItmUnit:品目単位<p>
	  * 以下の引数に対応する品目の単位情報を、品目単位マスタから取得する<br>
　品目、枝番１－３
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmUnit(MCRow row) {
		MCList<MAVM_ITM_UNIT_R> rslt = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R dbc = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmUnit_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmUnit");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmUnit").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmUnit_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmUnit");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmUnit_SubColumns(row, down);
	}
	/** 
	  * ItmUnit:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmUnit_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_UNIT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmUnitCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmUnit:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmUnit_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_UNIT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmUnit:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmUnit_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmUnit_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmUnitCols.outAll());
	}


	/** 
	  * ItmVer:版<p>
	  * 以下の引数に対応する品目の版情報を、版マスタから取得する<br>
　品目、枝番１－３<br>
工場・物流倉庫ＣＤに「null」指定した場合は「null」を返す<br>
工場・物流倉庫ＣＤが未指定の場合は、絞込み条件としては無効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmVer(MCRow row) {
		MCList<MAM_ITM_VER_R> rslt = MCList.create(MAM_ITM_VER_R.class);
		MAM_ITM_VER_R dbc = MAM_ITM_VER_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmVer_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmVer");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmVer").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmVer_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmVer");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmVer_SubColumns(row, down);
	}
	/** 
	  * ItmVer:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmVer_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_VER_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmVerCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmVer:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmVer_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_VER_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmVer:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmVer_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmVer_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmVerCols.outAll());
	}


	/** 
	  * AltGrp:代替グループ<p>
	  * 引数のワーキンググループに対応する代替グループ情報を、代替グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAltGrp(MCRow row) {
		MCList<MAM_ALT_GRP_R> rslt = MCList.create(MAM_ALT_GRP_R.class);
		MAM_ALT_GRP_R dbc = MAM_ALT_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAltGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AltGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AltGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAltGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AltGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAltGrp_SubColumns(row, down);
	}
	/** 
	  * AltGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAltGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALT_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AltGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AltGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAltGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALT_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AltGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAltGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAltGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AltGrpCols.outAll());
	}


	/** 
	  * AltGrpBom:代替グループ（ＢＯＭ登録）<p>
	  * 引数のワーキンググループに対応する有効な代替グループ情報を、代替グループマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAltGrpBom(MCRow row) {
		MCList<MAM_ALT_GRP__R> rslt = MCList.create(MAM_ALT_GRP__R.class);
		MAM_ALT_GRP__R dbc = MAM_ALT_GRP__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAltGrpBom_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AltGrpBom");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AltGrpBom").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAltGrpBom_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AltGrpBom");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAltGrpBom_SubColumns(row, down);
	}
	/** 
	  * AltGrpBom:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAltGrpBom_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALT_GRP__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AltGrpBomCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AltGrpBom:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAltGrpBom_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALT_GRP__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AltGrpBom:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAltGrpBom_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAltGrpBom_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AltGrpBomCols.outAll());
	}


	/** 
	  * ItmSpec:品目仕様<p>
	  * 以下の引数に対応する品目仕様情報を、品目仕様マスタから取得する<br>
　品目、枝番１－３、品目枝番、品目仕様分類ＣＤ
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmSpec(MCRow row) {
		MCList<MAM_ITM_SPEC_R> rslt = MCList.create(MAM_ITM_SPEC_R.class);
		MAM_ITM_SPEC_R dbc = MAM_ITM_SPEC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmSpec_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmSpec");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmSpec").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmSpec_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmSpec");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmSpec_SubColumns(row, down);
	}
	/** 
	  * ItmSpec:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmSpec_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SPEC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmSpecCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmSpec:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmSpec_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_SPEC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmSpec:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmSpec_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmSpec_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmSpecCols.outAll());
	}


	/** 
	  * BpItm:取引先品目<p>
	  * 以下の引数に対応する品目情報を、取引先品目マスタから取得する<br>
　適用日、取引先、品目枝番
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpItm(MCRow row) {
		MCList<MAM_BP_ITM_R> rslt = MCList.create(MAM_BP_ITM_R.class);
		MAM_BP_ITM_R dbc = MAM_BP_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpItm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpItm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpItm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpItm_SubColumns(row, down);
	}
	/** 
	  * BpItm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpItmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpItm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_ITM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpItm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpItm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpItm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpItmCols.outAll());
	}


	/** 
	  * ItmLcl:品目（ロケール別）<p>
	  * 以下の引数に対応するロケール別情報を、品目マスタ(ロケール別情報)から取得する<br>
　ロケールＣＤ、品目
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmLcl(MCRow row) {
		MCList<MAM_ITM_LCL_R> rslt = MCList.create(MAM_ITM_LCL_R.class);
		MAM_ITM_LCL_R dbc = MAM_ITM_LCL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmLcl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmLcl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmLcl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmLcl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmLcl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmLcl_SubColumns(row, down);
	}
	/** 
	  * ItmLcl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmLcl_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_LCL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmLclCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmLcl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmLcl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_LCL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmLcl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmLcl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmLcl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmLclCols.outAll());
	}


	/** 
	  * ItmOper:品目工程<p>
	  * 以下の引数に対応する品目工程情報を、品目工程マスタから取得する<br>
　品目、枝番１－３、場所<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmOper(MCRow row) {
		MCList<MAM_ITM_OPER_R> rslt = MCList.create(MAM_ITM_OPER_R.class);
		MAM_ITM_OPER_R dbc = MAM_ITM_OPER_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmOper_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmOper");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmOper").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmOper_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmOper");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmOper_SubColumns(row, down);
	}
	/** 
	  * ItmOper:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmOper_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmOperCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmOper:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmOper_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmOper:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmOper_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmOper_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmOperCols.outAll());
	}


	/** 
	  * ItmDtlSub1:品目詳細（枝番１）<p>
	  * 引数の品目に対応する枝番１および品目詳細情報を、品目詳細マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSub1(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSub1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlSub1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlSub1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSub1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlSub1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSub1_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSub1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSub1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSub1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSub1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSub1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSub1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSub1Cols.outAll());
	}


	/** 
	  * ItmDtlSub2:品目詳細（枝番２）<p>
	  * 以下の引数に対応する枝番２および品目詳細情報を、品目詳細マスタから取得する<br>
　品目、枝番１
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSub2(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSub2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlSub2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlSub2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSub2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlSub2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSub2_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSub2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSub2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSub2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSub2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSub2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSub2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSub2Cols.outAll());
	}


	/** 
	  * ItmDtlSub3:品目詳細（枝番３）<p>
	  * 以下の引数に対応する枝番３および品目詳細情報を、品目詳細マスタから取得する<br>
　品目、枝番１、枝番2
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSub3(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSub3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlSub3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlSub3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSub3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlSub3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSub3_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSub3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSub3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSub3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSub3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSub3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSub3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSub3Cols.outAll());
	}


	/** 
	  * LossRsn:ロス理由<p>
	  * 以下の引数に対応するロス理由情報を、ロス理由マスタから取得する<br>
　品目区分、品目区分詳細ＣＤ　
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLossRsn(MCRow row) {
		MCList<MAM_LOSS_RSN_R> rslt = MCList.create(MAM_LOSS_RSN_R.class);
		MAM_LOSS_RSN_R dbc = MAM_LOSS_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLossRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LossRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LossRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLossRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LossRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLossRsn_SubColumns(row, down);
	}
	/** 
	  * LossRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLossRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOSS_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LossRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LossRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLossRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOSS_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LossRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLossRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLossRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LossRsnCols.outAll());
	}


	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:業務理由（他勘定入庫、他勘定出庫、廃棄）<p>
	  * 理由情報を業務理由マスタから取得する<br>
引数で取得対象を指定した場合は、対応するソート順でソートされる<br>
（例：廃棄フラグがオンの場合は、廃棄ソート順でソート）<br>
ソート対象として採用されるのは1つのフラグのみであり、以下の優先順で採用される<br>
　廃棄、他勘定出庫、他勘定入庫<br>
・他勘定入庫理由を取得対象とする場合は、acxfr_gr_flgに「true」を指定する<br>
・他勘定出庫理由を取得対象とする場合は、acxfr_gi_flgに「true」を指定する<br>
・廃棄理由を取得対象とする場合は、disp_flgに「true」を指定する<br>

	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcxfrGrAcxfrGiDispBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcxfrGrAcxfrGiDispBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcxfrGrAcxfrGiDispBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcxfrGrAcxfrGiDispBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcxfrGrAcxfrGiDispBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcxfrGrAcxfrGiDispBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcxfrGrAcxfrGiDispBizRsn_SubColumns(row, down);
	}
	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcxfrGrAcxfrGiDispBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcxfrGrAcxfrGiDispBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcxfrGrAcxfrGiDispBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcxfrGrAcxfrGiDispBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcxfrGrAcxfrGiDispBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcxfrGrAcxfrGiDispBizRsnCols.outAll());
	}


	/** 
	  * ArrBizRsn:業務理由（仕入、売上返品、移送）<p>
	  * 理由情報を業務理由マスタから取得する<br>
取得対象を指定した場合は、対応するソート順でソートされる（経費購買理由は対象外）<br>
（例：仕入フラグがオンの場合は、仕入ソート順でソート）<br>
ソート対象として採用されるのは1つのフラグのみであり、以下の優先順で採用される<br>
　移送、売上返品、仕入<br>
・仕入理由を取得対象とする場合は、purc_flgに「true」を指定する<br>
・経費購買理由を取得対象とする場合は、xpns_purc_flgに「true」を指定する<br>
・売上返品理由を取得対象とする場合は、sls_rtn_flgに「true」を指定する<br>
・移送対象理由を取得対象とする場合は、xfr_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArrBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArrBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ArrBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ArrBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArrBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ArrBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArrBizRsn_SubColumns(row, down);
	}
	/** 
	  * ArrBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ArrBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ArrBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArrBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ArrBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArrBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArrBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ArrBizRsnCols.outAll());
	}


	/** 
	  * ShipBizRsn:業務理由（売上、移送）<p>
	  * 理由情報を業務理由マスタから取得する<br>
取得対象を指定した場合は、対応するソート順でソートされる<br>
（例：売上フラグがオンの場合は、売上ソート順でソート）<br>
ソート対象として採用されるのは1つのフラグのみであり、以下の優先順で採用される<br>
　移送、売上<br>
・売上理由を取得対象とする場合は、sls_flgに「true」を指定する<br>
・移送対象理由を取得対象とする場合は、xfr_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ShipBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ShipBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ShipBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipBizRsn_SubColumns(row, down);
	}
	/** 
	  * ShipBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipBizRsnCols.outAll());
	}


	/** 
	  * SlsAllBizRsn:業務理由（売上、売上返品、売上調整）<p>
	  * 理由情報を業務理由マスタから取得する<br>
取得対象を指定した場合は、対応するソート順でソートされる<br>
（例：売上フラグがオンの場合は、売上ソート順でソート）<br>
ソート対象として複数のフラグを指定した場合は、業務理由ＣＤでソートする<br>
・売上理由を取得対象とする場合は、sls_flgに「true」を指定する<br>
・売上返品理由を取得対象とする場合は、sls_rtn_flgに「true」を指定する<br>
・売上調整理由を取得対象とする場合は、sls_dscnt_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsAllBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsAllBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsAllBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsAllBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsAllBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsAllBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsAllBizRsn_SubColumns(row, down);
	}
	/** 
	  * SlsAllBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsAllBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsAllBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsAllBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsAllBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsAllBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsAllBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsAllBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsAllBizRsnCols.outAll());
	}


	/** 
	  * ShipWk:出荷作業<p>
	  * 出荷作業マスタから出荷作業情報を取得する<br>
出荷作業グループＣＤと出荷予定時刻で絞り込める
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipWk(MCRow row) {
		MCList<MAM_SHIP_WK_R> rslt = MCList.create(MAM_SHIP_WK_R.class);
		MAM_SHIP_WK_R dbc = MAM_SHIP_WK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipWk_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ShipWk");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ShipWk").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipWk_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ShipWk");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipWk_SubColumns(row, down);
	}
	/** 
	  * ShipWk:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipWk_Set(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_WK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipWkCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipWk:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipWk_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_WK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipWk:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipWk_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipWk_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipWkCols.outAll());
	}


	/** 
	  * ShipWkGrp:出荷作業グループ<p>
	  * 出荷作業グループマスタから出荷作業グループ情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getShipWkGrp(MCRow row) {
		MCList<MAM_SHIP_WK_GRP_R> rslt = MCList.create(MAM_SHIP_WK_GRP_R.class);
		MAM_SHIP_WK_GRP_R dbc = MAM_SHIP_WK_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getShipWkGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ShipWkGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ShipWkGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getShipWkGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ShipWkGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getShipWkGrp_SubColumns(row, down);
	}
	/** 
	  * ShipWkGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getShipWkGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_WK_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ShipWkGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ShipWkGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getShipWkGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SHIP_WK_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ShipWkGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getShipWkGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getShipWkGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ShipWkGrpCols.outAll());
	}


	/** 
	  * InptAcxfrBizRsn:投入用他勘定振替理由<p>
	  * 業務理由マスタから投入用他勘定振替理由情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getInptAcxfrBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getInptAcxfrBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.InptAcxfrBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.InptAcxfrBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getInptAcxfrBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.InptAcxfrBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getInptAcxfrBizRsn_SubColumns(row, down);
	}
	/** 
	  * InptAcxfrBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getInptAcxfrBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, InptAcxfrBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * InptAcxfrBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getInptAcxfrBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * InptAcxfrBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getInptAcxfrBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getInptAcxfrBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(InptAcxfrBizRsnCols.outAll());
	}


	/** 
	  * ArSttlNotRcvSchd:債権決済方法（貸方相殺源泉税振替以外）<p>
	  * 債権決済方法フラグが設定されている、かつ債権決済方法区分に「５：相殺（貸方）」「6：源泉税」「７：振替」以外が設定されている決済方法情報を、決済方法マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getArSttlNotRcvSchd(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getArSttlNotRcvSchd_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ArSttlNotRcvSchd");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ArSttlNotRcvSchd").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getArSttlNotRcvSchd_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ArSttlNotRcvSchd");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getArSttlNotRcvSchd_SubColumns(row, down);
	}
	/** 
	  * ArSttlNotRcvSchd:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getArSttlNotRcvSchd_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ArSttlNotRcvSchdCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ArSttlNotRcvSchd:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getArSttlNotRcvSchd_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ArSttlNotRcvSchd:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getArSttlNotRcvSchd_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getArSttlNotRcvSchd_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ArSttlNotRcvSchdCols.outAll());
	}


	/** 
	  * SlsItmGrpLvl:販売品目体系階層<p>
	  * 販売品目体系マスタから販売品目体系階層を取得する<br>
販売品目体系階層は重複を省いて取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSlsItmGrpLvl(MCRow row) {
		MCList<MAM_SLS_ITM_GRP_R> rslt = MCList.create(MAM_SLS_ITM_GRP_R.class);
		MAM_SLS_ITM_GRP_R dbc = MAM_SLS_ITM_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSlsItmGrpLvl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SlsItmGrpLvl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SlsItmGrpLvl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSlsItmGrpLvl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SlsItmGrpLvl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSlsItmGrpLvl_SubColumns(row, down);
	}
	/** 
	  * SlsItmGrpLvl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSlsItmGrpLvl_Set(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ITM_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SlsItmGrpLvlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SlsItmGrpLvl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSlsItmGrpLvl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SLS_ITM_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SlsItmGrpLvl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSlsItmGrpLvl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSlsItmGrpLvl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SlsItmGrpLvlCols.outAll());
	}


	/** 
	  * ParmRemark:システムパラメータ概要<p>
	  * システムパラメータ概要テーブルからシステムパラメータ概要情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getParmRemark(MCRow row) {
		MCList<MAC_SYS_PARM_REMARK_R> rslt = MCList.create(MAC_SYS_PARM_REMARK_R.class);
		MAC_SYS_PARM_REMARK_R dbc = MAC_SYS_PARM_REMARK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getParmRemark_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ParmRemark");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ParmRemark").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getParmRemark_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ParmRemark");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getParmRemark_SubColumns(row, down);
	}
	/** 
	  * ParmRemark:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getParmRemark_Set(MCRow row, MCQueryApiBuilder builder, MAC_SYS_PARM_REMARK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ParmRemarkCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ParmRemark:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getParmRemark_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAC_SYS_PARM_REMARK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ParmRemark:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getParmRemark_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getParmRemark_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ParmRemarkCols.outAll());
	}


	/** 
	  * ParmBizGrp:システムパラメータ業務分類<p>
	  * システムパラメータ概要テーブルから業務分類情報を取得する<br>
業務分類は重複を省いて取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getParmBizGrp(MCRow row) {
		MCList<MAC_SYS_PARM_REMARK_R> rslt = MCList.create(MAC_SYS_PARM_REMARK_R.class);
		MAC_SYS_PARM_REMARK_R dbc = MAC_SYS_PARM_REMARK_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getParmBizGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ParmBizGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ParmBizGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getParmBizGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ParmBizGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getParmBizGrp_SubColumns(row, down);
	}
	/** 
	  * ParmBizGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getParmBizGrp_Set(MCRow row, MCQueryApiBuilder builder, MAC_SYS_PARM_REMARK_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ParmBizGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ParmBizGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getParmBizGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAC_SYS_PARM_REMARK_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ParmBizGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getParmBizGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getParmBizGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ParmBizGrpCols.outAll());
	}


	/** 
	  * DptForEndDtChk:部門（適用終了日チェック用）<p>
	  * 適用開始日と適用終了日に対応する部門ＣＤを部門マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDptForEndDtChk(MCRow row) {
		MCList<MAM_DPT_R> rslt = MCList.create(MAM_DPT_R.class);
		MAM_DPT_R dbc = MAM_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDptForEndDtChk_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.DptForEndDtChk");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.DptForEndDtChk").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDptForEndDtChk_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.DptForEndDtChk");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDptForEndDtChk_SubColumns(row, down);
	}
	/** 
	  * DptForEndDtChk:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDptForEndDtChk_Set(MCRow row, MCQueryApiBuilder builder, MAM_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DptForEndDtChkCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DptForEndDtChk:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDptForEndDtChk_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DptForEndDtChk:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDptForEndDtChk_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDptForEndDtChk_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DptForEndDtChkCols.outAll());
	}


	/** 
	  * ExtSysEdi:外部システム（ＥＤＩ）<p>
	  * 外部システム区分が「1：ＥＤＩ」「6：ＥＤＩ（ＭＣＦ）」である外部システム情報を、外部システムマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExtSysEdi(MCRow row) {
		MCList<MAM_EXT_SYS_R> rslt = MCList.create(MAM_EXT_SYS_R.class);
		MAM_EXT_SYS_R dbc = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExtSysEdi_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExtSysEdi");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExtSysEdi").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExtSysEdi_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExtSysEdi");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExtSysEdi_SubColumns(row, down);
	}
	/** 
	  * ExtSysEdi:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExtSysEdi_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExtSysEdiCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExtSysEdi:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExtSysEdi_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExtSysEdi:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExtSysEdi_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExtSysEdi_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExtSysEdiCols.outAll());
	}


	/** 
	  * ApSttl:債務決済方法<p>
	  * 債務に関する決済方法情報を、決済方法マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getApSttl(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getApSttl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ApSttl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ApSttl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getApSttl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ApSttl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getApSttl_SubColumns(row, down);
	}
	/** 
	  * ApSttl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getApSttl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ApSttlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ApSttl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getApSttl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ApSttl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getApSttl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getApSttl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ApSttlCols.outAll());
	}


	/** 
	  * ItmDtlPurcUpriSub1:品目詳細（購買単価用）（枝番１）<p>
	  * 引数の品目に対応する枝番１および品目詳細情報(購買単価に使用するもの)を、品目詳細マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlPurcUpriSub1(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlPurcUpriSub1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlPurcUpriSub1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlPurcUpriSub1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlPurcUpriSub1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlPurcUpriSub1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlPurcUpriSub1_SubColumns(row, down);
	}
	/** 
	  * ItmDtlPurcUpriSub1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlPurcUpriSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlPurcUpriSub1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlPurcUpriSub1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlPurcUpriSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlPurcUpriSub1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlPurcUpriSub1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlPurcUpriSub1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlPurcUpriSub1Cols.outAll());
	}


	/** 
	  * ItmDtlPurcUpriSub2:品目詳細（購買単価用）（枝番２）<p>
	  * 以下の引数に対応する枝番２および品目詳細情報(購買単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlPurcUpriSub2(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlPurcUpriSub2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlPurcUpriSub2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlPurcUpriSub2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlPurcUpriSub2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlPurcUpriSub2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlPurcUpriSub2_SubColumns(row, down);
	}
	/** 
	  * ItmDtlPurcUpriSub2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlPurcUpriSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlPurcUpriSub2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlPurcUpriSub2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlPurcUpriSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlPurcUpriSub2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlPurcUpriSub2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlPurcUpriSub2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlPurcUpriSub2Cols.outAll());
	}


	/** 
	  * ItmDtlPurcUpriSub3:品目詳細（購買単価用）（枝番３）<p>
	  * 以下の引数に対応する枝番３および品目詳細情報(購買単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１、枝番2
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlPurcUpriSub3(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlPurcUpriSub3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlPurcUpriSub3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlPurcUpriSub3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlPurcUpriSub3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlPurcUpriSub3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlPurcUpriSub3_SubColumns(row, down);
	}
	/** 
	  * ItmDtlPurcUpriSub3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlPurcUpriSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlPurcUpriSub3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlPurcUpriSub3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlPurcUpriSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlPurcUpriSub3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlPurcUpriSub3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlPurcUpriSub3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlPurcUpriSub3Cols.outAll());
	}


	/** 
	  * ItmDtlProcUpriSub1:品目詳細（加工単価用）（枝番１）<p>
	  * 引数の品目に対応する枝番１および品目詳細情報(加工単価に使用するもの)を、品目詳細マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlProcUpriSub1(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlProcUpriSub1_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlProcUpriSub1");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlProcUpriSub1").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlProcUpriSub1_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlProcUpriSub1");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlProcUpriSub1_SubColumns(row, down);
	}
	/** 
	  * ItmDtlProcUpriSub1:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlProcUpriSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlProcUpriSub1Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlProcUpriSub1:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlProcUpriSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlProcUpriSub1:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlProcUpriSub1_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlProcUpriSub1_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlProcUpriSub1Cols.outAll());
	}


	/** 
	  * ItmDtlProcUpriSub2:品目詳細（加工単価用）（枝番２）<p>
	  * 以下の引数に対応する枝番２および品目詳細情報(加工単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlProcUpriSub2(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlProcUpriSub2_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlProcUpriSub2");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlProcUpriSub2").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlProcUpriSub2_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlProcUpriSub2");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlProcUpriSub2_SubColumns(row, down);
	}
	/** 
	  * ItmDtlProcUpriSub2:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlProcUpriSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlProcUpriSub2Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlProcUpriSub2:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlProcUpriSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlProcUpriSub2:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlProcUpriSub2_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlProcUpriSub2_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlProcUpriSub2Cols.outAll());
	}


	/** 
	  * ItmDtlProcUpriSub3:品目詳細（加工単価用）（枝番３）<p>
	  * 以下の引数に対応する枝番３および品目詳細情報(加工単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１、枝番2
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlProcUpriSub3(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlProcUpriSub3_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlProcUpriSub3");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlProcUpriSub3").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlProcUpriSub3_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlProcUpriSub3");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlProcUpriSub3_SubColumns(row, down);
	}
	/** 
	  * ItmDtlProcUpriSub3:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlProcUpriSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlProcUpriSub3Cols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlProcUpriSub3:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlProcUpriSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlProcUpriSub3:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlProcUpriSub3_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlProcUpriSub3_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlProcUpriSub3Cols.outAll());
	}


	/** 
	  * CostWg:ワーキンググループ（原価用）<p>
	  * 販売、物流、製造、購買、いずれかの機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostWg(MCRow row) {
		MCList<MAM_WG_R> rslt = MCList.create(MAM_WG_R.class);
		MAM_WG_R dbc = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostWg_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostWg");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostWg").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostWg_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostWg");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostWg_SubColumns(row, down);
	}
	/** 
	  * CostWg:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostWg_Set(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostWgCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostWg:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostWg_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_WG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostWg:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostWg_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostWg_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostWgCols.outAll());
	}


	/** 
	  * RptPtnInCalcRptPtn:原価レポートパタン（計算グループレポートマスタ）<p>
	  * 引数の計算グループに対応する原価レポートキー情報を、計算グループレポートマスタから取得する<br>
原価レポートキーマスタにも存在するものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptPtnInCalcRptPtn(MCRow row) {
		MCList<MAM_CALC_RPT_PTN_R> rslt = MCList.create(MAM_CALC_RPT_PTN_R.class);
		MAM_CALC_RPT_PTN_R dbc = MAM_CALC_RPT_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptPtnInCalcRptPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptPtnInCalcRptPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptPtnInCalcRptPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptPtnInCalcRptPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptPtnInCalcRptPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptPtnInCalcRptPtn_SubColumns(row, down);
	}
	/** 
	  * RptPtnInCalcRptPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptPtnInCalcRptPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_RPT_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptPtnInCalcRptPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptPtnInCalcRptPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptPtnInCalcRptPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_RPT_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptPtnInCalcRptPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptPtnInCalcRptPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptPtnInCalcRptPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptPtnInCalcRptPtnCols.outAll());
	}


	/** 
	  * RptKeyWithTypInCalcRptPtn:原価レポートキー（計算グループレポートマスタ）<p>
	  * 以下の引数に対応する原価レポートキー情報を、計算グループレポートマスタから取得する<br>
　計算グループ、レポートパタン<br>
原価レポートキーマスタからレポートキー区分を取得できるものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getRptKeyWithTypInCalcRptPtn(MCRow row) {
		MCList<MAM_CALC_RPT_PTN_R> rslt = MCList.create(MAM_CALC_RPT_PTN_R.class);
		MAM_CALC_RPT_PTN_R dbc = MAM_CALC_RPT_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getRptKeyWithTypInCalcRptPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.RptKeyWithTypInCalcRptPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.RptKeyWithTypInCalcRptPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getRptKeyWithTypInCalcRptPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.RptKeyWithTypInCalcRptPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getRptKeyWithTypInCalcRptPtn_SubColumns(row, down);
	}
	/** 
	  * RptKeyWithTypInCalcRptPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getRptKeyWithTypInCalcRptPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_RPT_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, RptKeyWithTypInCalcRptPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * RptKeyWithTypInCalcRptPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getRptKeyWithTypInCalcRptPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_RPT_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * RptKeyWithTypInCalcRptPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getRptKeyWithTypInCalcRptPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getRptKeyWithTypInCalcRptPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(RptKeyWithTypInCalcRptPtnCols.outAll());
	}


	/** 
	  * AlcRuleAlcPtnAsInptQty:配賦方法_配賦パタン（投入数量）<p>
	  * 配賦方法区分に「6:投入数量」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す<br>
termに「null」を指定した場合はnullを返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsInptQty(MCRow row) {
		MCList<MAM_ALC_RULE_R> rslt = MCList.create(MAM_ALC_RULE_R.class);
		MAM_ALC_RULE_R dbc = MAM_ALC_RULE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcRuleAlcPtnAsInptQty_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcRuleAlcPtnAsInptQty");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcRuleAlcPtnAsInptQty").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcRuleAlcPtnAsInptQty_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcRuleAlcPtnAsInptQty");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcRuleAlcPtnAsInptQty_SubColumns(row, down);
	}
	/** 
	  * AlcRuleAlcPtnAsInptQty:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcRuleAlcPtnAsInptQty_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcRuleAlcPtnAsInptQtyCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcRuleAlcPtnAsInptQty:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcRuleAlcPtnAsInptQty_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcRuleAlcPtnAsInptQty:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcRuleAlcPtnAsInptQty_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcRuleAlcPtnAsInptQty_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcRuleAlcPtnAsInptQtyCols.outAll());
	}


	/** 
	  * AlcRuleAlcPtnAsOtherVal:配賦方法_配賦パタン（任意配賦基準値）<p>
	  * 配賦方法区分に「7:任意配賦基準値」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す<br>
termに「null」を指定した場合はnullを返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsOtherVal(MCRow row) {
		MCList<MAM_ALC_RULE_R> rslt = MCList.create(MAM_ALC_RULE_R.class);
		MAM_ALC_RULE_R dbc = MAM_ALC_RULE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcRuleAlcPtnAsOtherVal_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcRuleAlcPtnAsOtherVal");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcRuleAlcPtnAsOtherVal").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcRuleAlcPtnAsOtherVal_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcRuleAlcPtnAsOtherVal");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcRuleAlcPtnAsOtherVal_SubColumns(row, down);
	}
	/** 
	  * AlcRuleAlcPtnAsOtherVal:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcRuleAlcPtnAsOtherVal_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcRuleAlcPtnAsOtherValCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcRuleAlcPtnAsOtherVal:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcRuleAlcPtnAsOtherVal_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcRuleAlcPtnAsOtherVal:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcRuleAlcPtnAsOtherVal_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcRuleAlcPtnAsOtherVal_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcRuleAlcPtnAsOtherValCols.outAll());
	}


	/** 
	  * AlcTgtAlcPtnAsAlc:配賦対象区分_配賦パタン（汎用配賦）<p>
	  * 配賦方法区分に「5:汎用配賦」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAlcTgtAlcPtnAsAlc(MCRow row) {
		MCList<MAM_ALC_RULE_R> rslt = MCList.create(MAM_ALC_RULE_R.class);
		MAM_ALC_RULE_R dbc = MAM_ALC_RULE_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAlcTgtAlcPtnAsAlc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AlcTgtAlcPtnAsAlc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AlcTgtAlcPtnAsAlc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAlcTgtAlcPtnAsAlc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AlcTgtAlcPtnAsAlc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAlcTgtAlcPtnAsAlc_SubColumns(row, down);
	}
	/** 
	  * AlcTgtAlcPtnAsAlc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAlcTgtAlcPtnAsAlc_Set(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AlcTgtAlcPtnAsAlcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AlcTgtAlcPtnAsAlc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAlcTgtAlcPtnAsAlc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ALC_RULE_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AlcTgtAlcPtnAsAlc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAlcTgtAlcPtnAsAlc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAlcTgtAlcPtnAsAlc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AlcTgtAlcPtnAsAlcCols.outAll());
	}


	/** 
	  * ActPtn:計算実行パタン<p>
	  * 計算実行パタンマスタから計算実行パタンを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getActPtn(MCRow row) {
		MCList<MAM_ACT_PTN_R> rslt = MCList.create(MAM_ACT_PTN_R.class);
		MAM_ACT_PTN_R dbc = MAM_ACT_PTN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getActPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ActPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ActPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getActPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ActPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getActPtn_SubColumns(row, down);
	}
	/** 
	  * ActPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getActPtn_Set(MCRow row, MCQueryApiBuilder builder, MAM_ACT_PTN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ActPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ActPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getActPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ACT_PTN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ActPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getActPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getActPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ActPtnCols.outAll());
	}


	/** 
	  * CostMenuNotInMenuConfig:原価メニュー（原価メニュー構成未登録）<p>
	  * 原価メニュー構成マスタに未登録のメニューを、原価メニューマスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostMenuNotInMenuConfig(MCRow row) {
		MCList<MAM_COST_MENU_R> rslt = MCList.create(MAM_COST_MENU_R.class);
		MAM_COST_MENU_R dbc = MAM_COST_MENU_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostMenuNotInMenuConfig_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostMenuNotInMenuConfig");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostMenuNotInMenuConfig").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostMenuNotInMenuConfig_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostMenuNotInMenuConfig");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostMenuNotInMenuConfig_SubColumns(row, down);
	}
	/** 
	  * CostMenuNotInMenuConfig:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostMenuNotInMenuConfig_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_MENU_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostMenuNotInMenuConfigCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostMenuNotInMenuConfig:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostMenuNotInMenuConfig_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_MENU_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostMenuNotInMenuConfig:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostMenuNotInMenuConfig_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostMenuNotInMenuConfig_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostMenuNotInMenuConfigCols.outAll());
	}


	/** 
	  * AcSlipTypInCostSlipJnl:会計伝票区分（原価会計伝票区分仕訳マスタ登録済）<p>
	  * 原価会計伝票区分仕訳マスタから会計伝票区分を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAcSlipTypInCostSlipJnl(MCRow row) {
		MCList<MAM_COST_SLIP_JNL_R> rslt = MCList.create(MAM_COST_SLIP_JNL_R.class);
		MAM_COST_SLIP_JNL_R dbc = MAM_COST_SLIP_JNL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAcSlipTypInCostSlipJnl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.AcSlipTypInCostSlipJnl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.AcSlipTypInCostSlipJnl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAcSlipTypInCostSlipJnl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.AcSlipTypInCostSlipJnl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAcSlipTypInCostSlipJnl_SubColumns(row, down);
	}
	/** 
	  * AcSlipTypInCostSlipJnl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAcSlipTypInCostSlipJnl_Set(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLIP_JNL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AcSlipTypInCostSlipJnlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * AcSlipTypInCostSlipJnl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAcSlipTypInCostSlipJnl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_COST_SLIP_JNL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * AcSlipTypInCostSlipJnl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAcSlipTypInCostSlipJnl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAcSlipTypInCostSlipJnl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AcSlipTypInCostSlipJnlCols.outAll());
	}


	/** 
	  * CostIoInCalcCostIo:受払表（計算グループ受払表マスタ）<p>
	  * 引数の計算グループに対応する受払表ＩＤを、計算グループ受払表マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getCostIoInCalcCostIo(MCRow row) {
		MCList<MAM_CALC_COST_IO_R> rslt = MCList.create(MAM_CALC_COST_IO_R.class);
		MAM_CALC_COST_IO_R dbc = MAM_CALC_COST_IO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getCostIoInCalcCostIo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.CostIoInCalcCostIo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.CostIoInCalcCostIo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getCostIoInCalcCostIo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.CostIoInCalcCostIo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getCostIoInCalcCostIo_SubColumns(row, down);
	}
	/** 
	  * CostIoInCalcCostIo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getCostIoInCalcCostIo_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_COST_IO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, CostIoInCalcCostIoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * CostIoInCalcCostIo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getCostIoInCalcCostIo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_COST_IO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * CostIoInCalcCostIo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getCostIoInCalcCostIo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getCostIoInCalcCostIo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(CostIoInCalcCostIoCols.outAll());
	}


	/** 
	  * StkEval:在庫評価<p>
	  * 在庫評価マスタから在庫評価情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStkEval(MCRow row) {
		MCList<MAM_STK_EVAL_R> rslt = MCList.create(MAM_STK_EVAL_R.class);
		MAM_STK_EVAL_R dbc = MAM_STK_EVAL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStkEval_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.StkEval");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.StkEval").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStkEval_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.StkEval");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStkEval_SubColumns(row, down);
	}
	/** 
	  * StkEval:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStkEval_Set(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StkEvalCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StkEval:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStkEval_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STK_EVAL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StkEval:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStkEval_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStkEval_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StkEvalCols.outAll());
	}


	/** 
	  * InptBizRsn:業務理由（投入）<p>
	  * 投入データに使用する理由情報を、業務理由マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getInptBizRsn(MCRow row) {
		MCList<MAM_BIZ_RSN_R> rslt = MCList.create(MAM_BIZ_RSN_R.class);
		MAM_BIZ_RSN_R dbc = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getInptBizRsn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.InptBizRsn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.InptBizRsn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getInptBizRsn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.InptBizRsn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getInptBizRsn_SubColumns(row, down);
	}
	/** 
	  * InptBizRsn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getInptBizRsn_Set(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, InptBizRsnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * InptBizRsn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getInptBizRsn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BIZ_RSN_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * InptBizRsn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getInptBizRsn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getInptBizRsn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(InptBizRsnCols.outAll());
	}


	/** 
	  * FixCalcGrp:計算グループ（確定用）<p>
	  * 以下の全てに合致する計算グループ情報を計算グループマスタから取得する<br>
・計算区分に「2:原価計算（在庫対象外）」「3:原価計算（在庫計算）」「4.その他」のいずれかが設定されている<br>
・一次配賦計算区分に「2.計算」が設定されている
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getFixCalcGrp(MCRow row) {
		MCList<MAM_CALC_GRP_R> rslt = MCList.create(MAM_CALC_GRP_R.class);
		MAM_CALC_GRP_R dbc = MAM_CALC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getFixCalcGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.FixCalcGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.FixCalcGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getFixCalcGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.FixCalcGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getFixCalcGrp_SubColumns(row, down);
	}
	/** 
	  * FixCalcGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getFixCalcGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, FixCalcGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * FixCalcGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getFixCalcGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_CALC_GRP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * FixCalcGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getFixCalcGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getFixCalcGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(FixCalcGrpCols.outAll());
	}


	/** 
	  * SiteCo:倉庫事業者<p>
	  * 倉庫事業者マスタから倉庫事業者情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSiteCo(MCRow row) {
		MCList<MAM_SITE_CO_R> rslt = MCList.create(MAM_SITE_CO_R.class);
		MAM_SITE_CO_R dbc = MAM_SITE_CO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSiteCo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SiteCo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SiteCo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSiteCo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SiteCo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSiteCo_SubColumns(row, down);
	}
	/** 
	  * SiteCo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSiteCo_Set(MCRow row, MCQueryApiBuilder builder, MAM_SITE_CO_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SiteCoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SiteCo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSiteCo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SITE_CO_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SiteCo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSiteCo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSiteCo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SiteCoCols.outAll());
	}


	/** 
	  * ExtSysScm:外部システム（ＳＣＭ）<p>
	  * 外部システム区分が「2：ＳＣＭ」「7：ＳＣＭ（ＭＤ）」である外部システム情報を、外部システムマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExtSysScm(MCRow row) {
		MCList<MAM_EXT_SYS_R> rslt = MCList.create(MAM_EXT_SYS_R.class);
		MAM_EXT_SYS_R dbc = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExtSysScm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExtSysScm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExtSysScm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExtSysScm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExtSysScm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExtSysScm_SubColumns(row, down);
	}
	/** 
	  * ExtSysScm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExtSysScm_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExtSysScmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExtSysScm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExtSysScm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExtSysScm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExtSysScm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExtSysScm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExtSysScmCols.outAll());
	}


	/** 
	  * LgCtl:物流制御情報<p>
	  * 物流制御マスタから物流制御情報を取得する<br>
出荷条件ＣＤが指定され、出荷条件ＣＤが一致する物流制御マスタが取得できない場合は、出荷条件ＣＤがNULL文字の物流制御マスタを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLgCtl(MCRow row) {
		MCList<MAM_LG_CTL_R> rslt = MCList.create(MAM_LG_CTL_R.class);
		MAM_LG_CTL_R dbc = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLgCtl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.LgCtl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.LgCtl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLgCtl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.LgCtl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLgCtl_SubColumns(row, down);
	}
	/** 
	  * LgCtl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLgCtl_Set(MCRow row, MCQueryApiBuilder builder, MAM_LG_CTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LgCtlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * LgCtl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLgCtl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LG_CTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * LgCtl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLgCtl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLgCtl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LgCtlCols.outAll());
	}


	/** 
	  * ApSttlPaySchdCtl:債務決済方法（支払予定制御）<p>
	  * 債務決済方法フラグが設定されている、かつ下記以外の債務決済区分が設定されている決済方法情報を、決済方法マスタから取得する<br>
「7：源泉税」、「A：照合済残高振替払出」、「B：照合済残高振替受入」、「C：未照合残高振替払出」、「D：未照合残高振替受入」
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getApSttlPaySchdCtl(MCRow row) {
		MCList<MAM_STTL_R> rslt = MCList.create(MAM_STTL_R.class);
		MAM_STTL_R dbc = MAM_STTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getApSttlPaySchdCtl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ApSttlPaySchdCtl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ApSttlPaySchdCtl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getApSttlPaySchdCtl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ApSttlPaySchdCtl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getApSttlPaySchdCtl_SubColumns(row, down);
	}
	/** 
	  * ApSttlPaySchdCtl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getApSttlPaySchdCtl_Set(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ApSttlPaySchdCtlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ApSttlPaySchdCtl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getApSttlPaySchdCtl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ApSttlPaySchdCtl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getApSttlPaySchdCtl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getApSttlPaySchdCtl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ApSttlPaySchdCtlCols.outAll());
	}


	/** 
	  * StrgTgtReport:保存対象帳票<p>
	  * 保存対象帳票マスタから帳票ＩＤを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getStrgTgtReport(MCRow row) {
		MCList<MAM_STRG_TGT_REPORT_R> rslt = MCList.create(MAM_STRG_TGT_REPORT_R.class);
		MAM_STRG_TGT_REPORT_R dbc = MAM_STRG_TGT_REPORT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getStrgTgtReport_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.StrgTgtReport");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.StrgTgtReport").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getStrgTgtReport_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.StrgTgtReport");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getStrgTgtReport_SubColumns(row, down);
	}
	/** 
	  * StrgTgtReport:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getStrgTgtReport_Set(MCRow row, MCQueryApiBuilder builder, MAM_STRG_TGT_REPORT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, StrgTgtReportCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * StrgTgtReport:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getStrgTgtReport_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_STRG_TGT_REPORT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * StrgTgtReport:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getStrgTgtReport_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getStrgTgtReport_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(StrgTgtReportCols.outAll());
	}


	/** 
	  * ExtSysAc:外部システム（ＡＣ）<p>
	  * 外部システム区分が「5：会計」「A：会計（ＳＡＰ）」である外部システム情報を、外部システムマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getExtSysAc(MCRow row) {
		MCList<MAM_EXT_SYS_R> rslt = MCList.create(MAM_EXT_SYS_R.class);
		MAM_EXT_SYS_R dbc = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getExtSysAc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ExtSysAc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ExtSysAc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getExtSysAc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ExtSysAc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getExtSysAc_SubColumns(row, down);
	}
	/** 
	  * ExtSysAc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getExtSysAc_Set(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ExtSysAcCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ExtSysAc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getExtSysAc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_EXT_SYS_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ExtSysAc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getExtSysAc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getExtSysAc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ExtSysAcCols.outAll());
	}


	/** 
	  * Account:勘定科目<p>
	  * 会計システムで使用する科目情報を、勘定科目マスタから取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getAccount(MCRow row) {
		MCList<MAM_ACCOUNT_R> rslt = MCList.create(MAM_ACCOUNT_R.class);
		MAM_ACCOUNT_R dbc = MAM_ACCOUNT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getAccount_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Account");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Account").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getAccount_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Account");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getAccount_SubColumns(row, down);
	}
	/** 
	  * Account:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getAccount_Set(MCRow row, MCQueryApiBuilder builder, MAM_ACCOUNT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, AccountCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Account:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getAccount_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ACCOUNT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Account:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getAccount_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getAccount_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(AccountCols.outAll());
	}


	/** 
	  * Bp:取引先<p>
	  * 引数の検索区分（取引先入力補助検索区分）に対応する取引先情報を、取引先マスタから取得する<br>
・取引先名を「null」にする場合は、sundry_bp_nm_rem_flgを「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する<br>
・手入力時と存在チェック時に、チェック対象の取引先を参照取引先と比較する場合は、check_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBp(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Bp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Bp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Bp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBp_SubColumns(row, down);
	}
	/** 
	  * Bp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBp_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Bp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Bp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpCols.outAll());
	}


	/** 
	  * Dpt:部門<p>
	  * 引数の検索区分（部門入力補助検索区分）および適用日に対応する部門情報を、部門マスタから取得する<br>
・適用日を運用日付として部門情報を取得する場合は、mode_today_flgに「true」を指定する<br>
・検索枠で使用する場合は、mode_today_flg、dpt_nm_rem_flgの両方に「true」を指定する<br>
・担当者権限マスタに従い担当者の所属する部門に絞り込む場合は、usr_cdに担当者ＣＤを指定する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・更新権限付きのワーキンググループを持つ部門ＣＤのみを取得する場合は、wr_wg_flgに「true」を指定する<br>
・業務対象外部門に「true」を指定すると、部門マスタの〇〇部門フラグが全て「false」の部門を取得する<br>
・仕入直送にtrue、検索区分に「4：営業部門」を指定した場合は、売上部門に対応する場所を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDpt(MCRow row) {
		MCList<MAM_DPT_R> rslt = MCList.create(MAM_DPT_R.class);
		MAM_DPT_R dbc = MAM_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDpt_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Dpt");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Dpt").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDpt_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Dpt");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDpt_SubColumns(row, down);
	}
	/** 
	  * Dpt:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDpt_Set(MCRow row, MCQueryApiBuilder builder, MAM_DPT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DptCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Dpt:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDpt_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_DPT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Dpt:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDpt_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDpt_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DptCols.outAll());
	}


	/** 
	  * Loc:場所<p>
	  * 指定した検索区分（場所入力補助検索区分）に応じて、場所マスタから場所情報を取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getLoc(MCRow row) {
		MCList<MAM_LOC_R> rslt = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R dbc = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Loc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Loc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Loc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getLoc_SubColumns(row, down);
	}
	/** 
	  * Loc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, LocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Loc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_LOC_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Loc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(LocCols.outAll());
	}


	/** 
	  * Itm:品目<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから品目情報を取得する<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItm(MCRow row) {
		MCList<MAM_ITM__R> rslt = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R dbc = MAM_ITM__R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Itm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Itm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Itm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItm_SubColumns(row, down);
	}
	/** 
	  * Itm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Itm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM__R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Itm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmCols.outAll());
	}


	/** 
	  * Usr:担当者<p>
	  * 担当者マスタから担当者情報を取得する<br>
・担当者権限マスタの部門情報を付与する場合は、dtに適用日を指定する<br>
　担当者権限マスタの担当者情報を取得する場合は、referring_usr_acl_flgに「true」を指定し、dtに適用日を指定する<br>
　※これらの指定はサーバチェック時には無効
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getUsr(MCRow row) {
		MCList<MAM_USR_R> rslt = MCList.create(MAM_USR_R.class);
		MAM_USR_R dbc = MAM_USR_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getUsr_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.Usr");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.Usr").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getUsr_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.Usr");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getUsr_SubColumns(row, down);
	}
	/** 
	  * Usr:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getUsr_Set(MCRow row, MCQueryApiBuilder builder, MAM_USR_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, UsrCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * Usr:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getUsr_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_USR_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * Usr:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getUsr_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getUsr_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(UsrCols.outAll());
	}


	/** 
	  * SplnItm:販売計画品目<p>
	  * 販売計画品目マスタから販売計画品目情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getSplnItm(MCRow row) {
		MCList<MAM_SPLN_ITM_R> rslt = MCList.create(MAM_SPLN_ITM_R.class);
		MAM_SPLN_ITM_R dbc = MAM_SPLN_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getSplnItm_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.SplnItm");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.SplnItm").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getSplnItm_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.SplnItm");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getSplnItm_SubColumns(row, down);
	}
	/** 
	  * SplnItm:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getSplnItm_Set(MCRow row, MCQueryApiBuilder builder, MAM_SPLN_ITM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, SplnItmCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * SplnItm:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getSplnItm_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_SPLN_ITM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * SplnItm:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getSplnItm_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getSplnItm_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(SplnItmCols.outAll());
	}


	/** 
	  * ItmDtl:品目詳細<p>
	  * 品目詳細マスタから品目詳細情報を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtl(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtl_SubColumns(row, down);
	}
	/** 
	  * ItmDtl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtl_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlCols.outAll());
	}


	/** 
	  * ItmDtlPurcUpri:品目詳細（購買単価用）<p>
	  * 品目詳細マスタから品目詳細情報(購買単価に使用するもの)を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlPurcUpri(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlPurcUpri_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlPurcUpri");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlPurcUpri").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlPurcUpri_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlPurcUpri");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlPurcUpri_SubColumns(row, down);
	}
	/** 
	  * ItmDtlPurcUpri:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlPurcUpri_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlPurcUpriCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlPurcUpri:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlPurcUpri_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlPurcUpri:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlPurcUpri_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlPurcUpri_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlPurcUpriCols.outAll());
	}


	/** 
	  * ItmDtlProcUpri:品目詳細（加工単価用）<p>
	  * 品目詳細マスタから品目詳細情報(加工単価に使用するもの)を取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlProcUpri(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlProcUpri_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.ItmDtlProcUpri");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.ItmDtlProcUpri").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlProcUpri_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.ItmDtlProcUpri");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlProcUpri_SubColumns(row, down);
	}
	/** 
	  * ItmDtlProcUpri:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlProcUpri_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlProcUpriCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlProcUpri:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlProcUpri_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlProcUpri:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlProcUpri_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlProcUpri_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlProcUpriCols.outAll());
	}


	/** 
	  * BpView:取引先View<p>
	  * 引数の検索区分（取引先入力補助検索区分）に対応する取引先情報を、取引先マスタViewから取得する<br>
・取引先名を「null」にする場合は、sundry_bp_nm_rem_flgを「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する<br>
・手入力時と存在チェック時に、チェック対象の取引先を参照取引先と比較する場合は、check_rem_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getBpView(MCRow row) {
		MCList<MAVM_BP_R> rslt = MCList.create(MAVM_BP_R.class);
		MAVM_BP_R dbc = MAVM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getBpView_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MA.MAUAL0010.BpView");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MA.MAUAL0010.BpView").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getBpView_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MA.MAUAL0010.BpView");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getBpView_SubColumns(row, down);
	}
	/** 
	  * BpView:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getBpView_Set(MCRow row, MCQueryApiBuilder builder, MAVM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, BpViewCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * BpView:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getBpView_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * BpView:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getBpView_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getBpView_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(BpViewCols.outAll());
	}

}
