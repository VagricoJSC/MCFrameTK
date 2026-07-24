package mcframe.serverMSBF.MSBFL5070;

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
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBF.MSBFL5050.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspActRcptIFService_MC extends MSBFL_InspActRcptIFService_MC_A{
	//FMCB CUSTOM START
	/**
	 * InspActIF_Upd01オペレーション.<p>
	 *
	 * 抜取検査/全数検査の実績を登録・訂正する。<br>
	 */
	public class InspActIF_Upd01 extends MSBFL_InspActRcptIFService_MC_A.InspActIF_Upd01 {
		/** 検査ＮＯ（更新対象）セット */
		protected Set<String> _inspNoSet = null;
		/** チェックＯＫ紐付けＮＯセット */
		protected Set<MCNumber> _pegNoOKSet = new HashSet<MCNumber>();
		/** 検査ＮＯ毎の紐付けＮＯマップ */
		protected Map<String, MCNumber> _pnMap = new HashMap<String, MCNumber>();
		/** 検査指図のキャッシュ */
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		/** 検査指図のキャッシュ */
		protected MCList<MST_INSP_INST_R> _instL = MCList.create(MST_INSP_INST_R.class);
		protected MST_INSP_INST_R _instL_t = MST_INSP_INST_R.create("T");
		protected MCQueryApiBuilder _instL_bldr = MCQueryApiBuilder.create(_instL_t);
		/** 検査実績のキャッシュ */
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MST_INSP_ACT_R _actL_t = MST_INSP_ACT_R.create("T");
		protected MCQueryApiBuilder _actL_bldr = MCQueryApiBuilder.create(_actL_t);
		/** 検査着手明細のキャッシュ */
		protected MCList<MST_INSP_STT_D_R> _sttDL = MCList.create(MST_INSP_STT_D_R.class);
		protected MST_INSP_STT_D_R _sttDL_t = MST_INSP_STT_D_R.create("T");
		protected MCQueryApiBuilder _sttDL_bldr = MCQueryApiBuilder.create(_sttDL_t);
		/** 検査実績明細のキャッシュ */
		protected MCList<MST_INSP_ACT_D_R> _actDL = MCList.create(MST_INSP_ACT_D_R.class);
		protected MST_INSP_ACT_D_R _actDL_t = MST_INSP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(_actDL_t);
		/** 検査抜取実績のキャッシュ */
		protected MCList<MST_INSP_SMPL_ACT_R> _smplActL = MCList.create(MST_INSP_SMPL_ACT_R.class);
		protected MST_INSP_SMPL_ACT_R _smplActL_t = MST_INSP_SMPL_ACT_R.create("T");
		protected MCQueryApiBuilder _smplActL_bldr = MCQueryApiBuilder.create(_smplActL_t);
		protected MCIndexKey _idxSchd = null;
		protected MCIndexKey _idxInst = null;
		protected MCIndexKey _idxAct = null;
		protected MCIndexKey _idxActD = null;
		protected MCIndexKey _idxSmpl = null;
		protected MCIndexKey _idxSttD = null;
		protected MCIndexKey _idxHdrUp = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 更新前処理
			preProc();
			// 検査明細チェック
			checkInspDtl();

			throwUpdErr();

			// 補完処理
			updCompletion();

			// 業務チェック
			callUpdChk();

			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwUpdErr();
			}

			// 排他処理、ヘッダー部補完
			chkInstUpdCnt();

			throwUpdErr();

			// 更新処理
			execUpd();

			throwUpdErr();

			// 下り電文の設定処理
			down0().setAll(up1());
			down1().setAll(up2());
			down2().setAll(up3());
		}

		protected void callUpdChk() {
			// 業務チェックを行う。
			MSBFL_InspActService.InspAct_Chk01 ope = MSBFL_InspActService.crtInspAct_Chk01();
			addAll(ope.up0(), up1(), createMap_InspAct_Chk01_HdrR_InspActIF_Upd01_HdrR());
			addAll(ope.up1(), up2(), createMap_InspAct_Chk01_DtlR_InspActIF_Upd01_DtlR());
			addAll(ope.up2(), up3(), createMap_InspAct_Chk01_SmplR_InspActIF_Upd01_SmplR());
			ope.exec();
			
			String[] dest0Cols = new String[] {InspActIF_Upd01_HdrR.$base_unit_qty};
			String[] src0Cols = new String[] {InspAct_Chk01_HdrR.$base_unit_qty};
			copyByPegNo(up1(), dest0Cols, ope.down0(), src0Cols);
			String[] dest1Cols = new String[] {InspActIF_Upd01_DtlR.$itm_cd, InspActIF_Upd01_DtlR.$itm_sub1, InspActIF_Upd01_DtlR.$itm_sub2, InspActIF_Upd01_DtlR.$itm_sub3, InspActIF_Upd01_DtlR.$base_unit_cd, InspActIF_Upd01_DtlR.$pack_xfr_base_unit_cd, InspActIF_Upd01_DtlR.$lot_no, InspActIF_Upd01_DtlR.$sublot_no, InspActIF_Upd01_DtlR.$ac_dt, InspActIF_Upd01_DtlR.$sno1_mng_typ, InspActIF_Upd01_DtlR.$sno2_mng_typ, InspActIF_Upd01_DtlR.$sno3_mng_typ, InspActIF_Upd01_DtlR.$sno4_mng_typ, InspActIF_Upd01_DtlR.$err_flg, InspActIF_Upd01_DtlR.$rmrks_upd_flg};
			String[] src1Cols = new String[] {InspAct_Chk01_DtlR.$itm_cd, InspAct_Chk01_DtlR.$itm_sub1, InspAct_Chk01_DtlR.$itm_sub2, InspAct_Chk01_DtlR.$itm_sub3, InspAct_Chk01_DtlR.$base_unit_cd, InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, InspAct_Chk01_DtlR.$lot_no, InspAct_Chk01_DtlR.$sublot_no, InspAct_Chk01_DtlR.$ac_dt, InspAct_Chk01_DtlR.$sno1_mng_typ, InspAct_Chk01_DtlR.$sno2_mng_typ, InspAct_Chk01_DtlR.$sno3_mng_typ, InspAct_Chk01_DtlR.$sno4_mng_typ, InspAct_Chk01_DtlR.$err_flg, InspAct_Chk01_DtlR.$rmrks_upd_flg};
			copyByPegNo(up2(), dest1Cols, ope.down1(), src1Cols);
			String[] dest2Cols = new String[] {InspActIF_Upd01_SmplR.$itm_cd, InspActIF_Upd01_SmplR.$itm_sub1, InspActIF_Upd01_SmplR.$itm_sub2, InspActIF_Upd01_SmplR.$itm_sub3, InspActIF_Upd01_SmplR.$base_unit_cd, InspActIF_Upd01_SmplR.$pack_xfr_base_unit_cd, InspActIF_Upd01_SmplR.$lot_no, InspActIF_Upd01_SmplR.$sublot_no, InspActIF_Upd01_SmplR.$sno1_mng_typ, InspActIF_Upd01_SmplR.$sno2_mng_typ, InspActIF_Upd01_SmplR.$sno3_mng_typ, InspActIF_Upd01_SmplR.$sno4_mng_typ, InspActIF_Upd01_SmplR.$err_flg, InspActIF_Upd01_SmplR.$rmrks_upd_flg};
			String[] src2Cols = new String[] {InspAct_Chk01_SmplR.$itm_cd, InspAct_Chk01_SmplR.$itm_sub1, InspAct_Chk01_SmplR.$itm_sub2, InspAct_Chk01_SmplR.$itm_sub3, InspAct_Chk01_SmplR.$base_unit_cd, InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, InspAct_Chk01_SmplR.$lot_no, InspAct_Chk01_SmplR.$sublot_no, InspAct_Chk01_SmplR.$sno1_mng_typ, InspAct_Chk01_SmplR.$sno2_mng_typ, InspAct_Chk01_SmplR.$sno3_mng_typ, InspAct_Chk01_SmplR.$sno4_mng_typ, InspAct_Chk01_SmplR.$err_flg, InspAct_Chk01_SmplR.$rmrks_upd_flg};
			copyByPegNo(up3(), dest2Cols, ope.down2(), src2Cols);

			
			// チェックエラーが発生しなかった紐付けＮＯを洗い出す。（明細も含む）
			MCNumber minErrPegNo = null;
			Set<MCNumber> pegNoErrSet = new HashSet<MCNumber>();
			pegNoErrSet.addAll(ope.down0().subList(InspAct_Chk01_HdrR.$err_flg, true).getNumberNE(InspAct_Chk01_HdrR.$peg_no));
			MCIndexKey idxkey = ope.down0().createIndex(InspAct_Chk01_HdrR.$insp_no);
			for (InspAct_Chk01_DtlR dtlR : ope.down1()) {
				if (!dtlR.err_flg()) {
					continue;
				}

				InspAct_Chk01_HdrR hdrR = ope.down0().getFirst(idxkey, dtlR.insp_no());
				if (!isNull(hdrR) && !isNull(hdrR.peg_no())) {
					pegNoErrSet.add(hdrR.peg_no());
				}
			}
			for (InspAct_Chk01_SmplR smplR : ope.down2()) {
				if (!smplR.err_flg()) {
					continue;
				}

				InspAct_Chk01_HdrR hdrR = ope.down0().getFirst(idxkey, smplR.insp_no());
				if (!isNull(hdrR) && !isNull(hdrR.peg_no())) {
					pegNoErrSet.add(hdrR.peg_no());
				}
			}
			for ( MCNumber v : pegNoErrSet) {
				if (minErrPegNo == null || minErrPegNo.gt(v)) {
					minErrPegNo = v;
				}
			}
			for (InspAct_Chk01_HdrR hdrR : ope.down0()) {
				if (pegNoErrSet.contains(hdrR.peg_no())) {
					continue;
				}
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					if (minErrPegNo != null && minErrPegNo.lte(hdrR.peg_no())) {
						continue;
					}
				}
				
				_pegNoOKSet.add(hdrR.peg_no());
			}
		}

		/**
		 * 更新カウンタチェックを行う。
		 */
		protected void chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MST_INSP_INST_R selectR = null;
			for (InspActIF_Upd01_HdrR hdrR : up1()) {
				selectR = MST_INSP_INST_R.create();
				MCQueryApiBuilder selectR_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
				dbSelectKeyForUpdateNoWait("MSBFL5070_MST_INSP_INST_S01", selectR, selectR_bldr, hdrR);

				msgL.addAll(checkUpdCntrNE(hdrR, InspActIF_Upd01_HdrR.$insp_inst_upd_cntr, selectR));

				compData(selectR, hdrR);
			}

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}
		
		/**
		 * 補完処理を行う。
		 */
		protected void compData(MST_INSP_INST_R instR,InspActIF_Upd01_HdrR hdrR) {
			if (!isNull(instR)) {
				MST_LOT_R lotR = MST_LOT_R.create();
				MST_LOT_R t = MST_LOT_R.create("T");
				MCQueryApiBuilder lotR_bldr = MCQueryApiBuilder.create(t);
				lotR_bldr.setSelect(t.ver_no);
				dbSelectKey("MSBFL5070_MST_LOT_S01", lotR, lotR_bldr, instR);
				
				// ヘッダの補完
				hdrR.insp_freq(instR.insp_freq());
				hdrR.src_no1(instR.src_no1());
				hdrR.src_no2(instR.src_no2());
				hdrR.insp_typ(instR.insp_typ());
				hdrR.insp_mtd_typ(instR.insp_mtd_typ());
				hdrR.insp_sts_typ(instR.insp_sts_typ());
				hdrR.insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
				hdrR.itm_cd(instR.itm_cd());
				hdrR.itm_sub1(instR.itm_sub1());
				hdrR.itm_sub2(instR.itm_sub2());
				hdrR.itm_sub3(instR.itm_sub3());
				hdrR.lot_no(instR.lot_no());
				hdrR.sublot_no(instR.sublot_no());
				hdrR.ver_no(lotR.ver_no());
				hdrR.sppl_cd(instR.sppl_cd());
				hdrR.maker_cd(instR.maker_cd());
				hdrR.mfg_loc_cd(instR.mfg_loc_cd());
				hdrR.from_site_cd(instR.from_site_cd());
				hdrR.base_unit_cd(instR.base_unit_cd());
			}
		}

		protected void execUpd() {
			if (_pegNoOKSet.isEmpty()) {
				return;
			}

			MSBFL_InspActService.InspAct_Upd01 ope = MSBFL_InspActService.crtInspAct_Upd01();
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				addAll(ope.up0(), up1(), createMap_InspAct_Upd01_HdrR_InspActIF_Upd01_HdrR());
				addAll(ope.up1(), up2(), createMap_InspAct_Upd01_DtlR_InspActIF_Upd01_DtlR());
				addAll(ope.up2(), up3(), createMap_InspAct_Upd01_SmplR_InspActIF_Upd01_SmplR());
			} else {
				MCList<InspActIF_Upd01_HdrR> updHdrL = MCList.create(InspActIF_Upd01_HdrR.class);
				MCList<InspActIF_Upd01_DtlR> updDtlL = MCList.create(InspActIF_Upd01_DtlR.class);
				MCList<InspActIF_Upd01_SmplR> updSmplL = MCList.create(InspActIF_Upd01_SmplR.class);
				Set<String> inspNoOKSet = new HashSet<String>();
				for (InspActIF_Upd01_HdrR hdrR : up1()) {
					if (_pegNoOKSet.contains(hdrR.peg_no())) {
						updHdrL.add(hdrR);
						inspNoOKSet.add(hdrR.insp_no());
					}
				}
				for (InspActIF_Upd01_DtlR dtlR : up2()) {
					if (inspNoOKSet.contains(dtlR.insp_no())) {
						updDtlL.add(dtlR);
					}
				}
				for (InspActIF_Upd01_SmplR smplR : up3()) {
					if (inspNoOKSet.contains(smplR.insp_no())) {
						updSmplL.add(smplR);
					}
				}
				addAll(ope.up0(), updHdrL, createMap_InspAct_Upd01_HdrR_InspActIF_Upd01_HdrR());
				addAll(ope.up1(), updDtlL, createMap_InspAct_Upd01_DtlR_InspActIF_Upd01_DtlR());
				addAll(ope.up2(), updSmplL, createMap_InspAct_Upd01_SmplR_InspActIF_Upd01_SmplR());
			}

			ope.exec();
		}

		protected void preProc() {
			// 必須チェック
			MCMessagePool.addAll(checkReq());
		}

		protected MCMessageList checkReq() {
			MCMessageList msgL = new MCMessageList();

			// 制御ブロック（電文）の必須チェック
			msgL.addAll(check(up0(), InspActIF_Upd01_CtrlR.$if_upd_typ, new FXUCL_RequiredValidater()));

			// 検査指図ブロック（電文）の必須チェック
			if (!up1().isEmpty()) {
				msgL.addAll(check(up1(), InspActIF_Upd01_HdrR.$insp_no, new FXUCL_RequiredValidater()));
				if (up0().upd_cntr_chk_flg()) {
					msgL.addAll(check(up1(), InspActIF_Upd01_HdrR.$insp_inst_upd_cntr, new FXUCL_RequiredValidater()));
				}
			}

			return msgL;
		}

		protected void checkInspDtl() {
			MCMessageList msgL = new MCMessageList();

			// 検査ＮＯセットの初期化
			_inspNoSet = new HashSet<String>();
			_inspNoSet.addAll(up1().getString(InspActIF_Upd01_HdrR.$insp_no));

			// 検査実績明細のチェック
			for (InspActIF_Upd01_DtlR dtlR : up2()) {
				// 検査ＮＯの必須＆存在チェック
				msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$insp_no, new FXUCL_RequiredValidater()));
				if (!isNull(dtlR.insp_no()) && !_inspNoSet.contains(dtlR.insp_no())) {
					msgL.add(new MCMessage(MSBFL0077, dtlR, dtlR.insp_no()));
				}

				// データ更新区分の必須チェック
				msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$data_crud_typ, new FXUCL_RequiredValidater()));

				// 検査実績ＮＯ、検査実績明細ＮＯの必須チェック（更新時）
				if (dtlR.isStatusModify() || dtlR.isStatusDelete()) {
					msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$insp_act_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$insp_act_d_no, new FXUCL_RequiredValidater()));
				}
			}

			// 検査抜取実績のチェック
			for (InspActIF_Upd01_SmplR dtlR : up3()) {
				// 検査ＮＯの必須＆存在チェック
				msgL.addAll(check(dtlR, InspActIF_Upd01_SmplR.$insp_no, new FXUCL_RequiredValidater()));
				if (!isNull(dtlR.insp_no()) && !_inspNoSet.contains(dtlR.insp_no())) {
					msgL.add(new MCMessage(MSBFL0078, dtlR, dtlR.insp_no()));
				}

				// データ更新区分の必須チェック
				msgL.addAll(check(dtlR, InspActIF_Upd01_SmplR.$data_crud_typ, new FXUCL_RequiredValidater()));

				// 検査実績ＮＯ、検査抜取実績ＮＯの必須チェック（更新時）
				if (dtlR.isStatusModify() || dtlR.isStatusDelete()) {
					msgL.addAll(check(dtlR, InspActIF_Upd01_SmplR.$insp_act_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(dtlR, InspActIF_Upd01_SmplR.$insp_smpl_act_no, new FXUCL_RequiredValidater()));
				}
			}

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}

		}

		protected void updCompletion() {
			// 登録済検査関連データをキャッシュする。
			createCache();

			// データ補完を行う。
			compHead();
			compDetail();
			compSmpl();
		}

		/**
		 * 検査関連データ（予定、指図、実績、実績明細、抜取実績）をキャッシュする。
		 */
		protected void createCache() {
			// データをキャッシュする。
			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5070_MST_INSP_SCHD_S01", _schdL, _schdL_bldr, up1());

			_instL_bldr.setWhere(_instL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5070_MST_INSP_INST_S02", _instL, _instL_bldr, up1());

			_actL_bldr.setWhere(_actL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5070_MST_INSP_ACT_S01", _actL, _actL_bldr, up1());

			_sttDL_bldr.setSelect(_sttDL_t.fix_no, _sttDL_t.fix_no_typ, _sttDL_t.ac_dt);
			_sttDL_bldr.setWhere(_sttDL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5070_MST_INSP_STT_D_S01", _sttDL, _sttDL_bldr, _actL);

			_actDL_bldr.setWhere(_actDL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5070_MST_INSP_ACT_D_S01", _actDL, _actDL_bldr, _actL);

			_smplActL_bldr.setWhere(_smplActL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5070_MST_INSP_SMPL_ACT_S01", _smplActL, _smplActL_bldr, _actL);

			// キャッシュデータのインデックスを初期化
			_idxSchd = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			_idxInst = _instL.createIndex(MST_INSP_INST_R.$insp_no);
			_idxAct = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			_idxSttD = _sttDL.createIndex(MST_INSP_STT_D_R.$fix_no,
					MST_INSP_STT_D_R.$fix_no_typ);
			_idxHdrUp = up1().createIndex(InspActIF_Upd01_HdrR.$insp_no);
			_idxActD = _actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_no,
					MST_INSP_ACT_D_R.$insp_act_d_no);
			_idxSmpl = _smplActL.createIndex(MST_INSP_SMPL_ACT_R.$insp_act_no,
					MST_INSP_SMPL_ACT_R.$insp_smpl_act_no);
		}

		/**
		 * 検査実績ヘッダを補完する。
		 */
		protected void compHead() {
			MCNumber pegNo = new MCNumber(up1().size());

			for (InspActIF_Upd01_HdrR hdrR : up1()) {
				// 業務補完を行う。
				if (isCreate(hdrR)) {
					compCreateHead(hdrR);
				} else {
					compUpdateHead(hdrR);
				}

				// 紐付けＮＯの再設定
				if (isNull(hdrR.peg_no())) {
					pegNo = pegNo.add(MCNumber.ONE);
					hdrR.peg_no(pegNo);
				}
				_pnMap.put(hdrR.insp_no(), hdrR.peg_no());
			}
		}

		/**
		 * 検査実績は新規登録であるかどうかをチェックする。
		 * @param hdrR 検査実績ヘッダ
		 * @return boolean true:新規, false:訂正
		 */
		protected boolean isCreate(InspActIF_Upd01_HdrR hdrR) {
			if (hdrR.isStatusCreate() || isNull(hdrR.insp_act_no())) {
				hdrR.setStatus(Status.CREATE);
				hdrR.insp_act_no(null);
				return true;
			}

			return false;
		}

		/**
		 * 新規登録時、検査実績ヘッダを補完する。
		 * @param hdrR 検査実績ヘッダ
		 */
		protected void compCreateHead(InspActIF_Upd01_HdrR hdrR) {
			MST_INSP_SCHD_R schdR = _schdL.getFirst(_idxSchd, hdrR.insp_no());
			MST_INSP_INST_R instR = _instL.getFirst(_idxInst, hdrR.insp_no());
			if (isNull(schdR) || isNull(instR)) {
				return;
			}

			// 新規登録時、下記項目は補完対象外、そのままとする。
			//  ・不良理由ＣＤ、良品区分、格付ＣＤ、良品数量、不良品数量
			//  ・検査開始日時、検査終了日時、実施担当者ＣＤ、実施部門ＣＤ
			//  ・判定日、判定日時、検査判定結果区分、判定部門ＣＤ、判定者ＣＤ、判定理由
			//  ・実際有効成分係数、在庫更新不要ＦＬＧ（呼び出し先で設定される）
			//  ・期限起算日区分、起算日、有効期限、使用期限、内部備考、予備１～３

			// 下記項目に対して、以下の補完処理を行う。
			hdrR.insp_freq(compVal(hdrR.insp_freq_upd_flg(), hdrR.insp_freq(), instR.insp_freq(), MCNumber.ONE));
			hdrR.src_no1(compVal(hdrR.src_no1_upd_flg(), hdrR.src_no1(), instR.src_no1(), null));
			hdrR.src_no2(compVal(hdrR.src_no2_upd_flg(), hdrR.src_no2(), instR.src_no1(), null));
			hdrR.insp_typ(compVal(hdrR.insp_typ_upd_flg(), hdrR.insp_typ(), schdR.insp_typ(), schdR.insp_typ()));
			hdrR.insp_mtd_typ(compVal(hdrR.insp_mtd_typ_upd_flg(), hdrR.insp_mtd_typ(), instR.insp_mtd_typ(), instR.insp_mtd_typ()));
			hdrR.insp_sts_typ(compVal(hdrR.insp_sts_typ_upd_flg(), hdrR.insp_sts_typ(), instR.insp_sts_typ(), instR.insp_sts_typ()));
			hdrR.insp_aprv_sts_typ(compVal(hdrR.insp_aprv_sts_typ_upd_flg(), hdrR.insp_aprv_sts_typ(), instR.insp_aprv_sts_typ(), instR.insp_aprv_sts_typ()));
			hdrR.itm_cd(compVal(hdrR.itm_cd_upd_flg(), hdrR.itm_cd(), schdR.itm_cd(), schdR.itm_cd()));
			hdrR.itm_sub1(compVal(hdrR.itm_sub1_upd_flg(), hdrR.itm_sub1(), schdR.itm_sub1(), MAC_STR.NULL_VAL.value()));
			hdrR.itm_sub2(compVal(hdrR.itm_sub2_upd_flg(), hdrR.itm_sub2(), schdR.itm_sub2(), MAC_STR.NULL_VAL.value()));
			hdrR.itm_sub3(compVal(hdrR.itm_sub3_upd_flg(), hdrR.itm_sub3(), schdR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			hdrR.lot_no(compVal(hdrR.lot_no_upd_flg(), hdrR.lot_no(), instR.lot_no(), instR.lot_no()));
			hdrR.sublot_no(compVal(hdrR.sublot_no_upd_flg(), hdrR.sublot_no(), instR.sublot_no(), instR.sublot_no()));
			hdrR.sppl_cd(compVal(hdrR.sppl_cd_upd_flg(), hdrR.sppl_cd(), instR.sppl_cd(), MAC_STR.NULL_VAL.value()));
			hdrR.maker_cd(compVal(hdrR.maker_cd_upd_flg(), hdrR.maker_cd(), instR.maker_cd(), MAC_STR.NULL_VAL.value()));
			hdrR.mfg_loc_cd(compVal(hdrR.mfg_loc_cd_upd_flg(), hdrR.mfg_loc_cd(), instR.mfg_loc_cd(), MAC_STR.NULL_VAL.value()));
			hdrR.from_site_cd(compVal(hdrR.from_site_cd_upd_flg(), hdrR.from_site_cd(), instR.from_site_cd(), MAC_STR.NULL_VAL.value()));
			hdrR.base_unit_qty(compVal(hdrR.base_unit_qty_upd_flg(), hdrR.base_unit_qty(), instR.base_unit_qty(), null));
			hdrR.base_unit_cd(compVal(hdrR.base_unit_cd_upd_flg(), hdrR.base_unit_cd(), instR.base_unit_cd(), null));
		}

		/**
		 * 訂正時、検査実績ヘッダを補完する。
		 * @param hdrR 検査実績ヘッダ
		 */
		protected void compUpdateHead(InspActIF_Upd01_HdrR hdrR) {
			MST_INSP_ACT_R actR = _actL.getFirst(_idxAct, hdrR.insp_act_no());
			if (isNull(actR)) {
				return;
			}

			// 訂正時、下記項目は補完対象外、そのままとする。
			//  ・良品数量、不良品数量、、在庫更新不要ＦＬＧ（呼び出し先で設定される）
			//  ・判定日、判定日時、検査判定結果区分、判定部門ＣＤ、判定者ＣＤ、判定理由

			// 下記項目に対して、以下の補完処理を行う。
			hdrR.insp_freq(compVal(hdrR.insp_freq_upd_flg(), hdrR.insp_freq(), actR.insp_freq(), actR.insp_freq()));
			hdrR.src_no1(compVal(hdrR.src_no1_upd_flg(), hdrR.src_no1(), actR.src_no1(), null));
			hdrR.src_no2(compVal(hdrR.src_no2_upd_flg(), hdrR.src_no2(), actR.src_no2(), null));
			hdrR.insp_typ(compVal(hdrR.insp_typ_upd_flg(), hdrR.insp_typ(), actR.insp_typ(), actR.insp_typ()));
			hdrR.insp_mtd_typ(compVal(hdrR.insp_mtd_typ_upd_flg(), hdrR.insp_mtd_typ(), actR.insp_mtd_typ(), actR.insp_mtd_typ()));
			hdrR.dfct_rsn_cd(compVal(hdrR.dfct_rsn_cd_upd_flg(), hdrR.dfct_rsn_cd(), actR.dfct_rsn_cd(), null));
			hdrR.itm_cd(compVal(hdrR.itm_cd_upd_flg(), hdrR.itm_cd(), actR.itm_cd(), actR.itm_cd()));
			hdrR.itm_sub1(compVal(hdrR.itm_sub1_upd_flg(), hdrR.itm_sub1(), actR.itm_sub1(), actR.itm_sub1()));
			hdrR.itm_sub2(compVal(hdrR.itm_sub2_upd_flg(), hdrR.itm_sub2(), actR.itm_sub2(), actR.itm_sub2()));
			hdrR.itm_sub3(compVal(hdrR.itm_sub3_upd_flg(), hdrR.itm_sub3(), actR.itm_sub3(), actR.itm_sub3()));
			hdrR.quality_typ(compVal(hdrR.quality_typ_upd_flg(), hdrR.quality_typ(), actR.quality_typ(), null));
			hdrR.gd_cd(compVal(hdrR.gd_cd_upd_flg(), hdrR.gd_cd(), actR.gd_cd(), null));
			hdrR.lot_no(compVal(hdrR.lot_no_upd_flg(), hdrR.lot_no(), actR.lot_no(), actR.lot_no()));
			hdrR.sublot_no(compVal(hdrR.sublot_no_upd_flg(), hdrR.sublot_no(), actR.sublot_no(), actR.sublot_no()));
			hdrR.sppl_cd(compVal(hdrR.sppl_cd_upd_flg(), hdrR.sppl_cd(), actR.sppl_cd(), actR.sppl_cd()));
			hdrR.maker_cd(compVal(hdrR.maker_cd_upd_flg(), hdrR.maker_cd(), actR.maker_cd(), actR.maker_cd()));
			hdrR.mfg_loc_cd(compVal(hdrR.mfg_loc_cd_upd_flg(), hdrR.mfg_loc_cd(), actR.mfg_loc_cd(), actR.mfg_loc_cd()));
			hdrR.from_site_cd(compVal(hdrR.from_site_cd_upd_flg(), hdrR.from_site_cd(), actR.from_site_cd(), actR.from_site_cd()));
			hdrR.base_unit_qty(compVal(hdrR.base_unit_qty_upd_flg(), hdrR.base_unit_qty(), actR.base_unit_qty(), null));
			hdrR.base_unit_cd(compVal(hdrR.base_unit_cd_upd_flg(), hdrR.base_unit_cd(), actR.base_unit_cd(), null));
			hdrR.st_dt(compVal(hdrR.st_hm_upd_flg(), hdrR.st_dt(), actR.st_tm(), actR.st_tm()));
			hdrR.st_hm(compVal(hdrR.st_hm_upd_flg(), hdrR.st_hm(), actR.st_tm(), null));
			hdrR.end_dt(compVal(hdrR.end_hm_upd_flg(), hdrR.end_dt(), actR.end_tm(), null));
			hdrR.end_hm(compVal(hdrR.end_hm_upd_flg(), hdrR.end_hm(), actR.end_tm(), null));
			hdrR.act_usr_cd(compVal(hdrR.act_usr_cd_upd_flg(), hdrR.act_usr_cd(), actR.act_usr_cd(), null));
			hdrR.act_dpt_cd(compVal(hdrR.act_dpt_cd_upd_flg(), hdrR.act_dpt_cd(), actR.act_dpt_cd(), null));
			hdrR.lmt_dt_frm_typ(compVal(hdrR.lmt_dt_frm_typ_upd_flg(), hdrR.lmt_dt_frm_typ(), actR.lmt_dt_frm_typ(), null));
			hdrR.lmt_dt_frm(compVal(hdrR.lmt_dt_frm_upd_flg(), hdrR.lmt_dt_frm(), actR.lmt_dt_frm(), null));
			hdrR.vld_dt(compVal(hdrR.vld_dt_upd_flg(), hdrR.vld_dt(), actR.vld_dt(), null));
			hdrR.lmt_dt(compVal(hdrR.lmt_dt_upd_flg(), hdrR.lmt_dt(), actR.lmt_dt(), null));
			hdrR.intr_rmrks(compVal(hdrR.intr_rmrks_upd_flg(), hdrR.intr_rmrks(), actR.intr_rmrks(), null));
			hdrR.sub_char1(compVal(hdrR.sub_char1_upd_flg(), hdrR.sub_char1(), actR.sub_char1(), null));
			hdrR.sub_char2(compVal(hdrR.sub_char2_upd_flg(), hdrR.sub_char2(), actR.sub_char2(), null));
			hdrR.sub_char3(compVal(hdrR.sub_char3_upd_flg(), hdrR.sub_char3(), actR.sub_char3(), null));
			hdrR.sub_char3(compVal(hdrR.sub_char3_upd_flg(), hdrR.sub_char3(), actR.sub_char3(), null));
			hdrR.stt_can_ac_dt(nvl(hdrR.stt_can_ac_dt(), actR.st_tm()));
		}

		/**
		 * 検査実績明細を補完する。
		 */
		protected void compDetail() {
			for (InspActIF_Upd01_DtlR dtlR : up2()) {
				// 新規登録時、一部NOT NULL項目の値を指定されない場合、NULL文字列を設定する。
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					compCreateDetail(dtlR);
				// 訂正（削除を含む）時、登録済の実績明細から補完を行う。
				} else {
					compUpdateDetail(dtlR);
				}

				// 紐付けＮＯの再設定
				if (isNull(dtlR.peg_no())) {
					dtlR.peg_no(_pnMap.get(dtlR.insp_no()));
				}
			}
		}

		/**
		 * 新規登録時、一部NOT NULL項目の値を指定されない場合、NULL文字列を設定する。
		 * @param dtlR 検査実績明細
		 */
		protected void compCreateDetail(InspActIF_Upd01_DtlR dtlR) {
			MST_INSP_STT_D_R sttR = _sttDL.getFirst(_idxSttD, dtlR.fix_no(), dtlR.fix_no_typ());
			InspActIF_Upd01_HdrR hdrR = up1().getFirst(_idxHdrUp, dtlR.insp_no());
			// 以下のNOT NULL項目に、値が指定されない場合、NULL文字列を設定する。
			// なお、確定ＮＯ区分が未指定の場合、「なし」とする。
			dtlR.setStatus(Status.CREATE);
			dtlR.insp_act_d_no(null);
			dtlR.itm_sub1(nvl(dtlR.itm_sub1(), MAC_STR.NULL_VAL.value()));
			dtlR.itm_sub2(nvl(dtlR.itm_sub2(), MAC_STR.NULL_VAL.value()));
			dtlR.itm_sub3(nvl(dtlR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			dtlR.str_ln_cd(nvl(dtlR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.stk_arrv_bp_cd(nvl(dtlR.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.stk_bp_cd(nvl(dtlR.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.lot_no(nvl(dtlR.lot_no(), MAC_STR.NULL_VAL.value()));
			dtlR.sublot_no(nvl(dtlR.sublot_no(), MAC_STR.NULL_VAL.value()));
			dtlR.sno1(nvl(dtlR.sno1(), MAC_STR.NULL_VAL.value()));
			dtlR.sno2(nvl(dtlR.sno2(), MAC_STR.NULL_VAL.value()));
			dtlR.sno3(nvl(dtlR.sno3(), MAC_STR.NULL_VAL.value()));
			dtlR.sno4(nvl(dtlR.sno4(), MAC_STR.NULL_VAL.value()));
			dtlR.fix_no_typ(nvl(dtlR.fix_no_typ(), MSC_FIX_NO_TYP.NON.value()));
			dtlR.fix_no(nvl(dtlR.fix_no(), MAC_STR.NULL_VAL.value()));
			dtlR.base_unit_cd(nvl(dtlR.base_unit_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.pack_xfr_base_unit_cd(nvl(dtlR.pack_xfr_base_unit_cd(), MAC_STR.NULL_VAL.value()));
			if (isNull(dtlR.ac_dt())) {
				dtlR.ac_dt(getAcDt(nvl(hdrR.end_dt(), hdrR.st_dt())));
			}
			// 着手明細の計上日で上り電文の取消計上日を補完する
			if (!isNull(sttR)) {
				dtlR.can_ac_dt(sttR.ac_dt());
			}
		}

		/**
		 * 訂正（削除を含む）時、登録済の実績明細から補完する。
		 * @param dtlR 検査実績明細
		 */
		protected void compUpdateDetail(InspActIF_Upd01_DtlR dtlR) {
			MST_INSP_ACT_D_R actDR = _actDL.getFirst(_idxActD, dtlR.insp_act_no(), dtlR.insp_act_d_no());
			if (isNull(actDR)) {
				return;
			}
			// 下記の補完処理を行う。
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				dtlR.setStatus(Status.DELETE);
			}
			else {
				dtlR.setStatus(Status.MODIFY);
			}
			dtlR.itm_cd(compVal(dtlR.itm_cd_upd_flg(), dtlR.itm_cd(), actDR.itm_cd(), actDR.itm_cd()));
			dtlR.itm_sub1(compVal(dtlR.itm_sub1_upd_flg(), dtlR.itm_sub1(), actDR.itm_sub1(), MAC_STR.NULL_VAL.value()));
			dtlR.itm_sub2(compVal(dtlR.itm_sub2_upd_flg(), dtlR.itm_sub2(), actDR.itm_sub2(), MAC_STR.NULL_VAL.value()));
			dtlR.itm_sub3(compVal(dtlR.itm_sub3_upd_flg(), dtlR.itm_sub3(), actDR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			dtlR.loc_cd(compVal(dtlR.loc_cd_upd_flg(), dtlR.loc_cd(), actDR.loc_cd(), actDR.loc_cd()));
			dtlR.str_ln_cd(compVal(dtlR.str_ln_cd_upd_flg(), dtlR.str_ln_cd(), actDR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.stk_arrv_bp_cd(compVal(dtlR.stk_arrv_bp_cd_upd_flg(), dtlR.stk_arrv_bp_cd(), actDR.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.gd_cd(compVal(dtlR.gd_cd_upd_flg(), dtlR.gd_cd(), actDR.gd_cd(), actDR.gd_cd()));
			dtlR.quality_typ(compVal(dtlR.quality_typ_upd_flg(), dtlR.quality_typ(), actDR.quality_typ(), actDR.quality_typ()));
			dtlR.stk_insp_typ(compVal(dtlR.stk_insp_typ_upd_flg(), dtlR.stk_insp_typ(), actDR.stk_insp_typ(), actDR.stk_insp_typ()));
			dtlR.stk_id_typ(compVal(dtlR.stk_id_typ_upd_flg(), dtlR.stk_id_typ(), actDR.stk_id_typ(), actDR.stk_id_typ()));
			dtlR.stk_bp_cd(compVal(dtlR.stk_bp_cd_upd_flg(), dtlR.stk_bp_cd(), actDR.stk_bp_cd(), actDR.stk_bp_cd()));
			dtlR.lot_no(compVal(dtlR.lot_no_upd_flg(), dtlR.lot_no(), actDR.lot_no(), MAC_STR.NULL_VAL.value()));
			dtlR.sublot_no(compVal(dtlR.sublot_no_upd_flg(), dtlR.sublot_no(), actDR.sublot_no(), MAC_STR.NULL_VAL.value()));
			dtlR.sno1(compVal(dtlR.sno1_upd_flg(), dtlR.sno1(), actDR.sno1(), MAC_STR.NULL_VAL.value()));
			dtlR.sno2(compVal(dtlR.sno2_upd_flg(), dtlR.sno2(), actDR.sno2(), MAC_STR.NULL_VAL.value()));
			dtlR.sno3(compVal(dtlR.sno3_upd_flg(), dtlR.sno3(), actDR.sno3(), MAC_STR.NULL_VAL.value()));
			dtlR.sno4(compVal(dtlR.sno4_upd_flg(), dtlR.sno4(), actDR.sno4(), MAC_STR.NULL_VAL.value()));
			dtlR.fix_no_typ(compVal(dtlR.fix_no_typ_upd_flg(), dtlR.fix_no_typ(), actDR.fix_no_typ(), MSC_FIX_NO_TYP.NON.value()));
			dtlR.fix_no(compVal(dtlR.fix_no_upd_flg(), dtlR.fix_no(), actDR.fix_no(), MAC_STR.NULL_VAL.value()));
			dtlR.pack_unit_qty(compVal(dtlR.pack_unit_qty_upd_flg(), dtlR.pack_unit_qty(), actDR.pack_unit_qty(), null));
			dtlR.pack_unit_cd(compVal(dtlR.pack_unit_cd_upd_flg(), dtlR.pack_unit_cd(), actDR.pack_unit_cd(), null));
			dtlR.base_unit_qty(compVal(dtlR.base_unit_qty_upd_flg(), dtlR.base_unit_qty(), actDR.base_unit_qty(), null));
			dtlR.base_unit_cd(compVal(dtlR.base_unit_cd_upd_flg(), dtlR.base_unit_cd(), actDR.base_unit_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.pack_xfr_pack_unit_qty(compVal(dtlR.pack_xfr_pack_unit_qty_upd_flg(), dtlR.pack_xfr_pack_unit_qty(), actDR.pack_xfr_pack_unit_qty(), null));
			dtlR.pack_xfr_pack_unit_cd(compVal(dtlR.pack_xfr_pack_unit_cd_upd_flg(), dtlR.pack_xfr_pack_unit_cd(), actDR.pack_xfr_pack_unit_cd(), null));
			dtlR.pack_xfr_base_unit_qty(compVal(dtlR.pack_xfr_base_unit_qty_upd_flg(), dtlR.pack_xfr_base_unit_qty(), actDR.pack_xfr_base_unit_qty(), null));
			dtlR.pack_xfr_base_unit_cd(compVal(dtlR.pack_xfr_base_unit_cd_upd_flg(), dtlR.pack_xfr_base_unit_cd(), actDR.pack_xfr_base_unit_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.dfct_rsn_cd(compVal(dtlR.dfct_rsn_cd_upd_flg(), dtlR.dfct_rsn_cd(), actDR.dfct_rsn_cd(), null));
			dtlR.ac_dt(compVal(dtlR.ac_dt_upd_flg(), dtlR.ac_dt(), actDR.ac_dt(), null));
			dtlR.intr_rmrks(compVal(dtlR.intr_rmrks_upd_flg(), dtlR.intr_rmrks(), actDR.intr_rmrks(), null));
			dtlR.sub_char1(compVal(dtlR.sub_char1_upd_flg(), dtlR.sub_char1(), actDR.sub_char1(), null));
			dtlR.sub_char2(compVal(dtlR.sub_char2_upd_flg(), dtlR.sub_char2(), actDR.sub_char2(), null));
			dtlR.sub_char3(compVal(dtlR.sub_char3_upd_flg(), dtlR.sub_char3(), actDR.sub_char3(), null));
			dtlR.can_ac_dt(nvl(dtlR.can_ac_dt(), actDR.ac_dt()));
		}

		/**
		 * 検査抜取実績を補完する。
		 */
		protected void compSmpl() {
			if (up3().isEmpty()) {
				return;
			}

			for (InspActIF_Upd01_SmplR smplR : up3()) {
				// 新規登録時、一部NOT NULL項目の値を指定されない場合、NULL文字列を設定する。
				if (MAC_DATA_CRUD_TYP.isCRT(smplR.data_crud_typ())) {
					compCreateSmpl(smplR);
				// 訂正（削除を含む）時、登録済の実績明細から補完を行う。
				} else {
					compUpdateSmpl(smplR);
				}

				// 紐付けＮＯの再設定
				if (isNull(smplR.peg_no())) {
					smplR.peg_no(_pnMap.get(smplR.insp_no()));
				}
			}
		}

		protected void compCreateSmpl(InspActIF_Upd01_SmplR smplR) {
			// 以下のNOT NULL項目に、値が指定されない場合、NULL文字列を設定する。
			smplR.setStatus(Status.CREATE);
			smplR.insp_smpl_act_no(null);
			smplR.itm_sub1(nvl(smplR.itm_sub1(), MAC_STR.NULL_VAL.value()));
			smplR.itm_sub2(nvl(smplR.itm_sub2(), MAC_STR.NULL_VAL.value()));
			smplR.itm_sub3(nvl(smplR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			smplR.base_unit_cd(nvl(smplR.base_unit_cd(), MAC_STR.NULL_VAL.value()));
			smplR.loc_cd(nvl(smplR.loc_cd(), MAC_STR.NULL_VAL.value()));
			smplR.str_ln_cd(nvl(smplR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
			smplR.stk_bp_cd(nvl(smplR.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			smplR.stk_arrv_bp_cd(nvl(smplR.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			smplR.lot_no(nvl(smplR.lot_no(), MAC_STR.NULL_VAL.value()));
			smplR.sublot_no(nvl(smplR.sublot_no(), MAC_STR.NULL_VAL.value()));
			smplR.sno1(nvl(smplR.sno1(), MAC_STR.NULL_VAL.value()));
			smplR.sno2(nvl(smplR.sno2(), MAC_STR.NULL_VAL.value()));
			smplR.sno3(nvl(smplR.sno3(), MAC_STR.NULL_VAL.value()));
			smplR.sno4(nvl(smplR.sno4(), MAC_STR.NULL_VAL.value()));
//			// なお、確定ＮＯ区分が未指定の場合、「なし」とする。
//			smplR.fix_no_typ(nvl(smplR.fix_no(), MSC_FIX_NO_TYP.NON.value()));
//			smplR.fix_no(nvl(smplR.fix_no(), MAC_STR.NULL_VAL.value()));
//			smplR.pack_xfr_base_unit_cd(nvl(smplR.pack_xfr_base_unit_cd(), MAC_STR.NULL_VAL.value()));
		}

		protected void compUpdateSmpl(InspActIF_Upd01_SmplR smplR) {
			MST_INSP_SMPL_ACT_R smplActR = _smplActL.getFirst(_idxSmpl, smplR.insp_act_no(), smplR.insp_smpl_act_no());
			if (isNull(smplActR)) {
				return;
			}
			// 下記の補完処理を行う。
			if (MAC_DATA_CRUD_TYP.isDEL(smplR.data_crud_typ())) {
				smplR.setStatus(Status.DELETE);
			} else {
				smplR.setStatus(Status.MODIFY);
			}
			smplR.itm_cd(compVal(smplR.itm_cd_upd_flg(), smplR.itm_cd(), smplActR.itm_cd(), smplActR.itm_cd()));
			smplR.itm_sub1(compVal(smplR.itm_sub1_upd_flg(), smplR.itm_sub1(), smplActR.itm_sub1(), MAC_STR.NULL_VAL.value()));
			smplR.itm_sub2(compVal(smplR.itm_sub2_upd_flg(), smplR.itm_sub2(), smplActR.itm_sub2(), MAC_STR.NULL_VAL.value()));
			smplR.itm_sub3(compVal(smplR.itm_sub3_upd_flg(), smplR.itm_sub3(), smplActR.itm_sub3(), MAC_STR.NULL_VAL.value()));
			smplR.so_qty(compVal(smplR.so_qty_upd_flg(), smplR.so_qty(), smplActR.so_qty(), null));
			smplR.smpl_qty(compVal(smplR.smpl_qty_upd_flg(), smplR.smpl_qty(), smplActR.smpl_qty(), null));
			smplR.base_unit_cd(compVal(smplR.base_unit_cd_upd_flg(), smplR.base_unit_cd(), smplActR.base_unit_cd(), MAC_STR.NULL_VAL.value()));
			smplR.pack_xfr_pack_unit_qty(compVal(smplR.pack_xfr_pack_unit_qty_upd_flg(), smplR.pack_xfr_pack_unit_qty(), smplActR.pack_xfr_pack_unit_qty(), null));
			smplR.pack_xfr_pack_unit_cd(compVal(smplR.pack_xfr_pack_unit_cd_upd_flg(), smplR.pack_xfr_pack_unit_cd(), smplActR.pack_xfr_pack_unit_cd(), null));
			smplR.pack_xfr_base_unit_qty(compVal(smplR.pack_xfr_base_unit_qty_upd_flg(), smplR.pack_xfr_base_unit_qty(), smplActR.pack_xfr_base_unit_qty(), null));
			smplR.pack_xfr_base_unit_cd(compVal(smplR.pack_xfr_base_unit_cd_upd_flg(), smplR.pack_xfr_base_unit_cd(), smplActR.pack_xfr_base_unit_cd(), null));
			smplR.loc_cd(compVal(smplR.loc_cd_upd_flg(), smplR.loc_cd(), smplActR.loc_cd(), MAC_STR.NULL_VAL.value()));
			smplR.str_ln_cd(compVal(smplR.str_ln_cd_upd_flg(), smplR.str_ln_cd(), smplActR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
			smplR.stk_arrv_bp_cd(compVal(smplR.stk_arrv_bp_cd_upd_flg(), smplR.stk_arrv_bp_cd(), smplActR.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
			smplR.gd_cd(compVal(smplR.gd_cd_upd_flg(), smplR.gd_cd(), smplActR.gd_cd(), smplActR.gd_cd()));
			smplR.quality_typ(compVal(smplR.quality_typ_upd_flg(), smplR.quality_typ(), smplActR.quality_typ(), smplActR.quality_typ()));
			smplR.stk_insp_typ(compVal(smplR.stk_insp_typ_upd_flg(), smplR.stk_insp_typ(), smplActR.stk_insp_typ(), smplActR.stk_insp_typ()));
			smplR.stk_id_typ(compVal(smplR.stk_id_typ_upd_flg(), smplR.stk_id_typ(), smplActR.stk_id_typ(), smplActR.stk_id_typ()));
			smplR.stk_bp_cd(compVal(smplR.stk_bp_cd_upd_flg(), smplR.stk_bp_cd(), smplActR.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			smplR.lot_no(compVal(smplR.lot_no_upd_flg(), smplR.lot_no(), smplActR.lot_no(), MAC_STR.NULL_VAL.value()));
			smplR.sublot_no(compVal(smplR.sublot_no_upd_flg(), smplR.sublot_no(), smplActR.sublot_no(), MAC_STR.NULL_VAL.value()));
			smplR.sno1(compVal(smplR.sno1_upd_flg(), smplR.sno1(), smplActR.sno1(), MAC_STR.NULL_VAL.value()));
			smplR.sno2(compVal(smplR.sno2_upd_flg(), smplR.sno2(), smplActR.sno2(), MAC_STR.NULL_VAL.value()));
			smplR.sno3(compVal(smplR.sno3_upd_flg(), smplR.sno3(), smplActR.sno3(), MAC_STR.NULL_VAL.value()));
			smplR.sno4(compVal(smplR.sno4_upd_flg(), smplR.sno4(), smplActR.sno4(), MAC_STR.NULL_VAL.value()));
			smplR.fix_no_typ(compVal(smplR.fix_no_typ_upd_flg(), smplR.fix_no_typ(), smplActR.fix_no_typ(), null));
			smplR.fix_no(compVal(smplR.fix_no_upd_flg(), smplR.fix_no(), smplActR.fix_no(), null));
//			smplR.fix_no_typ(compVal(smplR.fix_no_typ_upd_flg(), smplR.fix_no_typ(), smplActR.fix_no_typ(), MSC_FIX_NO_TYP.NON.value())); // 確定ＮＯ区分が未指定の場合、「なし」とする。
//			smplR.fix_no(compVal(smplR.fix_no_upd_flg(), smplR.fix_no(), smplActR.fix_no(), MAC_STR.NULL_VAL.value()));
			smplR.ac_dt(compVal(smplR.ac_dt_upd_flg(), smplR.ac_dt(), smplActR.ac_dt(), null));
			smplR.act_dt(compVal(smplR.act_hm_upd_flg(), smplR.act_dt(), smplActR.act_tm(), null));
			smplR.act_hm(compVal(smplR.act_hm_upd_flg(), smplR.act_hm(), smplActR.act_tm(), null));
			smplR.bd_dpt_cd(compVal(smplR.bd_dpt_cd_upd_flg(), smplR.bd_dpt_cd(), smplActR.bd_dpt_cd(), null));
			smplR.trd_rmrks(compVal(smplR.trd_rmrks_upd_flg(), smplR.trd_rmrks(), smplActR.trd_rmrks(), null));
			smplR.intr_rmrks(compVal(smplR.intr_rmrks_upd_flg(), smplR.intr_rmrks(), smplActR.intr_rmrks(), null));
			smplR.sub_char1(compVal(smplR.sub_char1_upd_flg(), smplR.sub_char1(), smplActR.sub_char1(), null));
			smplR.sub_char2(compVal(smplR.sub_char2_upd_flg(), smplR.sub_char2(), smplActR.sub_char2(), null));
			smplR.sub_char3(compVal(smplR.sub_char3_upd_flg(), smplR.sub_char3(), smplActR.sub_char3(), null));
			smplR.can_ac_dt(nvl(smplR.can_ac_dt(), smplActR.ac_dt()));
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 * @param updFlg 更新ＦＬＧ
		 * @param upVal 上り電文の値
		 * @param dbVal 更新前の値
		 * @param defVal デフォルト値
		 * @return 更新後の値
		 */
		private String compVal(boolean updFlg, String upVal, String dbVal, String defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}

			return dbVal;
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 * @param updFlg 更新ＦＬＧ
		 * @param upVal 上り電文の値
		 * @param dbVal 更新前の値
		 * @param defVal デフォルト値
		 * @return 更新後の値
		 */
		private MCNumber compVal(boolean updFlg, MCNumber upVal, MCNumber dbVal, MCNumber defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}

			return dbVal;
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 * @param updFlg 更新ＦＬＧ
		 * @param upVal 上り電文の値
		 * @param dbVal 更新前の値
		 * @param defVal デフォルト値
		 * @return 更新後の値
		 */
		private MCDate compVal(boolean updFlg, MCDate upVal, MCDate dbVal, MCDate defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}

			return dbVal;
		}
	}
	
	/**
	 * InspActIF_Upd02オペレーション.<p>
	 *
	 * 抜取検査/全数検査の実績を判定する。<br>
	 */
	public class InspActIF_Upd02 extends MSBFL_InspActRcptIFService_MC_A.InspActIF_Upd02 {
		/** 検査ＮＯ（更新対象）セット */
		protected Set<String> _inspNoSet = null;
		/** チェックＯＫ紐付けＮＯセット */
		protected Set<MCNumber> _pegNoOKSet = new HashSet<MCNumber>();
		/** 検査ＮＯ毎の紐付けＮＯマップ */
		protected Map<String, MCNumber> _pnMap = new HashMap<String, MCNumber>();
		/** 検査予定のキャッシュ */
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		/** 検査指図のキャッシュ */
		protected MCList<MST_INSP_INST_R> _instL = MCList.create(MST_INSP_INST_R.class);
		protected MST_INSP_INST_R _instL_t = MST_INSP_INST_R.create("T");
		protected MCQueryApiBuilder _instL_bldr = MCQueryApiBuilder.create(_instL_t);
		/** 検査実績のキャッシュ */
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MST_INSP_ACT_R _actL_t = MST_INSP_ACT_R.create("T");
		protected MCQueryApiBuilder _actL_bldr = MCQueryApiBuilder.create(_actL_t);
		/** 検査実績明細のキャッシュ */
		protected MCList<MST_INSP_ACT_D_R> _actDL = MCList.create(MST_INSP_ACT_D_R.class);
		protected MST_INSP_ACT_D_R _actDL_t = MST_INSP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(_actDL_t);
		/** ロット情報のキャッシュ */
		protected MCList<MST_LOT_R> _lotL = MCList.create(MST_LOT_R.class);
		protected MST_LOT_R _lotL_t = MST_LOT_R.create("T");
		protected MCQueryApiBuilder _lotL_bldr = MCQueryApiBuilder.create(_lotL_t);
		
		protected MCIndexKey _idxSchd = null;
		protected MCIndexKey _idxInst = null;
		protected MCIndexKey _idxAct = null;
		protected MCIndexKey _idxActD = null;
		protected MCIndexKey _idxSttD = null;
		protected MCIndexKey _idxHdrUp = null;
		protected MCIndexKey _idxLot = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preProc();

			throwUpdErr();
			
			createCache();

			compUpTelegram();

			callUpdChk();

			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwUpdErr();
			}

			chkInstUpdCnt();

			throwUpdErr();

			execUpd();

			throwUpdErr();

			down0().setAll(up1());
			down1().setAll(up2());
		}

		protected void preProc() {
			MCMessagePool.addAll(checkUpTelegram());
		}

		protected MCMessageList checkUpTelegram() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(check(up0(), InspActIF_Upd02_CtrlR.$if_upd_typ, new FXUCL_RequiredValidater()));
			
			if (!up1().isEmpty()) {
				msgL.addAll(check(up1(), InspActIF_Upd02_HdrR.$insp_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up1(), InspActIF_Upd02_HdrR.$peg_no, new FXUCL_RequiredValidater()));
				if (up0().upd_cntr_chk_flg()) {
					msgL.addAll(check(up1(), InspActIF_Upd02_HdrR.$insp_inst_upd_cntr, new FXUCL_RequiredValidater()));
				}
			}
			
			// 検査ＮＯセットの初期化
			_inspNoSet = new HashSet<String>();
			_inspNoSet.addAll(up1().getString(InspActIF_Upd02_HdrR.$insp_no));

			// 検査実績明細のチェック
			for (InspActIF_Upd02_DtlR dtlR : up2()) {
				msgL.addAll(check(dtlR, InspActIF_Upd02_DtlR.$insp_no, new FXUCL_RequiredValidater()));
				if (!isNull(dtlR.insp_no()) && !_inspNoSet.contains(dtlR.insp_no())) {
					msgL.add(new MCMessage(MSBFL0077, dtlR, dtlR.insp_no()));
				}
				
				msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$data_crud_typ, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$insp_act_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, InspActIF_Upd01_DtlR.$insp_act_d_no, new FXUCL_RequiredValidater()));
			}

			return msgL;
		}
		
		protected void callUpdChk() {
			// 業務チェックを行う。
			MSBFL_InspActService.InspAct_Chk02 ope = MSBFL_InspActService.crtInspAct_Chk02();
			addAll(ope.up0(), up1(), createMap_InspAct_Chk02_HdrR_InspActIF_Upd02_HdrR());
			addAll(ope.up1(), up2(), createMap_InspAct_Chk02_DtlR_InspActIF_Upd02_DtlR());
			ope.exec();
			
			// チェックエラーが発生しなかった紐付けＮＯを洗い出す
			MCNumber minErrPegNo = null;
			Set<MCNumber> pegNoErrSet = new HashSet<MCNumber>();
			pegNoErrSet.addAll(ope.down0().subList(InspAct_Chk01_HdrR.$err_flg, true).getNumberNE(InspAct_Chk01_HdrR.$peg_no));
			for ( MCNumber v : pegNoErrSet) {
				if (minErrPegNo == null || minErrPegNo.gt(v)) {
					minErrPegNo = v;
				}
			}
			for (InspAct_Chk02_HdrR hdrR : ope.down0()) {
				if (pegNoErrSet.contains(hdrR.peg_no())) {
					continue;
				}
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					if (minErrPegNo != null && minErrPegNo.lte(hdrR.peg_no())) {
						continue;
					}
				}
				
				_pegNoOKSet.add(hdrR.peg_no());
			}
		}

		/**
		 * 更新カウンタチェックを行う。
		 */
		protected void chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("INSPINST"));
			MCList<MST_INSP_INST_R> resultL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKeyForUpdateNoWait("MSBFL5070_MST_INSP_INST_S01", resultL, bldr, up1());
			
			MCIndexKey inspInstIdx = up1().createIndex(InspActIF_Upd02_HdrR.$insp_no);
			for (MST_INSP_INST_R result : resultL) {
				InspActIF_Upd02_HdrR hdrR = up1().getFirst(inspInstIdx, result.insp_no());
				msgL.addAll(checkUpdCntrNE(hdrR, InspActIF_Upd01_HdrR.$insp_inst_upd_cntr, result));
			}

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}

		protected void execUpd() {
			if (_pegNoOKSet.isEmpty()) {
				return;
			}

			MSBFL_InspActService.InspAct_Upd02 ope = MSBFL_InspActService.crtInspAct_Upd02();
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				addAll(ope.up0(), up1(), createMap_InspAct_Upd02_HdrR_InspActIF_Upd02_HdrR());
				addAll(ope.up1(), up2(), createMap_InspAct_Upd02_DtlR_InspActIF_Upd02_DtlR());
			} else {
				MCList<InspActIF_Upd02_HdrR> updHdrL = MCList.create(InspActIF_Upd02_HdrR.class);
				MCList<InspActIF_Upd02_DtlR> updDtlL = MCList.create(InspActIF_Upd02_DtlR.class);
				Set<String> inspNoOKSet = new HashSet<String>();
				for (InspActIF_Upd02_HdrR hdrR : up1()) {
					if (_pegNoOKSet.contains(hdrR.peg_no())) {
						updHdrL.add(hdrR);
						inspNoOKSet.add(hdrR.insp_no());
					}
				}
				for (InspActIF_Upd02_DtlR dtlR : up2()) {
					if (inspNoOKSet.contains(dtlR.insp_no())) {
						updDtlL.add(dtlR);
					}
				}
				addAll(ope.up0(), up1(), createMap_InspAct_Upd02_HdrR_InspActIF_Upd02_HdrR());
				addAll(ope.up1(), up2(), createMap_InspAct_Upd02_DtlR_InspActIF_Upd02_DtlR());
			}

			ope.exec();
		}

		protected void compUpTelegram() {
			compHead();
			compDetail();
		}

		/**
		 * 検査関連データ（予定、指図、実績、実績明細、ロット情報）をキャッシュする。
		 */
		protected void createCache() {
			// データをキャッシュする。
			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5070_MST_INSP_SCHD_S01", _schdL, _schdL_bldr, up1());

			_instL_bldr.setWhere(_instL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5070_MST_INSP_INST_S02", _instL, _instL_bldr, up1());

			_actL_bldr.setWhere(_actL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5070_MST_INSP_ACT_S01", _actL, _actL_bldr, up1());

			_actDL_bldr.setWhere(_actDL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5070_MST_INSP_ACT_D_S01", _actDL, _actDL_bldr, _actL);
			
			dbSelectKey("MSBFL5070_MST_LOT_S01", _lotL, _lotL_bldr, _instL);

			// キャッシュデータのインデックスを初期化
			_idxSchd = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			_idxInst = _instL.createIndex(MST_INSP_INST_R.$insp_no);
			_idxAct = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			_idxHdrUp = up1().createIndex(InspActIF_Upd01_HdrR.$insp_no);
			_idxActD = _actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_no,
					MST_INSP_ACT_D_R.$insp_act_d_no);
			_idxLot = _lotL.createIndex(MST_LOT_R.$itm_cd, 
					MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3,
					MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
		}

		/**
		 * 検査実績ヘッダを補完する。
		 */
		protected void compHead() {
			MCNumber pegNo = new MCNumber(up1().size());

			for (InspActIF_Upd02_HdrR hdrR : up1()) {
				// 紐付けＮＯの再設定
				if (isNull(hdrR.peg_no())) {
					pegNo = pegNo.add(MCNumber.ONE);
					hdrR.peg_no(pegNo);
				}
				_pnMap.put(hdrR.insp_no(), hdrR.peg_no());
				
				MST_INSP_INST_R instR = _instL.getFirst(_idxInst, hdrR.insp_no());
				MST_INSP_ACT_R actR = _actL.getFirst(_idxAct, hdrR.insp_act_no());
				MST_LOT_R lotR = _lotL.getFirst(_idxLot, actR.itm_cd(), 
						actR.itm_sub1(), actR.itm_sub2(), actR.itm_sub3(),
						actR.lot_no(), actR.sublot_no());
				if (isNull(actR)) {
					return;
				}

				// 下記項目は呼び出し元で設定されるため、補完対象外
				// 検査ＮＯ、検査実績ＮＯ、判定日、検査判定結果区分、判定部門ＣＤ、判定者ＣＤ、判定理由
				// 起算日、有効期限、使用期限
				// 実績内部備考、ロット備考、予備１，予備２、予備３
				hdrR.insp_typ(actR.insp_typ());
				hdrR.insp_sts_typ(instR.insp_sts_typ());
				hdrR.insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
				hdrR.itm_cd(actR.itm_cd());
				hdrR.itm_sub1(actR.itm_sub1());
				hdrR.itm_sub2(actR.itm_sub2());
				hdrR.itm_sub3(actR.itm_sub3());
				hdrR.lot_no(actR.lot_no());
				hdrR.sublot_no(actR.sublot_no());
				if (MSC_INSP_TYP.isPRCD(instR.insp_typ())) {
					hdrR.ver_no(null);
				}
				else {
					hdrR.ver_no(lotR.ver_no());
				}
				hdrR.lmt_dt_frm_typ(actR.lmt_dt_frm_typ());
			}
		}

		/**
		 * 検査実績明細を補完する。
		 */
		protected void compDetail() {
			for (InspActIF_Upd02_DtlR dtlR : up2()) {
				// 紐付けＮＯの再設定
				if (isNull(dtlR.peg_no())) {
					dtlR.peg_no(_pnMap.get(dtlR.insp_no()));
				}
				
				MST_INSP_ACT_D_R actDR = _actDL.getFirst(_idxActD, dtlR.insp_act_no(), dtlR.insp_act_d_no());
				if (isNull(actDR)) {
					return;
				}
				// 下記項目は呼び出し元で設定されるため、補完対象外
				//  データ更新区分、検査ＮＯ、検査実績ＮＯ、計上日
				dtlR.itm_cd(actDR.itm_cd());
				dtlR.itm_sub1(actDR.itm_sub1());
				dtlR.itm_sub2(actDR.itm_sub2());
				dtlR.itm_sub3(actDR.itm_sub3());
				dtlR.loc_cd(actDR.loc_cd());
				dtlR.str_ln_cd(actDR.str_ln_cd());
				dtlR.quality_typ(actDR.quality_typ());
				dtlR.stk_insp_typ(actDR.stk_insp_typ());
				dtlR.stk_id_typ(actDR.stk_id_typ());
				dtlR.stk_bp_cd(actDR.stk_bp_cd());
				dtlR.gd_cd(actDR.gd_cd());
				dtlR.stk_arrv_bp_cd(actDR.stk_arrv_bp_cd());
				dtlR.lot_no(actDR.lot_no());
				dtlR.sublot_no(actDR.sublot_no());
				dtlR.sno1(actDR.sno1());
				dtlR.sno1_mng_typ(actDR.sno1_mng_typ());
				dtlR.sno2(actDR.sno2());
				dtlR.sno2_mng_typ(actDR.sno2_mng_typ());
				dtlR.sno3(actDR.sno3());
				dtlR.sno3_mng_typ(actDR.sno3_mng_typ());
				dtlR.sno4(actDR.sno4());
				dtlR.sno4_mng_typ(actDR.sno4_mng_typ());
				dtlR.fix_no_typ(actDR.fix_no_typ());
				dtlR.fix_no(actDR.fix_no());
				dtlR.pack_unit_qty(actDR.pack_unit_qty());
				dtlR.pack_unit_cd(actDR.pack_unit_cd());
				dtlR.base_unit_qty(actDR.base_unit_qty());
				dtlR.base_unit_cd(actDR.base_unit_cd());
				dtlR.intr_rmrks(actDR.intr_rmrks());
				dtlR.sub_char1(actDR.sub_char1());
				dtlR.sub_char2(actDR.sub_char2());
				dtlR.sub_char3(actDR.sub_char3());
			}
		}
	}

	/**
	 * InspActIF_Del01オペレーション.<p>
	 *
	 * 抜取検査、または、全数検査の実績情報を取り消す。<br>
	 */
	public class InspActIF_Del01 extends MSBFL_InspActRcptIFService_MC_A.InspActIF_Del01 {
		/** チェックＯＫ紐付けＮＯセット */
		private Set<MCNumber> _pegNoOKSet = new HashSet<MCNumber>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 取消前処理 
			preProc();

			// 補完処理
			cmpData();

			// 業務チェック
			callDelChk();

			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwCanErr();
			}

			// 取消処理
			execDel();

			throwCanErr();
		}

		/**
		 * 業務チェック処理を実行する
		 */
		protected void callDelChk() {
			// 業務チェックを行う。
			MSBFL_InspActService.InspAct_Chk04 ope = MSBFL_InspActService.crtInspAct_Chk04();
			addAll(ope.up0(), up1(), createMap_InspAct_Chk04_HdrR_InspActIF_Del01_CndR());
			ope.exec();

			// チェックエラーが発生しなかった紐付けＮＯを洗い出す。
			MCNumber minErrPegNo = null;
			Set<MCNumber> pegNoErrSet = new HashSet<MCNumber>();
			pegNoErrSet.addAll(ope.down0().subList(InspAct_Chk04_HdrR.$err_flg, true).getNumberNE(InspAct_Chk04_HdrR.$peg_no));
			for ( MCNumber v : pegNoErrSet) {
				if (minErrPegNo == null || minErrPegNo.gt(v)) {
					minErrPegNo = v;
				}
			}
			for (InspAct_Chk04_HdrR hdrR : ope.down0()) {
				if (pegNoErrSet.contains(hdrR.peg_no())) {
					continue;
				}
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					if (minErrPegNo != null && minErrPegNo.lte(hdrR.peg_no())) {
						continue;
					}
				}
				
				_pegNoOKSet.add(hdrR.peg_no());
			}
		}

		/**
		 * 取消処理を実施する。
		 */
		protected void execDel() {
			if (_pegNoOKSet.isEmpty()) {
				return;
			}

			MSBFL_InspActService.InspAct_Del01 ope = MSBFL_InspActService.crtInspAct_Del01();
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				addAll(ope.up0(), up1(), createMap_InspAct_Del01_CndR_InspActIF_Del01_CndR());
			} else {
				MCList<InspActIF_Del01_CndR> delHdrL = MCList.create(InspActIF_Del01_CndR.class);
				for (InspActIF_Del01_CndR hdrR : up1()) {
					if (_pegNoOKSet.contains(hdrR.peg_no())) {
						delHdrL.add(hdrR);
					}
				}
				addAll(ope.up0(), delHdrL, createMap_InspAct_Del01_CndR_InspActIF_Del01_CndR());
			}

			ope.exec();
		}

		/**
		 * 前処理<br>&nbsp;&nbsp;
		 *  ＝＞必須チェック、重複チェック
		 */
		protected void preProc() {
			// 必須チェック
			MCMessagePool.addAll(checkReq());
		}

		/**
		 * 上り電文に対する必須チェックを行う。
		 * @return チェック結果メッセージ
		 */
		protected MCMessageList checkReq() {
			MCMessageList msgL = new MCMessageList();

			// 更新制御ブロック（電文）の必須チェック
			msgL.addAll(check(up0(), InspActIF_Del01_CtrlR.$if_upd_typ, new FXUCL_RequiredValidater()));

			// 検査指図ブロック（電文）の必須チェック
			msgL.addAll(check(up1(), InspActIF_Del01_CndR.$insp_no, new FXUCL_RequiredValidater()));
			if (up0().upd_cntr_chk_flg()) {
				msgL.addAll(check(up1(), InspActIF_Del01_CndR.$insp_inst_upd_cntr, new FXUCL_RequiredValidater()));
			}

			return msgL;
		}

		protected void cmpData() {
			MCNumber pegNo = new MCNumber(up1().size());
			for (InspActIF_Del01_CndR cR : up1()) {
				// 紐付けＮＯ
				if (isNull(cR.peg_no())) {
					pegNo = pegNo.add(MCNumber.ONE);
					cR.peg_no(pegNo);
				}
			}
		}
	}

	// --- Mapper ---
	protected Map_InspAct_Chk04_HdrR_InspActIF_Del01_CndR<InspAct_Chk04_HdrR,InspActIF_Del01_CndR> createMap_InspAct_Chk04_HdrR_InspActIF_Del01_CndR() {
		return new Map_InspAct_Chk04_HdrR_InspActIF_Del01_CndR<InspAct_Chk04_HdrR, InspActIF_Del01_CndR>();
	}

	public class Map_InspAct_Chk04_HdrR_InspActIF_Del01_CndR<D extends InspAct_Chk04_HdrR, S extends InspActIF_Del01_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Chk04_HdrR.$peg_no, InspActIF_Del01_CndR.$peg_no);
			addColumnPathMap(InspAct_Chk04_HdrR.$insp_no, InspActIF_Del01_CndR.$insp_no);
			addColumnPathMap(InspAct_Chk04_HdrR.$insp_act_no, InspActIF_Del01_CndR.$insp_act_no);
			addColumnPathMap(InspAct_Chk04_HdrR.$insp_sts_typ, InspActIF_Del01_CndR.$insp_sts_typ);
			addColumnPathMap(InspAct_Chk04_HdrR.$can_ac_dt, InspActIF_Del01_CndR.$can_ac_dt);
			addColumnPathMap(InspAct_Chk04_HdrR.$insp_aprv_sts_typ, InspActIF_Del01_CndR.$insp_aprv_sts_typ);
			addColumnPathMap(InspAct_Chk04_HdrR.$insp_judg_rslt_typ, InspActIF_Del01_CndR.$insp_judg_rslt_typ);
			addColumnPathMap(InspAct_Chk04_HdrR.$judg_rsn, InspActIF_Del01_CndR.$judg_rsn);
			addColumnPathMap(InspAct_Chk04_HdrR.$inst_upd_cntr, InspActIF_Del01_CndR.$insp_inst_upd_cntr);

		}
	}

	protected Map_InspAct_Del01_CndR_InspActIF_Del01_CndR<InspAct_Del01_CndR,InspActIF_Del01_CndR> createMap_InspAct_Del01_CndR_InspActIF_Del01_CndR() {
		return new Map_InspAct_Del01_CndR_InspActIF_Del01_CndR<InspAct_Del01_CndR, InspActIF_Del01_CndR>();
	}

	public class Map_InspAct_Del01_CndR_InspActIF_Del01_CndR<D extends InspAct_Del01_CndR, S extends InspActIF_Del01_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Del01_CndR.$peg_no, InspActIF_Del01_CndR.$peg_no);
			addColumnPathMap(InspAct_Del01_CndR.$insp_no, InspActIF_Del01_CndR.$insp_no);
			addColumnPathMap(InspAct_Del01_CndR.$insp_act_no, InspActIF_Del01_CndR.$insp_act_no);
			addColumnPathMap(InspAct_Del01_CndR.$insp_sts_typ, InspActIF_Del01_CndR.$insp_sts_typ);
			addColumnPathMap(InspAct_Del01_CndR.$can_ac_dt, InspActIF_Del01_CndR.$can_ac_dt);
			addColumnPathMap(InspAct_Del01_CndR.$insp_aprv_sts_typ, InspActIF_Del01_CndR.$insp_aprv_sts_typ);
			addColumnPathMap(InspAct_Del01_CndR.$insp_judg_rslt_typ, InspActIF_Del01_CndR.$insp_judg_rslt_typ);
			addColumnPathMap(InspAct_Del01_CndR.$judg_rsn, InspActIF_Del01_CndR.$judg_rsn);

		}
	}

	protected Map_InspAct_Chk01_HdrR_InspActIF_Upd01_HdrR<InspAct_Chk01_HdrR,InspActIF_Upd01_HdrR> createMap_InspAct_Chk01_HdrR_InspActIF_Upd01_HdrR() {
		return new Map_InspAct_Chk01_HdrR_InspActIF_Upd01_HdrR<InspAct_Chk01_HdrR, InspActIF_Upd01_HdrR>();
	}

	public class Map_InspAct_Chk01_HdrR_InspActIF_Upd01_HdrR<D extends InspAct_Chk01_HdrR, S extends InspActIF_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Chk01_HdrR.$peg_no, InspActIF_Upd01_HdrR.$peg_no);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_no, InspActIF_Upd01_HdrR.$insp_no);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_act_no, InspActIF_Upd01_HdrR.$insp_act_no);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_freq, InspActIF_Upd01_HdrR.$insp_freq);
			addColumnPathMap(InspAct_Chk01_HdrR.$src_no1, InspActIF_Upd01_HdrR.$src_no1);
			addColumnPathMap(InspAct_Chk01_HdrR.$src_no2, InspActIF_Upd01_HdrR.$src_no2);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_typ, InspActIF_Upd01_HdrR.$insp_typ);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_mtd_typ, InspActIF_Upd01_HdrR.$insp_mtd_typ);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_sts_typ, InspActIF_Upd01_HdrR.$insp_sts_typ);
			addColumnPathMap(InspAct_Chk01_HdrR.$insp_aprv_sts_typ, InspActIF_Upd01_HdrR.$insp_aprv_sts_typ);
			addColumnPathMap(InspAct_Chk01_HdrR.$itm_cd, InspActIF_Upd01_HdrR.$itm_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub1, InspActIF_Upd01_HdrR.$itm_sub1);
			addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub2, InspActIF_Upd01_HdrR.$itm_sub2);
			addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub3, InspActIF_Upd01_HdrR.$itm_sub3);
			addColumnPathMap(InspAct_Chk01_HdrR.$lot_no, InspActIF_Upd01_HdrR.$lot_no);
			addColumnPathMap(InspAct_Chk01_HdrR.$sublot_no, InspActIF_Upd01_HdrR.$sublot_no);
			addColumnPathMap(InspAct_Chk01_HdrR.$ver_no, InspActIF_Upd01_HdrR.$ver_no);
			addColumnPathMap(InspAct_Chk01_HdrR.$quality_typ, InspActIF_Upd01_HdrR.$quality_typ);
			addColumnPathMap(InspAct_Chk01_HdrR.$gd_cd, InspActIF_Upd01_HdrR.$gd_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$dfct_rsn_cd, InspActIF_Upd01_HdrR.$dfct_rsn_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$sppl_cd, InspActIF_Upd01_HdrR.$sppl_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$maker_cd, InspActIF_Upd01_HdrR.$maker_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$mfg_loc_cd, InspActIF_Upd01_HdrR.$mfg_loc_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$from_site_cd, InspActIF_Upd01_HdrR.$from_site_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_qty, InspActIF_Upd01_HdrR.$base_unit_qty);
			addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_cd, InspActIF_Upd01_HdrR.$base_unit_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$ttl_stk_qty, InspActIF_Upd01_HdrR.$ttl_stk_qty);

			addColumnPathMap(InspAct_Chk01_HdrR.$act_usr_cd, InspActIF_Upd01_HdrR.$act_usr_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$act_dpt_cd, InspActIF_Upd01_HdrR.$act_dpt_cd);
			addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm_typ, InspActIF_Upd01_HdrR.$lmt_dt_frm_typ);
			addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm, InspActIF_Upd01_HdrR.$lmt_dt_frm);
			addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt, InspActIF_Upd01_HdrR.$vld_dt);
			addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt, InspActIF_Upd01_HdrR.$lmt_dt);
			addColumnPathMap(InspAct_Chk01_HdrR.$act_cont_fctr, InspActIF_Upd01_HdrR.$act_cont_fctr);
			addColumnPathMap(InspAct_Chk01_HdrR.$intr_rmrks, InspActIF_Upd01_HdrR.$intr_rmrks);
			addColumnPathMap(InspAct_Chk01_HdrR.$lot_rmrks, InspActIF_Upd01_HdrR.$lot_rmrks);
			addColumnPathMap(InspAct_Chk01_HdrR.$sub_char1, InspActIF_Upd01_HdrR.$sub_char1);
			addColumnPathMap(InspAct_Chk01_HdrR.$sub_char2, InspActIF_Upd01_HdrR.$sub_char2);
			addColumnPathMap(InspAct_Chk01_HdrR.$sub_char3, InspActIF_Upd01_HdrR.$sub_char3);
			addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt_upd_flg, InspActIF_Upd01_HdrR.$vld_dt_upd_flg);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.st_tm(nvl(src.st_hm(), src.st_dt()));
			dest.end_tm(nvl(src.end_hm(), src.end_dt()));
		}
	}
	protected Map_InspAct_Chk01_DtlR_InspActIF_Upd01_DtlR<InspAct_Chk01_DtlR,InspActIF_Upd01_DtlR> createMap_InspAct_Chk01_DtlR_InspActIF_Upd01_DtlR() {
		return new Map_InspAct_Chk01_DtlR_InspActIF_Upd01_DtlR<InspAct_Chk01_DtlR, InspActIF_Upd01_DtlR>();
	}

	public class Map_InspAct_Chk01_DtlR_InspActIF_Upd01_DtlR<D extends InspAct_Chk01_DtlR, S extends InspActIF_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Chk01_DtlR.$peg_no, InspActIF_Upd01_DtlR.$peg_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$insp_no, InspActIF_Upd01_DtlR.$insp_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$data_crud_typ, InspActIF_Upd01_DtlR.$data_crud_typ);
			addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_d_no, InspActIF_Upd01_DtlR.$insp_act_d_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_no, InspActIF_Upd01_DtlR.$insp_act_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$itm_cd, InspActIF_Upd01_DtlR.$itm_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub1, InspActIF_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub2, InspActIF_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub3, InspActIF_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(InspAct_Chk01_DtlR.$loc_cd, InspActIF_Upd01_DtlR.$loc_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$str_ln_cd, InspActIF_Upd01_DtlR.$str_ln_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$quality_typ, InspActIF_Upd01_DtlR.$quality_typ);
			addColumnPathMap(InspAct_Chk01_DtlR.$stk_insp_typ, InspActIF_Upd01_DtlR.$stk_insp_typ);
			addColumnPathMap(InspAct_Chk01_DtlR.$stk_id_typ, InspActIF_Upd01_DtlR.$stk_id_typ);
			addColumnPathMap(InspAct_Chk01_DtlR.$stk_bp_cd, InspActIF_Upd01_DtlR.$stk_bp_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$gd_cd, InspActIF_Upd01_DtlR.$gd_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$stk_arrv_bp_cd, InspActIF_Upd01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$lot_no, InspActIF_Upd01_DtlR.$lot_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$sublot_no, InspActIF_Upd01_DtlR.$sublot_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$sno1, InspActIF_Upd01_DtlR.$sno1);
			addColumnPathMap(InspAct_Chk01_DtlR.$sno2, InspActIF_Upd01_DtlR.$sno2);
			addColumnPathMap(InspAct_Chk01_DtlR.$sno3, InspActIF_Upd01_DtlR.$sno3);
			addColumnPathMap(InspAct_Chk01_DtlR.$sno4, InspActIF_Upd01_DtlR.$sno4);
			addColumnPathMap(InspAct_Chk01_DtlR.$fix_no_typ, InspActIF_Upd01_DtlR.$fix_no_typ);
			addColumnPathMap(InspAct_Chk01_DtlR.$fix_no, InspActIF_Upd01_DtlR.$fix_no);
			addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_qty, InspActIF_Upd01_DtlR.$pack_unit_qty);
			addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_cd, InspActIF_Upd01_DtlR.$pack_unit_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_qty, InspActIF_Upd01_DtlR.$base_unit_qty);
			addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_cd, InspActIF_Upd01_DtlR.$base_unit_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_qty, InspActIF_Upd01_DtlR.$pack_xfr_pack_unit_qty);
			addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_cd, InspActIF_Upd01_DtlR.$pack_xfr_pack_unit_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_qty, InspActIF_Upd01_DtlR.$pack_xfr_base_unit_qty);
			addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, InspActIF_Upd01_DtlR.$pack_xfr_base_unit_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$dfct_rsn_cd, InspActIF_Upd01_DtlR.$dfct_rsn_cd);
			addColumnPathMap(InspAct_Chk01_DtlR.$ac_dt, InspActIF_Upd01_DtlR.$ac_dt);
			addColumnPathMap(InspAct_Chk01_DtlR.$can_ac_dt, InspActIF_Upd01_DtlR.$can_ac_dt);
			addColumnPathMap(InspAct_Chk01_DtlR.$intr_rmrks, InspActIF_Upd01_DtlR.$intr_rmrks);
			addColumnPathMap(InspAct_Chk01_DtlR.$sub_char1, InspActIF_Upd01_DtlR.$sub_char1);
			addColumnPathMap(InspAct_Chk01_DtlR.$sub_char2, InspActIF_Upd01_DtlR.$sub_char2);
			addColumnPathMap(InspAct_Chk01_DtlR.$sub_char3, InspActIF_Upd01_DtlR.$sub_char3);

		}
	}

	protected Map_InspAct_Chk01_SmplR_InspActIF_Upd01_SmplR<InspAct_Chk01_SmplR,InspActIF_Upd01_SmplR> createMap_InspAct_Chk01_SmplR_InspActIF_Upd01_SmplR() {
		return new Map_InspAct_Chk01_SmplR_InspActIF_Upd01_SmplR<InspAct_Chk01_SmplR, InspActIF_Upd01_SmplR>();
	}

	public class Map_InspAct_Chk01_SmplR_InspActIF_Upd01_SmplR<D extends InspAct_Chk01_SmplR, S extends InspActIF_Upd01_SmplR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Chk01_SmplR.$peg_no, InspActIF_Upd01_SmplR.$peg_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$insp_no, InspActIF_Upd01_SmplR.$insp_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$data_crud_typ, InspActIF_Upd01_SmplR.$data_crud_typ);
			addColumnPathMap(InspAct_Chk01_SmplR.$insp_smpl_act_no, InspActIF_Upd01_SmplR.$insp_smpl_act_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$insp_schd_no, InspActIF_Upd01_SmplR.$insp_schd_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$insp_act_no, InspActIF_Upd01_SmplR.$insp_act_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$itm_cd, InspActIF_Upd01_SmplR.$itm_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub1, InspActIF_Upd01_SmplR.$itm_sub1);
			addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub2, InspActIF_Upd01_SmplR.$itm_sub2);
			addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub3, InspActIF_Upd01_SmplR.$itm_sub3);
			addColumnPathMap(InspAct_Chk01_SmplR.$so_qty, InspActIF_Upd01_SmplR.$so_qty);
			addColumnPathMap(InspAct_Chk01_SmplR.$smpl_qty, InspActIF_Upd01_SmplR.$smpl_qty);
			addColumnPathMap(InspAct_Chk01_SmplR.$base_unit_cd, InspActIF_Upd01_SmplR.$base_unit_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_qty, InspActIF_Upd01_SmplR.$pack_xfr_pack_unit_qty);
			addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_cd, InspActIF_Upd01_SmplR.$pack_xfr_pack_unit_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_qty, InspActIF_Upd01_SmplR.$pack_xfr_base_unit_qty);
			addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, InspActIF_Upd01_SmplR.$pack_xfr_base_unit_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$loc_cd, InspActIF_Upd01_SmplR.$loc_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$str_ln_cd, InspActIF_Upd01_SmplR.$str_ln_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$quality_typ, InspActIF_Upd01_SmplR.$quality_typ);
			addColumnPathMap(InspAct_Chk01_SmplR.$stk_insp_typ, InspActIF_Upd01_SmplR.$stk_insp_typ);
			addColumnPathMap(InspAct_Chk01_SmplR.$stk_id_typ, InspActIF_Upd01_SmplR.$stk_id_typ);
			addColumnPathMap(InspAct_Chk01_SmplR.$stk_bp_cd, InspActIF_Upd01_SmplR.$stk_bp_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$gd_cd, InspActIF_Upd01_SmplR.$gd_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$stk_arrv_bp_cd, InspActIF_Upd01_SmplR.$stk_arrv_bp_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$lot_no, InspActIF_Upd01_SmplR.$lot_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$sublot_no, InspActIF_Upd01_SmplR.$sublot_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$sno1, InspActIF_Upd01_SmplR.$sno1);
			addColumnPathMap(InspAct_Chk01_SmplR.$sno2, InspActIF_Upd01_SmplR.$sno2);
			addColumnPathMap(InspAct_Chk01_SmplR.$sno3, InspActIF_Upd01_SmplR.$sno3);
			addColumnPathMap(InspAct_Chk01_SmplR.$sno4, InspActIF_Upd01_SmplR.$sno4);
			addColumnPathMap(InspAct_Chk01_SmplR.$fix_no_typ, InspActIF_Upd01_SmplR.$fix_no_typ);
			addColumnPathMap(InspAct_Chk01_SmplR.$fix_no, InspActIF_Upd01_SmplR.$fix_no);
			addColumnPathMap(InspAct_Chk01_SmplR.$ac_dt, InspActIF_Upd01_SmplR.$ac_dt);
			addColumnPathMap(InspAct_Chk01_SmplR.$can_ac_dt, InspActIF_Upd01_SmplR.$can_ac_dt);
			addColumnPathMap(InspAct_Chk01_SmplR.$bd_dpt_cd, InspActIF_Upd01_SmplR.$bd_dpt_cd);
			addColumnPathMap(InspAct_Chk01_SmplR.$trd_rmrks, InspActIF_Upd01_SmplR.$trd_rmrks);
			addColumnPathMap(InspAct_Chk01_SmplR.$intr_rmrks, InspActIF_Upd01_SmplR.$intr_rmrks);
			addColumnPathMap(InspAct_Chk01_SmplR.$sub_char1, InspActIF_Upd01_SmplR.$sub_char1);
			addColumnPathMap(InspAct_Chk01_SmplR.$sub_char2, InspActIF_Upd01_SmplR.$sub_char2);
			addColumnPathMap(InspAct_Chk01_SmplR.$sub_char3, InspActIF_Upd01_SmplR.$sub_char3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.act_tm(nvl(src.act_hm(), src.act_dt()));
		}
	}

	protected Map_InspAct_Upd01_HdrR_InspActIF_Upd01_HdrR<InspAct_Upd01_HdrR,InspActIF_Upd01_HdrR> createMap_InspAct_Upd01_HdrR_InspActIF_Upd01_HdrR() {
		return new Map_InspAct_Upd01_HdrR_InspActIF_Upd01_HdrR<InspAct_Upd01_HdrR, InspActIF_Upd01_HdrR>();
	}

	public class Map_InspAct_Upd01_HdrR_InspActIF_Upd01_HdrR<D extends InspAct_Upd01_HdrR, S extends InspActIF_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Upd01_HdrR.$peg_no, InspActIF_Upd01_HdrR.$peg_no);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_no, InspActIF_Upd01_HdrR.$insp_no);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_act_no, InspActIF_Upd01_HdrR.$insp_act_no);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_freq, InspActIF_Upd01_HdrR.$insp_freq);
			addColumnPathMap(InspAct_Upd01_HdrR.$src_no1, InspActIF_Upd01_HdrR.$src_no1);
			addColumnPathMap(InspAct_Upd01_HdrR.$src_no2, InspActIF_Upd01_HdrR.$src_no2);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_typ, InspActIF_Upd01_HdrR.$insp_typ);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_mtd_typ, InspActIF_Upd01_HdrR.$insp_mtd_typ);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_sts_typ, InspActIF_Upd01_HdrR.$insp_sts_typ);
			addColumnPathMap(InspAct_Upd01_HdrR.$insp_aprv_sts_typ, InspActIF_Upd01_HdrR.$insp_aprv_sts_typ);
			addColumnPathMap(InspAct_Upd01_HdrR.$itm_cd, InspActIF_Upd01_HdrR.$itm_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub1, InspActIF_Upd01_HdrR.$itm_sub1);
			addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub2, InspActIF_Upd01_HdrR.$itm_sub2);
			addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub3, InspActIF_Upd01_HdrR.$itm_sub3);
			addColumnPathMap(InspAct_Upd01_HdrR.$lot_no, InspActIF_Upd01_HdrR.$lot_no);
			addColumnPathMap(InspAct_Upd01_HdrR.$sublot_no, InspActIF_Upd01_HdrR.$sublot_no);
			addColumnPathMap(InspAct_Upd01_HdrR.$ver_no, InspActIF_Upd01_HdrR.$ver_no);
			addColumnPathMap(InspAct_Upd01_HdrR.$quality_typ, InspActIF_Upd01_HdrR.$quality_typ);
			addColumnPathMap(InspAct_Upd01_HdrR.$gd_cd, InspActIF_Upd01_HdrR.$gd_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$dfct_rsn_cd, InspActIF_Upd01_HdrR.$dfct_rsn_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$sppl_cd, InspActIF_Upd01_HdrR.$sppl_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$maker_cd, InspActIF_Upd01_HdrR.$maker_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$mfg_loc_cd, InspActIF_Upd01_HdrR.$mfg_loc_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$from_site_cd, InspActIF_Upd01_HdrR.$from_site_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_qty, InspActIF_Upd01_HdrR.$base_unit_qty);
			addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_cd, InspActIF_Upd01_HdrR.$base_unit_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$ttl_stk_qty, InspActIF_Upd01_HdrR.$ttl_stk_qty);
			addColumnPathMap(InspAct_Upd01_HdrR.$act_usr_cd, InspActIF_Upd01_HdrR.$act_usr_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$act_dpt_cd, InspActIF_Upd01_HdrR.$act_dpt_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm_typ, InspActIF_Upd01_HdrR.$lmt_dt_frm_typ);
			addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm, InspActIF_Upd01_HdrR.$lmt_dt_frm);
			addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt, InspActIF_Upd01_HdrR.$vld_dt);
			addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt, InspActIF_Upd01_HdrR.$lmt_dt);
			addColumnPathMap(InspAct_Upd01_HdrR.$act_cont_fctr, InspActIF_Upd01_HdrR.$act_cont_fctr);
			addColumnPathMap(InspAct_Upd01_HdrR.$intr_rmrks, InspActIF_Upd01_HdrR.$intr_rmrks);
			addColumnPathMap(InspAct_Upd01_HdrR.$lot_rmrks, InspActIF_Upd01_HdrR.$lot_rmrks);
			addColumnPathMap(InspAct_Upd01_HdrR.$sub_char1, InspActIF_Upd01_HdrR.$sub_char1);
			addColumnPathMap(InspAct_Upd01_HdrR.$sub_char2, InspActIF_Upd01_HdrR.$sub_char2);
			addColumnPathMap(InspAct_Upd01_HdrR.$sub_char3, InspActIF_Upd01_HdrR.$sub_char3);
			addColumnPathMap(InspAct_Upd01_HdrR.$stt_can_ac_dt, InspActIF_Upd01_HdrR.$stt_can_ac_dt);
			addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt_upd_flg, InspActIF_Upd01_HdrR.$vld_dt_upd_flg);
			addColumnPathMap(InspAct_Upd01_HdrR.$lims_flg, InspActIF_Upd01_HdrR.$lims_flg);
			addColumnPathMap(InspAct_Upd01_HdrR.$ext_sys_cd, InspActIF_Upd01_HdrR.$ext_sys_cd);
			addColumnPathMap(InspAct_Upd01_HdrR.$ext_insp_act_no, InspActIF_Upd01_HdrR.$ext_insp_act_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.st_tm(nvl(src.st_hm(), src.st_dt()));
			dest.end_tm(nvl(src.end_hm(), src.end_dt()));
		}
	}

	protected Map_InspAct_Upd01_DtlR_InspActIF_Upd01_DtlR<InspAct_Upd01_DtlR,InspActIF_Upd01_DtlR> createMap_InspAct_Upd01_DtlR_InspActIF_Upd01_DtlR() {
		return new Map_InspAct_Upd01_DtlR_InspActIF_Upd01_DtlR<InspAct_Upd01_DtlR, InspActIF_Upd01_DtlR>();
	}

	public class Map_InspAct_Upd01_DtlR_InspActIF_Upd01_DtlR<D extends InspAct_Upd01_DtlR, S extends InspActIF_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Upd01_DtlR.$peg_no, InspActIF_Upd01_DtlR.$peg_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$insp_no, InspActIF_Upd01_DtlR.$insp_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$data_crud_typ, InspActIF_Upd01_DtlR.$data_crud_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_d_no, InspActIF_Upd01_DtlR.$insp_act_d_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_no, InspActIF_Upd01_DtlR.$insp_act_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$itm_cd, InspActIF_Upd01_DtlR.$itm_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub1, InspActIF_Upd01_DtlR.$itm_sub1);
			addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub2, InspActIF_Upd01_DtlR.$itm_sub2);
			addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub3, InspActIF_Upd01_DtlR.$itm_sub3);
			addColumnPathMap(InspAct_Upd01_DtlR.$loc_cd, InspActIF_Upd01_DtlR.$loc_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$str_ln_cd, InspActIF_Upd01_DtlR.$str_ln_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$quality_typ, InspActIF_Upd01_DtlR.$quality_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$stk_insp_typ, InspActIF_Upd01_DtlR.$stk_insp_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$stk_id_typ, InspActIF_Upd01_DtlR.$stk_id_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$stk_bp_cd, InspActIF_Upd01_DtlR.$stk_bp_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$gd_cd, InspActIF_Upd01_DtlR.$gd_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$stk_arrv_bp_cd, InspActIF_Upd01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$lot_no, InspActIF_Upd01_DtlR.$lot_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$sublot_no, InspActIF_Upd01_DtlR.$sublot_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno1, InspActIF_Upd01_DtlR.$sno1);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno1_mng_typ, InspActIF_Upd01_DtlR.$sno1_mng_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno2, InspActIF_Upd01_DtlR.$sno2);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno2_mng_typ, InspActIF_Upd01_DtlR.$sno2_mng_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno3, InspActIF_Upd01_DtlR.$sno3);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno3_mng_typ, InspActIF_Upd01_DtlR.$sno3_mng_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno4, InspActIF_Upd01_DtlR.$sno4);
			addColumnPathMap(InspAct_Upd01_DtlR.$sno4_mng_typ, InspActIF_Upd01_DtlR.$sno4_mng_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$fix_no_typ, InspActIF_Upd01_DtlR.$fix_no_typ);
			addColumnPathMap(InspAct_Upd01_DtlR.$fix_no, InspActIF_Upd01_DtlR.$fix_no);
			addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_qty, InspActIF_Upd01_DtlR.$pack_unit_qty);
			addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_cd, InspActIF_Upd01_DtlR.$pack_unit_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_qty, InspActIF_Upd01_DtlR.$base_unit_qty);
			addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_cd, InspActIF_Upd01_DtlR.$base_unit_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_qty, InspActIF_Upd01_DtlR.$pack_xfr_pack_unit_qty);
			addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_cd, InspActIF_Upd01_DtlR.$pack_xfr_pack_unit_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_qty, InspActIF_Upd01_DtlR.$pack_xfr_base_unit_qty);
			addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_cd, InspActIF_Upd01_DtlR.$pack_xfr_base_unit_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$dfct_rsn_cd, InspActIF_Upd01_DtlR.$dfct_rsn_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$ac_dt, InspActIF_Upd01_DtlR.$ac_dt);
			addColumnPathMap(InspAct_Upd01_DtlR.$can_ac_dt, InspActIF_Upd01_DtlR.$can_ac_dt);
			addColumnPathMap(InspAct_Upd01_DtlR.$intr_rmrks, InspActIF_Upd01_DtlR.$intr_rmrks);
			addColumnPathMap(InspAct_Upd01_DtlR.$sub_char1, InspActIF_Upd01_DtlR.$sub_char1);
			addColumnPathMap(InspAct_Upd01_DtlR.$sub_char2, InspActIF_Upd01_DtlR.$sub_char2);
			addColumnPathMap(InspAct_Upd01_DtlR.$sub_char3, InspActIF_Upd01_DtlR.$sub_char3);
			addColumnPathMap(InspAct_Upd01_DtlR.$rmrks_upd_flg, InspActIF_Upd01_DtlR.$rmrks_upd_flg);
			addColumnPathMap(InspAct_Upd01_DtlR.$lims_flg, InspActIF_Upd01_DtlR.$lims_flg);
			addColumnPathMap(InspAct_Upd01_DtlR.$ext_sys_cd, InspActIF_Upd01_DtlR.$ext_sys_cd);
			addColumnPathMap(InspAct_Upd01_DtlR.$ext_insp_act_d_no, InspActIF_Upd01_DtlR.$ext_insp_act_d_no);

		}
	}

	protected Map_InspAct_Upd01_SmplR_InspActIF_Upd01_SmplR<InspAct_Upd01_SmplR,InspActIF_Upd01_SmplR> createMap_InspAct_Upd01_SmplR_InspActIF_Upd01_SmplR() {
		return new Map_InspAct_Upd01_SmplR_InspActIF_Upd01_SmplR<InspAct_Upd01_SmplR, InspActIF_Upd01_SmplR>();
	}

	public class Map_InspAct_Upd01_SmplR_InspActIF_Upd01_SmplR<D extends InspAct_Upd01_SmplR, S extends InspActIF_Upd01_SmplR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Upd01_SmplR.$peg_no, InspActIF_Upd01_SmplR.$peg_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$insp_no, InspActIF_Upd01_SmplR.$insp_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$data_crud_typ, InspActIF_Upd01_SmplR.$data_crud_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$can_ac_dt, InspActIF_Upd01_SmplR.$can_ac_dt);
			addColumnPathMap(InspAct_Upd01_SmplR.$insp_smpl_act_no, InspActIF_Upd01_SmplR.$insp_smpl_act_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$insp_act_no, InspActIF_Upd01_SmplR.$insp_act_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$insp_schd_no, InspActIF_Upd01_SmplR.$insp_schd_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$itm_cd, InspActIF_Upd01_SmplR.$itm_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub1, InspActIF_Upd01_SmplR.$itm_sub1);
			addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub2, InspActIF_Upd01_SmplR.$itm_sub2);
			addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub3, InspActIF_Upd01_SmplR.$itm_sub3);
			addColumnPathMap(InspAct_Upd01_SmplR.$so_qty, InspActIF_Upd01_SmplR.$so_qty);
			addColumnPathMap(InspAct_Upd01_SmplR.$smpl_qty, InspActIF_Upd01_SmplR.$smpl_qty);
			addColumnPathMap(InspAct_Upd01_SmplR.$base_unit_cd, InspActIF_Upd01_SmplR.$base_unit_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_qty, InspActIF_Upd01_SmplR.$pack_xfr_pack_unit_qty);
			addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_cd, InspActIF_Upd01_SmplR.$pack_xfr_pack_unit_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_qty, InspActIF_Upd01_SmplR.$pack_xfr_base_unit_qty);
			addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_cd, InspActIF_Upd01_SmplR.$pack_xfr_base_unit_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$loc_cd, InspActIF_Upd01_SmplR.$loc_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$str_ln_cd, InspActIF_Upd01_SmplR.$str_ln_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$stk_arrv_bp_cd, InspActIF_Upd01_SmplR.$stk_arrv_bp_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$gd_cd, InspActIF_Upd01_SmplR.$gd_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$quality_typ, InspActIF_Upd01_SmplR.$quality_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$stk_insp_typ, InspActIF_Upd01_SmplR.$stk_insp_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$stk_id_typ, InspActIF_Upd01_SmplR.$stk_id_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$stk_bp_cd, InspActIF_Upd01_SmplR.$stk_bp_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$lot_no, InspActIF_Upd01_SmplR.$lot_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$sublot_no, InspActIF_Upd01_SmplR.$sublot_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno1, InspActIF_Upd01_SmplR.$sno1);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno1_mng_typ, InspActIF_Upd01_SmplR.$sno1_mng_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno2, InspActIF_Upd01_SmplR.$sno2);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno2_mng_typ, InspActIF_Upd01_SmplR.$sno2_mng_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno3, InspActIF_Upd01_SmplR.$sno3);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno3_mng_typ, InspActIF_Upd01_SmplR.$sno3_mng_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno4, InspActIF_Upd01_SmplR.$sno4);
			addColumnPathMap(InspAct_Upd01_SmplR.$sno4_mng_typ, InspActIF_Upd01_SmplR.$sno4_mng_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$fix_no_typ, InspActIF_Upd01_SmplR.$fix_no_typ);
			addColumnPathMap(InspAct_Upd01_SmplR.$fix_no, InspActIF_Upd01_SmplR.$fix_no);
			addColumnPathMap(InspAct_Upd01_SmplR.$ac_dt, InspActIF_Upd01_SmplR.$ac_dt);
			addColumnPathMap(InspAct_Upd01_SmplR.$bd_dpt_cd, InspActIF_Upd01_SmplR.$bd_dpt_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$so_cmpl_flg, InspActIF_Upd01_SmplR.$so_cmpl_flg);
			addColumnPathMap(InspAct_Upd01_SmplR.$trd_rmrks, InspActIF_Upd01_SmplR.$trd_rmrks);
			addColumnPathMap(InspAct_Upd01_SmplR.$intr_rmrks, InspActIF_Upd01_SmplR.$intr_rmrks);
			addColumnPathMap(InspAct_Upd01_SmplR.$sub_char1, InspActIF_Upd01_SmplR.$sub_char1);
			addColumnPathMap(InspAct_Upd01_SmplR.$sub_char2, InspActIF_Upd01_SmplR.$sub_char2);
			addColumnPathMap(InspAct_Upd01_SmplR.$sub_char3, InspActIF_Upd01_SmplR.$sub_char3);
			addColumnPathMap(InspAct_Upd01_SmplR.$rmrks_upd_flg, InspActIF_Upd01_SmplR.$rmrks_upd_flg);
			addColumnPathMap(InspAct_Upd01_SmplR.$lims_flg, InspActIF_Upd01_SmplR.$lims_flg);
			addColumnPathMap(InspAct_Upd01_SmplR.$ext_sys_cd, InspActIF_Upd01_SmplR.$ext_sys_cd);
			addColumnPathMap(InspAct_Upd01_SmplR.$ext_insp_smpl_act_no, InspActIF_Upd01_SmplR.$ext_insp_smpl_act_no);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.act_tm(nvl(src.act_hm(), src.act_dt()));
		}
	}

	protected Map_InspAct_Chk02_HdrR_InspActIF_Upd02_HdrR<InspAct_Chk02_HdrR,InspActIF_Upd02_HdrR> createMap_InspAct_Chk02_HdrR_InspActIF_Upd02_HdrR() {
		return new Map_InspAct_Chk02_HdrR_InspActIF_Upd02_HdrR<InspAct_Chk02_HdrR, InspActIF_Upd02_HdrR>();
	}

	public class Map_InspAct_Chk02_HdrR_InspActIF_Upd02_HdrR<D extends InspAct_Chk02_HdrR, S extends InspActIF_Upd02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Chk02_HdrR.$peg_no, InspActIF_Upd02_HdrR.$peg_no);
			addColumnPathMap(InspAct_Chk02_HdrR.$err_flg, InspActIF_Upd02_HdrR.$err_flg);
			addColumnPathMap(InspAct_Chk02_HdrR.$insp_no, InspActIF_Upd02_HdrR.$insp_no);
			addColumnPathMap(InspAct_Chk02_HdrR.$insp_act_no, InspActIF_Upd02_HdrR.$insp_act_no);
			addColumnPathMap(InspAct_Chk02_HdrR.$insp_typ, InspActIF_Upd02_HdrR.$insp_typ);
			addColumnPathMap(InspAct_Chk02_HdrR.$insp_sts_typ, InspActIF_Upd02_HdrR.$insp_sts_typ);
			addColumnPathMap(InspAct_Chk02_HdrR.$insp_aprv_sts_typ, InspActIF_Upd02_HdrR.$insp_aprv_sts_typ);
			addColumnPathMap(InspAct_Chk02_HdrR.$itm_cd, InspActIF_Upd02_HdrR.$itm_cd);
			addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub1, InspActIF_Upd02_HdrR.$itm_sub1);
			addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub2, InspActIF_Upd02_HdrR.$itm_sub2);
			addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub3, InspActIF_Upd02_HdrR.$itm_sub3);
			addColumnPathMap(InspAct_Chk02_HdrR.$lot_no, InspActIF_Upd02_HdrR.$lot_no);
			addColumnPathMap(InspAct_Chk02_HdrR.$sublot_no, InspActIF_Upd02_HdrR.$sublot_no);
			addColumnPathMap(InspAct_Chk02_HdrR.$ver_no, InspActIF_Upd02_HdrR.$ver_no);
			addColumnPathMap(InspAct_Chk02_HdrR.$judg_dt, InspActIF_Upd02_HdrR.$judg_dt);
			addColumnPathMap(InspAct_Chk02_HdrR.$insp_judg_rslt_typ, InspActIF_Upd02_HdrR.$insp_judg_rslt_typ);
			addColumnPathMap(InspAct_Chk02_HdrR.$judg_dpt_cd, InspActIF_Upd02_HdrR.$judg_dpt_cd);
			addColumnPathMap(InspAct_Chk02_HdrR.$judg_usr_cd, InspActIF_Upd02_HdrR.$judg_usr_cd);
			addColumnPathMap(InspAct_Chk02_HdrR.$judg_rsn, InspActIF_Upd02_HdrR.$judg_rsn);
			addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt_frm_typ, InspActIF_Upd02_HdrR.$lmt_dt_frm_typ);
			addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt_frm, InspActIF_Upd02_HdrR.$lmt_dt_frm);
			addColumnPathMap(InspAct_Chk02_HdrR.$vld_dt, InspActIF_Upd02_HdrR.$vld_dt);
			addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt, InspActIF_Upd02_HdrR.$lmt_dt);
			addColumnPathMap(InspAct_Chk02_HdrR.$intr_rmrks, InspActIF_Upd02_HdrR.$intr_rmrks);
			addColumnPathMap(InspAct_Chk02_HdrR.$lot_rmrks, InspActIF_Upd02_HdrR.$lot_rmrks);
			addColumnPathMap(InspAct_Chk02_HdrR.$sub_char1, InspActIF_Upd02_HdrR.$sub_char1);
			addColumnPathMap(InspAct_Chk02_HdrR.$sub_char2, InspActIF_Upd02_HdrR.$sub_char2);
			addColumnPathMap(InspAct_Chk02_HdrR.$sub_char3, InspActIF_Upd02_HdrR.$sub_char3);

		}
	}
	
	protected Map_InspAct_Chk02_DtlR_InspActIF_Upd02_DtlR<InspAct_Chk02_DtlR,InspActIF_Upd02_DtlR> createMap_InspAct_Chk02_DtlR_InspActIF_Upd02_DtlR() {
		return new Map_InspAct_Chk02_DtlR_InspActIF_Upd02_DtlR<InspAct_Chk02_DtlR, InspActIF_Upd02_DtlR>();
	}

	public class Map_InspAct_Chk02_DtlR_InspActIF_Upd02_DtlR<D extends InspAct_Chk02_DtlR, S extends InspActIF_Upd02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Chk02_DtlR.$peg_no, InspActIF_Upd02_DtlR.$peg_no);
			addColumnPathMap(InspAct_Chk02_DtlR.$err_flg, InspActIF_Upd02_DtlR.$err_flg);
			addColumnPathMap(InspAct_Chk02_DtlR.$data_crud_typ, InspActIF_Upd02_DtlR.$data_crud_typ);
			addColumnPathMap(InspAct_Chk02_DtlR.$insp_no, InspActIF_Upd02_DtlR.$insp_no);
			addColumnPathMap(InspAct_Chk02_DtlR.$insp_act_no, InspActIF_Upd02_DtlR.$insp_act_no);
			addColumnPathMap(InspAct_Chk02_DtlR.$itm_cd, InspActIF_Upd02_DtlR.$itm_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub1, InspActIF_Upd02_DtlR.$itm_sub1);
			addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub2, InspActIF_Upd02_DtlR.$itm_sub2);
			addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub3, InspActIF_Upd02_DtlR.$itm_sub3);
			addColumnPathMap(InspAct_Chk02_DtlR.$loc_cd, InspActIF_Upd02_DtlR.$loc_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$str_ln_cd, InspActIF_Upd02_DtlR.$str_ln_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$quality_typ, InspActIF_Upd02_DtlR.$quality_typ);
			addColumnPathMap(InspAct_Chk02_DtlR.$stk_insp_typ, InspActIF_Upd02_DtlR.$stk_insp_typ);
			addColumnPathMap(InspAct_Chk02_DtlR.$stk_id_typ, InspActIF_Upd02_DtlR.$stk_id_typ);
			addColumnPathMap(InspAct_Chk02_DtlR.$stk_bp_cd, InspActIF_Upd02_DtlR.$stk_bp_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$gd_cd, InspActIF_Upd02_DtlR.$gd_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$stk_arrv_bp_cd, InspActIF_Upd02_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$lot_no, InspActIF_Upd02_DtlR.$lot_no);
			addColumnPathMap(InspAct_Chk02_DtlR.$sublot_no, InspActIF_Upd02_DtlR.$sublot_no);
			addColumnPathMap(InspAct_Chk02_DtlR.$sno1, InspActIF_Upd02_DtlR.$sno1);
			addColumnPathMap(InspAct_Chk02_DtlR.$sno2, InspActIF_Upd02_DtlR.$sno2);
			addColumnPathMap(InspAct_Chk02_DtlR.$sno3, InspActIF_Upd02_DtlR.$sno3);
			addColumnPathMap(InspAct_Chk02_DtlR.$sno4, InspActIF_Upd02_DtlR.$sno4);
			addColumnPathMap(InspAct_Chk02_DtlR.$fix_no_typ, InspActIF_Upd02_DtlR.$fix_no_typ);
			addColumnPathMap(InspAct_Chk02_DtlR.$fix_no, InspActIF_Upd02_DtlR.$fix_no);
			addColumnPathMap(InspAct_Chk02_DtlR.$pack_unit_qty, InspActIF_Upd02_DtlR.$pack_unit_qty);
			addColumnPathMap(InspAct_Chk02_DtlR.$pack_unit_cd, InspActIF_Upd02_DtlR.$pack_unit_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$base_unit_qty, InspActIF_Upd02_DtlR.$base_unit_qty);
			addColumnPathMap(InspAct_Chk02_DtlR.$base_unit_cd, InspActIF_Upd02_DtlR.$base_unit_cd);
			addColumnPathMap(InspAct_Chk02_DtlR.$ac_dt, InspActIF_Upd02_DtlR.$ac_dt);
			addColumnPathMap(InspAct_Chk02_DtlR.$intr_rmrks, InspActIF_Upd02_DtlR.$intr_rmrks);
			addColumnPathMap(InspAct_Chk02_DtlR.$sub_char1, InspActIF_Upd02_DtlR.$sub_char1);
			addColumnPathMap(InspAct_Chk02_DtlR.$sub_char2, InspActIF_Upd02_DtlR.$sub_char2);
			addColumnPathMap(InspAct_Chk02_DtlR.$sub_char3, InspActIF_Upd02_DtlR.$sub_char3);

		}
	}
	
	protected Map_InspAct_Upd02_HdrR_InspActIF_Upd02_HdrR<InspAct_Upd02_HdrR,InspActIF_Upd02_HdrR> createMap_InspAct_Upd02_HdrR_InspActIF_Upd02_HdrR() {
		return new Map_InspAct_Upd02_HdrR_InspActIF_Upd02_HdrR<InspAct_Upd02_HdrR, InspActIF_Upd02_HdrR>();
	}

	public class Map_InspAct_Upd02_HdrR_InspActIF_Upd02_HdrR<D extends InspAct_Upd02_HdrR, S extends InspActIF_Upd02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Upd02_HdrR.$peg_no, InspActIF_Upd02_HdrR.$peg_no);
			addColumnPathMap(InspAct_Upd02_HdrR.$insp_no, InspActIF_Upd02_HdrR.$insp_no);
			addColumnPathMap(InspAct_Upd02_HdrR.$insp_act_no, InspActIF_Upd02_HdrR.$insp_act_no);
			addColumnPathMap(InspAct_Upd02_HdrR.$insp_typ, InspActIF_Upd02_HdrR.$insp_typ);
			addColumnPathMap(InspAct_Upd02_HdrR.$insp_sts_typ, InspActIF_Upd02_HdrR.$insp_sts_typ);
			addColumnPathMap(InspAct_Upd02_HdrR.$insp_aprv_sts_typ, InspActIF_Upd02_HdrR.$insp_aprv_sts_typ);
			addColumnPathMap(InspAct_Upd02_HdrR.$itm_cd, InspActIF_Upd02_HdrR.$itm_cd);
			addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub1, InspActIF_Upd02_HdrR.$itm_sub1);
			addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub2, InspActIF_Upd02_HdrR.$itm_sub2);
			addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub3, InspActIF_Upd02_HdrR.$itm_sub3);
			addColumnPathMap(InspAct_Upd02_HdrR.$lot_no, InspActIF_Upd02_HdrR.$lot_no);
			addColumnPathMap(InspAct_Upd02_HdrR.$sublot_no, InspActIF_Upd02_HdrR.$sublot_no);
			addColumnPathMap(InspAct_Upd02_HdrR.$ver_no, InspActIF_Upd02_HdrR.$ver_no);
			addColumnPathMap(InspAct_Upd02_HdrR.$judg_dt, InspActIF_Upd02_HdrR.$judg_dt);
			addColumnPathMap(InspAct_Upd02_HdrR.$insp_judg_rslt_typ, InspActIF_Upd02_HdrR.$insp_judg_rslt_typ);
			addColumnPathMap(InspAct_Upd02_HdrR.$judg_dpt_cd, InspActIF_Upd02_HdrR.$judg_dpt_cd);
			addColumnPathMap(InspAct_Upd02_HdrR.$judg_usr_cd, InspActIF_Upd02_HdrR.$judg_usr_cd);
			addColumnPathMap(InspAct_Upd02_HdrR.$judg_rsn, InspActIF_Upd02_HdrR.$judg_rsn);
			addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt_frm_typ, InspActIF_Upd02_HdrR.$lmt_dt_frm_typ);
			addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt_frm, InspActIF_Upd02_HdrR.$lmt_dt_frm);
			addColumnPathMap(InspAct_Upd02_HdrR.$vld_dt, InspActIF_Upd02_HdrR.$vld_dt);
			addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt, InspActIF_Upd02_HdrR.$lmt_dt);
			addColumnPathMap(InspAct_Upd02_HdrR.$intr_rmrks, InspActIF_Upd02_HdrR.$intr_rmrks);
			addColumnPathMap(InspAct_Upd02_HdrR.$lot_rmrks, InspActIF_Upd02_HdrR.$lot_rmrks);
			addColumnPathMap(InspAct_Upd02_HdrR.$sub_char1, InspActIF_Upd02_HdrR.$sub_char1);
			addColumnPathMap(InspAct_Upd02_HdrR.$sub_char2, InspActIF_Upd02_HdrR.$sub_char2);
			addColumnPathMap(InspAct_Upd02_HdrR.$sub_char3, InspActIF_Upd02_HdrR.$sub_char3);

		}
	}
	
	protected Map_InspAct_Upd02_DtlR_InspActIF_Upd02_DtlR<InspAct_Upd02_DtlR,InspActIF_Upd02_DtlR> createMap_InspAct_Upd02_DtlR_InspActIF_Upd02_DtlR() {
		return new Map_InspAct_Upd02_DtlR_InspActIF_Upd02_DtlR<InspAct_Upd02_DtlR, InspActIF_Upd02_DtlR>();
	}

	public class Map_InspAct_Upd02_DtlR_InspActIF_Upd02_DtlR<D extends InspAct_Upd02_DtlR, S extends InspActIF_Upd02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspAct_Upd02_DtlR.$peg_no, InspActIF_Upd02_DtlR.$peg_no);
			addColumnPathMap(InspAct_Upd02_DtlR.$data_crud_typ, InspActIF_Upd02_DtlR.$data_crud_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$insp_no, InspActIF_Upd02_DtlR.$insp_no);
			addColumnPathMap(InspAct_Upd02_DtlR.$insp_act_no, InspActIF_Upd02_DtlR.$insp_act_no);
			addColumnPathMap(InspAct_Upd02_DtlR.$itm_cd, InspActIF_Upd02_DtlR.$itm_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub1, InspActIF_Upd02_DtlR.$itm_sub1);
			addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub2, InspActIF_Upd02_DtlR.$itm_sub2);
			addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub3, InspActIF_Upd02_DtlR.$itm_sub3);
			addColumnPathMap(InspAct_Upd02_DtlR.$loc_cd, InspActIF_Upd02_DtlR.$loc_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$str_ln_cd, InspActIF_Upd02_DtlR.$str_ln_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$quality_typ, InspActIF_Upd02_DtlR.$quality_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$stk_insp_typ, InspActIF_Upd02_DtlR.$stk_insp_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$stk_id_typ, InspActIF_Upd02_DtlR.$stk_id_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$stk_bp_cd, InspActIF_Upd02_DtlR.$stk_bp_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$gd_cd, InspActIF_Upd02_DtlR.$gd_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$stk_arrv_bp_cd, InspActIF_Upd02_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$lot_no, InspActIF_Upd02_DtlR.$lot_no);
			addColumnPathMap(InspAct_Upd02_DtlR.$sublot_no, InspActIF_Upd02_DtlR.$sublot_no);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno1, InspActIF_Upd02_DtlR.$sno1);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno1_mng_typ, InspActIF_Upd02_DtlR.$sno1_mng_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno2, InspActIF_Upd02_DtlR.$sno2);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno2_mng_typ, InspActIF_Upd02_DtlR.$sno2_mng_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno3, InspActIF_Upd02_DtlR.$sno3);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno3_mng_typ, InspActIF_Upd02_DtlR.$sno3_mng_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno4, InspActIF_Upd02_DtlR.$sno4);
			addColumnPathMap(InspAct_Upd02_DtlR.$sno4_mng_typ, InspActIF_Upd02_DtlR.$sno4_mng_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$fix_no_typ, InspActIF_Upd02_DtlR.$fix_no_typ);
			addColumnPathMap(InspAct_Upd02_DtlR.$fix_no, InspActIF_Upd02_DtlR.$fix_no);
			addColumnPathMap(InspAct_Upd02_DtlR.$pack_unit_qty, InspActIF_Upd02_DtlR.$pack_unit_qty);
			addColumnPathMap(InspAct_Upd02_DtlR.$pack_unit_cd, InspActIF_Upd02_DtlR.$pack_unit_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$base_unit_qty, InspActIF_Upd02_DtlR.$base_unit_qty);
			addColumnPathMap(InspAct_Upd02_DtlR.$base_unit_cd, InspActIF_Upd02_DtlR.$base_unit_cd);
			addColumnPathMap(InspAct_Upd02_DtlR.$ac_dt, InspActIF_Upd02_DtlR.$ac_dt);
			addColumnPathMap(InspAct_Upd02_DtlR.$intr_rmrks, InspActIF_Upd02_DtlR.$intr_rmrks);
			addColumnPathMap(InspAct_Upd02_DtlR.$sub_char1, InspActIF_Upd02_DtlR.$sub_char1);
			addColumnPathMap(InspAct_Upd02_DtlR.$sub_char2, InspActIF_Upd02_DtlR.$sub_char2);
			addColumnPathMap(InspAct_Upd02_DtlR.$sub_char3, InspActIF_Upd02_DtlR.$sub_char3);
			addColumnPathMap(InspAct_Upd02_DtlR.$insp_judg_d_no, InspActIF_Upd02_DtlR.$insp_judg_d_no);

		}
	}

	//FMCB CUSTOM END
}