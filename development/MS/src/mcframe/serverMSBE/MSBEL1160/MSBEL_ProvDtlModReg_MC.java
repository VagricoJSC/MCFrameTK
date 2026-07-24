package mcframe.serverMSBE.MSBEL1160;

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
import mcframe.serverMS.dbc.*;
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
import mcframe.serverMSBE.MSBEL1160.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1160.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;

import mcframe.commonCore.param.MCParam;
import java.util.ArrayList;
import java.util.List;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ProvDtlModReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ProvDtlModReg_MC extends MSBEL_ProvDtlModReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支給予定、支給実績の検索する<br>
	 */
	public class Srch01 extends MSBEL_ProvDtlModReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		protected void beforeSearchForBizDatDLCmn() {
			// 検索種別
			up0().prov(true);
			up0().prov_rtn(true);
			// 支給区分
			up0().ffr_prov_flg(true);
			up0().onr_prov_flg(true);
			// 下請
			up0().subcon_flg(true);
			up0().not_subcon_flg(true);
			// 支給先分類
			up0().prsppl_grp_flg1(true);
			up0().prsppl_grp_flg2(true);
			up0().prsppl_grp_flg3(true);
			up0().prsppl_grp_flg4(true);
			up0().prsppl_grp_flg5(true);
			up0().prsppl_grp_flg6(true);
			up0().prsppl_grp_flg7(true);
			up0().prsppl_grp_flg8(true);
			up0().prsppl_grp_flg9(true);
			up0().prsppl_grp_flg10(true);
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol();
			doSrch();
		}

		protected void setUpTmpCol() {

			// 検索種別
			if (up0().prov()) {
				up0().addStringColumn("prov_str", MAC_TRD_PTN_TYP.PROV.value());
			}
			if (up0().prov_rtn()) {
				up0().addStringColumn("prov_rtn_str", MAC_TRD_PTN_TYP.PROV_RTN.value());
			}

			// 支給区分
			if (up0().ffr_prov_flg()) {
				up0().addStringColumn("ffr_prov_flg_str", MAC_PROV_TYP.FFR_PROV.value());
			}
			if (up0().onr_prov_flg()) {
				up0().addStringColumn("onr_prov_flg_str", MAC_PROV_TYP.ONR_PROV.value());
			}

			// 下請対象
			if (!isSame(up0().subcon_flg(), up0().not_subcon_flg())) {
				up0().addStringColumn("subcon_flg_str", MCBooleanUtil.booleanToDBString(up0().subcon_flg()));
			}

			// 納品書発行
			if (!isSame(up0().dlv_not_prnted(), up0().dlv_prnted())) {
				up0().addStringColumn("dlv_prnted_str", MCBooleanUtil.booleanToDBString(up0().dlv_prnted()));
			}

			// 外貨のみ
			if (up0().foreign_flg()) {
				up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			}
			if (isSame(up0().ope(), "2") && up0().dis_can_disp_flg()) {
				up0().addStringColumn("print_flg_str", MCBooleanUtil.booleanToDBString(true));
			}
			if (isSame(up0().ope(), "2")) {
				up0().addStringColumn("ope_prnt", MCBooleanUtil.booleanToDBString(true));
			} else {
				up0().addStringColumn("ope_prnt", MCBooleanUtil.booleanToDBString(false));
			}
		}

		protected void doSrch() {
			if (isSame(up0().ope(), "4")) {
				searchForDL(MSBEL1160_MST_PROV_SCHD_S01(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_SCHD_S02(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_SCHD_S03(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_SCHD_S04(), up0(), down0());
			}
			else {
				searchForDL(MSBEL1160_MST_PROV_ACT_S01(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_ACT_S02(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_ACT_S03(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_ACT_S04(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_ACT_S05(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_ACT_S06(), up0(), down0());
				searchForDL(MSBEL1160_MST_PROV_ACT_S07(), up0(), down0());
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			// 返品・値引金額符号反転がオンの場合、符号を反転
			if (up0().sign_rev_flg()) {
				for (Srch01_DtlR r : down0()) {
					if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
						if (!isNull(r.schd_qty())) r.schd_qty(r.schd_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.act_qty())) r.act_qty(r.act_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.trd_cur_amt())) r.trd_cur_amt(r.trd_cur_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.trd_cur_inc_tax_amt())) r.trd_cur_inc_tax_amt(r.trd_cur_inc_tax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.trd_cur_tax_amt())) r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.base_cur_amt())) r.base_cur_amt(r.base_cur_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.base_cur_inc_tax_amt())) r.base_cur_inc_tax_amt(r.base_cur_inc_tax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.base_cur_tax_amt())) r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.ptax_cur_amt())) r.ptax_cur_amt(r.ptax_cur_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.ptax_cur_inc_tax_amt())) r.ptax_cur_inc_tax_amt(r.ptax_cur_inc_tax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.ptax_cur_tax_amt())) r.ptax_cur_tax_amt(r.ptax_cur_tax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.wtax_amt())) r.wtax_amt(r.wtax_amt().multiply(MAC_TRD_PTN_TYP.amt_disp_pm(r.trd_ptn_typ())));
					}
				}
			}

			if (isSame(up0().ope(), "1")) {
				for (Srch01_DtlR r : down0()) {
					if (r.ac_ym().lte(MSUCL_ClUtil.getPurcClYm())) {
						r.purc_close_flg(true);
					}
				}
			}
			getProvSchd();
			setIvTgt();
			down0().setString(Srch01_DtlR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setString(Srch01_DtlR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
		}

		protected void getProvSchd() {
			//取得結果の支給予定ＮＯがNULLの場合、支給予定を再取得する。
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			for (Srch01_DtlR r : down0()) {
				if (MSC_PROV_SRC_ACT_TYP.isSHIP(r.prov_src_act_typ()) && MAC_STR.isNULL_VAL(r.prov_schd_no())) {
					dtlL.add(r);
				}
			}
			if(isNull(dtlL)) {
				return;
			}
			MCList<Srch01_DtlR> rsltL = MCList.create(Srch01_DtlR.class);
			executeQuery(rsltL, MSBEL1160_MST_PROV_SCHD_S05(), dtlL);
			
			MCIndexKey key = rsltL.createIndex(MST_PROV_ACT_R.$prov_act_no);
			for (Srch01_DtlR r : down0()) {
				Srch01_DtlR rsltR = rsltL.getFirst(key, r.prov_act_no());
				if (!isNull(rsltR)) {
					r.tax_fix_flg(rsltR.tax_fix_flg());
					r.xrate_inpt_flg(rsltR.xrate_inpt_flg());
					r.ptax_xrate_inpt_flg(rsltR.ptax_xrate_inpt_flg());
				}
			}
		}

		protected void setIvTgt() {
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			rsltL.addStringColumn("iv_no");
			executeQuery(rsltL, MSBEL1160_MST_DLV_SLIP_S01(), down0());
			
			MCIndexKey key = rsltL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			
			for (Srch01_DtlR r : down0()) {
				MST_DLV_SLIP_R rsltR = rsltL.getFirst(key, r.dlv_slip_no());
				if (!isNull(rsltR) && !isNull(rsltR.getStringNE("iv_no"))) {
					r.iv_trd_flg(true);
				}
			}
		}
	}
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 支給実績情報の訂正前チェックを行う<br>
	 */
	public class Chk01 extends MSBEL_ProvDtlModReg_MC_A.Chk01 {

		MCList<MST_PROV_ACT_R> _provActL;
		MCList<MST_XFR_ACT_R> _xfrActL;

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
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			lock();

			// チェック処理はチェックＧＲＰＮＯ単位で行う
			// グループ内で１レコードでもエラーが発生した場合は、グループすべてのレコードをエラー扱いとする
			// チェックＧＲＰＮＯは、呼び出し元(Upd01)内でグループ単位に連番が設定済の前提とする

			MCList<Chk01_DtlR>[] chkGrpL = up0().groupList(Chk01_DtlR.$chk_grp_no);

			for (MCList<Chk01_DtlR> chkL : chkGrpL) {
				MCMessageList subMsgL = new MCMessageList();

				subMsgL.addAll(checkUpdCntr(chkL));

				setErrFlg(subMsgL);

				chkProvAct(chkL.subList(Chk01_DtlR.$err_flg, false));

				if (hasErrFlgOn(chkL)) {
					subMsgL.addAll(setErrChkGrp(chkL));
				}

				msgL.addAll(subMsgL);
			}

			for (Chk01_DtlR r : up0().subList(Chk01_DtlR.$err_flg, false)) {
				MST_PROV_ACT_R pa = MSBEL_ProvActService.getProvActCache().get(r.prov_act_no(), null, null, null);
				r.itm_cd(pa.itm_cd());
				r.itm_sub1(pa.itm_sub1());
				r.itm_sub2(pa.itm_sub2());
				r.itm_sub3(pa.itm_sub3());
			}

			return msgL;
		}

		/**
		 * 	更新対象データを排他ロックで取得する
		 */
		protected void lock() {
			// 支給実績
			_provActL = MCList.create(MST_PROV_ACT_R.class);
			MCQueryApiBuilder provActL_bldr = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
			provActL_bldr.setOrderByAsc(provActL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1160_MST_PROV_ACT_S01", _provActL, provActL_bldr, up0().groupBy(Chk01_DtlR.$prov_act_no, Chk01_DtlR.$prov_act_seq));
		}

		protected void chkProvAct(MCList<Chk01_DtlR> chkL) {
			MSBEL_ProvActService.ProvAct_Chk01 o = MSBEL_ProvActService.crtProvAct_Chk01();
			addAll(o.up0(), chkL, createMap_ProvActChk01_DtlR_Chk01_DtlR());

			if (!o.up0().isEmpty()) {
				o.up1().upd_flg(true);
				o.exec();
				copyErrFlg(chkL, o.down0());
			}
		}

		protected Map_ProvActChk01_DtlR_Chk01_DtlR<ProvActChk01_DtlR,Chk01_DtlR> createMap_ProvActChk01_DtlR_Chk01_DtlR() {
			return new Map_ProvActChk01_DtlR_Chk01_DtlR<ProvActChk01_DtlR, Chk01_DtlR>();
		}

		public class Map_ProvActChk01_DtlR_Chk01_DtlR<D extends ProvActChk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActChk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(ProvActChk01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
				addColumnPathMap(ProvActChk01_DtlR.$can_ac_dt, Chk01_DtlR.$can_ac_dt);
				addColumnPathMap(ProvActChk01_DtlR.$prov_act_no, Chk01_DtlR.$prov_act_no);
				addColumnPathMap(ProvActChk01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
				addColumnPathMap(ProvActChk01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}

		/**
		 * 更新カウンタチェック
		 * @return
		 */
		protected MCMessageList checkUpdCntr(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			// インデックスの作成
			MCIndexKey idxProvAct = _provActL.createIndex(Chk01_DtlR.$prov_act_no, Chk01_DtlR.$prov_act_seq);

			// 更新カウンタチェック
			for (Chk01_DtlR r : chkL) {
				MST_PROV_ACT_R pa = _provActL.getFirst(idxProvAct, r.prov_act_no(), r.prov_act_seq());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$prov_upd_cntr, pa));
			}

			// DACキー(支給先場所ＣＤ)の変更はないため、更新前データのDAC更新権限チェックは省略

			if (hasErr()) {
				return msgL;
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 納品書のヘッダと明細の関係チェック
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			msgL = checkSlipKeys(notErrL);

			notErrL = getChkList(up0());

			for (MCList<Chk01_DtlR> chkL : notErrL.groupList(Chk01_DtlR.$chk_grp_no)) {

				MCMessageList subMsgL = new MCMessageList();

				// 補完処理
				compSub(chkL);

				// DAC更新権限チェック
				subMsgL.addAll(checkWritableLocCdDac(chkL, Chk01_DtlR.$prsppl_loc_cd));

				// 条件付き必須チェック
				subMsgL.addAll(checkReqSub(chkL));

				// 条件付き存在チェック
				subMsgL.addAll(checkExistsSub(chkL));

				// 固有チェック
				subMsgL.addAll(checkOther(chkL));

				setErrFlg(subMsgL);
				if (hasErrFlgOn(chkL)) {
					subMsgL.addAll(setErrChkGrp(chkL));
				}

				msgL.addAll(subMsgL);
			}
			return msgL;
		}

		/**
		 * 	キャッシュから上り電文の値を補完する<br>
		 * @param chkL
		 */
		protected void compSub(MCList<Chk01_DtlR> chkL) {
			for (Chk01_DtlR r :chkL) {
				MST_PROV_ACT_R pa = MSBEL_ProvActService.getProvActCache().get(r.prov_act_no(), null, null, null);
				r.prsppl_loc_cd(pa.loc_cd());
				r.prov_typ(pa.prov_typ());
			}
		}

		/**
		 * 	条件付必須チェック
		 * @param chkL
		 * @return
		 */
		protected MCMessageList checkReqSub(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : chkL) {
				if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlR.$trd_cur_amt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlR.$trd_cur_inc_tax_amt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk01_DtlR.$xrate, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * 条件付存在チェック
		 * @param chkL
		 */
		protected MCMessageList checkExistsSub(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR r : chkL) {

				// 定型処理のリストロジックでは条件なしで取得後、ここでマッチしない組み合わせはエラーにする
				if (!isNull(r.xfr_rsn_nm())) {
					// 他勘定出庫ＦＬＧがオフの業務理由ＣＤのみ可
					if (r.acxfr_gi_flg()) {
						MAM_BIZ_RSN_R checkDbc = MAM_BIZ_RSN_R.create();
						msgL.addAll(getRecordNotFoundMsg("MS", checkDbc.tableName(),
								checkDbc.getKeyColumn(),
								r.toArray(checkDbc.getKeyColumn()), r));
					}
				}
				if (!isNull(r.tax_cd()) && isNull(r.tax_nm())) {
					MAM_TAX_R checkDbc = MAM_TAX_R.create();
					msgL.addAll(getRecordNotFoundMsg("MS", checkDbc.tableName(),
							checkDbc.getKeyColumn(),
							r.toArray(checkDbc.getKeyColumn()), r));
				}
			}

			return msgL;
		}

		/**
		 * 	固有チェック
		 * @return
		 */
		protected MCMessageList checkOther(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();
			//仕入締チェック
			msgL.addAll(checkPurcCl(chkL));
			return msgL;
		}

		/**
		 * 仕入締チェック
		 * 
		 * @param chkL
		 * @return
		 */
		protected MCMessageList checkPurcCl(MCList<Chk01_DtlR> chkL) {
			MCMessageList msgL = new MCMessageList();

			// インデックスの作成
			MCIndexKey idxProvAct = _provActL.createIndex(Chk01_DtlR.$prov_act_no, Chk01_DtlR.$prov_act_seq);

			for (Chk01_DtlR r : chkL) {
				MST_PROV_ACT_R pa = _provActL.getFirst(idxProvAct, r.prov_act_no(), r.prov_act_seq());
				MCDate acYm = getAcYm(pa.ac_dt());
				if (!acYm.lte(MSUCL_ClUtil.getPurcClYm())) {
					if (!isSame(r.ac_dt(), pa.ac_dt())) {
						msgL.add(new MCMessage(r, null, MSBEL1066, toYMDString(pa.ac_dt()), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 同じ納品書に含まれる明細ならば、ヘッダのまとめ条件の項目の値がすべて同じになっているかチェック
		 * chk_grp_no を横断してチェックする必要がある。
		 * @return
		 */
		protected MCMessageList checkSlipKeys(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			// 上り電文に納品書ＮＯを設定する
			MCList<MST_PROV_ACT_R> provActL = MCList.create(MST_PROV_ACT_R.class);
			MCList<Chk01_DtlR> ans = MCList.create(Chk01_DtlR.class);

			for (Chk01_DtlR chkR : chkL) {
				MST_PROV_ACT_R paR = provActL.add();
				paR.prov_act_no(chkR.prov_act_no());
				paR.prov_act_seq(chkR.prov_act_seq());
			}

			MCQueryApiBuilder provActL_bldr = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
			dbWkDelete("MSBEL1160_MSW_PROV_ACT_D01", provActL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1160_MSW_PROV_ACT_I01", provActL, provActL_bldr.getBaseDbc());
			executeQuery(ans, MSBEL1160_MST_PROV_ACT_S08());

			String[] provActKey = new String[]{Chk01_DtlR.$prov_act_no, Chk01_DtlR.$prov_act_seq};
			MCJoinKey<MCList<Chk01_DtlR>> joinKey = chkL.join(provActKey, ans, provActKey);

			for (Chk01_DtlR chkR : chkL) {
				Chk01_DtlR joinR = chkR.getJoinedRow(joinKey);
				chkR.dlv_slip_no(joinR.dlv_slip_no());
				chkR.prsppl_cd(joinR.prsppl_cd());
			}

			// 納品伝票ヘッダのまとめ条件となる項目はすべての明細で同じ値に更新されているかのチェック
			MCList<MST_DLV_SLIP_R> modifiedSlipsL = MCList.create(MST_DLV_SLIP_R.class);
			List<MCList<Chk01_DtlR>> modifiedSlipDtlsL = new ArrayList<MCList<Chk01_DtlR>>();

			for (MCList<Chk01_DtlR> dtlsL : chkL.groupList(Chk01_DtlR.$dlv_slip_no)) {
				if (isNullOrNullVal(dtlsL.get(0).dlv_slip_no())
						|| !MAC_TAX_CALC_TYP.isSLIP(MSBEL_ProvSchdService.getBpCache().get(dtlsL.get(0).prsppl_cd()).prov_tax_calc_typ())) {
					continue;
				}
				MCList<Chk01_DtlR> hdr = dtlsL.groupBy(MSBEL_ProvActService.getSlipKey());
				if (1 < hdr.size()) {
					// 上り電文のうち、納品書ＮＯが同じで、ヘッダまとめ条件の項目の値が異なる行があればエラー
					Chk01_DtlR errR = dtlsL.get(0);
					msgL.add(new MCMessage(errR, null, MSBEL0140, errR.dlv_slip_no()));
					errR.err_flg(true);
					msgL.addAll(setErrChkGrp(dtlsL));
				}
				else if (true) {
					// ヘッダ項目にひとつでも変更があればすべての明細が同じ値に更新されているかのチェック対象とする
					Chk01_DtlR dtlR = dtlsL.get(0);
					Chk01_DtlR orgR = dtlR.getJoinedRow(joinKey);
					if (!isSame(dtlR.ac_dt(), orgR.ac_dt())
							|| !isSame(dtlR.tax_rate(), orgR.tax_rate())
							|| !isSame(dtlR.xrate(), orgR.xrate())
							|| !isSame(dtlR.ptax_xrate(), orgR.ptax_xrate())
							|| !isSame(dtlR.wtax_rate(), orgR.wtax_rate())
							|| (!isNull(orgR.base_cur_cd()) && !isSame(getCo().base_cur_cd(), orgR.base_cur_cd()))
							|| !isSame(dtlR.ptax_cur_cd(), orgR.ptax_cur_cd())) {
						modifiedSlipsL.add().dlv_slip_no(dtlsL.get(0).dlv_slip_no());
						modifiedSlipDtlsL.add(dtlsL);
					}
				}
			}

			if (!modifiedSlipsL.isEmpty()) {
				// 納品伝票明細の元実績がすべて上り電文に含まれるかのチェック
				// 変更がある場合はすべて同じ値に更新する必要があるため
				MCList<MCRow> countL = MCList.create(MCRow.class);
				countL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
				countL.addNumberColumn("counts");

				MCQueryApiBuilder modifiedSlipsL_bldr = MCQueryApiBuilder.create(MST_DLV_SLIP_R.create("T"));
				dbWkDelete("MSBEL1160_MSW_DLV_SLIP_D01", modifiedSlipsL_bldr.getBaseDbc());
				dbWkInsert("MSBEL1160_MSW_DLV_SLIP_I01", modifiedSlipsL, modifiedSlipsL_bldr.getBaseDbc());
				executeQuery(countL, MSBEL1160_MST_PROV_ACT_S09());

				MCIndexKey idxCount = countL.createIndex(Chk01_DtlR.$dlv_slip_no);
				for (MCList<Chk01_DtlR> dtlsL : modifiedSlipDtlsL) {
					if (!isSame(countL.getFirst(idxCount, dtlsL.get(0).dlv_slip_no()).getNumberNE("counts"),
							MCNumber.valueOf(dtlsL.size()))) {
						Chk01_DtlR errR = dtlsL.get(0);
						msgL.add(new MCMessage(errR, null, MSBEL0140, errR.dlv_slip_no()));
						errR.err_flg(true);
						msgL.addAll(setErrChkGrp(dtlsL));
					}
				}
			}
			return msgL;
		}

		/**
		 * 	チェックＧＲＰＮＯ単位のすべてのレコードのエラーＦＬＧをオンにする
		 * @param chkL
		 */
		protected MCMessageList setErrChkGrp(MCList<Chk01_DtlR> chkL) {

			MCMessageList msgL = new MCMessageList();

			Chk01_DtlR errDtl = chkL.getFirst(Chk01_DtlR.$err_flg, true);

			for (Chk01_DtlR r : chkL) {
				if (!r.err_flg()) {
					// 関連する行でエラーになりました。\nエラー行：{1}\n関連する行：{2}
					msgL.add(new MCMessage(r, null, MAUDL0013, toDispGUIIndex(r),
							toDispGUIIndex(errDtl)));
					r.err_flg(true);
				}
			}
			return msgL;
		}

		protected void setDown() {
			down0().addAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支給実績情報の訂正を行う<br>
	 */
	public class Upd01 extends MSBEL_ProvDtlModReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				dbTran().commit();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		@Override
		protected void doIt() {

			// 上り電文の編集
			editUp();

			// チェックオペレーションの呼び出し
			callThisChk01();

			// 支給実績サービス呼出
			callProvActSvUpd01();

			// 受払実績サービス呼出
			callIoActSvUpd01();

			// 下り電文の設定
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());

			/**
			 * チェックＧＲＰＮＯの設定
			 * チェックＧＲＰＮＯは、チェック処理単位をグルーピングするため揮発性ＮＯ (チェック処理単位で１レコードでもエラーがあれば、チェック単位すべてをエラーにする目的）
			 * 分割実単位も上記単位で分割済の前提
			 */
			MCList<Chk01_DtlR>[] provGrpL = up0().groupList(MSBEL_ProvActService.getSlipKey());
			int i = 0;
			for (MCList<Chk01_DtlR> provL : provGrpL) {
				provL.setNumber(Chk01_DtlR.$chk_grp_no, i++);
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			chk01.up0().setAll(up0());
			chk01.call();
			up0().setAll(chk01.down0());
		}

		/**
		 * 	支給実績サービスの呼出
		 */
		protected void callProvActSvUpd01() {

			MCList<Chk01_DtlR> notErrL = chk01_down0.subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.isEmpty()) {
				return;
			}

			MSBEL_ProvActService.ProvAct_Upd01 ope = MSBEL_ProvActService.crtProvAct_Upd01();

			for (Chk01_DtlR r : notErrL) {
				ProvActUpd01_DtlR up0 = ope.up0().add();
				copy(up0, MSBEL_ProvActService.getProvActCache().get(r.prov_act_no(), null, null, null),
						createMap_ProvActUpd01_DtlR_MST_PROV_ACT_R());
				up0.peg_no(r.peg_no());
				up0.ac_dt(r.ac_dt());
				up0.can_ac_dt(r.can_ac_dt());
				up0.arr_act_no(r.arr_act_no());
				// 画面の値で更新する
				up0.xfr_rsn_cd(r.xfr_rsn_cd());
				up0.ap_dpt_cd(r.ap_dpt_cd());
				up0.xrate(r.xrate());
				up0.tax_cd(r.tax_cd());
				up0.trd_cur_upri(r.trd_cur_upri());
				up0.trd_cur_amt(r.trd_cur_amt());
				up0.trd_cur_tax_amt(r.trd_cur_tax_amt());
				up0.wtax_rate(r.wtax_rate());
				up0.intr_rmrks(r.intr_rmrks());
				up0.trd_d_rmrks(r.trd_d_rmrks());
				up0.sub_char1(r.sub_char1());
				up0.sub_char2(r.sub_char2());
				up0.sub_char3(r.sub_char3());
				up0.base_ac_dt(r.base_ac_dt());
				up0.addBooleanColumn("iv_trd_flg", r.iv_trd_flg());
			}
			ope.up1().upd_flg(true);
			ope.up1().prnt_out_flg(notErrL.get(0).prnt_out_flg());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();

			String[] srcCols = new String[]{ProvActUpd01_DtlR.$dlv_slip_no, ProvActUpd01_DtlR.$dlv_slip_d_no};
			String[] destCols = new String[]{Chk01_DtlR.$dlv_slip_no, Chk01_DtlR.$dlv_slip_d_no};
			copyByPegNo(notErrL, destCols, ope.down0(), srcCols);
			for (Chk01_DtlR r : notErrL) {
				if (MAC_STR.isNULL_VAL(r.dlv_slip_no())) {
					r.dlv_slip_no(null);
				}
				if (MAC_STR.isNULL_VAL(r.dlv_slip_d_no())) {
					r.dlv_slip_d_no(null);
				}
			}
		}

		/**
		 * 印刷処理を実行する
		 */
		protected void callShipRprtPrntServicePrnt01(MCList<Chk01_DtlR> notErrL) {
			if (!notErrL.get(0).prnt_out_flg()) {
				return;
			}

			MCList<MST_DLV_SLIP_R> dbc = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.dlv_slip_no, t.dlv_slip_seq);
			dbc_bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no"))
					.and(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
			dbSelect("MSBEL1160_MST_DLV_SLIP_S01", dbc, dbc_bldr, notErrL.groupBy(Chk02_DtlR.$dlv_slip_no));

			if (dbc.isEmpty()) {
				return;
			}

			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			MCIndexKey idx = notErrL.createIndex(Chk02_DtlR.$dlv_slip_no);

			for (MST_DLV_SLIP_R dlvSlip : dbc) {
				Chk01_DtlR r = notErrL.getFirst(idx, dlvSlip.dlv_slip_no());
				ShipRprt_Prnt01_HdrR up0 = o.up0().add();
				up0.dlv_slip_no(r.dlv_slip_no());
				up0.dlv_slip_seq(dlvSlip.dlv_slip_seq());
				up0.dlv_slip_prnt_flg(true);
			}
			setPegNo(o.up0());
			o.exec();

			copyErrFlg(o.up0(), o.down0());
			for (ShipRprt_Prnt01_HdrR r :o.up0()) {
				notErrL.subList(idx, r.dlv_slip_no()).setBoolean(Chk02_DtlR.$err_flg, r.err_flg());
			}
		}

		/**
		 * 	受払実績サービスの呼出
		 */
		protected void callIoActSvUpd01() {
			// 上り電文なし。callするだけ
			MSBEL_IoActService.crtIoAct_Upd01().exec();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		// 分割実行制御
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			resetSlipNo();

			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>) ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void resetSlipNo() {
			MCList<Chk01_DtlR> xfrL = MCList.create(Chk01_DtlR.class);
			MCList<Chk01_DtlR> arrL = MCList.create(Chk01_DtlR.class);
			MCList<Chk01_DtlR> shipL = MCList.create(Chk01_DtlR.class);

			for (Chk01_DtlR r : up0()) {
				if (MSC_PROV_SRC_ACT_TYP.isXFR(r.prov_src_act_typ())) {
					xfrL.add(r);
				}
				else if (MSC_PROV_SRC_ACT_TYP.isSHIP(r.prov_src_act_typ())) {
					arrL.add(r);
				}
				else if (MSC_PROV_SRC_ACT_TYP.isRET_SHIP(r.prov_src_act_typ())) {
					shipL.add(r);
				}
			}

			// 納品書ＮＯをリセットする
			if (!xfrL.isEmpty()) {
				resetSlipNo(getXfr(xfrL), xfrL);
			}
			if (!arrL.isEmpty()) {
				resetSlipNo(getArr(arrL), arrL);
			}
			if (!shipL.isEmpty()) {
				resetSlipNo(getShip(shipL), shipL);
			}
		}

		protected MCList<MST_PROV_ACT_R> getXfr(MCList<Chk01_DtlR> xfrL) {
			insWk(xfrL);

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MSW_PROV_ACT_KEY_R w = MSW_PROV_ACT_KEY_R.create("W");
			MST_XFR_ACT_D_R t2 = MST_XFR_ACT_D_R.create("T2");
			dbc_bldr.addSelect(t2.dlv_slip_no, t2.dlv_slip_d_no);
			dbc_bldr.addInnerJoin(w, bracket(t.prov_act_no.eq(w.prov_act_no)
					.and(t.prov_act_seq.eq(w.prov_act_seq))));
			dbc_bldr.addInnerJoin(t2, bracket(t.prov_src_act_no.eq(t2.xfr_act_d_no)));
			dbc_bldr.addLockTable(t2.dlv_slip_no);
			dbSelectForUpdate("MSBEL1160_MST_PROV_ACT_S02", dbc, dbc_bldr);
			return dbc;
		}

		protected MCList<MST_PROV_ACT_R> getArr(MCList<Chk01_DtlR> arrL) {
			insWk(arrL);

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MSW_PROV_ACT_KEY_R w = MSW_PROV_ACT_KEY_R.create("W");
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_ARR_PR_R t4 = MST_ARR_PR_R.create("T4");
			dbc_bldr.addSelect(nvl(cases()
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
					.then(t3.dlv_slip_no).otherwise(t2.dlv_slip_no),
					value(MAC_STR.NULL_VAL.value())).as("dlv_slip_no"));
			dbc_bldr.addSelect(nvl(cases()
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
					.then(t4.dlv_slip_d_no).otherwise(t2.dlv_slip_d_no),
					value(MAC_STR.NULL_VAL.value())).as("dlv_slip_d_no"));
			dbc_bldr.addSelect(t3.arr_schd_no);
			dbc_bldr.addInnerJoin(w, bracket(t.prov_act_no.eq(w.prov_act_no)
					.and(t.prov_act_seq.eq(w.prov_act_seq))));
			dbc_bldr.addInnerJoin(t2, bracket(t.prov_src_act_no.eq(t2.arr_act_no)));
			dbc_bldr.addLeftOuterJoin(t3, bracket(t3.arr_schd_no.eq(t2.arr_schd_no)));
			dbc_bldr.addLeftOuterJoin(t4, bracket(t4.arr_pr_no.eq(t3.arr_pr_no)));
			dbc_bldr.addLockTable(t2.dlv_slip_no);
			dbSelectForUpdate("MSBEL1160_MST_PROV_ACT_S03", dbc, dbc_bldr);
			
			lockArrSchd(dbc);
			
			return dbc;
		}

		protected void lockArrSchd(MCList<MST_PROV_ACT_R> selectL) {
			MCList<MST_ARR_SCHD_R> arrBindL = MCList.create(MST_ARR_SCHD_R.class);
			for (MST_PROV_ACT_R selR : selectL) {
				String arrSchdNo = selR.getStringNE(MST_ARR_SCHD_R.$arr_schd_no);
				if (!isNull(arrSchdNo)) {
					MST_ARR_SCHD_R tmp = MST_ARR_SCHD_R.create();
					tmp.arr_schd_no(arrSchdNo);
					arrBindL.add(tmp);
				}
			}
			if (!arrBindL.isEmpty()) {
				MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder arrBuilder = MCQueryApiBuilder.create(t);
				arrBuilder.setSelect(t.arr_schd_no);
				arrBuilder.setOrderByAsc(t.arr_schd_no);
				dbSelectKeyForUpdateNoFetch("MSBEL1160_MST_ARR_SCHD_S01", arrBuilder, arrBindL);
			}
		}

		protected MCList<MST_PROV_ACT_R> getShip(MCList<Chk01_DtlR> shipL) {
			insWk(shipL);

			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MSW_PROV_ACT_KEY_R w = MSW_PROV_ACT_KEY_R.create("W");
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			dbc_bldr.addSelect(t2.dlv_slip_no, t2.dlv_slip_d_no);
			dbc_bldr.addInnerJoin(w, bracket(t.prov_act_no.eq(w.prov_act_no)
					.and(t.prov_act_seq.eq(w.prov_act_seq))));
			dbc_bldr.addInnerJoin(t2, bracket(t.prov_src_act_no.eq(t2.ship_act_d_no)));
			dbc_bldr.addLockTable(t2.dlv_slip_no);
			dbSelectForUpdate("MSBEL1160_MST_PROV_ACT_S04", dbc, dbc_bldr);
			return dbc;
		}

		protected void insWk(MCList<Chk01_DtlR> dL) {
			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);

			for (Chk01_DtlR r : dL) {
				MST_PROV_ACT_R tmpR = MST_PROV_ACT_R.create();
				tmpR.prov_act_no(r.prov_act_no());
				tmpR.prov_act_seq(r.prov_act_seq());
				dbc.add(tmpR);
			}
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
			dbWkDelete("MSBEL1160_MSW_PROV_ACT_D02", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBEL1160_MSW_PROV_ACT_I02", dbc, dbc_bldr.getBaseDbc());
		}

		protected void resetSlipNo(MCList<MST_PROV_ACT_R> dbc, MCList<Chk01_DtlR> dL) {

			// 納品書ＮＯ、納品書明細ＮＯをリセットする
			MCIndexKey idxKey = dbc.createIndex(MST_PROV_ACT_R.$prov_act_no, MST_PROV_ACT_R.$prov_act_seq);
			for (Chk01_DtlR r : dL) {
				MST_PROV_ACT_R tmpR = dbc.getFirst(idxKey, r.prov_act_no(), r.prov_act_seq());
				if (!isNull(tmpR)) {
					r.dlv_slip_no(tmpR.dlv_slip_no());
					r.dlv_slip_d_no(tmpR.dlv_slip_d_no());
				}
			}
		}

		/**
		 * 同一伝票の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
			List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
			MCList<Chk01_DtlR>[] provGrpL;
			MCList<Chk01_DtlR> withDlvL = MCList.create(Chk01_DtlR.class);
			MCList<Chk01_DtlR> withoutDlvL = MCList.create(Chk01_DtlR.class);

			for (Chk01_DtlR r : list) {
				if (isNullOrNullVal(r.dlv_slip_no())) {
					withoutDlvL.add(r);
				}
				else {
					withDlvL.add(r);
				}
			}

			provGrpL = withDlvL.groupList(Chk01_DtlR.$dlv_slip_no);
			MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
			for (MCList<Chk01_DtlR> r : provGrpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_DtlR.class);
				}
				tmp.addAll(r);
			}

			provGrpL = withoutDlvL.groupList(MSBEL_ProvActService.getSlipKey());
			for (MCList<Chk01_DtlR> r : provGrpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_DtlR.class);
				}
				tmp.addAll(r);
			}

			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		protected Map_ProvActUpd01_DtlR_MST_PROV_ACT_R<ProvActUpd01_DtlR,MST_PROV_ACT_R> createMap_ProvActUpd01_DtlR_MST_PROV_ACT_R() {
			return new Map_ProvActUpd01_DtlR_MST_PROV_ACT_R<ProvActUpd01_DtlR, MST_PROV_ACT_R>();
		}

		public class Map_ProvActUpd01_DtlR_MST_PROV_ACT_R<D extends ProvActUpd01_DtlR, S extends MST_PROV_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActUpd01_DtlR.$prov_act_no, MST_PROV_ACT_R.$prov_act_no);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_schd_no, MST_PROV_ACT_R.$prov_schd_no);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_src_act_typ, MST_PROV_ACT_R.$prov_src_act_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_src_act_no, MST_PROV_ACT_R.$prov_src_act_no);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_cd, MST_PROV_ACT_R.$trd_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_ptn_typ, MST_PROV_ACT_R.$trd_ptn_typ);
//				addColumnPathMap(ProvActUpd01_DtlR.$xfr_rsn_cd, MST_PROV_ACT_R.$xfr_rsn_cd);	⇒ 画面の値で更新する
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, MST_PROV_ACT_R.$trd_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, MST_PROV_ACT_R.$trd_unit_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$pack_unit_cd, MST_PROV_ACT_R.$pack_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$pack_unit_qty, MST_PROV_ACT_R.$pack_unit_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_cd, MST_PROV_ACT_R.$base_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_qty, MST_PROV_ACT_R.$base_unit_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$accpt_dt, MST_PROV_ACT_R.$accpt_dt);
//				addColumnPathMap(ProvActUpd01_DtlR.$ac_dt, MST_PROV_ACT_R.$ac_dt);	⇒ 画面の値で更新する
				addColumnPathMap(ProvActUpd01_DtlR.$dlv_slip_no, MST_PROV_ACT_R.$dlv_slip_no);
				addColumnPathMap(ProvActUpd01_DtlR.$dlv_slip_d_no, MST_PROV_ACT_R.$dlv_slip_d_no);
				addColumnPathMap(ProvActUpd01_DtlR.$wg_cd, MST_PROV_ACT_R.$wg_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$prsppl_cd, MST_PROV_ACT_R.$prsppl_cd);
//				addColumnPathMap(ProvActUpd01_DtlR.$ap_dpt_cd, MST_PROV_ACT_R.$ap_dpt_cd);		⇒ 画面の値で更新する
				addColumnPathMap(ProvActUpd01_DtlR.$prov_typ, MST_PROV_ACT_R.$prov_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_basis_typ, MST_PROV_ACT_R.$prov_basis_typ);
//				addColumnPathMap(ProvActUpd01_DtlR.$xrate, MST_PROV_ACT_R.$xrate);				⇒ 画面の値で更新する
				addColumnPathMap(ProvActUpd01_DtlR.$ptax_xrate, MST_PROV_ACT_R.$ptax_xrate);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_cur_cd, MST_PROV_ACT_R.$trd_cur_cd);
//				addColumnPathMap(ProvActUpd01_DtlR.$tax_cd, MST_PROV_ACT_R.$tax_cd);			⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$trd_cur_upri, MST_PROV_ACT_R.$trd_cur_upri);	⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$wtax_rate, MST_PROV_ACT_R.$wtax_rate);		⇒ 画面の値で更新する
				addColumnPathMap(ProvActUpd01_DtlR.$itm_cd, MST_PROV_ACT_R.$itm_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub1, MST_PROV_ACT_R.$itm_sub1);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub2, MST_PROV_ACT_R.$itm_sub2);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub3, MST_PROV_ACT_R.$itm_sub3);
				addColumnPathMap(ProvActUpd01_DtlR.$loc_cd, MST_PROV_ACT_R.$loc_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$str_ln_cd, MST_PROV_ACT_R.$str_ln_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_arrv_bp_cd, MST_PROV_ACT_R.$stk_arrv_bp_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$lot_no, MST_PROV_ACT_R.$lot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sublot_no, MST_PROV_ACT_R.$sublot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sno1, MST_PROV_ACT_R.$sno1);
				addColumnPathMap(ProvActUpd01_DtlR.$sno2, MST_PROV_ACT_R.$sno2);
				addColumnPathMap(ProvActUpd01_DtlR.$sno3, MST_PROV_ACT_R.$sno3);
				addColumnPathMap(ProvActUpd01_DtlR.$sno4, MST_PROV_ACT_R.$sno4);
				addColumnPathMap(ProvActUpd01_DtlR.$gd_cd, MST_PROV_ACT_R.$gd_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$quality_typ, MST_PROV_ACT_R.$quality_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_insp_typ, MST_PROV_ACT_R.$stk_insp_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_id_typ, MST_PROV_ACT_R.$stk_id_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_bp_cd, MST_PROV_ACT_R.$stk_bp_cd);
//				addColumnPathMap(ProvActUpd01_DtlR.$intr_rmrks, MST_PROV_ACT_R.$intr_rmrks);	⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$trd_d_rmrks, MST_PROV_ACT_R.$trd_d_rmrks);	⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$sub_char1, MST_PROV_ACT_R.$sub_char1);	⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$sub_char2, MST_PROV_ACT_R.$sub_char2);	⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$sub_char3, MST_PROV_ACT_R.$sub_char3);	⇒ 画面の値で更新する
//				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, );		⇒ upd_flgがオンのときは不要
//				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, );	⇒ upd_flgがオンのときは不要
//				addColumnPathMap(ProvActUpd01_DtlR.$can_ac_dt, );		⇒ 画面の値で更新する
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.not_completion_flg(true);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を取得する<br>
	 */
	public class Sprt01 extends MSBEL_ProvDtlModReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			getProvUpri();
		}

		protected void getProvUpri() {
			String[] key = new String[]{
					MAM_PROV_UPRI_R.$itm_cd, MAM_PROV_UPRI_R.$itm_sub1, MAM_PROV_UPRI_R.$itm_sub2, MAM_PROV_UPRI_R.$itm_sub3,
					MAM_PROV_UPRI_R.$prsppl_cd, MAM_PROV_UPRI_R.$cur_cd, MAM_PROV_UPRI_R.$wg_cd};

			// 支給単価マスタを適用日を無視して検索する
			MCList<MAM_PROV_UPRI_R> dbc = MCList.create(MAM_PROV_UPRI_R.class);
			MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbc_bldr.addWhereWithAnd(t.prsppl_cd.eq(bind("prsppl_cd")));
			dbc_bldr.addWhereWithAnd(t.cur_cd.eq(bind("cur_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.prov_typ.eq(value(MAC_PROV_TYP.ONR_PROV.value())));
			dbSelect("MSBEL1160_MAM_PROV_UPRI_S01", dbc, dbc_bldr, up0().groupBy(key));

			// 適用日を無視してインデックスを作成する
			MCIndexKey idx = dbc.createIndex(key);

			// 適用日を考慮してレコードを抽出する
			for (Sprt01_DtlR r :up0()) {
				MCList<MAM_PROV_UPRI_R> upri1 = dbc.subList(idx, r.toArray(key));
				if (isNull(upri1) || upri1.isEmpty()) {
					continue;
				}
				MCList<MAM_PROV_UPRI_R> upri2 = upri1.subList(crtProvUpriMatcher(r));
				if (isNull(upri2) || upri2.isEmpty()) {
					continue;
				}
				// 適用日が一致するのは１レコードしかないはず
				r.upri(upri2.get(0).upri());
			}

			down0().addAll(up0());
		}

		protected provUpriMatcher crtProvUpriMatcher(Sprt01_DtlR up) {
			return new provUpriMatcher(up);
		}

		public class provUpriMatcher implements MCRowMatcher<MAM_PROV_UPRI_R> {

			Sprt01_DtlR _up = Sprt01_DtlR.create();

			public provUpriMatcher(Sprt01_DtlR up) {
				_up = up;
			}

			public boolean match(MAM_PROV_UPRI_R r) {

				if (_up.dt().lt(r.st_dt())) {
					return false;
				}
				if (_up.dt().gt(r.end_dt())) {
					return false;
				}
				return true;
			}
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 為替レートを取得する<br>
	 */
	public class Sprt02 extends MSBEL_ProvDtlModReg_MC_A.Sprt02 {

		FXUCL_MCFuncCache<MCNumber> _xrateCache;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (_xrateCache == null) {
				_xrateCache = new FXUCL_MCFuncCache<>(in -> {
					return MAPA_XCHNG$F_GET_PROV_XRATE_NE(value((String) in[0]), value((MCDate) in[1]));
				});
			}

			for (Sprt02_DtlR r : up0()) {
				MCNumber xrate = _xrateCache.get(r.trd_cur_cd(), r.xrate_dt());
				r.xrate(xrate);
				down0().add(r);
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 税を取得する<br>
	 */
	public class Sprt03 extends MSBEL_ProvDtlModReg_MC_A.Sprt03 {

		protected MCList<Sprt03_DtlR> _provTax = null;
		protected MCIndexKey _provTaxIdx = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (_provTax == null) {
				getProvTax(up0());
			}

			for (Sprt03_DtlR r : up0()) {
				String taxCd = null;
				Sprt03_DtlR provTaxR = _provTax.getFirst(_provTaxIdx, r.toArray(_provTaxIdx.getKeys()));
				if (!isNull(provTaxR)) {
					taxCd = provTaxR.tax_cd();
				}
				r.tax_cd(taxCd);
			}
			if (_taxCache == null) {
				initTaxCache(up0());
			}

			for (Sprt03_DtlR r : up0()) {
				setTaxInfo(r);
				down0().add(r);
			}
		}
		protected void getProvTax(MCList<Sprt03_DtlR> taxL) {
			String[] key = new String[]{
					Sprt03_DtlR.$itm_cd,
					Sprt03_DtlR.$itm_sub1,
					Sprt03_DtlR.$itm_sub2,
					Sprt03_DtlR.$itm_sub3,
					Sprt03_DtlR.$prsppl_cd,
					Sprt03_DtlR.$tax_dt};
			_provTax = MCList.create(Sprt03_DtlR.class);
			MCList<Sprt03_DtlR> grpL = taxL.groupBy(key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PROV_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PROV_TAX_CD"),
					Sprt03_DtlR.$tax_cd, grpL, key);
			_provTax.addAll(grpL);
			_provTaxIdx = _provTax.createIndex(key);
		}

		protected void setTaxInfo(Sprt03_DtlR r) {
			if (!isNull(r.tax_cd())) {
				MAM_TAX_R taxR = _taxCache.getCache(r.tax_cd());
				r.tax_nm(taxR.tax_nm());
				r.tax_typ(taxR.tax_typ());
				r.inc_tax_flg(taxR.inc_tax_flg());
				r.tax_rate(taxR.tax_rate());
			}
		}

		FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;

		protected void initTaxCache(MCList<Sprt03_DtlR> taxL) {
			MAM_TAX_R t = MAM_TAX_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.tax_cd,
					t.tax_nm,
					t.tax_typ,
					t.inc_tax_flg,
					t.tax_rate);
			_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(dbc_bldr, taxL, Sprt03_DtlR.$tax_cd);
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 納品書発行前のチェックを行う<br>
	 */
	public class Chk02 extends MSBEL_ProvDtlModReg_MC_A.Chk02 {
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
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chkAndLockProvAct());
			msgL.addAll(chkAndLockXfrAct());

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
		}

		/**
		 * 支給実績のロック、更新カウンタチェック
		 */
		protected MCMessageList chkAndLockProvAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			// 支給実績
			MCList<MST_PROV_ACT_R> selectL = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.prov_act_no, t.prov_act_seq, t.upd_cntr);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());

			notErrL.sort(Chk02_DtlR.$prov_act_no, Chk02_DtlR.$prov_act_seq);
			dbSelectKeyForUpdateNoWait("MSBEL1160_MST_PROV_ACT_S05", selectL, selectL_bldr, notErrL);

			MCIndexKey idxKey = selectL.createIndex(MST_PROV_ACT_R.$prov_act_no, MST_PROV_ACT_R.$prov_act_seq);
			for (Chk02_DtlR r : notErrL) {
				MST_PROV_ACT_R selectR = selectL.getFirst(idxKey, r.prov_act_no(), r.prov_act_seq());
				if (!isNull(r.prov_act_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$prov_upd_cntr, selectR));
					setErrFlgCmm(r, msgL);
				}
			}
			return msgL;
		}

		/**
		 * 移動実績のロック、更新カウンタチェック
		 */
		protected MCMessageList chkAndLockXfrAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			//移動実績
			MCList<MST_XFR_ACT_R> selectL = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_act_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.xfr_act_no);

			notErrL.sort(Chk02_DtlR.$xfr_act_no);
			dbSelectKeyForUpdateNoWait("MSBEL1160_MST_XFR_ACT_S01", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
			for (Chk02_DtlR r : notErrL) {
				MST_XFR_ACT_R selectR = selectL.getFirst(idxkey, r.xfr_act_no());
				if (!isNull(r.xfr_act_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$xfr_upd_cntr, selectR));
					setErrFlgCmm(r, msgL);
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行する<br>
	 */
	public class Prnt01 extends MSBEL_ProvDtlModReg_MC_A.Prnt01 {
		@Override
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

		protected void handleSuccess(MCList<Chk02_DtlR> l) {
			for (Chk02_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk02_DtlR> l) {
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
			for (Chk02_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();

			MCList<Chk02_DtlR> notErrL = chk02_down0.subList(Chk02_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				callShipRprtPrntServiceUpd01(notErrL);
			}
			MCList<Chk02_DtlR> notErrL2 = notErrL.subList(Chk02_DtlR.$err_flg, false);
			if (notErrL2.size() != 0) {
				callShipRprtPrntServicePrnt01(notErrL2);
			}
			MCList<Chk02_DtlR> notErrL3 = notErrL2.subList(Chk02_DtlR.$err_flg, false);
			if (notErrL3.size() != 0) {
				updXfrAct(notErrL3);
			}
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			MCDate now = MCDate.now();
			for (Chk02_DtlR r : up0()) {
				r.trn_typ(MSC_TRN_TYP.XFR.value());
				r.dlv_prnt_flg(true);
				r.dlv_prnt_tm(now);
			}
		}

		protected void callThisChk02() {
			chk02.up0().setAll(up0());
			chk02.call();
			up0().setAll(chk02.down0());
		}

		/**
		 * 出荷帳票発行サービスを実行する
		 */
		protected void callShipRprtPrntServiceUpd01(MCList<Chk02_DtlR> list) {
			getProv(list);

			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			MSBEL_ProvActService.callShipRprtPrntSvCrtSub(crtList(list), o, false, true);

			if (!o.up0().isEmpty()) {
				o.exec();
				setDlvSlipNo(list, o.down0());
			}
		}
		protected MCList<MST_PROV_ACT_R> _provL = MCList.create(MST_PROV_ACT_R.class);
		protected MCIndexKey _idx;
		protected void getProv(MCList<Chk02_DtlR> list) {
			MCList<MST_PROV_ACT_R> wkL = MCList.create(MST_PROV_ACT_R.class);
			for (Chk02_DtlR r :list) {
				MST_PROV_ACT_R wkR = wkL.add();
				wkR.prov_act_no(r.prov_act_no());
				wkR.prov_act_seq(r.prov_act_seq());
			}
			wkL = wkL.groupBy(MST_PROV_ACT_R.$prov_act_no, MST_PROV_ACT_R.$prov_act_seq);
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PROV_ACT_R.create("T"));
			dbWkDelete("MSBEL1160_MSW_PROV_ACT_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1160_MSW_PROV_ACT_I03", wkL, wkL_bldr.getBaseDbc());

			MST_PROV_ACT_R provL_t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provL_bldr = MCQueryApiBuilder.create(provL_t);
			MSW_PROV_ACT_KEY_R S1W = MSW_PROV_ACT_KEY_R.create("W");
			provL_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1W)
					.where(S1W.prov_act_no.eq(provL_t.prov_act_no)
							.and(S1W.prov_act_seq.eq(provL_t.prov_act_seq)))));
			dbSelect("MSBEL1160_MST_PROV_ACT_S06", _provL, provL_bldr);
			_idx = _provL.createIndex(MST_PROV_ACT_R.$prov_act_no, MST_PROV_ACT_R.$prov_act_seq);
		}

		protected void selectProvAct(MCList<Chk02_DtlR> list) {
			MCList<ProvActChk01_DtlR> prntNewL = MCList.create(ProvActChk01_DtlR.class);
			for (Chk02_DtlR r :list) {
				if (isCrtL(r)) {
					ProvActChk01_DtlR dtlR = prntNewL.add();
					dtlR.prov_act_no(r.prov_act_no());
				}
			}
			MSBEL_ProvActService.initProvActCache(prntNewL);
		}

		protected MCList<ProvActUpd01_DtlR> crtList(MCList<Chk02_DtlR> list) {
			MCList<ProvActUpd01_DtlR> prntNewL = MCList.create(ProvActUpd01_DtlR.class);
			for (Chk02_DtlR r :list) {
				if (isCrtL(r)) {
					ProvActUpd01_DtlR prntNewR = prntNewL.add();
					MCRow.copyall(prntNewR.pa(), _provL.getFirst(_idx, r.prov_act_no(), r.prov_act_seq()));
					prntNewR.peg_no(r.peg_no());
				}
			}
			return prntNewL;
		}

		protected boolean isCrtL(Chk02_DtlR r) {
				if (MSC_PROV_SRC_ACT_TYP.isDDLV(r.prov_src_act_typ())
						|| MSC_PROV_SRC_ACT_TYP.isNON_ARR_DDLV(r.prov_src_act_typ())
						|| MSC_PROV_SRC_ACT_TYP.isNCV_RCV_DDLV(r.prov_src_act_typ())
						|| MSC_PROV_SRC_ACT_TYP.isRET_DDLV(r.prov_src_act_typ())
						|| MSC_PROV_SRC_ACT_TYP.isINPT(r.prov_src_act_typ())) {
					return true;
				}
			return false;
		}

		protected void setDlvSlipNo(MCList<Chk02_DtlR> list, MCList<ShipRprt_Upd01_DtlR> downL) {
			MCList<MST_PROV_ACT_R> updL = MCList.create(MST_PROV_ACT_R.class);
			MCList<MST_DLV_SLIP_R> dlvL = MCList.create(MST_DLV_SLIP_R.class);

			MCIndexKey idx = list.createIndex(Chk02_DtlR.$prov_act_no);
			for (ShipRprt_Upd01_DtlR donwR :downL) {
				Chk02_DtlR r = list.getFirst(idx, donwR.dtl_uniq_no());
				if (!isNull(r)) {
					if (MAC_STR.isNULL_VAL(r.dlv_slip_no())
							&& MAC_SLIP_STS_TYP.isCAN(_provL.getFirst(_idx, r.prov_act_no(), r.prov_act_seq()).slip_sts_typ())) {
						MST_DLV_SLIP_R dlvR = dlvL.add();
						dlvR.dlv_slip_no(donwR.dlv_slip_no());
						dlvR.dlv_slip_seq(MCNumber.ONE);
						dlvR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
					}
					r.addNumberColumn("dlv_slip_seq", donwR.dlv_slip_seq());
					r.dlv_slip_no(donwR.dlv_slip_no());
					r.dlv_slip_d_no(donwR.dlv_slip_d_no());

					MST_PROV_ACT_R updR = updL.add();
					updR.prov_act_no(r.prov_act_no());
					updR.prov_act_seq(r.prov_act_seq());
					updR.dlv_slip_no(donwR.dlv_slip_no());
					updR.dlv_slip_d_no(donwR.dlv_slip_d_no());
				}
			}

			if (!updL.isEmpty()) {
				MST_PROV_ACT_R updL_t = MST_PROV_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(updL_t.dlv_slip_no, updL_t.dlv_slip_d_no);
				dbUpdateKey("MSBEL1160_MST_PROV_ACT_U01", updL, updL_bldr);
			}
			if (!dlvL.isEmpty()) {
				dlvL = dlvL.groupBy(MST_DLV_SLIP_R.$dlv_slip_no, MST_DLV_SLIP_R.$dlv_slip_seq, MST_DLV_SLIP_R.$slip_sts_typ);
				MST_DLV_SLIP_R dlvL_t = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder dlvL_bldr = MCQueryApiBuilder.create(dlvL_t);
				dlvL_bldr.setSet(dlvL_t.slip_sts_typ);
				dbUpdateKey("MSBEL1160_MST_DLV_SLIP_U01", dlvL, dlvL_bldr);
			}
		}

		/**
		 * 印刷処理を実行する
		 */
		protected void callShipRprtPrntServicePrnt01(MCList<Chk02_DtlR> list) {
			MCList<MST_DLV_SLIP_R> dbc = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R dbc_t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbc_bldr.setSelect(dbc_t.dlv_slip_no, dbc_t.dlv_slip_seq);
			dbc_bldr.setWhere(dbc_t.dlv_slip_no.eq(bind("dlv_slip_no"))
					.and(dbc_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))));
			dbSelect("MSBEL1160_MST_DLV_SLIP_S02", dbc, dbc_bldr,
					list.groupBy(Chk02_DtlR.$dlv_slip_no));
			MCList<Chk02_DtlR> canL = MCList.create(Chk02_DtlR.class);
			for (Chk02_DtlR r :list) {
				if (MAC_SLIP_STS_TYP.isCAN(_provL.getFirst(_idx, r.prov_act_no(), r.prov_act_seq()).slip_sts_typ())) {
					canL.add(r);
				}
			}
			if (!canL.isEmpty()) {
				MCList<MST_DLV_SLIP_R> canDbc = MCList.create(MST_DLV_SLIP_R.class);
				MST_DLV_SLIP_R canDbc_t = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder canDbc_bldr = MCQueryApiBuilder.create(canDbc_t);
				canDbc_bldr.setGroupBy(canDbc_t.dlv_slip_no);
				canDbc_bldr.addMax(canDbc_t.dlv_slip_seq, "dlv_slip_seq");
				canDbc_bldr.setWhere(canDbc_t.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(canDbc_t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value()))));
				dbSelect("MSBEL1160_MST_DLV_SLIP_S03", canDbc, canDbc_bldr,
						canL.groupBy(Chk02_DtlR.$dlv_slip_no));
				dbc.addAll(canDbc);
			}

			if (dbc.isEmpty()) {
				return;
			}

			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			MCIndexKey idx = list.createIndex(Chk02_DtlR.$dlv_slip_no);

			for (MST_DLV_SLIP_R dlvSlip : dbc) {
				Chk02_DtlR r = list.getFirst(idx, dlvSlip.dlv_slip_no());
				ShipRprt_Prnt01_HdrR up0 = o.up0().add();
				up0.dlv_slip_no(r.dlv_slip_no());
				up0.dlv_slip_seq(dlvSlip.dlv_slip_seq());
				up0.dlv_slip_prnt_flg(true);
				up0.inc_can_flg(true);
			}
			setPegNo(o.up0());
			o.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());
			o.exec();

			copyErrFlg(o.up0(), o.down0());
			for (ShipRprt_Prnt01_HdrR r :o.up0()) {
				list.subList(idx, r.dlv_slip_no()).setBoolean(Chk02_DtlR.$err_flg, r.err_flg());
			}
		}

		protected void updXfrAct(MCList<Chk02_DtlR> list) {
			MCList<MST_XFR_ACT_R> updL = MCList.create(MST_XFR_ACT_R.class);

			addAll(updL, list, createMap_MST_XFR_ACT_R_Chk02_DtlR());

			if (!updL.isEmpty()) {
				MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(t.dlv_prnt_flg);
				updL_bldr.addSet(t.dlv_prnt_tm);
				dbUpdateKey("MSBEL1160_MST_XFR_ACT_U01", updL, updL_bldr);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_MST_PROV_ACT_R_Chk02_DtlR<MST_PROV_ACT_R,Chk02_DtlR> createMap_MST_PROV_ACT_R_Chk02_DtlR() {
			return new Map_MST_PROV_ACT_R_Chk02_DtlR<MST_PROV_ACT_R, Chk02_DtlR>();
		}

		public class Map_MST_PROV_ACT_R_Chk02_DtlR<D extends MST_PROV_ACT_R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PROV_ACT_R.$prov_act_no, Chk02_DtlR.$prov_act_no);
				addColumnPathMap(MST_PROV_ACT_R.$prov_act_seq, Chk02_DtlR.$prov_act_seq);
				addColumnPathMap(MST_PROV_ACT_R.$dlv_slip_no, Chk02_DtlR.$dlv_slip_no);
				addColumnPathMap(MST_PROV_ACT_R.$dlv_slip_d_no, Chk02_DtlR.$dlv_slip_d_no);
			}
		}

		protected Map_MST_XFR_ACT_R_Chk02_DtlR<MST_XFR_ACT_R, Chk02_DtlR> createMap_MST_XFR_ACT_R_Chk02_DtlR() {
			return new Map_MST_XFR_ACT_R_Chk02_DtlR<MST_XFR_ACT_R, Chk02_DtlR>();
		}

		public class Map_MST_XFR_ACT_R_Chk02_DtlR<D extends MST_XFR_ACT_R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_XFR_ACT_R.$xfr_act_no, Chk02_DtlR.$xfr_act_no);
				addColumnPathMap(MST_XFR_ACT_R.$dlv_prnt_flg, Chk02_DtlR.$dlv_prnt_flg);
				addColumnPathMap(MST_XFR_ACT_R.$dlv_prnt_tm, Chk02_DtlR.$dlv_prnt_tm);
			}
		}
	}

	//FMCB CUSTOM END
}