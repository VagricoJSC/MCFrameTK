package mcframe.serverMGBD.MGBDL0640;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBD.MGBDL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CostItmCopyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CostItmCopyReg_MC extends MGBDL_CostItmCopyReg_MC_A{
	//FMCB CUSTOM START
	protected static final String INLINE_ALIAS_PREFIX = "M";
	protected static final String COUNT = "cnt";
	protected static final String CACL_CTG_CD = DtlR.$calc_ctg_cd;
	protected static final String TERM = DtlR.$term;
	protected static final String DEL_FLG = DtlR.$del_flg;
	protected static final String FIX_FLG = MGT_ITM_R.$fix_flg;
	protected static final String RELEASE_FLG = DtlR.$release_flg;
	protected static final String COPY_FLG_PREFIX = DtlR.$copy_mam_itm_.substring(0, 5);

	protected String[] getCntColNames(){
		return new String[]{
			DtlR.$mgt_itm,
			DtlR.$mgt_itm_dtl,
			DtlR.$mgt_itm_oper,
			DtlR.$mgt_bom,
			DtlR.$mgt_itm_wk,
			DtlR.$mgt_itm_purc,
			DtlR.$mgt_itm_proc,
			DtlR.$mgt_itm_prov,
			DtlR.$mgt_itm_sls,
			DtlR.$mgt_itm_fix
		};
	}

	protected String getCalcCtgCdColNm(MCDBContainer dbc){
		return CACL_CTG_CD;
	}

	protected String getTermColNm(MCDBContainer dbc){
		return TERM;
	}

	protected String getItmCdColPre(MCDBContainer dbc){
		if (dbc instanceof MGT_BOM_R) {
			return "par_";
		}
		return "";
	}

	protected boolean hasCalcCtgCdCol(MCDBContainer dbc){
		return true ;
	}

	protected boolean hasFixFlgCol(MCDBContainer dbc) {
		return dbc instanceof MGT_ITM_R;
	}

	protected boolean hasTermCol(MCDBContainer dbc){
		return !(dbc instanceof MGT_CALC_ITM_R);
	}

	protected String getTableLocaleName(String tableName) {
		String t = getDBLabel(tableName, null, getUsrLocale());
		if (t != null) {
			return t;
		}
		return tableName;
	}

	/**
	 * CostItmCopy_Chk01オペレーション.<p>
	 *
	 * コピー前のチェックをする。<br>
	 */
	public class CostItmCopy_Chk01 extends MGBDL_CostItmCopyReg_MC_A.CostItmCopy_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();
			MCList<DtlR> up = getChkList(up0());
			up.forEach(u -> chkSub(ml, u));
			return ml;
		}

		protected void chkSub(MCMessageList ml, DtlR up) {
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();

			if (isNull(up.dest_itm_cd())) {
				ml.addAll(check(up, DtlR.$dest_itm_cd, rv));
			}

			if (isSame(up.itm_cd(), up.dest_itm_cd())
					 && isSame(up.itm_sub1(), up.dest_itm_sub1())
					 && isSame(up.itm_sub2(), up.dest_itm_sub2())
					 && isSame(up.itm_sub3(), up.dest_itm_sub3())) {
				ml.add(new MCMessage(up, DtlR.$dest_itm_cd, MABCL0265, toDispGUIIndex(up)));
			}

			if (!isSameAttribute(up)) {
					ml.add(new MCMessage(MABCL0266,
							toDispItm(up.dest_itm_cd(), up.dest_itm_sub1(),
									up.dest_itm_sub2(), up.dest_itm_sub3()),
							toDispItm(up.itm_cd(), up.itm_sub1(),
									up.itm_sub2(), up.itm_sub3()),
							toDispGUIIndex(up)));
			}
		}

		protected boolean isSameAttribute(DtlR up) {
			return isSame(up.base_unit_cd(), up.dest_base_unit_cd()) &&
					isSame(up.stk_mng_typ(), up.dest_stk_mng_typ()) &&
					isSame(up.asset_mng_typ(), up.dest_asset_mng_typ());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * CostItmCopy_Chk02オペレーション.<p>
	 *
	 * 削除前のチェックをする。<br>
	 */
	public class CostItmCopy_Chk02 extends MGBDL_CostItmCopyReg_MC_A.CostItmCopy_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(
				MCNumber paramIndex,
				MCList<E> chkTarL,
				String chkTarCol, String listLogicId,
				String listIn, String listInBase,
				String listOut, String listOutBase) {
			//削除時はコピー先のチェックは不要
			if (isSame(DtlR.$dest_itm_sub3, chkTarCol)) {
				return new MCMessageList();
			}
 			return super.doSvrChkListLogicMain(paramIndex, chkTarL, chkTarCol, listLogicId, listIn,
					listInBase, listOut, listOutBase);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkSub());
			return msgL;
		}

		protected MCMessageList chkSub() {
			MCMessageList msgL = new MCMessageList();
			//確定されている行は対象外にする
			MCList<MGT_ITM_R> d = MCList.create(MGT_ITM_R.class);
			selectFixItm(d, up0());
			MCIndexKey k =  d.createIndex(getDbcKey(d));
			String[] upSrcKeys = getUpKey(d, true);
			up0().forEach(r->{
				Comparable<?>[] srcVal = getKeyVal(d, r, upSrcKeys);
				if (!isNull(d.getFirst(k, srcVal))) {
					msgL.add(new MCMessage(r, null, MGBDL0023, toDispGUIIndex(r)));
				}
			});
			return msgL;
		}

		/**
		 * 削除対象の未確定品目を検索する。
		 * @param src ＤＢコンテナ
		 * @param up 上り電文
		 */
		protected void selectFixItm(MCList<MGT_ITM_R> rslt, DtlL<DtlR> up) {
			MCDBContainer T = rslt.createRow();
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(T);
			MCBooleanPermColumn fixFlg = (MCBooleanPermColumn) T.getColumn$("fix_flg");
			setWhere(builder, true);
			builder.addWhereWithAnd(fixFlg.eq(value(true)));
			dbSelect(createSqlId(getLogicID(), T, "selectFixItm_select"), rslt, builder, up);
		}
	}

	/**
	 * CostItmCopy_Ins01オペレーション.<p>
	 *
	 * 原価品目系情報をコピーする。<br>
	 */
	public class CostItmCopy_Ins01 extends MGBDL_CostItmCopyReg_MC_A.CostItmCopy_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCopyOth();
		}

		protected void doCopyOth() {
			for(MCController c : getSubOpes(PI)) {
				if(c instanceof MCDBSubOperation){
					MCDBSubOperation<?> subOpe = (MCDBSubOperation<?>) c;
					copyRecords(subOpe, up0());
				}
			}
		}

		protected void copyRecords(MCDBSubOperation<?> subOpe, DtlL<DtlR> up) {
			MCDBContainer dbc = subOpe.dbc();
			DtlL<DtlR> tgt = up.subList(r ->isTgt(dbc, r));

			if (!isNull(tgt)){
				selectSrc(subOpe, tgt);
				cnvSrcToDest(subOpe, tgt);
				insertEx(subOpe);
			}
		}
		
		protected void insertEx(MCDBSubOperation<?> subOpe){
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(subOpe.dbc());
			dbInsertEx(createSqlId(getLogicID(), builder.getBaseDbc(), "insertEx_insert1"), subOpe.up1, builder);
		}

		/**
		 * コピー先データを作成する。<p>
		 * コピー元データをコピー先データに変更する。<br>
		 * コピー先データが存在する場合はリストから削除する。
		 * @param src コピー元データ
		 * @param up 上り電文コンテナ
		 */
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void cnvSrcToDest(MCDBSubOperation<?> subOpe, DtlL<DtlR> up) {
			MCList src = subOpe.up1;

			//既存データ
			MCList<? extends MCDBContainer> existDest = src.createInstance();
			selectDest(existDest, up);

			//getUpKeyとgetDbcKeyの戻り値項目の並びは同じ前提
			String[] upSrcKeys = getUpKey(src, true);
			String[] upDestKeys = getUpKey(src, false);
			String[] dbcKeys = getDbcKey(src);
			MCIndexKey srcK = src.createIndex(dbcKeys);
			MCIndexKey edk = existDest.createIndex(dbcKeys);

			//srcを登録対象で入れ替える。
			MCList<? extends MCDBContainer> newSrc = src.createInstance();
			MCDBContainer dbc = newSrc.createRow();
			boolean isItm = hasFixFlgCol(dbc);

			up.forEach(u -> {
				Comparable<?>[] destVal = getKeyVal(src, u, upDestKeys);

				if (existDest.contains(edk, destVal)){
					return;
				}

				Comparable<?>[] srcVal = getKeyVal(src, u, upSrcKeys);
				MCList sl = src.subList(srcK, srcVal);
				MCList nsl = sl.clone();

				for(int i = 0 ; i < destVal.length ; i++) {
					nsl.setValue(dbcKeys[i], destVal[i]);
				}
				//原価品目情報は特別処理
				if (isItm){
					nsl.setBooleanNE(MGT_ITM_R.$fix_flg, false);
				}
				newSrc.addAll(nsl);
			});
			src.setAll(newSrc);
		}
	}

	/**
	 * CostItmCopy_Del01オペレーション.<p>
	 *
	 * 原価品目系情報を削除する。<br>
	 */
	public class CostItmCopy_Del01 extends MGBDL_CostItmCopyReg_MC_A.CostItmCopy_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doDelOth();
		}

		protected void doDelOth() {
			for(MCController c : getSubOpes(PI)) {
				if(c instanceof MCDBSubOperation){
					MCDBSubOperation<?> subOpe = (MCDBSubOperation<?>) c;
					deleteRecords(subOpe, up0());
				}
			}
		}

		protected void deleteRecords(MCDBSubOperation<?> subOpe, DtlL<DtlR> up) {
			MCDBContainer dbc = subOpe.dbc();
			DtlL<DtlR> tgt = up.subList(r ->isDelTgt(dbc, r));

			if (!isNull(tgt)){
				selectSrc(subOpe, tgt);
				delete(subOpe);
			}
		}

		protected boolean isDelTgt(MCDBContainer dbc, DtlR up) {
			return true;
		}

		protected void delete(MCDBSubOperation<?> subOpe){
			MCDBContainer dbc = subOpe.dbc();
			subOpe.up1.sort(dbc.getKeyColumn());
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			dbDeleteKey(createSqlId(getLogicID(), dbc, "delete_delete"), subOpe.up1, builder);
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価品目系情報をコピーする。(画面用)<br>
	 */
	public class Ins01 extends MGBDL_CostItmCopyReg_MC_A.Ins01 {
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		protected void setDown() {
			// 何もしない
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void doIt() {
			MCList<DtlR> up = up0();
			callThisChk(up);
			MCList<DtlR> list =getChkList(up);
			callSrv(list);
		}

		protected void callThisChk(MCList<DtlR> up) {
			MGBDL_CostItmCopyReg.CostItmCopy_Chk01 o = MGBDL_CostItmCopyReg.crtCostItmCopy_Chk01();
			o.up0().setAll(up);
			o.exec();
		}

		protected void callSrv(MCList<DtlR> up) {
			MGBDL_CostItmCopyReg.CostItmCopy_Ins01 o = MGBDL_CostItmCopyReg.crtCostItmCopy_Ins01();
			o.up0().setAll(up);
			o.exec();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価品目系情報を削除する。(画面用)<br>
	 */
	public class Del01 extends MGBDL_CostItmCopyReg_MC_A.Del01 {
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void doIt() {
			MCList<DtlR> up = up0();
			callThisChk(up);
			MCList<DtlR> list =getChkList(up);
			callSrv(list);
		}

		protected void callThisChk(MCList<DtlR> up) {
			MGBDL_CostItmCopyReg.CostItmCopy_Chk02 o = MGBDL_CostItmCopyReg.crtCostItmCopy_Chk02();
			o.up0().setAll(up);
			o.exec();
		}

		protected void callSrv(MCList<DtlR> up) {
			MGBDL_CostItmCopyReg.CostItmCopy_Del01 o = MGBDL_CostItmCopyReg.crtCostItmCopy_Del01();
			o.up0().setAll(up);
			o.exec();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目を検索する。<br>
	 */
	public class Srch01 extends MGBDL_CostItmCopyReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			selectItm(up0(), down0(), this, getSubOpes(PI));
			setStaticValue(up0(), down0());
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 参照品目検索する。<br>
	 */
	public class Srch02 extends MGBDL_CostItmCopyReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			selectItm(up0(), down0(), this, getSubOpes(PI));
			setStaticValue(up0(), down0());
		}
	}

	/**
	 * 品目を検索します。
	 * @param up 上り電文（検索条件）
	 * @param down 品目マスタコンテナ
	 * @param ope オペレーションＩＤ
	 * @param subOpes　サブオペレーション
	 */
	protected void selectItm(CndR up, DtlL<DtlR> down, MCOperation ope, List<MCController> subOpes) {
		//検索条件は常に結合元品目を対象とする
		//品目系情報の件数はコピー元品目のものとする
		MAM_ITM_R dbc = down.createRow();
		dbc.setAlias("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);

		String srcItmAlias = getMainAlias(ope, builder);
		setItmColSql(up, down, ope, srcItmAlias, builder);
		addSubCntSql(up, down, subOpes, srcItmAlias, builder);
		addFlgWhere(up, builder);
		addItmGrpWhere(up, builder);
		setOrderBy(ope, srcItmAlias, builder);
		select(up, down, builder);
	}

	protected void setOrderBy(MCOperation ope, String mainAlias,
			MCQueryApiBuilder builder) {
		MAM_ITM_R T = (MAM_ITM_R) builder.getBaseDbc();
		if (isRefSrch(ope)) {
			MAM_ITM_R M = MAM_ITM_R.create(mainAlias);
			builder.setOrderByAsc(M.itm_typ, M.itm_typ_d_cd, M.itm_jnl_cd, T.ref_itm_cd,
					T.ref_itm_sub1, T.ref_itm_sub2, T.ref_itm_sub3, T.itm_cd, T.itm_sub1,
					T.itm_sub2, T.itm_sub3);
		}
		else {
			builder.setOrderByAsc(T.itm_typ, T.itm_typ_d_cd, T.itm_jnl_cd, T.itm_cd,
					T.itm_sub1, T.itm_sub2, T.itm_sub3);
		}
	}

	/**
	 * 品目関連項目を追加します。<p>
	 * 参照登録かどうかを判断し、sql文を加工します。
	 * @param up 上り電文（検索条件）
	 * @param down 品目マスタコンテナ
	 * @param ope オペレーションＩＤ
	 * @param mainAlias コピー元品目テーブルの別名
	 * @param builder クエリAPIビルダー
	 */
	protected void setItmColSql(CndR up, DtlL<DtlR> down, MCOperation ope, String mainAlias, MCQueryApiBuilder builder){
		builder.clearSelect();
		MAM_ITM_R T = (MAM_ITM_R) builder.getBaseDbc();
		MAM_ITM_TYP_D_R TYP_D_S = MAM_ITM_TYP_D_R.create("TYP_D_S");
		MAM_ITM_JNL_R JNL_S = MAM_ITM_JNL_R.create("JNL_S");
		MAM_ITM_TYP_D_R TYP_D_W = MAM_ITM_TYP_D_R.create("TYP_D_W");
		MAM_ITM_JNL_R JNL_W = MAM_ITM_JNL_R.create("JNL_W");

		if (isRefSrch(ope)) {
			MAM_ITM_R M = MAM_ITM_R.create(mainAlias);
			builder.addInnerJoin(M,
					T.ref_itm_cd.eq(M.itm_cd).and(T.ref_itm_sub1.eq(M.itm_sub1))
							.and(T.ref_itm_sub2.eq(M.itm_sub2))
							.and(T.ref_itm_sub3.eq(M.itm_sub3)));
			//参照品目がコピー元
			builder.addSelect("itm_cd", T.ref_itm_cd);
			builder.addSelect("itm_sub1", T.ref_itm_sub1);
			builder.addSelect("itm_sub2", T.ref_itm_sub2);
			builder.addSelect("itm_sub3", T.ref_itm_sub3);
			//品目はコピー先
			builder.addSelect("dest_itm_cd", T.itm_cd);
			builder.addSelect("dest_itm_sub1", T.itm_sub1);
			builder.addSelect("dest_itm_sub2", T.itm_sub2);
			builder.addSelect("dest_itm_sub3", T.itm_sub3);
			builder.addSelect("dest_itm_nm", T.itm_nm);

			builder.addSelect("del_flg", M.del_flg);
			builder.addSelect("itm_nm", M.itm_nm);
			builder.addSelect("base_itm_nm", M.base_itm_nm);
			builder.addSelect("itm_typ", M.itm_typ);
			builder.addSelect("itm_typ_d_cd", M.itm_typ_d_cd);
			builder.addSelect("itm_jnl_cd", M.itm_jnl_cd);

			addJoinItmTypD(M, TYP_D_S, builder);
			addJoinJnl(M, JNL_S, builder);
		}
		else {
			builder.addSelect(T.itm_cd, T.itm_sub1, T.itm_sub2, T.itm_sub3, T.del_flg,
					T.itm_nm, T.base_itm_nm, T.itm_typ, T.itm_typ_d_cd, T.itm_jnl_cd);

			addJoinItmTypD(T, TYP_D_S, builder);
			addJoinJnl(T, JNL_S, builder);
		}

		builder.addSelect("itm_typ_d_nm", TYP_D_S.itm_typ_d_nm);
		builder.addSelect("itm_jnl_nm", JNL_S.itm_jnl_nm);

		//検索条件は常に結合元品目
		addJoinItmTypD(T, TYP_D_W, builder);
		addJoinJnl(T, JNL_W, builder);

		builder.addWhereWithCutOffAnd(T.itm_cd.like(bind(CndR.$itm_cd)));
		builder.addWhereWithCutOffAnd(T.itm_sub1.like(bind(CndR.$itm_sub1)));
		builder.addWhereWithCutOffAnd(T.itm_sub2.like(bind(CndR.$itm_sub2)));
		builder.addWhereWithCutOffAnd(T.itm_sub3.like(bind(CndR.$itm_sub3)));
		builder.addWhereWithCutOffAnd(T.itm_nm.like(bind(CndR.$itm_nm)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd1.like(bind(CndR.$itm_grp_cd1)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd2.like(bind(CndR.$itm_grp_cd2)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd3.like(bind(CndR.$itm_grp_cd3)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd4.like(bind(CndR.$itm_grp_cd4)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd5.like(bind(CndR.$itm_grp_cd5)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd6.like(bind(CndR.$itm_grp_cd6)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd7.like(bind(CndR.$itm_grp_cd7)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd8.like(bind(CndR.$itm_grp_cd8)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd9.like(bind(CndR.$itm_grp_cd9)));
		builder.addWhereWithCutOffAnd(T.itm_grp_cd10.like(bind(CndR.$itm_grp_cd10)));

		builder.addWhereWithCutOffAnd(T.itm_typ.like(bind(CndR.$itm_typ)));
		builder.addWhereWithCutOffAnd(T.itm_typ_d_cd.like(bind(CndR.$itm_typ_d_cd)));
		builder.addWhereWithCutOffAnd(TYP_D_W.itm_typ_d_nm.like(bind(CndR.$itm_typ_d_nm)));
		builder.addWhereWithCutOffAnd(T.itm_jnl_cd.like(bind(CndR.$itm_jnl_cd)));
		builder.addWhereWithCutOffAnd(JNL_W.itm_jnl_nm.like(bind(CndR.$itm_jnl_nm)));
	}

	protected void addJoinItmTypD(MAM_ITM_R T, MAM_ITM_TYP_D_R S,
			MCQueryApiBuilder builder) {
		builder.addLeftOuterJoin(S,
				T.itm_typ.eq(S.itm_typ).and(T.itm_typ_d_cd.eq(S.itm_typ_d_cd)));
	}

	protected void addJoinJnl(MAM_ITM_R T, MAM_ITM_JNL_R S, MCQueryApiBuilder builder) {
		builder.addLeftOuterJoin(S, T.itm_jnl_cd.eq(S.itm_jnl_cd));
	}

	/**
	 * フラグ項目のwhere句を追加します。
	 * @param up 上り電文（検索条件）
	 * @param builder クエリAPIビルダー
	 */
	protected void addFlgWhere(CndR up, MCQueryApiBuilder builder) {
		MAM_ITM_R dbc = (MAM_ITM_R)builder.getBaseDbc();
		if (up.del_flg_on() != up.del_flg_off()) {
			builder.addWhereWithAnd(dbc.del_flg.eq(bind(CndR.$del_flg_on)));
		}
		if (up.release_flg_on() != up.release_flg_off()) {
			builder.addWhereWithAnd(dbc.release_flg.eq(bind(CndR.$release_flg_on)));
		}
	}

	/**
	 * 品目分類のwhere句を追加します。
	 * @param up 上り電文（検索条件）
	 * @param builder クエリAPIビルダー
	 */
	protected void addItmGrpWhere(CndR up, MCQueryApiBuilder builder) {
		MAM_ITM_R dbc = (MAM_ITM_R)builder.getBaseDbc();
		if(!isNull(up.itm_grp_nm1())) {
			MAM_ITM_GRP_R IG1 = MAM_ITM_GRP_R.create("IG1");
			builder.addLeftOuterJoin(IG1, dbc.itm_grp_cd1.eq(IG1.itm_grp_cd).and(IG1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(IG1.itm_grp_nm.like(bind(CndR.$itm_grp_nm1)));
		}
		if(!isNull(up.itm_grp_nm2())) {
			MAM_ITM_GRP_R IG2 = MAM_ITM_GRP_R.create("IG2");
			builder.addLeftOuterJoin(IG2, dbc.itm_grp_cd2.eq(IG2.itm_grp_cd).and(IG2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(IG2.itm_grp_nm.like(bind(CndR.$itm_grp_nm2)));
		}
		if(!isNull(up.itm_grp_nm3())) {
			MAM_ITM_GRP_R IG3 = MAM_ITM_GRP_R.create("IG3");
			builder.addLeftOuterJoin(IG3, dbc.itm_grp_cd3.eq(IG3.itm_grp_cd).and(IG3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(IG3.itm_grp_nm.like(bind(CndR.$itm_grp_nm3)));
		}
		if(!isNull(up.itm_grp_nm4())) {
			MAM_ITM_GRP_R IG4 = MAM_ITM_GRP_R.create("IG4");
			builder.addLeftOuterJoin(IG4, dbc.itm_grp_cd4.eq(IG4.itm_grp_cd).and(IG4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(IG4.itm_grp_nm.like(bind(CndR.$itm_grp_nm4)));
		}
		if(!isNull(up.itm_grp_nm5())) {
			MAM_ITM_GRP_R IG5 = MAM_ITM_GRP_R.create("IG5");
			builder.addLeftOuterJoin(IG5, dbc.itm_grp_cd5.eq(IG5.itm_grp_cd).and(IG5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(IG5.itm_grp_nm.like(bind(CndR.$itm_grp_nm5)));
		}
		if(!isNull(up.itm_grp_nm6())) {
			MAM_ITM_GRP_R IG6 = MAM_ITM_GRP_R.create("IG6");
			builder.addLeftOuterJoin(IG6, dbc.itm_grp_cd6.eq(IG6.itm_grp_cd).and(IG6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(IG6.itm_grp_nm.like(bind(CndR.$itm_grp_nm6)));
		}
		if(!isNull(up.itm_grp_nm7())) {
			MAM_ITM_GRP_R IG7 = MAM_ITM_GRP_R.create("IG7");
			builder.addLeftOuterJoin(IG7, dbc.itm_grp_cd7.eq(IG7.itm_grp_cd).and(IG7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(IG7.itm_grp_nm.like(bind(CndR.$itm_grp_nm7)));
		}
		if(!isNull(up.itm_grp_nm8())) {
			MAM_ITM_GRP_R IG8 = MAM_ITM_GRP_R.create("IG8");
			builder.addLeftOuterJoin(IG8, dbc.itm_grp_cd8.eq(IG8.itm_grp_cd).and(IG8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(IG8.itm_grp_nm.like(bind(CndR.$itm_grp_nm8)));
		}
		if(!isNull(up.itm_grp_nm9())) {
			MAM_ITM_GRP_R IG9 = MAM_ITM_GRP_R.create("IG9");
			builder.addLeftOuterJoin(IG9, dbc.itm_grp_cd9.eq(IG9.itm_grp_cd).and(IG9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(IG9.itm_grp_nm.like(bind(CndR.$itm_grp_nm9)));
		}
		if(!isNull(up.itm_grp_nm10())) {
			MAM_ITM_GRP_R IG10 = MAM_ITM_GRP_R.create("IG10");
			builder.addLeftOuterJoin(IG10, dbc.itm_grp_cd10.eq(IG10.itm_grp_cd).and(IG10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(IG10.itm_grp_nm.like(bind(CndR.$itm_grp_nm10)));
		}
	}

	/**
	 * 各原価品目系マスタの品目のselect count文を追加します。
	 * @param up 上り電文（検索条件）
	 * @param down 品目マスタコンテナ
	 * @param subOpes　サブオペレーション
	 * @param mainAlias 対象項目のテーブル別名
	 * @param builder クエリAPIビルダー
	 */
	protected void addSubCntSql(CndR up, DtlL<DtlR> down, List<MCController> subOpes, String mainAlias, MCQueryApiBuilder builder){
		int i = 0;
		for(MCController ctrl : subOpes){
			if (ctrl instanceof MCDBSubOperation) {
				MCDBContainer dbc = ((MCDBSubOperation<?>)ctrl).dbc();
				addInlineView(up, down, dbc, i++, mainAlias, builder);
			}
		}
	}

	/**
	 * コピー元の品目テーブルの別名を返す。<p>
	 * 登録の場合は品目マスタコンテナ自身の別名を返す。
	 * 参照登録の場合、参照品目と結合したテーブルの別名として「REF」を返す。
	 * @param ope 呼出元オペレーション
	 * @param builder クエリAPIビルダー
	 * @return 品目テーブルの別名
	 */
	protected String getMainAlias(MCOperation ope, MCQueryApiBuilder builder) {
		if (isRefSrch(ope)) {
			return "REF";
		}
		else {
			return builder.getBaseDbcAlias();
		}
	}

	/**
	 * 参照登録かどうかを判定します。
	 * @param ope 呼出元のオペレーション
	 * @return 参照登録の場合true
	 */
	protected boolean isRefSrch(MCOperation ope) {
		return ope instanceof MGBDL_CostItmCopyReg.Srch02;
	}

	/**
	 * dの品目毎の件数カウントの副問合せ文SQL文をdbcItmに結合し、<br>
	 * 件数をselect句に追加します。
	 */
	protected void addInlineView(CndR up, DtlL<DtlR> dbcItm, MCDBContainer dbc, int i, String mainAlias, MCQueryApiBuilder builder){
		MAM_ITM_R M = MAM_ITM_R.create(mainAlias);

		String alias = INLINE_ALIAS_PREFIX + i;
		dbc.setAlias(alias);
		MCTempView V = createTempView(alias);

		MCSingleView sub;
		MCPredicate where = value(0).eq(value(0));
		if(hasCalcCtgCdCol(dbc)){
			MCStringPermColumn calcCtgCd = (MCStringPermColumn) dbc.getColumn$(getCalcCtgCdColNm(dbc));
			where = where.and(calcCtgCd.eq(bind("calc_ctg_cd")));
		}
		if(hasTermCol(dbc)){
			MCDatePermColumn term = (MCDatePermColumn) dbc.getColumn$(getTermColNm(dbc));
			where = where.and(term.eq(bind("term")));
		}

		MCStringPermColumn itmCd, itmSub1, itmSub2, itmSub3;
		if (dbc instanceof MGT_BOM_R) {
			itmCd = (MCStringPermColumn) dbc.getColumn$("par_itm_cd");
			itmSub1 = (MCStringPermColumn) dbc.getColumn$("par_itm_sub1");
			itmSub2 = (MCStringPermColumn) dbc.getColumn$("par_itm_sub2");
			itmSub3 = (MCStringPermColumn) dbc.getColumn$("par_itm_sub3");
		}
		else {
			itmCd = (MCStringPermColumn) dbc.getColumn$("itm_cd");
			itmSub1 = (MCStringPermColumn) dbc.getColumn$("itm_sub1");
			itmSub2 = (MCStringPermColumn) dbc.getColumn$("itm_sub2");
			itmSub3 = (MCStringPermColumn) dbc.getColumn$("itm_sub3");
		}
		sub = subQuery().select(itmCd, itmSub1, itmSub2, itmSub3,
				countAll().as("cnt")
			)
			.from(dbc)
			.where(where)
			.groupBy(itmCd, itmSub1, itmSub2, itmSub3).view(V);

		builder.addLeftOuterJoin(sub, M.itm_cd.eq(itmCd).and(M.itm_sub1.eq(itmSub1)).and(M.itm_sub2.eq(itmSub2)).and(M.itm_sub3.eq(itmSub3)));
		builder.addSelect(dbc.tableName(), V.pr(COUNT));
	}

	/**
	 * 品目マスタコンテナを使用して検索します。
	 * @param up 上り電文（検索条件）
	 * @param down 下り電文（結果格納）
	 * @param builder クエリAPIビルダー
	 * @return 検索件数
	 */
	protected int select(CndR up, DtlL<DtlR> down, MCQueryApiBuilder builder) {
		return dbSelect(createSqlId(getLogicID(), builder.getBaseDbc(), "select_select"), down, builder, up);
	}

	/**
	 * 上り電文の品目を検索する。
	 * @param rslt ＤＢコンテナ
	 * @param up 上り電文
	 */
	protected void selectSrc(MCDBSubOperation<?> subOpe, DtlL<DtlR> up) {
		MCDBContainer T = subOpe.dbc();
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(T);
		setWhere(builder, true);
		dbSelect(createSqlId(getLogicID(), T, "selectSrc_select"), subOpe.up1, builder, up);
	}

	/**
	 * コピー先の品目を検索する。
	 * @param rslt ＤＢコンテナ
	 * @param up 上り電文
	 */
	protected void selectDest(MCList<? extends MCDBContainer> rslt, DtlL<DtlR> up) {
		MCDBContainer T = rslt.createRow();
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(T);
		setWhere(builder, false);
		dbSelect(createSqlId(getLogicID(), T, "selectDest_select"), rslt, builder, up);
	}

	protected void setWhere(MCQueryApiBuilder builder, boolean src){
		MCDBContainer dbc = builder.getBaseDbc();
		String pre = getItmCdColPre(dbc);

		MCStringPermColumn itmCd = (MCStringPermColumn) dbc.getColumn$(pre + "itm_cd");
		MCStringPermColumn itmSub1 = (MCStringPermColumn) dbc.getColumn$(pre + "itm_sub1");
		MCStringPermColumn itmSub2 = (MCStringPermColumn) dbc.getColumn$(pre + "itm_sub2");
		MCStringPermColumn itmSub3 = (MCStringPermColumn) dbc.getColumn$(pre + "itm_sub3");
		MCStringPermColumn calcCtgCd = (MCStringPermColumn) dbc.getColumn$(getCalcCtgCdColNm(dbc));
		MCDatePermColumn term = (MCDatePermColumn) dbc.getColumn$(getTermColNm(dbc));

		if(src){
			builder.addWhereWithAnd(itmCd.eq(bind("itm_cd")));
			builder.addWhereWithAnd(itmSub1.eq(bind("itm_sub1")));
			builder.addWhereWithAnd(itmSub2.eq(bind("itm_sub2")));
			builder.addWhereWithAnd(itmSub3.eq(bind("itm_sub3")));
		}
		else{
			builder.addWhereWithAnd(itmCd.eq(bind("dest_itm_cd")));
			builder.addWhereWithAnd(itmSub1.eq(bind("dest_itm_sub1")));
			builder.addWhereWithAnd(itmSub2.eq(bind("dest_itm_sub2")));
			builder.addWhereWithAnd(itmSub3.eq(bind("dest_itm_sub3")));
		}
		if(hasCalcCtgCdCol(dbc)){
			builder.addWhereWithAnd(calcCtgCd.eq(bind("calc_ctg_cd")));
		}
		if(hasTermCol(dbc)){
			builder.addWhereWithAnd(term.eq(bind("term")));
		}
	}

	protected void setStaticValue(CndR up, DtlL<DtlR> down) {
		down.forEach(dr -> {
			dr.calc_ctg_cd(up.calc_ctg_cd());
			dr.term(up.term());
			dr.mam_itm_(1);
			dr.copy_mam_itm_(nullToZeroAndZeroLt(dr, DtlR.$mam_itm_));
			dr.copy_mgt_itm(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm));
			dr.copy_mgt_itm_dtl(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_dtl));
			dr.copy_mgt_itm_oper(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_oper));
			dr.copy_mgt_bom(nullToZeroAndZeroLt(dr, DtlR.$mgt_bom));
			dr.copy_mgt_itm_wk(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_wk));
			dr.copy_mgt_itm_purc(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_purc));
			dr.copy_mgt_itm_proc(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_proc));
			dr.copy_mgt_itm_prov(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_prov));
			dr.copy_mgt_itm_sls(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_sls));
			dr.copy_mgt_itm_fix(nullToZeroAndZeroLt(dr, DtlR.$mgt_itm_fix));
		});
	}

	/**
	 * 項目値がnullの場合MCNumber.ZEROを設定し、
	 * 0が項目地がより小さい場合trueを返す。
	 */
	protected boolean nullToZeroAndZeroLt(DtlR r, String col) {
		MCNumber t = r.getNumber(col);
		if (isNull(t)) {
			r.setNumber(col, MCNumber.ZERO);
			return false;
		}
		return MCNumber.ZERO.lt(t);
	}

	/**
	 * コピー条件となるキーの上り電文側の項目名を返す。
	 */
	protected String[] getUpKey(MCList<? extends MCDBContainer> list, boolean src) {
		MCDBContainer dbc = list.createRow();
		List<String> keys = new ArrayList<String>();
		String pre = "";
		if (!src) {
			pre = "dest_";
		}
		keys.add(pre + DtlR.$itm_cd);
		keys.add(pre + DtlR.$itm_sub1);
		keys.add(pre + DtlR.$itm_sub2);
		keys.add(pre + DtlR.$itm_sub3);
		if(hasCalcCtgCdCol(dbc)){
			keys.add(DtlR.$calc_ctg_cd);
		}
		if(hasTermCol(dbc)){
			keys.add(DtlR.$term);
		}
		return keys.toArray(new String[keys.size()]);
	}

	/**
	 * コピー条件となるキーのDBコンテナ側の項目名を返す。
	 */
	protected String[] getDbcKey(MCList<? extends MCDBContainer> list) {
		MCDBContainer dbc = list.createRow();
		String pre = getItmCdColPre(dbc);
		String di = pre + DtlR.$itm_cd;
		String d1 = pre + DtlR.$itm_sub1;
		String d2 = pre + DtlR.$itm_sub2;
		String d3 = pre + DtlR.$itm_sub3;
		List<String> keys = new ArrayList<String>();
		keys.add(di);
		keys.add(d1);
		keys.add(d2);
		keys.add(d3);
		if(hasCalcCtgCdCol(dbc)){
			keys.add(getCalcCtgCdColNm(dbc));
		}
		if(hasTermCol(dbc)){
			keys.add(getTermColNm(dbc));
		}
		return keys.toArray(new String[keys.size()]);
	}

	/**
	 * キー値を取得する。
	 * @param list コピー対象テーブルコンテナ
	 * @param vals コピー元のキー値を保持するコンテナ
	 * @param keys キー
	 * @return キー値
	 */
	protected Comparable<?>[] getKeyVal(MCList<? extends MCDBContainer> list, MCRow vals, String... keys) {
		MCDBContainer dbc = list.createRow();
		List<Comparable<?>> vs = new ArrayList<>();
		int ki = -1;
		vs.add(vals.getValue(keys[++ki]));
		vs.add(vals.getValue(keys[++ki]));
		vs.add(vals.getValue(keys[++ki]));
		vs.add(vals.getValue(keys[++ki]));
		if(hasCalcCtgCdCol(dbc)){
			vs.add(vals.getValue(keys[++ki]));
		}
		if(hasTermCol(dbc)){
			vs.add(vals.getValue(keys[++ki]));
		}
		return vs.toArray(new Comparable[vs.size()]);
	}

	/**
	 * 更新対象かどうかを判定する。
	 * @param dbc 対象テーブル
	 * @param r 上り電文コンテナ
	 * @return
	 */
	protected boolean isTgt(MCDBContainer dbc, DtlR r) {
		return r.getBooleanNE(COPY_FLG_PREFIX + dbc.tableName());
	}

	//FMCB CUSTOM END
}