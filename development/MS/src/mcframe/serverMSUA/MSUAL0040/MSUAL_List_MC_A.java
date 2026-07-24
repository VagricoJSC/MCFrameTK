
package mcframe.serverMSUA.MSUAL0040;
import mcframe.commonCore.container.*;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;


//LOGIC_SETTING_IMPORT (START)
import mcframe.serverMS.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
//LOGIC_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MSUAL_List_MC_A extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {

	/** 
	  * ItmDtlMfgLoc:計画製造場所<p>
	  * 以下の引数に対尾する製造場所を、品目詳細マスタから取得する<br>
　品目、枝番１－３<br>
発注先、メーカ、依頼先場所が、ＮＵＬＬ文字のものを取得する<br>
・ワーキングループで絞り込む場合は、wg_cdにワーキングループを指定する<br>
・更新権限を持つ場所のみを取得する場合は、wr_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlMfgLoc(MCRow row) {
		MCList<MAVM_ITM_DTL_MFG_R> rslt = MCList.create(MAVM_ITM_DTL_MFG_R.class);
		MAVM_ITM_DTL_MFG_R dbc = MAVM_ITM_DTL_MFG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlMfgLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlMfgLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlMfgLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlMfgLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlMfgLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlMfgLoc_SubColumns(row, down);
	}
	/** 
	  * ItmDtlMfgLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlMfgLoc_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlMfgLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlMfgLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlMfgLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlMfgLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlMfgLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlMfgLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlMfgLocCols.outAll());
	}


	/** 
	  * ItmDtlBomPtn:計画製造構成パタン<p>
	  * 以下の引数に対応する構成パタンを、品目詳細マスタから取得する<br>
　適用日、品目、枝番１－３、ワーキンググループ、製造場所<br>
発注先、メーカ、依頼先場所が、ＮＵＬＬ文字のものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlBomPtn(MCRow row) {
		MCList<MAVM_ITM_DTL_MFG_R> rslt = MCList.create(MAVM_ITM_DTL_MFG_R.class);
		MAVM_ITM_DTL_MFG_R dbc = MAVM_ITM_DTL_MFG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlBomPtn_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlBomPtn");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlBomPtn").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlBomPtn_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlBomPtn");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlBomPtn_SubColumns(row, down);
	}
	/** 
	  * ItmDtlBomPtn:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlBomPtn_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlBomPtnCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlBomPtn:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlBomPtn_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_MFG_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlBomPtn:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlBomPtn_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlBomPtn_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlBomPtnCols.outAll());
	}


	/** 
	  * ItmDtlRqstLoc:依頼先場所<p>
	  * 依頼先場所を取得する<br>
・ワーキンググループ内の依頼先場所を取得する（場所マスタから取得する）場合は、以下の値を指定する<br>
　　itm_ord_typに「4：移送」を指定する<br>
　　strg_loc_cdに格納場所を指定する<br>
　　適用日で絞り込む場合は、master_dtに適用日を指定する<br>
・ワーキングループ間の依頼先場所を取得する（品目詳細マスタ（ＷＧ間依頼）ビューから取得する）場合は、以下の値を指定する<br>
　　itm_ord_typに「5：ＷＧ間移送」を指定する<br>
　　itm_cd、itm_sub1－3に、品目、枝番１－３を指定する<br>
　　wg_cdにワーキンググループを指定する<br>
　　strg_loc_cdに格納場所を指定する<br>
　　※製造場所、構成パタン、発注先、メーカが、ＮＵＬＬ文字のものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlRqstLoc(MCRow row) {
		MCList<MAVM_ITM_DTL_RQST_R> rslt = MCList.create(MAVM_ITM_DTL_RQST_R.class);
		MAVM_ITM_DTL_RQST_R dbc = MAVM_ITM_DTL_RQST_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlRqstLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlRqstLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlRqstLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlRqstLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlRqstLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlRqstLoc_SubColumns(row, down);
	}
	/** 
	  * ItmDtlRqstLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlRqstLoc_Set(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_RQST_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlRqstLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlRqstLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlRqstLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAVM_ITM_DTL_RQST_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlRqstLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlRqstLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlRqstLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlRqstLocCols.outAll());
	}


	/** 
	  * DivSeq:製造指図ＮＯ分割枝番<p>
	  * 製造指図・実績ビューから、引数の製造指図ＮＯに対応する分割連番などの情報を取得する<br>
製造指図・実績ビュー：品目製造指図、製造指図、製造指図進捗（＝分割連番が0の製造実績残）、製造実績の４つのビューを結合したビュー
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getDivSeq(MCRow row) {
		MCList<MSVT_MFG_INST_ACT_R> rslt = MCList.create(MSVT_MFG_INST_ACT_R.class);
		MSVT_MFG_INST_ACT_R dbc = MSVT_MFG_INST_ACT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getDivSeq_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.DivSeq");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.DivSeq").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getDivSeq_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.DivSeq");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getDivSeq_SubColumns(row, down);
	}
	/** 
	  * DivSeq:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getDivSeq_Set(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, DivSeqCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * DivSeq:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getDivSeq_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * DivSeq:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getDivSeq_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getDivSeq_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(DivSeqCols.outAll());
	}


	/** 
	  * MpsItmGrp:ＭＰＳ品目グループ<p>
	  * 以下の引数に対応するＭＰＳグループ情報を、ＭＰＳ品目マスタから取得する<br>
　品目、枝番１－３、ワーキンググループ
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getMpsItmGrp(MCRow row) {
		MCList<MAM_MPS_ITM_R> rslt = MCList.create(MAM_MPS_ITM_R.class);
		MAM_MPS_ITM_R dbc = MAM_MPS_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getMpsItmGrp_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.MpsItmGrp");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.MpsItmGrp").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getMpsItmGrp_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.MpsItmGrp");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getMpsItmGrp_SubColumns(row, down);
	}
	/** 
	  * MpsItmGrp:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getMpsItmGrp_Set(MCRow row, MCQueryApiBuilder builder, MAM_MPS_ITM_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, MpsItmGrpCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * MpsItmGrp:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getMpsItmGrp_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_MPS_ITM_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * MpsItmGrp:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getMpsItmGrp_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getMpsItmGrp_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(MpsItmGrpCols.outAll());
	}


	/** 
	  * ItmOperLoc:品目工程場所<p>
	  * 以下の引数に対応する場所を、品目工程マスタから取得する<br>
　品目、枝番１－３、工程パタン、工程、工程連番、適用日
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmOperLoc(MCRow row) {
		MCList<MAM_ITM_OPER_R> rslt = MCList.create(MAM_ITM_OPER_R.class);
		MAM_ITM_OPER_R dbc = MAM_ITM_OPER_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmOperLoc_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmOperLoc");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmOperLoc").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmOperLoc_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmOperLoc");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmOperLoc_SubColumns(row, down);
	}
	/** 
	  * ItmOperLoc:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmOperLoc_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmOperLocCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmOperLoc:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmOperLoc_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_OPER_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmOperLoc:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmOperLoc_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmOperLoc_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmOperLocCols.outAll());
	}


	/** 
	  * ItmDtlSub1WithSpplMaker:品目詳細（枝番１、発注先、メーカ）<p>
	  * 品目詳細マスタから、枝番１と品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSub1WithSpplMaker(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSub1WithSpplMaker_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlSub1WithSpplMaker");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlSub1WithSpplMaker").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSub1WithSpplMaker_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlSub1WithSpplMaker");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSub1WithSpplMaker_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSub1WithSpplMaker:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSub1WithSpplMaker_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSub1WithSpplMakerCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSub1WithSpplMaker:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSub1WithSpplMaker_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSub1WithSpplMaker:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSub1WithSpplMaker_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSub1WithSpplMaker_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSub1WithSpplMakerCols.outAll());
	}


	/** 
	  * ItmDtlSub2WithSpplMaker:品目詳細（枝番２、発注先、メーカ）<p>
	  * 品目詳細マスタから、枝番２と品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSub2WithSpplMaker(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSub2WithSpplMaker_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlSub2WithSpplMaker");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlSub2WithSpplMaker").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSub2WithSpplMaker_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlSub2WithSpplMaker");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSub2WithSpplMaker_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSub2WithSpplMaker:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSub2WithSpplMaker_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSub2WithSpplMakerCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSub2WithSpplMaker:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSub2WithSpplMaker_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSub2WithSpplMaker:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSub2WithSpplMaker_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSub2WithSpplMaker_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSub2WithSpplMakerCols.outAll());
	}


	/** 
	  * ItmDtlSub3WithSpplMaker:品目詳細（枝番３、発注先、メーカ）<p>
	  * 品目詳細マスタから、枝番３と品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSub3WithSpplMaker(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSub3WithSpplMaker_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlSub3WithSpplMaker");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlSub3WithSpplMaker").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSub3WithSpplMaker_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlSub3WithSpplMaker");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSub3WithSpplMaker_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSub3WithSpplMaker:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSub3WithSpplMaker_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSub3WithSpplMakerCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSub3WithSpplMaker:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSub3WithSpplMaker_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSub3WithSpplMaker:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSub3WithSpplMaker_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSub3WithSpplMaker_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSub3WithSpplMakerCols.outAll());
	}


	/** 
	  * MfgInstNo:製造指図ＮＯ<p>
	  * 製造指図ＮＯに関連した情報を、製造指図・実績ビューから取得する<br>
製造指図・実績ビュー：品目製造指図、製造指図、製造指図進捗（＝分割連番が0の製造実績残）、製造実績の４つのビューを結合したビュー<br>
以下の引数の全てを指定しない場合は空のリストを返す<br>
　指図保存、指図済、着手中、完了
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getMfgInstNo(MCRow row) {
		MCList<MSVT_MFG_INST_ACT_R> rslt = MCList.create(MSVT_MFG_INST_ACT_R.class);
		MSVT_MFG_INST_ACT_R dbc = MSVT_MFG_INST_ACT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getMfgInstNo_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.MfgInstNo");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.MfgInstNo").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getMfgInstNo_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.MfgInstNo");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getMfgInstNo_SubColumns(row, down);
	}
	/** 
	  * MfgInstNo:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getMfgInstNo_Set(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, MfgInstNoCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * MfgInstNo:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getMfgInstNo_AfterSelect(MCRow row, MCQueryApiBuilder builder, MSVT_MFG_INST_ACT_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * MfgInstNo:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getMfgInstNo_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getMfgInstNo_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(MfgInstNoCols.outAll());
	}


	/** 
	  * ItmDtlSppl:発注先（品目詳細）<p>
	  * 品目詳細マスタから発注先を取得する<br>
発注先に対応するもののうち、製造場所、構成パタン、依頼先場所が、ＮＵＬＬ文字のものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlSppl(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlSppl_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlSppl");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlSppl").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlSppl_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlSppl");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlSppl_SubColumns(row, down);
	}
	/** 
	  * ItmDtlSppl:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlSppl_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlSpplCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlSppl:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlSppl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlSppl:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlSppl_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlSppl_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlSpplCols.outAll());
	}


	/** 
	  * ItmDtlMaker:メーカ（品目詳細）<p>
	  * 引数の発注先に対応するメーカを、品目詳細マスタから取得する<br>
　製造場所、構成パタン、依頼先場所が、ＮＵＬＬ文字のものを取得する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlMaker(MCRow row) {
		MCList<MAM_BP_R> rslt = MCList.create(MAM_BP_R.class);
		MAM_BP_R dbc = MAM_BP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlMaker_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlMaker");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlMaker").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlMaker_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlMaker");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlMaker_SubColumns(row, down);
	}
	/** 
	  * ItmDtlMaker:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlMaker_Set(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlMakerCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlMaker:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlMaker_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_BP_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlMaker:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlMaker_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlMaker_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlMakerCols.outAll());
	}


	/** 
	  * ItmDtlWithSpplMaker:品目詳細（発注先、メーカ）<p>
	  * 品目詳細マスタから品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row クライアントから渡されるRowコンテナ
	  */
	public MCList<MCRow> getItmDtlWithSpplMaker(MCRow row) {
		MCList<MAM_ITM_DTL_R> rslt = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R dbc = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		getItmDtlWithSpplMaker_Set(row, builder, dbc, rslt);//DBコンテナの設定
		listlogicCommon_Set(row, builder,"MS.MSUAL0040.ItmDtlWithSpplMaker");
		MCList<MCRow> mergebinds = MCList.create(MCRow.class);
		mergebinds.add(builder.getMergeBind());
		builder.buildSelect("MS.MSUAL0040.ItmDtlWithSpplMaker").executeQuery(row, mergebinds, rslt);
		MCList<? extends MCRow> down = getItmDtlWithSpplMaker_AfterSelect(row, builder, dbc, rslt);//検索結果の修正
		down = listlogicCommon_AfterSelect(row, rslt, down,"MS.MSUAL0040.ItmDtlWithSpplMaker");
		if(FXUCL_DataUtil.isNull(down)) return null;
		return getItmDtlWithSpplMaker_SubColumns(row, down);
	}
	/** 
	  * ItmDtlWithSpplMaker:DBコンテナの設定<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideしてSQL文をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  */
	protected void getItmDtlWithSpplMaker_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		boolean isForeignEQ = false;
		String[] ss = FXBAL_MCRLUtil.setSelectAndFrom(builder, ItmDtlWithSpplMakerCols.outAll(),isForeignEQ);
		if(ss != null && 0< ss.length){
			MCPermColumn column = builder.getBaseDbc().getColumn$(ss[0]);
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(column, bind("1")), row.getValueNE(FXBAC_ListLogicBase.$INPUT_VAL));
		}
	}
	/** 
	  * ItmDtlWithSpplMaker:検索結果の修正<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果をカスタマイズする。
	  * @param row クライアントから渡されるRowコンテナ
	  * @param builder MCQueryAPIBuilder
	  * @param dbc MCDBContainer
	  * @param result 検索結果を保持するListコンテナ
	  * @return 編集後のListコンテナ
	  */
	protected MCList<?> getItmDtlWithSpplMaker_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result){
		return (MCList<?>)result;
	}
	/** 
	  * ItmDtlWithSpplMaker:検索結果のカラムの選択<p>
	  * 定義書でDBコンテナを指定している場合、このメソッドをOverrideして検索結果のカラムをカスタマイズする。
	  * @param row 検索結果を保持するListコンテナ
	  * @param down 検索結果を保持するDBコンテナ
	  * @return getItmDtlWithSpplMaker_AfterSelectメソッドの戻り値
	  */
	protected MCList<MCRow> getItmDtlWithSpplMaker_SubColumns(MCRow row, MCList<?> down){
		return down.subColumns(ItmDtlWithSpplMakerCols.outAll());
	}

}
