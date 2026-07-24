package mcframe.serverMSBF.MSBFL5050;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBF.MSBFL5100.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMAUC.MAUCL5010.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSUC.MSUCL0020.*;
import java.util.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspActService_MC extends MSBFL_InspActService_MC_A{
	//FMCB CUSTOM START
	/**
	 * InspAct_Chk01オペレーション.<p>
	 *
	 * 検査実績の登録・訂正前にチェックを行う。<br>
	 */
	public class InspAct_Chk01 extends MSBFL_InspActService_MC_A.InspAct_Chk01 {
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCList<MST_INSP_INST_R> _instL = MCList.create(MST_INSP_INST_R.class);
		protected MST_INSP_INST_R _instL_t = MST_INSP_INST_R.create("T");
		protected MCQueryApiBuilder _instL_bldr = MCQueryApiBuilder.create(_instL_t);
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MST_INSP_ACT_R _actL_t = MST_INSP_ACT_R.create("T");
		protected MCQueryApiBuilder _actL_bldr = MCQueryApiBuilder.create(_actL_t);
		protected MCList<MST_INSP_ACT_D_R> _actDL = MCList.create(MST_INSP_ACT_D_R.class);
		protected MST_INSP_ACT_D_R _actDL_t = MST_INSP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(_actDL_t);
		protected MCList<MST_INSP_SMPL_ACT_R> _smplActL = MCList.create(MST_INSP_SMPL_ACT_R.class);
		protected MST_INSP_SMPL_ACT_R _smplActL_t = MST_INSP_SMPL_ACT_R.create("T");
		protected MCQueryApiBuilder _smplActL_bldr = MCQueryApiBuilder.create(_smplActL_t);
		protected MCList<MST_STK_R> _stkL = MCList.create(MST_STK_R.class);
		protected MST_STK_R _stkL_t = MST_STK_R.create("T");
		protected MCQueryApiBuilder _stkL_bldr = MCQueryApiBuilder.create(_stkL_t);
		protected MCIndexKey _stkIdxKey = null;
		protected MCList<MST_ITM_MFG_INST_R> _itmMfgInstPrdctL = MCList.create(MST_ITM_MFG_INST_R.class);
		protected MST_ITM_MFG_INST_R _itmMfgInstPrdctL_t = MST_ITM_MFG_INST_R.create("T");
		protected MCQueryApiBuilder _itmMfgInstPrdctL_bldr = MCQueryApiBuilder.create(_itmMfgInstPrdctL_t);
		protected MCList<MST_MFG_ACT_R> _mfgActPrdctL = MCList.create(MST_MFG_ACT_R.class);
		protected MST_MFG_ACT_R _mfgActPrdctL_t = MST_MFG_ACT_R.create("T");
		protected MCQueryApiBuilder _mfgActPrdctL_bldr = MCQueryApiBuilder.create(_mfgActPrdctL_t);
		
		protected MCIndexKey _schdIdxkey = null;
		protected MCIndexKey _itmMfgInstPrdctIdxkey = null;
		protected MCIndexKey _mfgActPrdctIdxkey = null;
		
		protected MCList<MST_PLNT_APRV_D_R> _plntAprvL = MCList.create(MST_PLNT_APRV_D_R.class);
		protected MST_PLNT_APRV_D_R _plntAprvL_t = MST_PLNT_APRV_D_R.create("T");
		protected MCQueryApiBuilder _plntAprvL_bldr = MCQueryApiBuilder.create(_plntAprvL_t);
		protected MCIndexKey _plntAprvIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<InspAct_Chk01_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callPlntAprvChk01(notErrL);
				callClChk03(notErrL);
				callThisChk03(notErrL);
			}
			
			setDown();
		}
		
		protected void setDown() {
			copyErrFlgByInspNo(up0(), up1(), InspAct_Chk01_HdrR.$insp_no, InspAct_Chk01_DtlR.$insp_no);
			copyErrFlgByInspNo(up0(), up2(), InspAct_Chk01_HdrR.$insp_no, InspAct_Chk01_SmplR.$insp_no);
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定、検査指図情報取得
			getInspL();
			getStdInspAct();
			getPlntAprvL();

			// 補完処理
			compData();

			return msgL;
		}

		protected void getPlntAprvL() {
			_plntAprvL_bldr.setWhere(_plntAprvL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_PLNT_APRV_D_S01", _plntAprvL, _plntAprvL_bldr, up0());
			_plntAprvIdxkey = _plntAprvL.createIndex(MST_INSP_SCHD_R.$insp_no);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 条件付チェック
			msgL.addAll(chkItmsWithCnd());

			// 検査実績登録対象チェック
			chkInspAct(msgL);

			return msgL;
		}

		/**
		 * 補完処理を行う。
		 */
		protected void compData() {
			MCIndexKey schdIdxkey = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			MCIndexKey instIdxkey = _instL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey dtlIdxkey = up1().createIndex(InspAct_Chk01_DtlR.$insp_no);
			MCIndexKey smplIdxkey = up2().createIndex(InspAct_Chk01_SmplR.$insp_no);
			
			for (InspAct_Chk01_HdrR hdrR : up0()) {

				MCList<MST_INSP_SCHD_R> schdSubL = _schdL.subList(schdIdxkey, hdrR.insp_no());
				MST_INSP_INST_R instR = _instL.getFirst(instIdxkey, hdrR.insp_no());
				MCList<InspAct_Chk01_DtlR> dtlL = up1().subList(dtlIdxkey, hdrR.insp_no());
				MCList<InspAct_Chk01_SmplR> smplL = up2().subList(smplIdxkey, hdrR.insp_no());

				// ヘッダの補完
				if (!isNull(instR)) {
					hdrR.aprv_dt(instR.aprv_dt());
					hdrR.std_req_flg(instR.std_req_flg());
					hdrR.std_cnf_req_flg(instR.std_cnf_req_flg());
					hdrR.insp_sts_typ_db(instR.insp_sts_typ());
				}
				// 実績明細の補完
				MCIndexKey idxkey = null;
				MCIndexKey idxkeyInspNo = null;
				if (MSC_INSP_TYP.isLOT(hdrR.insp_typ())) {
					idxkey = schdSubL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
				}
				else if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ()) || MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
					idxkey = schdSubL.createIndex(MST_INSP_SCHD_R.$src_no4);
					idxkeyInspNo = schdSubL.createIndex(MST_INSP_SCHD_R.$insp_no);
				}
				MCNumber baseQtySum = MCNumber.ZERO;
				
				for (InspAct_Chk01_DtlR dtlR : dtlL) {
					dtlR.itm_cd(hdrR.itm_cd());
					dtlR.itm_sub1(hdrR.itm_sub1());
					dtlR.itm_sub2(hdrR.itm_sub2());
					dtlR.itm_sub3(hdrR.itm_sub3());
					dtlR.lot_no(hdrR.lot_no());
					dtlR.base_unit_cd(hdrR.base_unit_cd());
					if (!isNull(dtlR.pack_xfr_pack_unit_cd())) {
						dtlR.pack_xfr_base_unit_cd(hdrR.base_unit_cd());
					}
					
					if (!MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
						// 上り電文として受け取るため、補完しない。
					}
					else {
						dtlR.st_tm(hdrR.st_tm().trunc(MCDateFieldType.DAY));
					}
					
					MST_INSP_SCHD_R schdR = schdSubL.getFirst(idxkey, dtlR.fix_no());
					
					if (!isNull(schdR)) {
						dtlR.sno1_mng_typ(schdR.sno1_mng_typ());
						dtlR.sno2_mng_typ(schdR.sno2_mng_typ());
						dtlR.sno3_mng_typ(schdR.sno3_mng_typ());
						dtlR.sno4_mng_typ(schdR.sno4_mng_typ());
						// サブロット管理区分：在庫のみの場合を考慮し、サブロットＮＯに関してはヘッダの値をそのまま引き継がない。
						dtlR.sublot_no(schdR.sublot_no());
					}
					
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						baseQtySum = baseQtySum.add(nvl(dtlR.base_unit_qty(), MCNumber.ZERO));
					}
				}

				hdrR.base_unit_qty(baseQtySum);

				// 抜取明細の補完
				for (InspAct_Chk01_SmplR smplR : smplL) {
					smplR.itm_cd(hdrR.itm_cd());
					smplR.itm_sub1(hdrR.itm_sub1());
					smplR.itm_sub2(hdrR.itm_sub2());
					smplR.itm_sub3(hdrR.itm_sub3());
					smplR.lot_no(hdrR.lot_no());
					smplR.base_unit_cd(hdrR.base_unit_cd());
					smplR.pack_xfr_base_unit_cd(hdrR.base_unit_cd());
					smplR.st_tm(hdrR.st_tm().trunc(MCDateFieldType.DAY));
					
					MST_INSP_SCHD_R schdR = null;
					if (!isNull(smplR.insp_schd_no())) {
						schdR = schdSubL.getFirst(InspAct_Chk01_SmplR.$insp_schd_no, smplR.insp_schd_no());
					}
					else {
						schdR = schdSubL.getFirst(idxkey, smplR.fix_no());
						if (isNull(schdR)) {
							schdR = schdSubL.getFirst(idxkeyInspNo, smplR.insp_no());
						}
					}
					if (!isNull(schdR)) {
						smplR.sno1_mng_typ(schdR.sno1_mng_typ());
						smplR.sno2_mng_typ(schdR.sno2_mng_typ());
						smplR.sno3_mng_typ(schdR.sno3_mng_typ());
						smplR.sno4_mng_typ(schdR.sno4_mng_typ());
						// サブロット管理区分：在庫のみの場合を考慮し、サブロットＮＯに関してはヘッダの値をそのまま引き継がない。
						smplR.sublot_no(schdR.sublot_no());
					}
				}
				
				// 備考、予備１～３のみ更新ＦＬＧを設定する
				setRmrksUpdFlg(hdrR, dtlL, smplL);
			}
		}

		/**
		 * 備考、予備１～３のみ更新ＦＬＧを設定する
		 */
		protected void setRmrksUpdFlg(InspAct_Chk01_HdrR hdrR, MCList<InspAct_Chk01_DtlR> dtlL, MCList<InspAct_Chk01_SmplR> smplL) {
			if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				MCIndexKey idxkey = _actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_d_no);
				for (InspAct_Chk01_DtlR dtlR : dtlL) {
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						MST_INSP_ACT_D_R actDR = _actDL.getFirst(idxkey, dtlR.insp_act_d_no());
						if (!isNull(actDR)) {
							if (isSame(dtlR.quality_typ(), actDR.quality_typ())
									&& isSame(dtlR.gd_cd(), actDR.gd_cd())
									&& isSame(dtlR.dfct_rsn_cd(), actDR.dfct_rsn_cd())
									&& isSame(dtlR.ac_dt(), actDR.ac_dt())
									&& isSame(dtlR.pack_unit_qty(), actDR.pack_unit_qty())
									&& (isNullAnd(dtlR.pack_xfr_pack_unit_qty(), actDR.pack_xfr_pack_unit_qty()) 
									|| (!isNullOr(dtlR.pack_xfr_pack_unit_qty(), actDR.pack_xfr_pack_unit_qty()) 
											&& dtlR.pack_xfr_pack_unit_qty().eq(actDR.pack_xfr_pack_unit_qty())))) {
								dtlR.rmrks_upd_flg(true);
							}
						}
					}
				}
			}
			else {
				MCIndexKey idxkey = _smplActL.createIndex(MST_INSP_SMPL_ACT_R.$insp_smpl_act_no);
				for (InspAct_Chk01_SmplR smplR : smplL) {
					if (MAC_DATA_CRUD_TYP.isUPD(smplR.data_crud_typ())) {
						MST_INSP_SMPL_ACT_R smplActR = _smplActL.getFirst(idxkey, smplR.insp_smpl_act_no());
						if (!isNull(smplActR)) {
							if (isSame(smplR.loc_cd(), smplActR.loc_cd())
									&& isSame(smplR.str_ln_cd(), smplActR.str_ln_cd())
									&& isSame(smplR.act_tm(), smplActR.act_tm())
									&& isSame(smplR.ac_dt(), smplActR.ac_dt())
									&& isSame(smplR.bd_dpt_cd(), smplActR.bd_dpt_cd())
									&& isSame(smplR.smpl_qty(), smplActR.smpl_qty())
									&& (isNullAnd(smplR.so_qty(), smplActR.so_qty()) || (!isNullOr(smplR.so_qty(), smplActR.so_qty()) && smplR.so_qty().eq(smplActR.so_qty())))
									&& (isNullAnd(smplR.pack_xfr_pack_unit_qty(), smplActR.pack_xfr_pack_unit_qty()) 
											|| (!isNullOr(smplR.pack_xfr_pack_unit_qty(), smplActR.pack_xfr_pack_unit_qty()) && smplR.pack_xfr_pack_unit_qty().eq(smplActR.pack_xfr_pack_unit_qty())))) {
								smplR.rmrks_upd_flg(true);
							}
						}
					}
				}
			}
		}

		/**
		 * 検査予定、検査指図情報を取得する。
		 * 
		 */
		protected void getInspL() {
			// 検査予定情報取得
			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S01", _schdL, _schdL_bldr, up0());

			// 検査指図情報取得
			dbSelectKey("MSBFL5050_MST_INSP_INST_S01", _instL, _instL_bldr, up0());

			// 検査実績情報取得
			dbSelectKey("MSBFL5050_MST_INSP_ACT_S01", _actL, _actL_bldr, up0());

			// 検査実績明細情報取得
			dbSelectKey("MSBFL5050_MST_INSP_ACT_D_S01", _actDL, _actDL_bldr, up1());

			// 抜取検査実績明細情報取得
			dbSelectKey("MSBFL5050_MST_INSP_SMPL_ACT_S01", _smplActL, _smplActL_bldr, up2());

			// 現状在庫情報取得
			MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");
			MST_INSP_INST_R t3 = MST_INSP_INST_R.create("T3");
			_stkL_bldr.addSelect(t2.insp_no);
			_stkL_bldr.addInnerJoin(t2, bracket(
					bracket(t2.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value()))
							.and(_stkL_t.fix_no.eq(t2.src_no4))
							.and(_stkL_t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value()))))
						.or(t2.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))
								.and(_stkL_t.fix_no.eq(t2.src_no4))
								.and(_stkL_t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.YIELD_ACT_NO.value()))))
						.or(t2.insp_typ.eq(value(MSC_INSP_TYP.LOT.value()))
								.and(_stkL_t.fix_no.eq(t2.insp_schd_no))
								.and(_stkL_t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.INSP_SCHD_NO.value()))))
						)
					);
			_stkL_bldr.addInnerJoin(t3, bracket(t2.insp_no.eq(t3.insp_no)));
			_stkL_bldr.setWhere(t2.insp_no.eq(bind("insp_no")));

			dbSelect("MSBFL5050_MST_STK_S01", _stkL, _stkL_bldr, up0());

			_stkIdxKey = _stkL.createIndex("INSP_NO");
			MCList<InspAct_Chk01_HdrR> bindL = up0().subList(r -> MSC_INSP_TYP.isPRDCT(r.insp_typ()));
			if (!bindL.isEmpty()) {
				MST_OPER_INST_R t4 = MST_OPER_INST_R.create("T4");
				MST_OPER_ACT_R t5 = MST_OPER_ACT_R.create("T5");
				_itmMfgInstPrdctL_bldr.setSelect(_itmMfgInstPrdctL_t.itm_mfg_inst_no);
				_itmMfgInstPrdctL_bldr.addSelect(t5.st_act_tm);
				_itmMfgInstPrdctL_bldr.addSelect(t5.end_act_tm);
				_itmMfgInstPrdctL_bldr.addInnerJoin(t4, _itmMfgInstPrdctL_t.itm_mfg_inst_no.eq(t4.itm_mfg_inst_no));
				_itmMfgInstPrdctL_bldr.addLeftOuterJoin(t5, t4.oper_inst_no.eq(t5.oper_inst_no));
				_itmMfgInstPrdctL_bldr.setWhere(t4.lmt_fr_dt_flg.eq(value(true)));
				_itmMfgInstPrdctL_bldr.addWhereWithAnd(_itmMfgInstPrdctL_t.itm_mfg_inst_no.eq(bind("src_no2")));
				dbSelect("MSBFL5050_MST_ITM_MFG_INST_S01", _itmMfgInstPrdctL, _itmMfgInstPrdctL_bldr, bindL);
				_itmMfgInstPrdctIdxkey = _itmMfgInstPrdctL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);

				_mfgActPrdctL_bldr.setSelect(_mfgActPrdctL_t.itm_mfg_inst_no);
				_mfgActPrdctL_bldr.addSelect(_mfgActPrdctL_t.st_act_tm);
				_mfgActPrdctL_bldr.setWhere(_mfgActPrdctL_t.itm_mfg_inst_no.eq(bind("src_no2")));
				dbSelect("MSBFL5050_MST_MFG_ACT_S01", _mfgActPrdctL, _mfgActPrdctL_bldr, bindL);
				_mfgActPrdctIdxkey = _mfgActPrdctL.createIndex(MST_MFG_ACT_R.$itm_mfg_inst_no);

				_schdIdxkey = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			}
		}

		/**
		 * 抜取規格検査の検査に対して規格検査入力済、規格検査確認済の情報を取得する。
		 */
		protected void getStdInspAct() {
			MCList<MST_STD_INSP_ACT_R> stdActL = MCList.create(MST_STD_INSP_ACT_R.class);
			MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
			MCQueryApiBuilder stdActL_bldr = MCQueryApiBuilder.create(t);
			stdActL_bldr.setSelect(t.insp_no);
			stdActL_bldr.addSelect(t.std_insp_inst_no);
			stdActL_bldr.addSelect(t.std_insp_rslt_typ);
			stdActL_bldr.addSelect(t.cnf_flg);
			stdActL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_STD_INSP_ACT_S01", stdActL, stdActL_bldr, up0());
			MCIndexKey idx = stdActL.createIndex(MST_STD_INSP_ACT_R.$insp_no);
			
			MCList<MST_STD_INSP_INST_R> stdInstL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R StdInspInstR = MST_STD_INSP_INST_R.create("STDINSPINST");
			MCQueryApiBuilder stdInstL_bldr = MCQueryApiBuilder.create(StdInspInstR);
			stdInstL_bldr.setSelect(StdInspInstR.insp_no);
			stdInstL_bldr.addSelect(StdInspInstR.std_insp_inst_no);
			stdInstL_bldr.setWhere(StdInspInstR.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_STD_INSP_INST_S01", stdInstL, stdInstL_bldr, up0());
			
			MCIndexKey stdActIdx = stdActL.createIndex(MST_STD_INSP_ACT_R.$std_insp_inst_no);
			MCList<MST_STD_INSP_INST_R> notStdActL = MCList.create(MST_STD_INSP_INST_R.class);
			for (MST_STD_INSP_INST_R stdInstR : stdInstL) {
				MCList<MST_STD_INSP_ACT_R> actL = stdActL.subList(stdActIdx, stdInstR.std_insp_inst_no());
				if (actL.isEmpty()) {
					notStdActL.add(stdInstR);
				}
			}
			
			MCIndexKey notStdActIdx = notStdActL.createIndex(MST_STD_INSP_INST_R.$insp_no);
			
			for (InspAct_Chk01_HdrR r : up0()) {
				if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {

					MCList<MST_STD_INSP_INST_R> tgtNotStdActL = notStdActL.subList(notStdActIdx, r.insp_no());
					
					if (!tgtNotStdActL.isEmpty()) {
						r.std_cmpl_flg(false);
						r.std_cnf_cmpl_flg(false);
						continue;
					}
					
					MCList<MST_STD_INSP_ACT_R> tgtStdActL = stdActL.subList(idx, r.insp_no());
					
					if (!tgtStdActL.isEmpty()) {
						if (tgtStdActL.subList(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, null).isEmpty()) {
							r.std_cmpl_flg(true);
						}
						if (tgtStdActL.subList(MST_STD_INSP_ACT_R.$cnf_flg, false).isEmpty()) {
							r.std_cnf_cmpl_flg(true);
						}
					}
				}
			}
		}

		/**
		 * 条件付チェックを実行する。
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd() {
			MCMessageList msgL = new MCMessageList();

			MCIndexKey dtlIdxkey = up1().createIndex(InspAct_Chk01_DtlR.$insp_no);
			MCIndexKey smplIdxkey = up2().createIndex(InspAct_Chk01_SmplR.$insp_no);
			for (InspAct_Chk01_HdrR r : up0()) {
				if (!isNull(r.aprv_dt())) {
					msgL.addAll(check(r, new String[] {InspAct_Chk01_HdrR.$aprv_dt, InspAct_Chk01_HdrR.$st_tm}, new FXUCL_BeforeAfterValidater()));
				}
				if (MAC_QUALITY_TYP.isDFCT_INSP(r.quality_typ())) {
					msgL.addAll(check(r, InspAct_Chk01_HdrR.$dfct_rsn_cd, new FXUCL_RequiredValidater()));
				}
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ()) && r.vld_dt_upd_flg()
						&& (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())
								|| (!MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())
									&& (MAC_QUALITY_TYP.isGOOD(r.quality_typ()) || MAC_QUALITY_TYP.isSSPND(r.quality_typ()))))) {
					if (MAC_LMT_DT_FRM_TYP.isMFG_ST(r.lmt_dt_frm_typ())) {
						if (isMfgStChkTgt(r)) {
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt_frm, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$vld_dt, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt, new FXUCL_RequiredValidater()));
						}
					}
					else if (MAC_LMT_DT_FRM_TYP.isMFG_CMPL(r.lmt_dt_frm_typ())) {
						if (isMfgCmplChkTgt(r)) {
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt_frm, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$vld_dt, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt, new FXUCL_RequiredValidater()));
						}
					}
				}
				setErrFlg(r, msgL);

				// 全数検査の場合
				if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
					for (InspAct_Chk01_DtlR dtlR : up1().subList(dtlIdxkey, r.insp_no())) {
						if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) 
								|| isNull(dtlR.data_crud_typ())) {
							if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
								msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
							}
							continue;
						}
						msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$gd_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$quality_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$pack_unit_qty, new FXUCL_RequiredValidater()));
						msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$ac_dt, new FXUCL_RequiredValidater()));
						if (!isNull(dtlR.pack_xfr_pack_unit_cd())) {
							if (!isSame(dtlR.pack_unit_cd(), dtlR.pack_xfr_pack_unit_cd())) {
								msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$pack_xfr_pack_unit_qty, new FXUCL_RequiredValidater()));
							}
						}
						if (MAC_QUALITY_TYP.isDFCT_INSP(dtlR.quality_typ())) {
							msgL.addAll(check(dtlR, InspAct_Chk01_DtlR.$dfct_rsn_cd, new FXUCL_RequiredValidater()));
						}
						setErrFlg(dtlR, msgL);
					}
				}
				else {
					for (InspAct_Chk01_SmplR smplR : up2().subList(smplIdxkey, r.insp_no())) {
						if (MAC_DATA_CRUD_TYP.isDEL(smplR.data_crud_typ())) {
							msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
							continue;
						}
						msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$smpl_qty, new FXUCL_RequiredValidater()));
						msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$loc_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$act_tm, new FXUCL_RequiredValidater()));
						msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$ac_dt, new FXUCL_RequiredValidater()));
						if (!isNull(smplR.so_qty())) {
							if (!isNull(smplR.ac_dt())) {
								msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
							}
							if (!isSame(smplR.pack_xfr_pack_unit_cd(), smplR.pack_xfr_base_unit_cd())) {
								msgL.addAll(check(smplR, InspAct_Chk01_SmplR.$pack_xfr_pack_unit_qty, new FXUCL_RequiredValidater()));
							}
						}
						setErrFlg(smplR, msgL);
					}
				}
			}

			return msgL;
		}

		protected boolean isMfgStChkTgt(InspAct_Chk01_HdrR hdrR) {
			MCList<MST_ITM_MFG_INST_R> subItmMfgInstL = _itmMfgInstPrdctL.subList(_itmMfgInstPrdctIdxkey, hdrR.src_no2());
			if (!isNull(subItmMfgInstL)) {
				return !isNull(subItmMfgInstL
						.subList(mr -> !isNull(mr.getDateNE("ST_ACT_TM"))));
			}
			else {
				return !isNull(_mfgActPrdctL.subList(_mfgActPrdctIdxkey, hdrR.src_no2()));
			}
		}
		protected boolean isMfgCmplChkTgt(InspAct_Chk01_HdrR hdrR) {
			MCList<MST_ITM_MFG_INST_R> subItmMfgInstL = _itmMfgInstPrdctL.subList(_itmMfgInstPrdctIdxkey, hdrR.src_no2());
			if (!isNull(subItmMfgInstL)) {
				return !isNull(subItmMfgInstL
						.subList(mr -> !isNull(mr.getDateNE("END_ACT_TM"))));
			}
			else {
				MCList<MST_INSP_SCHD_R> subSchdL = _schdL.subList(_schdIdxkey, hdrR.insp_no());
				return !isNull(subSchdL.subList(sr -> !isNull(sr.src_no4())));
			}
		}
		/**
		 * 検査実績登録対象チェック
		 * 
		 * @param msgL
		 */
		protected void chkInspAct(MCMessageList msgL) {
			MCList<MST_INSP_ACT_D_R> actDL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t1 = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t1);
			actDL_bldr.setWhere(t1.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_D_S02", actDL, actDL_bldr, up0());
			
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t2 = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t2);
			smplL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			smplL_bldr.addWhereWithAnd(t2.stk_id_typ.neq(value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value())));
			dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S02", smplL, smplL_bldr, up0());
			
			MCIndexKey actDIdxkey = actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_no);
			MCIndexKey smplIdxkey = smplL.createIndex(MST_INSP_SMPL_ACT_R.$insp_act_no);
			MCIndexKey smplUpIdxkey = up2().createIndex(InspAct_Chk01_SmplR.$insp_no);
			MCIndexKey schdIndexKey = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);

			// 更新対象の品目・ロットに紐づく検査実績を取得
			MCList<MST_INSP_ACT_R> actL = getInspAct();

			for (InspAct_Chk01_HdrR r : up0()) {
				if (MSC_INSP_APRV_STS_TYP.isINST_OPN(r.insp_aprv_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0053, 
							r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
				}
				
				if (MSC_INSP_STS_TYP.isYET(r.insp_sts_typ())
						|| MSC_INSP_STS_TYP.isSCHD(r.insp_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0052, 
							r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
				}
				
				if (MAC_INSP_MTD_TYP.isSMPL(r.insp_mtd_typ()) || MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
					if (qualityGdEndDtReqChk(r)) {
						msgL.add(new MCMessage(r, null, MSBFL0070, 
								r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
					}

					if (MAC_QUALITY_TYP.isDFCT_OPER(r.quality_typ())) {
						msgL.add(new MCMessage(r, null, MSBFL0027, 
								r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
					}
				}
				if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())
						&& !isNull(r.quality_typ()) && !isNull(r.end_tm())) {
					if (r.std_req_flg() && !r.std_cmpl_flg()) {
						msgL.add(new MCMessage(r, null, MSBFL0109, 
								r.insp_no(), toDispGUIIndex(r)));
					}
					if (r.std_cnf_req_flg() && !r.std_cnf_cmpl_flg()) {
						msgL.add(new MCMessage(r, null, MSBFL0110, 
								r.insp_no(), toDispGUIIndex(r)));
					}
				}
				MST_INSP_SCHD_R schdR = _schdL.getFirst(schdIndexKey, r.insp_no());
				if (!MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ()) && !schdR.in_prmt_insp_flg()) {
					MCList<MST_INSP_ACT_D_R> subActDL = actDL.subList(actDIdxkey, r.insp_act_no());
					MCList<MST_INSP_SMPL_ACT_R> subSmplL = smplL.subList(smplIdxkey, r.insp_act_no());
					MCList<InspAct_Chk01_SmplR> smplUpL = up2().subList(smplUpIdxkey, r.insp_no());
					// 着手時には全数引き落としするかチェック
					if (isAllSoQty(r, subActDL, subSmplL, smplUpL)) {
						if (MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ_db())) {
							msgL.add(new MCMessage(r, null, MSBFL0114, 
									r.insp_no(), toDispGUIIndex(r)));
						}
						else {
							msgL.add(new MCMessage(r, null, MSBFL0113, 
									r.insp_no(), toDispGUIIndex(r)));
						}
					}
				}
				// 期限更新に関わるチェック
				if (r.vld_dt_upd_flg()) {
					setLmtDtErr(r, actL, msgL);
					setLmtDifferentErr(r, msgL);
				}
				setErrFlg(r, msgL);
			}
		}

		protected MCList<MST_INSP_ACT_R> getInspAct() {
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			
			MST_INSP_ACT_R actR = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(actR);
			actR_bldr.setSelect(
					actR.insp_no,
					actR.lmt_dt,
					actR.itm_cd,
					actR.itm_sub1,
					actR.itm_sub2,
					actR.itm_sub3,
					actR.lot_no,
					actR.sublot_no);
			actR_bldr.setWhere(actR.itm_cd.eq(bind("itm_cd")));
			actR_bldr.addWhereWithAnd(actR.itm_sub1.eq(bind("itm_sub1")));
			actR_bldr.addWhereWithAnd(actR.itm_sub2.eq(bind("itm_sub2")));
			actR_bldr.addWhereWithAnd(actR.itm_sub3.eq(bind("itm_sub3")));
			actR_bldr.addWhereWithAnd(actR.lot_no.eq(bind("lot_no")));
			actR_bldr.addWhereWithAnd(actR.sublot_no.eq(bind("sublot_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_S10", actL, actR_bldr, up0());
			
			return actL;
		}

		protected boolean qualityGdEndDtReqChk(InspAct_Chk01_HdrR r) {
			// 良品区分、格付、検査終了日時のうち、少なくとも一つに値が設定されている場合、
			// 上記の項目は全て必須項目となる。
			if (!isNull(r.quality_typ()) || !isNull(r.gd_cd()) || !isNull(r.end_tm())) {
				if (isNull(r.quality_typ()) || isNull(r.gd_cd()) || isNull(r.end_tm())) {
					return true;
				}
			}
			return false;
		}
		
		protected void callPlntAprvChk01(MCList<InspAct_Chk01_HdrR> notErrL) {
			MSBFL_PlntAprvService.PlntAprv_Chk01 o = MSBFL_PlntAprvService.crtPlntAprv_Chk01();
			
			MCIndexKey schdIdx = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			MCIndexKey instIdx = _instL.createIndex(MST_INSP_INST_R.$insp_no);

			for (InspAct_Chk01_HdrR r : notErrL) {
				MST_INSP_INST_R instR = _instL.getFirst(instIdx, r.insp_no());
				
				if (!isPlntAprv(r, instR)) {
					continue;
				}
				
				MCList<MST_INSP_SCHD_R> subSchdL = _schdL.subList(schdIdx, r.insp_no());
				
				for (MST_INSP_SCHD_R schdR : subSchdL) {
					PlntAprv_Chk01_RsltR oR = PlntAprv_Chk01_RsltR.create();
					
					oR.peg_no(r.peg_no());
					oR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					setPlntAprvNo(oR, r);
					oR.insp_typ(r.insp_typ());
					oR.insp_no(r.insp_no());
					oR.src_no1(schdR.src_no1());
					oR.src_no2(schdR.src_no2());
					oR.src_no3(schdR.src_no3());
					oR.src_no4(schdR.src_no4());
					oR.itm_cd(r.itm_cd());
					oR.itm_sub1(r.itm_sub1());
					oR.itm_sub2(r.itm_sub2());
					oR.itm_sub3(r.itm_sub3());
					oR.lot_no(r.lot_no());
					oR.sublot_no(r.sublot_no());
					oR.loc_cd(schdR.loc_cd());
					oR.setAttributes(r);
					
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(notErrL, o.down0());
			}
		}
		
		protected void setPlntAprvNo(PlntAprv_Chk01_RsltR oR, InspAct_Chk01_HdrR r) {
			MST_PLNT_APRV_D_R plntAprvR = _plntAprvL.getFirst(_plntAprvIdxkey, r.insp_no());
			if (!isNull(plntAprvR)) {
				oR.plnt_aprv_no(plntAprvR.plnt_aprv_no());
				oR.plnt_aprv_d_no(plntAprvR.plnt_aprv_d_no());
			}
			else {
				oR.plnt_aprv_no(null);
				oR.plnt_aprv_d_no(null);
			}
		}
		
		protected boolean isPlntAprv(InspAct_Chk01_HdrR r, MST_INSP_INST_R instR) {
			if (!instR.plnt_aprv_flg()) {
				return false;
			}
			// 承認対象の場合には判定時に工場出荷承認情報を作成するので、ここでは呼び出さない。
			if (instR.insp_aprv_flg()) {
				return false;
			}
			return true;
		}
		
		protected void callClChk03(MCList<InspAct_Chk01_HdrR> notErrL) {
			MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
			
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk01_HdrR.$insp_no);
			// 全数検査の場合、実績明細の締チェックを行う。
			MCList<InspAct_Chk01_DtlR> dtlL = MCList.create(InspAct_Chk01_DtlR.class);
			for (InspAct_Chk01_HdrR hdrR : notErrL) {
				if (!MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
					continue;
				}
				dtlL.addAll(up1().subList(idxkey, hdrR.insp_no()));
			}
			setAll(o.up0(), dtlL.subList(r -> isClChkDtlRow(r)),
					createMap_Cl_Chk03_CndR_InspAct_Chk01_DtlR());
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(dtlL, o.down0());
			}
			
			o.up0().clear();

			MCList<MST_INSP_STT_D_R> sttDL = MCList.create(MST_INSP_STT_D_R.class);
			MCList<MST_INSP_ACT_D_R> actDL = MCList.create(MST_INSP_ACT_D_R.class);

			MST_INSP_STT_D_R t1 = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttDL_bldr = MCQueryApiBuilder.create(t1);
			sttDL_bldr.setWhere(t1.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_STT_D_S01", sttDL, sttDL_bldr, up0());

			MST_INSP_ACT_D_R t2 = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t2);
			actDL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_D_S03", actDL, actDL_bldr, up0());

			MCIndexKey sttIdxkey = sttDL.createIndex(MST_INSP_STT_D_R.$insp_act_no);
			MCIndexKey actDIdxkey = actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_no);
			MCIndexKey smplIdxkey = up2().createIndex(InspAct_Chk01_SmplR.$insp_no);

			MCIndexKey actIdxkey = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			MCIndexKey smplActIdxkey = _smplActL.createIndex(MST_INSP_SMPL_ACT_R.$insp_smpl_act_no);
			
			for (InspAct_Chk01_HdrR hdrR : notErrL) {
				MCList<InspAct_Chk01_SmplR> smplL = up2().subList(smplIdxkey, hdrR.insp_no());

				// 現状在庫情報を取得する
				MCList<MST_STK_R> stkL = _stkL.subList(_stkIdxKey, hdrR.insp_no());

				if (isNull(hdrR.insp_act_no())) {

					// 着手明細締チェック対象
					o.up0().setAll(crtClCndLByStk(hdrR, stkL, false));
					if (!o.up0().isEmpty()) {
						o.exec();
						if (!isNull(o.down0().getFirst(Cl_Chk03_CndR.$err_flg, true))) {
							hdrR.err_flg(true);
							continue;
						}
					}

					// 実績明細締チェック対象
					if (MAC_INSP_MTD_TYP.isSMPL(hdrR.insp_mtd_typ()) || MAC_INSP_MTD_TYP.isSPEC(hdrR.insp_mtd_typ())) {
						if (!isNull(hdrR.end_tm())){
							o.up0().setAll(crtClCndLByStk(hdrR, stkL, true));
							if (!o.up0().isEmpty()) {
								o.exec();
								if (!isNull(o.down0().getFirst(Cl_Chk03_CndR.$err_flg, true))) {
									hdrR.err_flg(true);
									continue;
								}
							}
						}
						// 抜取実績締チェック対象
						if (!smplL.isEmpty()) {
							MCList<InspAct_Chk01_SmplR> chkSmplL = MCList.create(InspAct_Chk01_SmplR.class);
							chkSmplL = smplL.subList(r -> !isNull(r.so_qty()));

							if (!chkSmplL.isEmpty()) {
								setAll(o.up0(), chkSmplL, createMap_Cl_Chk03_CndR_InspAct_Chk01_SmplR());
							}

							if (!o.up0().isEmpty()) {
								o.exec();
								copyErrFlg(smplL, o.down0());
							}
						}
					}
				}
				else {
					MST_INSP_ACT_R actR = _actL.getFirst(actIdxkey, hdrR.insp_act_no());
					if (!isSame(actR.st_tm(), hdrR.st_tm())) {
						// 着手明細締チェック対象
						o.up0().setAll(crtClCndLByInspSttD(hdrR, actR, sttDL.subList(sttIdxkey, hdrR.insp_act_no())));
						if (!o.up0().isEmpty()) {
							o.exec();
							if (!isNull(o.down0().getFirst(Cl_Chk03_CndR.$err_flg, true))) {
								hdrR.err_flg(true);
								continue;
							}
						}
					}

					// 実績明細締チェック対象
					if (MAC_INSP_MTD_TYP.isSMPL(hdrR.insp_mtd_typ()) || MAC_INSP_MTD_TYP.isSPEC(hdrR.insp_mtd_typ())) {
						o.up0().clear();
						if (!isNull(actR.end_tm())) {
							o.up0().addAll(crtClCndLByInspActD(hdrR, actDL.subList(actDIdxkey, hdrR.insp_act_no())));
							o.up0().addAll(o.up0().isEmpty() ? crtClCndLByStk(hdrR, stkL, true) : null);
						}
						else if (!isNull(hdrR.end_tm())){
							// 実績明細締チェック対象
							o.up0().addAll(crtClCndLByStk(hdrR, stkL, true));
						}
						if (!o.up0().isEmpty()) {
							o.exec();
							if (!isNull(o.down0().getFirst(Cl_Chk03_CndR.$err_flg, true))) {
								hdrR.err_flg(true);
								continue;
							}
						}

						if (!smplL.isEmpty()) {
							setAll(o.up0(), smplL.subList(r -> isClChkSmplRow(r, smplActIdxkey)), createMap_Cl_Chk03_CndR_InspAct_Chk01_SmplR());
							if (!o.up0().isEmpty()) {
								o.exec();
								copyErrFlg(smplL, o.down0());
							}
						}
					}
				}
			}
		}

		protected boolean isClChkDtlRow(InspAct_Chk01_DtlR r) {
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && !r.rmrks_upd_flg()) {
				return true;
			}
			return false;
		}

		protected boolean isClChkSmplRow(InspAct_Chk01_SmplR r, MCIndexKey smplActIdxkey) {
			MST_INSP_SMPL_ACT_R smplActR = MST_INSP_SMPL_ACT_R.create();
			if (!isNull(r.data_crud_typ()) && MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// 登録対象の引落数量がnullであれば、締チェック対象外にする
				if (isNull(r.so_qty())) {
					return false;
				}

				return true;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				smplActR = _smplActL.getFirst(smplActIdxkey, r.insp_smpl_act_no());
				// 削除対象の引落数量がnullであれば、締チェック対象外にする
				if (isNull(smplActR.so_qty())) {
					return false;
				}

				return true;
			}
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				smplActR = _smplActL.getFirst(smplActIdxkey, r.insp_smpl_act_no());
				// 更新前後で引落数量がnullのままであれば、締チェック対象外にする
				if (isNull(r.so_qty()) && isNull(smplActR.so_qty())) {
					return false;
				}

				return true;
			}
			return false;
		}

		protected boolean isAllSoQtySmplRow(InspAct_Chk01_SmplR r) {
			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
				return true;
			}
			return false;
		}

		/**
		 * 検査状況「着手中」の場合、在庫数量が全数引落されるかを判定する
		 * 
		 * @param hdrR
		 * @param actDL
		 * @param smplL
		 * @param smplUpL
		 * @return
		 */
		protected boolean isAllSoQty(InspAct_Chk01_HdrR hdrR, MCList<MST_INSP_ACT_D_R> actDL, 
				MCList<MST_INSP_SMPL_ACT_R> smplL, MCList<InspAct_Chk01_SmplR> smplUpL) {
			MCList<InspAct_Chk01_SmplR> subUpSmplL = smplUpL.subList(r -> isAllSoQtySmplRow(r));
			if (isNull(hdrR.end_tm()) && !subUpSmplL.isEmpty()) {
				MCNumber upSoQty = subUpSmplL.sum(InspAct_Chk01_SmplR.$so_qty);
				if (isNull(upSoQty) || upSoQty.isZero()) {
					return false;
				}

				MCList<MST_STK_R> stkL = _stkL.subList(_stkIdxKey, hdrR.insp_no());

				MCNumber stkBaseUnitQty = MCNumber.ZERO;
				if (stkL.isEmpty() && !MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ_db())) {
					return false;
				}
				stkBaseUnitQty = stkL.sum(MST_STK_R.$base_unit_qty);

				MCNumber inspActDQty = MCNumber.ZERO;
				if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ_db())) {
					if (actDL.isEmpty()) {
						return false;
					}
				}
				inspActDQty = actDL.sum(MST_INSP_ACT_D_R.$base_unit_qty);

				MCNumber dbSoQty = MCNumber.ZERO;
				if (!isNull(hdrR.insp_act_no())) {
					if (!smplL.isEmpty()) {
						dbSoQty =  smplL.sum(MST_INSP_SMPL_ACT_R.$so_qty);
					}
				}

				if (!isNull(stkBaseUnitQty)) {
					return upSoQty.eq(nvl(dbSoQty, MCNumber.ZERO).add(nvl(stkBaseUnitQty, MCNumber.ZERO)));
				}
				else {
					return upSoQty.eq(nvl(dbSoQty, MCNumber.ZERO).add(nvl(inspActDQty, MCNumber.ZERO)));
				}
			}
			return false;
		}

		/**
		 * 現状在庫情報を元に締チェック対象を作成する。
		 * 
		 * @param hdrR 検査実績ヘッダ（上り電文）
		 * @param stkL 現状在庫情報
		 * @return
		 */
		protected MCList<Cl_Chk03_CndR> crtClCndLByStk(InspAct_Chk01_HdrR hdrR, MCList<MST_STK_R> stkL, boolean endFlg) {
			MCList<Cl_Chk03_CndR> retL = MCList.create(Cl_Chk03_CndR.class);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk01_DtlR.$fix_no, InspAct_Chk01_DtlR.$fix_no_typ);

			for (MST_STK_R stkR : stkL) {
				Cl_Chk03_CndR clCndR = Cl_Chk03_CndR.create();
				clCndR.peg_no(hdrR.peg_no());
				if (endFlg) {
					MCList<InspAct_Chk01_DtlR> subUpL = up1().subList(idxkey, stkR.fix_no(), stkR.fix_no_typ());
					clCndR.ac_dt((MCDate)subUpL.min(InspAct_Chk01_DtlR.$ac_dt));
					clCndR.ac_dt(subUpL.isEmpty() ? getAcDt(hdrR.end_tm()) : clCndR.ac_dt());
				}
				else {
					clCndR.ac_dt(getAcDt(hdrR.st_tm()));
				}
				clCndR.loc_cd(stkR.loc_cd());
				clCndR.itm_cd(stkR.itm_cd());
				clCndR.itm_sub1(stkR.itm_sub1());
				clCndR.itm_sub2(stkR.itm_sub2());
				clCndR.itm_sub3(stkR.itm_sub3());
				clCndR.sls_cls_chk_flg(false);
				clCndR.rcv_cls_chk_flg(false);
				clCndR.purc_cls_chk_flg(false);
				clCndR.pay_cls_chk_flg(false);
				clCndR.stk_cls_chk_flg(true);
				clCndR.io_lmt_skip_flg(false);
				clCndR.setAttributes(hdrR);
				retL.add(clCndR);
			}

			return retL;
		}

		/**
		 * 検査実績着手明細を元に締チェック対象を作成する。
		 * 
		 * @param hdrR 検査実績ヘッダ（上り電文）
		 * @param actR 検査実績
		 * @param sttDL 検査実績着手明細
		 * @return
		 */
		protected MCList<Cl_Chk03_CndR> crtClCndLByInspSttD(InspAct_Chk01_HdrR hdrR, MST_INSP_ACT_R actR, MCList<MST_INSP_STT_D_R> sttDL) {
			MCList<Cl_Chk03_CndR> retL = MCList.create(Cl_Chk03_CndR.class);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk01_DtlR.$fix_no, InspAct_Chk01_DtlR.$fix_no_typ);
			
			for (MST_INSP_STT_D_R subSttDL : sttDL) {
				MCList<InspAct_Chk01_DtlR> subL = up1().subList(idxkey, subSttDL.fix_no(), subSttDL.fix_no_typ());
				Cl_Chk03_CndR clCndR = Cl_Chk03_CndR.create();
				clCndR.peg_no(hdrR.peg_no());
				clCndR.ac_dt(getAcDt(hdrR.st_tm()));
				// 着手明細の取消計上日はInspAct_Upd01によって、以下の仕様で設定される
				// １．訂正前の計上日の在庫が未締の場合　⇒　訂正前の計上日
				// ２．訂正前の計上日の在庫が締済の場合　⇒　画面で指定した取消計上日
				// よって訂正前の着手明細の計上日で締めチェックをするのではなく、画面で指定した取消計上日で締めチェックする
				// ※訂正前の着手明細の計上日で締めチェックをしてしまうと、１のケースで締後の実績訂正ができないため
				clCndR.can_ac_dt((MCDate)subL.min(InspAct_Chk01_DtlR.$can_ac_dt));
				clCndR.loc_cd(subSttDL.loc_cd());
				clCndR.itm_cd(subSttDL.itm_cd());
				clCndR.itm_sub1(subSttDL.itm_sub1());
				clCndR.itm_sub2(subSttDL.itm_sub2());
				clCndR.itm_sub3(subSttDL.itm_sub3());
				clCndR.old_loc_cd(subSttDL.loc_cd());
				clCndR.old_itm_cd(subSttDL.itm_cd());
				clCndR.old_itm_sub1(subSttDL.itm_sub1());
				clCndR.old_itm_sub2(subSttDL.itm_sub2());
				clCndR.old_itm_sub3(subSttDL.itm_sub3());
				clCndR.sls_cls_chk_flg(false);
				clCndR.rcv_cls_chk_flg(false);
				clCndR.purc_cls_chk_flg(false);
				clCndR.pay_cls_chk_flg(false);
				clCndR.stk_cls_chk_flg(true);
				clCndR.io_lmt_skip_flg(false);
				clCndR.setAttributes(hdrR);
				retL.add(clCndR);
			}
			
			return retL;
		}

		protected void setLmtDtErr(InspAct_Chk01_HdrR r, MCList<MST_INSP_ACT_R> actL, MCMessageList msgL) {
			if (isNull(r.lmt_dt())) {
				return;
			}
			
			if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())
					|| MAC_LMT_DT_FRM_TYP.isMANUAL(r.lmt_dt_frm_typ())) {
				if (!actL.isEmpty()) {
					// 検査実績がある＝訂正とみなす
					boolean retFlg = true;
					for (MST_INSP_ACT_R actR : actL) {
						// 使用期限設定済み、かつ検査ＮＯ不一致なら複数件の実績が存在すると判断する
						if (!isNull(actR.lmt_dt()) && !isSame(r.insp_no(), actR.insp_no())) {
							retFlg = false;
							break;
						}
					}
					if (retFlg) {
						return;
					}
				}
				
				MST_LOT_R lotR = getLot(r);
				
				if (lotR.isEmpty()) {
					return;
				}
				
				if (lotR.unreg_lmt_flg() || isNull(lotR.vld_dt()) || isNull(lotR.lmt_dt())) {
					return;
				}
				
				// 使用期限がロット情報と異なる場合はエラー
				if (!isSame(r.lmt_dt(), lotR.lmt_dt())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBFL0201, toYMDString(r.lmt_dt()), toYMDString(lotR.vld_dt()), toYMDString(lotR.lmt_dt()), toDispGUIIndex(r)));
				}
			}
		}

		protected MST_LOT_R getLot(InspAct_Chk01_HdrR r) {
			MST_LOT_R lotR = MST_LOT_R.create();
			MST_LOT_R lotL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lotL_t);
			
			lotL_bldr.setSelect(lotL_t.unreg_lmt_flg);
			lotL_bldr.addSelect(lotL_t.itm_cd);
			lotL_bldr.addSelect(lotL_t.itm_sub1);
			lotL_bldr.addSelect(lotL_t.itm_sub2);
			lotL_bldr.addSelect(lotL_t.itm_sub3);
			lotL_bldr.addSelect(lotL_t.lot_no);
			lotL_bldr.addSelect(lotL_t.sublot_no);
			lotL_bldr.addSelect(lotL_t.vld_dt);
			lotL_bldr.addSelect(lotL_t.lmt_dt);
			dbSelectKey("MSBFL5050_MST_LOT_S01", lotR, lotL_bldr, r);
			
			return lotR; 
		}

		protected void setLmtDifferentErr(InspAct_Chk01_HdrR r, MCMessageList msgL) {
			// 同一ロットのサブリストを作成
			String[] keys = new String[] {
					InspAct_Chk01_HdrR.$itm_cd, InspAct_Chk01_HdrR.$itm_sub1,
					InspAct_Chk01_HdrR.$itm_sub2, InspAct_Chk01_HdrR.$itm_sub3,
					InspAct_Chk01_HdrR.$lot_no, InspAct_Chk01_HdrR.$sublot_no
			};
			
			Comparable<?>[] vals = new Comparable[] {
					r.itm_cd(), r.itm_sub1(),
					r.itm_sub2(), r.itm_sub3(),
					r.lot_no(), r.sublot_no()
			};
			
			for (InspAct_Chk01_HdrR upR : up0().subList(keys, vals)) {
				// 上り電文の期限が異なる場合はエラー
				if ((!isNull(upR.lmt_dt()) && !isSame(r.lmt_dt(), upR.lmt_dt()))
					|| (!isNull(upR.vld_dt()) && !isSame(r.vld_dt(), upR.vld_dt()))
					|| (!isNull(upR.lmt_dt_frm()) && !isSame(r.lmt_dt_frm(), upR.lmt_dt_frm()))){
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBFL0202, toDispGUIIndex(r)));
					return;
				}
			}
		}

		/**
		 * 検査実績実績明細を元に締チェック対象を作成する。
		 * 
		 * @param hdrR 検査実績ヘッダ（上り電文）
		 * @param actDL 検査実績実績明細
		 * @return
		 */
		protected MCList<Cl_Chk03_CndR> crtClCndLByInspActD(InspAct_Chk01_HdrR hdrR, MCList<MST_INSP_ACT_D_R> actDL) {
			MCList<Cl_Chk03_CndR> retL = MCList.create(Cl_Chk03_CndR.class);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk01_DtlR.$insp_act_d_no);
			
			for (MST_INSP_ACT_D_R subActDL : actDL) {
				InspAct_Chk01_DtlR upR = up1().getFirst(idxkey, subActDL.insp_act_d_no());
				Cl_Chk03_CndR clCndR = Cl_Chk03_CndR.create();
				clCndR.peg_no(hdrR.peg_no());
				if (!isNull(hdrR.end_tm())) {
					clCndR.ac_dt(upR.ac_dt());
				}
				clCndR.can_ac_dt(upR.can_ac_dt());
				clCndR.loc_cd(subActDL.loc_cd());
				clCndR.itm_cd(subActDL.itm_cd());
				clCndR.itm_sub1(subActDL.itm_sub1());
				clCndR.itm_sub2(subActDL.itm_sub2());
				clCndR.itm_sub3(subActDL.itm_sub3());
				clCndR.old_loc_cd(subActDL.loc_cd());
				clCndR.old_itm_cd(subActDL.itm_cd());
				clCndR.old_itm_sub1(subActDL.itm_sub1());
				clCndR.old_itm_sub2(subActDL.itm_sub2());
				clCndR.old_itm_sub3(subActDL.itm_sub3());
				clCndR.sls_cls_chk_flg(false);
				clCndR.rcv_cls_chk_flg(false);
				clCndR.purc_cls_chk_flg(false);
				clCndR.pay_cls_chk_flg(false);
				clCndR.stk_cls_chk_flg(true);
				clCndR.io_lmt_skip_flg(false);
				clCndR.setAttributes(hdrR);
				retL.add(clCndR);
			}
			
			return retL;
		}

		protected Map_Cl_Chk03_CndR_InspAct_Chk01_DtlR<Cl_Chk03_CndR,InspAct_Chk01_DtlR> createMap_Cl_Chk03_CndR_InspAct_Chk01_DtlR() {
			return new Map_Cl_Chk03_CndR_InspAct_Chk01_DtlR<Cl_Chk03_CndR, InspAct_Chk01_DtlR>();
		}
		
		public class Map_Cl_Chk03_CndR_InspAct_Chk01_DtlR<D extends Cl_Chk03_CndR, S extends InspAct_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, InspAct_Chk01_DtlR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, InspAct_Chk01_DtlR.$can_ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$loc_cd, InspAct_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_cd, InspAct_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, InspAct_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, InspAct_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, InspAct_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Cl_Chk03_CndR.$old_loc_cd, InspAct_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_cd, InspAct_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub1, InspAct_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub2, InspAct_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub3, InspAct_Chk01_DtlR.$itm_sub3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_cls_chk_flg(false);
				dest.rcv_cls_chk_flg(false);
				dest.purc_cls_chk_flg(false);
				dest.pay_cls_chk_flg(false);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(false);
				if (!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.ac_dt(src.ac_dt());
				}
			}
		}
		
		protected Map_Cl_Chk03_CndR_InspAct_Chk01_SmplR<Cl_Chk03_CndR,InspAct_Chk01_SmplR> createMap_Cl_Chk03_CndR_InspAct_Chk01_SmplR() {
			return new Map_Cl_Chk03_CndR_InspAct_Chk01_SmplR<Cl_Chk03_CndR, InspAct_Chk01_SmplR>();
		}
		
		public class Map_Cl_Chk03_CndR_InspAct_Chk01_SmplR<D extends Cl_Chk03_CndR, S extends InspAct_Chk01_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, InspAct_Chk01_SmplR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, InspAct_Chk01_SmplR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, InspAct_Chk01_SmplR.$can_ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$loc_cd, InspAct_Chk01_SmplR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_cd, InspAct_Chk01_SmplR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, InspAct_Chk01_SmplR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, InspAct_Chk01_SmplR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, InspAct_Chk01_SmplR.$itm_sub3);
				addColumnPathMap(Cl_Chk03_CndR.$old_loc_cd, InspAct_Chk01_SmplR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_cd, InspAct_Chk01_SmplR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub1, InspAct_Chk01_SmplR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub2, InspAct_Chk01_SmplR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub3, InspAct_Chk01_SmplR.$itm_sub3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_cls_chk_flg(false);
				dest.rcv_cls_chk_flg(false);
				dest.purc_cls_chk_flg(false);
				dest.pay_cls_chk_flg(false);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(false);
			}
		}
		/**
		 * Chk03仕入実績登録前チェックを実行する
		 * @param notErrL
		 */
		protected void callThisChk03(MCList<InspAct_Chk01_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk03 o = MSBFL_InspActService.crtInspAct_Chk03();

			MCIndexKey actIdx = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			MCIndexKey actdIdx = _actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_d_no);
			MCIndexKey dtlIdx = up1().createIndex(InspAct_Chk01_DtlR.$insp_no);
			MCIndexKey smplIdx = up2().createIndex(InspAct_Chk01_SmplR.$insp_no);

			MCList<InspAct_Chk01_HdrR> tgtHdrL = MCList.create(InspAct_Chk01_HdrR.class);
			MCList<InspAct_Chk01_DtlR> tgtDtlL = MCList.create(InspAct_Chk01_DtlR.class);
			MCList<InspAct_Chk01_SmplR> tgtSmplL = MCList.create(InspAct_Chk01_SmplR.class);
			
			// 検査実績ヘッダとそれに紐付く検査実績明細、検査抜取明細から、Chk03の上り電文を作成する
			for (InspAct_Chk01_HdrR hdr01R : notErrL) {
				// エラーフラグがオンのヘッダを除く
				if (hdr01R.err_flg()) {
					continue;
				}
				
				// ヘッダ
				InspAct_Chk03_HdrR hdr03R = InspAct_Chk03_HdrR.create();
				copy(hdr03R, hdr01R, createMap_InspAct_Chk03_HdrR_InspAct_Chk01_HdrR());
				// 更新前良品区分を検査実績ヘッダから取得
				if (!isNull(hdr01R.insp_act_no())) {
					MST_INSP_ACT_R actR = _actL.getFirst(actIdx, hdr01R.insp_act_no());
					hdr03R.old_quality_typ(actR.quality_typ());
				}
				
				// 実績明細
				for (InspAct_Chk01_DtlR dtl01R : up1().subList(dtlIdx, hdr01R.insp_no())) {
					// エラーフラグがオンの明細を除く
					if (dtl01R.err_flg()) {
						hdr01R.err_flg(true);
						continue;
					}
					tgtDtlL.add(dtl01R);

					InspAct_Chk03_DtlR dtl03R = InspAct_Chk03_DtlR.create();
					copy(dtl03R, dtl01R, createMap_InspAct_Chk03_DtlR_InspAct_Chk01_DtlR());
					dtl03R.hdr_peg_no(hdr03R.peg_no());
					// 更新前良品区分を検査実績明細から取得
					if (!isNull(dtl01R.insp_act_d_no())) {
						MST_INSP_ACT_D_R actdR = _actDL.getFirst(actdIdx, dtl01R.insp_act_d_no());
						dtl03R.old_quality_typ(actdR.quality_typ());
					}
					o.up1().add(dtl03R);
				}
				
				// 抜取明細
				for (InspAct_Chk01_SmplR smpl01R : up2().subList(smplIdx, hdr01R.insp_no())) {
					// エラーフラグがオンの明細を除く
					if (smpl01R.err_flg()) {
						hdr01R.err_flg(true);
						continue;
					}
					tgtSmplL.add(smpl01R);

					InspAct_Chk03_SmplR smpl03R = InspAct_Chk03_SmplR.create();
					copy(smpl03R, smpl01R, createMap_InspAct_Chk03_SmplR_InspAct_Chk01_SmplR());
					smpl03R.hdr_peg_no(hdr03R.peg_no());
					o.up2().add(smpl03R);
				}

				// 実績明細、抜取明細にエラーがなかった場合にヘッダを処理対象とする
				if (hdr01R.err_flg()) {
					continue;
				}

				tgtHdrL.add(hdr01R);
				o.up0().add(hdr03R);
			}
			
			if (o.up0().isEmpty()) {
				return;
			}
			
			o.exec();

			copyErrFlg(tgtHdrL, o.down0());
		}

		protected Map_InspAct_Chk03_HdrR_InspAct_Chk01_HdrR<InspAct_Chk03_HdrR,InspAct_Chk01_HdrR> createMap_InspAct_Chk03_HdrR_InspAct_Chk01_HdrR() {
			return new Map_InspAct_Chk03_HdrR_InspAct_Chk01_HdrR<InspAct_Chk03_HdrR, InspAct_Chk01_HdrR>();
		}

		public class Map_InspAct_Chk03_HdrR_InspAct_Chk01_HdrR<D extends InspAct_Chk03_HdrR, S extends InspAct_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk03_HdrR.$peg_no, InspAct_Chk01_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_no, InspAct_Chk01_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_act_no, InspAct_Chk01_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$src_no1, InspAct_Chk01_HdrR.$src_no1);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_mtd_typ, InspAct_Chk01_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_cd, InspAct_Chk01_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_sub1, InspAct_Chk01_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_sub2, InspAct_Chk01_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_sub3, InspAct_Chk01_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk03_HdrR.$ver_no, InspAct_Chk01_HdrR.$ver_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$quality_typ, InspAct_Chk01_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Chk03_HdrR.$gd_cd, InspAct_Chk01_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Chk03_HdrR.$st_tm, InspAct_Chk01_HdrR.$st_tm);
				addColumnPathMap(InspAct_Chk03_HdrR.$end_tm, InspAct_Chk01_HdrR.$end_tm);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_aprv_sts_typ, InspAct_Chk01_HdrR.$insp_aprv_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 検査実績ＮＯが設定されていれば更新、いなければ新規
				if (isNull(src.insp_act_no())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		protected Map_InspAct_Chk03_DtlR_InspAct_Chk01_DtlR<InspAct_Chk03_DtlR,InspAct_Chk01_DtlR> createMap_InspAct_Chk03_DtlR_InspAct_Chk01_DtlR() {
			return new Map_InspAct_Chk03_DtlR_InspAct_Chk01_DtlR<InspAct_Chk03_DtlR, InspAct_Chk01_DtlR>();
		}

		public class Map_InspAct_Chk03_DtlR_InspAct_Chk01_DtlR<D extends InspAct_Chk03_DtlR, S extends InspAct_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk03_DtlR.$peg_no, InspAct_Chk01_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$data_crud_typ, InspAct_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$insp_no, InspAct_Chk01_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$insp_act_d_no, InspAct_Chk01_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$insp_act_no, InspAct_Chk01_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_cd, InspAct_Chk01_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_sub1, InspAct_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_sub2, InspAct_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_sub3, InspAct_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk03_DtlR.$loc_cd, InspAct_Chk01_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$str_ln_cd, InspAct_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$quality_typ, InspAct_Chk01_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$gd_cd, InspAct_Chk01_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$stk_id_typ, InspAct_Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$fix_no_typ, InspAct_Chk01_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$fix_no, InspAct_Chk01_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$pack_unit_qty, InspAct_Chk01_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk03_DtlR.$pack_unit_cd, InspAct_Chk01_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$base_unit_qty, InspAct_Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk03_DtlR.$base_unit_cd, InspAct_Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$lot_no, InspAct_Chk01_DtlR.$lot_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$sublot_no, InspAct_Chk01_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$ac_dt, InspAct_Chk01_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Chk03_DtlR.$can_ac_dt, InspAct_Chk01_DtlR.$can_ac_dt);
				addColumnPathMap(InspAct_Chk03_DtlR.$rmrks_upd_flg, InspAct_Chk01_DtlR.$rmrks_upd_flg);
			}
		}

		protected Map_InspAct_Chk03_SmplR_InspAct_Chk01_SmplR<InspAct_Chk03_SmplR,InspAct_Chk01_SmplR> createMap_InspAct_Chk03_SmplR_InspAct_Chk01_SmplR() {
			return new Map_InspAct_Chk03_SmplR_InspAct_Chk01_SmplR<InspAct_Chk03_SmplR, InspAct_Chk01_SmplR>();
		}

		public class Map_InspAct_Chk03_SmplR_InspAct_Chk01_SmplR<D extends InspAct_Chk03_SmplR, S extends InspAct_Chk01_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk03_SmplR.$peg_no, InspAct_Chk01_SmplR.$peg_no);
				addColumnPathMap(InspAct_Chk03_SmplR.$insp_no, InspAct_Chk01_SmplR.$insp_no);
				addColumnPathMap(InspAct_Chk03_SmplR.$data_crud_typ, InspAct_Chk01_SmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk03_SmplR.$insp_smpl_act_no, InspAct_Chk01_SmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Chk03_SmplR.$insp_act_no, InspAct_Chk01_SmplR.$insp_act_no);
				addColumnPathMap(InspAct_Chk03_SmplR.$pack_xfr_pack_unit_qty, InspAct_Chk01_SmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk03_SmplR.$pack_xfr_pack_unit_cd, InspAct_Chk01_SmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk03_SmplR.$pack_xfr_base_unit_qty, InspAct_Chk01_SmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk03_SmplR.$pack_xfr_base_unit_cd, InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd);
			}
		}
	}
	/**
	 * InspAct_Chk02オペレーション.<p>
	 *
	 * 検査実績の判定前にチェックを行う。<br>
	 */
	public class InspAct_Chk02 extends MSBFL_InspActService_MC_A.InspAct_Chk02 {
		protected MCList<MST_INSP_ACT_D_R> _actDL = MCList.create(MST_INSP_ACT_D_R.class);
		protected MST_INSP_ACT_D_R _actDL_t = MST_INSP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(_actDL_t);
		protected MCList<MST_STK_R> _stkL = MCList.create(MST_STK_R.class);
		protected MST_STK_R _stkL_t = MST_STK_R.create("T");
		protected MCQueryApiBuilder _stkL_bldr = MCQueryApiBuilder.create(_stkL_t);
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCList<MST_ITM_MFG_INST_R> _itmMfgInstPrdctL = MCList.create(MST_ITM_MFG_INST_R.class);
		protected MST_ITM_MFG_INST_R _itmMfgInstPrdctL_t = MST_ITM_MFG_INST_R.create("T");
		protected MCQueryApiBuilder _itmMfgInstPrdctL_bldr = MCQueryApiBuilder.create(_itmMfgInstPrdctL_t);
		protected MCList<MST_MFG_ACT_R> _mfgActPrdctL = MCList.create(MST_MFG_ACT_R.class);
		protected MST_MFG_ACT_R _mfgActPrdctL_t = MST_MFG_ACT_R.create("T");
		protected MCQueryApiBuilder _mfgActPrdctL_bldr = MCQueryApiBuilder.create(_mfgActPrdctL_t);
		
		protected MCIndexKey _schdIdxkey = null;
		protected MCIndexKey _itmMfgInstPrdctIdxkey = null;
		protected MCIndexKey _mfgActPrdctIdxkey = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<InspAct_Chk02_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callPlntAprvChk01(notErrL);
				callClChk03(notErrL);
				callThisChk03(notErrL);
			}
			
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			getInspL();

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_INST_S02", instL, instL_bldr, up0());
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_ACT_S02", actL, actL_bldr, up0());
			_actL = actL;
			
			MCIndexKey instIdxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey actIdxkey = actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (InspAct_Chk02_HdrR r : up0()) {
				MST_INSP_INST_R instR = instL.getFirst(instIdxkey, r.insp_no());
				MST_INSP_ACT_R actR = actL.getFirst(actIdxkey, r.insp_act_no());
				if (!isNull(instR)) {
					r.aprv_dt(instR.aprv_dt());
					r.insp_aprv_role_cd(instR.insp_aprv_role_cd());
				}
				if (!isNull(actR)) {
					r.end_tm(actR.end_tm().trunc(MCDateFieldType.DAY));
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			chkInspAct(msgL);
			chkAprvRole(msgL);
			
			return msgL;
		}

		/**
		 * 検査関連情報を取得する。
		 * 
		 */
		protected void getInspL() {
			
			// 検査実績明細情報取得
			_actDL_bldr.setWhere(_actDL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_D_S04", _actDL, _actDL_bldr, up0());

			// 現状在庫情報取得
			MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");
			MST_INSP_INST_R t3 = MST_INSP_INST_R.create("T3");
			_stkL_bldr.addSelect(t2.insp_no);
			_stkL_bldr.addInnerJoin(t2, bracket(
					bracket(t2.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value()))
							.and(_stkL_t.fix_no.eq(t2.src_no4))
							.and(_stkL_t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value()))))
						.or(t2.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))
								.and(_stkL_t.fix_no.eq(t2.src_no4))
								.and(_stkL_t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.YIELD_ACT_NO.value()))))
						.or(t2.insp_typ.eq(value(MSC_INSP_TYP.LOT.value()))
								.and(_stkL_t.fix_no.eq(t2.insp_schd_no))
								.and(_stkL_t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.INSP_SCHD_NO.value()))))
						)
					);
			_stkL_bldr.addInnerJoin(t3, bracket(t2.insp_no.eq(t3.insp_no)));
			_stkL_bldr.setWhere(t2.insp_no.eq(bind("insp_no")));

			dbSelect("MSBFL5050_MST_STK_S02", _stkL, _stkL_bldr, up0());
			MCList<MST_INSP_ACT_R> bindL = _actL.subList(r -> MSC_INSP_TYP.isPRDCT(r.insp_typ()));
			if (!bindL.isEmpty()) {
				_schdL_bldr.setSelect(
						_schdL_t.insp_no,
						_schdL_t.src_no1,
						_schdL_t.src_no2,
						_schdL_t.src_no3,
						_schdL_t.src_no4,
						_schdL_t.insp_typ);
				_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
				dbSelect("MSBFL5050_MST_INSP_SCHD_S02", _schdL, _schdL_bldr, _actL);
				_schdIdxkey = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);

				MST_OPER_INST_R t4 = MST_OPER_INST_R.create("T4");
				MST_OPER_ACT_R t5 = MST_OPER_ACT_R.create("T5");
				_itmMfgInstPrdctL_bldr.setSelect(_itmMfgInstPrdctL_t.itm_mfg_inst_no);
				_itmMfgInstPrdctL_bldr.addSelect(t5.st_act_tm);
				_itmMfgInstPrdctL_bldr.addSelect(t5.end_act_tm);
				_itmMfgInstPrdctL_bldr.addInnerJoin(t4, _itmMfgInstPrdctL_t.itm_mfg_inst_no.eq(t4.itm_mfg_inst_no));
				_itmMfgInstPrdctL_bldr.addLeftOuterJoin(t5, t4.oper_inst_no.eq(t5.oper_inst_no));
				_itmMfgInstPrdctL_bldr.setWhere(t4.lmt_fr_dt_flg.eq(value(true)));
				_itmMfgInstPrdctL_bldr.addWhereWithAnd(_itmMfgInstPrdctL_t.itm_mfg_inst_no.eq(bind("src_no2")));
				dbSelect("MSBFL5050_MST_ITM_MFG_INST_S02", _itmMfgInstPrdctL, _itmMfgInstPrdctL_bldr, bindL);
				_itmMfgInstPrdctIdxkey = _itmMfgInstPrdctL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);

				_mfgActPrdctL_bldr.setSelect(_mfgActPrdctL_t.itm_mfg_inst_no);
				_mfgActPrdctL_bldr.addSelect(_mfgActPrdctL_t.st_act_tm);
				_mfgActPrdctL_bldr.setWhere(_mfgActPrdctL_t.itm_mfg_inst_no.eq(bind("src_no2")));
				dbSelect("MSBFL5050_MST_MFG_ACT_S02", _mfgActPrdctL, _mfgActPrdctL_bldr, bindL);
				_mfgActPrdctIdxkey = _mfgActPrdctL.createIndex(MST_MFG_ACT_R.$itm_mfg_inst_no);
			}
		}

		protected void chkInspAct(MCMessageList msgL) {
			MCIndexKey stkIdxkey = _stkL.createIndex("INSP_NO");
			MCIndexKey actDIdxkey = _actDL.createIndex(MST_INSP_ACT_D_R.$insp_act_no);
			MCIndexKey actIdxkey = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);

			for (InspAct_Chk02_HdrR r : up0()) {
				if (!MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0054, 
							r.insp_no(), r.insp_act_no(), r.insp_sts_typ(), toDispGUIIndex(r)));
				}
				if (!MSC_INSP_APRV_STS_TYP.isJUDG_OPN(r.insp_aprv_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0055, 
							r.insp_no(), r.insp_act_no(), r.insp_aprv_sts_typ(), toDispGUIIndex(r)));
				}
				// 再検査の場合、現状在庫が存在するか判定
				if (MSC_INSP_JUDG_RSLT_TYP.isRE(r.insp_judg_rslt_typ())) {
					MCList<MST_STK_R> stkL = _stkL.subList(stkIdxkey, r.insp_no());
					MCList<MST_INSP_ACT_D_R> actDL = _actDL.subList(actDIdxkey, r.insp_act_no());
					if (stkL.isEmpty() && !actDL.isEmpty()) {
						msgL.add(new MCMessage(r, null, MSBFL0115, 
								r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
					}
				}
				MST_INSP_ACT_R actR = _actL.getFirst(actIdxkey, r.insp_act_no());
				String strJudgRsltTyp = r.insp_judg_rslt_typ();
				if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
					MCList<MST_INSP_ACT_D_R> actDL = _actDL.subList(actDIdxkey, r.insp_act_no());
					if (isNull(actDL.getFirst(MST_INSP_ACT_D_R.$quality_typ,
							MAC_QUALITY_TYP.GOOD.value()))
							&& (MSC_INSP_JUDG_RSLT_TYP.isOK(strJudgRsltTyp)
									|| MSC_INSP_JUDG_RSLT_TYP.isSP(strJudgRsltTyp))) {
						msgL.add(new MCMessage(r, null, MSBFL0129, r.insp_no(), toDispGUIIndex(r)));
					}
				}
				else {
					if (!MAC_QUALITY_TYP.isGOOD(actR.quality_typ())
							&& (MSC_INSP_JUDG_RSLT_TYP.isOK(strJudgRsltTyp)
									|| MSC_INSP_JUDG_RSLT_TYP.isSP(strJudgRsltTyp))) {
						msgL.add(new MCMessage(r, null, MSBFL0128, r.insp_no(), toDispGUIIndex(r)));
					}
				}
				if (MSC_INSP_TYP.isPRDCT(actR.insp_typ()) && r.vld_dt_upd_flg() && MSC_INSP_JUDG_RSLT_TYP.isOK(r.insp_judg_rslt_typ())) {
					if (MAC_LMT_DT_FRM_TYP.isMFG_ST(r.lmt_dt_frm_typ())) {
						if (isMfgStChkTgt(actR)) {
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt_frm, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$vld_dt, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt, new FXUCL_RequiredValidater()));
						}
					}
					else if (MAC_LMT_DT_FRM_TYP.isMFG_CMPL(r.lmt_dt_frm_typ())) {
						if (isMfgCmplChkTgt(actR)) {
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt_frm, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$vld_dt, new FXUCL_RequiredValidater()));
							msgL.addAll(check(r, InspAct_Chk01_HdrR.$lmt_dt, new FXUCL_RequiredValidater()));
						}
					}
				}
				setErrFlg(r, msgL);
			}
		}
		
		protected boolean isMfgStChkTgt(MST_INSP_ACT_R actR) {
			MCList<MST_ITM_MFG_INST_R> subItmMfgInstL = _itmMfgInstPrdctL.subList(_itmMfgInstPrdctIdxkey, actR.src_no2());
			if (!isNull(subItmMfgInstL)) {
				return !isNull(
						subItmMfgInstL.subList(r -> !isNull(r.getDateNE("ST_ACT_TM"))));
			}
			else {
				return !isNull(_mfgActPrdctL.subList(_mfgActPrdctIdxkey, actR.src_no2()));
			}
		}
		protected boolean isMfgCmplChkTgt(MST_INSP_ACT_R actR) {
			MCList<MST_ITM_MFG_INST_R> subItmMfgInstL = _itmMfgInstPrdctL.subList(_itmMfgInstPrdctIdxkey, actR.src_no2());
			if (!isNull(subItmMfgInstL)) {
				return !isNull(
						subItmMfgInstL.subList(r -> !isNull(r.getDateNE("END_ACT_TM"))));
			}
			else {
				MCList<MST_INSP_SCHD_R> subSchdL = _schdL.subList(_schdIdxkey, actR.insp_no());
				return !isNull(subSchdL.subList(sr -> !isNull(sr.src_no4())));
			}
		}
		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @return
		 */
		protected void chkAprvRole(MCMessageList msgL) {
			for (InspAct_Chk02_HdrR upR : up0()) {

				// 権限チェック
				if (!isAprvUsrR(upR.insp_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
			}
		}

		/**
		 * ログインユーザの承認役割権限チェックを行う。
		 * 
		 * @param roleCd 役割ＣＤ
		 * @return 
		 */
		protected boolean isAprvUsrR(String roleCd) {
			String loginUsrId = mcframe.serverCore.sys.MCSys.user.ID();

			MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
			int cnt = execDbCount("MSBFL5050_MAVM_APRV_USR_S01", t,
					t.aprv_role_cd.eq(bind("1"))
							.and(t.usr_cd.eq(bind("2")))
							.and(t.st_dt.lte(bind("3")))
							.and(t.end_dt.isNull().or(t.end_dt.gte(bind("3")))),
					roleCd, loginUsrId, getToday());

			return cnt > 0;
		}

		protected void setDown() {
			copyErrFlgByInspNo(up0(), up1(), InspAct_Chk02_HdrR.$insp_no, InspAct_Chk02_DtlR.$insp_no);
			down0().setAll(up0());
		}
		
		protected void callPlntAprvChk01(MCList<InspAct_Chk02_HdrR> notErrL) {
			MSBFL_PlntAprvService.PlntAprv_Chk01 o = MSBFL_PlntAprvService.crtPlntAprv_Chk01();
			
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t1);
			schdL_bldr.setWhere(t1.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S03", schdL, schdL_bldr, notErrL);
			MCIndexKey schdIdx = schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t2);
			instL_bldr.setWhere(t2.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_INST_S03", instL, instL_bldr, notErrL);
			MCIndexKey instIdx = instL.createIndex(MST_INSP_INST_R.$insp_no);
			
			for (InspAct_Chk02_HdrR r : notErrL) {
				MST_INSP_INST_R instR = instL.getFirst(instIdx, r.insp_no());
				
				if (!isPlntAprv(r, instR)) {
					continue;
				}
				
				MCList<MST_INSP_SCHD_R> subSchdL = schdL.subList(schdIdx, r.insp_no());
				
				for (MST_INSP_SCHD_R schdR : subSchdL) {
					PlntAprv_Chk01_RsltR oR = PlntAprv_Chk01_RsltR.create();
					
					oR.peg_no(r.peg_no());
					oR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					oR.plnt_aprv_no(null);
					oR.plnt_aprv_d_no(null);
					oR.insp_typ(r.insp_typ());
					oR.insp_no(r.insp_no());
					oR.src_no1(schdR.src_no1());
					oR.src_no2(schdR.src_no2());
					oR.src_no3(schdR.src_no3());
					oR.src_no4(schdR.src_no4());
					oR.itm_cd(r.itm_cd());
					oR.itm_sub1(r.itm_sub1());
					oR.itm_sub2(r.itm_sub2());
					oR.itm_sub3(r.itm_sub3());
					oR.lot_no(r.lot_no());
					oR.sublot_no(r.sublot_no());
					oR.loc_cd(schdR.loc_cd());
					oR.setAttributes(r);
					
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(notErrL, o.down0());
			}
		}
		
		protected boolean isPlntAprv(InspAct_Chk02_HdrR r, MST_INSP_INST_R instR) {
			if (!instR.plnt_aprv_flg()) {
				return false;
			}
			if (!MSC_INSP_JUDG_RSLT_TYP.is_stk_good(r.insp_judg_rslt_typ())) {
				return false;
			}
			return true;
		}
		
		protected void callClChk03(MCList<InspAct_Chk02_HdrR> notErrL) {
			MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
			
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk02_DtlR.$insp_no);
			MCList<InspAct_Chk02_DtlR> dtlL = MCList.create(InspAct_Chk02_DtlR.class);
			for (InspAct_Chk02_HdrR hdr : notErrL) {
				dtlL.addAll(up1().subList(idxkey, hdr.insp_no()));
			}
			setAll(o.up0(), dtlL, createMap_Cl_Chk03_CndR_InspAct_Chk02_DtlR());
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(dtlL, o.down0());
			}
		}
		
		protected Map_Cl_Chk03_CndR_InspAct_Chk02_DtlR<Cl_Chk03_CndR,InspAct_Chk02_DtlR> createMap_Cl_Chk03_CndR_InspAct_Chk02_DtlR() {
			return new Map_Cl_Chk03_CndR_InspAct_Chk02_DtlR<Cl_Chk03_CndR, InspAct_Chk02_DtlR>();
		}
		
		public class Map_Cl_Chk03_CndR_InspAct_Chk02_DtlR<D extends Cl_Chk03_CndR, S extends InspAct_Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, InspAct_Chk02_DtlR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, InspAct_Chk02_DtlR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$loc_cd, InspAct_Chk02_DtlR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_cd, InspAct_Chk02_DtlR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, InspAct_Chk02_DtlR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, InspAct_Chk02_DtlR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, InspAct_Chk02_DtlR.$itm_sub3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_cls_chk_flg(false);
				dest.rcv_cls_chk_flg(false);
				dest.purc_cls_chk_flg(false);
				dest.pay_cls_chk_flg(false);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(false);
			}
		}

		/**
		 * Chk03仕入実績登録前チェックを実行する
		 * @param notErrL
		 */
		protected void callThisChk03(MCList<InspAct_Chk02_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk03 o = MSBFL_InspActService.crtInspAct_Chk03();

			MCIndexKey actIdx = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			MCIndexKey dtlIdx = up1().createIndex(InspAct_Chk02_DtlR.$insp_no);

			MCList<InspAct_Chk02_HdrR> tgtHdrL = MCList.create(InspAct_Chk02_HdrR.class);
			MCList<InspAct_Chk02_DtlR> tgtDtlL = MCList.create(InspAct_Chk02_DtlR.class);
			
			// 検査実績ヘッダとそれに紐付く検査実績明細、検査抜取明細から、Chk03の上り電文を作成する
			for (InspAct_Chk02_HdrR hdr02R : notErrL) {
				// エラーフラグがオンのヘッダを除く
				if (hdr02R.err_flg()) {
					continue;
				}
				
				// ヘッダ
				InspAct_Chk03_HdrR hdr03R = InspAct_Chk03_HdrR.create();
				copy(hdr03R, hdr02R, createMap_InspAct_Chk03_HdrR_InspAct_Chk02_HdrR());
				// 検査実績ヘッダから取得
				if (!isNull(hdr02R.insp_act_no())) {
					MST_INSP_ACT_R actR = _actL.getFirst(actIdx, hdr02R.insp_act_no());
					hdr03R.src_no1(actR.src_no1());
					hdr03R.insp_mtd_typ(actR.insp_mtd_typ());
					hdr03R.quality_typ(actR.quality_typ());
					hdr03R.gd_cd(actR.gd_cd());
				}
				
				// 実績明細
				for (InspAct_Chk02_DtlR dtl02R : up1().subList(dtlIdx, hdr02R.insp_no())) {
					// エラーフラグがオンの明細を除く
					if (dtl02R.err_flg()) {
						hdr02R.err_flg(true);
						continue;
					}
					tgtDtlL.add(dtl02R);

					InspAct_Chk03_DtlR dtl03R = InspAct_Chk03_DtlR.create();
					copy(dtl03R, dtl02R, createMap_InspAct_Chk03_DtlR_InspAct_Chk02_DtlR());
					dtl03R.hdr_peg_no(hdr03R.peg_no());
					o.up1().add(dtl03R);
				}

				// 実績明細にエラーがなかった場合にヘッダを処理対象とする
				if (hdr02R.err_flg()) {
					continue;
				}

				tgtHdrL.add(hdr02R);
				o.up0().add(hdr03R);
			}
			
			if (o.up0().isEmpty()) {
				return;
			}
			
			o.exec();

			copyErrFlg(tgtHdrL, o.down0());
		}

		protected Map_InspAct_Chk03_HdrR_InspAct_Chk02_HdrR<InspAct_Chk03_HdrR,InspAct_Chk02_HdrR> createMap_InspAct_Chk03_HdrR_InspAct_Chk02_HdrR() {
			return new Map_InspAct_Chk03_HdrR_InspAct_Chk02_HdrR<InspAct_Chk03_HdrR, InspAct_Chk02_HdrR>();
		}

		public class Map_InspAct_Chk03_HdrR_InspAct_Chk02_HdrR<D extends InspAct_Chk03_HdrR, S extends InspAct_Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk03_HdrR.$peg_no, InspAct_Chk02_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_no, InspAct_Chk02_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_act_no, InspAct_Chk02_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_cd, InspAct_Chk02_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_sub1, InspAct_Chk02_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_sub2, InspAct_Chk02_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk03_HdrR.$itm_sub3, InspAct_Chk02_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk03_HdrR.$ver_no, InspAct_Chk02_HdrR.$ver_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$judg_dt, InspAct_Chk02_HdrR.$judg_dt);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_judg_rslt_typ, InspAct_Chk02_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_aprv_sts_typ, InspAct_Chk02_HdrR.$insp_aprv_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 検査判定時に訂正はない
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.judg_flg(true);
			}
		}

		protected Map_InspAct_Chk03_DtlR_InspAct_Chk02_DtlR<InspAct_Chk03_DtlR,InspAct_Chk02_DtlR> createMap_InspAct_Chk03_DtlR_InspAct_Chk02_DtlR() {
			return new Map_InspAct_Chk03_DtlR_InspAct_Chk02_DtlR<InspAct_Chk03_DtlR, InspAct_Chk02_DtlR>();
		}

		public class Map_InspAct_Chk03_DtlR_InspAct_Chk02_DtlR<D extends InspAct_Chk03_DtlR, S extends InspAct_Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk03_DtlR.$peg_no, InspAct_Chk02_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$data_crud_typ, InspAct_Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$insp_no, InspAct_Chk02_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$insp_act_no, InspAct_Chk02_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_cd, InspAct_Chk02_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_sub1, InspAct_Chk02_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_sub2, InspAct_Chk02_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk03_DtlR.$itm_sub3, InspAct_Chk02_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk03_DtlR.$loc_cd, InspAct_Chk02_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$str_ln_cd, InspAct_Chk02_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$quality_typ, InspAct_Chk02_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$gd_cd, InspAct_Chk02_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$stk_id_typ, InspAct_Chk02_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$fix_no_typ, InspAct_Chk02_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk03_DtlR.$fix_no, InspAct_Chk02_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$pack_unit_qty, InspAct_Chk02_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk03_DtlR.$pack_unit_cd, InspAct_Chk02_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$base_unit_qty, InspAct_Chk02_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk03_DtlR.$base_unit_cd, InspAct_Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk03_DtlR.$lot_no, InspAct_Chk02_DtlR.$lot_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$sublot_no, InspAct_Chk02_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Chk03_DtlR.$ac_dt, InspAct_Chk02_DtlR.$ac_dt);
			}
		}
	}
	/**
	 * InspAct_Chk04オペレーション.<p>
	 *
	 * 検査実績の取消前にチェックを行う。<br>
	 */
	public class InspAct_Chk04 extends MSBFL_InspActService_MC_A.InspAct_Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<InspAct_Chk04_HdrR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callClChk03(notErrL);
				callThisChk03(notErrL);
			}
			
			setDown();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 補完処理
			compData();

			return msgL;
		}
		protected void compData() {
			MCList<MST_INSP_JUDG_D_R> judgdL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t1 = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder judgdL_bldr = MCQueryApiBuilder.create(t1);
			judgdL_bldr.setSelect(t1.fix_no, t1.fix_no_typ, t1.insp_act_no, t1.ac_dt,
					t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.pack_unit_cd);
			judgdL_bldr.setWhere(t1.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_JUDG_D_S01", judgdL, judgdL_bldr, up0());
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t2 = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t2);
			actdL_bldr.setSelect(t2.insp_act_d_no, t2.insp_act_no, t2.fix_no_typ, t2.fix_no, t2.ac_dt,
					t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t2.pack_unit_cd);
			actdL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_D_S05", actdL, actdL_bldr, up0());
			MCList<MST_INSP_STT_D_R> sttdL = MCList.create(MST_INSP_STT_D_R.class);
			MST_INSP_STT_D_R t3 = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttdL_bldr = MCQueryApiBuilder.create(t3);
			sttdL_bldr.setSelect(t3.insp_act_no, t3.ac_dt,
					t3.itm_cd, t3.itm_sub1, t3.itm_sub2, t3.itm_sub3, t3.pack_unit_cd);
			sttdL_bldr.setWhere(t3.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_STT_D_S02", sttdL, sttdL_bldr, up0());
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t4 = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t4);
			smplL_bldr.setSelect(t4.insp_smpl_act_no, t4.insp_act_no, t4.ac_dt);
			smplL_bldr.setWhere(t4.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S03", smplL, smplL_bldr, up0());
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t5 = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t5);
			instL_bldr.setSelect(t5.insp_no, t5.insp_mtd_typ);
			dbSelectKey("MSBFL5050_MST_INSP_INST_S04", instL, instL_bldr, up0());

			MCIndexKey instIdx = instL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey sttDIdx = sttdL.createIndex(MST_INSP_STT_D_R.$insp_act_no);
			MCIndexKey actDIdx = actdL.createIndex(MST_INSP_ACT_D_R.$insp_act_no);
			MCIndexKey judgDIdx = judgdL.createIndex(MST_INSP_JUDG_D_R.$insp_act_no);
			MCIndexKey idxkey = smplL.createIndex(MST_INSP_SMPL_ACT_R.$insp_act_no);
			MCIndexKey dtlIdx = up1().createIndex(InspAct_Chk04_DtlR.$insp_act_no);
			MCIndexKey smplIdx = up2().createIndex(InspAct_Chk04_SmplR.$insp_act_no);

			MCList<InspAct_Chk04_DtlR> addDtlL = MCList.create(InspAct_Chk04_DtlR.class);
			MCList<InspAct_Chk04_SmplR> addSmplL = MCList.create(InspAct_Chk04_SmplR.class);

			for (InspAct_Chk04_HdrR hdrR : up0()) {
				MST_INSP_INST_R instR = instL.getFirst(instIdx, hdrR.insp_no());
				if (up1().subList(dtlIdx, hdrR.insp_act_no()).isEmpty()) {
					if (MSC_INSP_STS_TYP.isSTR(hdrR.insp_sts_typ())) {
						if (!MAC_INSP_MTD_TYP.isTTL(instR.insp_mtd_typ())) {
							for (MST_INSP_STT_D_R sttDR : sttdL.subList(sttDIdx, hdrR.insp_act_no())) {
								InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
								dtlR.insp_act_no(sttDR.insp_act_no());
								dtlR.can_ac_dt(sttDR.ac_dt());
								dtlR.itm_cd(sttDR.itm_cd());
								dtlR.itm_sub1(sttDR.itm_sub1());
								dtlR.itm_sub2(sttDR.itm_sub2());
								dtlR.itm_sub3(sttDR.itm_sub3());
								dtlR.pack_unit_cd(sttDR.pack_unit_cd());
								dtlR.setAttributes(hdrR);
								addDtlL.add(dtlR);
							}
						}
						else {
							for (MST_INSP_ACT_D_R actDR : actdL.subList(actDIdx, hdrR.insp_act_no())) {
								InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
								dtlR.insp_act_d_no(actDR.insp_act_d_no());
								dtlR.insp_act_no(actDR.insp_act_no());
								dtlR.can_ac_dt(actDR.ac_dt());
								dtlR.itm_cd(actDR.itm_cd());
								dtlR.itm_sub1(actDR.itm_sub1());
								dtlR.itm_sub2(actDR.itm_sub2());
								dtlR.itm_sub3(actDR.itm_sub3());
								dtlR.pack_unit_cd(actDR.pack_unit_cd());
								dtlR.setAttributes(hdrR);
								addDtlL.add(dtlR);
							}

							// 検査実績明細が存在しない場合、検査着手明細から取消計上日を設定
							if (actdL.subList(actDIdx, hdrR.insp_act_no()).isEmpty()) {
								for (MST_INSP_STT_D_R sttDR : sttdL.subList(sttDIdx, hdrR.insp_act_no())) {
									InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
									dtlR.insp_act_no(sttDR.insp_act_no());
									dtlR.can_ac_dt(sttDR.ac_dt());
									dtlR.itm_cd(sttDR.itm_cd());
									dtlR.itm_sub1(sttDR.itm_sub1());
									dtlR.itm_sub2(sttDR.itm_sub2());
									dtlR.itm_sub3(sttDR.itm_sub3());
									dtlR.pack_unit_cd(sttDR.pack_unit_cd());
									dtlR.setAttributes(hdrR);
									addDtlL.add(dtlR);
								}
							}
						}
					}
					else if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())
							&& !MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ())) {
						for (MST_INSP_ACT_D_R actDR : actdL.subList(actDIdx, hdrR.insp_act_no())) {
							InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
							dtlR.insp_act_d_no(actDR.insp_act_d_no());
							dtlR.insp_act_no(actDR.insp_act_no());
							dtlR.can_ac_dt(actDR.ac_dt());
							dtlR.itm_cd(actDR.itm_cd());
							dtlR.itm_sub1(actDR.itm_sub1());
							dtlR.itm_sub2(actDR.itm_sub2());
							dtlR.itm_sub3(actDR.itm_sub3());
							dtlR.pack_unit_cd(actDR.pack_unit_cd());
							dtlR.setAttributes(hdrR);
							addDtlL.add(dtlR);
						}
					}
					else if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())
							&& (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ()))) {
						for (MST_INSP_JUDG_D_R judgDR : judgdL.subList(judgDIdx, hdrR.insp_act_no())) {
							InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
							dtlR.fix_no(judgDR.fix_no());
							dtlR.fix_no_typ(judgDR.fix_no_typ());
							dtlR.can_ac_dt(judgDR.ac_dt());
							dtlR.insp_act_no(judgDR.insp_act_no());
							dtlR.itm_cd(judgDR.itm_cd());
							dtlR.itm_sub1(judgDR.itm_sub1());
							dtlR.itm_sub2(judgDR.itm_sub2());
							dtlR.itm_sub3(judgDR.itm_sub3());
							dtlR.pack_unit_cd(judgDR.pack_unit_cd());
							dtlR.setAttributes(hdrR);
							addDtlL.add(dtlR);
						}	
					}
				}

				// 抜取検査を補完する
				if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ())) {
					continue;
				}
				if (MAC_INSP_MTD_TYP.isTTL(instR.insp_mtd_typ())) {
					continue;
				}
				if (up2().subList(smplIdx, hdrR.insp_act_no()).isEmpty()) {
					for (MST_INSP_SMPL_ACT_R smplActR : smplL.subList(idxkey, hdrR.insp_act_no())) {
						InspAct_Chk04_SmplR smplR = InspAct_Chk04_SmplR.create();
						smplR.insp_smpl_act_no(smplActR.insp_smpl_act_no());
						smplR.can_ac_dt(smplActR.ac_dt());
						smplR.setAttributes(hdrR);
						addSmplL.add(smplR);
					}
				}
			}
			
			up1().addAll(addDtlL);
			up2().addAll(addSmplL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			chkPlntAprv(msgL);
			chkReSchd(msgL);
			chkAprvRole(msgL);
			msgL.addAll(chkPackUnit());
			msgL.addAll(chkInspAct());

			return msgL;
		}
		
		protected void chkPlntAprv(MCMessageList msgL) {
			MCList<MST_PLNT_APRV_D_R> plntAprvDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MST_PLNT_APRV_D_R t = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder plntAprvDL_bldr = MCQueryApiBuilder.create(t);
			MST_PLNT_APRV_R t1 = MST_PLNT_APRV_R.create("T1");
			plntAprvDL_bldr.setSelect(t.plnt_aprv_d_no);
			plntAprvDL_bldr.addSelect(t.plnt_aprv_no);
			plntAprvDL_bldr.addSelect(t.insp_no);
			plntAprvDL_bldr.addInnerJoin(t1, t.plnt_aprv_no.eq(t1.plnt_aprv_no));
			plntAprvDL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			plntAprvDL_bldr.addWhereWithAnd(t1.plnt_aprv_sts_typ.in(bind("1"), bind("2")),
					MSC_PLNT_APRV_STS_TYP.ACPT.value(),
					MSC_PLNT_APRV_STS_TYP.RJCT.value());
			dbSelect("MSBFL5050_MST_PLNT_APRV_D_S01", plntAprvDL, plntAprvDL_bldr, up0());
			
			MCIndexKey idx = plntAprvDL.createIndex(MST_PLNT_APRV_D_R.$insp_no);
			for (InspAct_Chk04_HdrR r : up0()) {
				MST_PLNT_APRV_D_R plntAprvDR = plntAprvDL.getFirst(idx, r.insp_no());
				
				if (!isNull(plntAprvDR)) {
					msgL.add(new MCMessage(r, null, MSBFL0056, 
							r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		
		protected void chkReSchd(MCMessageList msgL) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(t.own_insp_no);
			schdL_bldr.setWhere(t.own_insp_no.eq(bind("insp_no")));
			schdL_bldr.addWhereWithAnd(t.insp_schd_sts_typ.eq(bind("1")), MSC_INSP_STS_TYP.ORD.value());
			dbSelect("MSBFL5050_MST_INSP_SCHD_S04", schdL, schdL_bldr, up0());
			MCIndexKey idx = schdL.createIndex(MST_INSP_SCHD_R.$own_insp_no);
			
			for (InspAct_Chk04_HdrR r : up0()) {
				if (!MSC_INSP_JUDG_RSLT_TYP.isRE(r.insp_judg_rslt_typ())) {
					continue;
				}
				
				MST_INSP_SCHD_R schdR = schdL.getFirst(idx, r.insp_no());
				if (!isNull(schdR)) {
					msgL.add(new MCMessage(r, null, MSBFL0057, 
							r.insp_no(), r.insp_act_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		
		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @return
		 */
		protected void chkAprvRole(MCMessageList msgL) {
			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_INST_S05", selectL, selectL_bldr, up0());
			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			
			for (InspAct_Chk04_HdrR upR : up0()) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, upR.insp_no());
				
				// 権限チェック
				if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(upR.insp_aprv_sts_typ()) && !isAprvUsrR(selectR.insp_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
					upR.err_flg(true);
				}
			}
		}

		protected MCMessageList chkPackUnit() {
			MCMessageList msgL = new MCMessageList();
			MCList<MAVM_ITM_UNIT_R> bindL = MCList.create(MAVM_ITM_UNIT_R.class);
			for (InspAct_Chk04_DtlR r : up1()) {
				MAVM_ITM_UNIT_R bindR = MAVM_ITM_UNIT_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.unit_cd(r.pack_unit_cd());
				bindL.add(bindR);
			}
			MCList<MAVM_ITM_UNIT_R> packUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			MAVM_ITM_UNIT_R t1 = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder packUnitL_bldr = MCQueryApiBuilder.create(t1);
			packUnitL_bldr.setSelect(t1.itm_cd, t1.itm_sub1, t1.itm_sub2, t1.itm_sub3, t1.unit_cd);
			dbSelectKey("MSBFL5050_MAVM_ITM_UNIT_S01", packUnitL, packUnitL_bldr, bindL);

			MCIndexKey idx = packUnitL.createIndex(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,
					MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
			for(InspAct_Chk04_DtlR up1R : up1()) {
				MAVM_ITM_UNIT_R packUnit = packUnitL.getFirst(idx, up1R.itm_cd(),up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), up1R.pack_unit_cd());
				if(isNull(packUnit)) {
					msgL.add(new MCMessage(up1R, null, MSBFL0143,toDispItm(up1R.itm_cd(), up1R.itm_sub1(),
							up1R.itm_sub2(), up1R.itm_sub3()), up1R.pack_unit_cd(), toDispGUIIndex(up1R)));
					InspAct_Chk04_HdrR up0R = up0().getFirst(InspAct_Chk04_HdrR.$insp_act_no, up1R.insp_act_no());
					up0R.err_flg(true);
				}
			}
			return msgL;
		}

		/**
		 * 在庫識別区分が仕入検収前の場合、仕入実績登録済チェック
		 */
		protected MCMessageList chkInspAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<InspAct_Chk04_HdrR> chkL = MCList.create(InspAct_Chk04_HdrR.class);
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_ACT_S03", actL, actL_bldr, up0());
			
			MCIndexKey actIdxkey = actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (InspAct_Chk04_HdrR r : up0()) {
				MST_INSP_ACT_R actR = actL.getFirst(actIdxkey, r.insp_act_no());
				if (isNull(actR)) {
					continue;
				}
				if (MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ())
						|| (MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ()) && (isNull(r.insp_aprv_sts_typ()) || MSC_INSP_APRV_STS_TYP.isJUDG_OPN(r.insp_aprv_sts_typ())))) {
					chkL.add(r);
				}
			}
			
			MCList<MST_INSP_STT_D_R> sttDL = MCList.create(MST_INSP_STT_D_R.class);
			MST_INSP_STT_D_R t2 = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttDL_bldr = MCQueryApiBuilder.create(t2);
			sttDL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_STT_D_S03", sttDL, sttDL_bldr, chkL);
			
			if (sttDL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(t3);
			MST_PURC_ACT_D_R st1 = MST_PURC_ACT_D_R.create("ST1");
			MST_PURC_ACT_IO_R st2 = MST_PURC_ACT_IO_R.create("ST2");
			purcActL_bldr.setSelect(t3.purc_act_no);
			purcActL_bldr.addSelect(st2.arr_act_no);
			purcActL_bldr.addInnerJoin(st1, st1.purc_act_no.eq(t3.purc_act_no)
					.and(st1.purc_act_seq.eq(t3.purc_act_seq)));
			purcActL_bldr.addInnerJoin(st2, st1.purc_act_d_no.eq(st2.purc_act_d_no)
					.and(st1.purc_act_d_seq.eq(st2.purc_act_d_seq)));
			purcActL_bldr
					.setWhere(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActL_bldr.addWhereWithAnd(st2.arr_act_no.eq(bind("fix_no")));
			purcActL_bldr.addWhereWithAnd(
					st1.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.YET.value())));
			// 検査時に同時計上したレコードを除外する
			purcActL_bldr.addWhereWithAnd(st2.insp_act_d_no.isNull()
					.and(st2.insp_judg_d_no.isNull())
					.and(st2.insp_act_no.isNull()));
			dbSelect("MSBFL5050_MST_PURC_ACT_S01", purcActL, purcActL_bldr, sttDL);
			MCIndexKey sttdIdxkey = sttDL.createIndex(MST_INSP_STT_D_R.$insp_act_no,
					MST_INSP_STT_D_R.$stk_id_typ);
			MCIndexKey purcIdxkey = purcActL.createIndex("ARR_ACT_NO");
			for (InspAct_Chk04_HdrR chkR : chkL) {
				MST_INSP_STT_D_R sttDR = sttDL.getFirst(sttdIdxkey, chkR.insp_act_no(), MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
				MCList<MST_PURC_ACT_R> subPurcActL = getSubPurcActL(sttDL.subList(MST_INSP_STT_D_R.$insp_act_no, chkR.insp_act_no()), purcActL, purcIdxkey);
				if (!isNull(sttDR) && !subPurcActL.isEmpty()) {
					for (MST_PURC_ACT_R purcActR : subPurcActL) {
						msgL.add(new MCMessage(chkR, null, MSBFL0119, chkR.insp_no(), purcActR.purc_act_no(), toDispGUIIndex(chkR)));
						chkR.err_flg(true);
					}
				}
			}
			
			return msgL;
		}

		protected MCList<MST_PURC_ACT_R> getSubPurcActL(MCList<MST_INSP_STT_D_R> sttDL, MCList<MST_PURC_ACT_R> purcActL, MCIndexKey purcIdxkey) {
			MCList<MST_PURC_ACT_R> retPurcActL = MCList.create(MST_PURC_ACT_R.class);
			for (MST_INSP_STT_D_R sttDR : sttDL.groupBy(MST_INSP_STT_D_R.$fix_no)) {
				retPurcActL.addAll(purcActL.subList(purcIdxkey, sttDR.fix_no()));
			}
			
			return retPurcActL;
		}

		/**
		 * ログインユーザの承認役割権限チェックを行う。
		 * 
		 * @param roleCd 役割ＣＤ
		 * @return 
		 */
		protected boolean isAprvUsrR(String roleCd) {
			String loginUsrId = mcframe.serverCore.sys.MCSys.user.ID();

			MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
			int cnt = execDbCount("MSBFL5050_MAVM_APRV_USR_S02", t,
					t.aprv_role_cd.eq(bind("1"))
							.and(t.usr_cd.eq(bind("2")))
							.and(t.st_dt.lte(bind("3")))
							.and(t.end_dt.isNull().or(t.end_dt.gte(bind("3")))),
					roleCd, loginUsrId, getToday());

			return cnt > 0;
		}
		
		protected void callClChk03(MCList<InspAct_Chk04_HdrR> notErrL) {
			MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
			MCList<InspAct_Chk04_HdrR> actL = MCList.create(InspAct_Chk04_HdrR.class);
			MCList<InspAct_Chk04_HdrR> judgL = MCList.create(InspAct_Chk04_HdrR.class);
			
			for (InspAct_Chk04_HdrR r : notErrL) {
				if (MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ()) && MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_aprv_sts_typ())) {
					judgL.add(r);
				}
				else {
					actL.add(r);
				}
			}
			
			if (!actL.isEmpty()) {
				MCIndexKey idx = actL.createIndex(InspAct_Chk04_HdrR.$insp_act_no);
				
				MCList<MST_INSP_STT_D_R> sttdL = MCList.create(MST_INSP_STT_D_R.class);
				MST_INSP_STT_D_R t1 = MST_INSP_STT_D_R.create("T");
				MCQueryApiBuilder sttdL_bldr = MCQueryApiBuilder.create(t1);
				getSttdSql(sttdL, t1, sttdL_bldr);
				dbSelect("MSBFL5050_MST_INSP_STT_D_S04", sttdL, sttdL_bldr, actL);
				
				MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
				MST_INSP_INST_R t2 = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t2);
				instL_bldr.setSelect(t2.insp_no, t2.insp_mtd_typ);
				dbSelectKey("MSBFL5050_MST_INSP_INST_S06", instL, instL_bldr, actL);
				
				MCIndexKey instIdxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
				MCIndexKey sttdIdxkey = up1().createIndex(InspAct_Chk04_DtlR.$insp_act_no);
				for (MST_INSP_STT_D_R sttdR : sttdL) {
					InspAct_Chk04_HdrR actR = actL.getFirst(idx, sttdR.insp_act_no());
					MCList<InspAct_Chk04_DtlR> up1L = up1().subList(sttdIdxkey, sttdR.insp_act_no());
					MST_INSP_INST_R instR = instL.getFirst(instIdxkey, actR.insp_no());
					
					Cl_Chk03_CndR oR = Cl_Chk03_CndR.create();
					oR.peg_no(actR.peg_no());
					oR.sls_cls_chk_flg(false);
					oR.rcv_cls_chk_flg(false);
					oR.purc_cls_chk_flg(false);
					oR.pay_cls_chk_flg(false);
					oR.stk_cls_chk_flg(true);
					oR.io_lmt_skip_flg(false);
					oR.old_itm_cd(sttdR.itm_cd());
					oR.old_itm_sub1(sttdR.itm_sub1());
					oR.old_itm_sub2(sttdR.itm_sub2());
					oR.old_itm_sub3(sttdR.itm_sub3());
					oR.old_loc_cd(sttdR.loc_cd());
					oR.can_ac_dt(getSttDCanAcDt(sttdR.ac_dt(),
							(MCDate) up1L.min(InspAct_Chk04_DtlR.$can_ac_dt),
							actR.insp_sts_typ(), instR.insp_mtd_typ()));
					oR.setAttributes(actR);
					
					o.up0().add(oR);
				}
				
				MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
				MST_INSP_ACT_D_R t3 = MST_INSP_ACT_D_R.create("T");
				MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t3);
				getActdSql(actdL, t3, actdL_bldr);
				dbSelect("MSBFL5050_MST_INSP_ACT_D_S06", actdL, actdL_bldr, actL);
				
				MCIndexKey actdIdxkey = up1().createIndex(InspAct_Chk04_DtlR.$insp_act_d_no);
				for (MST_INSP_ACT_D_R actdR : actdL) {
					InspAct_Chk04_HdrR actR = actL.getFirst(idx, actdR.insp_act_no());
					InspAct_Chk04_DtlR up1R = up1().getFirst(actdIdxkey, actdR.insp_act_d_no());
					
					Cl_Chk03_CndR oR = Cl_Chk03_CndR.create();
					oR.peg_no(actR.peg_no());
					oR.sls_cls_chk_flg(false);
					oR.rcv_cls_chk_flg(false);
					oR.purc_cls_chk_flg(false);
					oR.pay_cls_chk_flg(false);
					oR.stk_cls_chk_flg(true);
					oR.io_lmt_skip_flg(false);
					oR.old_itm_cd(actdR.itm_cd());
					oR.old_itm_sub1(actdR.itm_sub1());
					oR.old_itm_sub2(actdR.itm_sub2());
					oR.old_itm_sub3(actdR.itm_sub3());
					oR.old_loc_cd(actdR.loc_cd());
					oR.can_ac_dt(up1R.can_ac_dt());
					oR.setAttributes(actR);
					
					o.up0().add(oR);
				}
				MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
				MST_INSP_SMPL_ACT_R t4 = MST_INSP_SMPL_ACT_R.create("T");
				MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t4);
				getSmplSql(smplL, t4, smplL_bldr);
				dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S04", smplL, smplL_bldr, actL);
				
				MCIndexKey smplIdxkey = up2().createIndex(InspAct_Chk04_SmplR.$insp_smpl_act_no);
				for (MST_INSP_SMPL_ACT_R smplR : smplL) {
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(smplR.stk_id_typ())) {
						continue;
					}
					// 引落数量がnullであれば、締チェック対象外にする
					if (isNull(smplR.so_qty())) {
						continue;
					}
					InspAct_Chk04_HdrR actR = actL.getFirst(idx, smplR.insp_act_no());
					InspAct_Chk04_SmplR up2R = up2().getFirst(smplIdxkey, smplR.insp_smpl_act_no());
					
					Cl_Chk03_CndR oR = Cl_Chk03_CndR.create();
					oR.peg_no(actR.peg_no());
					oR.sls_cls_chk_flg(false);
					oR.rcv_cls_chk_flg(false);
					oR.purc_cls_chk_flg(false);
					oR.pay_cls_chk_flg(false);
					oR.stk_cls_chk_flg(true);
					oR.io_lmt_skip_flg(false);
					oR.old_itm_cd(smplR.itm_cd());
					oR.old_itm_sub1(smplR.itm_sub1());
					oR.old_itm_sub2(smplR.itm_sub2());
					oR.old_itm_sub3(smplR.itm_sub3());
					oR.old_loc_cd(smplR.loc_cd());
					oR.can_ac_dt(up2R.can_ac_dt());
					oR.setAttributes(actR);
					
					o.up0().add(oR);
				}
			}
			if (!judgL.isEmpty()) {
				MCIndexKey idx = judgL.createIndex(InspAct_Chk04_HdrR.$insp_act_no);
				
				MCList<MST_INSP_JUDG_D_R> judgdL = MCList.create(MST_INSP_JUDG_D_R.class);
				MST_INSP_JUDG_D_R t5 = MST_INSP_JUDG_D_R.create("T");
				MCQueryApiBuilder judgdL_bldr = MCQueryApiBuilder.create(t5);
				getJudgdSql(judgdL, t5, judgdL_bldr);
				dbSelect("MSBFL5050_MST_INSP_JUDG_D_S02", judgdL, judgdL_bldr, judgL);
				
				MCIndexKey judgdIdxkey = up1().createIndex(InspAct_Chk04_DtlR.$fix_no, InspAct_Chk04_DtlR.$fix_no_typ);
				for (MST_INSP_JUDG_D_R judgdR : judgdL) {
					InspAct_Chk04_HdrR judgR = judgL.getFirst(idx, judgdR.insp_act_no());
					MCList<InspAct_Chk04_DtlR> up1L = up1().subList(judgdIdxkey, judgdR.fix_no(), judgdR.fix_no_typ());
					
					Cl_Chk03_CndR oR = Cl_Chk03_CndR.create();
					oR.peg_no(judgR.peg_no());
					oR.sls_cls_chk_flg(false);
					oR.rcv_cls_chk_flg(false);
					oR.purc_cls_chk_flg(false);
					oR.pay_cls_chk_flg(false);
					oR.stk_cls_chk_flg(true);
					oR.io_lmt_skip_flg(false);
					oR.old_itm_cd(judgdR.itm_cd());
					oR.old_itm_sub1(judgdR.itm_sub1());
					oR.old_itm_sub2(judgdR.itm_sub2());
					oR.old_itm_sub3(judgdR.itm_sub3());
					oR.old_loc_cd(judgdR.loc_cd());
					oR.can_ac_dt((MCDate)up1L.min(InspAct_Chk04_DtlR.$can_ac_dt));
					oR.setAttributes(judgR);
					
					o.up0().add(oR);
				}
			}

			if (!o.up0().isEmpty()) {
				o.up0().setAll(o.up0().distinctNE(Cl_Chk03_CndR.colnames()));
				o.exec();
				copyErrFlg(notErrL, o.down0());
			}
		}
		
		protected void getSttdSql(MCList<MST_INSP_STT_D_R> sttdL, 
				MST_INSP_STT_D_R t, MCQueryApiBuilder sttdL_bldr) {
			sttdL_bldr.setSelect(t.itm_cd);
			sttdL_bldr.addSelect(t.itm_sub1);
			sttdL_bldr.addSelect(t.itm_sub2);
			sttdL_bldr.addSelect(t.itm_sub3);
			sttdL_bldr.addSelect(t.loc_cd);
			sttdL_bldr.addSelect(t.ac_dt);
			sttdL_bldr.addSelect(t.insp_act_no);
			sttdL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
		}
		
		protected void getActdSql(MCList<MST_INSP_ACT_D_R> actdL, 
				MST_INSP_ACT_D_R t, MCQueryApiBuilder actdL_bldr) {
			actdL_bldr.setSelect(t.itm_cd);
			actdL_bldr.addSelect(t.itm_sub1);
			actdL_bldr.addSelect(t.itm_sub2);
			actdL_bldr.addSelect(t.itm_sub3);
			actdL_bldr.addSelect(t.loc_cd);
			actdL_bldr.addSelect(t.ac_dt);
			actdL_bldr.addSelect(t.insp_act_no);
			actdL_bldr.addSelect(t.insp_act_d_no);
			actdL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
		}
		
		protected void getJudgdSql(MCList<MST_INSP_JUDG_D_R> judgdL,
			MST_INSP_JUDG_D_R t, MCQueryApiBuilder judgdL_bldr) {
			judgdL_bldr.setSelect(t.itm_cd);
			judgdL_bldr.addSelect(t.itm_sub1);
			judgdL_bldr.addSelect(t.itm_sub2);
			judgdL_bldr.addSelect(t.itm_sub3);
			judgdL_bldr.addSelect(t.loc_cd);
			judgdL_bldr.addSelect(t.ac_dt);
			judgdL_bldr.addSelect(t.fix_no);
			judgdL_bldr.addSelect(t.fix_no_typ);
			judgdL_bldr.addSelect(t.insp_act_no);
			judgdL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
		}
		
		protected void getSmplSql(MCList<MST_INSP_SMPL_ACT_R> smplL, 
				MST_INSP_SMPL_ACT_R t, MCQueryApiBuilder smplL_bldr) {
			smplL_bldr.setSelect(t.itm_cd);
			smplL_bldr.addSelect(t.itm_sub1);
			smplL_bldr.addSelect(t.itm_sub2);
			smplL_bldr.addSelect(t.itm_sub3);
			smplL_bldr.addSelect(t.loc_cd);
			smplL_bldr.addSelect(t.stk_id_typ);
			smplL_bldr.addSelect(t.insp_smpl_act_no);
			smplL_bldr.addSelect(t.insp_act_no);
			smplL_bldr.addSelect(t.so_qty);
			
			smplL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		/**
		 * Chk03仕入実績登録前チェックを実行する
		 * @param notErrL
		 */
		protected void callThisChk03(MCList<InspAct_Chk04_HdrR> notErrL) {
			MSBFL_InspActService.InspAct_Chk03 o = MSBFL_InspActService.crtInspAct_Chk03();

			MCList<InspAct_Chk04_HdrR> tgtHdrL = MCList.create(InspAct_Chk04_HdrR.class);
			
			// 検査実績ヘッダからChk03の上り電文を作成する
			for (InspAct_Chk04_HdrR hdr04R : notErrL) {
				// エラーフラグがオンのヘッダを除く
				if (hdr04R.err_flg()) {
					continue;
				}
				tgtHdrL.add(hdr04R);
				
				// ヘッダ
				InspAct_Chk03_HdrR hdr03R = InspAct_Chk03_HdrR.create();
				copy(hdr03R, hdr04R, createMap_InspAct_Chk03_HdrR_InspAct_Chk04_HdrR());
				o.up0().add(hdr03R);
			}
			
			if (o.up0().isEmpty()) {
				return;
			}
			
			o.exec();

			copyErrFlg(tgtHdrL, o.down0());
		}

		protected Map_InspAct_Chk03_HdrR_InspAct_Chk04_HdrR<InspAct_Chk03_HdrR,InspAct_Chk04_HdrR> createMap_InspAct_Chk03_HdrR_InspAct_Chk04_HdrR() {
			return new Map_InspAct_Chk03_HdrR_InspAct_Chk04_HdrR<InspAct_Chk03_HdrR, InspAct_Chk04_HdrR>();
		}

		public class Map_InspAct_Chk03_HdrR_InspAct_Chk04_HdrR<D extends InspAct_Chk03_HdrR, S extends InspAct_Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk03_HdrR.$peg_no, InspAct_Chk04_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_no, InspAct_Chk04_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_act_no, InspAct_Chk04_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_judg_rslt_typ, InspAct_Chk04_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Chk03_HdrR.$insp_aprv_sts_typ, InspAct_Chk04_HdrR.$insp_aprv_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				if (!isNull(src.insp_aprv_sts_typ())) {
					dest.judg_flg(true);
				}
			}
		}
	}
	/**
	 * InspAct_Upd01オペレーション.<p>
	 *
	 * 検査実績の登録・訂正を行う。<br>
	 */
	public class InspAct_Upd01 extends MSBFL_InspActService_MC_A.InspAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			createCache();
			createMasterCache();
			setInspInstStsTyp();
			insUpdInspAct();
			updInspInst();
			editInspSmplActL();
			chkPurcPreAccptSmpl();
			editInstActDtlL();
			insUpdDelInspActD();
			insUpdDelSmplAct();
			updGoodAndDfctQty();
			callPlntAprvUpdSrv();
			callLotUpd04();
			callLotUpd05();
			callLotUpd02();
			callSloStsIns02();
			callThisUpd05();
			callIoActUpd01();
			callOrdUpd04();
			updInspSchd();
			callPushNtc();
			setDown();
		}
		
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCList<MST_INSP_INST_R> _instL = MCList.create(MST_INSP_INST_R.class);
		protected MST_INSP_INST_R _instL_t = MST_INSP_INST_R.create("T");
		protected MCQueryApiBuilder _instL_bldr = MCQueryApiBuilder.create(_instL_t);
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MST_INSP_ACT_R _actL_t = MST_INSP_ACT_R.create("T");
		protected MCQueryApiBuilder _actL_bldr = MCQueryApiBuilder.create(_actL_t);
		
		protected MCIndexKey _schdIdx;
		protected MCIndexKey _instIdx;
		protected MCIndexKey _actIdx;
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		
		protected void createCache() {
			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S05", _schdL, _schdL_bldr, up0());
			_schdIdx = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);

			_instL_bldr.setWhere(_instL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_INST_S07", _instL, _instL_bldr, up0());
			_instIdx = _instL.createIndex(MST_INSP_INST_R.$insp_no);

			_actL_bldr.setWhere(_actL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_S04", _actL, _actL_bldr, up0());
			_actIdx = _actL.createIndex(MST_INSP_ACT_R.$insp_no);
		}
		
		protected void createMasterCache() {
			MCQueryApiBuilder itmDbcL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmDbcL_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
			
			MCList<MAM_LOC_R> locBindL = MCList.create(MAM_LOC_R.class);
			for (InspAct_Upd01_DtlR r : up1()) {
				MAM_LOC_R locBindR = MAM_LOC_R.create();
				locBindR.loc_cd(r.loc_cd());
				locBindL.add(locBindR);
			}
			for (InspAct_Upd01_SmplR r : up2()) {
				MAM_LOC_R locBindR = MAM_LOC_R.create();
				locBindR.loc_cd(r.loc_cd());
				locBindL.add(locBindR);
			}
			MCQueryApiBuilder locDbcL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locDbcL_bldr, locBindL, MAM_LOC_R.$loc_cd);
		}
		
		protected void setInspInstStsTyp() {
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				hdrR.old_insp_sts_typ(hdrR.insp_sts_typ());
				hdrR.insp_sts_typ(getInspStsTyp(hdrR));
				hdrR.insp_aprv_sts_typ(getInspAprvStsTyp(hdrR));
			}
		}
		protected void insUpdInspAct() {
			MCList<MST_INSP_ACT_R> insL = MCList.create(MST_INSP_ACT_R.class);
			MCList<MST_INSP_ACT_R> updL = MCList.create(MST_INSP_ACT_R.class);
			
			for (InspAct_Upd01_HdrR r : up0()) {
				if (isNull(r.insp_act_no())) {
					r.ins_flg(true);
					insL.add(getInsR(r));
				}
				else {
					r.upd_flg(true);
					updL.add(getUpdR(r));
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_INSP_ACT_R updL_t = MST_INSP_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				editUpdL(updL, updL_bldr, updL_t);
				dbUpdateKey("MSBFL5050_MST_INSP_ACT_U01", updL, updL_bldr);
			}
		}
		
		protected void editUpdL(MCList<MST_INSP_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_INSP_ACT_R t) {
			updL_bldr.setSet(t.quality_typ);
			updL_bldr.addSet(t.gd_cd);
			updL_bldr.addSet(t.dfct_rsn_cd);
			updL_bldr.addSet(t.base_unit_qty);
			updL_bldr.addSet(t.st_tm);
			updL_bldr.addSet(t.end_tm);
			updL_bldr.addSet(t.act_usr_cd);
			updL_bldr.addSet(t.act_dpt_cd);
			updL_bldr.addSet(t.lmt_dt_frm_typ);
			updL_bldr.addSet(t.lmt_dt_frm);
			updL_bldr.addSet(t.vld_dt);
			updL_bldr.addSet(t.lmt_dt);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}
		
		protected MST_INSP_ACT_R getInsR(InspAct_Upd01_HdrR r) {
			MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
			
			r.insp_act_no(getStrSeq(MSC_NUM_SYS_TYP.INSPAH));
			
			setDataCrudTypForSloStsWhenIns(r);
			
			actR.insp_act_no(r.insp_act_no());
			actR.insp_no(r.insp_no());
			actR.insp_freq(r.insp_freq());
			actR.src_no1(r.src_no1());
			actR.src_no2(r.src_no2());
			actR.insp_typ(r.insp_typ());
			actR.insp_mtd_typ(r.insp_mtd_typ());
			actR.itm_cd(r.itm_cd());
			actR.itm_sub1(r.itm_sub1());
			actR.itm_sub2(r.itm_sub2());
			actR.itm_sub3(r.itm_sub3());
			actR.lot_no(r.lot_no());
			actR.sublot_no(r.sublot_no());
			actR.sppl_cd(r.sppl_cd());
			actR.maker_cd(r.maker_cd());
			actR.mfg_loc_cd(r.mfg_loc_cd());
			actR.from_site_cd(MAC_STR.NULL_VAL.value());
			actR.base_unit_qty(r.base_unit_qty());
			actR.base_unit_cd(r.base_unit_cd());
			// #updInspInstInspAndInspActで更新するため、
			// good_qtyとdfct_qtyはここでは更新しない。
			actR.good_qty(null);
			actR.dfct_qty(null);
			actR.st_tm(r.st_tm());
			actR.end_tm(r.end_tm());
			actR.act_usr_cd(r.act_usr_cd());
			actR.act_dpt_cd(r.act_dpt_cd());
			if (!MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
				actR.quality_typ(r.quality_typ());
				actR.gd_cd(r.gd_cd());
				if (MAC_QUALITY_TYP.isDFCT_INSP(actR.quality_typ())) {
					actR.dfct_rsn_cd(r.dfct_rsn_cd());
				}
			}
			actR.judg_dt(null);
			actR.insp_judg_rslt_typ(null);
			actR.judg_dpt_cd(null);
			actR.judg_usr_cd(null);
			actR.judg_rsn(null);
			actR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
			actR.lmt_dt_frm(r.lmt_dt_frm());
			actR.vld_dt(r.vld_dt());
			actR.lmt_dt(r.lmt_dt());
			actR.intr_rmrks(r.intr_rmrks());
			actR.sub_char1(r.sub_char1());
			actR.sub_char2(r.sub_char2());
			actR.sub_char3(r.sub_char3());
			actR.lims_flg(r.lims_flg());
			actR.ext_sys_cd(r.ext_sys_cd());
			actR.ext_insp_act_no(r.ext_insp_act_no());
			
			return actR;
		}
		
		/**
		 * MSBBL6080.SloSts_Ins02呼出時に必要なデータ更新区分を設定する。
		 * @param r
		 */
		protected void setDataCrudTypForSloStsWhenIns(InspAct_Upd01_HdrR r) {
			r.stt_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			if (!isNull(r.end_tm())) {
				r.act_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		
		protected MST_INSP_ACT_R getUpdR(InspAct_Upd01_HdrR r) {
			MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, r.insp_no());
			
			// 検査開始日時を更新した場合のみ検査着手明細を更新するために、
			// sttd_upd_flgにtrueを設定する。
			if (!isSame(actR.st_tm(), r.st_tm())) {
				r.sttd_upd_flg(true);
			}
			
			setDataCrudTypForSloStsWhenUpd(r, actR);
			
			actR.insp_act_no(r.insp_act_no());
			actR.base_unit_qty(r.base_unit_qty());
			actR.st_tm(r.st_tm());
			actR.end_tm(r.end_tm());
			actR.act_usr_cd(r.act_usr_cd());
			actR.act_dpt_cd(r.act_dpt_cd());
			if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
				actR.quality_typ(null);
				actR.gd_cd(null);
				actR.dfct_rsn_cd(null);
			}
			else {
				actR.quality_typ(r.quality_typ());
				actR.gd_cd(r.gd_cd());
				if (MAC_QUALITY_TYP.isDFCT_INSP(actR.quality_typ())) {
					actR.dfct_rsn_cd(r.dfct_rsn_cd());
				}
				else {
					actR.dfct_rsn_cd(null);
				}
			}
			actR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
			actR.lmt_dt_frm(r.lmt_dt_frm());
			actR.vld_dt(r.vld_dt());
			actR.lmt_dt(r.lmt_dt());
			actR.intr_rmrks(r.intr_rmrks());
			actR.sub_char1(r.sub_char1());
			actR.sub_char2(r.sub_char2());
			actR.sub_char3(r.sub_char3());
			
			return actR;
		}
		
		/**
		 * MSBBL6080.SloSts_Ins02呼出時に必要なデータ更新区分を設定する。
		 * @param r
		 * @param actR
		 */
		protected void setDataCrudTypForSloStsWhenUpd(InspAct_Upd01_HdrR aftR, MST_INSP_ACT_R bfrR) {
			aftR.stt_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			if (isNull(aftR.end_tm()) && isNull(bfrR.end_tm())) {
				 
			}
			else if (!isNull(aftR.end_tm()) && isNull(bfrR.end_tm())) {
				aftR.act_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (isNull(aftR.end_tm()) && !isNull(bfrR.end_tm())) {
				aftR.act_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else if (!isNull(aftR.end_tm()) && !isNull(bfrR.end_tm())) {
				aftR.act_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		protected boolean isNotUpdStk(InspAct_Upd01_HdrR r) {
			MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdIdx, r.insp_no());
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
			
			if (MSC_INSP_TYP.isPRCD(instR.insp_typ())) {
				return true;
			}
			if (instR.lmt_up_flg()) {
				return true;
			}
			// 検査中使用許可品は品目＋工場・物流倉庫の単位で設定されるため、
			// 検査予定がまとめられている場合でも検査予定のうち一つのみ評価すれば十分である。
			if (schdR.in_prmt_insp_flg()) {
				return true;
			}
			return false;
		}
		
		protected void insUpdDelInspActD() {
			// 明細の区分値の設定に更新後のステータス（検査状況区分、検査承認状況区分）が必要なので、
			// 検査指図更新後にInspAct_Upd03を呼び出す。
			MSBFL_InspActService.InspAct_Upd03 o = MSBFL_InspActService.crtInspAct_Upd03();
			
			setHdr(o.up0());
			setSttD(o.up1());
			setActD(o.up2());
			
			o.exec();
			// 仕入実績サービスの呼出時に使用するため、下り電文から検査実績明細ＮＯをコピー
			if (!o.down2().isEmpty()) {
				String[] copyCols = {InspAct_Upd03_Act_DtlR.$insp_act_d_no};
				copyByPegNo(up1(), copyCols, o.down2(), copyCols);
			}
		}
		protected void setHdr(MCList<InspAct_Upd03_HdrR> hdrL) {
			for (InspAct_Upd01_HdrR r : up0()) {
				if (isNotUpdStk(r)) {
					continue;
				}
				
				InspAct_Upd03_HdrR hdrR = InspAct_Upd03_HdrR.create();
				hdrR.insp_act_no(r.insp_act_no());
				hdrR.insp_no(r.insp_no());
				hdrR.arr_act_no(null);
				hdrR.insp_smpl_act_upd_flg(false);
				hdrR.setAttributes(r);
				hdrL.add(hdrR);
			}
		}
		
		protected void setSttD(MCList<InspAct_Upd03_Stt_DtlR> sttdL) {
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				if (isNotUpdStk(hdrR)) {
					continue;
				}
				
				if (hdrR.ins_flg()) {
					
					MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
					MST_STK_R t = MST_STK_R.create("T");
					MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
					MCList<MST_INSP_SCHD_R> schdL = _schdL.subList(_schdIdx, hdrR.insp_no());
					if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
						stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.ARR_ACT_NO.value());
						stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));
					}
					else if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())) {
						stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
						stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));
					}
					else if (MSC_INSP_TYP.isLOT(hdrR.insp_typ())) {
						stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
						stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("insp_schd_no")));
					}
					dbSelect("MSBFL5050_MST_STK_S03", stkL, stkL_bldr, schdL);
					
					for (MST_STK_R stkR : stkL) {
						InspAct_Upd03_Stt_DtlR sttdR = InspAct_Upd03_Stt_DtlR.create();
						MST_INSP_SCHD_R schdR = null;
						if (MSC_FIX_NO_TYP.isARR_ACT_NO(stkR.fix_no_typ())
								|| MSC_FIX_NO_TYP.isYIELD_ACT_NO(stkR.fix_no_typ())) {
							schdR = schdL.getFirst(MST_INSP_SCHD_R.$src_no4, stkR.fix_no());
						}
						else if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(stkR.fix_no_typ())) {
							schdR = schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, stkR.fix_no());
						}
						
						sttdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						sttdR.insp_act_no(hdrR.insp_act_no());
						sttdR.itm_cd(stkR.itm_cd());
						sttdR.itm_sub1(stkR.itm_sub1());
						sttdR.itm_sub2(stkR.itm_sub2());
						sttdR.itm_sub3(stkR.itm_sub3());
						sttdR.loc_cd(stkR.loc_cd());
						sttdR.str_ln_cd(stkR.str_ln_cd());
						sttdR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
						sttdR.gd_cd(stkR.gd_cd());
						sttdR.quality_typ(stkR.quality_typ());
						sttdR.stk_insp_typ(stkR.stk_insp_typ());
						sttdR.stk_id_typ(stkR.stk_id_typ());
						sttdR.stk_bp_cd(stkR.stk_bp_cd());
						sttdR.lot_no(stkR.lot_no());
						sttdR.sublot_no(stkR.sublot_no());
						sttdR.sno1(stkR.sno1());
						sttdR.sno1_mng_typ(schdR.sno1_mng_typ());
						sttdR.sno2(stkR.sno2());
						sttdR.sno2_mng_typ(schdR.sno2_mng_typ());
						sttdR.sno3(stkR.sno3());
						sttdR.sno3_mng_typ(schdR.sno3_mng_typ());
						sttdR.sno4(stkR.sno4());
						sttdR.sno4_mng_typ(schdR.sno4_mng_typ());
						sttdR.fix_no_typ(stkR.fix_no_typ());
						sttdR.fix_no(stkR.fix_no());
						sttdR.pack_unit_qty(stkR.pack_unit_qty());
						sttdR.pack_unit_cd(stkR.pack_unit_cd());
						sttdR.base_unit_qty(stkR.base_unit_qty());
						sttdR.base_unit_cd(hdrR.base_unit_cd());
						// 検査出庫・入庫の受払実績の計上日は開始日を使用する
						// ※全数検査の場合、場所違いなどで上部一覧に複数行が存在するときに、一部の明細の数量だけ実績を登録することができる。
						// この場合、検査実績明細は一部の明細の数量だけ登録するが、検査着手明細は全数量のデータを登録しなければならない
						// （検査待在庫を検査中在庫にするため）
						// そのため、上部一覧の明細で指定した計上日を検査出庫・入庫の計上日として使用することができない。
						sttdR.ac_dt(getAcDt(hdrR.st_tm()));
						
						sttdL.add(sttdR);
					}
				}
				else if (hdrR.upd_flg() && hdrR.sttd_upd_flg() && !hdrR.insp_schd_srv_flg()) {
					// 検査開始日時を更新した（sttd_upd_flgがtrue）場合のみ検査着手明細を更新する。
					// ただし、検査予定サービスから呼び出された場合は更新しない。
					MCList<MST_INSP_STT_D_R> tgtSttdL = MCList.create(MST_INSP_STT_D_R.class);
					MST_INSP_STT_D_R t = MST_INSP_STT_D_R.create("T");
					MCQueryApiBuilder tgtSttdL_bldr = MCQueryApiBuilder.create(t);
					tgtSttdL_bldr.setWhere(t.insp_act_no.eq(bind("1")), hdrR.insp_act_no());
					dbSelect("MSBFL5050_MST_INSP_STT_D_S05", tgtSttdL, tgtSttdL_bldr);
					
					MCIndexKey idxkey = up1().createIndex(InspAct_Upd01_DtlR.$insp_act_no);
					for (MST_INSP_STT_D_R dtlR : tgtSttdL) {
						InspAct_Upd03_Stt_DtlR sttdR = InspAct_Upd03_Stt_DtlR.create();
						MCList<InspAct_Upd01_DtlR> up1L = up1().subList(idxkey, dtlR.insp_act_no());
						
						sttdR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						sttdR.insp_stt_d_no(dtlR.insp_stt_d_no());
						sttdR.insp_act_no(dtlR.insp_act_no());
						sttdR.itm_cd(dtlR.itm_cd());
						sttdR.itm_sub1(dtlR.itm_sub1());
						sttdR.itm_sub2(dtlR.itm_sub2());
						sttdR.itm_sub3(dtlR.itm_sub3());
						sttdR.loc_cd(dtlR.loc_cd());
						sttdR.str_ln_cd(dtlR.str_ln_cd());
						sttdR.stk_arrv_bp_cd(dtlR.stk_arrv_bp_cd());
						sttdR.gd_cd(dtlR.gd_cd());
						sttdR.quality_typ(dtlR.quality_typ());
						sttdR.stk_insp_typ(dtlR.stk_insp_typ());
						sttdR.stk_id_typ(dtlR.stk_id_typ());
						sttdR.stk_bp_cd(dtlR.stk_bp_cd());
						sttdR.lot_no(dtlR.lot_no());
						sttdR.sublot_no(dtlR.sublot_no());
						sttdR.sno1(dtlR.sno1());
						sttdR.sno2(dtlR.sno2());
						sttdR.sno3(dtlR.sno3());
						sttdR.sno4(dtlR.sno4());
						sttdR.sno1_mng_typ(dtlR.sno1_mng_typ());
						sttdR.sno2_mng_typ(dtlR.sno2_mng_typ());
						sttdR.sno3_mng_typ(dtlR.sno3_mng_typ());
						sttdR.sno4_mng_typ(dtlR.sno4_mng_typ());
						sttdR.fix_no_typ(dtlR.fix_no_typ());
						sttdR.fix_no(dtlR.fix_no());
						sttdR.pack_unit_qty(dtlR.pack_unit_qty());
						sttdR.pack_unit_cd(dtlR.pack_unit_cd());
						sttdR.base_unit_qty(dtlR.base_unit_qty());
						sttdR.base_unit_cd(dtlR.base_unit_cd());
						sttdR.ac_dt(getAcDt(hdrR.st_tm()));
						sttdR.can_ac_dt(getSttDCanAcDt(dtlR.ac_dt(),
								(MCDate) up1L.min(InspAct_Upd01_DtlR.$can_ac_dt),
								hdrR.old_insp_sts_typ(), hdrR.insp_mtd_typ()));
						sttdR.sub_char1(dtlR.sub_char1());
						sttdR.sub_char2(dtlR.sub_char2());
						sttdR.sub_char3(dtlR.sub_char3());
						
						sttdL.add(sttdR);
					}
				}
			}
		}
		
		protected void setActD(MCList<InspAct_Upd03_Act_DtlR> actdL) {
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				// 検査状況区分は「着手中」の場合、検査実績明細を作成しない
				// （ただし、完了⇒着手中へと更新した場合は検査実績明細を削除する。）
				if (!MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ()) && MSC_INSP_STS_TYP.isSTR(hdrR.insp_sts_typ())
						&& !isJdgToStr(hdrR)) {
					continue;
				}
				if (isNotUpdStk(hdrR)) {
					continue;
				}
				
				MCList<InspAct_Upd01_DtlR> upActdL = up1().subList(InspAct_Upd01_DtlR.$insp_no, hdrR.insp_no());
				for (InspAct_Upd01_DtlR dtlR : upActdL) {
					InspAct_Upd03_Act_DtlR actdR = InspAct_Upd03_Act_DtlR.create();
					
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) || isNull(dtlR.insp_act_d_no())) {
						actdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						actdR.insp_act_d_no(null);
					}
					else if (!MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())
							&& !isNull(dtlR.insp_act_d_no()) && isJdgToStr(hdrR)) {
						// 抜取検査・抜取規格検査で完了→着手中の場合、検査実績明細は全てDELETEする。
						actdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						actdR.insp_act_d_no(dtlR.insp_act_d_no());
					}
					else if (isUpdOrDel(dtlR.data_crud_typ())) {
						actdR.data_crud_typ(dtlR.data_crud_typ());
						actdR.insp_act_d_no(dtlR.insp_act_d_no());
					}
					else if (isNull(dtlR.data_crud_typ()) && !MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
						actdR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						actdR.insp_act_d_no(dtlR.insp_act_d_no());
					}
					// 全数検査の明細が変更なしの場合、対象外になる。
					else if (isNull(dtlR.data_crud_typ()) && MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
						continue;
					}
					
					actdR.peg_no(dtlR.peg_no());
					actdR.insp_act_no(hdrR.insp_act_no());
					
					actdR.itm_cd(dtlR.itm_cd());
					actdR.itm_sub1(dtlR.itm_sub1());
					actdR.itm_sub2(dtlR.itm_sub2());
					actdR.itm_sub3(dtlR.itm_sub3());
					actdR.loc_cd(dtlR.loc_cd());
					actdR.str_ln_cd(dtlR.str_ln_cd());
					actdR.stk_arrv_bp_cd(dtlR.stk_arrv_bp_cd());
					actdR.gd_cd(dtlR.gd_cd());
					actdR.quality_typ(dtlR.quality_typ());
					actdR.stk_insp_typ(getStkInspTypForActd(hdrR));
					actdR.stk_id_typ(dtlR.stk_id_typ());
					actdR.stk_bp_cd(dtlR.stk_bp_cd());
					actdR.lot_no(dtlR.lot_no());
					actdR.sublot_no(dtlR.sublot_no());
					actdR.sno1(dtlR.sno1());
					actdR.sno1_mng_typ(dtlR.sno1_mng_typ());
					actdR.sno2(dtlR.sno2());
					actdR.sno2_mng_typ(dtlR.sno2_mng_typ());
					actdR.sno3(dtlR.sno3());
					actdR.sno3_mng_typ(dtlR.sno3_mng_typ());
					actdR.sno4(dtlR.sno4());
					actdR.sno4_mng_typ(dtlR.sno4_mng_typ());
					actdR.fix_no_typ(dtlR.fix_no_typ());
					actdR.fix_no(dtlR.fix_no());
					actdR.pack_unit_qty(dtlR.pack_unit_qty());
					actdR.pack_unit_cd(dtlR.pack_unit_cd());
					actdR.base_unit_qty(dtlR.base_unit_qty());
					actdR.base_unit_cd(dtlR.base_unit_cd());
					actdR.pack_xfr_pack_unit_qty(dtlR.pack_xfr_pack_unit_qty());
					actdR.pack_xfr_pack_unit_cd(dtlR.pack_xfr_pack_unit_cd());
					actdR.pack_xfr_base_unit_qty(dtlR.pack_xfr_base_unit_qty());
					actdR.pack_xfr_base_unit_cd(dtlR.pack_xfr_base_unit_cd());
					actdR.dfct_rsn_cd(dtlR.dfct_rsn_cd());
					actdR.intr_rmrks(dtlR.intr_rmrks());
					actdR.sub_char1(dtlR.sub_char1());
					actdR.sub_char2(dtlR.sub_char2());
					actdR.sub_char3(dtlR.sub_char3());
					actdR.lims_flg(dtlR.lims_flg());
					actdR.ext_sys_cd(dtlR.ext_sys_cd());
					actdR.ext_insp_act_d_no(dtlR.ext_insp_act_d_no());
					actdR.ac_dt(dtlR.ac_dt());
					actdR.can_ac_dt(dtlR.can_ac_dt());
					
					actdL.add(actdR);
				}
			}
		}
		
		protected void updInspInst() {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);

			for (InspAct_Upd01_HdrR hdrR : up0()) {
				MST_INSP_INST_R dbInstR = _instL.getFirst(_instIdx, hdrR.insp_no());
				MST_INSP_INST_R instR = MST_INSP_INST_R.create();
				instR.insp_no(hdrR.insp_no());
				instR.act_cont_fctr(hdrR.act_cont_fctr());
				instR.insp_sts_typ(hdrR.insp_sts_typ());
				instR.insp_aprv_sts_typ(hdrR.insp_aprv_sts_typ());
				if (!isNull(dbInstR)) {
					if (dbInstR.insp_rslt_prnt_flg()) {
						instR.seq(dbInstR.seq().add(MCNumber.ONE));
					}
					else {
						instR.seq(dbInstR.seq());
					}
				}
				else {
					instR.seq(MCNumber.ONE);
				}
				instR.insp_rslt_prnt_flg(false);
				instR.insp_rslt_prnt_tm(null);
				instL.add(instR);
			}
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);

			instL_bldr.setSet(t.act_cont_fctr);
			instL_bldr.addSet(t.insp_sts_typ);
			instL_bldr.addSet(t.insp_aprv_sts_typ);
			instL_bldr.addSet(t.insp_rslt_prnt_flg);
			instL_bldr.addSet(t.insp_rslt_prnt_tm);
			instL_bldr.addSet(t.seq);

			dbUpdateKey("MSBFL5050_MST_INSP_INST_U01", instL, instL_bldr);
		}
		
		protected void updGoodAndDfctQty() {
			// 検査実績明細を更新した後に良品数と不良品数を算出する。
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			
			MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t2 = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t2);
			actdL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_D_S07", actdL, actdL_bldr, up0());
			
			MCIndexKey idx = actdL.createIndex(MST_INSP_ACT_D_R.$insp_act_no, MST_INSP_ACT_D_R.$quality_typ);
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
				MCList<MST_INSP_ACT_D_R> goodActdL = actdL.subList(
						idx, hdrR.insp_act_no(), MAC_QUALITY_TYP.GOOD.value());
				MCList<MST_INSP_ACT_D_R> dfctActdL = actdL.subList(
						idx, hdrR.insp_act_no(), MAC_QUALITY_TYP.DFCT_INSP.value());
				
				actR.insp_act_no(hdrR.insp_act_no());
				actR.good_qty(getSumOfBaseUnitQty(goodActdL));
				actR.dfct_qty(getSumOfBaseUnitQty(dfctActdL));
				actR.base_unit_qty(actR.good_qty().add(actR.dfct_qty()));
				if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
					if (actR.good_qty().isPositive()) {
						hdrR.addBooleanColumn("crt_plnt_arpv_flg", true);
					}
					else {
						hdrR.addBooleanColumn("crt_plnt_arpv_flg", false);
					}
				}
				
				actL.add(actR);
			}

			MST_INSP_ACT_R t1 = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1); 
			actL_bldr.setSet(t1.good_qty);
			actL_bldr.addSet(t1.dfct_qty);
			actL_bldr.addSet(t1.base_unit_qty);
			dbUpdateKey("MSBFL5050_MST_INSP_ACT_U02", actL, actL_bldr);
		}
		
		protected MCNumber getSumOfBaseUnitQty(MCList<MST_INSP_ACT_D_R> actdL) {
			if (actdL.isEmpty()) {
				return MCNumber.ZERO;
			}
			else {
				return actdL.sum(MST_INSP_ACT_D_R.$base_unit_qty);
			}
		}
		
		protected String getInspStsTyp(InspAct_Upd01_HdrR hdrR) {
			if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				if (!isNull(hdrR.end_tm())) {
					MCList<MST_INSP_SCHD_R> schdL = _schdL.subList(_schdIdx, hdrR.insp_no());
					
					MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
					MST_STK_R t1 = MST_STK_R.create("T");
					MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t1);
					stkL_bldr.setSelect(t1.base_unit_qty);
					if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
						stkL_bldr.setWhere(t1.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.ARR_ACT_NO.value());
						stkL_bldr.addWhereWithAnd(t1.fix_no.eq(bind("src_no4")));
						stkL_bldr.addWhereWithAnd(t1.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.FIN.value())));
					}
					else if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())) {
						stkL_bldr.setWhere(t1.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
						stkL_bldr.addWhereWithAnd(t1.fix_no.eq(bind("src_no4")));
					}
					else if (MSC_INSP_TYP.isLOT(hdrR.insp_typ())) {
						stkL_bldr.setWhere(t1.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
						stkL_bldr.addWhereWithAnd(t1.fix_no.eq(bind("insp_schd_no")));
					}
					stkL_bldr.addWhereWithAnd(t1.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.WAIT_JUDG.value())));
					dbSelect("MSBFL5050_MST_STK_S04", stkL, stkL_bldr, schdL);
					
					MCNumber stkQty = stkL.sum(MST_STK_R.$base_unit_qty);
					if (isNull(stkQty)) {
						stkQty = MCNumber.ZERO;
					}
					
					MCNumber actdQty = MCNumber.ZERO;
					if (!isNull(hdrR.insp_act_no())) {
						MCList<MST_INSP_ACT_D_R> actdL = MCList.create(MST_INSP_ACT_D_R.class);
						MST_INSP_ACT_D_R t2 = MST_INSP_ACT_D_R.create("T");
						MCQueryApiBuilder actdL_bldr = MCQueryApiBuilder.create(t2);
						actdL_bldr.setSelect(t2.base_unit_qty);
						actdL_bldr.setWhere(t2.insp_act_no.eq(bind("1")), hdrR.insp_act_no());
						dbSelect("MSBFL5050_MST_INSP_ACT_D_S08", actdL, actdL_bldr);
						
						actdQty = actdL.sum(MST_STK_R.$base_unit_qty);
						if (isNull(actdQty)) {
							actdQty = MCNumber.ZERO;
						}
					}
					
					MCList<InspAct_Upd01_DtlR> upActdL = up1().subList(InspAct_Upd01_DtlR.$insp_no, hdrR.insp_no());
					MCNumber upQty = upActdL.sum(InspAct_Upd01_DtlR.$base_unit_qty);
					MCList<InspAct_Upd01_DtlR> delL = upActdL.subList(InspAct_Upd01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
					if (!isNull(delL)) {
						MCNumber delQty = delL.sum(InspAct_Upd01_DtlR.$base_unit_qty);
						upQty = upQty.subtract(delQty);
					}
					if (isNull(upQty)) {
						upQty = MCNumber.ZERO;
					}
					// 在庫数＋登録済検査実績明細数量＜＝上り電文の数量の場合は完了
					if (stkQty.add(actdQty).lte(upQty)) {
						return MSC_INSP_STS_TYP.JDG.value();
					}
				}
			}
			else {
				if (!isNullOr(hdrR.end_tm(), hdrR.quality_typ(), hdrR.gd_cd())) {
					return MSC_INSP_STS_TYP.JDG.value();
				}
			}
			
			// 開始日時は検査実績時に必須項目なので、設定されていないことは想定していない。
			return MSC_INSP_STS_TYP.STR.value();
		}
		
		protected String getInspAprvStsTyp(InspAct_Upd01_HdrR hdrR) {
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
			if (!instR.insp_aprv_flg()) {
				return null;
			}
			
			if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())) {
				if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(instR.insp_aprv_sts_typ())) {
					return MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value();
				}
				return MSC_INSP_APRV_STS_TYP.JUDG_OPN.value();
			}
			else {
				return MSC_INSP_APRV_STS_TYP.INST_ACPT.value();
			}
		}
		
		protected void insUpdDelSmplAct() {
			insUpdDelSmplActMain();
			insUpdDelSmplIoAct();
		}

		/**
		 * 検査実績の検査状況区分が切り替える場合、受払実績に登録する数量を計算する
		 */
		protected void editInstActDtlL() {

			MCList<InspAct_Upd01_SmplR> smplL = up2().subList(r -> isCalcSmplRow(r));
			MCIndexKey dtlIdxkey = up1().createIndex(InspAct_Upd01_DtlR.$insp_no);
			MCIndexKey smplIdxkey = smplL.createIndex(InspAct_Upd01_SmplR.$insp_no);
			MCList<InspAct_Upd01_DtlR> addUp1L = MCList.create(InspAct_Upd01_DtlR.class);
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
					continue;
				}
				if (isNotUpdStk(hdrR)) {
					continue;
				}
				if (isJdgToStr(hdrR)) {
					continue;
				}
				MCList<InspAct_Upd01_DtlR> subDtlL = up1().subList(dtlIdxkey, hdrR.insp_no());
				if (subDtlL.isEmpty()) {
					continue;
				}

				MCList<InspAct_Upd01_SmplR> subSmplL = smplL.subList(smplIdxkey, hdrR.insp_no());
				if (MSC_INSP_STS_TYP.isORD(hdrR.old_insp_sts_typ())) {

					for (InspAct_Upd01_SmplR smplR : subSmplL) {
						calcInspActDQty(smplR, subDtlL, addUp1L);
					}
				}
				else {
					for (InspAct_Upd01_SmplR smplR : subSmplL) {
						calcDiffSoQty(smplR, subDtlL, addUp1L);
					}
				}
			}
			up1().addAll(addUp1L);
		}
		
		/**
		 * 引落の受払実績を更新するためには、仕入実績登録画面で仕入実績を更新するかを判定する
		 */
		protected void chkPurcPreAccptSmpl() {
			MCList<InspAct_Upd01_SmplR> smplL = up2().subList(r -> isCheckedPurcPreSmplRow(r));
			if (smplL.isEmpty()) {
				return;
			}

			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_SCHD_S06", schdL, schdL_bldr, smplL);

			MCIndexKey schdIdxkey = schdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			MCList<InspAct_Upd01_SmplR> bindL = smplL.clone();
			for (InspAct_Upd01_SmplR bindR : bindL) {
				if (isNull(bindR.insp_schd_no())) {
					continue;
				}
				MST_INSP_SCHD_R schdR = schdL.getFirst(schdIdxkey, bindR.insp_schd_no());
				if (isNull(schdR)) {
					continue;
				}
				if (schdR.in_prmt_insp_flg() && MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					bindR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					bindR.fix_no(schdR.src_no4());
				}
			}

			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R t2 = MST_STK_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t2);
			stkL_bldr.setWhere(t2.fix_no_typ.eq(bind("fix_no_typ")));
			stkL_bldr.addWhereWithAnd(t2.fix_no.eq(bind("fix_no")));
			stkL_bldr.addWhereWithAnd(t2.stk_id_typ.eq(value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value())));
			dbSelect("MSBFL5050_MST_STK_S05", stkL, stkL_bldr, bindL);
			MCIndexKey stkIdxkey = stkL.createIndex(MST_STK_R.$fix_no_typ, MST_STK_R.$fix_no);

			MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
			MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T");
			MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(t3);
			MST_PURC_ACT_D_R st1 = MST_PURC_ACT_D_R.create("ST1");
			MST_PURC_ACT_IO_R st2 = MST_PURC_ACT_IO_R.create("ST2");
			purcActL_bldr.setSelect(t3.purc_act_no);
			purcActL_bldr.addSelect(st2.arr_act_no);
			purcActL_bldr.addInnerJoin(st1, st1.purc_act_no.eq(t3.purc_act_no)
					.and(st1.purc_act_seq.eq(t3.purc_act_seq)));
			purcActL_bldr.addInnerJoin(st2, st1.purc_act_d_no.eq(st2.purc_act_d_no)
					.and(st1.purc_act_d_seq.eq(st2.purc_act_d_seq)));
			purcActL_bldr.setWhere(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActL_bldr.addWhereWithAnd(st2.arr_act_no.eq(bind("fix_no")));
			// 検査時に同時計上したレコードを除外する
			purcActL_bldr.addWhereWithAnd(st2.insp_act_d_no.isNull()
					.and(st2.insp_judg_d_no.isNull())
					.and(st2.insp_act_no.isNull()));
			dbSelect("MSBFL5050_MST_PURC_ACT_S02", purcActL, purcActL_bldr, bindL);
			MCIndexKey purcIdxkey = purcActL.createIndex("ARR_ACT_NO");
			MCIndexKey hdrIdxkey = up0().createIndex(InspAct_Upd01_HdrR.$insp_no);
			for (MCList<InspAct_Upd01_SmplR> smplGL : bindL.groupList(InspAct_Upd01_SmplR.$insp_no)) {
				InspAct_Upd01_HdrR hdrR = up0().getFirst(hdrIdxkey, smplGL.get(0).insp_no());
				for (InspAct_Upd01_SmplR smplGR : smplGL.groupBy(InspAct_Upd01_SmplR.$fix_no_typ, InspAct_Upd01_SmplR.$fix_no)) {
					MST_STK_R stkR = stkL.getFirst(stkIdxkey, smplGR.fix_no_typ(), smplGR.fix_no());
					if (isNull(stkR)) {
						MST_PURC_ACT_R purcActR = purcActL.getFirst(purcIdxkey, smplGR.fix_no());
						if (!isNull(purcActR)) {
							MCMessagePool.add(new MCMessage(hdrR, null, MSBFL0116, hdrR.insp_no(), purcActR.purc_act_no(), toDispGUIIndex(hdrR)));
						}
					}
				}
			}
		}
		
		/**
		 * 仕入検収前の抜取検査実績を判定する
		 * 
		 * @param r
		 * @return
		 */
		protected boolean isCheckedPurcPreSmplRow(InspAct_Upd01_SmplR r) {
			if (!isNull(r.data_crud_typ()) && !r.rmrks_upd_flg() && MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) && !isNull(r.so_qty())) {
					return true;
				}
				else if (!r.so_cmpl_flg() && !isNull(r.db_so_qty())) {
					return true;
				}
			}
			
			return false;
		}

		protected void calcInspActDQty(InspAct_Upd01_SmplR smplR, MCList<InspAct_Upd01_DtlR> dtlL, MCList<InspAct_Upd01_DtlR> addUp1L) {
			MCIndexKey idxkey = dtlL.createIndex(InspAct_Upd01_DtlR.$fix_no_typ, 
					InspAct_Upd01_DtlR.$fix_no, InspAct_Upd01_DtlR.$loc_cd, InspAct_Upd01_DtlR.$pack_unit_cd, InspAct_Upd01_DtlR.$base_unit_cd, InspAct_Upd01_DtlR.$str_ln_cd);
			if (!isNull(smplR.so_qty())) {
				// 荷姿単位が基準単位と同じの場合
				if (isSame(smplR.pack_xfr_pack_unit_cd(), smplR.pack_xfr_base_unit_cd())) {
					InspAct_Upd01_DtlR dtlR = dtlL.getFirst(idxkey, smplR.fix_no_typ(), smplR.fix_no(), smplR.loc_cd(), smplR.base_unit_cd(), smplR.base_unit_cd(), smplR.str_ln_cd());
					if (!isNull(dtlR)) {
						dtlR.pack_unit_qty(dtlR.pack_unit_qty().subtract(smplR.so_qty()));
						dtlR.base_unit_qty(dtlR.pack_unit_qty());
					}
				}
				// 荷姿単位が基準単位と違う場合
				else {
					InspAct_Upd01_DtlR packDtlR = dtlL.getFirst(idxkey, smplR.fix_no_typ(), smplR.fix_no(), smplR.loc_cd(), smplR.pack_xfr_pack_unit_cd(), smplR.base_unit_cd(), smplR.str_ln_cd());
					InspAct_Upd01_DtlR baseDtlR = dtlL.getFirst(idxkey, smplR.fix_no_typ(), smplR.fix_no(), smplR.loc_cd(), smplR.base_unit_cd(), smplR.base_unit_cd(), smplR.str_ln_cd());
					
					if (!isNull(packDtlR)) {
						packDtlR.pack_unit_qty(packDtlR.pack_unit_qty().subtract(smplR.pack_xfr_pack_unit_qty()));
						packDtlR.base_unit_qty(packDtlR.base_unit_qty().subtract(smplR.pack_xfr_base_unit_qty()));
						if (isNull(baseDtlR)) {
							baseDtlR = packDtlR.clone();
							baseDtlR.pack_unit_cd(baseDtlR.base_unit_cd());
							baseDtlR.pack_xfr_pack_unit_cd(baseDtlR.base_unit_cd());
							baseDtlR.pack_unit_qty(smplR.pack_xfr_base_unit_qty());
							dtlL.add(baseDtlR);
							addUp1L.add(baseDtlR);
						}
						else {
							baseDtlR.pack_unit_qty(baseDtlR.pack_unit_qty().add(smplR.pack_xfr_base_unit_qty()));
						}
						baseDtlR.pack_unit_qty(baseDtlR.pack_unit_qty().subtract(smplR.so_qty()));
						baseDtlR.base_unit_qty(baseDtlR.pack_unit_qty());
					}
				}
			}
		}
		
		protected void calcDiffSoQty(InspAct_Upd01_SmplR smplR, MCList<InspAct_Upd01_DtlR> dtlL, MCList<InspAct_Upd01_DtlR> addUp1L) {
			MCIndexKey idxkey = dtlL.createIndex(InspAct_Upd01_DtlR.$fix_no_typ, 
					InspAct_Upd01_DtlR.$fix_no, InspAct_Upd01_DtlR.$loc_cd, InspAct_Upd01_DtlR.$pack_unit_cd, InspAct_Upd01_DtlR.$base_unit_cd, InspAct_Upd01_DtlR.$str_ln_cd);
			if (isSame(smplR.pack_xfr_pack_unit_cd(), smplR.pack_xfr_base_unit_cd())) {
				// 荷姿単位が基準単位と同じ場合
				InspAct_Upd01_DtlR dtlR = dtlL.getFirst(idxkey, smplR.fix_no_typ(), smplR.fix_no(), smplR.loc_cd(), smplR.base_unit_cd(), smplR.base_unit_cd(), smplR.str_ln_cd());
				if (!isNull(dtlR)) {
					if (MAC_DATA_CRUD_TYP.isDEL(smplR.data_crud_typ())) {
						dtlR.pack_unit_qty(dtlR.pack_unit_qty().add(nvl(smplR.db_so_qty(), MCNumber.ZERO)));
						dtlR.base_unit_qty(dtlR.pack_unit_qty());
					}
					else if (!isNull(smplR.so_qty())) {
						dtlR.pack_unit_qty(dtlR.pack_unit_qty().subtract(smplR.so_qty().subtract(nvl(smplR.db_so_qty(), MCNumber.ZERO))));
						dtlR.base_unit_qty(dtlR.pack_unit_qty());
					}
				}
			}
			// 荷姿単位が基準単位と違う場合
			else {
				MCNumber diffPackQty = MCNumber.ZERO;
				MCNumber diffBaseQty = MCNumber.ZERO;
				MCNumber diffSoQty = MCNumber.ZERO;
				if ((MAC_DATA_CRUD_TYP.isDEL(smplR.data_crud_typ()) || isNull(smplR.so_qty()))
						&& smplR.so_cmpl_flg()) {
					diffPackQty = MCNumber.ZERO.subtract(nvl(smplR.db_pack_xfr_pack_unit_qty(), MCNumber.ZERO));
					diffBaseQty = MCNumber.ZERO.subtract(nvl(smplR.db_pack_xfr_base_unit_qty(), MCNumber.ZERO));
					diffSoQty = MCNumber.ZERO.subtract(nvl(smplR.db_so_qty(), MCNumber.ZERO));
				}
				else if (isNull(smplR.db_so_qty()) && !isNull(smplR.so_qty())) {
					diffPackQty = smplR.pack_xfr_pack_unit_qty();
					diffBaseQty = smplR.pack_xfr_base_unit_qty();
					diffSoQty = smplR.so_qty();
				}
				else if (!isNull(smplR.so_qty())) {
					diffPackQty = smplR.pack_xfr_pack_unit_qty().subtract(nvl(smplR.db_pack_xfr_pack_unit_qty(), MCNumber.ZERO));
					diffBaseQty = smplR.pack_xfr_base_unit_qty().subtract(nvl(smplR.db_pack_xfr_base_unit_qty(), MCNumber.ZERO));
					diffSoQty = smplR.so_qty().subtract(nvl(smplR.db_so_qty(), MCNumber.ZERO));
				}
				InspAct_Upd01_DtlR packDtlR = dtlL.getFirst(idxkey, smplR.fix_no_typ(), smplR.fix_no(), smplR.loc_cd(), smplR.pack_xfr_pack_unit_cd(), smplR.base_unit_cd(), smplR.str_ln_cd());
				InspAct_Upd01_DtlR baseDtlR = dtlL.getFirst(idxkey, smplR.fix_no_typ(), smplR.fix_no(), smplR.loc_cd(), smplR.base_unit_cd(), smplR.base_unit_cd(), smplR.str_ln_cd());
				
				if (!isNull(packDtlR)) {
					packDtlR.pack_unit_qty(packDtlR.pack_unit_qty().subtract(diffPackQty));
					packDtlR.base_unit_qty(packDtlR.base_unit_qty().subtract(diffBaseQty));
					if (isNull(baseDtlR)) {
						baseDtlR = packDtlR.clone();
						baseDtlR.pack_unit_cd(baseDtlR.base_unit_cd());
						baseDtlR.pack_xfr_pack_unit_cd(baseDtlR.base_unit_cd());
						baseDtlR.pack_unit_qty(diffBaseQty);
						baseDtlR.insp_act_d_no(null);
						baseDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						dtlL.add(baseDtlR);
						addUp1L.add(baseDtlR);
					}
					else {
						baseDtlR.pack_unit_qty(baseDtlR.pack_unit_qty().add(diffBaseQty));
					}
					baseDtlR.pack_unit_qty(baseDtlR.pack_unit_qty().subtract(diffSoQty));
					baseDtlR.base_unit_qty(baseDtlR.pack_unit_qty());
					if (baseDtlR.pack_unit_qty().isZero()) {
						if (MAC_DATA_CRUD_TYP.isCRT(baseDtlR.data_crud_typ())) {
							dtlL.remove(baseDtlR);
						}
						else {
							baseDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
					}
				}
			}
		}

		/**
		 * 抜取実績の引落数量の差の計算対象を返却する。
		 * 
		 * @param r
		 * @return
		 */
		protected boolean isCalcSmplRow(InspAct_Upd01_SmplR r) {
			if (isNull(r.data_crud_typ()) || MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				if (!isNull(r.so_qty())) {
					return true;
				}
				else {
					return false;
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (!isNull(r.so_qty())) {
					return true;
				}
				else if (r.so_cmpl_flg()) {
					return true;
				}
				else {
					return false;
				}
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				if (r.so_cmpl_flg()) {
					return true;
				}
				else {
					return false;
				}
			}
			return false;
		}

		/**
		 * 検査実績新規登録の場合、抜取明細の在庫検査区分は「検査中」で固定する
		 */
		protected void editInspSmplActL() {
			MCIndexKey idxkey = up2().createIndex(InspAct_Upd01_SmplR.$insp_no);
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdIdx, hdrR.insp_no());
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
				if (instR.lmt_up_flg() || schdR.in_prmt_insp_flg()) {
					continue;
				}
				MCList<InspAct_Upd01_SmplR> smplL = up2().subList(idxkey, hdrR.insp_no());
				MCList<InspAct_Upd01_SmplR> subSmplL = smplL.subList(InspAct_Upd01_SmplR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				if (!subSmplL.isEmpty()) {
					subSmplL.setValueNE(InspAct_Upd01_SmplR.$stk_insp_typ, MSC_STK_INSP_TYP.ING.value());
				}
			}
			
			MCList<MST_INSP_SMPL_ACT_R> oldIsaL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MCQueryApiBuilder oldIsaL_bldr = MCQueryApiBuilder.create(MST_INSP_SMPL_ACT_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_SMPL_ACT_S05", oldIsaL, oldIsaL_bldr, up2());
			MCIndexKey smplIdxkey = oldIsaL.createIndex(MST_INSP_SMPL_ACT_R.$insp_smpl_act_no);
			for (InspAct_Upd01_SmplR smplR : up2()) {
				if (!isNull(smplR.insp_smpl_act_no())) {
					MST_INSP_SMPL_ACT_R oldSmplActR = oldIsaL.getFirst(smplIdxkey, smplR.insp_smpl_act_no());
					if (!isNull(oldSmplActR)) {
						smplR.so_cmpl_flg(oldSmplActR.so_cmpl_flg());
						smplR.db_so_qty(oldSmplActR.so_qty());
						smplR.db_pack_xfr_pack_unit_qty(oldSmplActR.pack_xfr_pack_unit_qty());
						smplR.db_pack_xfr_base_unit_qty(oldSmplActR.pack_xfr_base_unit_qty());
					}
				}
			}
		}

		protected void insUpdDelSmplActMain() {
			MCList<MST_INSP_SMPL_ACT_R> insL = MCList.create(MST_INSP_SMPL_ACT_R.class);;
			MCList<MST_INSP_SMPL_ACT_R> updL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MCList<MST_INSP_SMPL_ACT_R> delL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			
			MCList<MST_INSP_SMPL_ACT_R> oldIsaL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder oldIsaL_bldr = MCQueryApiBuilder.create(t);
			oldIsaL_bldr.setSelect(t.insp_smpl_act_no);
			oldIsaL_bldr.addSelect(t.so_cmpl_flg);
			oldIsaL_bldr.addSelect(t.pack_xfr_pack_unit_cd);
			oldIsaL_bldr.addSelect(t.pack_xfr_base_unit_cd);
			dbSelectKey("MSBFL5050_MST_INSP_SMPL_ACT_S06", oldIsaL, oldIsaL_bldr, up2());
			
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				MCList<InspAct_Upd01_SmplR> upSmplL = up2().subList(InspAct_Upd01_SmplR.$insp_no, hdrR.insp_no());
				
				if (upSmplL.isEmpty()) {
					continue;
				}
				if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
					continue;
				}
				if (MSC_INSP_TYP.isPRCD(hdrR.insp_typ())) {
					continue;
				}
				
				for (InspAct_Upd01_SmplR upSmplR : upSmplL) {
					MST_INSP_SMPL_ACT_R smplR = MST_INSP_SMPL_ACT_R.create();
					MST_INSP_SMPL_ACT_R oldIsaR = oldIsaL.getFirst(
							MST_INSP_SMPL_ACT_R.$insp_smpl_act_no, upSmplR.insp_smpl_act_no());
					
					if (isNull(upSmplR.insp_smpl_act_no())) {
						if (!isNull(upSmplR.so_qty())) {
							// 検査抜取の受払実績を登録するための目印
							upSmplR.smpl_io_ins_flg(true);
						}
						upSmplR.insp_smpl_act_no(getStrSeq(MSC_NUM_SYS_TYP.INSPSM));
						upSmplR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						
						upSmplR.insp_act_no(hdrR.insp_act_no());
						smplR.insp_smpl_act_no(upSmplR.insp_smpl_act_no());
						smplR.stk_insp_typ(upSmplR.stk_insp_typ());
					}
					else if (!isNull(upSmplR.insp_smpl_act_no())) {
						smplR.insp_smpl_act_no(upSmplR.insp_smpl_act_no());
						if (MAC_DATA_CRUD_TYP.isDEL(upSmplR.data_crud_typ())) {
							// 検査抜取の受払実績を削除するための目印
							upSmplR.smpl_io_del_flg(oldIsaR.so_cmpl_flg());
						}
						else {
							if (isJdgToStr(hdrR) || isStrToJdg(hdrR)) {
								if (!isNull(upSmplR.data_crud_typ())
										&& !MAC_DATA_CRUD_TYP.isDEL(upSmplR.data_crud_typ())) {
									upSmplR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
								}
							}
							if (isNull(upSmplR.data_crud_typ())) {
								continue;
							}
							if (oldIsaR.so_cmpl_flg() && isNull(upSmplR.so_qty())) {
								// 検査抜取の受払実績を削除するための目印
								upSmplR.smpl_io_del_flg(true);
							}
							else if (oldIsaR.so_cmpl_flg() && !isNull(upSmplR.so_qty())) {
								// 検査抜取の受払実績を更新するための目印
								upSmplR.smpl_io_upd_flg(true);
							}
							else if (!oldIsaR.so_cmpl_flg() && !isNull(upSmplR.so_qty())) {
								// 検査抜取の受払実績を登録するための目印
								upSmplR.smpl_io_ins_flg(true);
							}
						}
					}
					
					if (MAC_DATA_CRUD_TYP.isDEL(upSmplR.data_crud_typ())) {
						delL.add(smplR);
						continue;
					}
					
					smplR.insp_schd_no(upSmplR.insp_schd_no());
					smplR.insp_act_no(upSmplR.insp_act_no());
					smplR.itm_cd(upSmplR.itm_cd());
					smplR.itm_sub1(upSmplR.itm_sub1());
					smplR.itm_sub2(upSmplR.itm_sub2());
					smplR.itm_sub3(upSmplR.itm_sub3());
					smplR.so_qty(upSmplR.so_qty());
					smplR.smpl_qty(upSmplR.smpl_qty());
					smplR.base_unit_cd(upSmplR.base_unit_cd());
					smplR.pack_xfr_pack_unit_qty(upSmplR.pack_xfr_pack_unit_qty());
					smplR.pack_xfr_pack_unit_cd(upSmplR.pack_xfr_pack_unit_cd());
					smplR.pack_xfr_base_unit_qty(upSmplR.pack_xfr_base_unit_qty());
					smplR.pack_xfr_base_unit_cd(upSmplR.pack_xfr_base_unit_cd());
					smplR.loc_cd(upSmplR.loc_cd());
					smplR.str_ln_cd(upSmplR.str_ln_cd());
					smplR.stk_arrv_bp_cd(upSmplR.stk_arrv_bp_cd());
					smplR.gd_cd(upSmplR.gd_cd());
					smplR.quality_typ(upSmplR.quality_typ());
					smplR.stk_id_typ(upSmplR.stk_id_typ());
					smplR.stk_bp_cd(upSmplR.stk_bp_cd());
					smplR.lot_no(upSmplR.lot_no());
					smplR.sublot_no(upSmplR.sublot_no());
					smplR.sno1(upSmplR.sno1());
					smplR.sno1_mng_typ(upSmplR.sno1_mng_typ());
					smplR.sno2(upSmplR.sno2());
					smplR.sno2_mng_typ(upSmplR.sno2_mng_typ());
					smplR.sno3(upSmplR.sno3());
					smplR.sno3_mng_typ(upSmplR.sno3_mng_typ());
					smplR.sno4(upSmplR.sno4());
					smplR.sno4_mng_typ(upSmplR.sno4_mng_typ());
					smplR.fix_no_typ(upSmplR.fix_no_typ());
					smplR.fix_no(upSmplR.fix_no());
					smplR.act_tm(upSmplR.act_tm());
					smplR.ac_dt(upSmplR.ac_dt());
					smplR.bd_dpt_cd(upSmplR.bd_dpt_cd());
					smplR.trd_rmrks(upSmplR.trd_rmrks());
					smplR.intr_rmrks(upSmplR.intr_rmrks());
					smplR.sub_char1(upSmplR.sub_char1());
					smplR.sub_char2(upSmplR.sub_char2());
					smplR.sub_char3(upSmplR.sub_char3());
					smplR.lims_flg(upSmplR.lims_flg());
					smplR.ext_sys_cd(upSmplR.ext_sys_cd());
					smplR.ext_insp_smpl_act_no(upSmplR.ext_insp_smpl_act_no());
					
					if (upSmplR.smpl_io_del_flg()) {
						upSmplR.xfr_pack_rtn_flg(!isSame(oldIsaR.pack_xfr_base_unit_cd(),
								oldIsaR.pack_xfr_pack_unit_cd()));
					}

					if (MAC_DATA_CRUD_TYP.isCRT(upSmplR.data_crud_typ())) {
						insL.add(smplR);
					}
					else {
						updL.add(smplR);
					}
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_SMPL_ACT_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_SMPL_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				// 更新項目設定
				MST_INSP_SMPL_ACT_R updL_t = MST_INSP_SMPL_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				editInspSmplActLSetStmt(updL, updL_bldr, updL_t);
				dbUpdateKey("MSBFL5050_MST_INSP_SMPL_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_INSP_SMPL_ACT_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_SMPL_ACT_D01", delL, delL_bldr);
			}
		}

		/**
		 * 検査抜取実績テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editInspSmplActLSetStmt(MCList<MST_INSP_SMPL_ACT_R> updL,
				MCQueryApiBuilder updL_bldr, MST_INSP_SMPL_ACT_R t) {
			updL_bldr.setSet(t.so_qty);
			updL_bldr.addSet(t.smpl_qty);
			updL_bldr.addSet(t.pack_xfr_pack_unit_qty);
			updL_bldr.addSet(t.pack_xfr_pack_unit_cd);
			updL_bldr.addSet(t.pack_xfr_base_unit_qty);
			updL_bldr.addSet(t.loc_cd);
			updL_bldr.addSet(t.str_ln_cd);
			updL_bldr.addSet(t.gd_cd);
			updL_bldr.addSet(t.quality_typ);
			updL_bldr.addSet(t.act_tm);
			updL_bldr.addSet(t.ac_dt);
			updL_bldr.addSet(t.bd_dpt_cd);
			updL_bldr.addSet(t.so_cmpl_flg);
			updL_bldr.addSet(t.trd_rmrks);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}
		protected boolean isUpdSmplIoAct(InspAct_Upd01_HdrR hdrR) {
			
			if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				return false;
			}
			if (MSC_INSP_TYP.isPRCD(hdrR.insp_typ())) {
				return false;
			}
			// 製造検査以外はここまで来たらtrueを返す。
			if (!MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())) {
				return true;
			}
			// 製造検査で、全ての検査予定の作成元ＮＯ４がＮＵＬＬ（検査対象の在庫が発生していない）の場合は引落対象外
			MCList<MST_INSP_SCHD_R> schdL = _schdL.subList(_schdIdx, hdrR.insp_no());
			for (MST_INSP_SCHD_R schdR : schdL) {
				if (!isNull(schdR.src_no4())) {
					return true;
				}
			}
			return false;
		}
		
		protected void insUpdDelSmplIoAct() {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			
			for (InspAct_Upd01_HdrR hdrR : up0()) {
				if (!isUpdSmplIoAct(hdrR)) {
					continue;
				}
				
				MCList<InspAct_Upd01_SmplR> tgtUpSmplL = MCList.create(InspAct_Upd01_SmplR.class);
				MCList<InspAct_Upd01_SmplR> upSmplL = up2().subList(InspAct_Upd01_SmplR.$insp_no, hdrR.insp_no());
				
				for (InspAct_Upd01_SmplR upSmplR : upSmplL) {
					// 仕入検収前の受払実績が登録しない
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(upSmplR.stk_id_typ())) {
						continue;
					}
					
					if (upSmplR.smpl_io_ins_flg() || upSmplR.smpl_io_upd_flg() || upSmplR.smpl_io_del_flg()) {
						tgtUpSmplL.add(upSmplR);
					}
				}
				
				if (tgtUpSmplL.isEmpty()) {
					continue;
				}
				
				for (InspAct_Upd01_SmplR tgtUpSmplR : tgtUpSmplL) {
					o.up0().add(getIoAct(tgtUpSmplR, hdrR));
					
					smplL.add(getSoCmplFlg(tgtUpSmplR));
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
			if (!smplL.isEmpty()) {
				MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
				MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t);
				smplL_bldr.setSet(t.so_cmpl_flg);
				dbUpdateKey("MSBFL5050_MST_INSP_SMPL_ACT_U02", smplL, smplL_bldr);
			}
		}
		
		protected MST_INSP_SCHD_R getSchdBySmplFixNo(InspAct_Upd01_SmplR smplR) {
			MST_INSP_SCHD_R rtnR = MST_INSP_SCHD_R.create();
			if (MSC_FIX_NO_TYP.isARR_ACT_NO(smplR.fix_no_typ())) {
				rtnR = _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, smplR.fix_no());
			}
			else if (MSC_FIX_NO_TYP.isYIELD_ACT_NO(smplR.fix_no_typ())) {
				rtnR = _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, smplR.fix_no());
			}
			else if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(smplR.fix_no_typ())) {
				rtnR = _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, smplR.fix_no());
			}
			return rtnR;
		}
		
		protected MST_INSP_SMPL_ACT_R getSoCmplFlg(InspAct_Upd01_SmplR upSmplR) {
			MST_INSP_SMPL_ACT_R smplR = MST_INSP_SMPL_ACT_R.create();
			smplR.insp_smpl_act_no(upSmplR.insp_smpl_act_no());
			if (upSmplR.smpl_io_ins_flg() || upSmplR.smpl_io_upd_flg()) {
				smplR.so_cmpl_flg(true);
			}
			else if (upSmplR.smpl_io_del_flg()) {
				smplR.so_cmpl_flg(false);
			}
			return smplR;
		}
		
		protected IoAct_Ins01_DtlR getIoAct(InspAct_Upd01_SmplR upSmplR, InspAct_Upd01_HdrR hdrR) {
			IoAct_Ins01_DtlR rtnR = IoAct_Ins01_DtlR.create();
			MAM_ITM_R itmR = _itmCache.get(upSmplR.itm_cd(), upSmplR.itm_sub1(), upSmplR.itm_sub2(), upSmplR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(upSmplR.loc_cd());
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, upSmplR.insp_no());
			MST_INSP_SCHD_R schdR = getInspSchdR(instR, upSmplR);
			
			if (upSmplR.smpl_io_ins_flg()) {
				rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				rtnR.stk_insp_typ(upSmplR.stk_insp_typ());
				if (schdR.in_prmt_insp_flg()) rtnR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			else if (upSmplR.smpl_io_upd_flg()) {
				rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				rtnR.stk_insp_typ(upSmplR.stk_insp_typ());
			}
			else if (upSmplR.smpl_io_del_flg()) {
				rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			
			if (upSmplR.smpl_io_upd_flg() || upSmplR.smpl_io_del_flg()) {
				rtnR.can_ac_dt(upSmplR.can_ac_dt());
			}
			
			rtnR.act_d_no(upSmplR.insp_smpl_act_no());
			rtnR.trn_typ(MSC_TRN_TYP.INSP_SMPL.value());
			
			if (upSmplR.smpl_io_del_flg()) {
				return rtnR;
			}
			
			rtnR.ac_dt(upSmplR.ac_dt());
			rtnR.act_tm(upSmplR.act_tm());
			rtnR.act_no(hdrR.insp_act_no());
			rtnR.trd_cd(schdR.trd_cd());
			rtnR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP_SMPL.value());
			rtnR.gi_wg_cd(locR.wg_cd());
			if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create();
				MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrActR_bldr = MCQueryApiBuilder.create(t);
				MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
				MST_PO_D_R t3 = MST_PO_D_R.create("T3");
				MST_PO_R t4 = MST_PO_R.create("T4");
				MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("ARRPR");
				arrActR_bldr.setSelect(t3.ap_dpt_cd);
				arrActR_bldr.addSelect(t4.purc_dpt_cd);
				arrActR_bldr.addLeftOuterJoin(t2, t.arr_schd_no.eq(t2.arr_schd_no));
				arrActR_bldr.addLeftOuterJoin(arrPrR, t2.arr_pr_no.eq(arrPrR.arr_pr_no));
				arrActR_bldr.addLeftOuterJoin(t3, arrPrR.po_d_no.eq(t3.po_d_no));
				arrActR_bldr.addLeftOuterJoin(t4, t3.po_no.eq(t4.po_no));
				arrActR_bldr.setWhere(t.arr_act_no.eq(bind("1")), schdR.src_no4());
				dbSelect("MSBFL5050_MST_ARR_ACT_S01", arrActR, arrActR_bldr);
				
				if (!isNull(arrActR)) {
					rtnR.purc_dpt_cd(arrActR.getStringNE("PURC_DPT_CD"));
					rtnR.ap_dpt_cd(arrActR.getStringNE("AP_DPT_CD"));
				}
				else {
					rtnR.purc_dpt_cd(null);
					rtnR.ap_dpt_cd(null);
				}
			}
			else {
				rtnR.purc_dpt_cd(null);
				rtnR.ap_dpt_cd(null);
			}
			rtnR.act_usr_cd(hdrR.act_usr_cd());
			rtnR.act_dpt_cd(hdrR.act_dpt_cd());
			rtnR.itm_cd(upSmplR.itm_cd());
			rtnR.itm_sub1(upSmplR.itm_sub1());
			rtnR.itm_sub2(upSmplR.itm_sub2());
			rtnR.itm_sub3(upSmplR.itm_sub3());
			rtnR.itm_nm(instR.itm_nm());
			rtnR.stk_mng_typ(itmR.stk_mng_typ());
			rtnR.sundry_itm_flg(itmR.sundry_itm_flg());
			rtnR.gi_loc_cd(upSmplR.loc_cd());
			rtnR.gi_str_ln_cd(upSmplR.str_ln_cd());
			rtnR.stk_arrv_bp_cd(upSmplR.stk_arrv_bp_cd());
			rtnR.lot_no(upSmplR.lot_no());
			rtnR.sublot_no(upSmplR.sublot_no());
			rtnR.sno1(upSmplR.sno1());
			rtnR.sno1_mng_typ(upSmplR.sno1_mng_typ());
			rtnR.sno2(upSmplR.sno2());
			rtnR.sno2_mng_typ(upSmplR.sno2_mng_typ());
			rtnR.sno3(upSmplR.sno3());
			rtnR.sno3_mng_typ(upSmplR.sno3_mng_typ());
			rtnR.sno4(upSmplR.sno4());
			rtnR.sno4_mng_typ(upSmplR.sno4_mng_typ());
			if (MSC_STK_INSP_TYP.isFIN(rtnR.stk_insp_typ())) {
				rtnR.fix_no_typ(null);
				rtnR.fix_no(null);
			}
			else {
				rtnR.fix_no_typ(upSmplR.fix_no_typ());
				rtnR.fix_no(upSmplR.fix_no());
			}
			rtnR.gi_gd_cd(upSmplR.gd_cd());
			rtnR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			rtnR.quality_typ(upSmplR.quality_typ());
			rtnR.stk_id_typ(upSmplR.stk_id_typ());
			rtnR.stk_bp_cd(upSmplR.stk_bp_cd());
			rtnR.trd_unit_qty(upSmplR.so_qty());
			rtnR.trd_unit_cd(upSmplR.base_unit_cd());
			rtnR.pack_unit_qty(upSmplR.so_qty());
			rtnR.pack_unit_cd(upSmplR.base_unit_cd());
			rtnR.base_unit_qty(upSmplR.so_qty());
			rtnR.base_unit_cd(upSmplR.base_unit_cd());
			if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				MST_OPER_ACT_R oaR = MST_OPER_ACT_R.create();
				MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
				MCQueryApiBuilder oaR_bldr = MCQueryApiBuilder.create(t);
				oaR_bldr.setSelect(t.mfg_act_no);
				oaR_bldr.addSelect(t.itm_mfg_inst_no);
				oaR_bldr.setWhere(t.arr_act_no.eq(bind("1")), schdR.src_no4());
				dbSelect("MSBFL5050_MST_OPER_ACT_S01", oaR, oaR_bldr);
				
				rtnR.itm_mfg_inst_no(oaR.itm_mfg_inst_no());
				rtnR.mfg_act_no(oaR.mfg_act_no());
			}
			else if (MSC_INSP_TYP.isPRDCT(instR.insp_typ())) {
				rtnR.itm_mfg_inst_no(schdR.src_no2());
				
				MST_YIELD_ACT_R yaR = MST_YIELD_ACT_R.create();
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yaR_bldr = MCQueryApiBuilder.create(t);
				yaR_bldr.setSelect(t.mfg_act_no);
				yaR_bldr.setWhere(t.yield_act_no.eq(bind("1")), schdR.src_no4());
				dbSelect("MSBFL5050_MST_YIELD_ACT_S01", yaR, yaR_bldr);
				
				rtnR.mfg_act_no(yaR.mfg_act_no());
			}
			else {
				rtnR.itm_mfg_inst_no(null);
				rtnR.mfg_act_no(null);
			}
			rtnR.pack_xfr_qty(upSmplR.pack_xfr_pack_unit_qty());
			rtnR.pack_xfr_unit_cd(upSmplR.pack_xfr_pack_unit_cd());
			rtnR.mfg_inst_unit_typ(itmR.mfg_inst_unit_typ());
			rtnR.trd_rmrks(upSmplR.trd_rmrks());
			rtnR.trd_d_rmrks();
			rtnR.no_gi_alloc_flg(true);
			rtnR.bd_dpt_cd(upSmplR.bd_dpt_cd());
			rtnR.setAttributes(upSmplR);
			
			return rtnR;
		}
		
		protected MST_INSP_SCHD_R getInspSchdR(MST_INSP_INST_R instR, InspAct_Upd01_SmplR r) {
			if (!isNull(r.insp_schd_no())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, r.insp_schd_no());
			}
			else if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, r.fix_no());
			}
			else if (MSC_INSP_TYP.isPRDCT(instR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, r.fix_no());
			}
			else if (MSC_INSP_TYP.isLOT(instR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, r.fix_no());
			}
			else {
				return null;
			}
		}
		
		protected void callPlntAprvUpdSrv() {
			MSBFL_PlntAprvService.PlntAprv_Upd01 o = MSBFL_PlntAprvService.crtPlntAprv_Upd01();
			
			MCList<MST_INSP_SCHD_R> isL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t1);
			isL_bldr.setWhere(t1.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S07", isL, isL_bldr, up0());
			
			MCList<MST_PLNT_APRV_D_R> padL = MCList.create(MST_PLNT_APRV_D_R.class);
			MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(t2);
			padL_bldr.setWhere(t2.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_PLNT_APRV_D_S02", padL, padL_bldr, up0());
			
			for (InspAct_Upd01_HdrR r : up0()) {
				MST_INSP_INST_R iiR = _instL.getFirst(_instIdx, r.insp_no());
				
				if (!isPlntAprv(r, iiR)) {
					continue;
				}
				
				String dataCrudTyp = null;
				MCList<MST_PLNT_APRV_D_R> subPadL = padL.subList(MST_PLNT_APRV_D_R.$insp_no, r.insp_no());
				if (MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
					if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
						if (subPadL.isEmpty()) {
							if (r.getBooleanNE("crt_plnt_arpv_flg")) {
								dataCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
							}
						}
						else {
							if (r.getBooleanNE("crt_plnt_arpv_flg")) {
								dataCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
							}
							else {
								dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
							}
						}
					}
					else {
						if (MAC_QUALITY_TYP.isGOOD(r.quality_typ())) {
							if (subPadL.isEmpty()) {
								dataCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
							}
							else {
								dataCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
							}
						}
						else {
							if (subPadL.isEmpty()) {
								continue;
							}
							else {
								dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
							}
						}
					}
				}
				else {
					if (subPadL.isEmpty()) {
						continue;
					}
					else {
						dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
					}
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp)) {
					MCList<MST_INSP_SCHD_R> subIsL = isL.subList(MST_INSP_SCHD_R.$insp_no, r.insp_no());
					
					for (MST_INSP_SCHD_R isR : subIsL) {
						PlntAprv_Chk01_RsltR oR = PlntAprv_Chk01_RsltR.create();
						
						oR.data_crud_typ(dataCrudTyp);
						oR.plnt_aprv_no(null);
						oR.plnt_aprv_d_no(null);
						oR.insp_typ(r.insp_typ());
						oR.insp_no(r.insp_no());
						oR.src_no1(isR.src_no1());
						oR.src_no2(isR.src_no2());
						oR.src_no3(isR.src_no3());
						oR.src_no4(isR.src_no4());
						oR.itm_cd(r.itm_cd());
						oR.itm_sub1(r.itm_sub1());
						oR.itm_sub2(r.itm_sub2());
						oR.itm_sub3(r.itm_sub3());
						oR.lot_no(r.lot_no());
						oR.sublot_no(r.sublot_no());
						oR.loc_cd(isR.loc_cd());
						oR.setAttributes(r);
						if (MSC_INSP_TYP.isLOT(isR.insp_typ())) {
							oR.insp_schd_no(isR.org_insp_schd_no());
						}
						
						o.up0().add(oR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp) || MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)) {
					MST_INSP_SCHD_R isR = isL.getFirst(MST_INSP_SCHD_R.$insp_no, r.insp_no());
					MCList<MST_INSP_SCHD_R> subIsL = isL.subList(MST_INSP_SCHD_R.$insp_no, r.insp_no());
					int count = 0;
					
					for (MST_PLNT_APRV_D_R padR : subPadL) {
						PlntAprv_Chk01_RsltR oR = PlntAprv_Chk01_RsltR.create();
						
						oR.data_crud_typ(dataCrudTyp);
						oR.plnt_aprv_no(padR.plnt_aprv_no());
						oR.plnt_aprv_d_no(padR.plnt_aprv_d_no());
						oR.insp_typ(padR.insp_typ());
						oR.insp_no(padR.insp_no());
						oR.src_no1(padR.src_no1());
						oR.src_no2(padR.src_no2());
						oR.src_no3(padR.src_no3());
						oR.src_no4(padR.src_no4());
						oR.itm_cd(r.itm_cd());
						oR.itm_sub1(r.itm_sub1());
						oR.itm_sub2(r.itm_sub2());
						oR.itm_sub3(r.itm_sub3());
						oR.lot_no(r.lot_no());
						oR.sublot_no(r.sublot_no());
						oR.loc_cd(isR.loc_cd());
						oR.setAttributes(r);
						if (MSC_INSP_TYP.isLOT(isR.insp_typ()) 
								&& !isNull(subIsL) && !subIsL.isEmpty() 
								&& subIsL.size() == subPadL.size()) {
							// 検査予定（：検査NOで抽出）、工場出荷承認明細（：検査予定NOで抽出）は、同じ行数
							// 検査予定NOはロット検査時に使用
							// ロット検査時、作成元項目はつねにNULLとなっているので、検査予定キャッシュから設定する値は検査予定NOのみでよい
							// また、工場出荷承認明細の更新処理は、削除登録なので、結果工場出荷承認明細レコードは作り直している
							// そのため、工場出荷承認明細NOと検査予定NOの紐づけや並び順などは保証しなくてよいので、検査予定NOは頭から設定していく
							oR.insp_schd_no(subIsL.get(count).org_insp_schd_no());
						}
						count++;
						
						o.up0().add(oR);
					}
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected boolean isPlntAprv(InspAct_Upd01_HdrR r, MST_INSP_INST_R iiR) {
			if (!iiR.plnt_aprv_flg()) {
				return false;
			}
			// 承認対象の場合には判定時に工場出荷承認情報を作成するので、ここでは呼び出さない。
			if (iiR.insp_aprv_flg()) {
				return false;
			}
			return true;
		}
		
		protected void callLotUpd04() {
			MSBFL_LotService.Lot_Upd04 o = MSBFL_LotService.crtLot_Upd04();
			
			for (InspAct_Upd01_HdrR r : up0()) {
				Lot_Upd04_CndR oR = Lot_Upd04_CndR.create();
				
				if (!MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
					continue;
				}
				
				oR.insp_typ(r.insp_typ());
				oR.vld_dt_flg(r.vld_dt_upd_flg());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.vld_dt(r.vld_dt());
				oR.lmt_dt(r.lmt_dt());
				oR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
				oR.lmt_dt_frm(r.lmt_dt_frm());
				oR.act_cont_fctr(r.act_cont_fctr());
				oR.base_gr_dt(r.end_tm().trunc(MCDateFieldType.DAY));
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			for (InspAct_Upd01_HdrR r : up0()) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				
				oR.insp_no(r.insp_no());
				oR.insp_typ(r.insp_typ());
				oR.lmt_up_flg(instR.lmt_up_flg());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.quality_typ(r.quality_typ());
				oR.stk_insp_typ(getStkInspTyp(r));
				oR.plnt_aprv_sts_typ(null);
				oR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(false);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(true);
				oR.insp_judg_flg(false);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected String getStkInspTypForActd(InspAct_Upd01_HdrR r) {
			if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
				// 検査状況区分：完了の場合
				if (isNull(r.insp_aprv_sts_typ())) {
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.WAIT_JUDG.value();
				}
			}
			if (MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ())) {
				return MSC_STK_INSP_TYP.ING.value();
			}
			else {
				// 検査状況区分：完了の場合
				if (isNull(r.insp_aprv_sts_typ())) {
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.WAIT_JUDG.value();
				}
			}
		}
		
		protected String getStkInspTyp(InspAct_Upd01_HdrR r) {
			if (MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ())) {
				return MSC_STK_INSP_TYP.ING.value();
			}
			else {
				// 検査状況区分：完了の場合
				if (isNull(r.insp_aprv_sts_typ())) {
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.WAIT_JUDG.value();
				}
			}
		}
		
		protected void callLotUpd02() {
			MSBFL_LotService.Lot_Upd02 o = MSBFL_LotService.crtLot_Upd02();
			
			for (InspAct_Upd01_HdrR r : up0()) {
				Lot_Upd02_CndR oR = Lot_Upd02_CndR.create();
				
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.lot_rmrks(r.lot_rmrks());
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void callSloStsIns02() {
			MSBBL_SloStsRegService.SloSts_Ins02 o = MSBBL_SloStsRegService.crtSloSts_Ins02();
			
			for (InspAct_Upd01_HdrR r : up0()) {
				
				MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdIdx, r.insp_no());
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				if (!isNull(r.stt_data_crud_typ())) {
					SloSts_DtlR oR = SloSts_DtlR.create();
					copy(oR, schdR, createMap_SloSts_DtlR_MST_INSP_SCHD_R());
					oR.data_crud_typ(r.stt_data_crud_typ());
					oR.unit_cd(r.base_unit_cd());
					oR.qty(r.base_unit_qty());
					oR.biz_tm(instR.inst_dt());
					oR.st_schd_tm(instR.st_tm());
					oR.end_schd_tm(instR.end_tm());
					oR.st_act_tm(r.st_tm());
					oR.insp_act_no(r.insp_act_no());
					oR.slo_sts_typ(MSC_SLO_STS_TYP.INSP_ST.value());
					o.up0().add(oR);
				}
				if (!isNull(r.act_data_crud_typ())) {
					SloSts_DtlR oR = SloSts_DtlR.create();
					copy(oR, schdR, createMap_SloSts_DtlR_MST_INSP_SCHD_R());
					oR.data_crud_typ(r.act_data_crud_typ());
					oR.unit_cd(r.base_unit_cd());
					oR.qty(r.base_unit_qty());
					oR.biz_tm(instR.inst_dt());
					oR.st_schd_tm(instR.st_tm());
					oR.end_schd_tm(instR.end_tm());
					oR.st_act_tm(r.st_tm());
					oR.end_act_tm(r.end_tm());
					oR.insp_act_no(r.insp_act_no());
					oR.slo_sts_typ(MSC_SLO_STS_TYP.INSP_CMPL.value());
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected Map_SloSts_DtlR_MST_INSP_SCHD_R<SloSts_DtlR,MST_INSP_SCHD_R> createMap_SloSts_DtlR_MST_INSP_SCHD_R() {
			return new Map_SloSts_DtlR_MST_INSP_SCHD_R<SloSts_DtlR, MST_INSP_SCHD_R>();
		}

		public class Map_SloSts_DtlR_MST_INSP_SCHD_R<D extends SloSts_DtlR, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloSts_DtlR.$itm_cd, MST_INSP_SCHD_R.$itm_cd);
				addColumnPathMap(SloSts_DtlR.$itm_sub1, MST_INSP_SCHD_R.$itm_sub1);
				addColumnPathMap(SloSts_DtlR.$itm_sub2, MST_INSP_SCHD_R.$itm_sub2);
				addColumnPathMap(SloSts_DtlR.$itm_sub3, MST_INSP_SCHD_R.$itm_sub3);
				addColumnPathMap(SloSts_DtlR.$sno1, MST_INSP_SCHD_R.$sno1);
				addColumnPathMap(SloSts_DtlR.$sno2, MST_INSP_SCHD_R.$sno2);
				addColumnPathMap(SloSts_DtlR.$sno3, MST_INSP_SCHD_R.$sno3);
				addColumnPathMap(SloSts_DtlR.$sno4, MST_INSP_SCHD_R.$sno4);
				addColumnPathMap(SloSts_DtlR.$insp_no, MST_INSP_SCHD_R.$insp_no);
			}
		}
		
		/**
		 * 検査状況区分：完了⇒着手中への更新かどうかを返す。
		 * @param hdrR
		 * @return
		 */
		protected boolean isJdgToStr(InspAct_Upd01_HdrR hdrR) {
			if (MSC_INSP_STS_TYP.isJDG(hdrR.old_insp_sts_typ()) && MSC_INSP_STS_TYP.isSTR(hdrR.insp_sts_typ())) {
				return true;
			}
			return false;
		}

		/**
		 * 検査状況区分：着手中⇒完了への更新かどうかを返す。
		 * @param hdrR
		 * @return
		 */
		protected boolean isStrToJdg(InspAct_Upd01_HdrR hdrR) {
			if (MSC_INSP_STS_TYP.isSTR(hdrR.old_insp_sts_typ()) && MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())) {
				return true;
			}
			return false;
		}

		protected void callIoActUpd01() {
			// 検査予定サービスから呼び出した場合、
			// 検査予定サービスの呼出元が受払実績サービスを呼び出すので、
			// ここでは受払実績サービスを呼び出さない。
			if (up0().get(0).no_call_io_act_upd_flg()) {
				return;
			}
			
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
			o.exec();
		}
		
		protected void callOrdUpd04() {
			MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();

			for (InspAct_Upd01_HdrR r : up0()) {
				MCList<MST_ITM_ORDER_R> ioL = MCList.create(MST_ITM_ORDER_R.class);

				if (MSC_INSP_TYP.isLOT(r.insp_typ())
						|| MSC_INSP_TYP.isPRCD(r.insp_typ())) {
					continue;
				}
				else {
					MCList<MST_INSP_SCHD_R> schdL = _schdL.subList(_schdIdx, r.insp_no());

					MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
					MCQueryApiBuilder ioL_bldr = MCQueryApiBuilder.create(t);

					if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
						ioL_bldr.setSelect(t.itm_ord_no);
						ioL_bldr.addSelect(t.itm_ord_typ);
						ioL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
						dbSelect("MSBFL5050_MST_ITM_ORDER_S01", ioL, ioL_bldr,
								schdL.groupBy(MST_INSP_SCHD_R.$itm_ord_no));
					}
					else if (MSC_INSP_TYP.isACCPT(r.insp_typ())) {
						MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T1");
						MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");
						ioL_bldr.setSelect(t.itm_ord_no);
						ioL_bldr.addSelect(t.itm_ord_typ);
						ioL_bldr.addLeftOuterJoin(t1, t.itm_ord_no.eq(t1.pln_itm_ord_no));
						ioL_bldr.addLeftOuterJoin(t2, t1.po_d_no.eq(t2.src_no1));
						ioL_bldr.setWhere(t2.insp_schd_no.eq(bind("insp_schd_no")));
						dbSelect("MSBFL5050_MST_ITM_ORDER_S02", ioL, ioL_bldr, schdL);
					}
				}

				if (!ioL.isEmpty()) {
					for (MST_ITM_ORDER_R ioR : ioL) {
						Ord_Upd04_DtlR oR = Ord_Upd04_DtlR.create();
						oR.itm_ord_no(ioR.itm_ord_no());
						oR.itm_ord_typ(ioR.itm_ord_typ());
						oR.setAttributes(r);
						o.up0().add(oR);
					}
				}
			}

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void updInspSchd() {
			// 検査予定を空更新する。
			dbUpdateKey("MSBFL5050_MST_INSP_SCHD_U01", _schdL, _schdL_bldr);
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_INST_S08", instL, instL_bldr, up0());
			MCList<InspAct_Upd01_HdrR> tmpL = MCList.create(InspAct_Upd01_HdrR.class);
			MCIndexKey idxkey = instL.createIndex(MST_INSP_INST_R.$insp_no);
			for (InspAct_Upd01_HdrR r : up0()) {
				MST_INSP_INST_R instR = instL.getFirst(idxkey, r.insp_no());
				if (instR.insp_aprv_flg() && MSC_INSP_STS_TYP.isJDG(r.insp_sts_typ())) {
					InspAct_Upd01_HdrR tmpR = r.clone();
					tmpR.insp_aprv_role_cd(instR.insp_aprv_role_cd());
					tmpR.end_tm(r.end_tm().trunc(MCDateFieldType.DAY));
					tmpL.add(tmpR);
				}
			}
			
			if (tmpL.isEmpty()) {
				return ;
			}

			idxkey = tmpL.createIndex(InspAct_Upd01_HdrR.$insp_aprv_role_cd, InspAct_Upd01_HdrR.$end_tm);
			for (InspAct_Upd01_HdrR r : tmpL.groupBy(InspAct_Upd01_HdrR.$insp_aprv_role_cd, InspAct_Upd01_HdrR.$end_tm)) {
				int cnt = tmpL.subList(idxkey, r.insp_aprv_role_cd(), r.end_tm()).size();

				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_JUDG_RQST);
				info.setMsg(new MCMessage(MSBFL0090, cnt));
				info.addAprvRole(r.insp_aprv_role_cd(), nvl(r.end_tm(), getToday()));
				info.addScrBind(MSC_INSP_ACT_LIST_REG_OPE.OPE_JUDG.value());

				mgr.exec();
			}
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			// 定数名設定
			putNames();
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_INSP_STS_TYP.putNameNE(up0(), InspAct_Upd01_HdrR.$insp_sts_typ, InspAct_Upd01_HdrR.$insp_sts_typ_nm, getUsrLocale());
			MSC_INSP_APRV_STS_TYP.putNameNE(up0(), InspAct_Upd01_HdrR.$insp_aprv_sts_typ, InspAct_Upd01_HdrR.$insp_aprv_sts_typ_nm, getUsrLocale());
		}
		/**
		 * 仕入実績を登録する
		 */
		protected void callThisUpd05() {
			MSBFL_InspActService.InspAct_Upd05 o = MSBFL_InspActService.crtInspAct_Upd05();

			addAll(o.up0(), up0(), createMap_InspAct_Upd05_HdrR_InspAct_Upd01_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Upd05_DtlR_InspAct_Upd01_DtlR());
			setHdrPegNo(o.up1());

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void setHdrPegNo(MCList<InspAct_Upd05_DtlR> oUp1L) {
			MCIndexKey hdrIdx = up0().createIndex(InspAct_Upd01_HdrR.$insp_no);
			MCIndexKey dtlIdx = up1().createIndex(InspAct_Upd01_DtlR.$peg_no);
			
			for (InspAct_Upd05_DtlR r : oUp1L) {
				InspAct_Upd01_DtlR dtlR = up1().getFirst(dtlIdx, r.peg_no());
				InspAct_Upd01_HdrR hdrR = up0().getFirst(hdrIdx, dtlR.insp_no());
				r.hdr_peg_no(hdrR.peg_no());
			}
		}
		
		protected Map_InspAct_Upd05_HdrR_InspAct_Upd01_HdrR<InspAct_Upd05_HdrR,InspAct_Upd01_HdrR> createMap_InspAct_Upd05_HdrR_InspAct_Upd01_HdrR() {
			return new Map_InspAct_Upd05_HdrR_InspAct_Upd01_HdrR<InspAct_Upd05_HdrR, InspAct_Upd01_HdrR>();
		}

		public class Map_InspAct_Upd05_HdrR_InspAct_Upd01_HdrR<D extends InspAct_Upd05_HdrR, S extends InspAct_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd05_HdrR.$peg_no, InspAct_Upd01_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd05_HdrR.$insp_act_no, InspAct_Upd01_HdrR.$insp_act_no);
			}
		}

		protected Map_InspAct_Upd05_DtlR_InspAct_Upd01_DtlR<InspAct_Upd05_DtlR,InspAct_Upd01_DtlR> createMap_InspAct_Upd05_DtlR_InspAct_Upd01_DtlR() {
			return new Map_InspAct_Upd05_DtlR_InspAct_Upd01_DtlR<InspAct_Upd05_DtlR, InspAct_Upd01_DtlR>();
		}

		public class Map_InspAct_Upd05_DtlR_InspAct_Upd01_DtlR<D extends InspAct_Upd05_DtlR, S extends InspAct_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd05_DtlR.$peg_no, InspAct_Upd01_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd05_DtlR.$insp_act_d_no, InspAct_Upd01_DtlR.$insp_act_d_no);
			}
		}
	}
	/**
	 * InspAct_Upd02オペレーション.<p>
	 *
	 * 検査実績の判定を行う。<br>
	 */
	public class InspAct_Upd02 extends MSBFL_InspActService_MC_A.InspAct_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			createCache();
			updInspInst();
			updInspAct();
			callLotUpd04();
			callLotUpd05();
			callLotUpd02();
			MCList<MST_INSP_JUDG_D_R> judgdL = insInspJudgD();
			insReInspSchd(judgdL);
			insPlntAprv();
			callThisUpd05();
			callIoActUpd01();

			// プッシュ通知
			callPushNtc();

			// 明細の下り電文設定は#insInspJudgDにて行っているので、
			// ここでは行わない。
			setDownHdr();
		}
		
		protected void createCache() {
			createItmCache();
			createLocCache();
			createInspSchdCache();
			createInspInstCache();
			createInspActtCache();
			createLotCache();
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		
		protected void createItmCache() {
			MCQueryApiBuilder itmDbcL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmDbcL_bldr, up1(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
		}
		
		protected void createLocCache() {
			MCQueryApiBuilder locDbcL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locDbcL_bldr, up1(), MAM_LOC_R.$loc_cd);
		}
		
		protected void setDownHdr() {
			for (InspAct_Upd02_HdrR r : up0()) {
				InspAct_Upd02_HdrR downR = InspAct_Upd02_HdrR.create();
				
				downR.peg_no(r.peg_no());
				downR.insp_no(r.insp_no());
				downR.insp_act_no(r.insp_act_no());
				downR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				MSC_INSP_APRV_STS_TYP.putNameNE(downR, InspAct_Upd02_HdrR.$insp_aprv_sts_typ, InspAct_Upd02_HdrR.$insp_aprv_sts_typ_nm, getUsrLocale());
				down0().add(downR);
			}
		}
		
		protected void updInspInst() {
			MCList<MST_INSP_INST_R> iiL = MCList.create(MST_INSP_INST_R.class);
			
			for (InspAct_Upd02_HdrR r : up0()) {
				MST_INSP_INST_R instR = _inspInstCache.get(r.insp_no());
				MST_INSP_INST_R iiR = MST_INSP_INST_R.create();
				iiR.insp_no(r.insp_no());
				r.insp_aprv_sts_typ(MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value());
				iiR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				iiR.act_cont_fctr(r.act_cont_fctr());
				if (!isNull(instR)) {
					if (instR.insp_rslt_prnt_flg()) {
						iiR.seq(instR.seq().add(MCNumber.ONE));
					}
					else {
						iiR.seq(instR.seq());
					}
				}
				else {
					iiR.seq(MCNumber.ONE);
				}
				iiR.insp_rslt_prnt_flg(false);
				iiR.insp_rslt_prnt_tm(null);
				iiL.add(iiR);
			}

			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder iiL_bldr = MCQueryApiBuilder.create(t);
			iiL_bldr.setSet(t.insp_aprv_sts_typ);
			iiL_bldr.addSet(t.act_cont_fctr);
			iiL_bldr.addSet(t.insp_rslt_prnt_flg);
			iiL_bldr.addSet(t.insp_rslt_prnt_tm);
			dbUpdateKey("MSBFL5050_MST_INSP_INST_U02", iiL, iiL_bldr);
		}
		
		protected void updInspAct() {
			MCList<MST_INSP_ACT_R> iaL = MCList.create(MST_INSP_ACT_R.class);
			
			for (InspAct_Upd02_HdrR r : up0()) {
				MST_INSP_ACT_R iaR = MST_INSP_ACT_R.create();
				iaR.insp_act_no(r.insp_act_no());
				iaR.judg_dt(r.judg_dt());
				iaR.insp_judg_rslt_typ(r.insp_judg_rslt_typ());
				iaR.judg_dpt_cd(r.judg_dpt_cd());
				iaR.judg_usr_cd(r.judg_usr_cd());
				iaR.judg_rsn(r.judg_rsn());
				iaR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
				iaR.lmt_dt_frm(r.lmt_dt_frm());
				iaR.vld_dt(r.vld_dt());
				iaR.lmt_dt(r.lmt_dt());
				iaR.intr_rmrks(r.intr_rmrks());
				iaL.add(iaR);
			}

			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(t);
			iaL_bldr.setSet(t.judg_dt);
			iaL_bldr.addSet(t.insp_judg_rslt_typ);
			iaL_bldr.addSet(t.judg_dpt_cd);
			iaL_bldr.addSet(t.judg_usr_cd);
			iaL_bldr.addSet(t.judg_rsn);
			iaL_bldr.addSet(t.lmt_dt_frm_typ);
			iaL_bldr.addSet(t.lmt_dt_frm);
			iaL_bldr.addSet(t.vld_dt);
			iaL_bldr.addSet(t.lmt_dt);
			iaL_bldr.addSet(t.intr_rmrks);
			dbUpdateKey("MSBFL5050_MST_INSP_ACT_U03", iaL, iaL_bldr);
		}
		
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected FXUCL_MCDbcCache<MST_INSP_INST_R> _inspInstCache;
		protected FXUCL_MCDbcCache<MST_INSP_ACT_R> _inspActCache;
		protected FXUCL_MCDbcCache<MST_LOT_R> _lotCache;
		
		MCIndexKey _schdIdx;
		
		protected void createLotCache() {
			MCQueryApiBuilder lotDbc_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
			_lotCache = new FXUCL_MCDbcCache<MST_LOT_R>(lotDbc_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2,
					MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
		}
		
		protected void createInspSchdCache() {
			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S08", _schdL, _schdL_bldr, up0());
			_schdIdx = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
		}
		
		protected void createInspInstCache() {
			MCQueryApiBuilder inspInstDbc_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			_inspInstCache = new FXUCL_MCDbcCache<MST_INSP_INST_R>(inspInstDbc_bldr, up0(), MST_INSP_INST_R.$insp_no);
		}

		protected void createInspActtCache() {
			MCQueryApiBuilder inspActtDbc_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T"));
			_inspActCache = new FXUCL_MCDbcCache<MST_INSP_ACT_R>(inspActtDbc_bldr, up0(), MST_INSP_ACT_R.$insp_act_no);
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {

			MCList<MST_INSP_ACT_R> selectL = MCList.create(MST_INSP_ACT_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T"));
			dbSelectKey("MSBFL5050_MST_INSP_ACT_S05", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_ACT_R.$act_dpt_cd, MST_INSP_ACT_R.$judg_dt);
			
			for (MST_INSP_ACT_R actR : selectL.groupBy(MST_INSP_ACT_R.$act_dpt_cd, MST_INSP_ACT_R.$judg_dt)) {
				int cnt = selectL.subList(idxkey, actR.act_dpt_cd(), actR.judg_dt()).size();
				
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_JUDG_RESULT);
				info.setMsg(new MCMessage(MSBFL0092, cnt));
				info.addDpt(actR.act_dpt_cd(), nvl(actR.judg_dt(), getToday()));
				info.addScrBind(MSC_INSP_ACT_LIST_REG_OPE.OPE_REF.value(), false, false, true, MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value(), toYMDString(actR.judg_dt()), toYMDString(actR.judg_dt()), null, null);

				mgr.exec();
			}
		}
		
		protected void callLotUpd04() {
			MSBFL_LotService.Lot_Upd04 o = MSBFL_LotService.crtLot_Upd04();
			
			for (InspAct_Upd02_HdrR r : up0()) {
				Lot_Upd04_CndR oR = Lot_Upd04_CndR.create();
				
				oR.insp_typ(r.insp_typ());
				oR.vld_dt_flg(r.vld_dt_upd_flg());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.vld_dt(r.vld_dt());
				oR.lmt_dt(r.lmt_dt());
				oR.lmt_dt_frm_typ(r.lmt_dt_frm_typ());
				oR.lmt_dt_frm(r.lmt_dt_frm());
				oR.act_cont_fctr(r.act_cont_fctr());
				oR.base_gr_dt(r.judg_dt());
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			for (InspAct_Upd02_HdrR r : up0()) {
				MST_INSP_INST_R iiR = _inspInstCache.get(r.insp_no());
				MST_LOT_R lotR = _lotCache.get(r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no());
				
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				oR.insp_no(r.insp_no());
				oR.insp_typ(r.insp_typ());
				oR.lmt_up_flg(iiR.lmt_up_flg());
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				if (MSC_INSP_JUDG_RSLT_TYP.isRE(r.insp_judg_rslt_typ())) {
					oR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				}
				else {
					oR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				if (MSC_INSP_JUDG_RSLT_TYP.isNG(r.insp_judg_rslt_typ())) {
					oR.quality_typ(MAC_QUALITY_TYP.DFCT_INSP.value());
					oR.plnt_aprv_sts_typ(null);
				}
				else {
					oR.quality_typ(lotR.quality_typ());
					if (iiR.plnt_aprv_flg()) {
						oR.plnt_aprv_sts_typ(MSC_PLNT_APRV_STS_TYP.OPN.value());
					}
					else {
						oR.plnt_aprv_sts_typ(null);
					}
				}
				oR.insp_aprv_sts_typ(MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(false);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(false);
				oR.insp_judg_flg(true);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void callLotUpd02() {
			MSBFL_LotService.Lot_Upd02 o = MSBFL_LotService.crtLot_Upd02();
			
			for (InspAct_Upd02_HdrR r : up0()) {
				Lot_Upd02_CndR oR = Lot_Upd02_CndR.create();
				
				oR.itm_cd(r.itm_cd());
				oR.itm_sub1(r.itm_sub1());
				oR.itm_sub2(r.itm_sub2());
				oR.itm_sub3(r.itm_sub3());
				oR.lot_no(r.lot_no());
				oR.sublot_no(r.sublot_no());
				oR.lot_rmrks(r.lot_rmrks());
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected MCList<MST_INSP_JUDG_D_R> insInspJudgD() {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			MCList<MST_INSP_JUDG_D_R> judgdL = MCList.create(MST_INSP_JUDG_D_R.class);
			
			for (InspAct_Upd02_HdrR hdrR : up0()) {
				if (isNotUpdStk(hdrR)) {
					continue;
				}
				
				MCList<InspAct_Upd02_DtlR> upJudgdL = up1().subList(
						InspAct_Upd02_DtlR.$insp_act_no, hdrR.insp_act_no());
				
				for (InspAct_Upd02_DtlR upJudgdR : upJudgdL) {
					MST_INSP_JUDG_D_R judgdR = MST_INSP_JUDG_D_R.create();
					
					MST_INSP_SCHD_R schdR = getInspSchdR(hdrR, upJudgdR);
					
					upJudgdR.insp_judg_d_no(getStrSeq(MSC_NUM_SYS_TYP.INSPJD));
					
					judgdR.insp_judg_d_no(upJudgdR.insp_judg_d_no());
					judgdR.insp_act_no(hdrR.insp_act_no());
					judgdR.itm_cd(hdrR.itm_cd());
					judgdR.itm_sub1(hdrR.itm_sub1());
					judgdR.itm_sub2(hdrR.itm_sub2());
					judgdR.itm_sub3(hdrR.itm_sub3());
					judgdR.loc_cd(upJudgdR.loc_cd());
					judgdR.str_ln_cd(upJudgdR.str_ln_cd());
					judgdR.stk_arrv_bp_cd(upJudgdR.stk_arrv_bp_cd());
					
					if (MSC_INSP_JUDG_RSLT_TYP.isNG(hdrR.insp_judg_rslt_typ())) {
						judgdR.quality_typ(MAC_QUALITY_TYP.DFCT_INSP.value());
					}
					else {
						judgdR.quality_typ(upJudgdR.quality_typ());
					}
					if (MSC_INSP_JUDG_RSLT_TYP.isRE(hdrR.insp_judg_rslt_typ())) {
						judgdR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
						judgdR.quality_typ(schdR.quality_typ());
						judgdR.gd_cd(schdR.gd_cd());
					}
					else {
						judgdR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
						judgdR.gd_cd(upJudgdR.gd_cd());
					}
					judgdR.stk_id_typ(upJudgdR.stk_id_typ());
					judgdR.stk_bp_cd(upJudgdR.stk_bp_cd());
					judgdR.lot_no(upJudgdR.lot_no());
					judgdR.sublot_no(upJudgdR.sublot_no());
					judgdR.sno1(upJudgdR.sno1());
					judgdR.sno1_mng_typ(upJudgdR.sno1_mng_typ());
					judgdR.sno2(upJudgdR.sno2());
					judgdR.sno2_mng_typ(upJudgdR.sno2_mng_typ());
					judgdR.sno3(upJudgdR.sno3());
					judgdR.sno3_mng_typ(upJudgdR.sno3_mng_typ());
					judgdR.sno4(upJudgdR.sno4());
					judgdR.sno4_mng_typ(upJudgdR.sno4_mng_typ());
					judgdR.fix_no_typ(upJudgdR.fix_no_typ());
					judgdR.fix_no(upJudgdR.fix_no());
					judgdR.pack_unit_qty(upJudgdR.pack_unit_qty());
					judgdR.pack_unit_cd(upJudgdR.pack_unit_cd());
					judgdR.base_unit_qty(upJudgdR.base_unit_qty());
					judgdR.base_unit_cd(upJudgdR.base_unit_cd());
					judgdR.ac_dt(upJudgdR.ac_dt());
					judgdR.sub_char1(upJudgdR.sub_char1());
					judgdR.sub_char2(upJudgdR.sub_char2());
					judgdR.sub_char3(upJudgdR.sub_char3());
					
					judgdL.add(judgdR);
					
					setDownDtl(upJudgdR, judgdR);
					o.up0().addAll(getIoActR(hdrR, upJudgdR, judgdR));
				}
			}
			
			if (!judgdL.isEmpty()) {
				MCQueryApiBuilder judgdL_bldr = MCQueryApiBuilder.create(MST_INSP_JUDG_D_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_JUDG_D_I01", judgdL, judgdL_bldr);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
			
			return judgdL;
		}
		
		protected boolean isNotUpdStk(InspAct_Upd02_HdrR r) {
			MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdIdx, r.insp_no());
			MST_INSP_INST_R instR = _inspInstCache.get(MST_INSP_INST_R.$insp_no, r.insp_no());
			
			if (MSC_INSP_TYP.isPRCD(instR.insp_typ())) {
				return true;
			}
			if (instR.lmt_up_flg()) {
				return true;
			}
			// 検査中使用許可品は品目＋工場・物流倉庫の単位で設定されるため、
			// 検査予定がまとめられている場合でも検査予定のうち一つのみ評価すれば十分である。
			if (schdR.in_prmt_insp_flg()) {
				return true;
			}
			return false;
		}
		
		protected void setDownDtl(InspAct_Upd02_DtlR dtlR, MST_INSP_JUDG_D_R ijDR) {
			InspAct_Upd02_DtlR downR = InspAct_Upd02_DtlR.create();
			
			downR.peg_no(dtlR.peg_no());
			downR.insp_judg_d_no(ijDR.insp_judg_d_no());
			downR.insp_no(dtlR.insp_no());
			downR.insp_act_no(dtlR.insp_act_no());
			downR.quality_typ(ijDR.quality_typ());
			downR.stk_insp_typ(ijDR.stk_insp_typ());
			
			down1().add(downR);
		}
		
		protected MCList<IoAct_Ins01_DtlR> getIoActR(
				InspAct_Upd02_HdrR hdrR, InspAct_Upd02_DtlR upJudgdR, MST_INSP_JUDG_D_R judgdR) {
			// 再検査の場合、#insReInspSchdで受払実績を登録するので、
			// ここでは登録しない。
			if (MSC_INSP_JUDG_RSLT_TYP.isRE(hdrR.insp_judg_rslt_typ())) {
				return null;
			}
			
			MCList<IoAct_Ins01_DtlR> retL = MCList.create(IoAct_Ins01_DtlR.class);
			IoAct_Ins01_DtlR giR = IoAct_Ins01_DtlR.create();
			IoAct_Ins01_DtlR grR = IoAct_Ins01_DtlR.create();
			
			MAM_ITM_R itmR = _itmCache.get(upJudgdR.itm_cd(), upJudgdR.itm_sub1(), upJudgdR.itm_sub2(), upJudgdR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(upJudgdR.loc_cd());
			MST_INSP_SCHD_R schdR = getInspSchdR(hdrR, upJudgdR);
			MST_INSP_INST_R instR = _inspInstCache.get(hdrR.insp_no());
			
			giR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			giR.ac_dt(upJudgdR.ac_dt());
			giR.act_tm(hdrR.judg_dt());
			giR.act_no(hdrR.insp_act_no());
			giR.act_d_no(upJudgdR.insp_judg_d_no());
			giR.trd_cd(schdR.trd_cd());
			giR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
			giR.trn_typ(MSC_TRN_TYP.INSP_JUDG.value());
			giR.gi_wg_cd(locR.wg_cd());
			giR.act_usr_cd(hdrR.judg_usr_cd());
			giR.act_dpt_cd(hdrR.judg_dpt_cd());
			giR.itm_cd(upJudgdR.itm_cd());
			giR.itm_sub1(upJudgdR.itm_sub1());
			giR.itm_sub2(upJudgdR.itm_sub2());
			giR.itm_sub3(upJudgdR.itm_sub3());
			giR.itm_nm(instR.itm_nm());
			giR.stk_mng_typ(itmR.stk_mng_typ());
			giR.sundry_itm_flg(itmR.sundry_itm_flg());
			giR.gi_loc_cd(upJudgdR.loc_cd());
			giR.gi_str_ln_cd(upJudgdR.str_ln_cd());
			giR.stk_arrv_bp_cd(upJudgdR.stk_arrv_bp_cd());
			giR.lot_no(upJudgdR.lot_no());
			giR.sublot_no(upJudgdR.sublot_no());
			giR.sno1(upJudgdR.sno1());
			giR.sno1_mng_typ(upJudgdR.sno1_mng_typ());
			giR.sno2(upJudgdR.sno2());
			giR.sno2_mng_typ(upJudgdR.sno2_mng_typ());
			giR.sno3(upJudgdR.sno3());
			giR.sno3_mng_typ(upJudgdR.sno3_mng_typ());
			giR.sno4(upJudgdR.sno4());
			giR.sno4_mng_typ(upJudgdR.sno4_mng_typ());
			giR.fix_no_typ(upJudgdR.fix_no_typ());
			giR.fix_no(upJudgdR.fix_no());
			giR.gi_gd_cd(upJudgdR.gd_cd());
			giR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			giR.quality_typ(upJudgdR.quality_typ());
			giR.stk_insp_typ(upJudgdR.stk_insp_typ());
			giR.stk_id_typ(upJudgdR.stk_id_typ());
			giR.stk_bp_cd(upJudgdR.stk_bp_cd());
			giR.trd_unit_qty(upJudgdR.pack_unit_qty());
			giR.trd_unit_cd(upJudgdR.pack_unit_cd());
			giR.pack_unit_qty(upJudgdR.pack_unit_qty());
			giR.pack_unit_cd(upJudgdR.pack_unit_cd());
			giR.base_unit_qty(upJudgdR.base_unit_qty());
			giR.base_unit_cd(upJudgdR.base_unit_cd());
			if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
				MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create();
				MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrActR_bldr = MCQueryApiBuilder.create(t);
				arrActR_bldr.setSelect(t.sppl_cd);
				arrActR_bldr.setWhere(t.arr_act_no.eq(bind("1")), upJudgdR.fix_no());
				
				if (!isNull(arrActR)) {
					giR.sppl_cd(arrActR.sppl_cd());
				}
				else {
					giR.sppl_cd(null);
				}
			}
			else {
				giR.sppl_cd(null);
			}
			giR.io_typ(MSC_IO_TYP.GI.value());
			giR.trd_rmrks(null);
			giR.trd_d_rmrks(null);
			
			grR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			grR.ac_dt(judgdR.ac_dt());
			grR.act_tm(hdrR.judg_dt());
			grR.act_no(hdrR.insp_act_no());
			grR.act_d_no(judgdR.insp_judg_d_no());
			grR.trd_cd(schdR.trd_cd());
			grR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
			grR.trn_typ(MSC_TRN_TYP.INSP_JUDG.value());
			grR.gr_wg_cd(locR.wg_cd());
			grR.act_usr_cd(hdrR.judg_usr_cd());
			grR.act_dpt_cd(hdrR.judg_dpt_cd());
			grR.itm_cd(judgdR.itm_cd());
			grR.itm_sub1(judgdR.itm_sub1());
			grR.itm_sub2(judgdR.itm_sub2());
			grR.itm_sub3(judgdR.itm_sub3());
			grR.itm_nm(instR.itm_nm());
			grR.stk_mng_typ(itmR.stk_mng_typ());
			grR.sundry_itm_flg(itmR.sundry_itm_flg());
			grR.gr_loc_cd(judgdR.loc_cd());
			grR.gr_str_ln_cd(judgdR.str_ln_cd());
			grR.stk_arrv_bp_cd(judgdR.stk_arrv_bp_cd());
			grR.lot_no(judgdR.lot_no());
			grR.sublot_no(judgdR.sublot_no());
			grR.sno1(judgdR.sno1());
			grR.sno1_mng_typ(judgdR.sno1_mng_typ());
			grR.sno2(judgdR.sno2());
			grR.sno2_mng_typ(judgdR.sno2_mng_typ());
			grR.sno3(judgdR.sno3());
			grR.sno3_mng_typ(judgdR.sno3_mng_typ());
			grR.sno4(judgdR.sno4());
			grR.sno4_mng_typ(judgdR.sno4_mng_typ());
			if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(judgdR.stk_id_typ())) {
				grR.fix_no_typ(judgdR.fix_no_typ());
				grR.fix_no(judgdR.fix_no());
			}
			else {
				grR.fix_no_typ(null);
				grR.fix_no(null);
			}
			grR.gr_gd_cd(judgdR.gd_cd());
			grR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			grR.quality_typ(judgdR.quality_typ());
			grR.stk_insp_typ(judgdR.stk_insp_typ());
			grR.stk_id_typ(judgdR.stk_id_typ());
			grR.stk_bp_cd(judgdR.stk_bp_cd());
			grR.trd_unit_qty(judgdR.pack_unit_qty());
			grR.trd_unit_cd(judgdR.pack_unit_cd());
			grR.pack_unit_qty(judgdR.pack_unit_qty());
			grR.pack_unit_cd(judgdR.pack_unit_cd());
			grR.base_unit_qty(judgdR.base_unit_qty());
			grR.base_unit_cd(judgdR.base_unit_cd());
			if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
				MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create();
				MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrActR_bldr = MCQueryApiBuilder.create(t);
				arrActR_bldr.setSelect(t.sppl_cd);
				arrActR_bldr.setWhere(t.arr_act_no.eq(bind("1")), judgdR.fix_no());
				
				if (!isNull(arrActR)) {
					grR.sppl_cd(arrActR.sppl_cd());
				}
				else {
					grR.sppl_cd(null);
				}
			}
			else {
				grR.sppl_cd(null);
			}
			grR.io_typ(MSC_IO_TYP.GR.value());
			grR.trd_rmrks(null);
			grR.trd_d_rmrks(null);
			
			retL.add(giR);
			retL.add(grR);
			
			return retL;
		}
		
		protected MST_INSP_SCHD_R getInspSchdR(InspAct_Upd02_HdrR hdrR, InspAct_Upd02_DtlR dtlR) {
			if (MSC_INSP_TYP.isACCPT(hdrR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, dtlR.fix_no());
			}
			else if (MSC_INSP_TYP.isPRDCT(hdrR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, dtlR.fix_no());
			}
			else if (MSC_INSP_TYP.isLOT(hdrR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, dtlR.fix_no());
			}
			else {
				return null;
			}
		}
		
		protected void insReInspSchd(MCList<MST_INSP_JUDG_D_R> judgdL) {
			MCList<InspAct_Upd02_HdrR> reHdrL = up0().subList(
					InspAct_Upd02_HdrR.$insp_judg_rslt_typ, MSC_INSP_JUDG_RSLT_TYP.RE.value());
			
			if (reHdrL.isEmpty()) {
				return;
			}
			
			MCIndexKey actNoKey = judgdL.createIndex(MST_INSP_JUDG_D_R.$insp_act_no);
			
			for (InspAct_Upd02_HdrR reHdrR : reHdrL) {
				MCList<InspAct_Upd02_ReInspSchdR> reInspListIns = MCList.create(InspAct_Upd02_ReInspSchdR.class);
				
				reInspListIns.addAll(insReSchd(reHdrR));
				updOldInspSchd(reHdrR.insp_no());
				
				if (!reInspListIns.isEmpty()) {
					MCList<MST_INSP_JUDG_D_R> judgdSubL = judgdL.subList(actNoKey, reHdrR.insp_act_no());
					callIoActIns01ForReInspSchd(reInspListIns, reHdrR, judgdSubL);
				}
			}
		}
		
		protected void callIoActIns01ForReInspSchd(MCList<InspAct_Upd02_ReInspSchdR> reSchdL,
				InspAct_Upd02_HdrR reHdrR, MCList<MST_INSP_JUDG_D_R> judgdL) {
			
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			
			MCList<InspAct_Upd02_DtlR> upJudgdL = up1().subList(InspAct_Upd02_DtlR.$insp_act_no, reHdrR.insp_act_no());
			
			for (MST_INSP_JUDG_D_R judgdR : judgdL) {
				IoAct_Ins01_DtlR giR = IoAct_Ins01_DtlR.create();
				IoAct_Ins01_DtlR grR = IoAct_Ins01_DtlR.create();
				
				MAM_ITM_R itmR = _itmCache.get(judgdR.itm_cd(), judgdR.itm_sub1(), judgdR.itm_sub2(), judgdR.itm_sub3());
				MAM_LOC_R locR = _locCache.get(judgdR.loc_cd());
				MST_INSP_SCHD_R schdR = getInspSchdR(reHdrR, judgdR);
				InspAct_Upd02_ReInspSchdR reSchdR = reSchdL.getFirst(MST_INSP_SCHD_R.$own_insp_schd_no, schdR.insp_schd_no());
				MST_INSP_INST_R instR = _inspInstCache.get(reHdrR.insp_no());
				InspAct_Upd02_DtlR upJudgdR = upJudgdL.getFirst(InspAct_Upd02_DtlR.$insp_judg_d_no, judgdR.insp_judg_d_no());
				
				giR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				giR.ac_dt(upJudgdR.ac_dt());
				giR.act_tm(reHdrR.judg_dt());
				giR.act_no(reSchdR.insp_schd_no());
				giR.trd_cd(schdR.trd_cd());
				giR.trd_ptn_typ(MAC_TRD_PTN_TYP.REINSP.value());
				giR.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
				giR.gi_wg_cd(locR.wg_cd());
				giR.act_usr_cd(reHdrR.judg_usr_cd());
				giR.act_dpt_cd(reHdrR.judg_dpt_cd());
				giR.itm_cd(reHdrR.itm_cd());
				giR.itm_sub1(reHdrR.itm_sub1());
				giR.itm_sub2(reHdrR.itm_sub2());
				giR.itm_sub3(reHdrR.itm_sub3());
				giR.itm_nm(instR.itm_nm());
				giR.stk_mng_typ(itmR.stk_mng_typ());
				giR.sundry_itm_flg(itmR.sundry_itm_flg());
				giR.gi_loc_cd(judgdR.loc_cd());
				giR.gi_str_ln_cd(judgdR.str_ln_cd());
				giR.stk_arrv_bp_cd(judgdR.stk_arrv_bp_cd());
				giR.lot_no(judgdR.lot_no());
				giR.sublot_no(judgdR.sublot_no());
				giR.sno1(judgdR.sno1());
				giR.sno1_mng_typ(judgdR.sno1_mng_typ());
				giR.sno2(judgdR.sno2());
				giR.sno2_mng_typ(judgdR.sno2_mng_typ());
				giR.sno3(judgdR.sno3());
				giR.sno3_mng_typ(judgdR.sno3_mng_typ());
				giR.sno4(judgdR.sno4());
				giR.sno4_mng_typ(judgdR.sno4_mng_typ());
				giR.fix_no_typ(judgdR.fix_no_typ());
				giR.fix_no(judgdR.fix_no());
				giR.gi_gd_cd(upJudgdR.gd_cd());
				giR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				giR.quality_typ(upJudgdR.quality_typ());
				giR.stk_insp_typ(MSC_STK_INSP_TYP.WAIT_JUDG.value());
				giR.stk_id_typ(judgdR.stk_id_typ());
				giR.stk_bp_cd(judgdR.stk_bp_cd());
				giR.trd_unit_qty(judgdR.pack_unit_qty());
				giR.trd_unit_cd(judgdR.pack_unit_cd());
				giR.pack_unit_qty(judgdR.pack_unit_qty());
				giR.pack_unit_cd(judgdR.pack_unit_cd());
				giR.base_unit_qty(judgdR.base_unit_qty());
				giR.base_unit_cd(judgdR.base_unit_cd());
				giR.sppl_cd(schdR.sppl_cd());
				giR.io_typ(MSC_IO_TYP.GI.value());
				giR.trd_rmrks(null);
				giR.trd_d_rmrks(null);
				
				grR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				grR.ac_dt(upJudgdR.ac_dt());
				grR.act_tm(reHdrR.judg_dt());
				grR.act_no(reSchdR.insp_schd_no());
				grR.trd_cd(schdR.trd_cd());
				grR.trd_ptn_typ(MAC_TRD_PTN_TYP.REINSP.value());
				grR.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
				grR.gr_wg_cd(locR.wg_cd());
				grR.act_usr_cd(reHdrR.judg_usr_cd());
				grR.act_dpt_cd(reHdrR.judg_dpt_cd());
				grR.itm_cd(reHdrR.itm_cd());
				grR.itm_sub1(reHdrR.itm_sub1());
				grR.itm_sub2(reHdrR.itm_sub2());
				grR.itm_sub3(reHdrR.itm_sub3());
				grR.itm_nm(instR.itm_nm());
				grR.stk_mng_typ(itmR.stk_mng_typ());
				grR.sundry_itm_flg(itmR.sundry_itm_flg());
				grR.gr_loc_cd(judgdR.loc_cd());
				grR.gr_str_ln_cd(judgdR.str_ln_cd());
				grR.stk_arrv_bp_cd(judgdR.stk_arrv_bp_cd());
				grR.lot_no(judgdR.lot_no());
				grR.sublot_no(judgdR.sublot_no());
				grR.sno1(judgdR.sno1());
				grR.sno1_mng_typ(judgdR.sno1_mng_typ());
				grR.sno2(judgdR.sno2());
				grR.sno2_mng_typ(judgdR.sno2_mng_typ());
				grR.sno3(judgdR.sno3());
				grR.sno3_mng_typ(judgdR.sno3_mng_typ());
				grR.sno4(judgdR.sno4());
				grR.sno4_mng_typ(judgdR.sno4_mng_typ());
				grR.fix_no_typ(judgdR.fix_no_typ());
				if (MSC_INSP_TYP.isLOT(reHdrR.insp_typ())) {
					grR.fix_no(reSchdR.insp_schd_no());
				}
				else {
					grR.fix_no(judgdR.fix_no());
				}
				grR.gr_gd_cd(judgdR.gd_cd());
				grR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				grR.quality_typ(judgdR.quality_typ());
				grR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				grR.stk_id_typ(judgdR.stk_id_typ());
				grR.stk_bp_cd(judgdR.stk_bp_cd());
				grR.trd_unit_qty(judgdR.pack_unit_qty());
				grR.trd_unit_cd(judgdR.pack_unit_cd());
				grR.pack_unit_qty(judgdR.pack_unit_qty());
				grR.pack_unit_cd(judgdR.pack_unit_cd());
				grR.base_unit_qty(judgdR.base_unit_qty());
				grR.base_unit_cd(judgdR.base_unit_cd());
				grR.sppl_cd(schdR.sppl_cd());
				grR.io_typ(MSC_IO_TYP.GR.value());
				grR.trd_rmrks(null);
				grR.trd_d_rmrks(null);
				
				o.up0().add(giR);
				o.up0().add(grR);
			}
			
			o.exec();
		}
		
		protected MST_INSP_SCHD_R getInspSchdR(InspAct_Upd02_HdrR reHdrR, MST_INSP_JUDG_D_R ijdR) {
			if (MSC_INSP_TYP.isACCPT(reHdrR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, ijdR.fix_no());
			}
			else if (MSC_INSP_TYP.isPRDCT(reHdrR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, ijdR.fix_no());
			}
			else if (MSC_INSP_TYP.isLOT(reHdrR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, ijdR.fix_no());
			}
			else {
				return null;
			}
		}
		
		protected void updOldInspSchd(String inspNo) {
			// 再検査の場合、元の検査予定の最新フラグをオフにして受払予定を削除する。
			MCList<MST_INSP_SCHD_R> schdL = getInspSchdL(inspNo);
			MST_INSP_SCHD_R schdL_t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
			updSchdLatestFlg(schdL, schdL_bldr, schdL_t);
			delOldIoSchd(schdL);
		}
		
		protected void updSchdLatestFlg(MCList<MST_INSP_SCHD_R> schdL,
				MCQueryApiBuilder schdL_bldr, MST_INSP_SCHD_R t) {
			schdL.setBoolean(MST_INSP_SCHD_R.$latest_flg, false);
			schdL_bldr.setSet(t.latest_flg);
			dbUpdateKey("MSBFL5050_MST_INSP_SCHD_U02", schdL, schdL_bldr);
		}
		
		protected void delOldIoSchd(MCList<MST_INSP_SCHD_R> schdL) {
			MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
			addAll(o.up0(), schdL, createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR()); //検査完了入庫
			addAll(o.up0(), schdL, createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI()); //検査完了出庫
			o.exec();
		}
		
		protected Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR<MSW_IO_SCHD_DEL_R,MST_INSP_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR<MSW_IO_SCHD_DEL_R, MST_INSP_SCHD_R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR<D extends MSW_IO_SCHD_DEL_R, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_INSP_SCHD_R.$insp_schd_no); //受払予定ＮＯは検査予定ＮＯ
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value()); //受払予定区分は「検査完了入庫」固定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.WAIT_JUDG.value()); //受払予定状況区分は「判定待」固定
			}
		}

		protected Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI<MSW_IO_SCHD_DEL_R,MST_INSP_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI<MSW_IO_SCHD_DEL_R, MST_INSP_SCHD_R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI<D extends MSW_IO_SCHD_DEL_R, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_INSP_SCHD_R.$insp_schd_no); //受払予定ＮＯは検査予定ＮＯ
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GI.value()); //受払予定区分は「検査完了出庫」固定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.WAIT_JUDG.value()); //受払予定状況区分は「判定待」固定
			}
		}

		protected MCList<InspAct_Upd02_ReInspSchdR> insReSchd(InspAct_Upd02_HdrR reHdrR) {
			MCList<MST_INSP_SCHD_R> reSchdL = getInspSchdL(reHdrR.insp_no());
			MCQueryApiBuilder reSchdL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
			MCList<InspAct_Upd02_ReInspSchdR> list = MCList.create(InspAct_Upd02_ReInspSchdR.class);
			
			for (MST_INSP_SCHD_R reSchdR : reSchdL) {
				MST_INSP_INST_R iiR = _inspInstCache.get(reHdrR.insp_no());
				
				reSchdR.own_insp_schd_no(reSchdR.insp_schd_no());
				reSchdR.own_insp_no(reHdrR.insp_no());
				reSchdR.insp_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INSPS));
				//検査予定の予定日時は元の指図の予定日時とする。
				//※遅れていることが認識できるようにするため。
				reSchdR.st_tm(iiR.st_tm());
				reSchdR.end_tm(iiR.end_tm());
				if (MAC_INSP_MTD_TYP.isTTL(reSchdR.insp_mtd_typ())) {
					//検査予定の検査方法区分が全数の場合は、
					//検査指図の検査方法区分で再検査予定を作成する。
					//※期限再検査ではないロット検査の場合、検査指図時に
					//全数⇒抜取に変更可能なため、検査予定の検査方法区分が
					//全数検査というのはあり得るデータ。
					//再検査予定は全数検査対象とすることができないので、
					//その場合は、検査指図の検査方法区分で検査予定を作成する。
					reSchdR.insp_mtd_typ(iiR.insp_mtd_typ());
				}
				reSchdR.latest_flg(true);
				reSchdR.insp_freq(reSchdR.insp_freq().add(1));
				reSchdR.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
				reSchdR.ac_dt(reHdrR.judg_dt());
				reSchdR.insp_no(null);
				reSchdR.insp_cnt_rmrks(null);
				
				InspAct_Upd02_ReInspSchdR r = InspAct_Upd02_ReInspSchdR.create();
				MCRow.copyvalue(r.re_insp_schd(), reSchdR);
				list.add(r);
			}
			execInsReSchd(reSchdL, reSchdL_bldr);
			return list;
		}
		
		protected MCList<MST_INSP_SCHD_R> getInspSchdL(String inspNo) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setWhere(t.insp_no.eq(bind("1")), inspNo);
			dbSelect("MSBFL5050_MST_INSP_SCHD_S09", schdL, schdL_bldr);
			return schdL;
		}
		
		protected void execInsReSchd(MCList<MST_INSP_SCHD_R> reSchdL ,MCQueryApiBuilder reSchdL_bldr) {
			dbInsert("MSBFL5050_MST_INSP_SCHD_I01", reSchdL, reSchdL_bldr);
		}
		
		protected void insPlntAprv() {
			MSBFL_PlntAprvService.PlntAprv_Upd01 o = MSBFL_PlntAprvService.crtPlntAprv_Upd01();
			
			MCList<MST_INSP_SCHD_R> isL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t);
			isL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S10", isL, isL_bldr, up0());
			
			for (InspAct_Upd02_HdrR r : up0()) {
				MST_INSP_INST_R iiR = _inspInstCache.get(r.insp_no());
				
				if (!isPlntAprv(r, iiR)) {
					continue;
				}
				
				MCList<MST_INSP_SCHD_R> subIsL = isL.subList(MST_INSP_SCHD_R.$insp_no, r.insp_no());
				
				for (MST_INSP_SCHD_R isR : subIsL) {
					PlntAprv_Chk01_RsltR oR = PlntAprv_Chk01_RsltR.create();
					
					oR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					oR.plnt_aprv_no(null);
					oR.plnt_aprv_d_no(null);
					oR.insp_typ(r.insp_typ());
					oR.insp_no(r.insp_no());
					oR.src_no1(isR.src_no1());
					oR.src_no2(isR.src_no2());
					oR.src_no3(isR.src_no3());
					oR.src_no4(isR.src_no4());
					oR.itm_cd(r.itm_cd());
					oR.itm_sub1(r.itm_sub1());
					oR.itm_sub2(r.itm_sub2());
					oR.itm_sub3(r.itm_sub3());
					oR.lot_no(r.lot_no());
					oR.sublot_no(r.sublot_no());
					oR.loc_cd(isR.loc_cd());
					oR.setAttributes(r);
					if (MSC_INSP_TYP.isLOT(isR.insp_typ())) {
						oR.insp_schd_no(isR.org_insp_schd_no());
					}
					
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected boolean isPlntAprv(InspAct_Upd02_HdrR r, MST_INSP_INST_R iiR) {
			if (!iiR.plnt_aprv_flg()) {
				return false;
			}
			if (!MSC_INSP_JUDG_RSLT_TYP.is_stk_good(r.insp_judg_rslt_typ())) {
				return false;
			}
			return true;
		}
		
		protected void callIoActUpd01() {
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
			o.exec();
		}
		/**
		 * 仕入実績を登録する
		 */
		protected void callThisUpd05() {
			MSBFL_InspActService.InspAct_Upd05 o = MSBFL_InspActService.crtInspAct_Upd05();

			addAll(o.up0(), up0(), createMap_InspAct_Upd05_HdrR_InspAct_Upd02_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Upd05_DtlR_InspAct_Upd02_DtlR());
			setHdrPegNo(o.up1());

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected void setHdrPegNo(MCList<InspAct_Upd05_DtlR> oUp1L) {
			MCIndexKey hdrIdx = up0().createIndex(InspAct_Upd01_HdrR.$insp_no);
			MCIndexKey dtlIdx = up1().createIndex(InspAct_Upd01_DtlR.$peg_no);
			
			for (InspAct_Upd05_DtlR r : oUp1L) {
				InspAct_Upd02_DtlR dtlR = up1().getFirst(dtlIdx, r.peg_no());
				InspAct_Upd02_HdrR hdrR = up0().getFirst(hdrIdx, dtlR.insp_no());
				r.hdr_peg_no(hdrR.peg_no());
			}
		}
		
		protected Map_InspAct_Upd05_HdrR_InspAct_Upd02_HdrR<InspAct_Upd05_HdrR,InspAct_Upd02_HdrR> createMap_InspAct_Upd05_HdrR_InspAct_Upd02_HdrR() {
			return new Map_InspAct_Upd05_HdrR_InspAct_Upd02_HdrR<InspAct_Upd05_HdrR, InspAct_Upd02_HdrR>();
		}

		public class Map_InspAct_Upd05_HdrR_InspAct_Upd02_HdrR<D extends InspAct_Upd05_HdrR, S extends InspAct_Upd02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd05_HdrR.$peg_no, InspAct_Upd02_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd05_HdrR.$insp_act_no, InspAct_Upd02_HdrR.$insp_act_no);
			}
		}

		protected Map_InspAct_Upd05_DtlR_InspAct_Upd02_DtlR<InspAct_Upd05_DtlR,InspAct_Upd02_DtlR> createMap_InspAct_Upd05_DtlR_InspAct_Upd02_DtlR() {
			return new Map_InspAct_Upd05_DtlR_InspAct_Upd02_DtlR<InspAct_Upd05_DtlR, InspAct_Upd02_DtlR>();
		}

		public class Map_InspAct_Upd05_DtlR_InspAct_Upd02_DtlR<D extends InspAct_Upd05_DtlR, S extends InspAct_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd05_DtlR.$peg_no, InspAct_Upd02_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd05_DtlR.$insp_judg_d_no, InspAct_Upd02_DtlR.$insp_judg_d_no);
			}
		}
	}
	/**
	 * InspAct_Upd03オペレーション.<p>
	 *
	 * 検査着手明細・検査実績明細・検査抜取実績を登録する。<br>
	 */
	public class InspAct_Upd03 extends MSBFL_InspActService_MC_A.InspAct_Upd03 {
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCList<MST_INSP_INST_R> _instL = MCList.create(MST_INSP_INST_R.class);
		protected MST_INSP_INST_R _instL_t = MST_INSP_INST_R.create("T");
		protected MCQueryApiBuilder _instL_bldr = MCQueryApiBuilder.create(_instL_t);
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MCList<MST_INSP_SMPL_ACT_R> _smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
		protected MST_INSP_SMPL_ACT_R _smplL_t = MST_INSP_SMPL_ACT_R.create("T");
		protected MCQueryApiBuilder _smplL_bldr = MCQueryApiBuilder.create(_smplL_t);
		
		protected MCIndexKey _schdIdx;
		protected MCIndexKey _instIdx;
		protected MCIndexKey _actIdx;
		protected MCIndexKey _smplIdx;
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<InspAct_Upd03_HdrR> hdrL = getTgt();
			createCache(hdrL);
			insUpdDelDtl(hdrL);
			updSmplAct(hdrL);
			setDownHdr();
		}

		protected void setDownHdr() {
			for (InspAct_Upd03_HdrR r : up0()) {
				InspAct_Upd03_HdrR downR = InspAct_Upd03_HdrR.create();
				
				downR.peg_no(r.peg_no());
				downR.insp_act_no(r.insp_act_no());
				downR.insp_no(r.insp_no());
				
				down0().add(downR);
			}
		}
		
		protected void updSmplAct(MCList<InspAct_Upd03_HdrR> hdrL) {
			MCList<InspAct_Upd03_HdrR> tgtHdrL = MCList.create(InspAct_Upd03_HdrR.class);
			
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				if (hdrR.insp_smpl_act_upd_flg()) {
					tgtHdrL.add(hdrR);
				}
			}
			
			if (!tgtHdrL.isEmpty()) {
				updSmplActMain(tgtHdrL);
				insSmplIoAct(tgtHdrL);
			}
		}

		protected void createCache(MCList<InspAct_Upd03_HdrR> hdrL) {
			cacheInspInfo(hdrL);
			createCacheItm();
			createCacheLoc();
		}
		
		protected void createCacheItm() {
			MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
			for (MST_INSP_INST_R r : _instL) {
				MAM_ITM_R bindR = MAM_ITM_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindL.add(bindR);
			}

			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmDbcL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			itmDbcL_bldr.setSelect(t.stk_mng_typ);
			itmDbcL_bldr.addSelect(t.sundry_itm_flg);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmDbcL_bldr, bindL,
					MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		
		protected void createCacheLoc() {
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			for (InspAct_Upd03_Stt_DtlR r : up1()) {
				MAM_LOC_R bindR = MAM_LOC_R.create();
				bindR.loc_cd(r.loc_cd());
				bindL.add(bindR);
			}
			for (InspAct_Upd03_Act_DtlR r : up2()) {
				MAM_LOC_R bindR = MAM_LOC_R.create();
				bindR.loc_cd(r.loc_cd());
				bindL.add(bindR);
			}
			for (InspAct_Upd03_Judg_DtlR r : up3()) {
				MAM_LOC_R bindR = MAM_LOC_R.create();
				bindR.loc_cd(r.loc_cd());
				bindL.add(bindR);
			}
			for (MST_INSP_SMPL_ACT_R r : _smplL) {
				MAM_LOC_R bindR = MAM_LOC_R.create();
				bindR.loc_cd(r.loc_cd());
				bindL.add(bindR);
			}

			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locDbcL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			locDbcL_bldr.setSelect(t.wg_cd);
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locDbcL_bldr, bindL, MAM_LOC_R.$loc_cd);
		}

		protected void cacheInspInfo(MCList<InspAct_Upd03_HdrR> hdrL) {
			_instL_bldr.setWhere(_instL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_INST_S09", _instL, _instL_bldr, hdrL);
			_instIdx = _instL.createIndex(MST_INSP_INST_R.$insp_no);

			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S11", _schdL, _schdL_bldr, hdrL);
			_schdIdx = _schdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);

			_smplL_bldr.setWhere(_smplL_t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S07", _smplL, _smplL_bldr, hdrL);
			_smplIdx = _smplL.createIndex(MST_INSP_SMPL_ACT_R.$insp_act_no);
		}
		
		/**
		 * 検査抜取実績の在庫関連項目を更新する。
		 * @param hdrL
		 */
		protected void updSmplActMain(MCList<InspAct_Upd03_HdrR> hdrL) {
			MCList<MST_INSP_SMPL_ACT_R> updL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			
			hdrL.sort(SortType.DESC, InspAct_Upd03_HdrR.$accpt_dfct_flg);
			MCIndexKey srcNo4Idxkey = _schdL.createIndex(MST_INSP_SCHD_R.$src_no4);
			MCIndexKey schdIdxKey = up4().createIndex(InspAct_Upd03_Yield_DtlR.$insp_schd_no);
			MCIndexKey yieldIdxKey = up4().createIndex(InspAct_Upd03_Yield_DtlR.$yield_act_no);
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				MCList<MST_INSP_SMPL_ACT_R> smplL = _smplL.subList(_smplIdx, hdrR.insp_act_no());
				
				if (smplL.isEmpty()) {
					continue;
				}
				
				for (MST_INSP_SMPL_ACT_R smplR : smplL) {
					MST_INSP_SCHD_R schdR = null;
					InspAct_Upd03_Yield_DtlR up4R = null;
					if (isNull(smplR.insp_schd_no())) {
						schdR = _schdL.getFirst(srcNo4Idxkey, smplR.fix_no());
						up4R = up4().getFirst(yieldIdxKey, smplR.fix_no());
					}
					else {
						schdR = _schdL.getFirst(_schdIdx, smplR.insp_schd_no());
						up4R = up4().getFirst(schdIdxKey, smplR.insp_schd_no());
					}

					// 手配ＮＯ1～4をリストsnoLの0～3で管理する
					List<String> snoL = new ArrayList<String>();
					setSno(schdR, snoL);

					// ロット管理情報の主キー項目の更新は不要。
					smplR.stk_arrv_bp_cd(schdR.stk_arrv_bp_cd());
					smplR.stk_id_typ(schdR.stk_id_typ());
					smplR.stk_bp_cd(schdR.stk_bp_cd());
					smplR.sno1(snoL.get(0));
					smplR.sno2(snoL.get(1));
					smplR.sno3(snoL.get(2));
					smplR.sno4(snoL.get(3));
					smplR.sno1_mng_typ(schdR.sno1_mng_typ());
					smplR.sno2_mng_typ(schdR.sno2_mng_typ());
					smplR.sno3_mng_typ(schdR.sno3_mng_typ());
					smplR.sno4_mng_typ(schdR.sno4_mng_typ());
					if (!schdR.in_prmt_insp_flg()) {
						smplR.fix_no(schdR.src_no4());
					}
					if (isNull(up4R)) {
						smplR.addDateColumn("can_ac_dt", smplR.ac_dt());
					}
					else {
						smplR.addDateColumn("can_ac_dt", getCanAcDt(smplR.ac_dt(), up4R.can_ac_dt()));
						if (smplR.ac_dt().lt(up4R.ac_dt())) {
							smplR.ac_dt(up4R.ac_dt());
						}
					}
					
					if (!isNull(hdrR.arr_act_no())) {
						if (hdrR.accpt_dfct_flg()) {
							smplR.stk_id_typ(MSC_STK_ID_TYP.ACCPT_DFCT.value());
						}
						else {
							smplR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							smplR.stk_bp_cd(MAC_STR.NULL_VAL.value());
						}
					}
					
					if (!smplR.so_cmpl_flg()) {
						smplR.gd_cd(schdR.gd_cd());
						smplR.quality_typ(schdR.quality_typ());
					}
					updL.add(smplR);
				}
			}
			
			if (!updL.isEmpty()) {
				MST_INSP_SMPL_ACT_R updL_t = MST_INSP_SMPL_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				editInspSmplActSetStmt(updL, updL_bldr, updL_t);
				dbUpdateKey("MSBFL5050_MST_INSP_SMPL_ACT_U03", updL, updL_bldr);
			}
		}
		
		/**
		 * 手配ＮＯ管理区分に応じて手配ＮＯを設定する
		 * 手配ＮＯ管理区分が「管理する（任意：在庫対象外）」の場合、手配ＮＯをnull文字にする
		 * 
		 * @param r
		 * @param snoL
		 * @return
		 */
		protected void setSno(MCRow r, List<String> snoL) {
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno1_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno1"));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno2_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno2"));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno3_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno3"));
			}
			if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getStringNE("sno4_mng_typ"))) {
				snoL.add(MAC_STR.NULL_VAL.value());
			}
			else {
				snoL.add(r.getStringNE("sno4"));
			}
		}
		
		protected MCDate getCanAcDt(MCDate oldAcDt, MCDate yieldCanAcDt) {
			if (oldAcDt.lt(yieldCanAcDt) && getStkClYm().gte(getAcYm(oldAcDt))) {
				return yieldCanAcDt;
			}
			return oldAcDt;
		}

		protected void editInspSmplActSetStmt(MCList<MST_INSP_SMPL_ACT_R> updL,
				MCQueryApiBuilder updL_bldr, MST_INSP_SMPL_ACT_R t) {
			updL_bldr.setSet(t.stk_arrv_bp_cd);
			updL_bldr.addSet(t.stk_id_typ);
			updL_bldr.addSet(t.stk_bp_cd);
			updL_bldr.addSet(t.sno1);
			updL_bldr.addSet(t.sno2);
			updL_bldr.addSet(t.sno3);
			updL_bldr.addSet(t.sno4);
			updL_bldr.addSet(t.sno1_mng_typ);
			updL_bldr.addSet(t.sno2_mng_typ);
			updL_bldr.addSet(t.sno3_mng_typ);
			updL_bldr.addSet(t.sno4_mng_typ);
			updL_bldr.addSet(t.fix_no);
			updL_bldr.addSet(t.quality_typ);
			updL_bldr.addSet(t.gd_cd);
			updL_bldr.addSet(t.ac_dt);
		}
		
		protected void insSmplIoAct(MCList<InspAct_Upd03_HdrR> hdrL) {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			MCList<MST_INSP_SMPL_ACT_R> updL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			
			MCList<MST_PURC_ACT_IO_R> paiL = getPurcActIoL(hdrL);
			MCIndexKey paiIdx = paiL.createIndex(MST_PURC_ACT_IO_R.$arr_act_no);
			
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
				MCList<MST_INSP_SMPL_ACT_R> tmpSmplL = _smplL.subList(_smplIdx, hdrR.insp_act_no());
				
				for (MST_INSP_SMPL_ACT_R smplR : tmpSmplL) {
					if (!isNull(smplR.so_qty())) {
						smplL.add(smplR);
					}
				}
				
				if (smplL.isEmpty()) {
					continue;
				}
				
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
				MST_PURC_ACT_IO_R paiR = paiL.getFirst(paiIdx, hdrR.arr_act_no());
				
				for (MST_INSP_SMPL_ACT_R smplR : smplL) {
					IoAct_Ins01_DtlR ioR = getIoActR(smplR, instR, paiR, hdrR.accpt_dfct_flg());
					
					if (!isNull(ioR.data_crud_typ())) {
						o.up0().add(ioR);
						if (MAC_DATA_CRUD_TYP.isDEL(ioR.data_crud_typ())) {
							MST_INSP_SCHD_R schdR = getInspSchdR(instR, smplR);
							
							smplR.so_cmpl_flg(false);
							smplR.stk_id_typ(schdR.stk_id_typ());
							smplR.stk_bp_cd(schdR.stk_bp_cd());
						}
						else {
							smplR.so_cmpl_flg(true);
						}
						updL.add(smplR);
					}
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
			if (!updL.isEmpty()) {
				MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(t.so_cmpl_flg);
				updL_bldr.addSet(t.stk_id_typ);
				updL_bldr.addSet(t.stk_bp_cd);
				dbUpdateKey("MSBFL5050_MST_INSP_SMPL_ACT_U04", updL, updL_bldr);
			}
		}
		
		protected MCList<MST_PURC_ACT_IO_R> getPurcActIoL(MCList<InspAct_Upd03_HdrR> hdrL) {
			MCList<MST_PURC_ACT_IO_R> paiL = MCList.create(MST_PURC_ACT_IO_R.class);
			
			MCList<InspAct_Upd03_HdrR> bindL = MCList.create(InspAct_Upd03_HdrR.class);
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				if (!isNull(hdrR.arr_act_no())) {
					bindL.add(hdrR);
				}
			}
			
			if (bindL.isEmpty()) {
				return paiL;
			}

			MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder paiL_bldr = MCQueryApiBuilder.create(t);
			paiL_bldr.setSelect(t.arr_act_no);
			paiL_bldr.addSum(t.base_unit_qty, "qty");
			paiL_bldr.setWhere(t.arr_act_no.eq(bind("arr_act_no")));
			paiL_bldr.addGroupBy(t.arr_act_no);
			paiL.addNumberColumn("qty");
			dbSelect("MSBFL5050_MST_PURC_ACT_IO_S01", paiL, paiL_bldr, hdrL);
			
			return paiL;
		}
		
		protected IoAct_Ins01_DtlR getIoActR(MST_INSP_SMPL_ACT_R smplR, MST_INSP_INST_R instR, MST_PURC_ACT_IO_R paiR, boolean accptDfctFlg) {
			IoAct_Ins01_DtlR rtnR = IoAct_Ins01_DtlR.create();
			MST_INSP_SCHD_R schdR = getInspSchdR(instR, smplR);
			MAM_ITM_R itmR = _itmCache.get(smplR.itm_cd(), smplR.itm_sub1(), smplR.itm_sub2(), smplR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(smplR.loc_cd());
			MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, instR.insp_no());
			
			rtnR.data_crud_typ(getDataCrudTyp(smplR, paiR, schdR, accptDfctFlg));
			rtnR.can_ac_dt(smplR.getDateNE("can_ac_dt"));
			rtnR.act_d_no(smplR.insp_smpl_act_no());
			rtnR.trn_typ(MSC_TRN_TYP.INSP_SMPL.value());
			
			if (isNull(rtnR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(rtnR.data_crud_typ())) {
				return rtnR;
			}
			
			rtnR.ac_dt(smplR.ac_dt());
			rtnR.act_tm(smplR.act_tm());
			rtnR.act_no(smplR.insp_act_no());
			rtnR.trd_cd(schdR.trd_cd());
			rtnR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP_SMPL.value());
			rtnR.gi_wg_cd(locR.wg_cd());
			if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				MST_ARR_ACT_R arrActR = MST_ARR_ACT_R.create();
				MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrActR_bldr = MCQueryApiBuilder.create(t);
				MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
				MST_PO_D_R t3 = MST_PO_D_R.create("T3");
				MST_PO_R t4 = MST_PO_R.create("T4");
				MST_ARR_PR_R arrPrR = MST_ARR_PR_R.create("ARRPR");
				arrActR_bldr.setSelect(t3.ap_dpt_cd);
				arrActR_bldr.addSelect(t4.purc_dpt_cd);
				arrActR_bldr.addLeftOuterJoin(t2, t.arr_schd_no.eq(t2.arr_schd_no));
				arrActR_bldr.addLeftOuterJoin(arrPrR, t2.arr_pr_no.eq(arrPrR.arr_pr_no));
				arrActR_bldr.addLeftOuterJoin(t3, arrPrR.po_d_no.eq(t3.po_d_no));
				arrActR_bldr.addLeftOuterJoin(t4, t3.po_no.eq(t4.po_no));
				arrActR_bldr.setWhere(t.arr_act_no.eq(bind("1")), schdR.src_no4());
				dbSelect("MSBFL5050_MST_ARR_ACT_S02", arrActR, arrActR_bldr);
				
				if (!isNull(arrActR)) {
					rtnR.purc_dpt_cd(arrActR.getStringNE("PURC_DPT_CD"));
					rtnR.ap_dpt_cd(arrActR.getStringNE("AP_DPT_CD"));
				}
				else {
					rtnR.purc_dpt_cd(null);
					rtnR.ap_dpt_cd(null);
				}
			}
			else {
				rtnR.purc_dpt_cd(null);
				rtnR.ap_dpt_cd(null);
			}
			
			if (!isNull(actR)) {
				rtnR.act_usr_cd(actR.act_usr_cd());
				rtnR.act_dpt_cd(actR.act_dpt_cd());
			}
			rtnR.itm_cd(smplR.itm_cd());
			rtnR.itm_sub1(smplR.itm_sub1());
			rtnR.itm_sub2(smplR.itm_sub2());
			rtnR.itm_sub3(smplR.itm_sub3());
			rtnR.itm_nm(instR.itm_nm());
			rtnR.stk_mng_typ(itmR.stk_mng_typ());
			rtnR.sundry_itm_flg(itmR.sundry_itm_flg());
			rtnR.gi_loc_cd(smplR.loc_cd());
			rtnR.gi_str_ln_cd(smplR.str_ln_cd());
			rtnR.stk_arrv_bp_cd(smplR.stk_arrv_bp_cd());
			rtnR.stk_arrv_bp_cd(smplR.stk_arrv_bp_cd());
			rtnR.lot_no(smplR.lot_no());
			rtnR.sublot_no(smplR.sublot_no());
			rtnR.sno1(smplR.sno1());
			rtnR.sno1_mng_typ(smplR.sno1_mng_typ());
			rtnR.sno2(smplR.sno2());
			rtnR.sno2_mng_typ(smplR.sno2_mng_typ());
			rtnR.sno3(smplR.sno3());
			rtnR.sno3_mng_typ(smplR.sno3_mng_typ());
			rtnR.sno4(smplR.sno4());
			rtnR.sno4_mng_typ(smplR.sno4_mng_typ());
			rtnR.stk_insp_typ(smplR.stk_insp_typ());
			if (schdR.in_prmt_insp_flg()) {
				smplR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			rtnR.fix_no_typ(smplR.fix_no_typ());
			rtnR.fix_no(smplR.fix_no());
			rtnR.gi_gd_cd(smplR.gd_cd());
			rtnR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			rtnR.quality_typ(smplR.quality_typ());
			rtnR.stk_id_typ(smplR.stk_id_typ());
			rtnR.stk_bp_cd(smplR.stk_bp_cd());
			rtnR.trd_unit_qty(smplR.so_qty());
			rtnR.trd_unit_cd(smplR.base_unit_cd());
			rtnR.pack_unit_qty(smplR.so_qty());
			rtnR.pack_unit_cd(smplR.base_unit_cd());
			rtnR.base_unit_qty(smplR.so_qty());
			rtnR.base_unit_cd(smplR.base_unit_cd());
			if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				MST_OPER_ACT_R oaR = MST_OPER_ACT_R.create();
				MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
				MCQueryApiBuilder oaR_bldr = MCQueryApiBuilder.create(t);
				oaR_bldr.setSelect(t.mfg_act_no);
				oaR_bldr.addSelect(t.itm_mfg_inst_no);
				oaR_bldr.setWhere(t.arr_act_no.eq(bind("1")), schdR.src_no4());
				dbSelect("MSBFL5050_MST_OPER_ACT_S02", oaR, oaR_bldr);
				
				if (!isNull(oaR.oper_act_no())) {
					rtnR.itm_mfg_inst_no(oaR.itm_mfg_inst_no());
					rtnR.mfg_act_no(oaR.mfg_act_no());
				}
				else {
					rtnR.itm_mfg_inst_no(null);
					rtnR.mfg_act_no(null);
				}
				
			}
			else if (MSC_INSP_TYP.isPRDCT(instR.insp_typ())) {
				rtnR.itm_mfg_inst_no(schdR.src_no2());
				
				MST_YIELD_ACT_R yaR = MST_YIELD_ACT_R.create();
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yaR_bldr = MCQueryApiBuilder.create(t);
				yaR_bldr.setSelect(t.mfg_act_no);
				yaR_bldr.setWhere(t.yield_act_no.eq(bind("1")), schdR.src_no4());
				dbSelect("MSBFL5050_MST_YIELD_ACT_S02", yaR, yaR_bldr);
				
				rtnR.mfg_act_no(yaR.mfg_act_no());
			}
			else {
				rtnR.itm_mfg_inst_no(null);
				rtnR.mfg_act_no(null);
			}
			rtnR.pack_xfr_unit_cd(smplR.pack_xfr_pack_unit_cd());
			rtnR.pack_xfr_qty(smplR.pack_xfr_pack_unit_qty());
			rtnR.mfg_inst_unit_typ(itmR.mfg_inst_unit_typ());
			rtnR.trd_rmrks(smplR.trd_rmrks());
			rtnR.trd_d_rmrks();
			rtnR.no_gi_alloc_flg(true);
			rtnR.bd_dpt_cd(smplR.bd_dpt_cd());
			
			return rtnR;
		}
		
		protected String getDataCrudTyp(MST_INSP_SMPL_ACT_R smplR, MST_PURC_ACT_IO_R paiR, MST_INSP_SCHD_R schdR, boolean accptDfctFlg) {
			if (accptDfctFlg) {
				if (smplR.so_cmpl_flg()) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					return null;
				}
			}
			
			if (!MSC_STK_ID_TYP.isCOSTK(smplR.stk_id_typ())) {
				if (smplR.so_cmpl_flg()) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					return null;
				}
			}
			
			if ((isNull(paiR))) {
				if (schdR.base_unit_qty().gte(smplR.so_qty())) {
					if (smplR.so_cmpl_flg()) {
						return MAC_DATA_CRUD_TYP.UPD.value();
					}
					else {
						return MAC_DATA_CRUD_TYP.CRT.value();
					}
				}
				else {
					if (smplR.so_cmpl_flg()) {
						return MAC_DATA_CRUD_TYP.DEL.value();
					}
					else {
						return null;
					}
				}
				
			}
			else if (paiR.getNumberNE("qty").gte(smplR.so_qty())) {
				if (smplR.so_cmpl_flg()) {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
				else {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
			}
			else {
				if (smplR.so_cmpl_flg()) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					return null;
				}
			}
		}
		
		protected MST_INSP_SCHD_R getInspSchdR(MST_INSP_INST_R instR, MST_INSP_SMPL_ACT_R r) {
			if (!isNull(r.insp_schd_no())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, r.insp_schd_no());
			}
			else if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, r.fix_no());
			}
			else if (MSC_INSP_TYP.isPRDCT(instR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$src_no4, r.fix_no());
			}
			else if (MSC_INSP_TYP.isLOT(instR.insp_typ())) {
				return _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, r.fix_no());
			}
			else {
				return null;
			}
		}
		
		protected MCList<MST_INSP_JUDG_D_R> getIjdL(InspAct_Upd03_HdrR hdrR) {
			MCList<MST_INSP_JUDG_D_R> ijdL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder ijdL_bldr = MCQueryApiBuilder.create(t);
			
			ijdL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_JUDG_D_S03", ijdL, ijdL_bldr, hdrR);
			
			return ijdL;
		}
		
		protected void insUpdDelDtl(MCList<InspAct_Upd03_HdrR> hdrL) {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			
			o.up0().addAll(insUpdDelSttDtl(hdrL));
			o.up0().addAll(insUpdDelActDtl(hdrL));
			o.up0().addAll(insUpdDelJudgDtl(hdrL));
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected MCList<IoAct_Ins01_DtlR> insUpdDelSttDtl(MCList<InspAct_Upd03_HdrR> hdrL) {
			if (up1().isEmpty()) {
				return null;
			}
			
			MCList<MST_INSP_STT_D_R> insL = MCList.create(MST_INSP_STT_D_R.class);
			MCList<MST_INSP_STT_D_R> updL = MCList.create(MST_INSP_STT_D_R.class);
			MCList<MST_INSP_STT_D_R> delL = MCList.create(MST_INSP_STT_D_R.class);
			MCIndexKey idx = up1().createIndex(InspAct_Upd03_Stt_DtlR.$insp_act_no);
			
			MCList<IoAct_Ins01_DtlR> oL = MCList.create(IoAct_Ins01_DtlR.class);
			
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				MCList<InspAct_Upd03_Stt_DtlR> upSttdL = up1().subList(idx, hdrR.insp_act_no());
				
				for (InspAct_Upd03_Stt_DtlR upSttdR : upSttdL) {
					MST_INSP_STT_D_R sttdR = MST_INSP_STT_D_R.create();
					
					if (isUpdOrDel(upSttdR.data_crud_typ())) {
						sttdR.insp_stt_d_no(upSttdR.insp_stt_d_no());
					}
					else if (isIns(upSttdR.data_crud_typ())) {
						sttdR.insp_stt_d_no(getStrSeq(MSC_NUM_SYS_TYP.INSPSD));
					}
					
					if (isDel(upSttdR.data_crud_typ())) {
						delL.add(sttdR);
					}
					
					sttdR.insp_act_no(upSttdR.insp_act_no());
					sttdR.itm_cd(upSttdR.itm_cd());
					sttdR.itm_sub1(upSttdR.itm_sub1());
					sttdR.itm_sub2(upSttdR.itm_sub2());
					sttdR.itm_sub3(upSttdR.itm_sub3());
					sttdR.loc_cd(upSttdR.loc_cd());
					sttdR.str_ln_cd(upSttdR.str_ln_cd());
					sttdR.stk_arrv_bp_cd(upSttdR.stk_arrv_bp_cd());
					sttdR.gd_cd(upSttdR.gd_cd());
					sttdR.quality_typ(upSttdR.quality_typ());
					sttdR.stk_insp_typ(MSC_STK_INSP_TYP.ING.value());
					sttdR.stk_id_typ(upSttdR.stk_id_typ());
					sttdR.stk_bp_cd(upSttdR.stk_bp_cd());
					sttdR.lot_no(upSttdR.lot_no());
					sttdR.sublot_no(upSttdR.sublot_no());
					sttdR.sno1(upSttdR.sno1());
					sttdR.sno1_mng_typ(upSttdR.sno1_mng_typ());
					sttdR.sno2(upSttdR.sno2());
					sttdR.sno2_mng_typ(upSttdR.sno2_mng_typ());
					sttdR.sno3(upSttdR.sno3());
					sttdR.sno3_mng_typ(upSttdR.sno3_mng_typ());
					sttdR.sno4(upSttdR.sno4());
					sttdR.sno4_mng_typ(upSttdR.sno4_mng_typ());
					sttdR.fix_no_typ(upSttdR.fix_no_typ());
					sttdR.fix_no(upSttdR.fix_no());
					sttdR.pack_unit_qty(upSttdR.pack_unit_qty());
					sttdR.pack_unit_cd(upSttdR.pack_unit_cd());
					sttdR.base_unit_qty(upSttdR.base_unit_qty());
					sttdR.base_unit_cd(upSttdR.base_unit_cd());
					sttdR.ac_dt(upSttdR.ac_dt());
					sttdR.sub_char1(upSttdR.sub_char1());
					sttdR.sub_char2(upSttdR.sub_char2());
					sttdR.sub_char3(upSttdR.sub_char3());
					
					if (isIns(upSttdR.data_crud_typ())) {
						insL.add(sttdR);
					}
					else if (isUpd(upSttdR.data_crud_typ())) {
						updL.add(sttdR);
					}
					
					setDownSttDtl(upSttdR, sttdR);
					oL.addAll(getIoActLFromSttd(upSttdR, sttdR, hdrR));
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_STT_D_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_STT_D_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_INSP_STT_D_R updL_t = MST_INSP_STT_D_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				dbUpdateKey("MSBFL5050_MST_INSP_STT_D_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_INSP_STT_D_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_STT_D_D01", delL, delL_bldr);
			}
			
			return oL;
		}
		
		protected MCList<IoAct_Ins01_DtlR> getIoActLFromSttd(
				InspAct_Upd03_Stt_DtlR upSttdR, MST_INSP_STT_D_R sttdR, InspAct_Upd03_HdrR hdrR) {
			
			MCList<IoAct_Ins01_DtlR> rtnL = MCList.create(IoAct_Ins01_DtlR.class);
			IoAct_Ins01_DtlR giR = IoAct_Ins01_DtlR.create();
			IoAct_Ins01_DtlR grR = IoAct_Ins01_DtlR.create();
			
			MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, hdrR.insp_no());
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
			MST_INSP_SCHD_R schdR = getInspSchdRByDtl(instR, sttdR.fix_no());
			MAM_ITM_R itmR = _itmCache.get(sttdR.itm_cd(), sttdR.itm_sub1(), sttdR.itm_sub2(), sttdR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(sttdR.loc_cd());
			
			giR.data_crud_typ(upSttdR.data_crud_typ());
			giR.ac_dt(upSttdR.ac_dt());
			if (isUpdOrDel(upSttdR.data_crud_typ())) {
				giR.can_ac_dt(upSttdR.can_ac_dt());
			}
			giR.act_tm(actR.st_tm());
			giR.act_no(hdrR.insp_act_no());
			giR.act_d_no(sttdR.insp_stt_d_no());
			giR.trn_typ(MSC_TRN_TYP.INSP_STT.value());
			
			if (!MAC_DATA_CRUD_TYP.isDEL(upSttdR.data_crud_typ())) {
				giR.trd_cd(schdR.trd_cd());
				giR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
				giR.gi_wg_cd(locR.wg_cd());
				giR.act_usr_cd(actR.act_usr_cd());
				giR.act_dpt_cd(actR.act_dpt_cd());
				giR.itm_cd(upSttdR.itm_cd());
				giR.itm_sub1(upSttdR.itm_sub1());
				giR.itm_sub2(upSttdR.itm_sub2());
				giR.itm_sub3(upSttdR.itm_sub3());
				giR.itm_nm(instR.itm_nm());
				giR.stk_mng_typ(itmR.stk_mng_typ());
				giR.sundry_itm_flg(itmR.sundry_itm_flg());
				giR.gi_loc_cd(upSttdR.loc_cd());
				giR.gi_str_ln_cd(upSttdR.str_ln_cd());
				giR.stk_arrv_bp_cd(upSttdR.stk_arrv_bp_cd());
				giR.lot_no(upSttdR.lot_no());
				giR.sublot_no(upSttdR.sublot_no());
				giR.sno1(upSttdR.sno1());
				giR.sno1_mng_typ(upSttdR.sno1_mng_typ());
				giR.sno2(upSttdR.sno2());
				giR.sno2_mng_typ(upSttdR.sno2_mng_typ());
				giR.sno3(upSttdR.sno3());
				giR.sno3_mng_typ(upSttdR.sno3_mng_typ());
				giR.sno4(upSttdR.sno4());
				giR.sno4_mng_typ(upSttdR.sno4_mng_typ());
				giR.fix_no_typ(upSttdR.fix_no_typ());
				giR.fix_no(upSttdR.fix_no());
				giR.gi_gd_cd(upSttdR.gd_cd());
				giR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				giR.quality_typ(upSttdR.quality_typ());
				giR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				giR.stk_id_typ(upSttdR.stk_id_typ());
				giR.stk_bp_cd(upSttdR.stk_bp_cd());
				giR.trd_unit_qty(upSttdR.pack_unit_qty());
				giR.trd_unit_cd(upSttdR.pack_unit_cd());
				giR.pack_unit_qty(upSttdR.pack_unit_qty());
				giR.pack_unit_cd(upSttdR.pack_unit_cd());
				giR.base_unit_qty(upSttdR.base_unit_qty());
				giR.base_unit_cd(upSttdR.base_unit_cd());
				giR.sppl_cd(instR.sppl_cd());
				giR.io_typ(MSC_IO_TYP.GI.value());
				giR.trd_rmrks();
				giR.trd_d_rmrks();
			}
			rtnL.add(giR);
			
			if (MAC_DATA_CRUD_TYP.isDEL(upSttdR.data_crud_typ())) {
				return rtnL;
			}
			
			grR.data_crud_typ(upSttdR.data_crud_typ());
			grR.ac_dt(sttdR.ac_dt());
			if (isUpdOrDel(upSttdR.data_crud_typ())) {
				grR.can_ac_dt(upSttdR.can_ac_dt());
			}
			grR.act_tm(actR.st_tm());
			grR.act_no(hdrR.insp_act_no());
			grR.act_d_no(sttdR.insp_stt_d_no());
			grR.trn_typ(MSC_TRN_TYP.INSP_STT.value());
			
			if (!MAC_DATA_CRUD_TYP.isDEL(upSttdR.data_crud_typ())) {
				grR.trd_cd(schdR.trd_cd());
				grR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
				grR.gr_wg_cd(locR.wg_cd());
				grR.act_usr_cd(actR.act_usr_cd());
				grR.act_dpt_cd(actR.act_dpt_cd());
				grR.itm_cd(sttdR.itm_cd());
				grR.itm_sub1(sttdR.itm_sub1());
				grR.itm_sub2(sttdR.itm_sub2());
				grR.itm_sub3(sttdR.itm_sub3());
				grR.itm_nm(instR.itm_nm());
				grR.stk_mng_typ(itmR.stk_mng_typ());
				grR.sundry_itm_flg(itmR.sundry_itm_flg());
				grR.gr_loc_cd(sttdR.loc_cd());
				grR.gr_str_ln_cd(sttdR.str_ln_cd());
				grR.stk_arrv_bp_cd(sttdR.stk_arrv_bp_cd());
				grR.lot_no(sttdR.lot_no());
				grR.sublot_no(sttdR.sublot_no());
				grR.sno1(sttdR.sno1());
				grR.sno1_mng_typ(sttdR.sno1_mng_typ());
				grR.sno2(sttdR.sno2());
				grR.sno2_mng_typ(sttdR.sno2_mng_typ());
				grR.sno3(sttdR.sno3());
				grR.sno3_mng_typ(sttdR.sno3_mng_typ());
				grR.sno4(sttdR.sno4());
				grR.sno4_mng_typ(sttdR.sno4_mng_typ());
				grR.fix_no_typ(sttdR.fix_no_typ());
				grR.fix_no(sttdR.fix_no());
				grR.gr_gd_cd(sttdR.gd_cd());
				grR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				grR.quality_typ(sttdR.quality_typ());
				grR.stk_insp_typ(MSC_STK_INSP_TYP.ING.value());
				grR.stk_id_typ(sttdR.stk_id_typ());
				grR.stk_bp_cd(sttdR.stk_bp_cd());
				grR.trd_unit_qty(sttdR.pack_unit_qty());
				grR.trd_unit_cd(sttdR.pack_unit_cd());
				grR.pack_unit_qty(sttdR.pack_unit_qty());
				grR.pack_unit_cd(sttdR.pack_unit_cd());
				grR.base_unit_qty(sttdR.base_unit_qty());
				grR.base_unit_cd(sttdR.base_unit_cd());
				grR.sppl_cd(instR.sppl_cd());
				grR.io_typ(MSC_IO_TYP.GR.value());
				grR.trd_rmrks();
				grR.trd_d_rmrks();
			}
			rtnL.add(grR);
			
			return rtnL;
		}
		
		protected MST_INSP_SCHD_R getInspSchdRByDtl(MST_INSP_INST_R instR, String fixNo) {
			MCList<MST_INSP_SCHD_R> subSchdL = _schdL.subList(MST_INSP_SCHD_R.$insp_no, instR.insp_no());
			if (MSC_INSP_TYP.isACCPT(instR.insp_typ())) {
				return subSchdL.getFirst(MST_INSP_SCHD_R.$src_no4, fixNo);
			}
			else if (MSC_INSP_TYP.isPRDCT(instR.insp_typ())) {
				return subSchdL.getFirst(MST_INSP_SCHD_R.$src_no4, fixNo);
			}
			else if (MSC_INSP_TYP.isLOT(instR.insp_typ())) {
				return subSchdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, fixNo);
			}
			else {
				return null;
			}
		}
		
		protected MCList<IoAct_Ins01_DtlR> insUpdDelActDtl(MCList<InspAct_Upd03_HdrR> hdrL) {
			if (up2().isEmpty()) {
				return null;
			}
			
			MCList<MST_INSP_ACT_D_R> insL = MCList.create(MST_INSP_ACT_D_R.class);
			MCList<MST_INSP_ACT_D_R> updL = MCList.create(MST_INSP_ACT_D_R.class);
			MCList<MST_INSP_ACT_D_R> delL = MCList.create(MST_INSP_ACT_D_R.class);
			MCIndexKey idx = up2().createIndex(InspAct_Upd03_Act_DtlR.$insp_act_no);
			
			MCList<IoAct_Ins01_DtlR> oL = MCList.create(IoAct_Ins01_DtlR.class);
			
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, hdrR.insp_no());
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
				MCList<InspAct_Upd03_Act_DtlR> upActdL = up2().subList(idx, hdrR.insp_act_no());
				
				for (InspAct_Upd03_Act_DtlR upActdR : upActdL) {
					MST_INSP_ACT_D_R actdR = MST_INSP_ACT_D_R.create();
					
					if (isUpdOrDel(upActdR.data_crud_typ())) {
						actdR.insp_act_d_no(upActdR.insp_act_d_no());
					}
					else if (isIns(upActdR.data_crud_typ())) {
						actdR.insp_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.INSPAD));
					}
					
					if (isDel(upActdR.data_crud_typ())) {
						delL.add(actdR);
					}
					
					actdR.insp_act_no(upActdR.insp_act_no());
					actdR.itm_cd(upActdR.itm_cd());
					actdR.itm_sub1(upActdR.itm_sub1());
					actdR.itm_sub2(upActdR.itm_sub2());
					actdR.itm_sub3(upActdR.itm_sub3());
					actdR.loc_cd(upActdR.loc_cd());
					actdR.str_ln_cd(upActdR.str_ln_cd());
					actdR.stk_arrv_bp_cd(upActdR.stk_arrv_bp_cd());
					actdR.gd_cd(getGdCd(actR, upActdR));
					actdR.quality_typ(getQualityTyp(actR, upActdR));
					actdR.stk_insp_typ(getStkInspTyp(instR));
					actdR.stk_id_typ(upActdR.stk_id_typ());
					actdR.stk_bp_cd(upActdR.stk_bp_cd());
					actdR.lot_no(upActdR.lot_no());
					actdR.sublot_no(upActdR.sublot_no());
					actdR.sno1(upActdR.sno1());
					actdR.sno1_mng_typ(upActdR.sno1_mng_typ());
					actdR.sno2(upActdR.sno2());
					actdR.sno2_mng_typ(upActdR.sno2_mng_typ());
					actdR.sno3(upActdR.sno3());
					actdR.sno3_mng_typ(upActdR.sno3_mng_typ());
					actdR.sno4(upActdR.sno4());
					actdR.sno4_mng_typ(upActdR.sno4_mng_typ());
					actdR.fix_no_typ(upActdR.fix_no_typ());
					actdR.fix_no(upActdR.fix_no());
					actdR.pack_unit_qty(upActdR.pack_unit_qty());
					actdR.pack_unit_cd(upActdR.pack_unit_cd());
					actdR.base_unit_qty(upActdR.base_unit_qty());
					actdR.base_unit_cd(upActdR.base_unit_cd());
					actdR.pack_xfr_pack_unit_qty(upActdR.pack_xfr_pack_unit_qty());
					actdR.pack_xfr_pack_unit_cd(upActdR.pack_xfr_pack_unit_cd());
					actdR.pack_xfr_base_unit_qty(upActdR.pack_xfr_base_unit_qty());
					actdR.pack_xfr_base_unit_cd(upActdR.pack_xfr_base_unit_cd());
					actdR.dfct_rsn_cd(upActdR.dfct_rsn_cd());
					actdR.ac_dt(upActdR.ac_dt());
					actdR.intr_rmrks(upActdR.intr_rmrks());
					actdR.sub_char1(upActdR.sub_char1());
					actdR.sub_char2(upActdR.sub_char2());
					actdR.sub_char3(upActdR.sub_char3());
					actdR.lims_flg(upActdR.lims_flg());
					actdR.ext_sys_cd(upActdR.ext_sys_cd());
					actdR.ext_insp_act_d_no(upActdR.ext_insp_act_d_no());
					
					if (isIns(upActdR.data_crud_typ())) {
						insL.add(actdR);
					}
					else if (isUpd(upActdR.data_crud_typ())) {
						updL.add(actdR);
					}
					
					setDownActDtl(upActdR, actdR);
					oL.addAll(getIoActLFromActd(upActdR, actdR, hdrR));
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_D_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_ACT_D_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_INSP_ACT_D_R updL_t = MST_INSP_ACT_D_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				editInspActDSetStmt(updL, updL_bldr, updL_t);
				dbUpdateKey("MSBFL5050_MST_INSP_ACT_D_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_D_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_ACT_D_D01", delL, delL_bldr);
			}
			
			return oL;
		}
		
		protected String getGdCd(MST_INSP_ACT_R actR, InspAct_Upd03_Act_DtlR actDtl) {
			if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
				return actDtl.gd_cd();
			}
			else {
				return actR.gd_cd();
			}
		}
		
		protected String getQualityTyp(MST_INSP_ACT_R actR, InspAct_Upd03_Act_DtlR actDtl) {
			if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
				return actDtl.quality_typ();
			}
			else {
				return actR.quality_typ();
			}
		}
		
		protected String getStkInspTyp(MST_INSP_INST_R r) {
			if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
				if (isNull(r.insp_aprv_sts_typ())) {
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.WAIT_JUDG.value();
				}
			}
			if (MSC_INSP_STS_TYP.isSTR(r.insp_sts_typ())) {
				return MSC_STK_INSP_TYP.ING.value();
			}
			else {
				// 検査状況区分：完了の場合
				if (isNull(r.insp_aprv_sts_typ())) {
					return MSC_STK_INSP_TYP.FIN.value();
				}
				else {
					return MSC_STK_INSP_TYP.WAIT_JUDG.value();
				}
			}
		}
		/**
		 * 検査実績明細テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editInspActDSetStmt(MCList<MST_INSP_ACT_D_R> updL,
				MCQueryApiBuilder updL_bldr, MST_INSP_ACT_D_R t) {
			updL_bldr.setSet(t.insp_act_d_no);
			updL_bldr.addSet(t.insp_act_no);
			updL_bldr.addSet(t.itm_cd);
			updL_bldr.addSet(t.itm_sub1);
			updL_bldr.addSet(t.itm_sub2);
			updL_bldr.addSet(t.itm_sub3);
			updL_bldr.addSet(t.loc_cd);
			updL_bldr.addSet(t.str_ln_cd);
			updL_bldr.addSet(t.stk_arrv_bp_cd);
			updL_bldr.addSet(t.gd_cd);
			updL_bldr.addSet(t.quality_typ);
			updL_bldr.addSet(t.stk_insp_typ);
			updL_bldr.addSet(t.stk_id_typ);
			updL_bldr.addSet(t.stk_bp_cd);
			updL_bldr.addSet(t.lot_no);
			updL_bldr.addSet(t.sublot_no);
			updL_bldr.addSet(t.sno1);
			updL_bldr.addSet(t.sno1_mng_typ);
			updL_bldr.addSet(t.sno2);
			updL_bldr.addSet(t.sno2_mng_typ);
			updL_bldr.addSet(t.sno3);
			updL_bldr.addSet(t.sno3_mng_typ);
			updL_bldr.addSet(t.sno4);
			updL_bldr.addSet(t.sno4_mng_typ);
			updL_bldr.addSet(t.fix_no_typ);
			updL_bldr.addSet(t.fix_no);
			updL_bldr.addSet(t.pack_unit_qty);
			updL_bldr.addSet(t.pack_unit_cd);
			updL_bldr.addSet(t.base_unit_qty);
			updL_bldr.addSet(t.base_unit_cd);
			updL_bldr.addSet(t.pack_xfr_pack_unit_qty);
			updL_bldr.addSet(t.pack_xfr_pack_unit_cd);
			updL_bldr.addSet(t.pack_xfr_base_unit_qty);
			updL_bldr.addSet(t.pack_xfr_base_unit_cd);
			updL_bldr.addSet(t.dfct_rsn_cd);
			updL_bldr.addSet(t.ac_dt);
			updL_bldr.addSet(t.intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
		}
		protected MCList<IoAct_Ins01_DtlR> getIoActLFromActd(
				InspAct_Upd03_Act_DtlR upActdR, MST_INSP_ACT_D_R actdR, InspAct_Upd03_HdrR hdrR) {
			
			MCList<IoAct_Ins01_DtlR> rtnL = MCList.create(IoAct_Ins01_DtlR.class);
			IoAct_Ins01_DtlR giR = IoAct_Ins01_DtlR.create();
			IoAct_Ins01_DtlR grR = IoAct_Ins01_DtlR.create();
			
			MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, hdrR.insp_no());
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
			MST_INSP_SCHD_R schdR = getInspSchdRByDtl(instR, actdR.fix_no());
			MAM_ITM_R itmR = _itmCache.get(actdR.itm_cd(), actdR.itm_sub1(), actdR.itm_sub2(), actdR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(actdR.loc_cd());
			
			giR.data_crud_typ(upActdR.data_crud_typ());
			giR.ac_dt(upActdR.ac_dt());
			if (isUpdOrDel(upActdR.data_crud_typ())) {
				giR.can_ac_dt(upActdR.can_ac_dt());
			}
			giR.act_tm(nvl(actR.end_tm(), actR.st_tm()));
			giR.act_no(hdrR.insp_act_no());
			giR.act_d_no(actdR.insp_act_d_no());
			giR.trn_typ(MSC_TRN_TYP.INSP_ACT.value());
			
			if (!MAC_DATA_CRUD_TYP.isDEL(upActdR.data_crud_typ())) {
				giR.trd_cd(schdR.trd_cd());
				giR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
				giR.gi_wg_cd(locR.wg_cd());
				giR.act_usr_cd(actR.act_usr_cd());
				giR.act_dpt_cd(actR.act_dpt_cd());
				giR.itm_cd(upActdR.itm_cd());
				giR.itm_sub1(upActdR.itm_sub1());
				giR.itm_sub2(upActdR.itm_sub2());
				giR.itm_sub3(upActdR.itm_sub3());
				giR.itm_nm(instR.itm_nm());
				giR.stk_mng_typ(itmR.stk_mng_typ());
				giR.sundry_itm_flg(itmR.sundry_itm_flg());
				giR.gi_loc_cd(upActdR.loc_cd());
				giR.gi_str_ln_cd(upActdR.str_ln_cd());
				giR.stk_arrv_bp_cd(upActdR.stk_arrv_bp_cd());
				giR.lot_no(upActdR.lot_no());
				giR.sublot_no(upActdR.sublot_no());
				giR.sno1(upActdR.sno1());
				giR.sno1_mng_typ(upActdR.sno1_mng_typ());
				giR.sno2(upActdR.sno2());
				giR.sno2_mng_typ(upActdR.sno2_mng_typ());
				giR.sno3(upActdR.sno3());
				giR.sno3_mng_typ(upActdR.sno3_mng_typ());
				giR.sno4(upActdR.sno4());
				giR.sno4_mng_typ(upActdR.sno4_mng_typ());
				giR.fix_no_typ(upActdR.fix_no_typ());
				giR.fix_no(upActdR.fix_no());
				giR.gi_gd_cd(schdR.gd_cd()); // 上り電文の値をそのまま設定すると更新に対応できないので検査予定の値を設定する。
				giR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				giR.quality_typ(schdR.quality_typ()); // 上り電文の値をそのまま設定すると更新に対応できないので検査予定の値を設定する。
				giR.stk_insp_typ(MSC_STK_INSP_TYP.ING.value());
				giR.stk_id_typ(upActdR.stk_id_typ());
				giR.stk_bp_cd(upActdR.stk_bp_cd());
				giR.trd_unit_qty(upActdR.pack_unit_qty());
				giR.trd_unit_cd(upActdR.pack_unit_cd());
				giR.pack_unit_qty(upActdR.pack_unit_qty());
				giR.pack_unit_cd(upActdR.pack_unit_cd());
				giR.base_unit_qty(upActdR.base_unit_qty());
				giR.base_unit_cd(upActdR.base_unit_cd());
				giR.sppl_cd(instR.sppl_cd());
				giR.pack_xfr_qty(upActdR.pack_xfr_pack_unit_qty());
				giR.pack_xfr_unit_cd(upActdR.pack_xfr_pack_unit_cd());
				giR.io_typ(MSC_IO_TYP.GI.value());
				giR.trd_rmrks();
				giR.trd_d_rmrks();
			}
			rtnL.add(giR);
			
			if (MAC_DATA_CRUD_TYP.isDEL(upActdR.data_crud_typ())) {
				return rtnL;
			}
			
			grR.data_crud_typ(upActdR.data_crud_typ());
			grR.ac_dt(actdR.ac_dt());
			if (isUpdOrDel(upActdR.data_crud_typ())) {
				grR.can_ac_dt(upActdR.can_ac_dt());
			}
			grR.act_tm(nvl(actR.end_tm(), actR.st_tm()));
			grR.act_no(hdrR.insp_act_no());
			grR.act_d_no(actdR.insp_act_d_no());
			grR.trn_typ(MSC_TRN_TYP.INSP_ACT.value());
			
			if (!MAC_DATA_CRUD_TYP.isDEL(upActdR.data_crud_typ())) {
				grR.trd_cd(schdR.trd_cd());
				grR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
				grR.gr_wg_cd(locR.wg_cd());
				grR.act_usr_cd(actR.act_usr_cd());
				grR.act_dpt_cd(actR.act_dpt_cd());
				grR.itm_cd(actdR.itm_cd());
				grR.itm_sub1(actdR.itm_sub1());
				grR.itm_sub2(actdR.itm_sub2());
				grR.itm_sub3(actdR.itm_sub3());
				grR.itm_nm(instR.itm_nm());
				grR.stk_mng_typ(itmR.stk_mng_typ());
				grR.sundry_itm_flg(itmR.sundry_itm_flg());
				grR.gr_loc_cd(actdR.loc_cd());
				grR.gr_str_ln_cd(actdR.str_ln_cd());
				grR.stk_arrv_bp_cd(actdR.stk_arrv_bp_cd());
				grR.lot_no(actdR.lot_no());
				grR.sublot_no(actdR.sublot_no());
				grR.sno1(actdR.sno1());
				grR.sno1_mng_typ(actdR.sno1_mng_typ());
				grR.sno2(actdR.sno2());
				grR.sno2_mng_typ(actdR.sno2_mng_typ());
				grR.sno3(actdR.sno3());
				grR.sno3_mng_typ(actdR.sno3_mng_typ());
				grR.sno4(actdR.sno4());
				grR.sno4_mng_typ(actdR.sno4_mng_typ());
				if (!MSC_STK_INSP_TYP.isFIN(actdR.stk_insp_typ())
						|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(actdR.stk_id_typ())) {
					grR.fix_no_typ(actdR.fix_no_typ());
					grR.fix_no(actdR.fix_no());
				}
				else {
					grR.fix_no_typ(null);
					grR.fix_no(null);
				}
				grR.gr_gd_cd(actdR.gd_cd());
				grR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				grR.quality_typ(actdR.quality_typ());
				grR.stk_insp_typ(actdR.stk_insp_typ());
				grR.stk_id_typ(actdR.stk_id_typ());
				grR.stk_bp_cd(actdR.stk_bp_cd());
				grR.trd_unit_qty(actdR.pack_unit_qty());
				grR.trd_unit_cd(actdR.pack_unit_cd());
				grR.pack_unit_qty(actdR.pack_unit_qty());
				grR.pack_unit_cd(actdR.pack_unit_cd());
				grR.base_unit_qty(actdR.base_unit_qty());
				grR.base_unit_cd(actdR.base_unit_cd());
				grR.sppl_cd(instR.sppl_cd());
				grR.io_typ(MSC_IO_TYP.GR.value());
				grR.trd_rmrks();
				grR.trd_d_rmrks();
			}
			rtnL.add(grR);
			
			return rtnL;
		}
		
		protected MCList<IoAct_Ins01_DtlR> insUpdDelJudgDtl(MCList<InspAct_Upd03_HdrR> hdrL) {
			if (up3().isEmpty()) {
				return null;
			}
			
			MCList<MST_INSP_JUDG_D_R> insL = MCList.create(MST_INSP_JUDG_D_R.class);
			MCList<MST_INSP_JUDG_D_R> updL = MCList.create(MST_INSP_JUDG_D_R.class);
			MCList<MST_INSP_JUDG_D_R> delL = MCList.create(MST_INSP_JUDG_D_R.class);
			MCIndexKey idx = up3().createIndex(InspAct_Upd03_Judg_DtlR.$insp_act_no);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk04_DtlR.$fix_no, InspAct_Chk04_DtlR.$fix_no_typ);
			
			MCList<IoAct_Ins01_DtlR> oL = MCList.create(IoAct_Ins01_DtlR.class);
			
			for (InspAct_Upd03_HdrR hdrR : hdrL) {
				MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, hdrR.insp_no());
				MCList<InspAct_Upd03_Judg_DtlR> upJudgdL = up3().subList(idx, hdrR.insp_act_no());
				
				for (InspAct_Upd03_Judg_DtlR upJudgdR : upJudgdL) {
					MST_INSP_JUDG_D_R judgdR = MST_INSP_JUDG_D_R.create();
					
					if (isUpdOrDel(upJudgdR.data_crud_typ())) {
						judgdR.insp_judg_d_no(upJudgdR.insp_judg_d_no());
					}
					else if (isIns(upJudgdR.data_crud_typ())) {
						judgdR.insp_judg_d_no(getStrSeq(MSC_NUM_SYS_TYP.INSPJD));
					}
					
					if (isDel(upJudgdR.data_crud_typ())) {
						delL.add(judgdR);
					}
					
					judgdR.insp_act_no(upJudgdR.insp_act_no());
					judgdR.itm_cd(upJudgdR.itm_cd());
					judgdR.itm_sub1(upJudgdR.itm_sub1());
					judgdR.itm_sub2(upJudgdR.itm_sub2());
					judgdR.itm_sub3(upJudgdR.itm_sub3());
					judgdR.loc_cd(upJudgdR.loc_cd());
					judgdR.str_ln_cd(upJudgdR.str_ln_cd());
					judgdR.stk_arrv_bp_cd(upJudgdR.stk_arrv_bp_cd());
					if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
						judgdR.gd_cd(upJudgdR.gd_cd());
					}
					else {
						judgdR.gd_cd(actR.gd_cd());
					}
					if (MSC_INSP_JUDG_RSLT_TYP.isNG(actR.insp_judg_rslt_typ())) {
						judgdR.quality_typ(MAC_QUALITY_TYP.DFCT_INSP.value());
					}
					else {
						if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
							judgdR.quality_typ(upJudgdR.quality_typ());
						}
						else {
							judgdR.quality_typ(actR.quality_typ());
						}
					}
					if (MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
						judgdR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
					}
					else {
						judgdR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					}
					judgdR.stk_id_typ(upJudgdR.stk_id_typ());
					judgdR.stk_bp_cd(upJudgdR.stk_bp_cd());
					judgdR.lot_no(upJudgdR.lot_no());
					judgdR.sublot_no(upJudgdR.sublot_no());
					judgdR.sno1(upJudgdR.sno1());
					judgdR.sno1_mng_typ(upJudgdR.sno1_mng_typ());
					judgdR.sno2(upJudgdR.sno2());
					judgdR.sno2_mng_typ(upJudgdR.sno2_mng_typ());
					judgdR.sno3(upJudgdR.sno3());
					judgdR.sno3_mng_typ(upJudgdR.sno3_mng_typ());
					judgdR.sno4(upJudgdR.sno4());
					judgdR.sno4_mng_typ(upJudgdR.sno4_mng_typ());
					judgdR.fix_no_typ(upJudgdR.fix_no_typ());
					judgdR.fix_no(upJudgdR.fix_no());
					judgdR.pack_unit_qty(upJudgdR.pack_unit_qty());
					judgdR.pack_unit_cd(upJudgdR.pack_unit_cd());
					judgdR.base_unit_qty(upJudgdR.base_unit_qty());
					judgdR.base_unit_cd(upJudgdR.base_unit_cd());
					judgdR.ac_dt(upJudgdR.ac_dt());
					judgdR.sub_char1(upJudgdR.sub_char1());
					judgdR.sub_char2(upJudgdR.sub_char2());
					judgdR.sub_char3(upJudgdR.sub_char3());
					
					if (isIns(upJudgdR.data_crud_typ())) {
						insL.add(judgdR);
					}
					else if (isUpd(upJudgdR.data_crud_typ())) {
						updL.add(judgdR);
					}
					
					setDownJudgDtl(upJudgdR, judgdR);
					
					if (MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
						InspAct_Upd03_Stt_DtlR judgdGrR = up1().getFirst(idxkey, upJudgdR.fix_no(), upJudgdR.fix_no_typ());
						judgdR.gd_cd(judgdGrR.gd_cd());
						judgdR.quality_typ(judgdGrR.quality_typ());
						oL.addAll(crtIoActReInspSchd(upJudgdR, judgdR, actR));
					}
					else {
						oL.addAll(getIoActLFromJudgd(upJudgdR, judgdR, hdrR));
					}
				}
			}
			
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_JUDG_D_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_JUDG_D_I02", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_INSP_JUDG_D_R updL_t = MST_INSP_JUDG_D_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				dbUpdateKey("MSBFL5050_MST_INSP_JUDG_D_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_INSP_JUDG_D_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_JUDG_D_D01", delL, delL_bldr);
			}
			
			return oL;
		}
		
		protected MCList<IoAct_Ins01_DtlR> crtIoActReInspSchd(InspAct_Upd03_Judg_DtlR upJudgdR, MST_INSP_JUDG_D_R judgdR, MST_INSP_ACT_R actR) {
			
			MCList<IoAct_Ins01_DtlR> rtnL = MCList.create(IoAct_Ins01_DtlR.class);
			IoAct_Ins01_DtlR giR = IoAct_Ins01_DtlR.create();
			IoAct_Ins01_DtlR grR = IoAct_Ins01_DtlR.create();
			
			MAM_ITM_R itmR = _itmCache.get(judgdR.itm_cd(), judgdR.itm_sub1(), judgdR.itm_sub2(), judgdR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(judgdR.loc_cd());
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, actR.insp_no());
			MST_INSP_SCHD_R schdR = getInspSchdRByDtl(instR, judgdR.fix_no());
			MST_INSP_SCHD_R reSchdR = MST_INSP_SCHD_R.create();
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder reSchdR_bldr = MCQueryApiBuilder.create(t);
			reSchdR_bldr.setSelect(t.insp_schd_no);
			reSchdR_bldr.setWhere(t.own_insp_schd_no.eq(bind("insp_schd_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S12", reSchdR, reSchdR_bldr, schdR);
			
			giR.data_crud_typ(upJudgdR.data_crud_typ());
			giR.ac_dt(upJudgdR.ac_dt());
			if (isUpdOrDel(upJudgdR.data_crud_typ())) {
				giR.can_ac_dt(upJudgdR.can_ac_dt());
			}
			giR.act_tm(actR.judg_dt());
			giR.act_no(reSchdR.insp_schd_no());
			giR.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
			if (!MAC_DATA_CRUD_TYP.isDEL(upJudgdR.data_crud_typ())) {
				giR.trd_cd(schdR.trd_cd());
				giR.trd_ptn_typ(MAC_TRD_PTN_TYP.REINSP.value());
				giR.gi_wg_cd(locR.wg_cd());
				giR.act_usr_cd(actR.judg_usr_cd());
				giR.act_dpt_cd(actR.judg_dpt_cd());
				giR.itm_cd(upJudgdR.itm_cd());
				giR.itm_sub1(upJudgdR.itm_sub1());
				giR.itm_sub2(upJudgdR.itm_sub2());
				giR.itm_sub3(upJudgdR.itm_sub3());
				giR.itm_nm(instR.itm_nm());
				giR.stk_mng_typ(itmR.stk_mng_typ());
				giR.sundry_itm_flg(itmR.sundry_itm_flg());
				giR.gi_loc_cd(upJudgdR.loc_cd());
				giR.gi_str_ln_cd(upJudgdR.str_ln_cd());
				giR.stk_arrv_bp_cd(upJudgdR.stk_arrv_bp_cd());
				giR.lot_no(upJudgdR.lot_no());
				giR.sublot_no(upJudgdR.sublot_no());
				giR.sno1(upJudgdR.sno1());
				giR.sno1_mng_typ(upJudgdR.sno1_mng_typ());
				giR.sno2(upJudgdR.sno2());
				giR.sno2_mng_typ(upJudgdR.sno2_mng_typ());
				giR.sno3(upJudgdR.sno3());
				giR.sno3_mng_typ(upJudgdR.sno3_mng_typ());
				giR.sno4(upJudgdR.sno4());
				giR.sno4_mng_typ(upJudgdR.sno4_mng_typ());
				giR.fix_no_typ(upJudgdR.fix_no_typ());
				giR.fix_no(upJudgdR.fix_no());
				giR.gi_gd_cd(actR.gd_cd());
				giR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				giR.quality_typ(actR.quality_typ());
				giR.stk_insp_typ(MSC_STK_INSP_TYP.WAIT_JUDG.value());
				giR.stk_id_typ(upJudgdR.stk_id_typ());
				giR.stk_bp_cd(upJudgdR.stk_bp_cd());
				giR.trd_unit_qty(upJudgdR.pack_unit_qty());
				giR.trd_unit_cd(upJudgdR.pack_unit_cd());
				giR.pack_unit_qty(upJudgdR.pack_unit_qty());
				giR.pack_unit_cd(upJudgdR.pack_unit_cd());
				giR.base_unit_qty(upJudgdR.base_unit_qty());
				giR.base_unit_cd(upJudgdR.base_unit_cd());
				giR.sppl_cd(schdR.sppl_cd());
				giR.io_typ(MSC_IO_TYP.GI.value());
				giR.trd_rmrks(null);
				giR.trd_d_rmrks(null);
			}
			rtnL.add(giR);
			
			if (MAC_DATA_CRUD_TYP.isDEL(upJudgdR.data_crud_typ())) {
				return rtnL;
			}
			grR.data_crud_typ(upJudgdR.data_crud_typ());
			grR.ac_dt(judgdR.ac_dt());
			if (isUpdOrDel(upJudgdR.data_crud_typ())) {
				grR.can_ac_dt(upJudgdR.can_ac_dt());
			}
			grR.act_tm(actR.judg_dt());
			grR.act_no(reSchdR.insp_schd_no());
			grR.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
			if (!MAC_DATA_CRUD_TYP.isDEL(upJudgdR.data_crud_typ())) {
				grR.trd_cd(schdR.trd_cd());
				grR.trd_ptn_typ(MAC_TRD_PTN_TYP.REINSP.value());
				grR.gr_wg_cd(locR.wg_cd());
				grR.act_usr_cd(actR.judg_usr_cd());
				grR.act_dpt_cd(actR.judg_dpt_cd());
				grR.itm_cd(judgdR.itm_cd());
				grR.itm_sub1(judgdR.itm_sub1());
				grR.itm_sub2(judgdR.itm_sub2());
				grR.itm_sub3(judgdR.itm_sub3());
				grR.itm_nm(instR.itm_nm());
				grR.stk_mng_typ(itmR.stk_mng_typ());
				grR.sundry_itm_flg(itmR.sundry_itm_flg());
				grR.gr_loc_cd(judgdR.loc_cd());
				grR.gr_str_ln_cd(judgdR.str_ln_cd());
				grR.stk_arrv_bp_cd(judgdR.stk_arrv_bp_cd());
				grR.lot_no(judgdR.lot_no());
				grR.sublot_no(judgdR.sublot_no());
				grR.sno1(judgdR.sno1());
				grR.sno1_mng_typ(judgdR.sno1_mng_typ());
				grR.sno2(judgdR.sno2());
				grR.sno2_mng_typ(judgdR.sno2_mng_typ());
				grR.sno3(judgdR.sno3());
				grR.sno3_mng_typ(judgdR.sno3_mng_typ());
				grR.sno4(judgdR.sno4());
				grR.sno4_mng_typ(judgdR.sno4_mng_typ());
				grR.fix_no_typ(judgdR.fix_no_typ());
				grR.fix_no(judgdR.fix_no());
				grR.gr_gd_cd(judgdR.gd_cd());
				grR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				grR.quality_typ(judgdR.quality_typ());
				grR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				grR.stk_id_typ(judgdR.stk_id_typ());
				grR.stk_bp_cd(judgdR.stk_bp_cd());
				grR.trd_unit_qty(judgdR.pack_unit_qty());
				grR.trd_unit_cd(judgdR.pack_unit_cd());
				grR.pack_unit_qty(judgdR.pack_unit_qty());
				grR.pack_unit_cd(judgdR.pack_unit_cd());
				grR.base_unit_qty(judgdR.base_unit_qty());
				grR.base_unit_cd(judgdR.base_unit_cd());
				grR.sppl_cd(schdR.sppl_cd());
				grR.io_typ(MSC_IO_TYP.GR.value());
				grR.trd_rmrks(null);
				grR.trd_d_rmrks(null);
			}
			
			rtnL.add(grR);
			
			return rtnL;
		}
		
		protected MCList<IoAct_Ins01_DtlR> getIoActLFromJudgd(
				InspAct_Upd03_Judg_DtlR upJudgdR, MST_INSP_JUDG_D_R judgdR, InspAct_Upd03_HdrR hdrR) {
			
			MCList<IoAct_Ins01_DtlR> rtnL = MCList.create(IoAct_Ins01_DtlR.class);
			IoAct_Ins01_DtlR giR = IoAct_Ins01_DtlR.create();
			IoAct_Ins01_DtlR grR = IoAct_Ins01_DtlR.create();
			
			MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, hdrR.insp_no());
			MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
			MST_INSP_SCHD_R schdR = getInspSchdRByDtl(instR, judgdR.fix_no());
			
			MAM_ITM_R itmR = _itmCache.get(judgdR.itm_cd(),
					judgdR.itm_sub1(), judgdR.itm_sub2(), judgdR.itm_sub3());
			MAM_LOC_R locR = _locCache.get(judgdR.loc_cd());
			
			giR.data_crud_typ(upJudgdR.data_crud_typ());
			giR.ac_dt(upJudgdR.ac_dt());
			if (isUpdOrDel(upJudgdR.data_crud_typ())) {
				giR.can_ac_dt(upJudgdR.can_ac_dt());
			}
			giR.act_tm(actR.judg_dt());
			giR.act_no(hdrR.insp_act_no());
			giR.act_d_no(judgdR.insp_judg_d_no());
			giR.trn_typ(MSC_TRN_TYP.INSP_JUDG.value());
			
			if (!MAC_DATA_CRUD_TYP.isDEL(upJudgdR.data_crud_typ())) {
				giR.trd_cd(schdR.trd_cd());
				giR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
				giR.gi_wg_cd(locR.wg_cd());
				giR.act_usr_cd(actR.judg_usr_cd());
				giR.act_dpt_cd(actR.judg_dpt_cd());
				giR.itm_cd(upJudgdR.itm_cd());
				giR.itm_sub1(upJudgdR.itm_sub1());
				giR.itm_sub2(upJudgdR.itm_sub2());
				giR.itm_sub3(upJudgdR.itm_sub3());
				giR.itm_nm(instR.itm_nm());
				giR.stk_mng_typ(itmR.stk_mng_typ());
				giR.sundry_itm_flg(itmR.sundry_itm_flg());
				giR.gi_loc_cd(upJudgdR.loc_cd());
				giR.gi_str_ln_cd(upJudgdR.str_ln_cd());
				giR.stk_arrv_bp_cd(upJudgdR.stk_arrv_bp_cd());
				giR.lot_no(upJudgdR.lot_no());
				giR.sublot_no(upJudgdR.sublot_no());
				giR.sno1(upJudgdR.sno1());
				giR.sno1_mng_typ(upJudgdR.sno1_mng_typ());
				giR.sno2(upJudgdR.sno2());
				giR.sno2_mng_typ(upJudgdR.sno2_mng_typ());
				giR.sno3(upJudgdR.sno3());
				giR.sno3_mng_typ(upJudgdR.sno3_mng_typ());
				giR.sno4(upJudgdR.sno4());
				giR.sno4_mng_typ(upJudgdR.sno4_mng_typ());
				giR.fix_no_typ(upJudgdR.fix_no_typ());
				giR.fix_no(upJudgdR.fix_no());
				giR.gi_gd_cd(upJudgdR.gd_cd());
				giR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				if (MAC_INSP_MTD_TYP.isTTL(actR.insp_mtd_typ())) {
					giR.quality_typ(upJudgdR.quality_typ());
				}
				else {
					giR.quality_typ(actR.quality_typ());
				}
				giR.stk_insp_typ(MSC_STK_INSP_TYP.WAIT_JUDG.value());
				giR.stk_id_typ(upJudgdR.stk_id_typ());
				giR.stk_bp_cd(upJudgdR.stk_bp_cd());
				giR.trd_unit_qty(upJudgdR.pack_unit_qty());
				giR.trd_unit_cd(upJudgdR.pack_unit_cd());
				giR.pack_unit_qty(upJudgdR.pack_unit_qty());
				giR.pack_unit_cd(upJudgdR.pack_unit_cd());
				giR.base_unit_qty(upJudgdR.base_unit_qty());
				giR.base_unit_cd(upJudgdR.base_unit_cd());
				giR.sppl_cd(instR.sppl_cd());
				giR.io_typ(MSC_IO_TYP.GI.value());
				giR.trd_rmrks();
				giR.trd_d_rmrks();
			}
			rtnL.add(giR);
			
			if (MAC_DATA_CRUD_TYP.isDEL(upJudgdR.data_crud_typ())) {
				return rtnL;
			}
			
			grR.data_crud_typ(upJudgdR.data_crud_typ());
			grR.ac_dt(judgdR.ac_dt());
			if (isUpdOrDel(upJudgdR.data_crud_typ())) {
				grR.can_ac_dt(upJudgdR.can_ac_dt());
			}
			grR.act_tm(actR.judg_dt());
			grR.act_no(hdrR.insp_act_no());
			grR.act_d_no(judgdR.insp_judg_d_no());
			grR.trn_typ(MSC_TRN_TYP.INSP_JUDG.value());
			
			if (!MAC_DATA_CRUD_TYP.isDEL(upJudgdR.data_crud_typ())) {
				grR.trd_cd(schdR.trd_cd());
				grR.trd_ptn_typ(MAC_TRD_PTN_TYP.INSP.value());
				grR.gr_wg_cd(locR.wg_cd());
				grR.act_usr_cd(actR.judg_usr_cd());
				grR.act_dpt_cd(actR.judg_dpt_cd());
				grR.itm_cd(judgdR.itm_cd());
				grR.itm_sub1(judgdR.itm_sub1());
				grR.itm_sub2(judgdR.itm_sub2());
				grR.itm_sub3(judgdR.itm_sub3());
				grR.itm_nm(instR.itm_nm());
				grR.stk_mng_typ(itmR.stk_mng_typ());
				grR.sundry_itm_flg(itmR.sundry_itm_flg());
				grR.gr_loc_cd(judgdR.loc_cd());
				grR.gr_str_ln_cd(judgdR.str_ln_cd());
				grR.stk_arrv_bp_cd(judgdR.stk_arrv_bp_cd());
				grR.lot_no(judgdR.lot_no());
				grR.sublot_no(judgdR.sublot_no());
				grR.sno1(judgdR.sno1());
				grR.sno1_mng_typ(judgdR.sno1_mng_typ());
				grR.sno2(judgdR.sno2());
				grR.sno2_mng_typ(judgdR.sno2_mng_typ());
				grR.sno3(judgdR.sno3());
				grR.sno3_mng_typ(judgdR.sno3_mng_typ());
				grR.sno4(judgdR.sno4());
				grR.sno4_mng_typ(judgdR.sno4_mng_typ());
				if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(judgdR.stk_id_typ())) {
					grR.fix_no_typ(judgdR.fix_no_typ());
					grR.fix_no(judgdR.fix_no());
				}
				else {
					grR.fix_no_typ(null);
					grR.fix_no(null);
				}
				grR.gr_gd_cd(judgdR.gd_cd());
				grR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				grR.quality_typ(judgdR.quality_typ());
				grR.stk_insp_typ(judgdR.stk_insp_typ());
				grR.stk_id_typ(judgdR.stk_id_typ());
				grR.stk_bp_cd(judgdR.stk_bp_cd());
				grR.trd_unit_qty(judgdR.pack_unit_qty());
				grR.trd_unit_cd(judgdR.pack_unit_cd());
				grR.pack_unit_qty(judgdR.pack_unit_qty());
				grR.pack_unit_cd(judgdR.pack_unit_cd());
				grR.base_unit_qty(judgdR.base_unit_qty());
				grR.base_unit_cd(judgdR.base_unit_cd());
				grR.sppl_cd(instR.sppl_cd());
				grR.io_typ(MSC_IO_TYP.GR.value());
				grR.trd_rmrks();
				grR.trd_d_rmrks();
			}
			
			rtnL.add(grR);
			
			return rtnL;
		}
		
		
		
		protected void setDownSttDtl(InspAct_Upd03_Stt_DtlR sttDtlR, MST_INSP_STT_D_R isdR) {
			InspAct_Upd03_Stt_DtlR downR = InspAct_Upd03_Stt_DtlR.create();
			downR.peg_no(sttDtlR.peg_no());
			downR.insp_stt_d_no(isdR.insp_stt_d_no());
			downR.insp_act_no(sttDtlR.insp_act_no());
			down1().add(downR);
		}
		
		protected void setDownActDtl(InspAct_Upd03_Act_DtlR actDtlR, MST_INSP_ACT_D_R iadR) {
			InspAct_Upd03_Act_DtlR downR = InspAct_Upd03_Act_DtlR.create();
			downR.peg_no(actDtlR.peg_no());
			downR.insp_act_d_no(iadR.insp_act_d_no());
			downR.insp_act_no(actDtlR.insp_act_no());
			down2().add(downR);
		}
		
		protected void setDownJudgDtl(InspAct_Upd03_Judg_DtlR judgDtlR, MST_INSP_JUDG_D_R ijdR) {
			InspAct_Upd03_Judg_DtlR downR = InspAct_Upd03_Judg_DtlR.create();
			downR.peg_no(judgDtlR.peg_no());
			downR.insp_judg_d_no(ijdR.insp_judg_d_no());
			downR.insp_act_no(judgDtlR.insp_act_no());
			down3().add(downR);
		}
		
		protected boolean isIns(String dataCrudTyp) {
			if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp)) {
				return true;
			}
			return false;
		}
		
		protected boolean isUpd(String dataCrudTyp) {
			if (MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp)) {
				return true;
			}
			return false;
		}
		
		protected boolean isDel(String dataCrudTyp) {
			if (MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)) {
				return true;
			}
			return false;
		}
		
		protected MCList<InspAct_Upd03_HdrR> getTgt() {
			MCList<InspAct_Upd03_HdrR> rtnL = MCList.create(InspAct_Upd03_HdrR.class);
			MCList<InspAct_Upd03_HdrR> bindArrActNoL = MCList.create(InspAct_Upd03_HdrR.class);
			MCList<InspAct_Upd03_HdrR> bindInspActNoL = MCList.create(InspAct_Upd03_HdrR.class);
			MCList<MST_INSP_ACT_R> actBindArrActNoL = MCList.create(MST_INSP_ACT_R.class);
			MCList<MST_INSP_ACT_R> actBindInspActNoL = MCList.create(MST_INSP_ACT_R.class);
			MCIndexKey idxForArrAct = null;
			MCIndexKey idxForInspAct = null;
			
			for (InspAct_Upd03_HdrR up0R : up0()) {
				if (!isNull(up0R.arr_act_no())) {
					bindArrActNoL.add(up0R);
				}
				else if (!isNull(up0R.insp_act_no())) {
					bindInspActNoL.add(up0R);
				}
			}
			
			if (!bindArrActNoL.isEmpty()) {
				MST_INSP_ACT_R actBindArrActNoL_t = MST_INSP_ACT_R.create("T");
				MCQueryApiBuilder actBindArrActNoL_bldr = MCQueryApiBuilder.create(actBindArrActNoL_t);
				MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");
				actBindArrActNoL_bldr.addSelect(t2.src_no4.as("arr_act_no"));
				actBindArrActNoL_bldr.addInnerJoin(t2, actBindArrActNoL_t.insp_no.eq(t2.insp_no));
				actBindArrActNoL_bldr.setWhere(t2.src_no4.eq(bind("arr_act_no")));
				dbSelect("MSBFL5050_MST_INSP_ACT_S06", actBindArrActNoL, actBindArrActNoL_bldr, bindArrActNoL);
				idxForArrAct = actBindArrActNoL.createIndex("ARR_ACT_NO");
			}
			if (!bindInspActNoL.isEmpty()) {
				MST_INSP_ACT_R actBindInspActNoL_t = MST_INSP_ACT_R.create("T");
				MCQueryApiBuilder actBindInspActNoL_bldr = MCQueryApiBuilder.create(actBindInspActNoL_t);
				actBindInspActNoL_bldr.setWhere(actBindInspActNoL_t.insp_act_no.eq(bind("insp_act_no")));
				dbSelect("MSBFL5050_MST_INSP_ACT_S07", actBindInspActNoL, actBindInspActNoL_bldr, bindInspActNoL);
				idxForInspAct = actBindInspActNoL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			}
			
			for (InspAct_Upd03_HdrR up0R : up0()) {
				if (!isNull(up0R.arr_act_no())) {
					MST_INSP_ACT_R actR = actBindArrActNoL.getFirst(idxForArrAct, up0R.arr_act_no());
					if (!isNull(actR)) {
						up0R.insp_act_no(actR.insp_act_no());
						up0R.insp_no(actR.insp_no());
						rtnL.add(up0R);
					}
				}
				else if (!isNull(up0R.insp_act_no())) {
					MST_INSP_ACT_R actR = actBindInspActNoL.getFirst(idxForInspAct, up0R.insp_act_no());
					if (!isNull(actR)) {
						rtnL.add(up0R);
					}
				}
			}
			
			_actL.setAll(actBindArrActNoL);
			_actL.addAll(actBindInspActNoL);
			_actIdx = _actL.createIndex(MST_INSP_ACT_R.$insp_no);
			
			return rtnL;
		}
	}
	/**
	 * InspAct_Upd04オペレーション.<p>
	 *
	 * 出来高登録後の、検査指図・検査実績の登録・訂正を行う。<br>
	 */
	public class InspAct_Upd04 extends MSBFL_InspActService_MC_A.InspAct_Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<InspAct_Upd04_HdrR> tgtL = getTgtL();
			if (tgtL.isEmpty()) {
				return;
			}
			// 検査指図相当の処理
			doInst(tgtL);
			// 検査実績相当の処理
			doAct(tgtL);
		}
		
		/**
		 * 処理対象のリストを返す
		 * @return
		 */
		protected MCList<InspAct_Upd04_HdrR> getTgtL() {
			MCList<InspAct_Upd04_HdrR> ret = MCList.create(InspAct_Upd04_HdrR.class);
			for (InspAct_Upd04_HdrR r : up0()) {
				if (isTgtR(r)) {
					ret.add(r);
				}
			}
			return ret;
		}
		/**
		 * 処理対象の行かどうか
		 * @param r
		 * @return
		 */
		protected boolean isTgtR(InspAct_Upd04_HdrR r) {
			if (!MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
				return false;
			}
			if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
				return false;
			}
			if (!MSC_INSP_STS_TYP.isYET(r.insp_sts_typ())) {
				return false;
			}
			if (!MAC_INSP_BIND_TYP.isLOT(r.insp_bind_typ())) {
				return false;
			}
			return true;
		}
		
		/**
		 * 指図処理
		 */
		protected void doInst(MCList<InspAct_Upd04_HdrR> tgtL) {
			// 検査予定・検査指図をメンテナンスする（検査指図相当の処理）
			// ※受払予定のメンテナンスは不要（呼び出し元が行うため）
			
			MCList<MST_INSP_SCHD_R> updSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_INST_R> updInstL = MCList.create(MST_INSP_INST_R.class);

			
			for (InspAct_Upd04_HdrR r : tgtL) {
				MST_INSP_INST_R instR = getTgtInstR(r);
				if (!isNull(instR)) {
					MCRow.copyvalue(r.insp_inst(), instR);

					MCQueryApiBuilder inspSchd_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
					dbSelectKey("MSBFL5050_MST_INSP_SCHD_S13", r.insp_schd(), inspSchd_bldr, r);
					
					r.insp_schd().insp_no(r.insp_inst().insp_no());
					r.insp_schd().insp_schd_sts_typ(MSC_INSP_STS_TYP.ORD.value());
					updSchdL.add(r.insp_schd());
					
					if (!r.insp_inst().col_schd_flg()) {
						r.insp_inst().col_schd_flg(true);
						updInstL.add(r.insp_inst());
					}
				}
			}
			if (!updSchdL.isEmpty()) {
				MST_INSP_SCHD_R updSchdL_t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder updSchdL_bldr = MCQueryApiBuilder.create(updSchdL_t);
				updSchd(updSchdL, updSchdL_bldr, updSchdL_t);
			}
			if (!updInstL.isEmpty()) {
				MST_INSP_INST_R updInstL_t = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder updInstL_bldr = MCQueryApiBuilder.create(updInstL_t);
				updInst(updInstL, updInstL_bldr, updInstL_t);
			}
		}
		
		/**
		 * 潜り込むことが可能な検査指図を返す
		 * @return
		 */
		protected MST_INSP_INST_R getTgtInstR(InspAct_Upd04_HdrR r) {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			// insp_mtd_typは考慮しない（前の処理で全数をはじいており、
			// 指図時に変更可能なため検査予定と検査指図で異なる値を持つことは、通常とり得るデータなので）
			instL_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
			instL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
			instL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
			instL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
			instL_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());
			instL_bldr.addWhereWithAnd(
					bracket(t.sublot_no.eq(bind("1")).or(t.sublot_no.eq(bind("2")))),
					r.sublot_no(), MAC_STR.NULL_VAL.value());
			instL_bldr.addWhereWithAnd(t.insp_freq.eq(bind("1")), r.insp_freq());
			instL_bldr.addWhereWithAnd(t.src_no1.eq(bind("1")), r.src_no1());
			instL_bldr.addWhereWithAnd(t.src_no2.eq(bind("1")), r.src_no2());
			instL_bldr.addWhereWithAnd(t.insp_typ.eq(bind("1")), r.insp_typ());
			instL_bldr.addWhereWithAnd(t.insp_bind_typ.eq(bind("1")),
					MAC_INSP_BIND_TYP.LOT.value());
			instL_bldr.addWhereWithAnd(t.to_site_cd.eq(bind("1")), r.to_site_cd());
			
			instL_bldr.addOrderByDesc(t.insp_no);
			dbSelectForUpdateNoWait("MSBFL5050_MST_INSP_INST_S10", instL, instL_bldr);
			if (!instL.isEmpty()) {
				return instL.get(0);
			}
			else {
				return null;
			}
		}
		
		/**
		 * 検査予定を更新する
		 */
		protected void updSchd(MCList<MST_INSP_SCHD_R> updSchdL,
				MCQueryApiBuilder updSchdL_bldr, MST_INSP_SCHD_R t) {
			updSchdL_bldr.setSet(t.insp_no);
			updSchdL_bldr.addSet(t.insp_schd_sts_typ);
			dbUpdateKey("MSBFL5050_MST_INSP_SCHD_U03", updSchdL, updSchdL_bldr);
		}
		
		/**
		 * 検査指図を更新する
		 */
		protected void updInst(MCList<MST_INSP_INST_R> updInstL,
				MCQueryApiBuilder updInstL_bldr, MST_INSP_INST_R t) {
			updInstL_bldr.setSet(t.col_schd_flg);
			dbUpdateKey("MSBFL5050_MST_INSP_INST_U03", updInstL, updInstL_bldr);
		}
		
		/**
		 * 実績登録処理
		 */
		protected void doAct(MCList<InspAct_Upd04_HdrR> tgtL) {
			// 検査実績・再検査予定をメンテナンスする（抜取検査実績相当の処理）
			// ※工場出荷承認のメンテナンスは不要（呼び出し元が行うため）
			// ※受入検査は本処理の対象外
			// ※本処理では、引落も発生しない
			
			// 検査着手明細・検査実績明細更新用ヘッダ
			MCList<InspAct_Upd03_HdrR> hdrL = MCList.create(InspAct_Upd03_HdrR.class);
			// 検査着手明細登録用
			MCList<InspAct_Upd03_Stt_DtlR> insSttdL = MCList.create(InspAct_Upd03_Stt_DtlR.class);
			// 検査実績明細登録用
			MCList<InspAct_Upd03_Act_DtlR> insActdL = MCList.create(InspAct_Upd03_Act_DtlR.class);
			// 検査判定明細登録用
			MCList<InspAct_Upd03_Judg_DtlR> insJudgdL = MCList.create(InspAct_Upd03_Judg_DtlR.class);
			// 再検査予定登録用
			MCList<MST_INSP_SCHD_R> reSchdL = MCList.create(MST_INSP_SCHD_R.class);
			// 再検査予定の元となる検査予定更新用
			MCList<MST_INSP_SCHD_R> orgSchdL = MCList.create(MST_INSP_SCHD_R.class);
			
			setPegNo(tgtL);
			// 同一検査実績に対して出来高が複数行同時登録された場合、ヘッダコンテナを１行のみ作成するために
			// 一度ヘッダコンテナを作成した検査実績ＮＯを保持しておく
			java.util.Set<String> hdrActNoSet = new java.util.HashSet<String>();
			for (InspAct_Upd04_HdrR r : tgtL) {
				if (isNull(r.insp_inst().insp_no())) {
					continue;
				}
				if (MSC_INSP_STS_TYP.isORD(r.insp_inst().insp_sts_typ())) {
					continue;
				}
				
				// 検査実績を更新する。
				MST_INSP_ACT_R actR = getInspActR(r);
				// 再検査の場合
				if (MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
					r.insp_schd().latest_flg(false);
					orgSchdL.add(r.insp_schd());
					MST_INSP_SCHD_R reSchdR = MST_INSP_SCHD_R.create();
					MCRow.copyvalue(reSchdR, r.insp_schd());
					editReSchdR(r, reSchdR);
					reSchdL.add(reSchdR);
				}
				
				// 出来高実績が登録されない場合、紐づく検査の各明細情報も作成しない。
				if (isNull(r.src_no4())) {
					continue;
				}
				MST_INSP_ACT_R actR_t = MST_INSP_ACT_R.create("T");
				MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(actR_t);
				updInspAct(r, actR, actR_bldr, actR_t);
				
				// 検査着手明細、検査実績明細を登録するためのリストを作成する
				if (MSC_INSP_STS_TYP.isSTR(r.insp_inst().insp_sts_typ())) {
					if (!hdrActNoSet.contains(actR.insp_act_no())) {
						hdrActNoSet.add(actR.insp_act_no());
						hdrL.add(getHdr(r, actR));
					}
					// 検査中ロット使用許可品でない場合、各検査実績明細は登録する
					if (!MSC_STK_INSP_TYP.isFIN(r.insp_schd().stk_insp_typ())) {
						insSttdL.add(getSttD(r, actR));
					}
				}
				else if (MSC_INSP_STS_TYP.isJDG(r.insp_inst().insp_sts_typ())
						&& (isNull(r.insp_inst().insp_aprv_sts_typ())
								|| MSC_INSP_APRV_STS_TYP.isJUDG_OPN(r.insp_inst().insp_aprv_sts_typ()))) {
					if (!hdrActNoSet.contains(actR.insp_act_no())) {
						hdrActNoSet.add(actR.insp_act_no());
						hdrL.add(getHdr(r, actR));
					}
					// 検査中ロット使用許可品でない場合、各検査実績明細は登録する
					if (!MSC_STK_INSP_TYP.isFIN(r.insp_schd().stk_insp_typ())) {
						insSttdL.add(getSttD(r, actR));
						insActdL.add(getActD(r, actR));
					}
				}
				else if (MSC_INSP_STS_TYP.isJDG(r.insp_inst().insp_sts_typ())
						&& MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(r.insp_inst().insp_aprv_sts_typ())) {
					if (!hdrActNoSet.contains(actR.insp_act_no())) {
						hdrActNoSet.add(actR.insp_act_no());
						hdrL.add(getHdr(r, actR));
					}
					// 検査中ロット使用許可品でない場合、各検査実績明細は登録する
					if (!MSC_STK_INSP_TYP.isFIN(r.insp_schd().stk_insp_typ())) {
						insSttdL.add(getSttD(r, actR));
						insActdL.add(getActD(r, actR));
						insJudgdL.add(getJudgD(r, actR));
					}
				}
				
			}
			
			if (!reSchdL.isEmpty()) {
				MCQueryApiBuilder reSchdL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
				dbInsert("MSBFL5050_MST_INSP_SCHD_I02", reSchdL, reSchdL_bldr);
			}
			
			if (!orgSchdL.isEmpty()) {
				MST_INSP_SCHD_R orgSchdL_t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder orgSchdL_bldr = MCQueryApiBuilder.create(orgSchdL_t);
				orgSchdL_bldr.setSet(orgSchdL_t.latest_flg);
				dbUpdateKey("MSBFL5050_MST_INSP_SCHD_U04", orgSchdL, orgSchdL_bldr);
			}
			if (!hdrL.isEmpty()) {
				callInspActUpd03(hdrL, insSttdL, insActdL, insJudgdL);
			}
		}
		
		protected MST_INSP_ACT_R getInspActR(InspAct_Upd04_HdrR r) {
			MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
			MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			
			actR_bldr.setWhere(t.insp_no.eq(bind("1")), r.insp_inst().insp_no());
			dbSelect("MSBFL5050_MST_INSP_ACT_S08", actR, actR_bldr);
			
			return actR;
		}
		
		protected void updInspAct(InspAct_Upd04_HdrR r, MST_INSP_ACT_R actR,
				MCQueryApiBuilder actR_bldr, MST_INSP_ACT_R t) {
			if (MSC_INSP_STS_TYP.isJDG(r.insp_inst().insp_sts_typ())) {
				actR.base_unit_qty(
						actR.base_unit_qty().add(r.insp_schd().base_unit_qty()));
				actR_bldr.setSet(t.base_unit_qty);
				if (MAC_QUALITY_TYP.isGOOD(actR.quality_typ())) {
					actR.good_qty(actR.good_qty().add(r.insp_schd().base_unit_qty()));
					actR_bldr.addSet(t.good_qty);
				}
				else if (MAC_QUALITY_TYP.isDFCT_INSP(actR.quality_typ())) {
					actR.dfct_qty(actR.dfct_qty().add(r.insp_schd().base_unit_qty()));
					actR_bldr.addSet(t.dfct_qty);
				}

				dbUpdateKey("MSBFL5050_MST_INSP_ACT_U04", actR, actR_bldr);
			}
		}
		
		protected void callInspActUpd03(MCList<InspAct_Upd03_HdrR> hdrL,
				MCList<InspAct_Upd03_Stt_DtlR> insSttdL, MCList<InspAct_Upd03_Act_DtlR> insActdL, MCList<InspAct_Upd03_Judg_DtlR> insJudgdL) {
			MSBFL_InspActService.InspAct_Upd03 o = MSBFL_InspActService.crtInspAct_Upd03();
			
			o.up0().addAll(hdrL);
			o.up1().addAll(insSttdL);
			o.up2().addAll(insActdL);
			o.up3().addAll(insJudgdL);
			
			o.exec();
		}
		
		protected InspAct_Upd03_HdrR getHdr(InspAct_Upd04_HdrR r, MST_INSP_ACT_R actR) {
			InspAct_Upd03_HdrR hdrR = InspAct_Upd03_HdrR.create();
			
			hdrR.insp_act_no(actR.insp_act_no());
			hdrR.insp_no(actR.insp_no());
			hdrR.arr_act_no(null);
			hdrR.insp_smpl_act_upd_flg(false);
			hdrR.setAttributes(r);
			
			return hdrR;
		}
		
		protected InspAct_Upd03_Stt_DtlR getSttD(InspAct_Upd04_HdrR r, MST_INSP_ACT_R actR) {
			InspAct_Upd03_Stt_DtlR sttdR = InspAct_Upd03_Stt_DtlR.create();
			
			sttdR.peg_no(r.peg_no());
			sttdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			sttdR.insp_stt_d_no(null);
			sttdR.insp_act_no(actR.insp_act_no());
			sttdR.itm_cd(r.itm_cd());
			sttdR.itm_sub1(r.itm_sub1());
			sttdR.itm_sub2(r.itm_sub2());
			sttdR.itm_sub3(r.itm_sub3());
			sttdR.itm_sub1(r.itm_sub1());
			sttdR.loc_cd(r.insp_schd().loc_cd());
			sttdR.str_ln_cd(r.insp_schd().str_ln_cd());
			sttdR.stk_arrv_bp_cd(r.insp_schd().stk_arrv_bp_cd());
			sttdR.gd_cd(r.insp_schd().gd_cd());
			sttdR.quality_typ(r.insp_schd().quality_typ());
			sttdR.stk_insp_typ(MSC_STK_INSP_TYP.ING.value());
			sttdR.stk_id_typ(r.insp_schd().stk_id_typ());
			sttdR.stk_bp_cd(r.insp_schd().stk_bp_cd());
			sttdR.lot_no(r.lot_no());
			sttdR.sublot_no(r.sublot_no());
			sttdR.sno1(r.sno1());
			sttdR.sno1_mng_typ(r.sno1_mng_typ());
			sttdR.sno2(r.sno2());
			sttdR.sno2_mng_typ(r.sno2_mng_typ());
			sttdR.sno3(r.sno3());
			sttdR.sno3_mng_typ(r.sno3_mng_typ());
			sttdR.sno4(r.sno4());
			sttdR.sno4_mng_typ(r.sno4_mng_typ());
			sttdR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
			sttdR.fix_no(r.src_no4());
			sttdR.pack_unit_qty(r.insp_schd().pack_unit_qty());
			sttdR.pack_unit_cd(r.insp_schd().pack_unit_cd());
			sttdR.base_unit_qty(r.insp_schd().base_unit_qty());
			sttdR.base_unit_cd(r.insp_schd().base_unit_cd());
			sttdR.ac_dt(r.ac_dt());
			
			return sttdR;
		}
		
		protected InspAct_Upd03_Act_DtlR getActD(InspAct_Upd04_HdrR r, MST_INSP_ACT_R actR) {
			InspAct_Upd03_Act_DtlR actdR = InspAct_Upd03_Act_DtlR.create();
			
			actdR.peg_no(r.peg_no());
			actdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			actdR.insp_act_d_no(null);
			actdR.insp_act_no(actR.insp_act_no());
			actdR.itm_cd(r.itm_cd());
			actdR.itm_sub1(r.itm_sub1());
			actdR.itm_sub2(r.itm_sub2());
			actdR.itm_sub3(r.itm_sub3());
			actdR.itm_sub1(r.itm_sub1());
			actdR.loc_cd(r.insp_schd().loc_cd());
			actdR.str_ln_cd(r.insp_schd().str_ln_cd());
			actdR.stk_arrv_bp_cd(r.insp_schd().stk_arrv_bp_cd());
			actdR.gd_cd(actR.gd_cd());
			actdR.quality_typ(actR.quality_typ());
			if (r.insp_inst().insp_aprv_flg()) {
				actdR.stk_insp_typ(MSC_STK_INSP_TYP.WAIT_JUDG.value());
			}
			else {
				actdR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			actdR.stk_id_typ(r.insp_schd().stk_id_typ());
			actdR.stk_bp_cd(r.insp_schd().stk_bp_cd());
			actdR.lot_no(r.lot_no());
			actdR.sublot_no(r.sublot_no());
			actdR.sno1(r.sno1());
			actdR.sno1_mng_typ(r.sno1_mng_typ());
			actdR.sno2(r.sno2());
			actdR.sno2_mng_typ(r.sno2_mng_typ());
			actdR.sno3(r.sno3());
			actdR.sno3_mng_typ(r.sno3_mng_typ());
			actdR.sno4(r.sno4());
			actdR.sno4_mng_typ(r.sno4_mng_typ());
			actdR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
			actdR.fix_no(r.src_no4());
			actdR.pack_unit_qty(r.insp_schd().pack_unit_qty());
			actdR.pack_unit_cd(r.insp_schd().pack_unit_cd());
			actdR.base_unit_qty(r.insp_schd().base_unit_qty());
			actdR.base_unit_cd(r.insp_schd().base_unit_cd());
			actdR.pack_xfr_pack_unit_qty(null);
			actdR.pack_xfr_pack_unit_cd(r.insp_schd().pack_unit_cd());
			actdR.pack_xfr_base_unit_qty(null);
			actdR.pack_xfr_base_unit_cd(r.insp_schd().base_unit_cd());
			actdR.dfct_rsn_cd(null);
			actdR.ac_dt(r.ac_dt());
			actdR.intr_rmrks(null);
			
			return actdR;
		}
		
		protected InspAct_Upd03_Judg_DtlR getJudgD(InspAct_Upd04_HdrR r, MST_INSP_ACT_R actR) {
			InspAct_Upd03_Judg_DtlR judgdR = InspAct_Upd03_Judg_DtlR.create();
			
			judgdR.peg_no(r.peg_no());
			judgdR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			judgdR.insp_judg_d_no(null);
			judgdR.insp_act_no(actR.insp_act_no());
			judgdR.itm_cd(r.itm_cd());
			judgdR.itm_sub1(r.itm_sub1());
			judgdR.itm_sub2(r.itm_sub2());
			judgdR.itm_sub3(r.itm_sub3());
			judgdR.itm_sub1(r.itm_sub1());
			judgdR.loc_cd(r.insp_schd().loc_cd());
			judgdR.str_ln_cd(r.insp_schd().str_ln_cd());
			judgdR.stk_arrv_bp_cd(r.insp_schd().stk_arrv_bp_cd());
			judgdR.gd_cd(actR.gd_cd());
			if (MSC_INSP_JUDG_RSLT_TYP.is_stk_good(actR.insp_judg_rslt_typ())) {
				judgdR.quality_typ(actR.quality_typ());
			}
			else {
				judgdR.quality_typ(MAC_QUALITY_TYP.DFCT_INSP.value());
			}
			if (MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
				judgdR.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
			}
			else {
				judgdR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}
			judgdR.stk_id_typ(r.insp_schd().stk_id_typ());
			judgdR.stk_bp_cd(r.insp_schd().stk_bp_cd());
			judgdR.lot_no(r.lot_no());
			judgdR.sublot_no(r.sublot_no());
			judgdR.sno1(r.sno1());
			judgdR.sno1_mng_typ(r.sno1_mng_typ());
			judgdR.sno2(r.sno2());
			judgdR.sno2_mng_typ(r.sno2_mng_typ());
			judgdR.sno3(r.sno3());
			judgdR.sno3_mng_typ(r.sno3_mng_typ());
			judgdR.sno4(r.sno4());
			judgdR.sno4_mng_typ(r.sno4_mng_typ());
			judgdR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
			judgdR.fix_no(r.src_no4());
			judgdR.pack_unit_qty(r.insp_schd().pack_unit_qty());
			judgdR.pack_unit_cd(r.insp_schd().pack_unit_cd());
			judgdR.base_unit_qty(r.insp_schd().base_unit_qty());
			judgdR.base_unit_cd(r.insp_schd().base_unit_cd());
			judgdR.ac_dt(r.ac_dt());
			
			return judgdR;
		}
		
		/**
		 * 再検査の検査予定コンテナの編集（下り電文コンテナも作成する）
		 */
		protected void editReSchdR(InspAct_Upd04_HdrR r, MST_INSP_SCHD_R reSchdR) {
			reSchdR.own_insp_schd_no(r.insp_schd().insp_schd_no());
			reSchdR.own_insp_no(r.insp_inst().insp_no());
			reSchdR.st_tm(r.insp_inst().st_tm());
			reSchdR.end_tm(r.insp_inst().end_tm());
			reSchdR.smpl_inst_qty(null);
			reSchdR.latest_flg(true);
			reSchdR.insp_no(null);
			
			reSchdR.insp_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INSPS));
			reSchdR.insp_freq(r.insp_schd().insp_freq().add(1));
			reSchdR.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
			
			// 再検査の予定を、下り電文として返す。
			InspAct_Upd04_HdrR downR = InspAct_Upd04_HdrR.create();
			setDownR(downR, r, reSchdR);
			down0().add(downR);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDownR(InspAct_Upd04_HdrR downR, InspAct_Upd04_HdrR r,
				MST_INSP_SCHD_R reSchdR) {
			// 上り電文をcloneして下り電文に設定すると、検査予定や検査指図のinnerRowも呼び出し元に下ってしまう。
			// その下り電文をそのまま上り電文に設定して再実行された場合、意図しない動作をするので、
			// 項目を明示して設定している。
			downR.insp_schd_no(reSchdR.insp_schd_no());
			downR.insp_freq(reSchdR.insp_freq());
			downR.src_no1(r.src_no1());
			downR.src_no2(r.src_no2());
			downR.src_no3(r.src_no3());
			downR.src_no4(r.src_no4());
			downR.insp_typ(r.insp_typ());
			downR.insp_mtd_typ(r.insp_mtd_typ());
			downR.insp_sts_typ(reSchdR.insp_schd_sts_typ());
			downR.insp_bind_typ(r.insp_bind_typ());
			downR.itm_cd(r.itm_cd());
			downR.itm_sub1(r.itm_sub1());
			downR.itm_sub2(r.itm_sub2());
			downR.itm_sub3(r.itm_sub3());
			downR.lot_no(r.lot_no());
			downR.sublot_no(r.sublot_no());
			downR.sno1(r.sno1());
			downR.sno1_mng_typ(r.sno1_mng_typ());
			downR.sno2(r.sno2());
			downR.sno2_mng_typ(r.sno2_mng_typ());
			downR.sno3(r.sno3());
			downR.sno3_mng_typ(r.sno3_mng_typ());
			downR.sno4(r.sno4());
			downR.sno4_mng_typ(r.sno4_mng_typ());
			downR.mfg_loc_cd(r.mfg_loc_cd());
			downR.sppl_cd(r.sppl_cd());
			downR.maker_cd(r.maker_cd());
			downR.to_site_cd(r.to_site_cd());
		}
	}
	/**
	 * InspAct_Del01オペレーション.<p>
	 *
	 * 検査実績または判定結果を取り消す。<br>
	 */
	public class InspAct_Del01 extends MSBFL_InspActService_MC_A.InspAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			createCache();
			createDtlCache();
			compData();
			updInspInst();
			delDtl();
			updDelInspAct();
			callThisUpd05();
			callIoActUpd01();
			callOrdUpd04();
			updInspSchd();
			callLotUpd05();
			callSloStsIns02();
			callPushNtc();
			setDown();
		}
		
		protected void updInspSchd() {
			// 検査予定を空更新する。
			dbUpdateKey("MSBFL5050_MST_INSP_SCHD_U05", _schdL, _schdL_bldr);
		}
		
		protected MCList<MST_INSP_SCHD_R> _schdL = MCList.create(MST_INSP_SCHD_R.class);
		protected MST_INSP_SCHD_R _schdL_t = MST_INSP_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCList<MST_INSP_INST_R> _instL = MCList.create(MST_INSP_INST_R.class);
		protected MST_INSP_INST_R _instL_t = MST_INSP_INST_R.create("T");
		protected MCQueryApiBuilder _instL_bldr = MCQueryApiBuilder.create(_instL_t);
		protected MCList<MST_INSP_ACT_R> _actL = MCList.create(MST_INSP_ACT_R.class);
		protected MST_INSP_ACT_R _actL_t = MST_INSP_ACT_R.create("T");
		protected MCQueryApiBuilder _actL_bldr = MCQueryApiBuilder.create(_actL_t);
		protected MCList<MST_INSP_STT_D_R> _sttdL = MCList.create(MST_INSP_STT_D_R.class);
		protected MST_INSP_STT_D_R _sttdL_t = MST_INSP_STT_D_R.create("T");
		protected MCQueryApiBuilder _sttdL_bldr = MCQueryApiBuilder.create(_sttdL_t);
		protected MCList<MST_INSP_ACT_D_R> _actdL = MCList.create(MST_INSP_ACT_D_R.class);
		protected MST_INSP_ACT_D_R _actdL_t = MST_INSP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _actdL_bldr = MCQueryApiBuilder.create(_actdL_t);
		protected MCList<MST_INSP_JUDG_D_R> _judgdL = MCList.create(MST_INSP_JUDG_D_R.class);
		protected MST_INSP_JUDG_D_R _judgdL_t = MST_INSP_JUDG_D_R.create("T");
		protected MCQueryApiBuilder _judgdL_bldr = MCQueryApiBuilder.create(_judgdL_t);
		protected MCList<InspAct_Del01_CndR> _updL = MCList.create(InspAct_Del01_CndR.class);
		protected MCList<InspAct_Del01_CndR> _delL = MCList.create(InspAct_Del01_CndR.class);
		
		protected MCIndexKey _schdIdx;
		protected MCIndexKey _instIdx;
		protected MCIndexKey _actIdx;
		protected MCIndexKey _actIdxKey;
		protected MCIndexKey _sttdIdx;
		protected MCIndexKey _actdIdx;
		protected MCIndexKey _judgdIdx;
		
		protected void createCache() {
			_schdL_bldr.setWhere(_schdL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S14", _schdL, _schdL_bldr, up0());
			_schdIdx = _schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			
			// 更新前の検査指図情報をキャッシュする。
			_instL_bldr.setWhere(_instL_t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_INST_S11", _instL, _instL_bldr, up0());
			_instIdx = _instL.createIndex(MST_INSP_INST_R.$insp_no);
			
			// 検査実績ヘッダ情報をキャッシュする。
			dbSelectKey("MSBFL5050_MST_INSP_ACT_S09", _actL, _actL_bldr, up0());
			_actIdx = _actL.createIndex(MST_INSP_ACT_R.$insp_no);
			_actIdxKey = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
		}
		
		protected void createDtlCache() {
			MCList<InspAct_Del01_CndR> isdBindL = MCList.create(InspAct_Del01_CndR.class);
			MCList<InspAct_Del01_CndR> iadBindL = MCList.create(InspAct_Del01_CndR.class);
			MCList<InspAct_Del01_CndR> ijdBindL = MCList.create(InspAct_Del01_CndR.class);
			
			for (InspAct_Del01_CndR r : up0()) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				
				if (isStr(instR.insp_sts_typ())) {
					isdBindL.add(r);
					iadBindL.add(r);
				}
				else if (isCmpl(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					isdBindL.add(r);
					iadBindL.add(r);
				}
				else if (isJudg(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					ijdBindL.add(r);
				}
			}
			
			if (!isdBindL.isEmpty()) {
				_sttdL_bldr.setWhere(_sttdL_t.insp_act_no.eq(bind("insp_act_no")));
				dbSelect("MSBFL5050_MST_INSP_STT_D_S06", _sttdL, _sttdL_bldr, isdBindL);
				_sttdIdx = _sttdL.createIndex(MST_INSP_STT_D_R.$insp_act_no);
			}
			if (!iadBindL.isEmpty()) {
				_actdL_bldr.setWhere(_actdL_t.insp_act_no.eq(bind("insp_act_no")));
				dbSelect("MSBFL5050_MST_INSP_ACT_D_S09", _actdL, _actdL_bldr, iadBindL);
				_actdIdx = _actdL.createIndex(MST_INSP_ACT_D_R.$insp_act_no);
			}
			if (!ijdBindL.isEmpty()) {
				_judgdL_bldr.setWhere(_judgdL_t.insp_act_no.eq(bind("insp_act_no")));
				dbSelect("MSBFL5050_MST_INSP_JUDG_D_S04", _judgdL, _judgdL_bldr, ijdBindL);
				_judgdIdx = _judgdL.createIndex(MST_INSP_JUDG_D_R.$insp_act_no);
			}
		}
		
		protected void compData() {
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t);
			smplL_bldr.setSelect(t.insp_act_no, t.insp_smpl_act_no, t.ac_dt);
			smplL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S08", smplL, smplL_bldr, up0());
			
			MCIndexKey smplIdx = smplL.createIndex(MST_INSP_SMPL_ACT_R.$insp_act_no);
			MCIndexKey dtlIdx = up1().createIndex(InspAct_Chk04_DtlR.$insp_act_no);
			MCIndexKey smplUpIdx = up2().createIndex(InspAct_Chk04_SmplR.$insp_act_no);
			
			MCList<InspAct_Chk04_DtlR> addDtlL = MCList.create(InspAct_Chk04_DtlR.class);
			MCList<InspAct_Chk04_SmplR> addSmplL = MCList.create(InspAct_Chk04_SmplR.class);
			
			for (InspAct_Del01_CndR hdrR : up0()) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, hdrR.insp_no());
				if (up1().subList(dtlIdx, hdrR.insp_act_no()).isEmpty()) {
					if (MSC_INSP_STS_TYP.isSTR(hdrR.insp_sts_typ())) {
						if (!MAC_INSP_MTD_TYP.isTTL(instR.insp_mtd_typ())) {
							for (MST_INSP_STT_D_R sttDR : _sttdL.subList(_sttdIdx, hdrR.insp_act_no())) {
								InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
								dtlR.insp_act_no(sttDR.insp_act_no());
								dtlR.can_ac_dt(sttDR.ac_dt());
								dtlR.setAttributes(hdrR);
								addDtlL.add(dtlR);
							}
						}
						else {
							for (MST_INSP_ACT_D_R actDR : _actdL.subList(_actdIdx, hdrR.insp_act_no())) {
								InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
								dtlR.insp_act_d_no(actDR.insp_act_d_no());
								dtlR.insp_act_no(actDR.insp_act_no());
								dtlR.can_ac_dt(actDR.ac_dt());
								dtlR.setAttributes(hdrR);
								addDtlL.add(dtlR);
							}

							// 検査実績明細が存在しない場合、検査着手明細から作成
							if (_actdL.subList(_actdIdx, hdrR.insp_act_no()).isEmpty()) {
								for (MST_INSP_STT_D_R sttDR : _sttdL.subList(_sttdIdx, hdrR.insp_act_no())) {
									InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
									dtlR.insp_act_no(sttDR.insp_act_no());
									dtlR.can_ac_dt(sttDR.ac_dt());
									dtlR.setAttributes(hdrR);
									addDtlL.add(dtlR);
								}
							}
						}
					}
					else if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())
							&& !MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ())) {
						for (MST_INSP_ACT_D_R actDR : _actdL.subList(_actdIdx, hdrR.insp_act_no())) {
							InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
							dtlR.insp_act_d_no(actDR.insp_act_d_no());
							dtlR.insp_act_no(actDR.insp_act_no());
							dtlR.can_ac_dt(actDR.ac_dt());
							dtlR.setAttributes(hdrR);
							addDtlL.add(dtlR);
						}
					}
					else if (MSC_INSP_STS_TYP.isJDG(hdrR.insp_sts_typ())
							&& (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ()))) {
						for (MST_INSP_JUDG_D_R judgDR : _judgdL.subList(_judgdIdx, hdrR.insp_act_no())) {
							InspAct_Chk04_DtlR dtlR = InspAct_Chk04_DtlR.create();
							dtlR.fix_no(judgDR.fix_no());
							dtlR.fix_no_typ(judgDR.fix_no_typ());
							dtlR.can_ac_dt(judgDR.ac_dt());
							dtlR.setAttributes(hdrR);
							addDtlL.add(dtlR);
						}	
					}
				}

				// 抜取検査を補完する
				if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ())) {
					continue;
				}
				if (MAC_INSP_MTD_TYP.isTTL(instR.insp_mtd_typ())) {
					continue;
				}
				if (up2().subList(smplUpIdx, hdrR.insp_act_no()).isEmpty()) {
					for (MST_INSP_SMPL_ACT_R smplActR : smplL.subList(smplIdx, hdrR.insp_act_no())) {
						InspAct_Chk04_SmplR smplR = InspAct_Chk04_SmplR.create();
						smplR.insp_smpl_act_no(smplActR.insp_smpl_act_no());
						smplR.insp_act_no(smplActR.insp_act_no());
						smplR.can_ac_dt(smplActR.ac_dt());
						smplR.setAttributes(hdrR);
						addSmplL.add(smplR);
					}
				}
			}
			
			up1().addAll(addDtlL);
			up2().addAll(addSmplL);
		}
		protected boolean isStr(String inspStsTyp) {
			return MSC_INSP_STS_TYP.isSTR(inspStsTyp);
		}
		
		protected boolean isCmpl(String inspStsTyp, String inspAprvStstyp) {
			return MSC_INSP_STS_TYP.isJDG(inspStsTyp)
					&& (isNull(inspAprvStstyp) || MSC_INSP_APRV_STS_TYP.isJUDG_OPN(inspAprvStstyp));
		}
		
		protected boolean isJudg(String inspStsTyp, String inspAprvStstyp) {
			return MSC_INSP_STS_TYP.isJDG(inspStsTyp)
					&& (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(inspAprvStstyp));
		}
		
		protected void updInspInst() {
			// 更新前の検査指図を後続処理でも使用するので、
			// ここでは更新前の検査指図をcloneして使用する。
			MCList<MST_INSP_INST_R> updInstL = MCList.create(MST_INSP_INST_R.class);
			MCList<MST_INSP_INST_R> instL = _instL.clone();
			
			for (InspAct_Del01_CndR r : up0()) {
				MST_INSP_INST_R instR = instL.clone().getFirst(MST_INSP_INST_R.$insp_no, r.insp_no());
				
				if (isStr(instR.insp_sts_typ())) {
					r.insp_sts_typ(MSC_INSP_STS_TYP.ORD.value());
					instR.insp_sts_typ(r.insp_sts_typ());
				}
				else if (isCmpl(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					r.insp_sts_typ(MSC_INSP_STS_TYP.ORD.value());
					instR.insp_sts_typ(r.insp_sts_typ());
					if (!isNull(instR.insp_aprv_sts_typ())) {
						r.insp_aprv_sts_typ(MSC_INSP_APRV_STS_TYP.INST_ACPT.value());
						instR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
					}
				}
				else if (isJudg(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					r.insp_aprv_sts_typ(MSC_INSP_APRV_STS_TYP.JUDG_OPN.value());
					instR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				}

				if (instR.insp_rslt_prnt_flg()) {
					instR.seq(instR.seq().add(MCNumber.ONE));
				}
				instR.insp_rslt_prnt_flg(false);
				instR.insp_rslt_prnt_tm(null);

				updInstL.add(instR);
			}

			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder updInstL_bldr = MCQueryApiBuilder.create(t);
			updInstL_bldr.setSet(t.insp_sts_typ);
			updInstL_bldr.addSet(t.insp_aprv_sts_typ);
			updInstL_bldr.addSet(t.insp_rslt_prnt_flg);
			updInstL_bldr.addSet(t.insp_rslt_prnt_tm);
			updInstL_bldr.addSet(t.seq);
			dbUpdateKey("MSBFL5050_MST_INSP_INST_U04", updInstL, updInstL_bldr);
		}
		
		protected void callLotUpd05() {
			MSBFL_LotService.Lot_Upd05 o = MSBFL_LotService.crtLot_Upd05();
			
			MCIndexKey updIdx = _updL.createIndex(InspAct_Del01_CndR.$insp_no);
			MCIndexKey delIdx = _delL.createIndex(InspAct_Del01_CndR.$insp_no);
			
			for (InspAct_Del01_CndR r : up0()) {
				Lot_Upd05_CndR oR = Lot_Upd05_CndR.create();
				boolean inspActFlg = false;
				boolean inspJudgFlg = false;
				
				InspAct_Del01_CndR tmp = _updL.getFirst(updIdx, r.insp_no());
				if (isNull(tmp)) {
					tmp = _delL.getFirst(delIdx, r.insp_no());
					inspActFlg = true;
				}
				else {
					inspJudgFlg = true;
				}
				
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				
				oR.insp_no(r.insp_no());
				oR.insp_typ(instR.insp_typ());
				oR.lmt_up_flg(instR.lmt_up_flg());
				oR.itm_cd(instR.itm_cd());
				oR.itm_sub1(instR.itm_sub1());
				oR.itm_sub2(instR.itm_sub2());
				oR.itm_sub3(instR.itm_sub3());
				oR.lot_no(instR.lot_no());
				oR.sublot_no(instR.sublot_no());
				oR.quality_typ(getQualityTyp(r, inspJudgFlg));
				oR.stk_insp_typ(getStkInspTyp(inspJudgFlg));
				oR.plnt_aprv_sts_typ(null);
				oR.insp_aprv_sts_typ(r.insp_aprv_sts_typ());
				oR.mrkt_judg_sts_typ(null);
				oR.lot_insp_schd_flg(false);
				oR.insp_inst_flg(false);
				oR.insp_inst_aprv_flg(false);
				oR.insp_act_flg(inspActFlg);
				oR.insp_judg_flg(inspJudgFlg);
				oR.plnt_aprv_flg(false);
				oR.mrkt_judg_flg(false);
				oR.setAttributes(r);
				
				o.up0().add(oR);
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected String getQualityTyp(InspAct_Del01_CndR r, boolean inspJudgFlg) {
			if (inspJudgFlg) {
				MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, r.insp_no());
				return actR.quality_typ();
			}
			return null;
		}
		
		protected String getStkInspTyp(boolean inspJudgFlg) {
			if (inspJudgFlg) {
				return MSC_STK_INSP_TYP.WAIT_JUDG.value();
			}
			return MSC_STK_INSP_TYP.YET.value();
		}
		
		protected void callSloStsIns02() {
			MSBBL_SloStsRegService.SloSts_Ins02 o = MSBBL_SloStsRegService.crtSloSts_Ins02();

			for (InspAct_Del01_CndR r : _delL) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdIdx, r.insp_no());
				
				SloSts_DtlR oR1 = SloSts_DtlR.create();
				oR1.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				oR1.slo_sts_typ(MSC_SLO_STS_TYP.INSP_ST.value());
				oR1.insp_no(r.insp_no());
				oR1.insp_act_no(r.insp_act_no());
				oR1.itm_cd(instR.itm_cd());
				oR1.itm_sub1(instR.itm_sub1());
				oR1.itm_sub2(instR.itm_sub2());
				oR1.itm_sub3(instR.itm_sub3());
				oR1.sno1(schdR.sno1());
				oR1.sno2(schdR.sno2());
				oR1.sno3(schdR.sno3());
				oR1.sno4(schdR.sno4());
				o.up0().add(oR1);
				
				if (MSC_INSP_STS_TYP.isJDG(instR.insp_sts_typ())) {
					SloSts_DtlR oR2 = oR1.clone();
					oR2.slo_sts_typ(MSC_SLO_STS_TYP.INSP_CMPL.value());
					o.up0().add(oR2);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {

			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			MCIndexKey actIdxkey = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (InspAct_Del01_CndR r : up0()) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				
				if (instR.insp_aprv_flg() && isCmpl(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					MST_INSP_ACT_R actR = _actL.getFirst(_actIdx, r.insp_no());
					if (!isNull(actR)) {
						instR.end_tm(actR.end_tm().trunc(MCDateFieldType.DAY));
					}
					instL.add(instR);
				}
				else if (isJudg(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					MST_INSP_ACT_R actR = _actL.getFirst(actIdxkey, r.insp_act_no());
					if (!isNull(actR)) {
						actL.add(actR);
					}
				}
			}

			MCIndexKey idxkey = actL.createIndex(MST_INSP_ACT_R.$act_dpt_cd, MST_INSP_ACT_R.$judg_dt);
			for (MST_INSP_ACT_R actR : actL.groupBy(MST_INSP_ACT_R.$act_dpt_cd, MST_INSP_ACT_R.$judg_dt)) {
				int cnt = actL.subList(idxkey, actR.act_dpt_cd(), actR.judg_dt()).size();
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_JUDG_RESULT);
				info.setMsg(new MCMessage(MSBFL0093, cnt));
				info.addDpt(actR.act_dpt_cd(), nvl(actR.judg_dt(), getToday()));
				info.addScrBind(MSC_INSP_ACT_LIST_REG_OPE.OPE_REF.value(), false, false, true, MSC_INSP_APRV_STS_TYP.JUDG_OPN.value(), null, null, toYMDHMSString(getToday()), toYMDHMSString(getToday().endTimeOfDay()));

				mgr.exec();
			}

			idxkey = instL.createIndex(MST_INSP_INST_R.$insp_aprv_role_cd, MST_INSP_INST_R.$end_tm);
			for (MST_INSP_INST_R instR : instL.groupBy(MST_INSP_INST_R.$insp_aprv_role_cd, MST_INSP_INST_R.$end_tm)) {
				int cnt = instL.subList(idxkey, instR.insp_aprv_role_cd(), instR.end_tm()).size();
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.INSP_JUDG_RQST);
				info.setMsg(new MCMessage(MSBFL0091, cnt));
				info.addAprvRole(instR.insp_aprv_role_cd(), nvl(instR.end_tm(), getToday()));
				mgr.exec();
			}
		}

		protected void delDtl() {
			MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
			MCList<InspAct_Del01_CndR> delIsdBindL = MCList.create(InspAct_Del01_CndR.class);
			MCList<InspAct_Del01_CndR> delIadBindL = MCList.create(InspAct_Del01_CndR.class);
			MCList<InspAct_Del01_CndR> delIjdBindL = MCList.create(InspAct_Del01_CndR.class);
			
			for (InspAct_Del01_CndR r : up0()) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				
				if (isStr(instR.insp_sts_typ())) {
					delIsdBindL.add(r);
					delIadBindL.add(r);
				}
				else if (isCmpl(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					delIsdBindL.add(r);
					delIadBindL.add(r);
				}
				else if (isJudg(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					delIjdBindL.add(r);
				}
			}
			
			if (!delIsdBindL.isEmpty()) {
				o.up0().addAll(delInspSttD(delIsdBindL));
			}
			if (!delIadBindL.isEmpty()) {
				o.up0().addAll(delInspActD(delIadBindL));
			}
			if (!delIjdBindL.isEmpty()) {
				o.up0().addAll(delInspJudgD(delIjdBindL));
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected MCList<IoAct_Ins01_DtlR> delInspSttD(MCList<InspAct_Del01_CndR> bindL) {
			// 検査着手明細の取消の受払実績を返す
			MCList<IoAct_Ins01_DtlR> rtnIoActL = MCList.create(IoAct_Ins01_DtlR.class);
			MCList<MST_INSP_STT_D_R> delSttdL = MCList.create(MST_INSP_STT_D_R.class);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk04_DtlR.$insp_act_no);
			
			for (InspAct_Del01_CndR bindR : bindL) {
				MCList<MST_INSP_STT_D_R> sttdL = _sttdL.subList(_sttdIdx, bindR.insp_act_no());
				delSttdL.addAll(sttdL);
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, bindR.insp_no());
				
				for (MST_INSP_STT_D_R sttdR : sttdL) {
					MCList<InspAct_Chk04_DtlR> up1L = up1().subList(idxkey, sttdR.insp_act_no());
					IoAct_Ins01_DtlR rtnR = IoAct_Ins01_DtlR.create();
					rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					rtnR.can_ac_dt(getSttDCanAcDt(sttdR.ac_dt(),
							(MCDate) up1L.min(InspAct_Chk04_DtlR.$can_ac_dt),
							instR.insp_sts_typ(), instR.insp_mtd_typ()));
					rtnR.act_d_no(sttdR.insp_stt_d_no());
					rtnR.trn_typ(MSC_TRN_TYP.INSP_STT.value());
					rtnIoActL.add(rtnR);
				}
			}
			
			if (!delSttdL.isEmpty()) {
				MCQueryApiBuilder delSttdL_bldr = MCQueryApiBuilder.create(MST_INSP_STT_D_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_STT_D_D02", delSttdL, delSttdL_bldr);
				return rtnIoActL;
			}
			else {
				return null;
			}
		}
		
		protected MCList<IoAct_Ins01_DtlR> delInspActD(MCList<InspAct_Del01_CndR> bindL) {
			// 検査実績明細の取消の受払実績を返す
			MCList<IoAct_Ins01_DtlR> rtnIoActL = MCList.create(IoAct_Ins01_DtlR.class);
			MCList<MST_INSP_ACT_D_R> delactdL = MCList.create(MST_INSP_ACT_D_R.class);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk04_DtlR.$insp_act_d_no);
			
			for (InspAct_Del01_CndR bindR : bindL) {
				MCList<MST_INSP_ACT_D_R> actdL = _actdL.subList(_actdIdx, bindR.insp_act_no());
				delactdL.addAll(actdL);
				
				for (MST_INSP_ACT_D_R actdR : actdL) {
					InspAct_Chk04_DtlR up1R = up1().getFirst(idxkey, actdR.insp_act_d_no());
					IoAct_Ins01_DtlR rtnR = IoAct_Ins01_DtlR.create();
					rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					rtnR.can_ac_dt(up1R.can_ac_dt());
					rtnR.act_d_no(actdR.insp_act_d_no());
					rtnR.trn_typ(MSC_TRN_TYP.INSP_ACT.value());
					rtnIoActL.add(rtnR);
				}
			}
			
			if (!delactdL.isEmpty()) {
				MCQueryApiBuilder delactdL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_D_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_ACT_D_D02", delactdL, delactdL_bldr);
				return rtnIoActL;
			}
			else {
				return null;
			}
		}
		
		protected MCList<IoAct_Ins01_DtlR> delInspJudgD(MCList<InspAct_Del01_CndR> bindL) {
			// 検査判定明細の取消の受払実績を返す
			MCList<IoAct_Ins01_DtlR> rtnIoActL = MCList.create(IoAct_Ins01_DtlR.class);
			MCList<IoAct_Ins01_DtlR> tmpRtnIoActL = MCList.create(IoAct_Ins01_DtlR.class);
			MCList<MST_INSP_JUDG_D_R> delJudgdL = MCList.create(MST_INSP_JUDG_D_R.class);
			MCIndexKey idxkey = up1().createIndex(InspAct_Chk04_DtlR.$fix_no, InspAct_Chk04_DtlR.$fix_no_typ);
			
			for (InspAct_Del01_CndR bindR : bindL) {
				MCList<MST_INSP_JUDG_D_R> judgdL = _judgdL.subList(_judgdIdx, bindR.insp_act_no());
				delJudgdL.addAll(judgdL);
				
				for (MST_INSP_JUDG_D_R judgdR : judgdL) {
					MST_INSP_ACT_R actR = _actL.getFirst(_actIdxKey, judgdR.insp_act_no());
					MCList<InspAct_Chk04_DtlR> up1L = up1().subList(idxkey, judgdR.fix_no(), judgdR.fix_no_typ());
					if (!isNull(actR) && MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
						MCIndexKey arrYieldIdx = _schdL.createIndex(MST_INSP_SCHD_R.$insp_typ, MST_INSP_SCHD_R.$src_no4);
						
						MST_INSP_SCHD_R schdR = MST_INSP_SCHD_R.create();
						if (MSC_FIX_NO_TYP.isARR_ACT_NO(judgdR.fix_no_typ())) {
							schdR = _schdL.getFirst(arrYieldIdx, MSC_INSP_TYP.ACCPT.value(), judgdR.fix_no());
						}
						else if (MSC_FIX_NO_TYP.isYIELD_ACT_NO(judgdR.fix_no_typ())) {
							schdR = _schdL.getFirst(arrYieldIdx, MSC_INSP_TYP.PRDCT.value(), judgdR.fix_no());
						}
						else if (MSC_FIX_NO_TYP.isINSP_SCHD_NO(judgdR.fix_no_typ())) {
							schdR = _schdL.getFirst(MST_INSP_SCHD_R.$insp_schd_no, judgdR.fix_no());
						}
						
						MST_INSP_SCHD_R reSchdR = MST_INSP_SCHD_R.create();
						MST_INSP_SCHD_R reSchdR_t = MST_INSP_SCHD_R.create("T");
						MCQueryApiBuilder reSchdR_bldr = MCQueryApiBuilder.create(reSchdR_t);
						reSchdR_bldr.setWhere(reSchdR_t.own_insp_schd_no.eq(bind("insp_schd_no")));
						dbSelect("MSBFL5050_MST_INSP_SCHD_S15", reSchdR, reSchdR_bldr, schdR);
						
						IoAct_Ins01_DtlR rtnR = IoAct_Ins01_DtlR.create();
						rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						rtnR.can_ac_dt((MCDate)up1L.min(InspAct_Chk04_DtlR.$can_ac_dt));
						rtnR.act_no(reSchdR.insp_schd_no());
						rtnR.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
						tmpRtnIoActL.add(rtnR);
					}
					else {
						IoAct_Ins01_DtlR rtnR = IoAct_Ins01_DtlR.create();
						rtnR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						rtnR.can_ac_dt((MCDate)up1L.min(InspAct_Chk04_DtlR.$can_ac_dt));
						rtnR.act_d_no(judgdR.insp_judg_d_no());
						rtnR.trn_typ(MSC_TRN_TYP.INSP_JUDG.value());
						rtnIoActL.add(rtnR);
					}
				}
				
				if (!tmpRtnIoActL.isEmpty()) {
					String[] keys = {IoAct_Ins01_DtlR.$data_crud_typ,
							IoAct_Ins01_DtlR.$can_ac_dt,
							IoAct_Ins01_DtlR.$act_no,
							IoAct_Ins01_DtlR.$trn_typ
							};
					
					rtnIoActL.addAll(tmpRtnIoActL.groupBy(keys));
					tmpRtnIoActL.clear();
				}
			}
			
			if (!delJudgdL.isEmpty()) {
				MCQueryApiBuilder delJudgdL_bldr = MCQueryApiBuilder.create(MST_INSP_JUDG_D_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_JUDG_D_D02", delJudgdL, delJudgdL_bldr);
				return rtnIoActL;
			}
			else {
				return null;
			}
		}
		
		protected void updDelInspAct() {
			for (InspAct_Del01_CndR r : up0()) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				
				if (isStr(instR.insp_sts_typ())
						|| isCmpl(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					_delL.add(r);
				}
				else if (isJudg(instR.insp_sts_typ(), instR.insp_aprv_sts_typ())) {
					_updL.add(r);
				}
			}
			
			if (!_delL.isEmpty()) {
				delInspActAndSmplAct(_delL);
				delPlntAprv(_delL);
			}
			if (!_updL.isEmpty()) {
				updInspAct(_updL);
				delReInspSchd(_updL);
				delPlntAprv(_updL);
			}
		}
		
		protected void delInspActAndSmplAct(MCList<InspAct_Del01_CndR> delL) {
			delSmplAct(delL, false);
			delInspAct(delL);
		}
		
		protected void delSmplAct(MCList<InspAct_Del01_CndR> delL, boolean judgFlg) {
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t);
			smplL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S09", smplL, smplL_bldr, delL);
			
			if (!smplL.isEmpty()) {
				// 引落している場合は受払実績を取り消す必要がある。
				MCList<MST_INSP_SMPL_ACT_R> delIoSmplL = smplL.clone().subList(MST_INSP_SMPL_ACT_R.$so_cmpl_flg, true);
				
				dbDeleteKey("MSBFL5050_MST_INSP_SMPL_ACT_D02", smplL, smplL_bldr);
				
				if (!delIoSmplL.isEmpty()) {
					MCIndexKey idxkey = up2().createIndex(InspAct_Chk04_SmplR.$insp_smpl_act_no);
					MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
					for (MST_INSP_SMPL_ACT_R r : delIoSmplL) {
						InspAct_Chk04_SmplR smplUpR = up2().getFirst(idxkey, r.insp_smpl_act_no());
						IoAct_Ins01_DtlR oR = IoAct_Ins01_DtlR.create();
						oR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						oR.can_ac_dt(smplUpR.can_ac_dt());
						oR.act_d_no(r.insp_smpl_act_no());
						oR.trn_typ(MSC_TRN_TYP.INSP_SMPL.value());
						o.up0().add(oR);
					}
					
					if (!o.up0().isEmpty()) {
						o.exec();
					}
				}
			}
		}
		
		protected void delReInspSchd(MCList<InspAct_Del01_CndR> hdrL) {
			// 再検査の受払実績削除については、
			// 検査判定明細削除時に行っているので、ここでは行わない。
			MCList<InspAct_Del01_CndR> reHdrL = MCList.create(InspAct_Del01_CndR.class);
			for (InspAct_Del01_CndR r : hdrL) {
				MST_INSP_ACT_R actR = _actL.getFirst(_actIdxKey, r.insp_act_no());
				if (!isNull(actR) && MSC_INSP_JUDG_RSLT_TYP.isRE(actR.insp_judg_rslt_typ())) {
					reHdrL.add(r);
				}
			}
			
			if (!reHdrL.isEmpty()) {
				MCList<MST_INSP_SCHD_R> reSchdL = getReSchd(reHdrL);
				MCQueryApiBuilder reSchdL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
				dbDeleteKey("MSBFL5050_MST_INSP_SCHD_D01", reSchdL, reSchdL_bldr);
				delReInspIoSchd(reSchdL);
				updLatestFlg(reHdrL);
			}
		}
		
		protected MCList<MST_INSP_SCHD_R> getReSchd(MCList<InspAct_Del01_CndR> hdrL) {
			MCList<MST_INSP_INST_R> instL = MCList.create(MST_INSP_INST_R.class);
			for (InspAct_Del01_CndR r : hdrL) {
				MST_INSP_INST_R instR = _instL.getFirst(_instIdx, r.insp_no());
				instL.add(instR);
			}
			
			MCList<MST_INSP_SCHD_R> reSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder reSchdL_bldr = MCQueryApiBuilder.create(t);
			reSchdL_bldr.setWhere(t.own_insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S16", reSchdL, reSchdL_bldr, instL);
			
			return reSchdL;
		}
		
		protected void updLatestFlg(MCList<InspAct_Del01_CndR> hdrL) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			for (InspAct_Del01_CndR r : hdrL) {
				MCList<MST_INSP_SCHD_R> tmpL = _schdL.subList(_schdIdx, r.insp_no());
				schdL.addAll(tmpL);
			}
			
			schdL.setBoolean(MST_INSP_SCHD_R.$latest_flg, true);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSet(t.latest_flg);
			dbUpdateKey("MSBFL5050_MST_INSP_SCHD_U06", schdL, schdL_bldr);
		}
		
		protected void delReInspIoSchd(MCList<MST_INSP_SCHD_R> schdL) {
			// 再検査の受払予定の削除
			MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
			addAll(o.up0(), schdL, createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR()); //検査完了入庫
			addAll(o.up0(), schdL, createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI()); //検査完了出庫
			o.exec();
		}
		
		protected Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR<MSW_IO_SCHD_DEL_R,MST_INSP_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR<MSW_IO_SCHD_DEL_R, MST_INSP_SCHD_R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GR<D extends MSW_IO_SCHD_DEL_R, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_INSP_SCHD_R.$insp_schd_no); //受払予定ＮＯは検査予定ＮＯ
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value()); //受払予定区分は「検査完了入庫」固定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value()); //受払予定状況区分は「検査待」固定
			}
		}

		protected Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI<MSW_IO_SCHD_DEL_R,MST_INSP_SCHD_R> createMap_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI() {
			return new Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI<MSW_IO_SCHD_DEL_R, MST_INSP_SCHD_R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MST_INSP_SCHD_R_GI<D extends MSW_IO_SCHD_DEL_R, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_INSP_SCHD_R.$insp_schd_no); //受払予定ＮＯは検査予定ＮＯ
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INSP_CMPL_GI.value()); //受払予定区分は「検査完了出庫」固定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.YET.value()); //受払予定状況区分は「検査待」固定
			}
		}

		protected void delPlntAprv(MCList<InspAct_Del01_CndR> hdrL) {
			MSBFL_PlntAprvService.PlntAprv_Upd01 o = MSBFL_PlntAprvService.crtPlntAprv_Upd01();
			
			MCList<MST_INSP_SCHD_R> isL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(t1);
			isL_bldr.setWhere(t1.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S17", isL, isL_bldr, up0());
			
			MCList<MST_PLNT_APRV_D_R> padL = MCList.create(MST_PLNT_APRV_D_R.class);
			MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder padL_bldr = MCQueryApiBuilder.create(t2);
			padL_bldr.setWhere(t2.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_PLNT_APRV_D_S03", padL, padL_bldr, up0());
			
			MCIndexKey actIdx = _actL.createIndex(MST_INSP_ACT_R.$insp_act_no);
			for (InspAct_Del01_CndR r : hdrL) {
				MST_INSP_INST_R iiR = _instL.getFirst(_instIdx, r.insp_no());
				MST_INSP_ACT_R actR = _actL.getFirst(actIdx, r.insp_act_no());
				
				if (!isPlntAprv(r, iiR)) {
					continue;
				}
				
				MCList<MST_PLNT_APRV_D_R> subPadL = padL.subList(MST_INSP_SCHD_R.$insp_no, r.insp_no());
				
				for (MST_PLNT_APRV_D_R padR : subPadL) {
					PlntAprv_Chk01_RsltR oR = PlntAprv_Chk01_RsltR.create();
					
					oR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					oR.plnt_aprv_no(padR.plnt_aprv_no());
					oR.plnt_aprv_d_no(padR.plnt_aprv_d_no());
					if (!isNull(actR)) {
						oR.insp_act_end_tm(actR.end_tm().trunc(MCDateFieldType.DAY));
						oR.insp_act_judg_dt(actR.judg_dt());
					}
					oR.setAttributes(r);
					
					o.up0().add(oR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected boolean isPlntAprv(InspAct_Del01_CndR r, MST_INSP_INST_R iiR) {
			if (!iiR.plnt_aprv_flg()) {
				return false;
			}
			return true;
		}
		
		protected void delInspAct(MCList<InspAct_Del01_CndR> delL) {
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			
			for (InspAct_Del01_CndR r : delL) {
				MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
				actR.insp_act_no(r.insp_act_no());
				actL.add(actR);
			}

			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(MST_INSP_ACT_R.create("T"));
			dbDeleteKey("MSBFL5050_MST_INSP_ACT_D01", actL, actL_bldr);
		}
		
		protected void updInspAct(MCList<InspAct_Del01_CndR> updL) {
			MCList<MST_INSP_ACT_R> actL = MCList.create(MST_INSP_ACT_R.class);
			
			for (InspAct_Del01_CndR r : updL) {
				MST_INSP_ACT_R actR = MST_INSP_ACT_R.create();
				actR.insp_act_no(r.insp_act_no());
				actR.judg_dt(null);
				actR.insp_judg_rslt_typ(null);
				actR.judg_dpt_cd(null);
				actR.judg_usr_cd(null);
				actR.judg_rsn(r.judg_rsn());
				actL.add(actR);
			}
			
			if (!actL.isEmpty()) {
				MST_INSP_ACT_R t = MST_INSP_ACT_R.create("T");
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
				actL_bldr.setSet(t.judg_dt);
				actL_bldr.addSet(t.insp_judg_rslt_typ);
				actL_bldr.addSet(t.judg_dpt_cd);
				actL_bldr.addSet(t.judg_usr_cd);
				actL_bldr.addSet(t.judg_rsn);
				dbUpdateKey("MSBFL5050_MST_INSP_ACT_U05", actL, actL_bldr);
			}
		}
		
		protected void callIoActUpd01() {
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
			o.exec();
		}

		protected void callOrdUpd04() {
			MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
			
			for (InspAct_Del01_CndR r : up0()) {
				MCList<MST_ITM_ORDER_R> ioL = MCList.create(MST_ITM_ORDER_R.class);

				// up0にinsp_typが存在しないため、検査予定を１件取得。※同一検査ＮＯを持つ検査予定に検査種類区分は混在しない。
				MST_INSP_SCHD_R schdR = _schdL.getFirst(_schdIdx, r.insp_no());
				if (isNull(schdR)) {
					continue;
				}
				
				if (MSC_INSP_TYP.isLOT(schdR.insp_typ()) || MSC_INSP_TYP.isPRCD(schdR.insp_typ())) {
					continue;
				}
				else {
					MCList<MST_INSP_SCHD_R> schdL = _schdL.subList(_schdIdx, r.insp_no());

					MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
					MCQueryApiBuilder ioL_bldr = MCQueryApiBuilder.create(t);
					if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
						ioL_bldr.setSelect(t.itm_ord_no);
						ioL_bldr.addSelect(t.itm_ord_typ);
						ioL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
						dbSelect("MSBFL5050_MST_ITM_ORDER_S03", ioL, ioL_bldr,
								schdL.groupBy(MST_INSP_SCHD_R.$itm_ord_no));
					}
					else if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
						MST_PO_SCHD_R t1 = MST_PO_SCHD_R.create("T1");
						MST_INSP_SCHD_R t2 = MST_INSP_SCHD_R.create("T2");
						ioL_bldr.setSelect(t.itm_ord_no);
						ioL_bldr.addSelect(t.itm_ord_typ);
						ioL_bldr.addLeftOuterJoin(t1, t.itm_ord_no.eq(t1.pln_itm_ord_no));
						ioL_bldr.addLeftOuterJoin(t2, t1.po_d_no.eq(t2.src_no1));
						ioL_bldr.setWhere(t2.insp_schd_no.eq(bind("insp_schd_no")));
						dbSelect("MSBFL5050_MST_ITM_ORDER_S04", ioL, ioL_bldr, schdL);
					}
				}
				
				if (!ioL.isEmpty()) {
					for (MST_ITM_ORDER_R ioR : ioL) {
						Ord_Upd04_DtlR oR = Ord_Upd04_DtlR.create();
						oR.itm_ord_no(ioR.itm_ord_no());
						oR.itm_ord_typ(ioR.itm_ord_typ());
						oR.setAttributes(r);
						o.up0().add(oR);
					}
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		/*
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			// 定数名設定
			putNames();
			down0().setAll(up0());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_INSP_STS_TYP.putNameNE(up0(), InspAct_Del01_CndR.$insp_sts_typ, InspAct_Del01_CndR.$insp_sts_typ_nm, getUsrLocale());
			MSC_INSP_APRV_STS_TYP.putNameNE(up0(), InspAct_Del01_CndR.$insp_aprv_sts_typ, InspAct_Del01_CndR.$insp_aprv_sts_typ_nm, getUsrLocale());
		}
		/**
		 * 仕入実績を登録する
		 */
		protected void callThisUpd05() {
			MSBFL_InspActService.InspAct_Upd05 o = MSBFL_InspActService.crtInspAct_Upd05();

			addAll(o.up0(), up0(), createMap_InspAct_Upd05_HdrR_InspAct_Del01_CndR());

			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected Map_InspAct_Upd05_HdrR_InspAct_Del01_CndR<InspAct_Upd05_HdrR,InspAct_Del01_CndR> createMap_InspAct_Upd05_HdrR_InspAct_Del01_CndR() {
			return new Map_InspAct_Upd05_HdrR_InspAct_Del01_CndR<InspAct_Upd05_HdrR, InspAct_Del01_CndR>();
		}

		public class Map_InspAct_Upd05_HdrR_InspAct_Del01_CndR<D extends InspAct_Upd05_HdrR, S extends InspAct_Del01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd05_HdrR.$peg_no, InspAct_Del01_CndR.$peg_no);

			}
		}
	}

	protected boolean isUpdOrDel(String dataCrudTyp) {
		if (MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp) || MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)) {
			return true;
		}
		return false;
	}
	protected MCDate getSttDCanAcDt(MCDate oldAcDt, MCDate upCanAcDt, String oldInspStsTyp, String inspMtdTyp) {
		if (getStkClYm().gte(getAcYm(oldAcDt))) {
			// 締済の場合、締後の実績訂正を可能とするため、上り電文の取消計上日を返す。
			// 上り電文の取消計上日が未設定の場合、訂正前の値を設定
			return nvl(upCanAcDt, oldAcDt);
		}
		else {
			// 未締の場合
			if (MAC_INSP_MTD_TYP.isTTL(inspMtdTyp) || MSC_INSP_STS_TYP.isJDG(oldInspStsTyp)) {
				// 以下の場合、検査実績登録画面上に表示されている取消計上日の初期値は、着手明細ではなく実績明細の計上日となる。
				// ・抜取かつ更新前の検査状況が完了の場合
				// ・全数の場合
				// この場合は、実績明細の計上日で検査着手の受払実績の取消伝票を作らないようにするために、
				// DBからselectした値を返す
				return oldAcDt;
			}
			else {
				// 抜取かつ更新前の検査状況が着手中の場合
				// 検査実績登録画面上に表示されている取消計上日の初期値は、着手明細の計上日である。
				// そのため、上り電文の値を返す。
				return upCanAcDt;
			}
		}
	}
	protected void copyErrFlgByInspNo(MCList dest, MCList src, String dest_insp_no_col, String src_insp_no_col) {
		if (!dest.createRow().contains(dest_insp_no_col)) {
			return;
		}
		MCIndexKey k = dest.createIndex(dest_insp_no_col);
		for (int i = 0; i < src.size(); i++)  {
			MCRow srcRow = src.get(i);
			if (!srcRow.getBoolean("err_flg")) {
				continue;
			}
			MCList destSub = dest.subList(k, srcRow.getString(src_insp_no_col));
			for (int j = 0; j < destSub.size(); j++)  {
				MCRow destRow = destSub.get(j);
				copyErrFlg(destRow, srcRow);
			}
		}
	}
	/**
	 * InspAct_Chk03オペレーション.<p>
	 *
	 * 検査時に仕入実績を同時計上する場合に、仕入実績登録サービスのチェックを実行する。登録・訂正前チェック、判定可能チェック、取消可能チェックから呼ばれる。<br>
	 */
	public class InspAct_Chk03 extends MSBFL_InspActService_MC_A.InspAct_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			editUp();
			callPurcChk03();
			setDown();
		}

		protected FXUCL_Cache<MST_ARR_ACT_R> _arrActCache;

		protected FXUCL_Cache<MST_ARR_SCHD_R> _arrSchdCache;

		protected FXUCL_Cache<MST_PURC_SCHD_R> _purcSchdCache;

		protected FXUCL_Cache<MST_PO_D_R> _podCache;

		protected FXUCL_Cache<MST_PO_R> _poCache;

		protected FXUCL_Cache<MST_ARR_SCHD_R> _arrSchdByActCache;

		protected FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>> _purcActIoByInspActDNoCache;

		protected FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>> _purcActIoByInspJudgDNoCache;

		protected FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>> _purcActIoByInspActNoCache;

		protected FXUCL_Cache<MST_PURC_ACT_R> _purcActCache;

		protected FXUCL_Cache<MCList<MST_PURC_ACT_D_R>> _purcActDByPurcActNoCache;

		protected FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>> _purcActIoByPurcActDNoCache;

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;

		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;

		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;

		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache;

		protected FXUCL_Cache<MCList<InspAct_Chk03_PackXfrR>> _packXfrQtyCache;
		
		protected MCList<InspAct_Chk03_PurcActNoR> _purcActNoL;

		protected MCIndexKey _purcActDNoKey;

		protected MCIndexKey _purcActIoNoKey;

		protected MCIndexKey _hdrKey;

		protected MCIndexKey _dtlKey;

		protected MCIndexKey _inspActNoKey;

		protected MCIndexKey _inspActDNoKey;

		protected MCIndexKey _inspJudgDNoKey;

		protected MCNumber _dtlPegNo;

		protected MCNumber _purcHdrPegNo;

		protected MCNumber _purcDtlPegNo;
		
		protected MCList<InspAct_Chk03_DtlR> _addDtlL;

		protected static final String PO_D_NO_COL = "__po_d_no__";

		protected static final String ARR_SCHD_NO_COL = "__arr_schd_no__";

		protected static final String PURC_DT_COL = "__purc_dt__";

		protected static final String AC_DT_COL = "__ac_dt__";

		protected static final String UTIL_HDR_PEG_NO_COL = "__util_hdr_peg_no__";

		protected static final String PO_NO_COL = "__po_no__";

		protected static final String INSP_NO_COL = "__insp_no__";

		protected static final String INSP_ACT_D_NO_COL = "__insp_act_d_no__";

		protected static final String INSP_JUDG_D_NO_COL = "__insp_judg_d_no__";

		protected static final String INSP_ACT_NO_COL = "__insp_act_no__";

		protected void editUp() {
			_hdrKey = up0().createIndex(InspAct_Chk03_HdrR.$peg_no);
			
			// 処理中の明細行の追加時に紐付けＮＯをインクリメントするため、最大の明細紐付けＮＯを保持
			_dtlPegNo = up1().isEmpty() ? MCNumber.ZERO : (MCNumber) up1().max(InspAct_Chk03_DtlR.$peg_no);
			
			// 仕入実績ヘッダ、仕入実績明細に設定する紐付けＮＯを初期化（仕入実績受払には上記の明細紐付けＮＯを使用）
			_purcHdrPegNo = MCNumber.ZERO;
			_purcDtlPegNo = MCNumber.ZERO;
			
			// ヘッダ、明細の紐付けＮＯと仕入実績ＮＯ、仕入実績明細ＮＯ、仕入実績受払ＮＯを紐付けるためのリストを初期化
			_purcActNoL = MCList.create(InspAct_Chk03_PurcActNoR.class);

			// 削除（Chk04）から呼ばれた場合は明細のレコードを補完する
			compDelDtl();
			
			// 明細が存在しない（検査中ロット使用許可）場合は明細のレコードを補完する
			compInPrmtDtl();
			
			// 明細の元紐付けＮＯに紐付けＮＯを設定する
			setOrgPegNo();
		}

		/**
		 * 明細紐付けＮＯをインクリメントして返す
		 */
		protected MCNumber getDtlPegNo() {
			_dtlPegNo = _dtlPegNo.add(MCNumber.ONE);
			return _dtlPegNo;
		}
		
		/**
		 * 仕入実績ヘッダに設定する紐付けＮＯをインクリメントして返す
		 */
		protected MCNumber getPurcHdrPegNo() {
			_purcHdrPegNo = _purcHdrPegNo.add(MCNumber.ONE);
			return _purcHdrPegNo;
		}
		
		/**
		 * 仕入実績明細に設定する紐付けＮＯをインクリメントして返す
		 */
		protected MCNumber getPurcDtlPegNo() {
			_purcDtlPegNo = _purcDtlPegNo.add(MCNumber.ONE);
			return _purcDtlPegNo;
		}
		
		/**
		 * 削除時は上り電文の明細が設定されないため、テーブルから補完する
		 */
		protected void compDelDtl() {
			MCList<InspAct_Chk03_HdrR> delHdrL = up0().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (delHdrL.isEmpty()) {
				return;
			}
			MCIndexKey idx = delHdrL.createIndex(InspAct_Chk03_HdrR.$insp_act_no);

			MCList<InspAct_Chk03_DtlR> delDtlL = MCList.create(InspAct_Chk03_DtlR.class);
			
			// 実績取消時に呼ばれた場合は検査実績明細を取得
			MCList<MST_INSP_ACT_D_R> actL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R t1 = MST_INSP_ACT_D_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1);
			actL_bldr.setWhere(t1.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_ACT_D_S10", actL, actL_bldr, delHdrL.subList(r -> !r.judg_flg()));

			for (MST_INSP_ACT_D_R dbR : actL) {
				InspAct_Chk03_DtlR dtlR = InspAct_Chk03_DtlR.create();
				InspAct_Chk03_HdrR hdrR = delHdrL.getFirst(idx, dbR.insp_act_no());
				dtlR.peg_no(getDtlPegNo());
				dtlR.hdr_peg_no(hdrR.peg_no());
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dtlR.insp_act_d_no(dbR.insp_act_d_no());
				dtlR.can_ac_dt(dbR.ac_dt());
				dtlR.itm_cd(dbR.itm_cd());
				dtlR.itm_sub1(dbR.itm_sub1());
				dtlR.itm_sub2(dbR.itm_sub2());
				dtlR.itm_sub3(dbR.itm_sub3());
				dtlR.pack_unit_cd(dbR.pack_unit_cd());
				delDtlL.add(dtlR);
			}

			// 判定取消時に呼ばれた場合は検査判定明細を取得
			MCList<MST_INSP_JUDG_D_R> judgL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t2 = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder judgL_bldr = MCQueryApiBuilder.create(t2);
			judgL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL5050_MST_INSP_JUDG_D_S05", judgL, judgL_bldr, delHdrL.subList(r -> r.judg_flg()));
			
			for (MST_INSP_JUDG_D_R dbR : judgL) {
				InspAct_Chk03_DtlR dtlR = InspAct_Chk03_DtlR.create();
				InspAct_Chk03_HdrR hdrR = delHdrL.getFirst(idx, dbR.insp_act_no());
				dtlR.peg_no(getDtlPegNo());
				dtlR.hdr_peg_no(hdrR.peg_no());
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dtlR.insp_judg_d_no(dbR.insp_judg_d_no());
				dtlR.can_ac_dt(dbR.ac_dt());
				dtlR.itm_cd(dbR.itm_cd());
				dtlR.itm_sub1(dbR.itm_sub1());
				dtlR.itm_sub2(dbR.itm_sub2());
				dtlR.itm_sub3(dbR.itm_sub3());
				dtlR.pack_unit_cd(dbR.pack_unit_cd());
				delDtlL.add(dtlR);
			}

			// 上り電文の明細に追加
			up1().addAll(delDtlL);
		}

		/**
		 * 検査中ロット使用許可品の場合の補完処理
		 */
		protected void compInPrmtDtl() {

			// ヘッダの検査ＮＯから検査予定を取得
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t1 = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t1);
			schdL_bldr.setWhere(t1.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5050_MST_INSP_SCHD_S18", schdL, schdL_bldr, up0());
			MCIndexKey schdInspNoKey = schdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			
			MCIndexKey dtlKey = up1().createIndex(InspAct_Chk03_DtlR.$hdr_peg_no);

			MCList<InspAct_Chk03_HdrR> tgtHdrL = MCList.create(InspAct_Chk03_HdrR.class);
			MCList<MST_INSP_SCHD_R> tgtSchdL = MCList.create(MST_INSP_SCHD_R.class);

			for (InspAct_Chk03_HdrR hdrR : up0()) {
				MCList<MST_INSP_SCHD_R> schdSubL = schdL.subList(schdInspNoKey, hdrR.insp_no());
				// 検査予定から検査中使用許可フラグを設定
				hdrR.in_prmt_insp_flg(schdSubL.get(0).in_prmt_insp_flg());
				if (!hdrR.in_prmt_insp_flg()) {
					// 検査中ロット使用許可でない場合は補完不要
					continue;
				}
				if (!MSC_INSP_TYP.isACCPT(schdSubL.get(0).insp_typ())) {
					// 受入検査以外は補完不要
					continue;
				}
				if (up1().contains(dtlKey, hdrR.peg_no())) {
					// ヘッダに紐付く明細が存在する場合は補完不要
					continue;
				}
				tgtHdrL.add(hdrR);
				tgtSchdL.addAll(schdSubL);
			}
			
			MCIndexKey hdrInspNoKey = tgtHdrL.createIndex(InspAct_Chk03_HdrR.$insp_no);
			MCIndexKey no4Key = tgtSchdL.createIndex(MST_INSP_SCHD_R.$src_no4);
			
			// 対象となった検査予定から現状在庫を取得
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R t2 = MST_STK_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t2);
			stkL_bldr.setWhere(t2.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.ARR_ACT_NO.value());
			stkL_bldr.addWhereWithAnd(t2.fix_no.eq(bind("src_no4")));
			dbSelect("MSBFL5050_MST_STK_S06", stkL, stkL_bldr, tgtSchdL);
			
			MCList<InspAct_Chk03_DtlR> dtlL = MCList.create(InspAct_Chk03_DtlR.class);

			// 現状在庫から上り電文の明細を補完
			for (MST_STK_R stkR : stkL) {
				MST_INSP_SCHD_R schdR = tgtSchdL.getFirst(no4Key, stkR.fix_no());
				InspAct_Chk03_HdrR hdrR = tgtHdrL.getFirst(hdrInspNoKey, schdR.insp_no());

				InspAct_Chk03_DtlR dtlR = InspAct_Chk03_DtlR.create();
				dtlR.peg_no(getDtlPegNo());
				dtlR.hdr_peg_no(hdrR.peg_no());
				dtlR.data_crud_typ(hdrR.data_crud_typ());
				dtlR.insp_no(hdrR.insp_no());
				dtlR.insp_act_no(hdrR.insp_act_no());
				dtlR.itm_cd(stkR.itm_cd());
				dtlR.itm_sub1(stkR.itm_sub1());
				dtlR.itm_sub2(stkR.itm_sub2());
				dtlR.itm_sub3(stkR.itm_sub3());
				dtlR.loc_cd(stkR.loc_cd());
				dtlR.str_ln_cd(stkR.str_ln_cd());
				// 検査中ロット使用許可の場合は（抜取検査のみなので）良品区分、格付をヘッダが保持しているため、ここでの補完は不要
				dtlR.stk_id_typ(stkR.stk_id_typ());
				dtlR.fix_no_typ(stkR.fix_no_typ());
				dtlR.fix_no(stkR.fix_no());
				dtlR.pack_unit_qty(stkR.pack_unit_qty());
				dtlR.pack_unit_cd(stkR.pack_unit_cd());
				dtlR.base_unit_qty(stkR.base_unit_qty());
				dtlR.base_unit_cd(schdR.base_unit_cd());
				dtlR.lot_no(stkR.lot_no());
				dtlR.sublot_no(stkR.sublot_no());
				// 検査中ロット使用許可の場合は実績日から計上日を算出するため、ここでの補完は不要
				dtlL.add(dtlR);
			}

			MCIndexKey addDtlKey = dtlL.createIndex(InspAct_Chk03_DtlR.$hdr_peg_no);
			MCList<InspAct_Chk03_HdrR> purcHdrL = MCList.create(InspAct_Chk03_HdrR.class);

			// 上記の処理をしても補完されないヘッダを抽出（検査中ロット使用許可の訂正・取消時など）
			for (InspAct_Chk03_HdrR hdrR : tgtHdrL) {
				if (dtlL.contains(addDtlKey, hdrR.peg_no())) {
					continue;
				}
				purcHdrL.add(hdrR);
			}
			
			MCIndexKey inspActNoKey = purcHdrL.createIndex(InspAct_Chk03_HdrR.$insp_act_no);

			// 仕入実績受払を抽出・ロック
			MCList<MST_PURC_ACT_IO_R> purcActIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder purcActIoL_bldr = MCQueryApiBuilder.create(t3);
			MST_PURC_ACT_D_R st1 = MST_PURC_ACT_D_R.create("ST1");
			MST_PURC_ACT_R st2 = MST_PURC_ACT_R.create("ST2");
			purcActIoL_bldr.setWhere(t3.insp_act_no.eq(bind("insp_act_no")));
			purcActIoL_bldr.addWhereWithAnd(
					st2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActIoL_bldr.addInnerJoin(st1, t3.purc_act_d_no.eq(st1.purc_act_d_no)
					.and(t3.purc_act_d_seq.eq(st1.purc_act_d_seq)));
			purcActIoL_bldr.addInnerJoin(st2, st1.purc_act_no.eq(st2.purc_act_no)
					.and(st1.purc_act_seq.eq(st2.purc_act_seq)));
			dbSelectForUpdate("MSBFL5050_MST_PURC_ACT_IO_S02", purcActIoL, purcActIoL_bldr, purcHdrL);

			// 仕入実績受払から補完
			for (MST_PURC_ACT_IO_R purcActIoR : purcActIoL) {
				InspAct_Chk03_HdrR hdrR = purcHdrL.getFirst(inspActNoKey, purcActIoR.insp_act_no());
				InspAct_Chk03_DtlR dtlR = InspAct_Chk03_DtlR.create();
				// 訂正・取消時は必要最低限の項目のみ補完すればよい
				dtlR.peg_no(getDtlPegNo());
				dtlR.hdr_peg_no(hdrR.peg_no());
				dtlR.data_crud_typ(hdrR.data_crud_typ());
				dtlR.insp_no(hdrR.insp_no());
				dtlR.insp_act_no(hdrR.insp_act_no());
				dtlR.itm_cd(hdrR.itm_cd());
				dtlR.itm_sub1(hdrR.itm_sub1());
				dtlR.itm_sub2(hdrR.itm_sub2());
				dtlR.itm_sub3(hdrR.itm_sub3());
				dtlR.pack_unit_qty(purcActIoR.pack_unit_qty());
				dtlR.pack_unit_cd(purcActIoR.pack_unit_cd());
				dtlR.base_unit_qty(purcActIoR.base_unit_qty());
				dtlR.base_unit_cd(purcActIoR.base_unit_cd());
				dtlL.add(dtlR);
			}

			up1().addAll(dtlL);
		}
		
		/**
		 * 元紐付けＮＯを設定する
		 */
		protected void setOrgPegNo() {
			// 引落時に荷姿振替を行った場合、明細を行コピーして基準単位の行を追加する
			// 追加行の紐付けＮＯは新たに発番されるが、仕入実績受払に検査実績明細ＮＯなどを設定する場合、
			// コピー元の行の紐付けＮＯが必要となるため、元紐付けＮＯとして保持しておく
			for (InspAct_Chk03_DtlR r : up1()) {
				r.org_peg_no(r.peg_no());
			}
		}

		/**
		 * 仕入実績登録サービスを実行し、受入検査と同時に仕入実績を計上する
		 * @param notErrL
		 */
		protected void callPurcChk03() {

			// システムパラメータ「受入検査時仕入同時計上フラグ」がオフまたは存在しない場合は対象外
			if (!isSame(getSysParm("ACCPT_INSP_FLG"), "1")) {
				return;
			}

			// 追加・更新・削除を分け、処理対象とすべきかの一時切り分けを行う
			MCList<InspAct_Chk03_HdrR> tmpInsForCacheHdrL = MCList.create(InspAct_Chk03_HdrR.class); // 新規登録対象のヘッダ（キャッシュ取得に使用）
			MCList<InspAct_Chk03_HdrR> tmpUpdDelForCacheHdrL = MCList.create(InspAct_Chk03_HdrR.class); // 更新・削除対象のヘッダ（キャッシュ取得に使用）
			MCList<InspAct_Chk03_DtlR> tmpInsDtlL = MCList.create(InspAct_Chk03_DtlR.class); // 新規登録対象の明細
			MCList<InspAct_Chk03_DtlR> tmpUpdDelDtlL = MCList.create(InspAct_Chk03_DtlR.class); // 更新・削除対象の明細

			getPrePurcTargetList(tmpInsForCacheHdrL, tmpUpdDelForCacheHdrL, tmpInsDtlL,
					tmpUpdDelDtlL);

			if (tmpInsDtlL.isEmpty() && tmpUpdDelDtlL.isEmpty()) {
				return;
			}

			// 切り分けたリストを元にテーブルのデータをキャッシュする
			createCache(tmpInsForCacheHdrL, tmpUpdDelForCacheHdrL, tmpInsDtlL,
					tmpUpdDelDtlL);

			chkItmUnitData(tmpInsForCacheHdrL, tmpInsDtlL);
			chkItmUnitData(tmpUpdDelForCacheHdrL, tmpUpdDelDtlL);

			MCList<InspAct_Chk03_DtlR> insDtlL = MCList.create(InspAct_Chk03_DtlR.class);// 新規登録対象の明細
			MCList<InspAct_Chk03_DtlR> updDelDtlL = MCList.create(InspAct_Chk03_DtlR.class); // 更新・削除対象の明細

			// キャッシュデータを元に追加・更新・削除対象かどうかの最終判断を行う
			getPurcTargetList(tmpInsDtlL, tmpUpdDelDtlL, insDtlL, updDelDtlL);

			if (insDtlL.isEmpty() && updDelDtlL.isEmpty()) {
				return;
			}

			// 検査実績ヘッダごとに抜取明細の荷姿振替数量を取りまとめる（振り替えた分を基準単位数量の仕入実績受払として作成するため）
			createPurcXfrQtyCache(insDtlL, updDelDtlL);
			
			// 新規／訂正＆削除それぞれ仕入実績登録サービスの上り電文を編集
			MSBDL_PurcActRegService.Purc_Chk03 insPurcChk03 = createInsPurcChk03(insDtlL);
			MSBDL_PurcActRegService.Purc_Chk03 updDelPurcChk03 = createUpdDelPurcChk03(
					updDelDtlL);

			MSBDL_PurcActRegService.Purc_Chk03 o = MSBDL_PurcActRegService
					.crtPurc_Chk03();

			if (!insPurcChk03.up0().isEmpty()) {
				o.up0().addAll(insPurcChk03.up0());
				o.up1().addAll(insPurcChk03.up1());
				o.up2().addAll(insPurcChk03.up2());
			}

			if (!updDelPurcChk03.up0().isEmpty()) {
				o.up0().addAll(updDelPurcChk03.up0());
				o.up1().addAll(updDelPurcChk03.up1());
				o.up2().addAll(updDelPurcChk03.up2());
			}

			// 仕入実績登録サービスの実行
			if (o.up0().isEmpty()) {
				return;
			}

			o.up3().crt_param_cache_flg(true);
			o.up3().insp_act_srvs_flg(true);
			o.exec();

			// 上り電文にエラーフラグを設定
			setErrFLg(o);
		}

		protected void chkItmUnitData(MCList<InspAct_Chk03_HdrR> hdrL, MCList<InspAct_Chk03_DtlR> dtlL) {
			MCList<InspAct_Chk03_HdrR> delHdrL = MCList.create(InspAct_Chk03_HdrR.class);
			MCList<InspAct_Chk03_DtlR> delDtlL =MCList.create(InspAct_Chk03_DtlR.class);
			for(InspAct_Chk03_HdrR hdrR : hdrL) {
				if(!isNull(hdrR.src_no1())) {
					MST_PO_D_R pod = _podCache.getCache(hdrR.src_no1());
					if(isNull(pod)) {
						continue;
					}
					MAVM_ITM_UNIT_R itmUnit = _itmUnitCache.getCache(hdrR.itm_cd(), hdrR.itm_sub1(), hdrR.itm_sub2(), hdrR.itm_sub3(),pod.trd_unit_cd());
					if(itmUnit.isEmpty()) {
						MCMessagePool.add(new MCMessage(hdrR, null, MSBFL0143, toDispItm(hdrR.itm_cd(), hdrR.itm_sub1(), hdrR.itm_sub2(), hdrR.itm_sub3()), pod.trd_unit_cd(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
						delHdrL.add(hdrR);
						delDtlL.addAll(dtlL.subList(InspAct_Chk03_DtlR.$hdr_peg_no, hdrR.peg_no()));
					}
				}
				for(InspAct_Chk03_DtlR dtlR : dtlL.subList(InspAct_Chk03_DtlR.$hdr_peg_no, hdrR.peg_no())) {
					MAVM_ITM_UNIT_R packUnit = _itmUnitCache.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.pack_unit_cd());
					if(packUnit.isEmpty()) {
						MCMessagePool.add(new MCMessage(hdrR, null, MSBFL0143, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()), dtlR.pack_unit_cd(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
						delHdrL.add(hdrR);
						delDtlL.addAll(dtlL.subList(InspAct_Chk03_DtlR.$hdr_peg_no, hdrR.peg_no()));
					}
				}
			}
			//後続処理でエラーになるためリストから除外
			hdrL.removeAll(delHdrL);
			dtlL.removeAll(delDtlL);
		}

		/**
		 * 上り電文の各行が処理対象かどうか判断し、追加／更新・削除行に分ける
		 * テーブルを参照しないと判断できない部分については、キャッシュ取得後にgetPurcTargetListで実施する
		 */
		protected void getPrePurcTargetList(MCList<InspAct_Chk03_HdrR> insForCacheHdrL,
				MCList<InspAct_Chk03_HdrR> updDelForCacheHdrL,
				MCList<InspAct_Chk03_DtlR> insDtlL, MCList<InspAct_Chk03_DtlR> updDelDtlL) {
			MCIndexKey idx = up1().createIndex(InspAct_Chk03_DtlR.$hdr_peg_no);

			for (InspAct_Chk03_HdrR hdrR : up0()) {

				for (InspAct_Chk03_DtlR dtlR : up1().subList(idx, hdrR.peg_no())) {
					// 全数検査の場合は明細の良品区分、それ以外はヘッダの良品区分を選択
					String qualityTyp = (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ()))
							? dtlR.quality_typ()
							: hdrR.quality_typ();
					String oldQualityTyp = (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ()))
							? dtlR.old_quality_typ()
							: hdrR.old_quality_typ();

					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
						// 新規登録時は常に追加
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
						// 更新時（判定対象の場合は更新処理がないため、検査実績登録時の場合のみ考慮）
						if (!hdrR.in_prmt_insp_flg() && isNull(dtlR.insp_act_d_no())) {
							// 検査中ロット使用許可でない場合かつ明細行に検査実績明細ＮＯが設定されていない場合は新規
							// ※全数検査で登録済の検査実績に明細行を追加した場合は行ステータスが「更新」となるが、「新規」扱いとするため
							dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							// 明細のデータ更新区分が削除の場合は何もしない（そのまま）
						}
						else if (isNotUpdatedDtl(hdrR, dtlR)) {
							// 更新されていない明細行は処理対象としない
							continue;
						}
						else {
							// 上記以外は良品区分により追加・更新・削除を決める
							dtlR.data_crud_typ(crudTypUpd(qualityTyp, oldQualityTyp));
						}
					}

					// 明細行が新規登録の場合
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						// 在庫識別区分＝検収前在庫のみ
						if (!MSC_STK_ID_TYP.isPURC_PRE_ACCPT(dtlR.stk_id_typ())) {
							continue;
						}
						// 確定ＮＯ区分＝入荷実績ＮＯのみ
						if (!MSC_FIX_NO_TYP.isARR_ACT_NO(dtlR.fix_no_typ())) {
							continue;
						}
						// 良品区分＝良品のみ
						if (!MAC_QUALITY_TYP.isGOOD(qualityTyp)) {
							continue;
						}
						// 検査判定時に呼ばれた場合、検査判定結果区分＝合格または特採のみ
						if (hdrR.judg_flg()) {
							// 不合格または再検査の場合は対象外
							if (MSC_INSP_JUDG_RSLT_TYP.isNG(hdrR.insp_judg_rslt_typ())
									|| MSC_INSP_JUDG_RSLT_TYP
											.isRE(hdrR.insp_judg_rslt_typ())) {
								continue;
							}
						}
						else {
							// 検査指図時に呼ばれた場合、検査承認対象のものは対象外
							if (!isNull(hdrR.insp_aprv_sts_typ())) {
								continue;
							}
						}
						
						insForCacheHdrL.add(hdrR);
						insDtlL.add(dtlR);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						updDelForCacheHdrL.add(hdrR);
						updDelDtlL.add(dtlR);
					}
				}
			}
		}

		/**
		 * 明細行が訂正されているかどうかを返す（全数検査のみ）
		 */
		protected boolean isNotUpdatedDtl(InspAct_Chk03_HdrR hdrR,
				InspAct_Chk03_DtlR dtlR) {
			// InspAct_Chk01のcallClChk03メソッドで、全数検査の場合の締チェックの実行条件を参考にしている

			// 全数検査で訂正されていない行は仕入実績の更新対象としたくないため（締チェックでエラーとなるのを防ぐ）
			// 抜取検査の場合、明細を訂正していなくても締チェック対象となるので、更新対象としてもよい
			if (!MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				return false;
			}
			// 明細行にデータ更新区分が設定されていない場合は「訂正されてない」とみなす
			if (isNull(dtlR.data_crud_typ())) {
				return true;
			}
			// 明細行のデータ更新区分が「更新」かつ備考のみ更新されている場合は「訂正されていない」とみなす
			if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) && dtlR.rmrks_upd_flg()) {
				return true;
			}
			return false;
		}

		/**
		 * 良品区分によって新規／更新／削除を決定する（判定対象外の場合）
		 * @return
		 */
		protected String crudTypUpd(String quality_typ, String old_quality_typ) {
			// 検査実績時
			if (MAC_QUALITY_TYP.isGOOD(quality_typ)) {
				// 良品
				if (MAC_QUALITY_TYP.isGOOD(old_quality_typ)) {
					// 更新前が良品の場合、更新
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
				else if (MAC_QUALITY_TYP.isDFCT_INSP(old_quality_typ)
						|| MAC_QUALITY_TYP.isSSPND(old_quality_typ)
						|| isNull(old_quality_typ)) {
					// 更新前が検査不良品または保留または未設定の場合、新規
					// ※検査中ロット使用許可品に対して新規登録時に着手のみ行い、訂正で完了にした場合はこの分岐となる
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
			}
			else if (MAC_QUALITY_TYP.isDFCT_INSP(quality_typ)
					|| MAC_QUALITY_TYP.isSSPND(quality_typ)) {
				// 検査不良品または保留
				if (MAC_QUALITY_TYP.isGOOD(old_quality_typ)) {
					// 更新前が良品の場合、削除
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else if (MAC_QUALITY_TYP.isDFCT_INSP(old_quality_typ)
						|| MAC_QUALITY_TYP.isSSPND(old_quality_typ)
						|| isNull(old_quality_typ)) {
					// 更新前が検査不良品または保留または未設定の場合、何もしない
					return null;
				}
			}
			return null;
		}

		/**
		 * キャッシュを取得
		 */
		protected void createCache(MCList<InspAct_Chk03_HdrR> insHdrL,
				MCList<InspAct_Chk03_HdrR> updDelHdrL, MCList<InspAct_Chk03_DtlR> insDtlL,
				MCList<InspAct_Chk03_DtlR> updDelDtlL) {

			// 新規登録時、更新／削除時両方のロジックで取得するキャッシュ（取得方法は異なる）はここで初期化
			_arrActCache = new FXUCL_Cache<MST_ARR_ACT_R>();
			_arrActCache.setFixMaxCacheSize(-1);

			MCList<MAVM_ITM_UNIT_R> itmUnitBindL = MCList.create(MAVM_ITM_UNIT_R.class);

			createInsCache(insHdrL, insDtlL, itmUnitBindL);
			createUpdDelCache(updDelHdrL, updDelDtlL, itmUnitBindL);

			// 品目単位マスタは両方のロジックで取得する
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, itmUnitBindL,
					MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,
					MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3,
					MAVM_ITM_UNIT_R.$unit_cd);
		}

		/**
		 * 新規登録時に使用するキャッシュを取得
		 */
		protected void createInsCache(MCList<InspAct_Chk03_HdrR> insHdrL,
				MCList<InspAct_Chk03_DtlR> insDtlL, MCList<MAVM_ITM_UNIT_R> itmUnitBindL) {

			_arrSchdCache = new FXUCL_Cache<MST_ARR_SCHD_R>();
			_arrSchdCache.setFixMaxCacheSize(-1);
			_purcSchdCache = new FXUCL_Cache<MST_PURC_SCHD_R>();
			_purcSchdCache.setFixMaxCacheSize(-1);
			_podCache = new FXUCL_Cache<MST_PO_D_R>();
			_podCache.setFixMaxCacheSize(-1);
			_poCache = new FXUCL_Cache<MST_PO_R>();
			_poCache.setFixMaxCacheSize(-1);

			// 確定ＮＯ（入荷実績ＮＯ）で入荷実績を取得
			MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t1 = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t1);
			arrActL_bldr.setWhere(t1.arr_act_no.eq(bind("fix_no")));
			dbSelect("MSBFL5050_MST_ARR_ACT_S03", arrActL, arrActL_bldr, insDtlL);
			for (MST_ARR_ACT_R r : arrActL) {
				_arrActCache.putCache(new String[] {
						r.arr_act_no()
				}, r);
			}

			// 入荷予定を取得
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
			dbSelectKey("MSBFL5050_MST_ARR_SCHD_S01", arrSchdL, arrSchdL_bldr, arrActL);
			for (MST_ARR_SCHD_R r : arrSchdL) {
				_arrSchdCache.putCache(new String[] {
						r.arr_schd_no()
				}, r);
			}

			// 仕入予定を取得
			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T");
			MST_RCPT_IV_D_R w1 =MST_RCPT_IV_D_R.create("W"); 
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t2);
			purcSchdL_bldr.addSelect(
				subQuery()
					.select(max(w1.rcpt_iv_mng_no))
					.from(w1)
					.where(w1.purc_schd_no.eq(t2.purc_schd_no))
					.as("rcpt_iv_mng_no")
			);
			purcSchdL_bldr.setWhere(t2.arr_schd_no.eq(bind("arr_schd_no")));
			dbSelect("MSBFL5050_MST_PURC_SCHD_S01", purcSchdL, purcSchdL_bldr, arrSchdL);
			MCIndexKey purcSchdKey = purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
				MST_PURC_SCHD_R r = purcSchdL.getFirst(purcSchdKey, arrSchdR.arr_schd_no());
				if (!isNull(r)) {
					_purcSchdCache.putCache(new String[] {
							r.arr_schd_no()
					}, r);
				}
			}

			// 発注明細を取得
			MCList<MST_PO_D_R> podL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t3 = MST_PO_D_R.create("T");
			MCQueryApiBuilder podL_bldr = MCQueryApiBuilder.create(t3);
			podL_bldr.setWhere(t3.po_d_no.eq(bind("src_no1")));
			dbSelect("MSBFL5050_MST_PO_D_S01", podL, podL_bldr, insHdrL);
			for (MST_PO_D_R r : podL) {
				_podCache.putCache(new String[] {
						r.po_d_no()
				}, r);
			}

			// 発注ヘッダを取得
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbSelectKey("MSBFL5050_MST_PO_S01", poL, poL_bldr, podL);
			for (MST_PO_R r : poL) {
				_poCache.putCache(new String[] {
						r.po_no()
				}, r);
			}

			// 品目マスタを取得
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL, itmL_bldr, podL, MST_PO_D_R.$itm_cd,
					MST_PO_D_R.$itm_sub1, MST_PO_D_R.$itm_sub2, MST_PO_D_R.$itm_sub3);

			// 場所マスタを取得
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(MAM_LOC_R.create("T"));
			_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, insDtlL,
					InspAct_Chk03_DtlR.$loc_cd);

			// 取引先マスタを取得
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, poL, MST_PO_R.$sppl_cd);

			// 明細行の荷姿単位、発注明細の取引単位、仕入予定の取引単位、品目マスタの基準単位に対する品目単位マスタを取得
			for (InspAct_Chk03_DtlR r : insDtlL) {
				MAVM_ITM_UNIT_R bindR = MAVM_ITM_UNIT_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.unit_cd(r.pack_unit_cd());
				itmUnitBindL.add(bindR);
			}
			for (MST_PO_D_R r : podL) {
				MAVM_ITM_UNIT_R bindR = MAVM_ITM_UNIT_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.unit_cd(r.trd_unit_cd());
				itmUnitBindL.add(bindR);
			}
			for (MST_PURC_SCHD_R r : purcSchdL) {
				MST_ARR_SCHD_R arrSchdR = _arrSchdCache.getCache(r.arr_schd_no());
				MAVM_ITM_UNIT_R bindR = MAVM_ITM_UNIT_R.create();
				bindR.itm_cd(arrSchdR.itm_cd());
				bindR.itm_sub1(arrSchdR.itm_sub1());
				bindR.itm_sub2(arrSchdR.itm_sub2());
				bindR.itm_sub3(arrSchdR.itm_sub3());
				bindR.unit_cd(r.trd_unit_cd());
				itmUnitBindL.add(bindR);
			}
			for (MAM_ITM_R r : itmL) {
				MAVM_ITM_UNIT_R bindR = MAVM_ITM_UNIT_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.unit_cd(r.unit_cd());
				itmUnitBindL.add(bindR);
			}
		}

		/**
		 * 訂正・削除時に使用するキャッシュを取得
		 */
		protected void createUpdDelCache(MCList<InspAct_Chk03_HdrR> updDelHdrL,
				MCList<InspAct_Chk03_DtlR> updDelDtlL, MCList<MAVM_ITM_UNIT_R> itmUnitBindL) {

			_purcActIoByInspActDNoCache = new FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>>();
			_purcActIoByInspActDNoCache.setFixMaxCacheSize(-1);
			_purcActIoByInspJudgDNoCache = new FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>>();
			_purcActIoByInspJudgDNoCache.setFixMaxCacheSize(-1);
			_purcActIoByInspActNoCache = new FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>>();
			_purcActIoByInspActNoCache.setFixMaxCacheSize(-1);
			_purcActCache = new FXUCL_Cache<MST_PURC_ACT_R>();
			_purcActCache.setFixMaxCacheSize(-1);
			_purcActDByPurcActNoCache = new FXUCL_Cache<MCList<MST_PURC_ACT_D_R>>();
			_purcActDByPurcActNoCache.setFixMaxCacheSize(-1);
			_purcActIoByPurcActDNoCache = new FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>>();
			_purcActIoByPurcActDNoCache.setFixMaxCacheSize(-1);
			_arrSchdByActCache = new FXUCL_Cache<MST_ARR_SCHD_R>();
			_arrSchdByActCache.setFixMaxCacheSize(-1);

			MST_PURC_ACT_D_R st1 = MST_PURC_ACT_D_R.create("ST1");
			MST_PURC_ACT_R st2 = MST_PURC_ACT_R.create("ST2");
			MST_ARR_ACT_R st3 = MST_ARR_ACT_R.create("ST3");

			// 検査実績明細ＮＯから仕入実績受払を取得（判定対象外の場合）
			MCList<MST_PURC_ACT_IO_R> purcActIoByInspActDNoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t1 = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder purcActIoByInspActDNoL_bldr = MCQueryApiBuilder.create(t1);
			purcActIoByInspActDNoL_bldr.addSelect(st1.purc_act_no, st1.purc_act_seq);
			purcActIoByInspActDNoL_bldr.addSelect(st1.itm_cd, st1.itm_sub1, st1.itm_sub2,
					st1.itm_sub3);
			purcActIoByInspActDNoL_bldr
					.setWhere(t1.insp_act_d_no.eq(bind("insp_act_d_no")));
			purcActIoByInspActDNoL_bldr.addWhereWithAnd(
					st2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActIoByInspActDNoL_bldr.addInnerJoin(st1,
					t1.purc_act_d_no.eq(st1.purc_act_d_no)
					.and(t1.purc_act_d_seq.eq(st1.purc_act_d_seq)));
			purcActIoByInspActDNoL_bldr.addInnerJoin(st2,
					st1.purc_act_no.eq(st2.purc_act_no)
					.and(st1.purc_act_seq.eq(st2.purc_act_seq)));
			dbSelect("MSBFL5050_MST_PURC_ACT_IO_S03", purcActIoByInspActDNoL,
					purcActIoByInspActDNoL_bldr, updDelDtlL);
			for (MCList<MST_PURC_ACT_IO_R> gL : purcActIoByInspActDNoL
					.groupList(MST_PURC_ACT_IO_R.$insp_act_d_no)) {
				_purcActIoByInspActDNoCache.putCache(new String[] {
						gL.get(0).insp_act_d_no()
				}, gL);
			}

			// 検査判定明細ＮＯから仕入実績受払を取得（判定対象の場合）
			MCList<MST_PURC_ACT_IO_R> purcActIoByInspJudgDNoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t2 = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder purcActIoByInspJudgDNoL_bldr = MCQueryApiBuilder.create(t2);
			purcActIoByInspJudgDNoL_bldr.addSelect(st1.purc_act_no, st1.purc_act_seq);
			purcActIoByInspJudgDNoL_bldr.addSelect(st1.itm_cd, st1.itm_sub1, st1.itm_sub2,
					st1.itm_sub3);
			purcActIoByInspJudgDNoL_bldr
					.setWhere(t2.insp_judg_d_no.eq(bind("insp_judg_d_no")));
			purcActIoByInspJudgDNoL_bldr.addWhereWithAnd(
					st2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActIoByInspJudgDNoL_bldr.addInnerJoin(st1,
					t2.purc_act_d_no.eq(st1.purc_act_d_no)
					.and(t2.purc_act_d_seq.eq(st1.purc_act_d_seq)));
			purcActIoByInspJudgDNoL_bldr.addInnerJoin(st2,
					st1.purc_act_no.eq(st2.purc_act_no)
					.and(st1.purc_act_seq.eq(st2.purc_act_seq)));
			dbSelect("MSBFL5050_MST_PURC_ACT_IO_S04", purcActIoByInspJudgDNoL,
					purcActIoByInspJudgDNoL_bldr, updDelDtlL);
			for (MCList<MST_PURC_ACT_IO_R> gL : purcActIoByInspJudgDNoL
					.groupList(MST_PURC_ACT_IO_R.$insp_judg_d_no)) {
				_purcActIoByInspJudgDNoCache.putCache(new String[] {
						gL.get(0).insp_judg_d_no()
				}, gL);
			}

			// 検査実績ＮＯから仕入実績受払を取得（検査中ロット使用許可の場合）
			MCList<MST_PURC_ACT_IO_R> purcActIoByInspActNoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder purcActIoByInspActNoL_bldr = MCQueryApiBuilder.create(t3);
			purcActIoByInspActNoL_bldr.addSelect(st1.purc_act_no, st1.purc_act_seq);
			purcActIoByInspActNoL_bldr.addSelect(st1.itm_cd, st1.itm_sub1, st1.itm_sub2,
					st1.itm_sub3);
			purcActIoByInspActNoL_bldr.setWhere(t3.insp_act_no.eq(bind("insp_act_no")));
			purcActIoByInspActNoL_bldr.addWhereWithAnd(
					st2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActIoByInspActNoL_bldr.addInnerJoin(st1,
					t3.purc_act_d_no.eq(st1.purc_act_d_no)
					.and(t3.purc_act_d_seq.eq(st1.purc_act_d_seq)));
			purcActIoByInspActNoL_bldr.addInnerJoin(st2,
					st1.purc_act_no.eq(st2.purc_act_no)
					.and(st1.purc_act_seq.eq(st2.purc_act_seq)));
			dbSelect("MSBFL5050_MST_PURC_ACT_IO_S05", purcActIoByInspActNoL, purcActIoByInspActNoL_bldr,
					updDelDtlL.subList(r -> up0().getFirst(_hdrKey, r.hdr_peg_no())
							.in_prmt_insp_flg()));
			for (MCList<MST_PURC_ACT_IO_R> gL : purcActIoByInspActNoL
					.groupList(MST_PURC_ACT_IO_R.$insp_act_no)) {
				_purcActIoByInspActNoCache.putCache(new String[] {
						gL.get(0).insp_act_no()
				}, gL);
			}

			// 仕入実績受払ＮＯ、仕入実績受払連番から仕入実績受払を取得
			MCList<MST_PURC_ACT_IO_R> allPurcActIoL = MCList.create(MST_PURC_ACT_IO_R.class);
			allPurcActIoL.addAll(purcActIoByInspActDNoL);
			allPurcActIoL.addAll(purcActIoByInspJudgDNoL);
			allPurcActIoL.addAll(purcActIoByInspActNoL);
			for (MST_PURC_ACT_IO_R r : allPurcActIoL) {
				MAVM_ITM_UNIT_R packR = MAVM_ITM_UNIT_R.create();
				packR.itm_cd(r.getStringNE(MST_PURC_ACT_D_R.$itm_cd));
				packR.itm_sub1(r.getStringNE(MST_PURC_ACT_D_R.$itm_sub1));
				packR.itm_sub2(r.getStringNE(MST_PURC_ACT_D_R.$itm_sub2));
				packR.itm_sub3(r.getStringNE(MST_PURC_ACT_D_R.$itm_sub3));
				packR.unit_cd(r.pack_unit_cd());
				itmUnitBindL.add(packR);

				MAVM_ITM_UNIT_R trdR = packR.clone();
				trdR.unit_cd(r.trd_unit_cd());
				itmUnitBindL.add(trdR);
				
				MAVM_ITM_UNIT_R baseR = packR.clone();
				baseR.unit_cd(r.base_unit_cd());
				itmUnitBindL.add(baseR);
			}

			// 仕入実績ＮＯ、仕入実績連番から仕入実績をロックして取得
			MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
			MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T"));
			dbSelectKeyForUpdate("MSBFL5050_MST_PURC_ACT_S03", purcActL, purcActL_bldr, allPurcActIoL);
			for (MST_PURC_ACT_R r : purcActL) {
				_purcActCache.putCache(new Comparable<?>[] {
						r.purc_act_no(), r.purc_act_seq()
				}, r);
			}

			// 仕入実績ＮＯ、仕入実績連番から仕入実績明細をロックして取得（上り電文に存在しないレコードもあわせて取得）
			MCList<MST_PURC_ACT_D_R> purcActDbyPurcActNoL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t5 = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDbyPurcActNoL_bldr = MCQueryApiBuilder.create(t5);
			purcActDbyPurcActNoL_bldr.setWhere(t5.purc_act_no.eq(bind("purc_act_no"))
					.and(t5.purc_act_seq.eq(bind("purc_act_seq"))));
			dbSelectForUpdate("MSBFL5050_MST_PURC_ACT_D_S01", purcActDbyPurcActNoL,
					purcActDbyPurcActNoL_bldr, purcActL);
			for (MCList<MST_PURC_ACT_D_R> gL : purcActDbyPurcActNoL.groupList(
					MST_PURC_ACT_D_R.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_seq)) {
				_purcActDByPurcActNoCache.putCache(new Comparable<?>[] {
						gL.get(0).purc_act_no(), gL.get(0).purc_act_seq()
				}, gL);
			}

			// 仕入実績明細ＮＯ、仕入実績明細連番から仕入実績受払をロックして取得（上り電文に存在しないレコードもあわせて取得）
			MCList<MST_PURC_ACT_IO_R> purcActIobyPurcActNoL = MCList.create(MST_PURC_ACT_IO_R.class);
			MST_PURC_ACT_IO_R t6 = MST_PURC_ACT_IO_R.create("T");
			MCQueryApiBuilder purcActIobyPurcActNoL_bldr = MCQueryApiBuilder.create(t6);
			purcActIobyPurcActNoL_bldr.setWhere(t6.purc_act_d_no.eq(bind("purc_act_d_no"))
					.and(t6.purc_act_d_seq.eq(bind("purc_act_d_seq"))));
			dbSelectForUpdate("MSBFL5050_MST_PURC_ACT_IO_S06", purcActIobyPurcActNoL,
					purcActIobyPurcActNoL_bldr, purcActDbyPurcActNoL);
			for (MCList<MST_PURC_ACT_IO_R> gL : purcActIobyPurcActNoL.groupList(
					MST_PURC_ACT_IO_R.$purc_act_d_no,
					MST_PURC_ACT_IO_R.$purc_act_d_seq)) {
				_purcActIoByPurcActDNoCache.putCache(new Comparable<?>[] {
						gL.get(0).purc_act_d_no(), gL.get(0).purc_act_d_seq()
				}, gL);
			}

			// 仕入実績受払の入荷実績ＮＯから入荷実績を取得
			MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t7 = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder arrActL_bldr = MCQueryApiBuilder.create(t7);
			arrActL_bldr.setWhere(t7.arr_act_no.eq(bind("arr_act_no")));
			dbSelectKey("MSBFL5050_MST_ARR_ACT_S04", arrActL, arrActL_bldr, purcActIobyPurcActNoL);
			for (MST_ARR_ACT_R r : arrActL) {
				_arrActCache.putCache(new String[] {
						r.arr_act_no()
				}, r);
			}

			// 仕入実績受払の入荷実績ＮＯから入荷予定を取得
			// 入荷予定を取得

			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t8 = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(t8);
			arrSchdL_bldr.addSelect(st3.arr_act_no);
			arrSchdL_bldr.setWhere(st3.arr_act_no.eq(bind("arr_act_no")));
			arrSchdL_bldr.addInnerJoin(st3, st3.arr_schd_no.eq(t8.arr_schd_no));
			dbSelect("MSBFL5050_MST_ARR_SCHD_S02", arrSchdL, arrSchdL_bldr, purcActIobyPurcActNoL);
			for (MST_ARR_SCHD_R r : arrSchdL) {
				_arrSchdByActCache.putCache(new String[] {
						r.getStringNE("ARR_ACT_NO")
				}, r);
			}

			// 発注明細を取得
			MCList<MST_PO_D_R> podL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t9 = MST_PO_D_R.create("T");
			MCQueryApiBuilder podL_bldr = MCQueryApiBuilder.create(t9);
			podL_bldr.setWhere(t9.po_d_no.eq(bind("src_no1")));
			dbSelect("MSBFL5050_MST_PO_D_S02", podL, podL_bldr, updDelHdrL);
			for (MST_PO_D_R r : podL) {
				_podCache.putCache(new String[] {
						r.po_d_no()
				}, r);
			}

			for (MST_PO_D_R r : podL) {
				MAVM_ITM_UNIT_R bindR = MAVM_ITM_UNIT_R.create();
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
				bindR.unit_cd(r.trd_unit_cd());
				itmUnitBindL.add(bindR);
			}
		}

		/**
		 * 明細の情報から仕入実績受払を取得する
		 */
		protected MCList<MST_PURC_ACT_IO_R> getPurcActIoByDtl(InspAct_Chk03_DtlR r) {
			MCList<MST_PURC_ACT_IO_R> ioL = MCList.create(MST_PURC_ACT_IO_R.class);
			if (!isNull(r.insp_judg_d_no())) {
				// 検査判定明細ＮＯから取得
				ioL = _purcActIoByInspJudgDNoCache.getCache(r.insp_judg_d_no());
			}
			else if (!isNull(r.insp_act_d_no())) {
				// 検査実績明細ＮＯから取得
				ioL = _purcActIoByInspActDNoCache.getCache(r.insp_act_d_no());
			}
			else if (!isNull(r.insp_act_no()) && up0().getFirst(_hdrKey, r.hdr_peg_no()).in_prmt_insp_flg()) {
				// 検査実績ＮＯから取得
				ioL = _purcActIoByInspActNoCache.getCache(r.insp_act_no());
			}
			return ioL;
		}

		/**
		 * 自身と同じ検査実績明細ＮＯ、検査判定明細ＮＯ、検査実績ＮＯを持つ仕入実績受払を取得する
		 */
		protected MST_PURC_ACT_IO_R getPurcActIoByPurcActIo(MST_PURC_ACT_IO_R r) {
			MCList<MST_PURC_ACT_IO_R> ioL = MCList.create(MST_PURC_ACT_IO_R.class);
			if (!isNull(r.insp_judg_d_no())) {
				// 検査判定明細ＮＯから取得
				ioL = _purcActIoByInspJudgDNoCache.getCache(r.insp_judg_d_no());
			}
			else if (!isNull(r.insp_act_d_no())) {
				// 検査実績明細ＮＯから取得
				ioL = _purcActIoByInspActDNoCache.getCache(r.insp_act_d_no());
			}
			else if (!isNull(r.insp_act_no())) {
				// 検査実績ＮＯから取得
				ioL = _purcActIoByInspActNoCache.getCache(r.insp_act_no());
			}
			if (isNull(ioL)) {
				return null;
			}
			for (MST_PURC_ACT_IO_R ioR : ioL) {
				// 自分自身以外に同じＮＯを持つレコードがあれば返す
				if (!isSame(ioR.purc_act_io_no(), r.purc_act_io_no())) {
					return ioR;
				}
			}
			return null;
		}

		/**
		 * 明細の情報から仕入実績受払を取得し、ＮＯなどを上り電文に設定
		 */
		protected boolean createPurcActNoCache(InspAct_Chk03_DtlR dtlR) {
			MCList<MST_PURC_ACT_IO_R> ioL = getPurcActIoByDtl(dtlR);
			if (isNull(ioL) || ioL.isEmpty()) {
				return false;
			}
			
			for (MST_PURC_ACT_IO_R ioR : ioL) {
				InspAct_Chk03_PurcActNoR r = InspAct_Chk03_PurcActNoR.create();
				r.peg_no(dtlR.peg_no());
				r.hdr_peg_no(dtlR.hdr_peg_no());
				r.purc_act_no(ioR.getStringNE("PURC_ACT_NO"));
				r.purc_act_seq(ioR.getNumberNE("PURC_ACT_SEQ"));
				r.purc_act_d_no(ioR.purc_act_d_no());
				r.purc_act_d_seq(ioR.purc_act_d_seq());
				r.purc_act_io_no(ioR.purc_act_io_no());
				r.purc_act_io_seq(ioR.purc_act_io_seq());
				_purcActNoL.add(r);
			}
			return true;
		}

		/**
		 * 追加・更新・削除対象かどうかの最終判断
		 */
		protected void getPurcTargetList(MCList<InspAct_Chk03_DtlR> tmpInsDtlL,
				MCList<InspAct_Chk03_DtlR> tmpUpdDelDtlL,
				MCList<InspAct_Chk03_DtlR> insDtlL,
				MCList<InspAct_Chk03_DtlR> updDelDtlL) {

			// 新規登録対象の明細
			for (InspAct_Chk03_DtlR dtlR : tmpInsDtlL) {
				MST_ARR_ACT_R arrActR = _arrActCache.getCache(dtlR.fix_no());
				MST_PURC_SCHD_R purcSchdR = _purcSchdCache.getCache(arrActR.arr_schd_no());

				// 受領インボイス対象の場合は処理対象外とする
				if (!isNull(purcSchdR.getStringNE("rcpt_iv_mng_no"))) {
					continue;
				}

				insDtlL.add(dtlR);
			}

			// 更新・削除対象の明細
			for (InspAct_Chk03_DtlR dtlR : tmpUpdDelDtlL) {

				// 仕入実績受払が存在する場合は対象とする
				if (createPurcActNoCache(dtlR)) {
					updDelDtlL.add(dtlR);
				}
			}
			// createPurcActNoCacheで作成した仕入実績ＮＯのキャッシュのindexを作成する
			_purcActDNoKey = _purcActNoL.createIndex(
					InspAct_Chk03_PurcActNoR.$purc_act_d_no,
					InspAct_Chk03_PurcActNoR.$purc_act_d_seq);
			_purcActIoNoKey = _purcActNoL.createIndex(
					InspAct_Chk03_PurcActNoR.$purc_act_io_no,
					InspAct_Chk03_PurcActNoR.$purc_act_io_seq);
		}

		/**
		 * 検査実績ヘッダごとに抜取明細の荷姿振替数量を取りまとめる
		 */
		protected void createPurcXfrQtyCache(MCList<InspAct_Chk03_DtlR> insDtlL,
				MCList<InspAct_Chk03_DtlR> updDelDtlL) {

			_packXfrQtyCache = new FXUCL_Cache<MCList<InspAct_Chk03_PackXfrR>>();
			_packXfrQtyCache.setFixMaxCacheSize(-1);

			MCIndexKey insDtlKey = insDtlL.createIndex(InspAct_Chk03_DtlR.$hdr_peg_no);
			MCIndexKey updDtlKey = updDelDtlL.createIndex(InspAct_Chk03_DtlR.$hdr_peg_no);

			// 処理対象の上り電文ヘッダを抽出
			MCList<InspAct_Chk03_HdrR> tgtHdrL = MCList.create(InspAct_Chk03_HdrR.class);
			for (InspAct_Chk03_HdrR hdrR : up0()) {
				if (insDtlL.contains(insDtlKey, hdrR.peg_no())) {
					tgtHdrL.add(hdrR);
				}
				else if (updDelDtlL.contains(updDtlKey, hdrR.peg_no())) {
					if (hdrR.in_prmt_insp_flg()) {
						// 検査中ロット使用許可品の訂正時は抜取明細作成時に荷姿振替が行われているため、対象としない
						continue;
					}
					tgtHdrL.add(hdrR);
				}
			}
			
			// 抜取明細の上り電文に存在する分は除外するため、ワークテーブルに登録
			MCList<MST_INSP_SMPL_ACT_R> dbL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			for (InspAct_Chk03_SmplR smplR : up2()) {
				if (!isNull(smplR.insp_smpl_act_no())) {
					MST_INSP_SMPL_ACT_R dbR = MST_INSP_SMPL_ACT_R.create();
					dbR.insp_smpl_act_no(smplR.insp_smpl_act_no());
					dbL.add(dbR);
				}
			}
			if (!dbL.isEmpty()) {
				MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(MST_INSP_SMPL_ACT_R.create("T"));
				dbWkInsert("MSBFL5050_MSW_INSP_SMPL_ACT_I01",
						dbL.groupBy(dbL_bldr.getBaseDbc().getKeyColumn()), dbL_bldr.getBaseDbc());
			}
			
			// 検査実績ＮＯに紐付く検査抜取明細を抽出
			MCList<MST_INSP_SMPL_ACT_R> smplActL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t2 = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplActL_bldr = MCQueryApiBuilder.create(t2);
			MSW_INSP_SMPL_ACT_KEY_R S1T1 = MSW_INSP_SMPL_ACT_KEY_R.create("T1");
			smplActL_bldr.setSelect(t2.insp_smpl_act_no, t2.insp_act_no,
					t2.pack_xfr_pack_unit_qty, t2.pack_xfr_pack_unit_cd,
					t2.pack_xfr_base_unit_qty, t2.pack_xfr_base_unit_cd);
			smplActL_bldr.setWhere(t2.insp_act_no.eq(bind("insp_act_no")));
			smplActL_bldr.addWhereWithAnd(
					notExists(subQuery()
							.select(S1T1.insp_smpl_act_no)
							.from(S1T1)
							.where(S1T1.insp_smpl_act_no.eq(t2.insp_smpl_act_no))));
			dbSelect("MSBFL5050_MST_INSP_SMPL_ACT_S10", smplActL, smplActL_bldr, tgtHdrL);
			MCIndexKey dbKey = smplActL.createIndex(MST_INSP_SMPL_ACT_R.$insp_act_no);
			
			// 上り電文の抜取明細を削除以外のもので絞り込み
			MCList<InspAct_Chk03_SmplR> tgtSmplL = up2().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			MCIndexKey smplKey = tgtSmplL.createIndex(InspAct_Chk03_SmplR.$hdr_peg_no);
			
			MCList<InspAct_Chk03_PackXfrR> packXfrL = MCList.create(InspAct_Chk03_PackXfrR.class);
			
			// ヘッダの上り電文に荷姿振替の単位、数量を格納
			for (InspAct_Chk03_HdrR hdrR : tgtHdrL) {
				// 抜取明細の上り電文より取得
				for (InspAct_Chk03_SmplR r : tgtSmplL.subList(smplKey, hdrR.peg_no())) {
					if (!isNull(r.pack_xfr_pack_unit_cd())) {
						InspAct_Chk03_PackXfrR packXfrR = InspAct_Chk03_PackXfrR.create();
						packXfrR.insp_no(hdrR.insp_no());
						packXfrR.pack_xfr_pack_unit_qty(r.pack_xfr_pack_unit_qty());
						packXfrR.pack_xfr_pack_unit_cd(r.pack_xfr_pack_unit_cd());
						packXfrR.pack_xfr_base_unit_qty(r.pack_xfr_base_unit_qty());
						packXfrR.pack_xfr_base_unit_cd(r.pack_xfr_base_unit_cd());
						packXfrL.add(packXfrR);
					}
				}
				// テーブルより取得
				if (!isNull(hdrR.insp_act_no())) {
					for (MST_INSP_SMPL_ACT_R r : smplActL.subList(dbKey, hdrR.insp_act_no())) {
						if (!isNull(r.pack_xfr_pack_unit_cd())) {
							InspAct_Chk03_PackXfrR packXfrR = InspAct_Chk03_PackXfrR.create();
							packXfrR.insp_no(hdrR.insp_no());
							packXfrR.pack_xfr_pack_unit_qty(r.pack_xfr_pack_unit_qty());
							packXfrR.pack_xfr_pack_unit_cd(r.pack_xfr_pack_unit_cd());
							packXfrR.pack_xfr_base_unit_qty(r.pack_xfr_base_unit_qty());
							packXfrR.pack_xfr_base_unit_cd(r.pack_xfr_base_unit_cd());
							packXfrL.add(packXfrR);
						}
					}
				}
			}
			
			if (packXfrL.isEmpty()) {
				return;
			}
			
			// 紐付けＮＯ、単位で数量を集計し、紐付けＮＯをキーとするキャッシュに格納
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(InspAct_Chk03_PackXfrR.$insp_no);
			gp.addKey(InspAct_Chk03_PackXfrR.$pack_xfr_pack_unit_cd);
			gp.max(InspAct_Chk03_PackXfrR.$pack_xfr_base_unit_cd);
			gp.sum(InspAct_Chk03_PackXfrR.$pack_xfr_pack_unit_qty);
			gp.sum(InspAct_Chk03_PackXfrR.$pack_xfr_base_unit_qty);
			MCList<InspAct_Chk03_PackXfrR> grpL = packXfrL.groupBy(gp);

			for (MCList<InspAct_Chk03_PackXfrR> gL : grpL
					.groupList(InspAct_Chk03_PackXfrR.$insp_no)) {
				_packXfrQtyCache.putCache(new String[] {
						gL.get(0).insp_no()
				}, gL);
			}
		}

		/**
		 * 上り電文の検査ＮＯ単位に荷姿振替すべき数量を計算し、必要な場合は仕入実績受払と上り電文に追加する
		 * @param purcIoL
		 */
		protected void calcInsPackXfrQty(MCList<Purc_Chk03_IoR> purcIoL, MCList<InspAct_Chk03_DtlR> dtlL) {

			MCList<Purc_Chk03_IoR> addPurcIoL = MCList.create(Purc_Chk03_IoR.class);
			MCList<InspAct_Chk03_DtlR> addDtlL = MCList.create(InspAct_Chk03_DtlR.class);
			
			calcPackXfrQty(purcIoL, addPurcIoL, addDtlL, true);
			
			purcIoL.addAll(addPurcIoL);
			dtlL.addAll(addDtlL);
			up1().addAll(addDtlL);
		}
		
		/**
		 * 上り電文の検査ＮＯ単位に荷姿振替すべき数量を計算し、必要な場合は仕入実績受払に追加する
		 */
		protected void calcPackXfrQty(MCList<Purc_Chk03_IoR> purcIoL, MCList<Purc_Chk03_IoR> addPurcIoL,
				MCList<InspAct_Chk03_DtlR> addDtlL, boolean isNewNum) {

			MCList<Purc_Chk03_IoR> tgtIoL = purcIoL
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			MCIndexKey idx = tgtIoL.createIndex(INSP_NO_COL,
					Purc_Chk03_IoR.$pack_unit_cd);
			MCIndexKey upKey = up1().createIndex(InspAct_Chk03_DtlR.$peg_no);

			// 仕入実績受払の荷姿単位数量・基準単位数量を、上り電文の検査ＮＯ・荷姿単位ＣＤで集計
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(INSP_NO_COL);
			gp.addKey(Purc_Chk03_IoR.$pack_unit_cd);
			gp.max(Purc_Chk03_IoR.$base_unit_cd);
			gp.sum(Purc_Chk03_IoR.$pack_unit_qty);
			gp.sum(Purc_Chk03_IoR.$base_unit_qty);
			MCList<Purc_Chk03_IoR> purcIoGrpL = tgtIoL.groupBy(gp);
			MCIndexKey grpIdx = purcIoGrpL.createIndex(INSP_NO_COL,
					Purc_Chk03_IoR.$pack_unit_cd);

			for (Purc_Chk03_IoR hdrR : tgtIoL.groupBy(INSP_NO_COL)) {

				// 上り電文の検査ＮＯが荷姿振替数量のキャッシュに存在しなければ何もしない
				MCList<InspAct_Chk03_PackXfrR> packXfrL = _packXfrQtyCache
						.getCache(hdrR.getStringNE(INSP_NO_COL));
				if (isNull(packXfrL) || packXfrL.isEmpty()) {
					return;
				}

				for (InspAct_Chk03_PackXfrR packXfrR : packXfrL) {

					// 荷姿単位が基準単位の仕入実績受払レコード（荷姿振替済のレコード）を抽出
					Purc_Chk03_IoR purcIoR = purcIoGrpL.getFirst(grpIdx,
							packXfrR.insp_no(), packXfrR.pack_xfr_base_unit_cd());
					if (!isNull(purcIoR)) {
						if (purcIoR.base_unit_qty().gte(packXfrR.pack_xfr_base_unit_qty())) {
							// 荷姿単位が基準単位の仕入実績受払レコードの基準単位数量≧荷姿振替が必要な基準単位数量の場合、未処理数量をゼロにして何もしない
							packXfrR.pack_xfr_pack_unit_qty(MCNumber.ZERO);
							packXfrR.pack_xfr_base_unit_qty(MCNumber.ZERO);
							continue;

						}
						else {
							// 上記以外の場合、未処理数量から減算
							// 対象行を１行取得
							Purc_Chk03_IoR ioR = tgtIoL.getFirst(idx, packXfrR.insp_no(),
									packXfrR.pack_xfr_base_unit_cd());
							// 明細を１行取得し、品目と枝番を取得
							InspAct_Chk03_DtlR dtlR = up1().getFirst(upKey, ioR.peg_no());
							MAVM_ITM_UNIT_R itmUnitR = _itmUnitCache.get(
									dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(),
									dtlR.itm_sub3(), packXfrR.pack_xfr_pack_unit_cd());
							// 基準単位数量を荷姿単位に換算して減算
							packXfrR.pack_xfr_pack_unit_qty(packXfrR
									.pack_xfr_pack_unit_qty()
									.subtract(rvrsBaseUnitConv(purcIoR.base_unit_qty(),
											itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
											itmUnitR.dec_place(), itmUnitR.rnd_typ())));
							packXfrR.pack_xfr_base_unit_qty(
									packXfrR.pack_xfr_base_unit_qty()
											.subtract(purcIoR.base_unit_qty()));
						}
					}

					// 荷姿振替が必要な荷姿単位数量と同じ荷姿単位を持つ仕入実績受払を抽出
					MCList<Purc_Chk03_IoR> subIoL = tgtIoL.subList(idx,
							packXfrR.insp_no(), packXfrR.pack_xfr_pack_unit_cd());
					for (Purc_Chk03_IoR subIoR : subIoL) {
						//荷姿振替が必要な荷姿単位数量に何も入力されなかった場合の考慮(荷姿振替が必要な荷姿単位数量をゼロとして処理する)
						if (packXfrR.pack_xfr_pack_unit_qty() == null) {
							packXfrR.pack_xfr_pack_unit_qty(MCNumber.ZERO);
							packXfrR.pack_xfr_base_unit_qty(MCNumber.ZERO);
						}
						MCNumber diffPackQty = subIoR.pack_unit_qty()
								.subtract(packXfrR.pack_xfr_pack_unit_qty());
						MCNumber diffBaseQty = subIoR.base_unit_qty()
								.subtract(packXfrR.pack_xfr_base_unit_qty());
						if (diffPackQty.isPositive()) {
							//荷姿振替が必要な荷姿単位数量がゼロの場合は、基準単位行の追加を行わない
							if (!packXfrR.pack_xfr_pack_unit_qty().eq(MCNumber.ZERO)) {
								// 仕入実績受払の荷姿単位数量＞荷姿振替が必要な数量の場合、元の数量から差分をマイナスし、振替分を基準単位で行追加
								subIoR.pack_unit_qty(diffPackQty);
								subIoR.trd_unit_qty(diffPackQty);
								subIoR.base_unit_qty(diffBaseQty);
	
								// 基準単位の行を１行取得
								Purc_Chk03_IoR ioR = tgtIoL.getFirst(idx, packXfrR.insp_no(),
										packXfrR.pack_xfr_base_unit_cd());
	
								if (isNull(ioR)) {
									// 基準単位の行が存在しない場合、新規行を追加する
									Purc_Chk03_IoR newIoR = subIoR.clone();
									if (isNewNum) {
										// 新規に紐付けＮＯを発番
										newIoR.peg_no(getDtlPegNo());
									}
									newIoR.pack_unit_qty(packXfrR.pack_xfr_base_unit_qty());
									newIoR.trd_unit_qty(packXfrR.pack_xfr_base_unit_qty());
									newIoR.base_unit_qty(packXfrR.pack_xfr_base_unit_qty());
									newIoR.pack_unit_cd(packXfrR.pack_xfr_base_unit_cd());
									newIoR.trd_unit_cd(packXfrR.pack_xfr_base_unit_cd());
									newIoR.base_unit_cd(packXfrR.pack_xfr_base_unit_cd());
									addPurcIoL.add(newIoR);
	
									// 上り電文にも行追加する（更新処理に渡すキャッシュを作成するのに必要）
									// ※仕入実績受払の紐付けＮＯと上り電文の明細の紐付けＮＯは1:1となっている
									InspAct_Chk03_DtlR newDtlR = up1()
											.getFirst(upKey, subIoR.peg_no()).clone();
									newDtlR.peg_no(newIoR.peg_no());
									newDtlR.purc_io_peg_no(newIoR.peg_no());
									addDtlL.add(newDtlR);
								}
								else {
									// 基準単位の行が存在する場合、その行に追加する
									ioR.pack_unit_qty(ioR.pack_unit_qty().add(packXfrR.pack_xfr_base_unit_qty()));
									ioR.trd_unit_qty(ioR.pack_unit_qty());
									ioR.base_unit_qty(ioR.base_unit_qty().add(packXfrR.pack_xfr_base_unit_qty()));
								}
							}

							// 荷姿振替が必要な数量をゼロにする
							packXfrR.pack_xfr_pack_unit_qty(MCNumber.ZERO);
							packXfrR.pack_xfr_base_unit_qty(MCNumber.ZERO);
						}
						else {
							// 仕入実績受払の荷姿単位数量≦荷姿振替が必要な数量の場合、全数を基準単位に振り替える
							subIoR.pack_unit_qty(subIoR.base_unit_qty());
							subIoR.pack_unit_cd(subIoR.base_unit_cd());
							subIoR.trd_unit_qty(subIoR.base_unit_qty());
							subIoR.trd_unit_cd(subIoR.base_unit_cd());

							// 荷姿振替が必要な数量に差分を設定
							packXfrR.pack_xfr_pack_unit_qty(diffPackQty);
							packXfrR.pack_xfr_base_unit_qty(diffBaseQty);
						}
					}
				}
			}
		}

		/**
		 * 新規登録の仕入実績登録サービスの電文を編集する
		 * @return
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 createInsPurcChk03(
				MCList<InspAct_Chk03_DtlR> dtlL) {

			MSBDL_PurcActRegService.Purc_Chk03 o = MSBDL_PurcActRegService
					.crtPurc_Chk03();

			if (dtlL.isEmpty()) {
				return o;
			}
			
			// 上り電文の明細から仕入実績登録サービスの仕入実績受払コンテナを作成する
			MCList<Purc_Chk03_IoR> purcIoL = createInsPurcIo(dtlL);

			// 仕入実績受払コンテナに荷姿振替を実施
			calcInsPackXfrQty(purcIoL, dtlL);
			
			// 仕入実績受払コンテナに設定された発注明細ＮＯに該当する発注明細から、ユーティリティのヘッダコンテナを作成する
			MCList<ConvQtyAmtUtil_Calc01_HdrR> utilHdrL = createInsUtilHdr(dtlL, purcIoL);

			// 仕入実績受払コンテナからユーティリティの明細２コンテナを作成する
			MCList<ConvQtyAmtUtil_Calc01_Dtl2R> utilDtl2L = createInsUtilDtl2(purcIoL);

			// ユーティリティを実行
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc01 util = MSUCL_ConvQtyAmtUtil
					.crtConvQtyAmtUtil_Calc01();
			util.up0().addAll(utilHdrL);
			util.up1().addAll(utilDtl2L);
			util.exec();

			// 仕入実績受払コンテナに明細紐付けＮＯを設定
			String[] copyCols = {
					ConvQtyAmtUtil_Calc01_Dtl2R.$dtl_peg_no
			};
			copyByPegNo(purcIoL, copyCols, util.down1(), copyCols);

			// ユーティリティの実行結果より仕入実績明細コンテナを作成
			MCList<Purc_Chk03_DtlR> purcDtlL = createInsPurcDtl(dtlL, purcIoL,
					util.down0());

			// 仕入実績明細に設定する紐付けＮＯに仕入実績明細コンテナの紐付けＮＯの最大値を設定
			// ※更新、削除データの仕入実績明細コンテナを作成する際、設定値＋１を設定するため
			_purcDtlPegNo = (MCNumber) purcDtlL.max(Purc_Chk03_DtlR.$peg_no);
			
			// 仕入実績明細コンテナから仕入実績ヘッダコンテナを作成
			MCList<Purc_Chk03_HdrR> purcHdrL = createInsPurcHdr(dtlL, purcDtlL);

			o.up0().addAll(purcHdrL);
			o.up1().addAll(purcDtlL);
			o.up2().addAll(purcIoL);
			return o;
		}

		/**
		 * 上り電文のヘッダから仕入実績の仕入日を取得する
		 */
		protected MCDate getPurcDt(InspAct_Chk03_HdrR hdrR) {
			// 仕入日時を取得し、時分をカット
			return getPurcTm(hdrR).startTimeOfDay();
		}

		/**
		 * 上り電文のヘッダから仕入実績の仕入日時を取得する
		 */
		protected MCDate getPurcTm(InspAct_Chk03_HdrR hdrR) {
			if (hdrR.judg_flg()) {
				// 判定対象の場合は判定日
				return hdrR.judg_dt();
			}
			else {
				// 判定対象外の場合は検査終了日時、未設定の場合は検査開始日時
				return nvl(hdrR.end_tm(), hdrR.st_tm());
			}
		}

		/**
		 * 計上日を取得する
		 * 検査中使用許可の場合は実績日時から算出し、それ以外は上り電文の計上日
		 */
		protected MCDate getAcDt(InspAct_Chk03_HdrR hdrR, InspAct_Chk03_DtlR dtlR) {
			if (hdrR.in_prmt_insp_flg()) {
				return MAUCL_DateUtil.getAcDt(getPurcTm(hdrR));
			}
			else {
				return dtlR.ac_dt();
			}
		}
		
		/**
		 * 明細から格付を取得する
		 */
		protected String getGdCd(InspAct_Chk03_DtlR dtlR) {
			InspAct_Chk03_HdrR hdrR = up0().getFirst(_hdrKey, dtlR.hdr_peg_no());
			if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				// 全数検査の場合は明細
				return dtlR.gd_cd();
			}
			else {
				// 抜取検査の場合はヘッダ
				return hdrR.gd_cd();
			}
		}
		
		/**
		 * 明細から良品区分を取得する
		 */
		protected String getQualityTyp(InspAct_Chk03_DtlR dtlR) {
			InspAct_Chk03_HdrR hdrR = up0().getFirst(_hdrKey, dtlR.hdr_peg_no());
			if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				// 全数検査の場合は明細
				return dtlR.quality_typ();
			}
			else {
				// 抜取検査の場合はヘッダ
				return hdrR.quality_typ();
			}
		}
		
		/**
		 * 上り電文の明細から仕入実績登録サービスの仕入実績受払コンテナを作成する
		 */
		protected MCList<Purc_Chk03_IoR> createInsPurcIo(
				MCList<InspAct_Chk03_DtlR> dtlL) {
			MCList<Purc_Chk03_IoR> purcIoL = MCList.create(Purc_Chk03_IoR.class);
			purcIoL.addStringColumn(PO_D_NO_COL);
			purcIoL.addStringColumn(ARR_SCHD_NO_COL);
			purcIoL.addStringColumn(PURC_DT_COL);
			purcIoL.addStringColumn(AC_DT_COL);
			purcIoL.addStringColumn(INSP_NO_COL);

			for (InspAct_Chk03_DtlR dtlR : dtlL) {
				Purc_Chk03_IoR purcIoR = Purc_Chk03_IoR.create();
				purcIoR.setAttributes(up0().getFirst(_hdrKey, dtlR.hdr_peg_no()));
				copyValue(purcIoR, dtlR, createMap_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Ins());
				purcIoL.add(purcIoR);

				// 下り電文に設定するため、仕入実績受払の紐付けＮＯを設定
				dtlR.purc_io_peg_no(purcIoR.peg_no());
			}
			return purcIoL;
		}

		/**
		 * 仕入実績受払コンテナに設定された発注明細ＮＯに該当する発注明細から、ユーティリティのヘッダコンテナを作成する
		 */
		protected MCList<ConvQtyAmtUtil_Calc01_HdrR> createInsUtilHdr(
				MCList<InspAct_Chk03_DtlR> dtlL, MCList<Purc_Chk03_IoR> purcIoL) {

			MCList<ConvQtyAmtUtil_Calc01_HdrR> utilHdrL = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
			purcIoL.addNumberColumn(UTIL_HDR_PEG_NO_COL);
			Map<List<Comparable<?>>, Integer> map = new HashMap<List<Comparable<?>>, Integer>();

			Integer pegNo = 0;
			for (Purc_Chk03_IoR purcIoR : purcIoL) {
				// 発注明細ＮＯが同一でも、日付が異なる場合は別ヘッダとする
				List<Comparable<?>> key = new ArrayList<Comparable<?>>();
				key.add(purcIoR.getStringNE(PO_D_NO_COL));
				key.add(purcIoR.getDateNE(PURC_DT_COL));
				key.add(purcIoR.getDateNE(AC_DT_COL));

				if (map.containsKey(key)) {
					// 同一発注明細ＮＯ、仕入日、計上日のレコードがすでに存在する場合、そのヘッダ紐付けＮＯを設定
					purcIoR.setNumberNE(UTIL_HDR_PEG_NO_COL, map.get(key));
				}
				else {
					// 同一発注明細ＮＯ、仕入日、計上日のレコードが存在しない場合、ヘッダコンテナを作成
					MST_PO_D_R podR = _podCache.getCache(purcIoR.getStringNE(PO_D_NO_COL));
					ConvQtyAmtUtil_Calc01_HdrR utilHdrR = ConvQtyAmtUtil_Calc01_HdrR.create();
					copy(utilHdrR, podR, createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R());
					utilHdrR.peg_no(++pegNo);
					utilHdrL.add(utilHdrR);
					purcIoR.setNumberNE(UTIL_HDR_PEG_NO_COL, pegNo);
					map.put(key, pegNo);
				}
			}
			return utilHdrL;
		}

		/**
		 * 仕入実績受払コンテナからユーティリティの明細２コンテナを作成する
		 */
		protected MCList<ConvQtyAmtUtil_Calc01_Dtl2R> createInsUtilDtl2(
				MCList<Purc_Chk03_IoR> purcIoL) {

			MCList<ConvQtyAmtUtil_Calc01_Dtl2R> utilDtl2L = MCList.create(ConvQtyAmtUtil_Calc01_Dtl2R.class);
			for (Purc_Chk03_IoR purcIoR : purcIoL) {
				ConvQtyAmtUtil_Calc01_Dtl2R utilDtl2R = ConvQtyAmtUtil_Calc01_Dtl2R.create();
				copy(utilDtl2R, purcIoR, createMap_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Chk03_IoR());
				utilDtl2L.add(utilDtl2R);
			}

			return utilDtl2L;
		}

		/**
		 * ユーティリティの実行結果より仕入実績明細を作成
		 */
		protected MCList<Purc_Chk03_DtlR> createInsPurcDtl(
				MCList<InspAct_Chk03_DtlR> dtlL, MCList<Purc_Chk03_IoR> purcIoL,
				MCList<ConvQtyAmtUtil_Calc01_Dtl1R> utilDtl1L) {

			MCList<Purc_Chk03_DtlR> purcDtlL = MCList.create(Purc_Chk03_DtlR.class);
			purcDtlL.addStringColumn(PURC_DT_COL);
			purcDtlL.addStringColumn(AC_DT_COL);
			purcDtlL.addStringColumn(PO_NO_COL);

			MCIndexKey dtlPegNoKey = purcIoL.createIndex(Purc_Chk03_IoR.$dtl_peg_no);
			MCIndexKey inspDtlKey = dtlL.createIndex(InspAct_Chk03_DtlR.$purc_io_peg_no);

			for (ConvQtyAmtUtil_Calc01_Dtl1R utilDtl1R : utilDtl1L) {
				MCList<Purc_Chk03_IoR> purcIoSubL = purcIoL.subList(dtlPegNoKey,
						utilDtl1R.peg_no());
				Purc_Chk03_IoR purcIoR = purcIoSubL.get(0);

				Purc_Chk03_DtlR purcDtlR = Purc_Chk03_DtlR.create();
				purcDtlR.setAttributes(up0().getFirst(_hdrKey,
						dtlL.getFirst(inspDtlKey, purcIoR.peg_no()).hdr_peg_no()));

				MST_ARR_ACT_R arrActR = _arrActCache.getCache(purcIoR.arr_act_no());
				MST_ARR_SCHD_R arrSchdR = _arrSchdCache.getCache(arrActR.arr_schd_no());
				MST_PURC_SCHD_R purcSchdR = _purcSchdCache
						.getCache(arrSchdR.arr_schd_no());
				MST_PO_D_R podR = _podCache.getCache(purcIoR.getStringNE(PO_D_NO_COL));
				MAM_ITM_R itmR = _itmCache.get(podR.itm_cd(), podR.itm_sub1(),
						podR.itm_sub2(), podR.itm_sub3());

				purcDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				// ヘッダ紐付けＮＯはcreateInsPurcHdrメソッドで設定
				// 紐付けＮＯはユーティリティ結果から設定し、getPurcDtlPegNoは使用しない
				purcDtlR.peg_no(utilDtl1R.peg_no());
				purcDtlR.arr_ptn_typ(arrSchdR.arr_ptn_typ());
				purcDtlR.po_d_no(podR.po_d_no());
				purcDtlR.purc_schd_no(purcSchdR.purc_schd_no());
				purcDtlR.arr_schd_no(arrSchdR.arr_schd_no());
				purcDtlR.mfg_inst_no(arrSchdR.mfg_inst_no());
				purcDtlR.itm_cd(podR.itm_cd());
				purcDtlR.itm_sub1(podR.itm_sub1());
				purcDtlR.itm_sub2(podR.itm_sub2());
				purcDtlR.itm_sub3(podR.itm_sub3());
				purcDtlR.itm_nm(podR.itm_nm());
				purcDtlR.sppl_itm_cd(podR.sppl_itm_cd());
				purcDtlR.sppl_itm_nm(podR.sppl_itm_nm());
				purcDtlR.sundry_itm_flg(podR.sundry_itm_flg());
				purcDtlR.trd_unit_cd(utilDtl1R.trd_unit_cd());
				purcDtlR.trd_unit_qty(utilDtl1R.trd_unit_qty());
				purcDtlR.base_unit_cd(podR.base_unit_cd());
				MAVM_ITM_UNIT_R trdItmUnitR = _itmUnitCache.get(purcDtlR.itm_cd(),
						purcDtlR.itm_sub1(), purcDtlR.itm_sub2(), purcDtlR.itm_sub3(),
						purcDtlR.trd_unit_cd());
				MAVM_ITM_UNIT_R baseItmUnitR = _itmUnitCache.get(purcDtlR.itm_cd(),
						purcDtlR.itm_sub1(), purcDtlR.itm_sub2(), purcDtlR.itm_sub3(),
						purcDtlR.base_unit_cd());
				purcDtlR.base_unit_qty(convToBaseUnit(purcDtlR.trd_unit_qty(),
						trdItmUnitR.conv_base_qty(), trdItmUnitR.conv_qty(),
						baseItmUnitR.dec_place(), baseItmUnitR.rnd_typ()));
				purcDtlR.interim_flg(podR.interim_flg());
				purcDtlR.trd_cur_upri(podR.trd_cur_upri());
				purcDtlR.dscnt_rsn_cd(podR.dscnt_rsn_cd());
				purcDtlR.trd_cur_dscnt_amt(podR.trd_cur_dscnt_amt());
				purcDtlR.tax_cd(podR.tax_cd());
				purcDtlR.wtax_rate(podR.wtax_rate());
				purcDtlR.maker_cd(podR.maker_cd());
				purcDtlR.ap_dpt_cd(podR.ap_dpt_cd());
				purcDtlR.pay_crryovr_times(podR.pay_crryovr_times());
				purcDtlR.bd_itm_cd(podR.bd_itm_cd());
				purcDtlR.bd_itm_sub1(podR.bd_itm_sub1());
				purcDtlR.bd_itm_sub2(podR.bd_itm_sub2());
				purcDtlR.bd_itm_sub3(podR.bd_itm_sub3());
				purcDtlR.bd_sno1(podR.bd_sno1());
				purcDtlR.bd_sno2(podR.bd_sno2());
				purcDtlR.bd_sno3(podR.bd_sno3());
				purcDtlR.bd_sno4(podR.bd_sno4());
				purcDtlR.bd_lot_no(podR.bd_lot_no());
				purcDtlR.bd_sublot_no(podR.bd_sublot_no());
				purcDtlR.bd_ctg_cd(podR.bd_ctg_cd());
				purcDtlR.bd_oper_cd(podR.bd_oper_cd());
				purcDtlR.bd_iv_no(podR.bd_iv_no());
				purcDtlR.bd_loc_cd(podR.bd_loc_cd());
				purcDtlR.bd_po_no(podR.bd_po_no());
				purcDtlR.bd_slo_no(podR.bd_slo_no());
				purcDtlR.stk_mng_typ(itmR.stk_mng_typ());
				purcDtlR.asset_mng_typ(itmR.asset_mng_typ());
				purcDtlR.rsn_cd(podR.purc_rsn_cd());
				purcDtlR.bd_dpt_cd(podR.bd_dpt_cd());
				purcDtlR.trd_d_rmrks(podR.trd_d_rmrks());
				purcDtlR.sno1(podR.sno1());
				purcDtlR.sno2(podR.sno2());
				purcDtlR.sno3(podR.sno3());
				purcDtlR.sno4(podR.sno4());
				purcDtlR.purc_id_typ(podR.purc_id_typ());
				purcDtlR.disp_seq(podR.disp_seq());

				// 明細に紐付くロット・サブロット・版がすべて同一の場合は設定する
				String maxLotNo = (String)purcIoSubL.max(Purc_Chk03_IoR.$lot_no);
				String minLotNo = (String)purcIoSubL.min(Purc_Chk03_IoR.$lot_no);
				String maxSubLotNo = (String)purcIoSubL.max(Purc_Chk03_IoR.$sublot_no);
				String minSubLotNo = (String)purcIoSubL.min(Purc_Chk03_IoR.$sublot_no);
				String maxVerNo = (String)purcIoSubL.max(Purc_Chk03_IoR.$ver_no);
				String minVerNo = (String)purcIoSubL.min(Purc_Chk03_IoR.$ver_no);
				if (isSame(maxLotNo, minLotNo) && isSame(maxSubLotNo, minSubLotNo) && isSame(maxVerNo, minVerNo)) {
					purcDtlR.lot_no(maxLotNo);
					purcDtlR.sublot_no(maxSubLotNo);
					purcDtlR.ver_no(maxVerNo);
				}
				// 明細に紐付く格付が同一の場合は設定する
				String col = Purc_Chk03_IoR.$gd_cd;
				String maxStr = (String)purcIoSubL.max(col);
				String minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.gd_cd(maxStr);
				}
				// 明細に紐付く良品区分が同一の場合は設定する
				col = Purc_Chk03_IoR.$quality_typ;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.quality_typ(maxStr);
				}
				// 明細に紐付く納入場所ＷＧが同一の場合は設定する
				col = Purc_Chk03_IoR.$dlv_loc_wg_cd;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.dlv_loc_wg_cd(maxStr);
				}
				// 明細に紐付く納入場所が同一の場合は設定する
				col = Purc_Chk03_IoR.$dlv_loc_cd;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.dlv_loc_cd(maxStr);
				}
				// 明細に紐付く棚・ラインが同一の場合は設定する
				col = Purc_Chk03_IoR.$str_ln_cd;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.str_ln_cd(maxStr);
				}
				// 明細に紐付く業者ロットが同一の場合は設定する
				col = Purc_Chk03_IoR.$bp_lot_no;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.bp_lot_no(maxStr);
				}
				// 明細に紐付く業者納品書ＮＯが同一の場合は設定する
				col = Purc_Chk03_IoR.$bp_dlv_slip_no;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.bp_dlv_slip_no(maxStr);
				}
				// 明細に紐付く業者納品書明細ＮＯが同一の場合は設定する
				col = Purc_Chk03_IoR.$bp_dlv_slip_d_no;
				maxStr = (String)purcIoSubL.max(col);
				minStr = (String)purcIoSubL.min(col);
				if (isSame(maxStr, minStr)) {
					purcDtlR.bp_dlv_slip_d_no(maxStr);
				}
				// 明細に紐付出荷元期限が同一の場合は設定する
				col = Purc_Chk03_IoR.$ship_fr_valid_dt;
				MCDate maxDt = (MCDate)purcIoSubL.max(col);
				MCDate minDt = (MCDate)purcIoSubL.min(col);
				if (isSame(maxDt, minDt)) {
					purcDtlR.ship_fr_valid_dt(maxDt);
				}

				// 仕入実績受払に設定されている実績日、計上日を仕入実績明細に設定（日付が異なる場合は別明細となるため、１件目の値を設定すれば問題ない）
				purcDtlR.setDateNE(PURC_DT_COL, purcIoR.getDateNE(PURC_DT_COL));
				purcDtlR.setDateNE(AC_DT_COL, purcIoR.getDateNE(AC_DT_COL));

				// 仕入実績ヘッダ作成時に発注ＮＯ、実績日、計上日でまとめるため、発注ＮＯを保持しておく
				purcDtlR.setStringNE(PO_NO_COL, podR.po_no());

				MAUCL_DptUtil.setDpt(purcDtlR, MST_PO_D_R.$ap_dpt_cd, null, AC_DT_COL, true);
				MAUCL_DptUtil.setDpt(purcDtlR, MST_PO_D_R.$bd_dpt_cd, null, AC_DT_COL, true);

				// 下り電文に設定するため、仕入実績明細の紐付けＮＯを明細コンテナに設定
				for (Purc_Chk03_IoR r : purcIoSubL) {
					InspAct_Chk03_DtlR dtlR = dtlL.getFirst(inspDtlKey, r.peg_no());
					dtlR.purc_dtl_peg_no(purcDtlR.peg_no());
				}

				purcDtlL.add(purcDtlR);
			}
			return purcDtlL;
		}

		/**
		 * 仕入実績明細から仕入実績ヘッダを作成
		 *   
		 */
		protected MCList<Purc_Chk03_HdrR> createInsPurcHdr(
				MCList<InspAct_Chk03_DtlR> dtlL, MCList<Purc_Chk03_DtlR> purcDtlL) {

			MCList<Purc_Chk03_HdrR> purcHdrL = MCList.create(Purc_Chk03_HdrR.class);
			MCIndexKey dtlKey = dtlL.createIndex(InspAct_Chk03_DtlR.$purc_dtl_peg_no);

			// 発注ＮＯ、実績日、計上日単位に仕入実績ヘッダをまとめる
			for (MCList<Purc_Chk03_DtlR> purcDtlSubL : purcDtlL.groupList(PO_NO_COL,
					PURC_DT_COL, AC_DT_COL)) {
				Purc_Chk03_DtlR purcDtlR = purcDtlSubL.get(0);
				MST_PO_R poR = _poCache.getCache(purcDtlR.getStringNE(PO_NO_COL));

				Purc_Chk03_HdrR purcHdrR = Purc_Chk03_HdrR.create();
				purcHdrR.setAttributes(up0().getFirst(_hdrKey,
						dtlL.getFirst(dtlKey, purcDtlR.peg_no()).hdr_peg_no()));
				purcHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				purcHdrR.peg_no(getPurcHdrPegNo());
				purcHdrR.trd_cd(poR.trd_cd());
				purcHdrR.trd_ptn_typ(poR.trd_ptn_typ());
				purcHdrR.po_no(poR.po_no());
				purcHdrR.purc_dpt_cd(poR.purc_dpt_cd());
				purcHdrR.purc_usr_cd(poR.purc_usr_cd());
				purcHdrR.wg_cd(poR.wg_cd());
				purcHdrR.sppl_cd(poR.sppl_cd());
				purcHdrR.trd_cur_cd(poR.trd_cur_cd());
				purcHdrR.trd_rmrks(poR.trd_rmrks());
				purcHdrR.tterm_cd1(poR.tterm_cd1());
				purcHdrR.tterm_rmrks1(poR.tterm_rmrks1());
				purcHdrR.tterm_cd2(poR.tterm_cd2());
				purcHdrR.tterm_rmrks2(poR.tterm_rmrks2());
				purcHdrR.tterm_cd3(poR.tterm_cd3());
				purcHdrR.tterm_rmrks3(poR.tterm_rmrks3());
				purcHdrR.purc_dt(purcDtlR.getDateNE(PURC_DT_COL));
				purcHdrR.ac_dt(purcDtlR.getDateNE(AC_DT_COL));
				purcHdrR.pay_basis_dt(purcHdrR.ac_dt());
				purcHdrR.xrate(poR.xrate());
				purcHdrR.ptax_xrate(poR.ptax_xrate());
				MAUCL_DptUtil.setDpt(purcHdrR, MST_PO_R.$purc_dpt_cd, null, Purc_Chk03_HdrR.$ac_dt, true);
				purcHdrL.add(purcHdrR);

				purcDtlSubL.setNumberNE(Purc_Chk03_DtlR.$hdr_peg_no, purcHdrR.peg_no());

				// 下り電文に設定するため、仕入実績ヘッダの紐付けＮＯを明細コンテナに設定
				for (Purc_Chk03_DtlR r : purcDtlSubL) {
					MCList<InspAct_Chk03_DtlR> dtlSubL = dtlL.subList(dtlKey, r.peg_no());
					dtlSubL.setNumberNE(InspAct_Chk03_DtlR.$purc_hdr_peg_no,
							purcHdrR.peg_no());
				}
			}

			return purcHdrL;
		}

		/**
		 * 訂正・取消の仕入実績登録サービスの電文を編集する
		 * @return
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 createUpdDelPurcChk03(
				MCList<InspAct_Chk03_DtlR> dtlL) {

			MSBDL_PurcActRegService.Purc_Chk03 o = MSBDL_PurcActRegService
					.crtPurc_Chk03();

			if (dtlL.isEmpty()) {
				return o;
			}

			// ここまでの処理でup1()に行追加される可能性があるため、ここでIndexを作成する
			_dtlKey = up1().createIndex(InspAct_Chk03_DtlR.$peg_no);
			_inspActNoKey = up1().createIndex(InspAct_Chk03_DtlR.$insp_act_no);
			_inspActDNoKey = up1().createIndex(InspAct_Chk03_DtlR.$insp_act_d_no);
			_inspJudgDNoKey = up1().createIndex(InspAct_Chk03_DtlR.$insp_judg_d_no);

			// コンテナ作成処理で上り電文の明細行を追加する場合のリストを初期化（直接up1()に追加するとIndexが使用できなくなるため）
			_addDtlL = MCList.create(InspAct_Chk03_DtlR.class);
			
			MCList<Purc_Chk03_HdrR> purcHdrL = MCList.create(Purc_Chk03_HdrR.class);
			MCList<Purc_Chk03_DtlR> purcDtlL = MCList.create(Purc_Chk03_DtlR.class);
			MCList<Purc_Chk03_IoR> purcIoL = MCList.create(Purc_Chk03_IoR.class);

			// 仕入実績ヘッダ、仕入実績明細、仕入実績受払のコンテナを作成
			createUpdDelPurcHdrDtlIo(dtlL, purcHdrL, purcDtlL, purcIoL);

			// 追加された明細行を上り電文に追加
			up1().addAll(_addDtlL);
			
			o.up0().addAll(purcHdrL);
			o.up1().addAll(purcDtlL);
			o.up2().addAll(purcIoL);
			return o;
		}

		/**
		 * 荷姿振替対象のdtlLから、新規登録時と同じPurc_Chk03_IoRのキャッシュを作成する
		 */
		protected FXUCL_Cache<MCList<Purc_Chk03_IoR>> createUpdXfrPurcIoCache(
				MCList<InspAct_Chk03_DtlR> dtlL) {

			FXUCL_Cache<MCList<Purc_Chk03_IoR>> retCache = new FXUCL_Cache<MCList<Purc_Chk03_IoR>>();
			retCache.setFixMaxCacheSize(-1);

			MCList<InspAct_Chk03_DtlR> tgtDtlL = MCList.create(InspAct_Chk03_DtlR.class);
			for (InspAct_Chk03_DtlR dtlR : dtlL) {
				MCList<InspAct_Chk03_PackXfrR> packXfrL = _packXfrQtyCache
						.getCache(dtlR.insp_no());
				// dtlRが荷姿振替の対象外の場合、処理対象外とする
				if (isNull(packXfrL) || packXfrL.isEmpty()) {
					continue;
				}
				// dtlRが削除行の場合、処理対象外とする
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					continue;
				}
				tgtDtlL.add(dtlR);
			}

			if (tgtDtlL.isEmpty()) {
				return retCache;
			}

			// 上り電文を元に仕入実績受払のリストを作成する
			MCList<Purc_Chk03_IoR> purcIoL = MCList.create(Purc_Chk03_IoR.class);
			purcIoL.addStringColumn(INSP_NO_COL);

			for (InspAct_Chk03_DtlR dtlR : tgtDtlL) {
				Purc_Chk03_IoR purcIoR = Purc_Chk03_IoR.create();
				purcIoR.peg_no(dtlR.peg_no());
				purcIoR.setStringNE(INSP_NO_COL, dtlR.insp_no());
				purcIoR.trd_unit_cd(dtlR.pack_unit_cd());
				purcIoR.trd_unit_qty(dtlR.pack_unit_qty());
				purcIoR.base_unit_cd(dtlR.base_unit_cd());
				purcIoR.base_unit_qty(dtlR.base_unit_qty());
				purcIoR.pack_unit_cd(dtlR.pack_unit_cd());
				purcIoR.pack_unit_qty(dtlR.pack_unit_qty());
				purcIoL.add(purcIoR);
			}

			// 荷姿振替数量を計算し必要に応じて仕入実績受払を追加する
			MCList<Purc_Chk03_IoR> addPurcIoL = MCList.create(Purc_Chk03_IoR.class);
			MCList<InspAct_Chk03_DtlR> addDtlL = MCList.create(InspAct_Chk03_DtlR.class);
			calcPackXfrQty(purcIoL, addPurcIoL, addDtlL, false);

			// 上り電文はここでは追加しない
			purcIoL.addAll(addPurcIoL);

			// 紐付けＮＯをキーにしたキャッシュを作成
			for (MCList<Purc_Chk03_IoR> purcIoSubL : purcIoL
					.groupList(Purc_Chk03_IoR.$peg_no)) {
				retCache.putCache(new MCNumber[] {
						purcIoSubL.get(0).peg_no()
				}, purcIoSubL);
			}
			
			return retCache;
		}
		
		/**
		 * 訂正・取消の仕入実績ヘッダ、仕入実績明細、仕入実績受払コンテナを作成する
		 */
		protected void createUpdDelPurcHdrDtlIo(MCList<InspAct_Chk03_DtlR> dtlL,
				MCList<Purc_Chk03_HdrR> purcHdrL, MCList<Purc_Chk03_DtlR> purcDtlL,
				MCList<Purc_Chk03_IoR> purcIoL) {

			FXUCL_Cache<MCList<Purc_Chk03_IoR>> xfrPurcIoCache = createUpdXfrPurcIoCache(dtlL);
			
			// 訂正・取消処理の元になるのは_purcActNoL（原則としてdtlLと_purcActNoLは1:1となっており、新規登録時の荷姿振替を行った場合のみ1:Nとなる）
			for (MCList<InspAct_Chk03_PurcActNoR> purcActNoL : _purcActNoL.groupList(
					InspAct_Chk03_PurcActNoR.$purc_act_no,
					InspAct_Chk03_PurcActNoR.$purc_act_seq)) {

				// 仕入実績ヘッダのコンテナを作成
				Purc_Chk03_HdrR purcHdrR = Purc_Chk03_HdrR.create();

				// １件目を取得
				InspAct_Chk03_PurcActNoR firstR = purcActNoL.get(0);

				// ヘッダ紐付けＮＯから上り電文のヘッダを取得する
				// 同じ仕入実績ヘッダに紐付く上り電文のヘッダが複数存在する（複数の検査実績をまとめて仕入実績を作成した）場合、１件目の上り電文の属性を引き継ぐ）
				InspAct_Chk03_HdrR hdrR = up0().getFirst(_hdrKey, firstR.hdr_peg_no());

				// 上り電文の属性を引き継ぐ
				purcHdrR.setAttributes(hdrR);

				// 紐付けＮＯは新規発番
				purcHdrR.peg_no(getPurcHdrPegNo());

				// データ更新区分は初期値として「更新」（明細がすべて削除された場合は後の処理で「削除」となる）
				purcHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

				// 仕入実績ヘッダのテーブルから値をコピー
				MST_PURC_ACT_R purcActTblR = _purcActCache.getCache(firstR.purc_act_no(),
						firstR.purc_act_seq());
				copyValue(purcHdrR, purcActTblR,
						createMap_Purc_Chk03_HdrR_MST_PURC_ACT_R());

				MCList<Purc_Chk03_DtlR> tmpPurcDtlL = MCList.create(Purc_Chk03_DtlR.class);
				MCList<Purc_Chk03_IoR> tmpPurcIoL = MCList.create(Purc_Chk03_IoR.class);

				// 仕入日、計上日を仕入実績受払に格納するためのカラム（すべて同じ日付かどうか判断するため）
				tmpPurcIoL.addDateColumn(PURC_DT_COL);
				tmpPurcIoL.addDateColumn(AC_DT_COL);

				// 仕入実績明細、仕入実績受払のコンテナを作成
				createUpdDelPurcDtlIo(hdrR, purcActTblR, purcHdrR, tmpPurcDtlL, tmpPurcIoL, xfrPurcIoCache);

				// 作成された仕入実績受払から削除行を除外
				MCList<Purc_Chk03_IoR> notDelL = tmpPurcIoL
						.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

				// ヘッダに紐付くすべての受払が削除の場合は明細のデータ更新区分を削除にする
				if (notDelL.isEmpty()) {
					purcHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					// ヘッダに紐付く受払の仕入日がすべて同じであればその値を設定
					// 一部の受払の日付が変更されている場合、同じヘッダに紐付く行をすべてエラーとする
					MCList<Purc_Chk03_IoR> purcDtL = notDelL.groupBy(PURC_DT_COL);
					if (purcDtL.size() == 1) {
						purcHdrR.purc_dt(purcDtL.get(0).getDateNE(PURC_DT_COL));
					}
					else {
						MCMessagePool.add(new MCMessage(hdrR, null, MSBFL0131,
								hdrR.insp_act_no(), toDispGUIIndex(hdrR)));
						purcHdrR.err_flg(true);
						hdrR.err_flg(true);
					}

					MCList<Purc_Chk03_IoR> acDtL = notDelL.groupBy(AC_DT_COL);
					if (acDtL.size() == 1) {
						purcHdrR.ac_dt(acDtL.get(0).getDateNE(AC_DT_COL));
						purcHdrR.pay_basis_dt(purcHdrR.ac_dt());
					}
					else {
						MCMessagePool.add(new MCMessage(hdrR, null, MSBFL0132,
								hdrR.insp_act_no(), toDispGUIIndex(hdrR)));
						purcHdrR.err_flg(true);
						hdrR.err_flg(true);
					}
				}

				// エラーがない場合は更新対象として追加
				if (!purcHdrR.err_flg()) {
					purcHdrL.add(purcHdrR);
					purcDtlL.addAll(tmpPurcDtlL);
					purcIoL.addAll(tmpPurcIoL);
				}

				// 下り電文に設定するため、仕入実績ヘッダの紐付けＮＯを明細コンテナに設定
				for (InspAct_Chk03_PurcActNoR purcActNoR : purcActNoL) {
					for (InspAct_Chk03_DtlR dtlR : up1().subList(_dtlKey,
							purcActNoR.peg_no())) {
						dtlR.purc_hdr_peg_no(purcHdrR.peg_no());
						// 同一のorg_peg_noを持つ_addDtlLにも設定する
						MCList<InspAct_Chk03_DtlR> addL = _addDtlL.subList(InspAct_Chk03_DtlR.$org_peg_no, dtlR.org_peg_no());
						if (!addL.isEmpty()) {
							addL.setNumberNE(InspAct_Chk03_DtlR.$purc_hdr_peg_no, purcHdrR.peg_no());
						}
					}
				}
			}
		}

		/**
		 * 訂正・取消の仕入実績明細、仕入実績受払コンテナを作成する
		 */
		protected void createUpdDelPurcDtlIo(InspAct_Chk03_HdrR hdrByPurcHdrR,
				MST_PURC_ACT_R purcActR, Purc_Chk03_HdrR purcHdrR,
				MCList<Purc_Chk03_DtlR> purcDtlL, MCList<Purc_Chk03_IoR> purcIoL,
				FXUCL_Cache<MCList<Purc_Chk03_IoR>> xfrPurcIoCache) {

			// 仕入実績ヘッダに紐付く仕入実績明細をすべて取得
			MCList<MST_PURC_ACT_D_R> purcActDL = _purcActDByPurcActNoCache
					.getCache(purcHdrR.purc_act_no(), purcHdrR.purc_act_seq());

			for (MST_PURC_ACT_D_R purcActDR : purcActDL) {

				// 仕入実績明細のコンテナを作成
				Purc_Chk03_DtlR purcDtlR = Purc_Chk03_DtlR.create();

				InspAct_Chk03_HdrR hdrR = hdrByPurcHdrR;

				// 仕入実績明細ＮＯから仕入実績ＮＯリストを取得
				MCList<InspAct_Chk03_PurcActNoR> purcActNoL = _purcActNoL.subList(
						_purcActDNoKey, purcActDR.purc_act_d_no(),
						purcActDR.purc_act_d_seq());
				if (!purcActNoL.isEmpty()) {
					// １件目を取得
					InspAct_Chk03_PurcActNoR firstR = purcActNoL.get(0);

					// ヘッダ紐付けＮＯから上り電文のヘッダを取得する
					// 同じ仕入実績明細に紐付く上り電文のヘッダが複数存在する（複数の検査実績をまとめて仕入実績を作成した）場合、１件目の上り電文の属性を引き継ぐ）
					hdrR = up0().getFirst(_hdrKey, firstR.hdr_peg_no());
				}
				
				// 上り電文の属性を引き継ぐ
				purcDtlR.setAttributes(hdrR);

				// 紐付けＮＯは新規発番
				purcDtlR.peg_no(getPurcDtlPegNo());
				purcDtlR.hdr_peg_no(purcHdrR.peg_no());

				// データ更新区分は初期値として「更新」（明細がすべて削除された場合は後の処理で「削除」となる）
				purcDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

				// 仕入実績明細のテーブルから値をコピー
				copyValue(purcDtlR, purcActDR,
						createMap_Purc_Chk03_DtlR_MST_PURC_ACT_D_R());

				MCList<Purc_Chk03_IoR> tmpPurcIoL = MCList.create(Purc_Chk03_IoR.class);

				// 仕入実績受払のコンテナを作成
				createUpdDelPurcIo(hdrR, purcActR, purcHdrR, purcDtlR, tmpPurcIoL, xfrPurcIoCache);

				// 作成された仕入実績受払から削除行を除外
				MCList<Purc_Chk03_IoR> notDelL = tmpPurcIoL
						.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

				// 明細に紐付くすべての受払が削除の場合は明細のデータ更新区分を削除にする
				if (notDelL.isEmpty()) {
					purcDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					// 削除行でない場合、受払のデータから明細の格付、良品、取引単位、基準単位を設定
					purcDtlR.gd_cd(notDelL.get(0).gd_cd());
					purcDtlR.quality_typ(notDelL.get(0).quality_typ());
					purcDtlR.trd_unit_qty(MCNumber.ZERO);
					purcDtlR.base_unit_qty(MCNumber.ZERO);

					// 仕入実績明細に紐づく仕入実績受払の中に取引単位が複数存在するかを確認するため、1レコード目の値を控える
					String ioTrdUnitCd = notDelL.get(0).trd_unit_cd();
					// 仕入実績受払の取引単位が一種類かどうか
					Boolean isIoTrdUnitCdOneKind = true;

					for (Purc_Chk03_IoR purcIoR : notDelL) {

						// 取引単位の複数存在確認
						if (!isSame(ioTrdUnitCd, purcIoR.trd_unit_cd())) {
							// 複数存在する場合は基準単位を使用するため、falseを設定する
							isIoTrdUnitCdOneKind = false;
						}

						// 格付
						if (!isNull(purcDtlR.gd_cd())) {
							if (!isSame(purcDtlR.gd_cd(), purcIoR.gd_cd())) {
								purcDtlR.gd_cd(null);
							}
						}

						// 良品区分
						if (!isNull(purcDtlR.quality_typ())) {
							if (!isSame(purcDtlR.quality_typ(), purcIoR.quality_typ())) {
								purcDtlR.quality_typ(null);
							}
						}

						// 基準単位数量
						purcDtlR.base_unit_qty(purcDtlR.base_unit_qty().add(purcIoR.base_unit_qty()));
					}
					// 品目単位マスタのキャッシュから、仕入実績明細の取引単位の情報を取得
					MAVM_ITM_UNIT_R dtlItmUnitR = _itmUnitCache.get(purcDtlR.itm_cd(), purcDtlR.itm_sub1(), purcDtlR.itm_sub2(), purcDtlR.itm_sub3(), purcDtlR.trd_unit_cd());
					
					// 基準単位数量を取引単位に換算し、取引単位数量に設定
					purcDtlR.trd_unit_qty(
						rvrsBaseUnitConv(
							purcDtlR.base_unit_qty(),		// 基準単位数量
							dtlItmUnitR.conv_base_qty(),	// 変換先単位の品目単位マスタの基準数
							dtlItmUnitR.conv_qty(),			// 変換先単位の品目単位マスタの単位換算数
							dtlItmUnitR.dec_place(),		// 変換先単位の品目単位マスタの小数部有効桁数
							dtlItmUnitR.rnd_typ(),			// 変換先単位の品目単位マスタの単位換算端数処理区分
							true							// 基準単位以外の単位へ単位換算する際に、端数が生じたらnullを返すかのフラグ
						)
					);
					
					if (isNull(purcDtlR.trd_unit_qty())) {
						// 取引単位数量がnull、つまり換算において端数が生じた場合、
						// 紐づく仕入実績受払の中に取引単位が複数存在するかどうかに応じて取引単位を変更
						if (isIoTrdUnitCdOneKind) {
							// 一種類の場合、仕入実績受払の取引単位に変更
							purcDtlR.trd_unit_cd(ioTrdUnitCd);
							purcDtlR.trd_unit_qty(notDelL.sum(Purc_Chk03_IoR.$trd_unit_qty));
						}
						else {
							// 複数存在する場合、基準単位に変更
							purcDtlR.trd_unit_cd(purcDtlR.base_unit_cd());
							purcDtlR.trd_unit_qty(purcDtlR.base_unit_qty());
						}
					}
				}
				
				// 仕入実績受払の入荷実績ＮＯから入荷予定を取得し、明細の入荷パタン区分を設定
				MST_ARR_SCHD_R arrSchdR = _arrSchdByActCache
						.getCache(tmpPurcIoL.get(0).arr_act_no());
				purcDtlR.arr_ptn_typ(arrSchdR.arr_ptn_typ());

				// 下り電文に設定するため、仕入実績明細の紐付けＮＯを明細コンテナに設定
				for (InspAct_Chk03_PurcActNoR purcActNoR : purcActNoL) {
					for (InspAct_Chk03_DtlR dtlR : up1().subList(_dtlKey,
							purcActNoR.peg_no())) {
						dtlR.purc_dtl_peg_no(purcDtlR.peg_no());
						// 同一のorg_peg_noを持つ_addDtlLにも設定する
						MCList<InspAct_Chk03_DtlR> addL = _addDtlL.subList(InspAct_Chk03_DtlR.$org_peg_no, dtlR.org_peg_no());
						if (!addL.isEmpty()) {
							addL.setNumberNE(InspAct_Chk03_DtlR.$purc_dtl_peg_no, purcDtlR.peg_no());
						}
					}
				}

				// 仕入実績明細の登録対象リストに追加
				purcDtlL.add(purcDtlR);
				purcIoL.addAll(tmpPurcIoL);
			}
		}
	
		/**
		 * 訂正・取消の仕入実績受払コンテナを作成する
		 */
		protected void createUpdDelPurcIo(InspAct_Chk03_HdrR hdrByPurcDtlR,
				MST_PURC_ACT_R purcActR, Purc_Chk03_HdrR purcHdrR,
				Purc_Chk03_DtlR purcDtlR, MCList<Purc_Chk03_IoR> purcIoL,
				FXUCL_Cache<MCList<Purc_Chk03_IoR>> xfrPurcIoCache) {

			// 仕入実績明細に紐付くすべての仕入実績受払を取得
			MCList<MST_PURC_ACT_IO_R> purcActIoL = _purcActIoByPurcActDNoCache
					.getCache(purcDtlR.purc_act_d_no(), purcDtlR.purc_act_d_seq());

			for (MST_PURC_ACT_IO_R purcActIoR : purcActIoL) {
				// 同じ検査実績ＮＯ、検査実績明細ＮＯ、検査判定明細ＮＯを持つ上り電文を抽出
				InspAct_Chk03_DtlR dtlR = getDtlByPurcActIo(purcActIoR);
				
				// 同じ検査実績ＮＯ、検査実績明細ＮＯ、検査判定明細ＮＯを持つ仕入実績受払を抽出
				MST_PURC_ACT_IO_R samePurcActIoR = getPurcActIoByPurcActIo(purcActIoR);
				
				if (isNull(dtlR)) {
					// 上り電文に存在しない場合はテーブルの値そのままで更新
					purcIoL.add(createUpdPurcIo(hdrByPurcDtlR, purcActR, purcDtlR, purcActIoR));
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					purcIoL.add(createDelPurcIo(up0().getFirst(_hdrKey, dtlR.hdr_peg_no()), dtlR, purcDtlR, purcActIoR));
				}
				else {
					InspAct_Chk03_HdrR hdrR = up0().getFirst(_hdrKey, dtlR.hdr_peg_no());
					// 荷姿振替対象のキャッシュから明細の紐付けＮＯが同じ行を抽出
					MCList<Purc_Chk03_IoR> xfrL = xfrPurcIoCache.getCache(dtlR.org_peg_no());
					
					if (isNull(xfrL) || xfrL.isEmpty()) {
						// 荷姿振替対象でない（荷姿単位の行と基準単位の行を２行作成する必要がない）場合
						if (isNull(samePurcActIoR)) {
							// 同じ検査ｘｘＮＯを持つ別のレコードが存在しない場合、上り電文の値で更新
							purcIoL.add(createUpdPurcIo(purcActR, dtlR, purcDtlR, purcActIoR));
							
						}
						else {
							// 同じ検査ｘｘＮＯを持つ別のレコードが存在する場合
							if (hdrR.in_prmt_insp_flg() || isSame(purcActIoR.trd_unit_cd(), dtlR.pack_unit_cd())) {
								// 自分自身の取引単位と上り電文の荷姿単位が等しい場合、上り電文の値で更新（検査中ロット使用許可の場合は荷姿単位がnullとなる場合があるため、常にこちら）
								purcIoL.add(createUpdPurcIo(purcActR, dtlR, purcDtlR, purcActIoR));
							}
							else {
								// 自分自身の取引単位と上り電文の荷姿単位が異なる場合、削除（同じ検査ｘｘＮＯを持つ別のレコードの処理時に更新される）
								purcIoL.add(createDelPurcIo(hdrR, dtlR, purcDtlR, purcActIoR));
							}
						}
					}
					else if (xfrL.size() == 1) {
						// 荷姿振替対象の行が１行（全数荷姿振替）の場合
						// 荷姿振替対象でない（荷姿単位の行と基準単位の行を２行作成する必要がない）場合
						Purc_Chk03_IoR xfrR = xfrL.get(0);
						if (isNull(samePurcActIoR)) {
							// 同じ検査ｘｘＮＯを持つ別のレコードが存在しない場合、上り電文の値と荷姿振替の数量で更新
							purcIoL.add(createUpdPurcIo(purcActR, dtlR, purcDtlR, purcActIoR, xfrR));
						}
						else {
							// 同じ検査ｘｘＮＯを持つ別のレコードが存在する場合
							if (isSame(purcActIoR.trd_unit_cd(), xfrR.trd_unit_cd())) {
								// 自分自身の取引単位と荷姿振替対象の荷姿単位が等しい場合、上り電文の値と荷姿振替の数量で更新
								purcIoL.add(createUpdPurcIo(purcActR, dtlR, purcDtlR, purcActIoR, xfrR));
							}
							else {
								// 自分自身の取引単位と上り電文の荷姿単位が異なる場合、削除（同じ検査ｘｘＮＯを持つ別のレコードの処理時に更新される）
								purcIoL.add(createDelPurcIo(hdrR, dtlR, purcDtlR, purcActIoR));
							}
						}
					}
					else {
						// 荷姿振替対象の行が２行（荷姿単位＋基準単位）の場合
						for (Purc_Chk03_IoR xfrR : xfrL) {
							if (isSame(purcActIoR.trd_unit_cd(), xfrR.trd_unit_cd())) {
								// 自分自身と荷姿振替対象の荷姿単位が同じ場合、更新
								purcIoL.add(createUpdPurcIo(purcActR, dtlR, purcDtlR, purcActIoR, xfrR));
							}
							else if (!isNull(samePurcActIoR)) {
								// 自分自身とは荷姿単位が異なるが、同じ検査ｘｘＮＯを持つ別のレコードが存在する場合、別レコード側で更新するため何もしない
								// ※本来であれば別のレコードの取引単位を比較する必要があるが、自分自身と異なる場合は別レコードとは一致するはずなので、比較しない
							}
							else {
								// 別のレコードが存在せず、自分自身とも異なる場合、追加
								purcIoL.add(createInsPurcIo(purcActR, dtlR, purcDtlR, purcActIoR, xfrR));
							}
						}
					}
				}
			}
		}

		/**
		 * 仕入実績受払テーブルから更新用の仕入実績受払コンテナを作成する
		 */
		protected Purc_Chk03_IoR createUpdPurcIo(InspAct_Chk03_HdrR hdrR, MST_PURC_ACT_R purcActR, Purc_Chk03_DtlR purcDtlR, MST_PURC_ACT_IO_R purcActIoR) {

			Purc_Chk03_IoR purcIoR = Purc_Chk03_IoR.create();

			// 上り電文の属性を引き継ぐ（上り電文が存在しないため、同じ仕入実績ヘッダに紐付く他の上り電文を設定している）
			purcIoR.setAttributes(hdrR);

			// 仕入実績受払のテーブルから値をコピー
			copyValue(purcIoR, purcActIoR,
					createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl());

			// 仕入日、計上日には訂正前の仕入実績ヘッダの値
			purcIoR.setDateNE(PURC_DT_COL, purcActR.purc_dt());
			purcIoR.setDateNE(AC_DT_COL, purcActR.ac_dt());
			
			// 出荷元期限
			purcIoR.ship_fr_valid_dt(getShipFrValidDt(purcIoR));

			// データ更新区分は「更新」
			purcIoR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			// 紐付けＮＯは上り電文の明細の紐付けＮＯとして発番
			purcIoR.peg_no(getDtlPegNo());
			
			// 明細紐付けＮＯ
			purcIoR.dtl_peg_no(purcDtlR.peg_no());
			
			// 上り電文の明細行を追加（下り電文に設定するため)
			InspAct_Chk03_DtlR dtlR = InspAct_Chk03_DtlR.create();
			dtlR.peg_no(purcIoR.peg_no());
			dtlR.hdr_peg_no(hdrR.peg_no());
			dtlR.purc_io_peg_no(purcIoR.peg_no());
			_addDtlL.add(dtlR);
			
			return purcIoR;
		}

		/**
		 * 仕入実績受払テーブルと上り電文から更新用の仕入実績受払コンテナを作成する
		 */
		protected Purc_Chk03_IoR createUpdPurcIo(MST_PURC_ACT_R purcActR,
				InspAct_Chk03_DtlR dtlR, Purc_Chk03_DtlR purcDtlR,
				MST_PURC_ACT_IO_R purcActIoR) {

			InspAct_Chk03_HdrR hdrR = up0().getFirst(_hdrKey, dtlR.hdr_peg_no());

			// 上り電文のデータ更新区分が削除の場合、削除のコンテナを作成する
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				return createDelPurcIo(hdrR, dtlR, purcDtlR, purcActIoR);
			}

			Purc_Chk03_IoR purcIoR = Purc_Chk03_IoR.create();

			// 上り電文の属性を引き継ぐ
			purcIoR.setAttributes(hdrR);

			// 上り電文の明細、仕入実績受払のテーブルから値を設定
			if (hdrR.in_prmt_insp_flg()) {
				// 検査中ロット使用許可の場合
				copyValue(purcIoR, dtlR,
						createMap_Purc_Chk03_IoR_InspAct_Chk03_DtlR_NoDtl());
				copyValue(purcIoR, purcActIoR,
						createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl());
			}
			else {
				// 上記以外の場合
				copyValue(purcIoR, dtlR,
						createMap_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Upd());
				// 仕入実績受払のテーブルから値をコピー
				copyValue(purcIoR, purcActIoR,
						createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R());
			}

			// 仕入日、計上日は上り電文から設定
			purcIoR.setDateNE(PURC_DT_COL, getPurcDt(hdrR));
			purcIoR.setDateNE(AC_DT_COL, getAcDt(hdrR, dtlR));

			// 出荷元期限
			purcIoR.ship_fr_valid_dt(getShipFrValidDt(purcIoR));

			// データ更新区分は「更新」
			purcIoR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			// 明細紐付けＮＯ
			purcIoR.dtl_peg_no(purcDtlR.peg_no());

			// 下り電文に設定するため、仕入実績受払の紐付けＮＯを明細コンテナに設定
			dtlR.purc_io_peg_no(purcIoR.peg_no());

			return purcIoR;
		}
		
		/**
		 * 仕入実績受払テーブルと上り電文と荷姿振替数量から更新用の仕入実績受払コンテナを作成する
		 */
		protected Purc_Chk03_IoR createUpdPurcIo(MST_PURC_ACT_R purcActR,
				InspAct_Chk03_DtlR dtlR, Purc_Chk03_DtlR purcDtlR,
				MST_PURC_ACT_IO_R purcActIoR, Purc_Chk03_IoR xfrR) {

			// 最初に上り電文から仕入実績受払を作成
			Purc_Chk03_IoR purcIoR = createUpdPurcIo(purcActR, dtlR, purcDtlR, purcActIoR);
			
			// 次に荷姿振替数量から数量を更新
			purcIoR.base_unit_cd(xfrR.base_unit_cd());
			purcIoR.base_unit_qty(xfrR.base_unit_qty());
			purcIoR.trd_unit_cd(xfrR.trd_unit_cd());
			purcIoR.trd_unit_qty(xfrR.trd_unit_qty());
			purcIoR.pack_unit_cd(xfrR.pack_unit_cd());
			purcIoR.pack_unit_qty(xfrR.pack_unit_qty());
			
			return purcIoR;
		}
		
		/**
		 * 仕入実績受払テーブルと上り電文から新規登録用（仕入実績ヘッダ・明細は更新）の仕入実績受払コンテナを作成する
		 */
		protected Purc_Chk03_IoR createInsPurcIo(MST_PURC_ACT_R purcActR,
				InspAct_Chk03_DtlR dtlR, Purc_Chk03_DtlR purcDtlR,
				MST_PURC_ACT_IO_R purcActIoR, Purc_Chk03_IoR xfrR) {

			// 新規登録だが、元となる仕入実績受払（取引単位違いの仕入実績受払）が存在するので、その仕入実績受払と上り電文を元に、更新時と同様にコンテナを作成する
			Purc_Chk03_IoR purcIoR = createUpdPurcIo(purcActR, dtlR, purcDtlR,
					purcActIoR, xfrR);

			// データ更新区分を「新規」に変更
			purcIoR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			// 紐付けＮＯを発番しなおす
			purcIoR.peg_no(getDtlPegNo());

			// 仕入実績受払ＮＯ、連番をクリア
			purcIoR.purc_act_io_no(null);
			purcIoR.purc_act_io_seq(null);

			// 下り電文に設定するため、仕入実績受払の紐付けＮＯを明細コンテナに設定
			InspAct_Chk03_DtlR addR = dtlR.clone();
			addR.peg_no(purcIoR.peg_no());
			addR.purc_io_peg_no(purcIoR.peg_no());
			_addDtlL.add(addR);
			
			return purcIoR;
		}

		/**
		 * 仕入実績受払テーブルと上り電文から削除用の仕入実績受払コンテナを作成する
		 */
		protected Purc_Chk03_IoR createDelPurcIo(InspAct_Chk03_HdrR hdrR, InspAct_Chk03_DtlR dtlR, Purc_Chk03_DtlR purcDtlR, MST_PURC_ACT_IO_R purcActIoR) {

			Purc_Chk03_IoR purcIoR = Purc_Chk03_IoR.create();

			// 上り電文の属性を引き継ぐ（
			purcIoR.setAttributes(hdrR);

			// 仕入実績受払のテーブルから値を設定
			copyValue(purcIoR, purcActIoR,
					createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl());

			// データ更新区分は「削除」
			purcIoR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

			// 紐付けＮＯは上り電文の明細の紐付けＮＯとして発番
			purcIoR.peg_no(getDtlPegNo());
			
			// 明細紐付けＮＯ
			purcIoR.dtl_peg_no(purcDtlR.peg_no());
			
			if (isNull(dtlR)) {
				// 上り電文の明細行を追加（下り電文に設定するため)
				InspAct_Chk03_DtlR addR = InspAct_Chk03_DtlR.create();
				addR.peg_no(purcIoR.peg_no());
				addR.hdr_peg_no(hdrR.peg_no());
				addR.purc_io_peg_no(purcIoR.peg_no());
				_addDtlL.add(addR);
			}
			else {
				// 下り電文に設定するため、仕入実績受払の紐付けＮＯを明細コンテナに設定
				dtlR.purc_io_peg_no(purcIoR.peg_no());
			}
			
			return purcIoR;
		}
		
		/**
		 * 出荷元期限を取得する
		 */
		protected MCDate getShipFrValidDt(Purc_Chk03_IoR purcIoR) {
			// 出荷元期限は入荷実績より取得
			MST_ARR_ACT_R arrAct = _arrActCache.getCache(purcIoR.arr_act_no());
			return arrAct.ship_fr_valid_dt();
		}
		
		/**
		 * 仕入実績受払に設定された検査実績明細ＮＯ、検査判定明細ＮＯ、検査実績ＮＯから、上り電文の明細行を返す
		 */
		protected InspAct_Chk03_DtlR getDtlByPurcActIo(MST_PURC_ACT_IO_R purcActIoR) {
			MCList<InspAct_Chk03_DtlR> dtlL = MCList.create(InspAct_Chk03_DtlR.class);
			if (!isNull(purcActIoR.insp_act_d_no())) {
				dtlL = up1().subList(_inspActDNoKey, purcActIoR.insp_act_d_no());
			}
			if (!isNull(purcActIoR.insp_judg_d_no())) {
				dtlL = up1().subList(_inspJudgDNoKey, purcActIoR.insp_judg_d_no());
			}
			if (!isNull(purcActIoR.insp_act_no())) {
				dtlL = up1().subList(_inspActNoKey, purcActIoR.insp_act_no());
			}
			if (isNull(dtlL) || dtlL.isEmpty()) {
				return null;
			}
			// 取得した明細行のうち、未処理のもの（仕入実績受払紐付けＮＯが未設定のもの）を返す
			for (InspAct_Chk03_DtlR dtlR : dtlL) {
				if (isNull(dtlR.purc_io_peg_no())) {
					return dtlR;
				}
			}
			// 未設定の行が存在しない場合、１行目をコピーして新規行を作成して返す
			InspAct_Chk03_DtlR addR = dtlL.get(0).clone();
			addR.peg_no(getDtlPegNo());
			_addDtlL.add(addR);
			return addR;
		}
		
		/**
		 * 仕入実績登録サービスのチェック結果（エラーフラグ）を設定する
		 * @param o
		 */
		protected void setErrFLg(MSBDL_PurcActRegService.Purc_Chk03 o) {
			MCIndexKey purcDtlKey = o.up1().createIndex(Purc_Chk03_DtlR.$hdr_peg_no);
			MCIndexKey purcIoKey = o.up2().createIndex(Purc_Chk03_IoR.$dtl_peg_no);
			MCIndexKey dtlKey = up1().createIndex(InspAct_Chk03_DtlR.$purc_io_peg_no);
			// Purc_Chk03のHdr、Dtl、Ioブロックに設定されたエラーフラグを、上り電文のHdrブロックに集約させる
			for (Purc_Chk03_HdrR purcHdrR : o.up0()) {
				for (Purc_Chk03_DtlR purcDtlR : o.up1().subList(purcDtlKey, purcHdrR.peg_no())) {
					for (Purc_Chk03_IoR purcIoR : o.up2().subList(purcIoKey, purcDtlR.peg_no())) {
						if (purcIoR.err_flg() || purcDtlR.err_flg() || purcHdrR.err_flg()) {
							InspAct_Chk03_DtlR dtlR = up1().getFirst(dtlKey, purcIoR.peg_no());
							if (!isNull(dtlR)) {
								InspAct_Chk03_HdrR hdrR = up0().getFirst(_hdrKey, dtlR.hdr_peg_no());
								if (!isNull(hdrR)) {
									hdrR.err_flg(true);
								}
							}
						}
					}
				}
			}
		}

		protected void setDown() {
			down0().addAll(up0());
			// Upd05にup1()を渡すためのキャッシュを作成する（処理対象となった＝仕入実績ヘッダ紐付けＮＯが設定されている）
			initCacheForUpd05(up1().subList(r -> !isNull(r.purc_hdr_peg_no())));
		}

		/**
		 * 上り電文の明細コンテナから仕入実績受払コンテナを作成する（新規登録）
		 * @return
		 */
		protected Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Ins<Purc_Chk03_IoR,InspAct_Chk03_DtlR> createMap_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Ins() {
			return new Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Ins<Purc_Chk03_IoR, InspAct_Chk03_DtlR>();
		}

		public class Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Ins<D extends Purc_Chk03_IoR, S extends InspAct_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, InspAct_Chk03_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$gi_loc_cd, InspAct_Chk03_DtlR.$loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_str_ln_cd, InspAct_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_unit_cd, InspAct_Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, InspAct_Chk03_DtlR.$loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, InspAct_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, InspAct_Chk03_DtlR.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, InspAct_Chk03_DtlR.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$from_gd_cd, InspAct_Chk03_DtlR.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, InspAct_Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, InspAct_Chk03_DtlR.$pack_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, InspAct_Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, InspAct_Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$pack_unit_cd, InspAct_Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$pack_unit_qty, InspAct_Chk03_DtlR.$pack_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				InspAct_Chk03_HdrR hdr = up0().getFirst(_hdrKey, src.hdr_peg_no());
				MST_ARR_ACT_R arrAct = _arrActCache.getCache(src.fix_no());
				MST_PO_D_R pod = _podCache.getCache(hdr.src_no1());
				MAM_LOC_R loc = _locCache.getCache(src.loc_cd());

				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.dtl_peg_no(null); // 仕入実績明細の作成時に設定する
				dest.arr_act_no(arrAct.arr_act_no());
				dest.ver_no(hdr.ver_no());
				dest.gd_cd(getGdCd(src));
				dest.quality_typ(getQualityTyp(src));
				dest.gi_wg_cd(loc.wg_cd());
				dest.dlv_loc_wg_cd(loc.wg_cd());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); 
				dest.stk_id_typ(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value());
				dest.bp_lot_no(arrAct.bp_lot_no());
				dest.bp_dlv_slip_no(arrAct.bp_dlv_slip_no());
				dest.bp_dlv_slip_d_no(arrAct.bp_dlv_slip_d_no());
				dest.ship_fr_valid_dt(arrAct.ship_fr_valid_dt());
				// 後続の処理で使用するため、発注明細ＮＯ、入荷予定ＮＯを保持しておく
				dest.setStringNE(PO_D_NO_COL, pod.po_d_no());
				dest.setStringNE(ARR_SCHD_NO_COL, arrAct.arr_schd_no());
				
				// 明細まとめで同一明細にまとめられるかどうか判断するため、仕入日と計上日を取得して保持しておく
				dest.setDateNE(PURC_DT_COL, getPurcDt(hdr));
				dest.setDateNE(AC_DT_COL, getAcDt(hdr, src));
				
				// 上り電文の検査ＮＯ単位に荷姿振替数量を計算するため、保持しておく
				dest.setStringNE(INSP_NO_COL, hdr.insp_no());
			}
		}
		
		/**
		 * 仕入実績登録サービスの仕入実績受払コンテナからユーティリティのヘッダコンテナを作成する（新規登録）
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<ConvQtyAmtUtil_Calc01_HdrR,MST_PO_D_R> createMap_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R() {
			return new Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<ConvQtyAmtUtil_Calc01_HdrR, MST_PO_D_R>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_HdrR_MST_PO_D_R<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends MST_PO_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, MST_PO_D_R.$trd_unit_cd);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, MST_PO_D_R.$trd_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_PO_R po = _poCache.getCache(src.po_no());
				MAM_BP_R bp = _bpCache.get(po.sppl_cd());
				MAM_ITM_R itm = _itmCache.get(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = _itmUnitCache.get(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
				dest.slip_each_lot_typ(bp.purc_slip_each_lot_typ());
				dest.base_unit_dec_place(itm.dec_place());
				dest.base_unit_rnd_typ(itm.rnd_typ());
				dest.trd_unit_conv_qty(itmUnitR.conv_qty());
				dest.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
			}
		}

		/**
		 * 仕入実績登録サービスの仕入実績受払コンテナからユーティリティの明細２コンテナを作成する（新規登録）
		 * @return
		 */
		protected Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Chk03_IoR<ConvQtyAmtUtil_Calc01_Dtl2R,Purc_Chk03_IoR> createMap_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Chk03_IoR() {
			return new Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Chk03_IoR<ConvQtyAmtUtil_Calc01_Dtl2R, Purc_Chk03_IoR>();
		}

		public class Map_ConvQtyAmtUtil_Calc01_Dtl2R_Purc_Chk03_IoR<D extends ConvQtyAmtUtil_Calc01_Dtl2R, S extends Purc_Chk03_IoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$peg_no, Purc_Chk03_IoR.$peg_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$lot_no, Purc_Chk03_IoR.$lot_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$sublot_no, Purc_Chk03_IoR.$sublot_no);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_qty, Purc_Chk03_IoR.$trd_unit_qty);
				addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl2R.$trd_unit_cd, Purc_Chk03_IoR.$trd_unit_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 仕入実績明細作成ユーティリティに渡す上り電文（詳細）を作成する
				MST_PO_D_R pod = _podCache.getCache(src.getStringNE(PO_D_NO_COL));
				MST_PURC_SCHD_R purcSchd = _purcSchdCache.getCache(src.getStringNE(ARR_SCHD_NO_COL));
				MAVM_ITM_UNIT_R itmUnit = _itmUnitCache.get(pod.itm_cd(), pod.itm_sub1(), pod.itm_sub2(), pod.itm_sub3(), src.trd_unit_cd());
				MAVM_ITM_UNIT_R schdItmUnit = _itmUnitCache.get(pod.itm_cd(), pod.itm_sub1(), pod.itm_sub2(), pod.itm_sub3(), purcSchd.trd_unit_cd());
				// 明細は最大でも仕入予定ＮＯ単位の分割単位とする
				dest.grp_no(purcSchd.purc_schd_no());
				// 入荷実績が計上済の場合は0を設定する
				dest.grp_no2("0");
				dest.trd_unit_conv_qty(itmUnit.conv_qty());
				dest.trd_unit_conv_base_qty(itmUnit.conv_base_qty());
				dest.schd_trd_unit_cd(purcSchd.trd_unit_cd());
				dest.schd_trd_unit_conv_qty(schdItmUnit.conv_qty());
				dest.schd_trd_unit_conv_base_qty(schdItmUnit.conv_base_qty());
				dest.schd_trd_unit_dec_place(schdItmUnit.dec_place());
				dest.schd_trd_unit_rnd_typ(schdItmUnit.rnd_typ());
				dest.hdr_peg_no(src.getNumberNE(UTIL_HDR_PEG_NO_COL));
			}
		}

		/**
		 * ユーティリティの明細１コンテナから仕入実績登録サービスの仕入実績明細コンテナからを作成する（新規登録）
		 * @return
		 */
		protected Map_Purc_Chk03_DtlR_ConvQtyAmtUtil_Calc01_Dtl1R<Purc_Chk03_DtlR,ConvQtyAmtUtil_Calc01_Dtl1R> createMap_Purc_Chk03_DtlR_ConvQtyAmtUtil_Calc01_Dtl1R() {
			return new Map_Purc_Chk03_DtlR_ConvQtyAmtUtil_Calc01_Dtl1R<Purc_Chk03_DtlR, ConvQtyAmtUtil_Calc01_Dtl1R>();
		}

		public class Map_Purc_Chk03_DtlR_ConvQtyAmtUtil_Calc01_Dtl1R<D extends Purc_Chk03_DtlR, S extends ConvQtyAmtUtil_Calc01_Dtl1R> extends MCRowMapper<D,S>{
			protected String _arr_act_no;
			protected void setWith(String arr_act_no) {
				_arr_act_no = arr_act_no;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$hdr_peg_no, ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$peg_no, ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no);
				addColumnPathMap(Purc_Chk03_DtlR.$lot_no, ConvQtyAmtUtil_Calc01_Dtl1R.$lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, ConvQtyAmtUtil_Calc01_Dtl1R.$sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$base_cur_tax_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_tax_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$ptax_cur_tax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_rate);
				addColumnPathMap(Purc_Chk03_DtlR.$wtax_amt, ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt);
			}
		}

		/**
		 * 上り電文の明細コンテナから仕入実績受払コンテナを作成する（訂正・取消）
		 * @return
		 */
		protected Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Upd<Purc_Chk03_IoR,InspAct_Chk03_DtlR> createMap_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Upd() {
			return new Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Upd<Purc_Chk03_IoR, InspAct_Chk03_DtlR>();
		}

		public class Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_Upd<D extends Purc_Chk03_IoR, S extends InspAct_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$data_crud_typ, InspAct_Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, InspAct_Chk03_DtlR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, InspAct_Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, InspAct_Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, InspAct_Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, InspAct_Chk03_DtlR.$pack_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$pack_unit_cd, InspAct_Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$pack_unit_qty, InspAct_Chk03_DtlR.$pack_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.gd_cd(getGdCd(src));
				dest.quality_typ(getQualityTyp(src));
			}
		}

		/**
		 * 上り電文の明細コンテナから仕入実績受払コンテナを作成する（ヘッダから補完された明細）
		 * @return
		 */
		protected Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_NoDtl<Purc_Chk03_IoR,InspAct_Chk03_DtlR> createMap_Purc_Chk03_IoR_InspAct_Chk03_DtlR_NoDtl() {
			return new Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_NoDtl<Purc_Chk03_IoR, InspAct_Chk03_DtlR>();
		}

		public class Map_Purc_Chk03_IoR_InspAct_Chk03_DtlR_NoDtl<D extends Purc_Chk03_IoR, S extends InspAct_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$data_crud_typ, InspAct_Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, InspAct_Chk03_DtlR.$peg_no);
				// ヘッダから補完された明細は数量を持っていないため、上り電文からは補完しない
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.gd_cd(getGdCd(src));
				dest.quality_typ(getQualityTyp(src));
			}
		}

		/**
		 * 仕入実績ヘッダテーブルから仕入実績ヘッダコンテナを作成する（訂正・取消）
		 * @return
		 */
		protected Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<Purc_Chk03_HdrR,MST_PURC_ACT_R> createMap_Purc_Chk03_HdrR_MST_PURC_ACT_R() {
			return new Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<Purc_Chk03_HdrR, MST_PURC_ACT_R>();
		}

		public class Map_Purc_Chk03_HdrR_MST_PURC_ACT_R<D extends Purc_Chk03_HdrR, S extends MST_PURC_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, MST_PURC_ACT_R.$purc_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, MST_PURC_ACT_R.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, MST_PURC_ACT_R.$trd_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, MST_PURC_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$po_no, MST_PURC_ACT_R.$po_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_dpt_cd, MST_PURC_ACT_R.$purc_dpt_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_usr_cd, MST_PURC_ACT_R.$purc_usr_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$wg_cd, MST_PURC_ACT_R.$wg_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$sppl_cd, MST_PURC_ACT_R.$sppl_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$asppl_cd, MST_PURC_ACT_R.$asppl_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$bsppl_cd, MST_PURC_ACT_R.$bsppl_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$psppl_cd, MST_PURC_ACT_R.$psppl_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$cred_cd, MST_PURC_ACT_R.$cred_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cur_cd, MST_PURC_ACT_R.$trd_cur_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_cur_cd, MST_PURC_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$base_cur_cd, MST_PURC_ACT_R.$base_cur_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$xrate_cd, MST_PURC_ACT_R.$xrate_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$xrate, MST_PURC_ACT_R.$xrate);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_dt, MST_PURC_ACT_R.$purc_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, MST_PURC_ACT_R.$ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, MST_PURC_ACT_R.$ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_xrate, MST_PURC_ACT_R.$ptax_xrate);
				addColumnPathMap(Purc_Chk03_HdrR.$pay_basis_dt, MST_PURC_ACT_R.$pay_basis_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$pay_schd_dt, MST_PURC_ACT_R.$pay_schd_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, MST_PURC_ACT_R.$ptax_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_no, MST_PURC_ACT_R.$rcpt_iv_no);
				addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_mng_no, MST_PURC_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(Purc_Chk03_HdrR.$rcpt_iv_rev, MST_PURC_ACT_R.$rcpt_iv_rev);
				addColumnPathMap(Purc_Chk03_HdrR.$ref_rcpt_iv_no, MST_PURC_ACT_R.$ref_rcpt_iv_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_ret_act_no, MST_PURC_ACT_R.$purc_ret_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_ret_act_rev, MST_PURC_ACT_R.$purc_ret_act_rev);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd1, MST_PURC_ACT_R.$tterm_cd1);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks1, MST_PURC_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd2, MST_PURC_ACT_R.$tterm_cd2);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks2, MST_PURC_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_cd3, MST_PURC_ACT_R.$tterm_cd3);
				addColumnPathMap(Purc_Chk03_HdrR.$tterm_rmrks3, MST_PURC_ACT_R.$tterm_rmrks3);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_rmrks, MST_PURC_ACT_R.$trd_rmrks);
				addColumnPathMap(Purc_Chk03_HdrR.$intr_rmrks, MST_PURC_ACT_R.$intr_rmrks);
				addColumnPathMap(Purc_Chk03_HdrR.$adjst_dt, MST_PURC_ACT_R.$adjst_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_adjst_typ, MST_PURC_ACT_R.$purc_adjst_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$adjst_mtd_typ, MST_PURC_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_adjst_flg, MST_PURC_ACT_R.$purc_adjst_flg);
				addColumnPathMap(Purc_Chk03_HdrR.$sub_char1, MST_PURC_ACT_R.$sub_char1);
				addColumnPathMap(Purc_Chk03_HdrR.$sub_char2, MST_PURC_ACT_R.$sub_char2);
				addColumnPathMap(Purc_Chk03_HdrR.$sub_char3, MST_PURC_ACT_R.$sub_char3);
			}
		}

		/**
		 * 仕入実績明細テーブルから仕入実績明細コンテナを作成する（訂正・取消）
		 * @return
		 */
		protected Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<Purc_Chk03_DtlR,MST_PURC_ACT_D_R> createMap_Purc_Chk03_DtlR_MST_PURC_ACT_D_R() {
			return new Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<Purc_Chk03_DtlR, MST_PURC_ACT_D_R>();
		}

		public class Map_Purc_Chk03_DtlR_MST_PURC_ACT_D_R<D extends Purc_Chk03_DtlR, S extends MST_PURC_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, MST_PURC_ACT_D_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, MST_PURC_ACT_D_R.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, MST_PURC_ACT_D_R.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$disp_seq, MST_PURC_ACT_D_R.$disp_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, MST_PURC_ACT_D_R.$purc_schd_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_src_typ, MST_PURC_ACT_D_R.$purc_src_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_src_no, MST_PURC_ACT_D_R.$purc_src_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sync_flg, MST_PURC_ACT_D_R.$sync_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$po_d_no, MST_PURC_ACT_D_R.$po_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_ret_act_d_no, MST_PURC_ACT_D_R.$purc_ret_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_cd, MST_PURC_ACT_D_R.$itm_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub1, MST_PURC_ACT_D_R.$itm_sub1);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub2, MST_PURC_ACT_D_R.$itm_sub2);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_sub3, MST_PURC_ACT_D_R.$itm_sub3);
				addColumnPathMap(Purc_Chk03_DtlR.$itm_nm, MST_PURC_ACT_D_R.$itm_nm);
				addColumnPathMap(Purc_Chk03_DtlR.$iv_itm_nm, MST_PURC_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_id_typ, MST_PURC_ACT_D_R.$purc_id_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_typ, MST_PURC_ACT_D_R.$purc_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$mfg_inst_no, MST_PURC_ACT_D_R.$mfg_inst_no);
				addColumnPathMap(Purc_Chk03_DtlR.$rsn_cd, MST_PURC_ACT_D_R.$rsn_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$sundry_itm_flg, MST_PURC_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_cd, MST_PURC_ACT_D_R.$sppl_itm_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$sppl_itm_nm, MST_PURC_ACT_D_R.$sppl_itm_nm);
				addColumnPathMap(Purc_Chk03_DtlR.$ver_no, MST_PURC_ACT_D_R.$ver_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sno1, MST_PURC_ACT_D_R.$sno1);
				addColumnPathMap(Purc_Chk03_DtlR.$sno2, MST_PURC_ACT_D_R.$sno2);
				addColumnPathMap(Purc_Chk03_DtlR.$sno3, MST_PURC_ACT_D_R.$sno3);
				addColumnPathMap(Purc_Chk03_DtlR.$sno4, MST_PURC_ACT_D_R.$sno4);
				addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_cd, MST_PURC_ACT_D_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$dlv_loc_wg_cd, MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$str_ln_cd, MST_PURC_ACT_D_R.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$stk_insp_typ, MST_PURC_ACT_D_R.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$stk_id_typ, MST_PURC_ACT_D_R.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$lot_no, MST_PURC_ACT_D_R.$lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, MST_PURC_ACT_D_R.$sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, MST_PURC_ACT_D_R.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$base_unit_cd, MST_PURC_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$upri_not_tgt_flg, MST_PURC_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$interim_flg, MST_PURC_ACT_D_R.$interim_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$tax_cd, MST_PURC_ACT_D_R.$tax_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_dtl_upd_flg, MST_PURC_ACT_D_R.$purc_dtl_upd_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_upri, MST_PURC_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_upri, MST_PURC_ACT_D_R.$trd_cur_proc_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_upri, MST_PURC_ACT_D_R.$trd_cur_onr_prov_upri);
				addColumnPathMap(Purc_Chk03_DtlR.$dscnt_rsn_cd, MST_PURC_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_dscnt_amt, MST_PURC_ACT_D_R.$trd_cur_dscnt_amt);
				// 仕入実績サービスで再計算されるはずのtrd_cur_amt、trd_cur_tax_amt、base_cur_tax_amt、ptax_cur_tax_amtを渡す理由：
				// 検査仕入同時計上後に仕入明細訂正が行われた場合、仕入実績サービスの上り電文に上記４項目を渡す必要があります。
				// （金額の訂正が必要かどうか判断に使用する。渡さないとサーバ実行エラーが発生する）
				// 全数検査で良品の数量を訂正した場合、本来であれば金額を再計算して上り電文に設定すべきですが、
				// 訂正前後で数量が変わっていれば金額が再計算されるため、元の金額（仕入実績明細からの補完）で問題ありません。
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_amt, MST_PURC_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_tax_amt, MST_PURC_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$base_cur_tax_amt, MST_PURC_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$ptax_cur_tax_amt, MST_PURC_ACT_D_R.$ptax_cur_tax_amt);
				// trd_cur_proc_amt、trd_cur_onr_prov_amtを渡す理由：
				// 上記２項目は外注の場合に関係する金額。
				// これらの項目を渡さないと、外注の検査実績の訂正時に対象の金額がnullになってしまう場合があるため。
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_proc_amt, MST_PURC_ACT_D_R.$trd_cur_proc_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_cur_onr_prov_amt, MST_PURC_ACT_D_R.$trd_cur_onr_prov_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$wtax_rate, MST_PURC_ACT_D_R.$wtax_rate);
				addColumnPathMap(Purc_Chk03_DtlR.$wtax_amt, MST_PURC_ACT_D_R.$wtax_amt);
				addColumnPathMap(Purc_Chk03_DtlR.$maker_cd, MST_PURC_ACT_D_R.$maker_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$ap_dpt_cd, MST_PURC_ACT_D_R.$ap_dpt_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$pay_crryovr_times, MST_PURC_ACT_D_R.$pay_crryovr_times);
				addColumnPathMap(Purc_Chk03_DtlR.$ncv_flg, MST_PURC_ACT_D_R.$ncv_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$stk_mng_typ, MST_PURC_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(Purc_Chk03_DtlR.$edi_flg, MST_PURC_ACT_D_R.$edi_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$accpt_dfct_flg, MST_PURC_ACT_D_R.$accpt_dfct_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_flg, MST_PURC_ACT_D_R.$re_arr_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_sync_flg, MST_PURC_ACT_D_R.$re_arr_sync_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_cd, MST_PURC_ACT_D_R.$re_arr_loc_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_loc_wg_cd, MST_PURC_ACT_D_R.$re_arr_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_str_ln_cd, MST_PURC_ACT_D_R.$re_arr_str_ln_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_rqst_tm, MST_PURC_ACT_D_R.$re_arr_rqst_tm);
				addColumnPathMap(Purc_Chk03_DtlR.$re_arr_purc_schd_dt, MST_PURC_ACT_D_R.$re_arr_purc_schd_dt);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_re_arr_qty, MST_PURC_ACT_D_R.$trd_unit_re_arr_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$base_unit_re_arr_qty, MST_PURC_ACT_D_R.$base_unit_re_arr_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_cd, MST_PURC_ACT_D_R.$bd_itm_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub1, MST_PURC_ACT_D_R.$bd_itm_sub1);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub2, MST_PURC_ACT_D_R.$bd_itm_sub2);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_itm_sub3, MST_PURC_ACT_D_R.$bd_itm_sub3);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_sno1, MST_PURC_ACT_D_R.$bd_sno1);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_sno2, MST_PURC_ACT_D_R.$bd_sno2);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_sno3, MST_PURC_ACT_D_R.$bd_sno3);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_sno4, MST_PURC_ACT_D_R.$bd_sno4);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_loc_cd, MST_PURC_ACT_D_R.$bd_loc_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_lot_no, MST_PURC_ACT_D_R.$bd_lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_sublot_no, MST_PURC_ACT_D_R.$bd_sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_dpt_cd, MST_PURC_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_ctg_cd, MST_PURC_ACT_D_R.$bd_ctg_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_oper_cd, MST_PURC_ACT_D_R.$bd_oper_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_slo_no, MST_PURC_ACT_D_R.$bd_slo_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_iv_no, MST_PURC_ACT_D_R.$bd_iv_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bd_po_no, MST_PURC_ACT_D_R.$bd_po_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_no, MST_PURC_ACT_D_R.$ref_purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_seq, MST_PURC_ACT_D_R.$ref_purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_d_no, MST_PURC_ACT_D_R.$ref_purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ref_purc_act_d_seq, MST_PURC_ACT_D_R.$ref_purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, MST_PURC_ACT_D_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, MST_PURC_ACT_D_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$intr_rmrks, MST_PURC_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_d_rmrks, MST_PURC_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Purc_Chk03_DtlR.$sub_char1, MST_PURC_ACT_D_R.$sub_char1);
				addColumnPathMap(Purc_Chk03_DtlR.$sub_char2, MST_PURC_ACT_D_R.$sub_char2);
				addColumnPathMap(Purc_Chk03_DtlR.$sub_char3, MST_PURC_ACT_D_R.$sub_char3);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, MST_PURC_ACT_D_R.$trd_unit_cd);
			}
		}

		/**
		 * 仕入実績受払テーブルから仕入実績受払コンテナを作成する（訂正・取消）
		 * @return
		 */
		protected Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<Purc_Chk03_IoR,MST_PURC_ACT_IO_R> createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R() {
			return new Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<Purc_Chk03_IoR, MST_PURC_ACT_IO_R>();
		}

		public class Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R<D extends Purc_Chk03_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_ret_act_io_no, MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, MST_PURC_ACT_IO_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$gi_wg_cd, MST_PURC_ACT_IO_R.$gi_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_loc_cd, MST_PURC_ACT_IO_R.$gi_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_str_ln_cd, MST_PURC_ACT_IO_R.$gi_str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_unit_cd, MST_PURC_ACT_IO_R.$gi_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, MST_PURC_ACT_IO_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_IoR.$sub_char1, MST_PURC_ACT_IO_R.$sub_char1);
				addColumnPathMap(Purc_Chk03_IoR.$sub_char2, MST_PURC_ACT_IO_R.$sub_char2);
				addColumnPathMap(Purc_Chk03_IoR.$sub_char3, MST_PURC_ACT_IO_R.$sub_char3);
			}
		}

		/**
		 * 仕入実績受払テーブルから仕入実績受払コンテナを作成する（ヘッダから補完された明細または明細が存在しない場合）
		 * @return
		 */
		protected Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl<Purc_Chk03_IoR,MST_PURC_ACT_IO_R> createMap_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl() {
			return new Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl<Purc_Chk03_IoR, MST_PURC_ACT_IO_R>();
		}

		public class Map_Purc_Chk03_IoR_MST_PURC_ACT_IO_R_NoDtl<D extends Purc_Chk03_IoR, S extends MST_PURC_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$arr_act_no, MST_PURC_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_ret_act_io_no, MST_PURC_ACT_IO_R.$purc_ret_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, MST_PURC_ACT_IO_R.$in_to_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, MST_PURC_ACT_IO_R.$in_to_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, MST_PURC_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, MST_PURC_ACT_IO_R.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, MST_PURC_ACT_IO_R.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, MST_PURC_ACT_IO_R.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$gd_cd, MST_PURC_ACT_IO_R.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$quality_typ, MST_PURC_ACT_IO_R.$quality_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, MST_PURC_ACT_IO_R.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, MST_PURC_ACT_IO_R.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, MST_PURC_ACT_IO_R.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, MST_PURC_ACT_IO_R.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$gi_wg_cd, MST_PURC_ACT_IO_R.$gi_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_loc_cd, MST_PURC_ACT_IO_R.$gi_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_str_ln_cd, MST_PURC_ACT_IO_R.$gi_str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$gi_unit_cd, MST_PURC_ACT_IO_R.$gi_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, MST_PURC_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, MST_PURC_ACT_IO_R.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, MST_PURC_ACT_IO_R.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, MST_PURC_ACT_IO_R.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, MST_PURC_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, MST_PURC_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$pack_unit_cd, MST_PURC_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$pack_unit_qty, MST_PURC_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$sub_char1, MST_PURC_ACT_IO_R.$sub_char1);
				addColumnPathMap(Purc_Chk03_IoR.$sub_char2, MST_PURC_ACT_IO_R.$sub_char2);
				addColumnPathMap(Purc_Chk03_IoR.$sub_char3, MST_PURC_ACT_IO_R.$sub_char3);
			}
		}

	}

	protected static final Class<MSBFL_InspActService> CLAZZ = MSBFL_InspActService.class;

	/**
	 * Chk03の明細の上り電文をUpd05に渡すためのキャッシュ
	 */
	protected FXUCL_Cache<MCList<InspAct_Chk03_DtlR>> _dtlCacheForUpd05;

	protected static void initCacheForUpd05(MCList<InspAct_Chk03_DtlR> dtlL) {
		object(CLAZZ)._initCacheForUpd05(dtlL);
	}

	protected void _initCacheForUpd05(MCList<InspAct_Chk03_DtlR> dtlL) {
		_dtlCacheForUpd05 = new FXUCL_Cache<MCList<InspAct_Chk03_DtlR>>();
		_dtlCacheForUpd05.setFixMaxCacheSize(-1);
		
		for (MCList<InspAct_Chk03_DtlR> subL : dtlL.groupList(InspAct_Chk03_DtlR.$hdr_peg_no)) {
			_dtlCacheForUpd05.putCache(new MCNumber[] {subL.get(0).hdr_peg_no()}, subL);
		}
	}

	protected static MCList<InspAct_Chk03_DtlR> getCacheForUpd05(MCNumber hdrPegNo) {
		if (object(CLAZZ)._dtlCacheForUpd05 == null) {
			return MCList.create(InspAct_Chk03_DtlR.class);
		}
		MCList<InspAct_Chk03_DtlR> retL = object(CLAZZ)._dtlCacheForUpd05.getCache(hdrPegNo);
		if (isNull(retL) || retL.isEmpty()) {
			return MCList.create(InspAct_Chk03_DtlR.class);
		}
		return retL;
	}
	/**
	 * InspAct_Upd05オペレーション.<p>
	 *
	 * 検査時に仕入実績を同時計上する場合に、仕入実績登録サービスの更新を実行する。登録・訂正、判定、取消から呼ばれる。<br>
	 */
	public class InspAct_Upd05 extends MSBFL_InspActService_MC_A.InspAct_Upd05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callPurcUpd02();
		}
		
		protected void callPurcUpd02() {
			MCList<InspAct_Chk03_DtlR> tgtDtlL = MCList.create(InspAct_Chk03_DtlR.class);
			
			for (InspAct_Upd05_HdrR hdrR : up0()) {
				// 上り電文のヘッダの紐付けＮＯに該当する明細をキャッシュから取得する
				tgtDtlL.addAll(getCacheForUpd05(hdrR.peg_no()));
			}
			
			if (tgtDtlL.isEmpty()) {
				return;
			}
			
			MSBDL_PurcActRegService.Purc_Upd02 o = MSBDL_PurcActRegService.crtPurc_Upd02();

			MCList<InspAct_Chk03_DtlR> hdrL = tgtDtlL.groupBy(InspAct_Chk03_DtlR.$purc_hdr_peg_no);
			for (InspAct_Chk03_DtlR r : hdrL) {
				if (!isNull(r.purc_hdr_peg_no())) {
					Purc_Ins01_HdrR hdrR = Purc_Ins01_HdrR.create();
					hdrR.peg_no(r.purc_hdr_peg_no());
					o.up1().add(hdrR);
				}
			}

			MCList<InspAct_Chk03_DtlR> dtlL = tgtDtlL.groupBy(InspAct_Chk03_DtlR.$purc_hdr_peg_no, InspAct_Chk03_DtlR.$purc_dtl_peg_no);
			for (InspAct_Chk03_DtlR r : dtlL) {
				if (!isNull(r.purc_dtl_peg_no())) {
					Purc_Ins01_DtlR dtlR = Purc_Ins01_DtlR.create();
					dtlR.peg_no(r.purc_dtl_peg_no());
					dtlR.hdr_peg_no(r.purc_hdr_peg_no());
					o.up2().add(dtlR);
				}
			}

			MCIndexKey hdrIdx = up0().createIndex(InspAct_Upd05_HdrR.$peg_no);
			MCIndexKey idx = up1().createIndex(InspAct_Upd05_DtlR.$peg_no);
			
			for (InspAct_Chk03_DtlR r : tgtDtlL) {
				Purc_Ins01_IoR ioR = Purc_Ins01_IoR.create();
				if (!isNull(r.purc_io_peg_no())) {
					ioR.peg_no(r.purc_io_peg_no());
					ioR.dtl_peg_no(r.purc_dtl_peg_no());
					InspAct_Upd05_DtlR upR = up1().getFirst(idx, r.org_peg_no());
					if (!isNull(upR)) {
						ioR.insp_act_d_no(upR.insp_act_d_no());
						ioR.insp_judg_d_no(upR.insp_judg_d_no());
						InspAct_Upd05_HdrR hdrR = up0().getFirst(hdrIdx, upR.hdr_peg_no());
						if (isNull(upR.insp_act_d_no()) && isNull(upR.insp_judg_d_no()) && !isNull(hdrR)) {
							ioR.insp_act_no(hdrR.insp_act_no());
						}
					}
					else {
						// 検査実績一覧登録から検査中使用許可品を新規登録した場合は明細行が存在しないため、この分岐に入る
						InspAct_Upd05_HdrR hdrR = up0().getFirst(hdrIdx, r.hdr_peg_no());
						ioR.insp_act_no(hdrR.insp_act_no());
					}
					o.up3().add(ioR);
				}
			}

			if (o.up1().isEmpty()) {
				return;
			}
			o.up0().insp_act_srvs_flg(true);
			o.up0().amt_calc_flg(true);
			o.exec();
		}
	}

	//FMCB CUSTOM END
}