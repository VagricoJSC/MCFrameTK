package mcframe.serverMSBE.MSBEL6000;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6000.*;	// このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBE.MSBEL5930.*;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import java.util.Map;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ArrActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ArrActRcptIFService_MC extends MSBEL_ArrActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 外部システムから入荷実績の登録、更新、取消を行います。<br>
	 */
	public class Chk01 extends MSBEL_ArrActRcptIFService_MC_A.Chk01 {
		/** 取消対象リスト */
		MCList<ArrActIF_DtlR> _delL = null;
		/** 取消・更新対象リスト */
		MCList<ArrActIF_DtlR> _dmdL = null;
		/** 登録・更新対象リスト */
		MCList<ArrActIF_DtlR> _updL = null;
		/** 登録・更新・取消対象リスト */
		MCList<ArrActIF_DtlR> _chgL = null;
		/**
		 * 訂正前の場所
		 */
		protected final String ORG_LOC_CD = "_org_loc_cd";
		/**
		 * 訂正前の物流場所
		 */
		protected final String ORG_LG_GRP_CD = "_org_lg_grp_cd";

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void init() {
			super.init();

			_delL = up1().subList(MCRow.DELETE);
			_dmdL = up1().subList(MCRow.DELETE, MCRow.MODIFY);
			_updL = up1().subList(MCRow.CREATE, MCRow.MODIFY);
			_chgL = up1().subList(MCRow.CREATE, MCRow.MODIFY, MCRow.DELETE);
		}

		@Override
		protected void doIt() {
			super.doIt();

			// この時点でエラーがある場合は、以降の処理（チェック処理、および取込処理）を中断する
			if (!up0().err_flg()) {
				MCMessageList msgL = new MCMessageList();

				// 画面処理と同様、共通チェックを行う。
				callArrActService(_chgL);

				MCMessagePool.addAll(msgL);
				setErrFlg(msgL);
				setErrToRtnStsTyp();
			}
			setRelateErr();
			setDown();
		}
		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			if (isSame(paramIndex, MCNumber.ONE)) {
				ArrActIF_DtlR r = (ArrActIF_DtlR)data;

				// 入荷場所
				if (isSame(column, ArrActIF_DtlR.$arr_loc_cd)) {
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
						cnd.put(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());
					}else {
						cnd.put(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.COMM.value());
					}
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック、更新カウンタチェック
			msgL.addAll(chkArrPr());
			msgL.addAll(chkArrAct());
			msgL.addAll(chkRcptIv());

			// 基本のチェックと補完処理
			msgL.addAll(chkAndCmplBase());
			
			// 入荷場所のDACチェック
			if (!up0().is_src_batch_flg()) {
				// バッチから実行した場合に、ＤＡＣの更新権限チェックを行わない
				msgL.addAll(chkLocDac());
			}


			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<ArrActIF_DtlR> upL = getChkList(_updL);
			if (isNull(upL)) {
				return msgL;
			}

			// 定型チェック後の補完
			crrctDataAfterDoServerChk(upL);

			// 条件付必須チェック
			msgL.addAll(chkReq(upL));

			// 条件付妥当性チェック
			msgL.addAll(chkValid(upL));
			// 有効桁数チェック
			msgL.addAll(chkDecPlace(upL));

			// 在庫管理区分
			cmplStkMngTyp(upL);
			// 在庫検査区分
			cmplStkInspTyp(upL);
			// 在庫識別区分
			cmplStkIdTyp(upL);
			// 在庫取引先
			cmplStkBpCd(upL);
			// 在庫着荷先
			cmplStkArrvBpCd(upL);

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正
		 */
		protected void crrctDataAfterDoServerChk(MCList<ArrActIF_DtlR> notErrL) {
			for (ArrActIF_DtlR r : notErrL) {
				// リストロジックによって補完する項目を元に条件分岐するので、リストロジック実行後に補完している
				// ロット作成
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && r.cststk_flg()) {
					r.crt_lot_flg(false);
				}
				// ロットＮＯ
				if (!MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
					r.crt_lot_flg(false);
				}
				else {
					r.lot_no(nullValToNull(r.lot_no()));
					if (MSC_PURC_UNFIX_STR.isUNFIXED(r.lot_no())) {
						r.lot_no(null);
					}
				}
				// サブロットＮＯ
				if (!MAC_SUBLOT_MNG_TYP.req_lot(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.sublot_no(nullValToNull(r.sublot_no()));
				}
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno1(nullValToNull(r.sno1()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno2(nullValToNull(r.sno2()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno3(nullValToNull(r.sno3()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.sno4(nullValToNull(r.sno4()));
				}
				// 棚・ラインＣＤ
				r.str_ln_cd(nvl(r.str_ln_cd(), MAC_STR.NULL_VAL.value()));

				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()) && isNull(r.ret_dlv_slip_d_no())) {
					// 返品元場所は貸出返品のみ有効
					r.ret_str_ln_cd(nvl(r.ret_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.ret_loc_cd(null);
					r.ret_str_ln_cd(null);
				}
				if (!r.arr_str_ln_tgt_flg()) {
					r.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()) && isNull(r.ret_dlv_slip_d_no())) {
					if (!r.ret_str_ln_tgt_flg()) {
						r.ret_str_ln_cd(MAC_STR.NULL_VAL.value());
					}
				}	
			}
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();

			msgL.addAll(check(_dmdL, ArrActIF_DtlR.$arr_act_no, new FXUCL_RequiredValidater()));
			msgL.addAll(check(_delL, ArrActIF_DtlR.$can_ac_dt, new FXUCL_RequiredValidater()));

			return msgL;
		}

		/**
		 * 入荷進捗のロック、更新カウンタチェック
		 */
		protected MCMessageList chkArrPr() {
			MCMessageList msgL = new MCMessageList();
			MCList<ArrActIF_DtlR> notErrL = getChkList(_chgL);
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_ARR_PR_R> selectL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.arr_pr_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.arr_pr_no);

			MCList<ArrActIF_DtlR> bindL = notErrL.groupBy(ArrActIF_DtlR.$arr_pr_no);
			bindL.sort(ArrActIF_DtlR.$arr_pr_no);

			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6000_MST_ARR_PR_S01", selectL, selectL_bldr, bindL);

				MCIndexKey idxkey = selectL.createIndex(MST_ARR_PR_R.$arr_pr_no);
				for (ArrActIF_DtlR r : notErrL) {
					MST_ARR_PR_R selectR = selectL.getFirst(idxkey, r.arr_pr_no());
					msgL.addAll(checkUpdCntrNE(r, ArrActIF_DtlR.$arr_pr_upd_cntr, selectR));
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL6000_MST_ARR_PR_S02", selectL, selectL_bldr, bindL);
			}
			return msgL;
		}
		
		/**
		 * 入荷実績のロック、更新カウンタチェック（更新・削除行が対象）
		 */
		protected MCMessageList chkArrAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<ArrActIF_DtlR> notErrL = getChkList(_dmdL);
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_ARR_ACT_R> selectL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.arr_act_no,
					t.arr_loc_cd,
					t.lg_grp_cd,
					t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.arr_act_no);

			MCList<ArrActIF_DtlR> bindL = notErrL.groupBy(ArrActIF_DtlR.$arr_act_no);
			bindL.sort(ArrActIF_DtlR.$arr_act_no);

			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6000_MST_ARR_ACT_S01", selectL, selectL_bldr, bindL);

				MCIndexKey idxkey = selectL.createIndex(MST_ARR_ACT_R.$arr_act_no);
				for (ArrActIF_DtlR r : notErrL) {
					MST_ARR_ACT_R selectR = selectL.getFirst(idxkey, r.arr_act_no());
					msgL.addAll(checkUpdCntrNE(r, ArrActIF_DtlR.$arr_act_upd_cntr, selectR));
					r.setStringNE(ORG_LOC_CD, selectR.arr_loc_cd());
					r.setStringNE(ORG_LG_GRP_CD, selectR.lg_grp_cd());
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL6000_MST_ARR_ACT_S02", selectL, selectL_bldr, bindL);
				MCIndexKey idxkey = selectL.createIndex(MST_ARR_ACT_R.$arr_act_no);
				for (ArrActIF_DtlR r : notErrL) {
					MST_ARR_ACT_R selectR = selectL.getFirst(idxkey, r.arr_act_no());
					r.setStringNE(ORG_LOC_CD, selectR.arr_loc_cd());
					r.setStringNE(ORG_LG_GRP_CD, selectR.lg_grp_cd());
				}
			}
			return msgL;
		}

		/**
		 * 受領インボイスのロック、更新カウンタチェック
		 */
		protected MCMessageList chkRcptIv() {
			MCMessageList msgL = new MCMessageList();
			MCList<ArrActIF_DtlR> notErrL = getChkList(_chgL);
			notErrL = notErrL.subList(r -> !isNull(r.rcpt_iv_mng_no()));
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_RCPT_IV_R> selectL = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.rcpt_iv_mng_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.rcpt_iv_mng_no);

			MCList<ArrActIF_DtlR> bindL = notErrL.groupBy(ArrActIF_DtlR.$rcpt_iv_mng_no);
			bindL.sort(ArrActIF_DtlR.$rcpt_iv_mng_no);

			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL6000_MST_RCPT_IV_S01", selectL, selectL_bldr, bindL);

				MCIndexKey idxkey = selectL.createIndex(MST_RCPT_IV_R.$rcpt_iv_mng_no);
				for (ArrActIF_DtlR r : notErrL) {
					MST_RCPT_IV_R selectR = selectL.getFirst(idxkey, r.rcpt_iv_mng_no());
					msgL.addAll(checkUpdCntrNE(r, ArrActIF_DtlR.$rcpt_iv_upd_cntr, selectR));
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL6000_MST_RCPT_IV_S02", selectL, selectL_bldr, bindL);
			}
			return msgL;
		}

		/**
		 * 入荷場所に対するDACチェック
		 */
		protected MCMessageList chkLocDac() {
			MCMessageList msgL = new MCMessageList();
			MCList<ArrActIF_DtlR> orgL = MCList.create(ArrActIF_DtlR.class);
			
			_chgL.forEach(r -> {
				String locCd = r.getStringNE(ORG_LOC_CD);
				String lgGrpCd = r.getStringNE(ORG_LG_GRP_CD);
				if ((!isNull(locCd) && !isSame(r.arr_loc_cd(), locCd)) || (!isNull(lgGrpCd) && !isSame(r.lg_grp_cd(), lgGrpCd))) {
					orgL.add(r);
				}
			});
			
			for (ArrActIF_DtlR r : orgL) {
				MCMessageList msgDacLocL = checkWritableLocCdDac(r, ORG_LOC_CD);	// 訂正前の場所に対してチェック
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, ORG_LG_GRP_CD);	// 訂正前の物流Ｇに対してチェック
				if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
					msgL.addAll(msgDacLocL);
					msgL.addAll(msgDacLgL);
				}
			}
			
			for (ArrActIF_DtlR r : _chgL) {
				MCMessageList msgDacLocL = checkWritableLocCdDac(r, ArrActIF_DtlR.$arr_loc_cd);
				MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, ArrActIF_DtlR.$lg_grp_cd);
				if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
					msgL.addAll(msgDacLocL);
					msgL.addAll(msgDacLgL);
				}
			}
			
			return msgL;
		}

		/**
		 * 基本チェックと補完処理を行う。
		 * @return
		 */
		protected MCMessageList chkAndCmplBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 入荷場所に対する場所マスタを取得
			MCList<MAM_LOC_R> arrLocL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder arrLocL_bldr = MCQueryApiBuilder.create(t);
			arrLocL_bldr.setSelect(t.loc_cd);
			arrLocL_bldr.addSelect(t.wg_cd);
			arrLocL_bldr.addSelect(t.lg_grp_cd);
			arrLocL_bldr.setWhere(t.loc_cd.eq(bind("arr_loc_cd")));
			dbSelect("MSBEL6000_MAM_LOC_S01",
					arrLocL, arrLocL_bldr, _chgL.groupBy(ArrActIF_DtlR.$arr_loc_cd));
			MCIndexKey arrLocKey = arrLocL.createIndex(MAM_LOC_R.$loc_cd);

			// 品目マスタの手配ＮＯ管理区分
			MAM_ITM_R t1 = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t1);
			dbcItmL_bldr.setSelect(t1.itm_cd);
			dbcItmL_bldr.addSelect(t1.itm_sub1);
			dbcItmL_bldr.addSelect(t1.itm_sub2);
			dbcItmL_bldr.addSelect(t1.itm_sub3);
			dbcItmL_bldr.addSelect(t1.sno1_mng_typ);
			dbcItmL_bldr.addSelect(t1.sno2_mng_typ);
			dbcItmL_bldr.addSelect(t1.sno3_mng_typ);
			dbcItmL_bldr.addSelect(t1.sno4_mng_typ);
			FXUCL_MCDbcCache<MAM_ITM_R> cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, _updL,
					new String[] {
							ArrActIF_DtlR.$itm_cd, ArrActIF_DtlR.$itm_sub1,
							ArrActIF_DtlR.$itm_sub2, ArrActIF_DtlR.$itm_sub3
					});

			MCList<ArrActIF_DtlR>
			unPlndL = MCList.create(ArrActIF_DtlR.class),
			nrmlL = MCList.create(ArrActIF_DtlR.class),
			nYetL = MCList.create(ArrActIF_DtlR.class);

			_chgL.forEach(r -> {

				// 入荷場所のＷＧＣＤを補完
				MAM_LOC_R arrLocR = arrLocL.getFirst(arrLocKey, r.arr_loc_cd());
				if(!isNull(arrLocR)) {
					r.arr_wg_cd(arrLocR.wg_cd());
					// 電文で指定されていない場合は補完
					r.lg_grp_cd(nvl(r.lg_grp_cd(), arrLocR.lg_grp_cd()));
					r.wg_cd(nvl(r.wg_cd(), arrLocR.wg_cd()));
				}

				// 品目マスタからの補完
				MAM_ITM_R itmR = cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if(!isNull(itmR) && !isNull(itmR.itm_cd())) {
					if (isNull(r.sno1_mng_typ())) {
						r.sno1_mng_typ(itmR.sno1_mng_typ());
					}
					if (isNull(r.sno2_mng_typ())) {
						r.sno2_mng_typ(itmR.sno2_mng_typ());
					}
					if (isNull(r.sno3_mng_typ())) {
						r.sno3_mng_typ(itmR.sno3_mng_typ());
					}
					if (isNull(r.sno4_mng_typ())) {
						r.sno4_mng_typ(itmR.sno4_mng_typ());
					}
				}

				if (isNull(r.arr_schd_no())) {
					// 計画外は更新のみ対象
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						unPlndL.add(r);
					}
				}
				else if (isNull(r.purc_act_io_no())) {
					// 通常管理
					nrmlL.add(r);
				}
				else {
					// 未着管理
					nYetL.add(r);
				}
			});
			// 予定あり・通常管理
			if (!nrmlL.isEmpty()) {
				// 入荷予定からデータを補完する
				msgL.addAll(cmpleByArrSchdNrml(nrmlL));
			}
			// 予定あり・未着管理
			if (!nYetL.isEmpty()) {
				msgL.addAll(cmpleByArrSchdNYet(nYetL));
			}
			// 予定なし
			if (!unPlndL.isEmpty()) {
				msgL.addAll(cmpleByArrAct(unPlndL));
			}
			
			// 部門の組織変更対応
			cmpleDpt(_updL);

			return msgL;
		}

		/**
		 * 通常管理の入荷予定の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByArrSchdNrml(MCList<ArrActIF_DtlR> upL) {

			MCMessageList msgL = new MCMessageList();
			MCList<ArrActIF_DtlR> notErrL = getChkList(upL);
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_ARR_SCHD_R> arrL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_SHIP_ACT_D_R t3 = MST_SHIP_ACT_D_R.create("T3");
			arrL_bldr.setSelectAll();
			arrL_bldr.addSelect(t2.trd_cd, t2.trd_ptn_typ,
					t2.cst_cd, t2.sppl_cd,
					t2.ret_dlv_slip_d_no, t2.sret_fr_cd);
			arrL_bldr.addSelect(t3.ship_act_d_no);
			arrL_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(t.arr_pr_no)));
			arrL_bldr.addLeftOuterJoin(t3, bracket(t3.dlv_slip_d_no.eq(t2.dlv_slip_d_no)));
			dbSelectKey("MSBEL6000_MST_ARR_SCHD_S01",
					arrL, arrL_bldr, notErrL.groupBy(ArrActIF_DtlR.$arr_schd_no));
			MCIndexKey arrIdx = arrL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);

			for (ArrActIF_DtlR r : notErrL) {
				MST_ARR_SCHD_R arrR = arrL.getFirst(arrIdx, r.arr_schd_no());

				// 入荷予定NOがDBに登録されているか
				if (isNull(arrR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_ARR_SCHD"
							, new String[]{MST_ARR_SCHD_R.$arr_schd_no}
							, new Comparable[]{r.arr_schd_no()}, r));
					continue;
				}
				
				//出荷実績が存在する場合、ロットサブロットのチェックを実施する
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (!isNull(arrR.getString("ship_act_d_no"))) {
						if ((!isNullOrNullVal(r.lot_no()) && !isNull(arrR.lot_no()) && !isSame(arrR.lot_no(), r.lot_no()))
								|| (!isNullOrNullVal(r.sublot_no()) && !isNull(arrR.sublot_no()) && !isSame(arrR.sublot_no(), r.sublot_no()))
								|| (!isNull(r.gd_cd()) && !isNull(arrR.gd_cd()) && !isSame(arrR.gd_cd(), r.gd_cd()))) {
							msgL.add(new MCMessage(r, null, MSBEL1063, r.arr_schd_no(),
									nvl(r.lot_no(), arrR.lot_no()),
									nvl(r.sublot_no(), arrR.sublot_no()),
									nvl(r.gd_cd(), arrR.gd_cd()), toDispGUIIndex(r)));
						}
					}
				}
				
				// 上り電文から取得した入荷予定と、入荷進捗更新カウンタとの妥当性をチェック
				if (!isSame(arrR.arr_pr_no(), r.arr_pr_no())) {
					msgL.addAll(getRecordInvalidMsg(MST_ARR_SCHD_R.$arr_pr_no, r.arr_pr_no(), r));
				}

				if (isNull(r.stk_arrv_bp_cd())) {
					r.stk_arrv_bp_cd(arrR.stk_arrv_bp_cd());
				}
				if (isNull(r.stk_id_typ())) {
					r.stk_id_typ(arrR.stk_id_typ());
				}
				if (isNull(r.stk_insp_typ())) {
					r.stk_insp_typ(arrR.stk_insp_typ());
				}
				if (isNull(r.stk_bp_cd())) {
					r.stk_bp_cd(arrR.stk_bp_cd());
				}
				if (isNull(r.sno1())) {
					r.sno1(nvl(arrR.sno1(), MAC_STR.NULL_VAL.value()));
				}
				if (isNull(r.sno2())) {
					r.sno2(nvl(arrR.sno2(), MAC_STR.NULL_VAL.value()));
				}
				if (isNull(r.sno3())) {
					r.sno3(nvl(arrR.sno3(), MAC_STR.NULL_VAL.value()));
				}
				if (isNull(r.sno4())) {
					r.sno4(nvl(arrR.sno4(), MAC_STR.NULL_VAL.value()));
				}
				r.rqst_dpt_cd(null);	// 計画外のみ更新
				r.rqst_usr_cd(null);	// 計画外のみ更新
				r.ret_dlv_slip_d_no(arrR.getString("ret_dlv_slip_d_no"));

				r.quality_typ(arrR.quality_typ());
				r.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
			}

			return msgL;
		}

		/**
		 * 未着管理の入荷予定の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByArrSchdNYet(MCList<ArrActIF_DtlR> upL) {

			MCMessageList msgL = new MCMessageList();
			MCList<ArrActIF_DtlR> notErrL = getChkList(upL);
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
			MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
			MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
			MST_ARR_SCHD_R t5 = MST_ARR_SCHD_R.create("T5");
			
			MCList<MST_PURC_ACT_IO_R> purcL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(t);
			purcL.addBooleanColumn("sundry_itm_flg");
			purcL.addBooleanColumn("pre_outsrc_act_flg");
			purcL_bldr.setSelect(t.purc_act_io_no);
			purcL_bldr.addSelect(t3.trd_cd, t3.trd_ptn_typ, t3.sppl_cd, t2.itm_cd,
					t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t2.itm_nm,
					t2.iv_itm_nm.as("rcpt_iv_itm_nm"), t2.sundry_itm_flg, t2.stk_mng_typ,
					t2.sppl_itm_cd, t2.sppl_itm_nm, t2.sno1, t2.sno2, t2.sno3, t2.sno4,
					t2.sno1_mng_typ, t2.sno2_mng_typ, t2.sno3_mng_typ, t2.sno4_mng_typ,
					t2.maker_cd, t2.rsn_cd, t2.bd_dpt_cd, t5.arr_schd_no, t5.arr_pr_no,
					t5.purc_id_typ, t5.rcpt_iv_no, t5.iv_no, t5.io_schd_pr_no,
					t5.mfg_inst_no, t5.pre_outsrc_act_flg, t5.quality_typ);
			purcL_bldr.addInnerJoin(t2, bracket(t2.purc_act_d_no.eq(t.purc_act_d_no)
					.and(t2.purc_act_d_seq.eq(t.purc_act_d_seq))));
			purcL_bldr.addInnerJoin(t3, bracket(t3.purc_act_no.eq(t2.purc_act_no)
					.and(t3.purc_act_seq.eq(t2.purc_act_seq))
					.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			purcL_bldr.addInnerJoin(t4, bracket(t4.purc_schd_no.eq(t2.purc_schd_no)));
			purcL_bldr.addInnerJoin(t5, bracket(t5.arr_schd_no.eq(t4.arr_schd_no)));
			purcL_bldr.setWhere(t.purc_act_io_no.eq(bind("purc_act_io_no")));
			dbSelect("MSBEL6000_MST_PURC_ACT_IO_S01",
					purcL, purcL_bldr, notErrL.groupBy(ArrActIF_DtlR.$purc_act_io_no));
			MCIndexKey purcIdx = purcL.createIndex(MST_PURC_ACT_IO_R.$purc_act_io_no);


			for (ArrActIF_DtlR r : notErrL) {
				MST_PURC_ACT_IO_R purcR = purcL.getFirst(purcIdx, r.purc_act_io_no());

				// 仕入実績受払NOがDBに登録されているか
				if (isNull(purcR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_PURC_ACT_IO"
							, new String[]{MST_PURC_ACT_IO_R.$purc_act_io_no}
							, new Comparable[]{r.purc_act_io_no()}, r));
					continue;
				}
				// 上り電文から取得した入荷予定と、入荷進捗更新カウンタとの妥当性をチェック
				if (!isSame(purcR.getString("arr_schd_no"), r.arr_schd_no())) {
					msgL.addAll(getRecordInvalidMsg(MST_ARR_SCHD_R.$arr_schd_no, r.arr_schd_no(), r));
				}
				if (!isSame(purcR.getString("arr_pr_no"), r.arr_pr_no())) {
					msgL.addAll(getRecordInvalidMsg(MST_ARR_SCHD_R.$arr_pr_no, r.arr_pr_no(), r));
				}

				// 引継元の入荷予定からデータを補完
				r.trd_cd(purcR.getString("trd_cd"));
				r.trd_ptn_typ(purcR.getString("trd_ptn_typ"));
				r.itm_cd(purcR.getString("itm_cd"));
				r.itm_sub1(purcR.getString("itm_sub1"));
				r.itm_sub2(purcR.getString("itm_sub2"));
				r.itm_sub3(purcR.getString("itm_sub3"));
				r.itm_nm(purcR.getString("itm_nm"));
				r.rcpt_iv_itm_nm(purcR.getString("rcpt_iv_itm_nm"));
				r.sundry_itm_flg(purcR.getBoolean("sundry_itm_flg"));
				if (!isCmpleItmNm(r)) {
					r.itm_nm(null);
					r.rcpt_iv_itm_nm(null);
				}
				r.stk_mng_typ(purcR.getString("stk_mng_typ"));
				r.setStringNE("purc_stk_mng_typ", purcR.getString("stk_mng_typ"));
				r.purc_id_typ(purcR.getString("purc_id_typ"));
				r.sno1(purcR.getString("sno1"));
				r.sno2(purcR.getString("sno2"));
				r.sno3(purcR.getString("sno3"));
				r.sno4(purcR.getString("sno4"));
				r.sno1_mng_typ(purcR.getString("sno1_mng_typ"));
				r.sno2_mng_typ(purcR.getString("sno2_mng_typ"));
				r.sno3_mng_typ(purcR.getString("sno3_mng_typ"));
				r.sno4_mng_typ(purcR.getString("sno4_mng_typ"));
				r.rqst_dpt_cd(null);	// 計画外のみ更新
				r.rqst_usr_cd(null);	// 計画外のみ更新
				r.sppl_itm_cd(purcR.getString("sppl_itm_cd"));
				r.sppl_itm_nm(purcR.getString("sppl_itm_nm"));
				r.sppl_cd(purcR.getString("sppl_cd"));
				r.maker_cd(purcR.getString("maker_cd"));
				r.rsn_cd(purcR.getString("rsn_cd"));
				r.bd_dpt_cd(purcR.getString("bd_dpt_cd"));
				r.rcpt_iv_no(purcR.getString("rcpt_iv_no"));
				r.iv_no(purcR.getString("iv_no"));
				r.io_schd_pr_no(purcR.getString("io_schd_pr_no"));
				r.mfg_inst_no(purcR.getString("mfg_inst_no"));
				r.pre_outsrc_act_flg(purcR.getBoolean("pre_outsrc_act_flg"));
				r.arr_ptn_typ(MSC_ARR_PTN_TYP.N_YET_ARR.value());
				r.quality_typ(purcR.getString("quality_typ"));
			}
			return msgL;
		}

		/**
		 * 品名を補完するか
		 */
		protected boolean isCmpleItmNm(ArrActIF_DtlR r) {
			return
				r.sundry_itm_flg()
				&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()));
		}

		/**
		 * 部門の組織変更
		 */
		protected void cmpleDpt(MCList<ArrActIF_DtlR> noErrL) {
			MCList<ArrActIF_DtlR>
				xfrL = createArrActIF_DtlL(), purcL = createArrActIF_DtlL();
			noErrL.forEach(r -> {
				if (!isNull(r.bd_dpt_cd())) {
					if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
						xfrL.add(r);
					}
					else {
						purcL.add(r);
					}
				}
			});
			if (!xfrL.isEmpty()) {
				// 負担部門が変更可能な場合のチェックは、リストロジックチェックにゆだねる
				setDpt(xfrL, ArrActIF_DtlR.$bd_dpt_cd, ArrActIF_DtlR.$ac_dt);
			}
			if (!purcL.isEmpty()) {
				// 負担部門が変更不可の場合のチェックは、下記ユーティリティで行う
				// IFSVには名称がないので画面処理と引数を変えている
				setDpt(purcL, ArrActIF_DtlR.$bd_dpt_cd, ArrActIF_DtlR.$ac_dt);
			}
		}

		
		/**
		 * 計画外の入荷実績の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByArrAct(MCList<ArrActIF_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();

			MCList<ArrActIF_DtlR> notErrL = getChkList(upL);
			if (isNull(notErrL)) {
				return msgL;
			}
			MCList<MST_ARR_ACT_R> arrL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t);
			arrL_bldr.setSelect(t.arr_act_no);
			dbSelectKey("MSBEL6000_MST_ARR_ACT_S03", arrL, arrL_bldr, upL);
			MCIndexKey arrIdx = arrL.createIndex(MST_ARR_ACT_R.$arr_act_no);

			for (ArrActIF_DtlR r : notErrL) {
				MST_ARR_ACT_R arrR = arrL.getFirst(arrIdx, r.arr_act_no());

				// 入荷実績NOがDBに登録されているか
				if (isNull(arrR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_ARR_ACT"
							, new String[]{MST_ARR_ACT_R.$arr_act_no}
							, new Comparable[]{r.arr_act_no()}, r));
					continue;
				}
				
				// データ補完（マスタからの補完）はリストロジックによるチェックロジックを利用して補完する
			}

			return msgL;
		}

		/**
		 * 条件付必須チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkReq(MCList<ArrActIF_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (ArrActIF_DtlR r : notErrL) {
				// 品名（諸口品のみ）
				if (isCmpleItmNm(r)) {
					msgL.addAll(check(r, ArrActIF_DtlR.$itm_nm, new FXUCL_RequiredValidater()));
				}

				// 取引ＣＤ（計画外のみ）
				if (isNull(r.arr_schd_no())) {
					msgL.addAll(check(r, ArrActIF_DtlR.$trd_cd, new FXUCL_RequiredValidater()));
				}

				// 仕入、経費購買
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					msgL.addAll(check(r, ArrActIF_DtlR.$purc_id_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, ArrActIF_DtlR.$sppl_cd, new FXUCL_RequiredValidater()));

					if (r.bp_lot_flg()) {
						msgL.addAll(check(r, ArrActIF_DtlR.$bp_lot_no, new FXUCL_RequiredValidater()));
					}
				}
				// 経費購買
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					msgL.addAll(check(r, ArrActIF_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
				}
				// 売上返品
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
					msgL.addAll(check(r, ArrActIF_DtlR.$cst_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, ArrActIF_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
				}
				// 出荷返品
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					msgL.addAll(check(r, ArrActIF_DtlR.$cst_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, ArrActIF_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
					// 貸出返品
					if (isNull(r.ret_dlv_slip_d_no())) {
						msgL.addAll(check(r, ArrActIF_DtlR.$sret_fr_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ArrActIF_DtlR.$ret_loc_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ArrActIF_DtlR.$ret_gd_cd, new FXUCL_RequiredValidater()));
					}
				}
				// 入荷
				if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					if (!r.cststk_flg()) {
						msgL.addAll(check(r, ArrActIF_DtlR.$purc_id_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ArrActIF_DtlR.$sppl_cd, new FXUCL_RequiredValidater()));
						if (r.bp_lot_flg()) {
							msgL.addAll(check(r, ArrActIF_DtlR.$bp_lot_no, new FXUCL_RequiredValidater()));
						}
					}
					else {
						msgL.addAll(check(r, ArrActIF_DtlR.$cst_cd, new FXUCL_RequiredValidater()));
					}
				}
				// ロット発番が手動、またはロット作成しない場合は必須
				if (MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ()) || !r.crt_lot_flg()) {
					msgL.addAll(check(r, ArrActIF_DtlR.$lot_no, new FXUCL_RequiredValidater()));
				}
				// ロット発番が自動で、ロットＮＯが指定されている場合はロットＮＯをクリア
				if (MAC_LOT_NO_TYP.isAUTO(r.lot_no_typ()) && !isNull(r.lot_no()) && r.crt_lot_flg()) {
					r.lot_no(null);
				}
				
				// サブロット発番が手動、またはロット作成しない、在庫のみサブロット管理もしない場合は必須
				if (MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())
						|| (!r.crt_lot_flg() && !isCrtSublot(r))) {
					msgL.addAll(check(r, ArrActIF_DtlR.$sublot_no, new FXUCL_RequiredValidater()));
				}
				// サブロット発番が自動で、サブロットＮＯが指定されている場合はサブロットＮＯをクリア
				if (MAC_LOT_NO_TYP.isAUTO(r.sublot_no_typ()) && !isNull(r.sublot_no()) && r.crt_lot_flg()) {
					r.sublot_no(null);
				}

				// 版管理対象は版Noは必須
				if (r.ver_flg()) {
					msgL.addAll(check(r, ArrActIF_DtlR.$ver_no, new FXUCL_RequiredValidater()));
				}
				if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					// 在庫管理品は必須
					msgL.addAll(check(r, ArrActIF_DtlR.$gd_cd, new FXUCL_RequiredValidater()));
				}
				msgL.addAll(check(r, ArrActIF_DtlR.$quality_typ, new FXUCL_RequiredValidater()));

				// crrctDataAfterDoServerChkで補完しているので、なければエラー
				msgL.addAll(check(r, ArrActIF_DtlR.$sno1, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ArrActIF_DtlR.$sno2, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ArrActIF_DtlR.$sno3, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, ArrActIF_DtlR.$sno4, new FXUCL_RequiredValidater()));

				// 取引パタン区分が移送の入荷
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
					// 理由が他勘定出庫
					if (r.acxfr_gi_flg()) {
						msgL.addAll(check(r, ArrActIF_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
					}
				}
			}

			return msgL;
		}
		/**
		 * ロット発番はしないが、サブロット発番するか判定する
		 */
		protected boolean isCrtSublot(ArrActIF_DtlR r) {
			// ロット作成フラグがオンになるパタンは、仕入、経費購買、入荷(預り以外)のみ
			if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !isNull(r.purc_id_typ())) {

				if (MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())
						&& !MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())
						&& isNull(r.sublot_no())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 条件付妥当性チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkValid(MCList<ArrActIF_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (ArrActIF_DtlR r : notErrL) {

				// 取引パタンの妥当性チェック
				if (!MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				 	&& !MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
				 	&& !MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					msgL.add(new MCMessage(r, null, MSBEL0167, r.trd_cd(), r.trd_ptn_typ()));
				}
				if (isNull(r.arr_schd_no())) {
					if (!isNull(r.trd_ptn_typ())
						&& !(MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) ) {
						// 計画外の入荷で扱える取引は「入荷」「出荷返品」のみ
						msgL.add(new MCMessage(r, null, MSBEL0111, r.trd_cd(), r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						// 品目
					 	if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						 	// 計画外の「入荷」「出荷返品」は在庫品のみ
							msgL.add(new MCMessage(r, null, MSBEL0300, r.trd_cd(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
						}
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						// 良品区分
						if (!MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
							// 計画外は良品のみ
							msgL.add(new MCMessage(r, null, MSBEL0112, toDispGUIIndex(r)));
						}
					}
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
						if (!isNull(r.purc_id_typ()) && r.cststk_flg()) {
							// 購買識別区分、預りはいずれか一方のみ設定可
							msgL.add(new MCMessage(r, null, MSBEL0306, r.trd_cd(), toDispGUIIndex(r)));
						}
						// 購買識別区分
						if (!r.cststk_flg()) {
							if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
								// 取引パタンが「入荷(預り以外)」、資産管理する品目の場合は、「無償受給」「ＶＭＩ」のみ
								if (!isNull(r.trd_ptn_typ())
									&& !isNull(r.purc_id_typ())
									&& !(MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
										|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) ) {
									msgL.add(new MCMessage(r, null, MSBEL0301, r.trd_cd(),
										toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.purc_id_typ(), toDispGUIIndex(r)));
								}
							}
							else {
								// 取引パタンが「入荷(預り以外)」、資産管理しない品目の場合は、「無償受給」のみ
								if (!MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
									msgL.add(new MCMessage(r, null, MSBEL0307, r.trd_cd(),
										toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.purc_id_typ(), toDispGUIIndex(r)));
								}
							}
						}
					}
				}
				// 理由
				if (!isNull(r.rsn_cd())) {
					if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ()) && !r.cststk_flg()) {
						if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
							if ( !(r.purc_flg() && !r.xpns_purc_flg()) ) {
								// 資産管理する品目の場合は、仕入理由のみ(経費購買理由は不可)
								msgL.add(new MCMessage(r, null, MSBEL0302,
									r.trd_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.rsn_cd(), toDispGUIIndex(r)));
							}
						}
						else {
							if ( !(r.purc_flg() && r.xpns_purc_flg()) ) {
								// 資産管理しない品目の場合は、経費購買理由のみ
								msgL.add(new MCMessage(r, null, MSBEL0168,
									r.trd_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.rsn_cd(), toDispGUIIndex(r)));
							}
						}
					}
					else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())) {
						if (!r.xfr_flg()) {
							// 取引パタン区分が「移送」の場合は、移送理由のみ(他勘定出庫も含む)
							msgL.add(new MCMessage(r, null, MSBEL0303, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
						}
					}
					else if (MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						if (!r.xfr_flg() || r.acxfr_gi_flg()) {
							// 取引パタン区分が「移送返品」「支給」「支給返品」の場合は、移送理由のみ(他勘定出庫は不可)
							msgL.add(new MCMessage(r, null, MSBEL0304, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
						}
					}
					else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()) && isNull(r.arr_schd_no())) {
						if (!r.sls_rtn_flg() || r.sls_acxfr_flg()) {
							// 取引パタン区分が「出荷返品」の場合は、売上返品理由のみ(販売他勘定理由は不可)
							msgL.add(new MCMessage(r, null, MSBEL0305, r.trd_cd(), r.rsn_cd(), toDispGUIIndex(r)));
						}
					}
				}
				if (!isNull(r.arr_schd_no())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (asR.arr_skip_flg()) {
						// 入荷不要の予定に対しては実績登録は不可（本サービス固有のチェック）
						msgL.add(new MCMessage(r, null, MSBEL1021, r.arr_schd_no(), toDispGUIIndex(r)));
					}
					else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && asR.cmpl_flg()) {
						// 完了している予定に対して新規に実績登録は不可（本サービス固有のチェック）
						msgL.add(new MCMessage(r, null, MSBEL1020, r.arr_schd_no(), toDispGUIIndex(r)));
					}
				}
			}

			// 品目詳細マスタチェック
			msgL.addAll(chkItmDtlForPurc(notErrL));

			return msgL;
		}
		/**
		 * 有効桁数チェック
		 */
		protected MCMessageList chkDecPlace(MCList<ArrActIF_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// 取引単位数量
			msgL.addAll(checkDecPlace(notErrL, ArrActIF_DtlR.$trd_unit_dec_place, ArrActIF_DtlR.$trd_unit_qty));

			// 仕入有効成分
			msgL.addAll(checkDecPlace(notErrL, ArrActIF_DtlR.$cont_fctr_dec_place, ArrActIF_DtlR.$purc_cont_qty));

			return msgL;
		}
		
		/**
		 * 発注先、メーカに対する品目詳細マスタチェック
		 */
		protected MCMessageList chkItmDtlForPurc(MCList<ArrActIF_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			notErrL.forEach(r -> {
				if (isNull(r.arr_schd_no())
					&& !isNull(r.purc_id_typ())
					&& !isNull(r.arr_tm())) {
					copy(itmDtlL.add(), r, createMap_MAM_ITM_DTL_R_ArrActIF_DtlR());
				}
			});
			if (!itmDtlL.isEmpty()) {
				msgL.addAll(chkItmDtlPurc(itmDtlL));
			}
			return msgL;
		}
		protected Map_MAM_ITM_DTL_R_ArrActIF_DtlR<MAM_ITM_DTL_R,ArrActIF_DtlR> createMap_MAM_ITM_DTL_R_ArrActIF_DtlR() {
			return new Map_MAM_ITM_DTL_R_ArrActIF_DtlR<MAM_ITM_DTL_R, ArrActIF_DtlR>();
		}
		public class Map_MAM_ITM_DTL_R_ArrActIF_DtlR<D extends MAM_ITM_DTL_R, S extends ArrActIF_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.sppl_cd(src.sppl_cd());
				dest.maker_cd(nvl(src.maker_cd(), MAC_STR.NULL_VAL.value()));
				dest.wg_cd(src.arr_wg_cd());
				dest.st_dt(src.arr_tm());
			}
		}

		/**
		 * 在庫管理区分を補完する
		 */
		protected void cmplStkMngTyp(MCList<ArrActIF_DtlR> notErrL) {
			for (ArrActIF_DtlR r : notErrL) {
				// 在庫計上しない取引の場合、
				// 在庫管理区分に「在庫管理しない」を設定し入荷実績を作成する
				// 未着の場合は、仕入実績明細の値で補完する
				if (isNotStk(r)) {
					if (!isNull(r.purc_act_io_no())) {
						r.stk_mng_typ(r.getStringNE("purc_stk_mng_typ"));
					}
					else {
						r.stk_mng_typ(MAC_STK_MNG_TYP.NOT_MNG.value());
					}
				}
			}
		}

		/**
		 * 非在庫チェック
		 */
		protected boolean isNotStk(ArrActIF_DtlR r) {
			if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
				return true;
			}

			return false;
		}

		/**
		 * 在庫検査区分を設定する
		 */
		protected void cmplStkInspTyp(MCList<ArrActIF_DtlR> notErrL) {
			for (ArrActIF_DtlR r : notErrL) {
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// cmpleByArrSchdで設定した入荷予定の値を使用する
				}
				else {
					r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
			}
		}

		/**
		 * 在庫識別区分を補完する
		 */
		protected void cmplStkIdTyp(MCList<ArrActIF_DtlR> notErrL) {
			for (ArrActIF_DtlR r : notErrL) {
				// 「仕入」「経費購買」
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
				 	|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					if (isNull(r.purc_act_io_no())) {
						if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
							// 無償受給は「無償受給」
							r.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
						}
						else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
							// ＶＭＩは「ＶＭＩ」
							r.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
						}
						else {
							// 通常管理は「仕入検収前」
							r.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
						}
					}
					else {
						// 未着管理は「通常在庫」
						r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
				}
				// 「売上返品」
				else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
					// 売上返品は「返品検収前」
					r.stk_id_typ(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value());
				}
				// 「出荷返品」
				else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
					// 出荷返品は「通常在庫」
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				// 「入荷」
				else if (MAC_TRD_PTN_TYP.isARR(r.trd_ptn_typ())) {
					if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
						// 無償受給は「無償受給」
						r.stk_id_typ(MSC_STK_ID_TYP.NCV_RCV.value());
					}
					else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
						// ＶＭＩは「ＶＭＩ」
						r.stk_id_typ(MSC_STK_ID_TYP.RNT_RCV.value());
					}
					else if (isNull(r.arr_schd_no())) {
						// 預りは「預り在庫」
						r.stk_id_typ(MSC_STK_ID_TYP.CSTSTK.value());
					}
				}
				// 上記以外（移送や支給など）
				else {
					// cmpleByArrSchdで設定した入荷予定の値を使用する
				}
			}
		}

		/**
		 * 在庫取引先を補完する<br>
		 * 補完には在庫識別区分を使用するので予め補完済みであること
		 */
		protected void cmplStkBpCd(MCList<ArrActIF_DtlR> notErrL) {
			for (ArrActIF_DtlR r : notErrL) {
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// cmpleByArrSchdで設定した入荷予定の値を使用する
				}
				else {
					if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						// 自社在庫はNULL文字
						r.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
						|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						// 返品検収前、預りは得意先を設定する
						r.stk_bp_cd(r.cst_cd());
					}
					else {
						// 上記以外は発注先を設定する
						r.stk_bp_cd(r.sppl_cd());
					}
				}
			}
		}

		/**
		 * 在庫着荷先を補完する
		 */
		protected void cmplStkArrvBpCd(MCList<ArrActIF_DtlR> notErrL) {
			for (ArrActIF_DtlR r : notErrL) {
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// cmpleByArrSchdで設定した入荷予定の値を使用する
				}
				else {
					r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}


		/**
		 * 入荷実績サービスチェック処理実行
		 */
		protected void callArrActService(MCList<ArrActIF_DtlR> list) {
			MCList<ArrActIF_DtlR> notErrL = getChkList(list);
			MSBEL_ArrActService.ArrAct_Chk01 chkOpe = MSBEL_ArrActService.crtArrAct_Chk01();
			setAll(chkOpe.up0(), notErrL, createMap_ArrAct_DtlR_ArrActIF_DtlR());
			chkOpe.exec();

			copyErrFlg(notErrL, chkOpe.down0());
		}
		protected void setRelateErr() {
			// 同一外部システムＣＤ、外部入荷実績NOを持つレコードはまとめてエラーとする
			for (MCList<ArrActIF_DtlR> gl : up1().groupList(
					ArrActIF_DtlR.$ext_sys_cd, ArrActIF_DtlR.$ext_arr_act_no)) {
				if (isNullOr(gl.get(0).ext_sys_cd(), gl.get(0).ext_arr_act_no())) {
					continue;
				}
				ArrActIF_DtlR errR = gl.getFirst(ArrActIF_DtlR.$err_flg, true);
				if (!isNull(errR)) {
					gl.forEach(r -> {
						r.err_flg(true);
						r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					});
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().err_flg(up0().err_flg());
			down1().setAll(up1());
		}
	}

	/**
	 * ArrActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから入荷実績の登録、更新、取消を行います。<br>
	 */
	public class ArrActIF_Upd01 extends MSBEL_ArrActRcptIFService_MC_A.ArrActIF_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				if (up0().is_src_batch_flg()) {
					// バッチ実行の場合は呼出元でハンドリングする
					throw e;
				}
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			
			// チェック処理
			callThisChk01();
			throwOpeErr();

			MCList<ArrActIF_DtlR> l = getUpdTgtL();
			callArrActService(l);
		}

		/**
		 * IF更新区分を考慮し、更新対象のデータを取得する
		 */
		protected MCList<ArrActIF_DtlR> getUpdTgtL() {
			MCList<ArrActIF_DtlR> tgtL = MCList.create(ArrActIF_DtlR.class);

			// 1：すべて登録しない
			// 2：エラーを無視して登録
			// 3：エラー行まで登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())
				&& !isNull(up1().getFirst(ArrActIF_DtlR.$err_flg, true))) {
				// エラーあり、かつ「1：すべて登録しない」の場合、空のリストを返す
				return tgtL;
			}
			for (ArrActIF_DtlR r : up1()) {
				if (!r.err_flg()) {
					tgtL.add(r);
				}
				else if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					// 「3：エラー行まで登録」の場合、ここまでで蓄積したリストを更新対象とする
					break;
				}
			}
			return tgtL;
		}
		
		protected void editUp() {
			// キャッシュ
			initArrSchdCache(up1());
			initArrActCache(up1());
			initArrSchd2Cache(up1().subList(ArrActIF_DtlR.$arr_ptn_typ, MSC_ARR_PTN_TYP.N_YET_ARR.value()));
			initItmCache(up1());
			initBizRsnCache(up1());
			initItmUnitCache(up1());

			for (ArrActIF_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.setStatus(MCRow.CREATE);

					// 入荷進捗ＮＯ補完（入荷進捗ロック用）
					if (isNull(r.arr_pr_no())) {
						MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
						r.arr_pr_no(asR.arr_pr_no());
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.setStatus(MCRow.MODIFY);
					if (!MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
						// 通常管理の場合、仕入実績受払NOは上らせない
						// (仕入実績受払NOの有無で未着かを判定している箇所があるので)
						r.purc_act_io_no(null);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(MCRow.DELETE);
				}
				else {
					r.setStatus(MCRow.NONE);
				}

				// 基準単位数に換算
				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MAVM_ITM_UNIT_R unitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				MCNumber q = convToBaseUnit(r.trd_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(), itmR.dec_place(), itmR.rnd_typ());
				r.base_unit_qty(q);
				
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ArrActRcptIFService.Chk01 ope = MSBEL_ArrActRcptIFService.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().err_flg(ope.down0().err_flg());
			up1().setAll(ope.down1());
		}

		/**
		 * 入荷実績サービス更新処理実行
		 */
		protected void callArrActService(MCList<ArrActIF_DtlR> list) {
			if (list.isEmpty()) return;
			MSBEL_ArrActService.ArrAct_Upd01 updOpe = MSBEL_ArrActService.crtArrAct_Upd01();
			updOpe.up0().outsrc_act_flg(true);
			updOpe.up0().purc_act_flg(true);
			updOpe.up0().sls_act_flg(true);
			updOpe.up0().io_act_flg(true);
			setAll(updOpe.up1(), list, createMap_ArrAct_DtlR_ArrActIF_DtlR());
			updOpe.exec();
			
			list.forEach(r-> {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			});
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		protected void handleSuccess() {
			dbTran().commit();
		}
		
		protected void handleEx(Exception e) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);

			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
		}

		protected void throwOpeErr() {
			if (up0().err_flg()) {
				throwErr(msgOpeErr());
			}
		}
	}

	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MSBEL_ArrActRcptIFService> CLAZZ = MSBEL_ArrActRcptIFService.class;

	/**
	 * MST_ARR_SCHDキャッシュ
	 */
	protected static void initArrSchdCache(MCList<ArrActIF_DtlR> list) {
		object(CLAZZ)._initArrSchdCache(list);
	}
	protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _arrSchdCache = null;
	protected void _initArrSchdCache(MCList<?> list) {
		_arrSchdCache = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(MCQueryApiBuilder.create(
				MST_ARR_SCHD_R.create("T")), list, MST_ARR_SCHD_R.$arr_schd_no);
	}
	protected static FXUCL_MCDbcCache<MST_ARR_SCHD_R> getArrSchdCache() {
		return object(CLAZZ)._arrSchdCache;
	}
	protected static MST_ARR_SCHD_R getArrSchdR(String arrSchdNo) {
		return getArrSchdCache().get(arrSchdNo);
	}

	/**
	 * MST_ARR_ACTキャッシュ
	 */
	protected static void initArrActCache(MCList<ArrActIF_DtlR> list) {
		object(CLAZZ)._initArrActCache(list);
	}
	protected FXUCL_MCDbcCache<MST_ARR_ACT_R> _arrActCache = null;
	protected void _initArrActCache(MCList<?> list) {
		_arrActCache = new FXUCL_MCDbcCache<MST_ARR_ACT_R>(
				MCQueryApiBuilder.create(MST_ARR_ACT_R.create("T")), list, MST_ARR_ACT_R.$arr_act_no);
	}
	protected static FXUCL_MCDbcCache<MST_ARR_ACT_R> getArrActCache() {
		return object(CLAZZ)._arrActCache;
	}
	protected static MST_ARR_ACT_R getArrActR(String arrActNo) {
		return getArrActCache().get(arrActNo);
	}

	/**
	 * MST_ARR_SCHDキャッシュ（未着管理用）
	 */
	protected static void initArrSchd2Cache(MCList<ArrActIF_DtlR> list) {
		object(CLAZZ)._initArrSchd2Cache(list);
	}
	protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _arrSchd2Cache = null;
	protected void _initArrSchd2Cache(MCList<?> list) {
		MST_PURC_SCHD_R t1 = MST_PURC_SCHD_R.create("T1");
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R S1W = MST_PURC_ACT_R.create("W");
		MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");
		MCList<MST_ARR_SCHD_R> dbc = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		
		dbc.addStringColumn("purc_act_io_no");
		dbc.addStringColumn("stk_mng_typ");
		dbc_bldr.addSelect(t3.purc_act_io_no, t2.stk_mng_typ);
		dbc_bldr.addInnerJoin(t1, bracket(t1.arr_schd_no.eq(t.arr_schd_no)));
		dbc_bldr.addInnerJoin(t2, bracket(t2.purc_schd_no.eq(t1.purc_schd_no)
				.and(exists(subQuery().select(S1W.prAll()).from(S1W)
						.where(S1W.purc_act_no.eq(t2.purc_act_no)
								.and(S1W.purc_act_seq.eq(t2.purc_act_seq))
								.and(S1W.slip_sts_typ
										.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))));
		dbc_bldr.addInnerJoin(t3, bracket(t3.purc_act_d_no.eq(t2.purc_act_d_no)
				.and(t3.purc_act_d_seq.eq(t2.purc_act_d_seq))));
		_arrSchd2Cache = new FXUCL_MCDbcCache<MST_ARR_SCHD_R>(dbc, dbc_bldr, list,
				MST_ARR_SCHD_R.$arr_schd_no);
	}
	protected static FXUCL_MCDbcCache<MST_ARR_SCHD_R> getArrSchd2Cache() {
		return object(CLAZZ)._arrSchd2Cache;
	}
	protected static MST_ARR_SCHD_R getArrSchd2R(String arrSchdNo) {
		return getArrSchd2Cache().get(arrSchdNo);
	}

	/**
	 * MAM_ITMキャッシュ
	 */
	protected static void initItmCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL,
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3");
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * MAVM_ITM_UNITキャッシュ
	 */
	protected static void initItmUnitCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache(MCList<?> dtlL) {
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), dtlL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return getItmUnitCache().get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}

	/**
	 * MAM_BIZ_RSNキャッシュ
	 */
	protected static void initBizRsnCache(MCList<ArrActIF_DtlR> dtlL) {
		object(CLAZZ)._initBizRsnCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _bizRsnCache = null;
	protected void _initBizRsnCache(MCList<?> dtlL) {
		MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.biz_rsn_cd, t.xpns_purc_flg);
		_bizRsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(dbc_bldr, dtlL,
				ArrActIF_DtlR.$rsn_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_BIZ_RSN_R> getBizRsnCache() {
		if (object(CLAZZ)._bizRsnCache == null) {
			object(CLAZZ)._initBizRsnCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._bizRsnCache;
	}
	protected static MAM_BIZ_RSN_R getBizRsnR(String bizRsnCd) {
		return getBizRsnCache().get(bizRsnCd);
	}

	/**
	 * デフォルト格付ＣＤキャッシュ
	 */
	protected String getDefGdCd() {
		if (object(CLAZZ)._defGdCd == null) {
			MAM_STK_GD_R dbc = MAM_STK_GD_R.create();
			MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_STK_GD_R S1W = MAM_STK_GD_R.create("W");
			dbc_bldr.setSelect(t.gd_cd);
			dbc_bldr.setWhere(t.sort_seq.eq(subQuery()
					.select(min(S1W.sort_seq)) .from(S1W)));
			dbSelect("MSBEL6000_MAM_STK_GD_S01", dbc, dbc_bldr);
			object(CLAZZ)._defGdCd = dbc.gd_cd();
		}
		return object(CLAZZ)._defGdCd;
	}
	protected String _defGdCd = null;
	
	// ///////////////////////////////////////////////
	// キャッシュ（ここまで）
	// ///////////////////////////////////////////////

	
	// ///////////////////////////////////////////////
	// ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * データ更新区分ロウマッチャー
	 */
	public class DataCrudTypMatcher implements MCRowMatcher<ArrActIF_DtlR> {

		MAC_DATA_CRUD_TYP[] _dataCrudTyp;
		
		public DataCrudTypMatcher(MAC_DATA_CRUD_TYP... dataCrudTyp) {
			_dataCrudTyp = dataCrudTyp;
		}

		@Override
		public boolean match(ArrActIF_DtlR r) {
			for (MAC_DATA_CRUD_TYP typ : _dataCrudTyp) {
				if (isSame(r.data_crud_typ(), typ.value())) {
					return true ;
				}
			}
			return false;
		}
	}

	/**
	 * 非在庫チェック
	 */
	protected boolean isNotStk(MAM_ITM_R itmR, String trdPtnTyp, MAM_BIZ_RSN_R rsnR) {
		if (MAC_STK_MNG_TYP.isNOT_MNG(itmR.stk_mng_typ())) {
			return true;
		}
		if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ()) && MAC_ASSET_MNG_TYP.isMNG(itmR.asset_mng_typ())) {
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC(trdPtnTyp)) {
				if (rsnR != null && rsnR.xpns_purc_flg()) {
					return true;
				}
			}
		}
		return false;
	}

	// ///////////////////////////////////////////////
	// ユーティリティ（ここまで）
	// ///////////////////////////////////////////////

	
	

	protected Map_ArrAct_DtlR_ArrActIF_DtlR<ArrAct_DtlR,ArrActIF_DtlR> createMap_ArrAct_DtlR_ArrActIF_DtlR() {
		return new Map_ArrAct_DtlR_ArrActIF_DtlR<ArrAct_DtlR, ArrActIF_DtlR>();
	}
	public class Map_ArrAct_DtlR_ArrActIF_DtlR<D extends ArrAct_DtlR, S extends ArrActIF_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(ArrAct_DtlR.$peg_no, ArrActIF_DtlR.$peg_no);
			addColumnPathMap(ArrAct_DtlR.$data_crud_typ, ArrActIF_DtlR.$data_crud_typ);
			addColumnPathMap(ArrAct_DtlR.$arr_act_no, ArrActIF_DtlR.$arr_act_no);
			addColumnPathMap(ArrAct_DtlR.$arr_schd_no, ArrActIF_DtlR.$arr_schd_no);
			addColumnPathMap(ArrAct_DtlR.$trd_cd, ArrActIF_DtlR.$trd_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_ptn_typ, ArrActIF_DtlR.$trd_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$itm_cd, ArrActIF_DtlR.$itm_cd);
			addColumnPathMap(ArrAct_DtlR.$itm_sub1, ArrActIF_DtlR.$itm_sub1);
			addColumnPathMap(ArrAct_DtlR.$itm_sub2, ArrActIF_DtlR.$itm_sub2);
			addColumnPathMap(ArrAct_DtlR.$itm_sub3, ArrActIF_DtlR.$itm_sub3);
			addColumnPathMap(ArrAct_DtlR.$itm_nm, ArrActIF_DtlR.$itm_nm);
			addColumnPathMap(ArrAct_DtlR.$rcpt_iv_itm_nm, ArrActIF_DtlR.$rcpt_iv_itm_nm);
			addColumnPathMap(ArrAct_DtlR.$sundry_itm_flg, ArrActIF_DtlR.$sundry_itm_flg);
			addColumnPathMap(ArrAct_DtlR.$purc_id_typ, ArrActIF_DtlR.$purc_id_typ);
			addColumnPathMap(ArrAct_DtlR.$sno1, ArrActIF_DtlR.$sno1);
			addColumnPathMap(ArrAct_DtlR.$sno2, ArrActIF_DtlR.$sno2);
			addColumnPathMap(ArrAct_DtlR.$sno3, ArrActIF_DtlR.$sno3);
			addColumnPathMap(ArrAct_DtlR.$sno4, ArrActIF_DtlR.$sno4);
			addColumnPathMap(ArrAct_DtlR.$lot_no, ArrActIF_DtlR.$lot_no);
			addColumnPathMap(ArrAct_DtlR.$sublot_no, ArrActIF_DtlR.$sublot_no);
			addColumnPathMap(ArrAct_DtlR.$ver_no, ArrActIF_DtlR.$ver_no);
			addColumnPathMap(ArrAct_DtlR.$gd_cd, ArrActIF_DtlR.$gd_cd);
			addColumnPathMap(ArrAct_DtlR.$quality_typ, ArrActIF_DtlR.$quality_typ);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_cd, ArrActIF_DtlR.$sppl_itm_cd);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_nm, ArrActIF_DtlR.$sppl_itm_nm);
			addColumnPathMap(ArrAct_DtlR.$arr_dpt_cd, ArrActIF_DtlR.$arr_dpt_cd);
			addColumnPathMap(ArrAct_DtlR.$arr_usr_cd, ArrActIF_DtlR.$arr_usr_cd);
			addColumnPathMap(ArrAct_DtlR.$cst_cd, ArrActIF_DtlR.$cst_cd);
			addColumnPathMap(ArrAct_DtlR.$sppl_cd, ArrActIF_DtlR.$sppl_cd);
			addColumnPathMap(ArrAct_DtlR.$maker_cd, ArrActIF_DtlR.$maker_cd);
			addColumnPathMap(ArrAct_DtlR.$bp_lot_no, ArrActIF_DtlR.$bp_lot_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_no, ArrActIF_DtlR.$bp_dlv_slip_no);
			addColumnPathMap(ArrAct_DtlR.$bp_dlv_slip_d_no, ArrActIF_DtlR.$bp_dlv_slip_d_no);
			addColumnPathMap(ArrAct_DtlR.$ship_fr_valid_dt, ArrActIF_DtlR.$ship_fr_valid_dt);
			addColumnPathMap(ArrAct_DtlR.$arr_loc_cd, ArrActIF_DtlR.$arr_loc_cd);
			addColumnPathMap(ArrAct_DtlR.$str_ln_cd, ArrActIF_DtlR.$str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$arr_tm, ArrActIF_DtlR.$arr_tm);
			addColumnPathMap(ArrAct_DtlR.$ac_dt, ArrActIF_DtlR.$ac_dt);
			addColumnPathMap(ArrAct_DtlR.$can_ac_dt, ArrActIF_DtlR.$can_ac_dt);
			addColumnPathMap(ArrAct_DtlR.$rcpt_iv_no, ArrActIF_DtlR.$rcpt_iv_no);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_qty, ArrActIF_DtlR.$trd_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_cd, ArrActIF_DtlR.$trd_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$base_unit_qty, ArrActIF_DtlR.$base_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$base_unit_cd, ArrActIF_DtlR.$base_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$purc_cont_qty, ArrActIF_DtlR.$purc_cont_qty);
			addColumnPathMap(ArrAct_DtlR.$rsn_cd, ArrActIF_DtlR.$rsn_cd);
			addColumnPathMap(ArrAct_DtlR.$bd_dpt_cd, ArrActIF_DtlR.$bd_dpt_cd);
			addColumnPathMap(ArrAct_DtlR.$sync_flg, ArrActIF_DtlR.$sync_flg);
			addColumnPathMap(ArrAct_DtlR.$insp_cnt_rmrks, ArrActIF_DtlR.$insp_cnt_rmrks);
			addColumnPathMap(ArrAct_DtlR.$intr_rmrks, ArrActIF_DtlR.$intr_rmrks);
			addColumnPathMap(ArrAct_DtlR.$trd_rmrks, ArrActIF_DtlR.$trd_rmrks);
			addColumnPathMap(ArrAct_DtlR.$trd_d_rmrks, ArrActIF_DtlR.$trd_d_rmrks);
			addColumnPathMap(ArrAct_DtlR.$sub_char1, ArrActIF_DtlR.$sub_char1);
			addColumnPathMap(ArrAct_DtlR.$sub_char2, ArrActIF_DtlR.$sub_char2);
			addColumnPathMap(ArrAct_DtlR.$sub_char3, ArrActIF_DtlR.$sub_char3);
			addColumnPathMap(ArrAct_DtlR.$arr_pr_no, ArrActIF_DtlR.$arr_pr_no);
			addColumnPathMap(ArrAct_DtlR.$iv_no, ArrActIF_DtlR.$iv_no);
			addColumnPathMap(ArrAct_DtlR.$arr_ptn_typ, ArrActIF_DtlR.$arr_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$abort_flg, ArrActIF_DtlR.$abort_flg);
			addColumnPathMap(ArrAct_DtlR.$crt_lot_flg, ArrActIF_DtlR.$crt_lot_flg);
			addColumnPathMap(ArrAct_DtlR.$same_lot_flg, ArrActIF_DtlR.$same_lot_flg);
			addColumnPathMap(ArrAct_DtlR.$purc_act_io_no, ArrActIF_DtlR.$purc_act_io_no);
			addColumnPathMap(ArrAct_DtlR.$stk_mng_typ, ArrActIF_DtlR.$stk_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno1_mng_typ, ArrActIF_DtlR.$sno1_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno2_mng_typ, ArrActIF_DtlR.$sno2_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno3_mng_typ, ArrActIF_DtlR.$sno3_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$sno4_mng_typ, ArrActIF_DtlR.$sno4_mng_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_arrv_bp_cd, ArrActIF_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$stk_insp_typ, ArrActIF_DtlR.$stk_insp_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_id_typ, ArrActIF_DtlR.$stk_id_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_bp_cd, ArrActIF_DtlR.$stk_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$rqst_dpt_cd, ArrActIF_DtlR.$rqst_dpt_cd);
			addColumnPathMap(ArrAct_DtlR.$rqst_usr_cd, ArrActIF_DtlR.$rqst_usr_cd);
			addColumnPathMap(ArrAct_DtlR.$sret_fr_cd, ArrActIF_DtlR.$sret_fr_cd);
			addColumnPathMap(ArrAct_DtlR.$ret_loc_cd, ArrActIF_DtlR.$ret_loc_cd);
			addColumnPathMap(ArrAct_DtlR.$ret_str_ln_cd, ArrActIF_DtlR.$ret_str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$ret_gd_cd, ArrActIF_DtlR.$ret_gd_cd);
			addColumnPathMap(ArrAct_DtlR.$bd_wg_cd, ArrActIF_DtlR.$bd_wg_cd);
			addColumnPathMap(ArrAct_DtlR.$edi_flg, ArrActIF_DtlR.$edi_flg);
			addColumnPathMap(ArrAct_DtlR.$edi_bp_dlv_slip_no, ArrActIF_DtlR.$edi_bp_dlv_slip_no);
			addColumnPathMap(ArrAct_DtlR.$edi_bp_dlv_slip_d_no, ArrActIF_DtlR.$edi_bp_dlv_slip_d_no);
			addColumnPathMap(ArrAct_DtlR.$io_schd_pr_no, ArrActIF_DtlR.$io_schd_pr_no);
			addColumnPathMap(ArrAct_DtlR.$mfg_inst_no, ArrActIF_DtlR.$mfg_inst_no);
			addColumnPathMap(ArrAct_DtlR.$pre_outsrc_act_flg, ArrActIF_DtlR.$pre_outsrc_act_flg);
			addColumnPathMap(ArrAct_DtlR.$prnt_flg, ArrActIF_DtlR.$prnt_flg);
			addColumnPathMap(ArrAct_DtlR.$wms_flg, ArrActIF_DtlR.$wms_flg);
			addColumnPathMap(ArrAct_DtlR.$ext_sys_cd, ArrActIF_DtlR.$ext_sys_cd);
			addColumnPathMap(ArrAct_DtlR.$ext_arr_act_no, ArrActIF_DtlR.$ext_arr_act_no);
			addColumnPathMap(ArrAct_DtlR.$lg_grp_cd, ArrActIF_DtlR.$lg_grp_cd);
			addColumnPathMap(ArrAct_DtlR.$wg_cd, ArrActIF_DtlR.$wg_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			// 仕入実績作成ＦＬＧ、画面処理と同様、「true」にしました
			dest.purc_act_chk_flg(true);

			// 売上返品チェック実行ＦＬＧ、画面処理と同様、「true」にしました。
			dest.sls_ret_chk_flg(true);

			// 売上返品チェック実行ＦＬＧ、画面処理と同様、「true」にしました。
			dest.outsrc_act_chk_flg(true);

			// 削除行はここまで（Map共用のため、更新関連項目をクリアする）
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				String[] removeCols = getUpdColumns();
				dest.clear(removeCols);
				return ;
			}

			MST_ARR_ACT_R aaR = getArrActR(src.arr_act_no());
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

			// 更新行のみ（更新ＦＬＧがオンの項目のみ更新する）
			if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				if(!src.arr_dpt_cd_upd_flg()) {
					dest.arr_dpt_cd(aaR.arr_dpt_cd());
				}
				if(!src.arr_usr_cd_upd_flg()) {
					dest.arr_usr_cd(aaR.arr_usr_cd());
				}
				if(!src.sno1_upd_flg()) {
					dest.sno1(aaR.sno1());
				}
				if(!src.sno2_upd_flg()) {
					dest.sno2(aaR.sno2());
				}
				if(!src.sno3_upd_flg()) {
					dest.sno3(aaR.sno3());
				}
				if(!src.sno4_upd_flg()) {
					dest.sno4(aaR.sno4());
				}
				if(!src.lot_no_upd_flg()) {
					dest.lot_no(aaR.lot_no());
				}
				if(!src.sublot_no_upd_flg()) {
					dest.sublot_no(aaR.sublot_no());
				}
				if(!src.ver_no_upd_flg()) {
					dest.ver_no(aaR.ver_no());
				}
				if(!src.gd_cd_upd_flg()) {
					dest.gd_cd(aaR.gd_cd());
				}
				if(!src.quality_typ_upd_flg()) {
					dest.quality_typ(aaR.quality_typ());
				}
				if(!src.sppl_itm_cd_upd_flg()) {
					dest.sppl_itm_cd(aaR.sppl_itm_cd());
				}
				if(!src.sppl_itm_nm_upd_flg()) {
					dest.sppl_itm_nm(aaR.sppl_itm_nm());
				}
				if(!src.maker_cd_upd_flg()) {
					dest.maker_cd(aaR.maker_cd());
				}
				if(!src.bp_lot_no_upd_flg()) {
					dest.bp_lot_no(aaR.bp_lot_no());
				}
				if(!src.bp_dlv_slip_no_upd_flg()) {
					dest.bp_dlv_slip_no(aaR.bp_dlv_slip_no());
				}
				if(!src.bp_dlv_slip_d_no_upd_flg()) {
					dest.bp_dlv_slip_d_no(aaR.bp_dlv_slip_d_no());
				}
				if(!src.ship_fr_valid_dt_upd_flg()) {
					dest.ship_fr_valid_dt(aaR.ship_fr_valid_dt());
				}
				if(!src.purc_cont_qty_upd_flg()) {
					dest.purc_cont_qty(aaR.purc_cont_qty());
				}
				if(!src.insp_cnt_rmrks_upd_flg()) {
					dest.insp_cnt_rmrks(aaR.insp_cnt_rmrks());
				}
				if(!src.intr_rmrks_upd_flg()) {
					dest.intr_rmrks(aaR.intr_rmrks());
				}
				if(!src.trd_rmrks_upd_flg()) {
					dest.trd_rmrks(aaR.trd_rmrks());
				}
				if(!src.trd_d_rmrks_upd_flg()) {
					dest.trd_d_rmrks(aaR.trd_d_rmrks());
				}
				if(!src.sub_char1_upd_flg()) {
					dest.sub_char1(aaR.sub_char1());
				}
				if(!src.sub_char2_upd_flg()) {
					dest.sub_char2(aaR.sub_char2());
				}
				if(!src.sub_char3_upd_flg()) {
					dest.sub_char3(aaR.sub_char3());
				}
				if(!src.arr_pr_no_upd_flg()) {
					dest.arr_pr_no(asR.arr_pr_no());
				}
				if(!src.iv_no_upd_flg()) {
					dest.iv_no(asR.iv_no());
				}
			}

			// 未着管理の場合に設定
			if (MSC_ARR_PTN_TYP.isN_YET_ARR(src.arr_ptn_typ())) {
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					MST_ARR_SCHD_R asR2 = getArrSchd2R(src.arr_schd_no());
					dest.purc_act_io_no(asR2.getString("purc_act_io_no"));
				}
				else {
					if (!isNull(src.arr_act_no())) {
						dest.purc_act_io_no(aaR.purc_act_io_no());
					}
				}
			}

			if (isNull(src.arr_schd_no())) {
				if (isNull(dest.gd_cd())) {
					dest.gd_cd(getDefGdCd());
				}
				if (isNull(dest.quality_typ())) {
					dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
			}
			else {
				dest.io_schd_pr_no(asR.io_schd_pr_no());
				dest.mfg_inst_no(asR.mfg_inst_no());
				dest.pre_outsrc_act_flg(asR.pre_outsrc_act_flg());
			}
		}

		protected String[] getUpdColumns() {
			String[] updColumns = {
					ArrAct_DtlR.$arr_schd_no,
					ArrAct_DtlR.$trd_cd,
					ArrAct_DtlR.$trd_ptn_typ,
					ArrAct_DtlR.$itm_cd,
					ArrAct_DtlR.$itm_sub1,
					ArrAct_DtlR.$itm_sub2,
					ArrAct_DtlR.$itm_sub3,
					ArrAct_DtlR.$itm_nm,
					ArrAct_DtlR.$rcpt_iv_itm_nm,
					ArrAct_DtlR.$sundry_itm_flg,
					ArrAct_DtlR.$purc_id_typ,
					ArrAct_DtlR.$sno1,
					ArrAct_DtlR.$sno2,
					ArrAct_DtlR.$sno3,
					ArrAct_DtlR.$sno4,
					ArrAct_DtlR.$lot_no,
					ArrAct_DtlR.$sublot_no,
					ArrAct_DtlR.$ver_no,
					ArrAct_DtlR.$gd_cd,
					ArrAct_DtlR.$quality_typ,
					ArrAct_DtlR.$sppl_itm_cd,
					ArrAct_DtlR.$sppl_itm_nm,
					ArrAct_DtlR.$arr_dpt_cd,
					ArrAct_DtlR.$arr_usr_cd,
					ArrAct_DtlR.$cst_cd,
					ArrAct_DtlR.$sppl_cd,
					ArrAct_DtlR.$maker_cd,
					ArrAct_DtlR.$bp_lot_no,
					ArrAct_DtlR.$bp_dlv_slip_no,
					ArrAct_DtlR.$bp_dlv_slip_d_no,
					ArrAct_DtlR.$ship_fr_valid_dt,
					ArrAct_DtlR.$arr_loc_cd,
					ArrAct_DtlR.$str_ln_cd,
					ArrAct_DtlR.$arr_tm,
					ArrAct_DtlR.$ac_dt,
					ArrAct_DtlR.$trd_unit_qty,
					ArrAct_DtlR.$trd_unit_cd,
					ArrAct_DtlR.$base_unit_qty,
					ArrAct_DtlR.$base_unit_cd,
					ArrAct_DtlR.$purc_cont_qty,
					ArrAct_DtlR.$rsn_cd,
					ArrAct_DtlR.$bd_dpt_cd,
					ArrAct_DtlR.$insp_cnt_rmrks,
					ArrAct_DtlR.$intr_rmrks,
					ArrAct_DtlR.$trd_rmrks,
					ArrAct_DtlR.$trd_d_rmrks,
					ArrAct_DtlR.$sub_char1,
					ArrAct_DtlR.$sub_char2,
					ArrAct_DtlR.$sub_char3,
					ArrAct_DtlR.$arr_pr_no,
					ArrAct_DtlR.$iv_no,
					ArrAct_DtlR.$arr_ptn_typ,
					ArrAct_DtlR.$abort_flg,
					ArrAct_DtlR.$crt_lot_flg,
					ArrAct_DtlR.$same_lot_flg,
					ArrAct_DtlR.$purc_act_io_no,
					ArrAct_DtlR.$stk_mng_typ,
					ArrAct_DtlR.$sno1_mng_typ,
					ArrAct_DtlR.$sno2_mng_typ,
					ArrAct_DtlR.$sno3_mng_typ,
					ArrAct_DtlR.$sno4_mng_typ,
					ArrAct_DtlR.$stk_arrv_bp_cd,
					ArrAct_DtlR.$stk_insp_typ,
					ArrAct_DtlR.$stk_id_typ,
					ArrAct_DtlR.$stk_bp_cd,
					ArrAct_DtlR.$rqst_dpt_cd,
					ArrAct_DtlR.$rqst_usr_cd,
					ArrAct_DtlR.$sret_fr_cd,
					ArrAct_DtlR.$ret_loc_cd,
					ArrAct_DtlR.$ret_str_ln_cd,
					ArrAct_DtlR.$ret_gd_cd,
					ArrAct_DtlR.$bd_wg_cd,
					ArrAct_DtlR.$edi_flg,
					ArrAct_DtlR.$edi_bp_dlv_slip_no,
					ArrAct_DtlR.$edi_bp_dlv_slip_d_no,
					ArrAct_DtlR.$io_schd_pr_no,
					ArrAct_DtlR.$mfg_inst_no,
					ArrAct_DtlR.$pre_outsrc_act_flg,
					ArrAct_DtlR.$prnt_flg
			};
			
			return updColumns;
		}
	}

	//FMCB CUSTOM END
}