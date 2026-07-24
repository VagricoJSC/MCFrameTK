package mcframe.serverMSBE.MSBEL2420;

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
import mcframe.serverMSBE.MSBEL5550.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL2420.*; // このimportはFrameManagerの自動生成で追加されました。

import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverMSBE.MSBEL2420.Query.*;

import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSBE.MSBEL6400.*;
import mcframe.commonMAUA.MAUAC0010.*;
import mcframe.serverMAUC.MAUCL0080.*;
import mcframe.serverMAUC.MAUCL0100.*;
import mcframe.serverMAUC.MAUCL5020.*;

import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;

import mcframe.serverCore.sys.MCSys;

import java.util.Map;
import mcframe.serverMSUC.MSUCL0090.*;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AcXfrActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AcXfrActReg_MC extends MSBEL_AcXfrActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.
	 * <p>
	 *
	 * 他勘定振替指図を検索する。<br>
	 */
	public class Srch01 extends MSBEL_AcXfrActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = srchInstHdr();

			if (isSame(cnt, 0)) {
				return;
			}

			cnt = srchInstDtl();
			if (isSame(cnt, 0)) {
				down0().clear();
			}
		}

		/**
		 * 他勘定振替指図ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchInstHdr() {
			return executeQuery(down0(), MSBEL2420_MST_ACXFR_INST_S01(), up0());
		}

		/**
		 * 他勘定振替指図明細を検索する。
		 */
		protected int srchInstDtl() {
			return executeQuery(down1(), MSBEL2420_MST_ACXFR_INST_D_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			editDownForSrch();
			setWmsFlg(down1(), down0(), up0());
		}

		/**
		 * 検索処理の下り電文を編集する
		 */
		protected void editDownForSrch() {
			for (Srch01_DtlR dtlR : down1()) {
				setBaseUnitQtyForSrch(up0(), dtlR);
				setStkAmtForSrch(dtlR);
			}
		}

		protected void setBaseUnitQtyForSrch(Srch01_CndR up0, Srch01_DtlR dtlR) {
			// 取引数量と基準単位数量の初期値を設定
			if (MSC_STK_SRCH_TGT_TYP.isACXFR_INST_NO(up0.srch_tgt_typ())) {
				MCNumber diffQty = dtlR.base_unit_inst_qty()
						.subtract(dtlR.base_unit_act_qty());

				dtlR.trd_unit_qty(rvrsBaseUnitConv(diffQty, dtlR.trd_unit_conv_base_qty(),
						dtlR.trd_unit_conv_qty(), dtlR.trd_unit_dec_place(),
						dtlR.trd_unit_rnd_typ()));
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
		/**
		 * WMS対象フラグを取得・設定する
		 */
		protected void setWmsFlg(MCList<Srch01_DtlR> dtlRL, Srch01_HdrR hdrR, Srch01_CndR srchCndR ) {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
			
			MCNumber peg = MCNumber.ZERO;
			if (!isNull(srchCndR.srch_tgt_no())) {
					
				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(MCNumber.ZERO);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_ACXFR_ACT_RECV.value());
				r.loc_cd(hdrR.loc_cd());
				r.lg_grp_cd(hdrR.getStringNE("lg_grp_cd"));
				r.master_dt(getToday());
				
				peg = peg.add(1);
				
				if (!o.up0().isEmpty()) {
					o.exec();
					
					if (!o.down0().isEmpty()) {
						dtlRL.setValueNE(Srch01_DtlR.$wms_flg, !isNull(o.down0().get(0).ext_sys_cd()));
					}
				}
			}
		}
	}

	/**
	 * Srch02オペレーション.
	 * <p>
	 *
	 * 登録済みの他勘定振替実績を検索する。<br>
	 */
	public class Srch02 extends MSBEL_AcXfrActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			int cnt = 0;

			if (isNull(up0().acxfr_act_rev())) {
				up0().acxfr_act_rev(getRevNo());
			}

			cnt = srchActHdr();

			if (isSame(cnt, 0)) {
				return;
			}

			srchActDtl();
		}

		protected MCNumber getRevNo() {
			MCRow row = MCRow.create();

			row.addNumberColumn(MST_ACXFR_ACT_R.$acxfr_act_rev);
			executeQuery(row, MSBEL2420_MST_ACXFR_ACT_S01(), up0());

			return row.getNumber(MST_ACXFR_ACT_R.$acxfr_act_rev);
		}

		protected int srchActHdr() {
			if (isSame(up0().screen_ope(), OPE_UPD) || isSame(up0().screen_ope(), OPE_DEL)
					|| isSame(up0().screen_ope(), OPE_REF)) {
				up0().setStringNE("w_can_flg", toFalseStr(false));
			}

			return executeQuery(down0(), MSBEL2420_MST_ACXFR_ACT_S02(), up0());
		}

		protected void srchActDtl() {
			up0().setStringNE("w_unit_pack_flg", toTrueStr(true));

			int cnt = executeQuery(down1(), MSBEL2420_MST_ACXFR_ACT_D_S01(), up0());

			if (isSame(cnt, 0)) {
				throw new MCAppException(up0(), null, MSBEL0006, up0().srch_tgt_no());
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			editDownForSrch();
		}

		/**
		 * 検索処理の下り電文を編集する
		 */
		protected void editDownForSrch() {
			for (Srch01_DtlR dtlR : down1()) {
				setBaseUnitQtyForSrch(up0(), dtlR);
				setStkAmtForSrch(dtlR);
			}
		}

		protected void setBaseUnitQtyForSrch(Srch01_CndR up0, Srch01_DtlR dtlR) {
			if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.base_unit_qty(dtlR.trd_unit_qty());
			}
			else {
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
	}

	/**
	 * Chk01オペレーション.
	 * <p>
	 *
	 * 他勘定振替実績を登録する前に、チェックを実行します。<br>
	 */
	public class Chk01 extends MSBEL_AcXfrActReg_MC_A.Chk01 {

		protected MST_ACXFR_INST_R _instR = MST_ACXFR_INST_R.create();
		protected MCList<MST_ACXFR_INST_D_R> _instDL = MCList
				.create(MST_ACXFR_INST_D_R.class);
		protected MCList<MST_ACXFR_SCHD_R> _schdL = MCList
				.create(MST_ACXFR_SCHD_R.class);
		protected MCIndexKey _schdIdxKey = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			editUp();

			if (!hasErr()) {
				callAcXfrActServiceChk01();
			}

			setDown();
		}

		/**
		 * 上り電文の編集する。
		 */
		protected void editUp() {
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (hasErr()) {
				return msgL;
			}
			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(lockInst());
			msgL.addAll(lockSchdL());

			return msgL;
		}

		protected MCMessageList lockSchdL() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.acxfr_schd_no()));
			if (bindL.isEmpty()) return msgL;

			MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
			MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(t);

			_schdL_bldr.setOrderByAsc(t.acxfr_schd_no);
			dbSelectKeyForUpdateNoWait("MSBEL2420_MST_ACXFR_SCHD_S01", _schdL, _schdL_bldr, bindL.groupBy(MST_ACXFR_SCHD_R.$acxfr_schd_no));
			_schdIdxKey = _schdL.createIndex(MST_ACXFR_SCHD_R.$acxfr_schd_no);
			
			for (Chk01_DtlR r : bindL) {
				MST_ACXFR_SCHD_R selectR = _schdL.getFirst(_schdIdxKey, r.acxfr_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$schd_upd_cntr, selectR));
			}
			return msgL;
		}

		protected MCMessageList lockInst() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			if (!isNull(up0().acxfr_inst_no())) {
				MST_ACXFR_INST_R t = MST_ACXFR_INST_R.create("T");
				MCQueryApiBuilder _instR_bldr = MCQueryApiBuilder.create(t);
				// 指図ヘッダの検索
				dbSelectKeyForUpdateNoWait("MSBEL2420_MST_ACXFR_INST_S01", _instR, _instR_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$inst_upd_cntr, _instR));

				if (hasErr()) {
					return msgL;
				}

				// 指図明細の検索
				MST_ACXFR_INST_D_R t1= MST_ACXFR_INST_D_R.create("T1");
				MCQueryApiBuilder _instDL_bldr = MCQueryApiBuilder.create(t1);
				_instDL_bldr.setWhere(t1.acxfr_inst_no.eq(bind("acxfr_inst_no")), up0());
				dbSelectForUpdate("MSBEL2420_MST_ACXFR_INST_D_S01", _instDL, _instDL_bldr);
			}
			return msgL;
		}

		protected void compBase() {

			// トランザクションデータからの補完
			if (!isNull(up0().acxfr_inst_no())) {
				up0().trd_cd(_instR.trd_cd());
				up0().trd_ptn_typ(_instR.trd_ptn_typ());
				up0().loc_cd(_instR.loc_cd());
				up0().wg_cd(_instR.wg_cd());
			}

			MCIndexKey idxkeyInstD = _instDL
					.createIndex(MST_ACXFR_INST_D_R.$acxfr_inst_d_no);

			for (Chk01_DtlR dtlR : up1()) {
				if (!isNull(dtlR.acxfr_schd_no())) {
					MST_ACXFR_SCHD_R schdR = _schdL.getFirst(_schdIdxKey,
							dtlR.acxfr_schd_no());
					if (!isNull(schdR)) {
						dtlR.dspsl_no(schdR.dspsl_no());
						dtlR.aprv_flg(schdR.aprv_flg());
						dtlR.aprv_no(schdR.aprv_no());
						dtlR.schd_base_unit_qty(schdR.base_unit_qty());
						dtlR.io_schd_pr_no(schdR.io_schd_pr_no());
					}
				}

				if (!isNull(dtlR.acxfr_inst_d_no())) {
					MST_ACXFR_INST_D_R instDR = _instDL.getFirst(idxkeyInstD,
							dtlR.acxfr_inst_d_no());
					if (!isNull(instDR)) {
						dtlR.acxfr_schd_no(instDR.acxfr_schd_no());
						dtlR.dspsl_no(instDR.dspsl_no());
						dtlR.aprv_flg(instDR.aprv_flg());
						dtlR.aprv_no(instDR.aprv_no());
						dtlR.inst_base_unit_qty(instDR.base_unit_qty());
						dtlR.io_schd_pr_no(instDR.io_schd_pr_no());
					}
				}

				if (isNull(dtlR.fix_no_typ())) {
					dtlR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
				}
			}
			// 負担部門の組織変更対応
			up1().setValue(Chk01_DtlR.$ac_dt, up0().ac_dt());
			setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, Chk01_DtlR.$ac_dt);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (hasErr() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());

			if (!up0().err_flg()) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk01_HdrR.$loc_cd));
				msgL.addAll(checkStkIdTyp(up0(), notErrL));
				msgL.addAll(checkAtLeastOneDtl(up0(), up1()));
				msgL.addAll(chkReqHdr(true, up0()));
				msgL.addAll(chkReqDtl(true, up0(), notErrL));
				msgL.addAll(checkFixNoTyp(up0(), notErrL));
			}

			msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place,
					Chk01_DtlR.$trd_unit_qty));

			return msgL;
		}

		protected void compSub() {
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up0().hdr_dtl_peg(MCNumber.ONE);

			for (Chk01_DtlR dtlR : up1()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlR.hdr_dtl_peg(up0().hdr_dtl_peg());
				dtlR.trd_ptn_typ(up0().trd_ptn_typ());
				dtlR.loc_cd(up0().loc_cd());
				dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				setBaseUnitQty(dtlR);
				setPackUnitQtyForInsUpd(dtlR);
				setStkAmt(up0(), dtlR);
				setStrLn(dtlR);
			}
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd, up0(), up1());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			ListLogicBind strLnBind = getListLogicBind(up1(), Chk01_DtlR.$str_ln_cd);
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			ListLogicBind grRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);
			ListLogicBind giRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);
			ListLogicBind dispRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);

			strLnBind.putBind(MAUAC_List.StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			grRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg,
					up0(), Chk01_HdrR.$acxfr_gr_flg);
			giRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg,
					up0(), Chk01_HdrR.$acxfr_gi_flg);
			dispRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg,
					up0(), Chk01_HdrR.$disp_flg);
		}

		protected void callAcXfrActServiceChk01() {
			MSBEL_AcXfrActRegService.AcXfrAct_Chk01 ope = MSBEL_AcXfrActRegService
					.crtAcXfrAct_Chk01();
			AcXfrAct_Chk01_HdrR actR = AcXfrAct_Chk01_HdrR.create();

			copy(actR, up0(), createMap_AcXfrAct_Chk01_HdrR_Chk01_HdrR());
			ope.up0().add(actR);
			addAll(ope.up1(), up1(), createMap_AcXfrAct_Chk01_DtlR_Chk01_DtlR());
			ope.exec();

			String[] destVmiCols = new String[] {
					Chk01_DtlR.$vmi_interim_flg, Chk01_DtlR.$vmi_upri
			};
			String[] srcVmiCols = new String[] {
					AcXfrAct_Chk01_DtlR.$vmi_interim_flg, AcXfrAct_Chk01_DtlR.$vmi_upri
			};
			copyByPegNo(up1(), destVmiCols, ope.down1(), srcVmiCols);
			copyErrFlg(up1(), ope.down1());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk02オペレーション.
	 * <p>
	 *
	 * 他勘定振替実績を訂正する前に、チェックを実行します。<br>
	 */
	public class Chk02 extends MSBEL_AcXfrActReg_MC_A.Chk02 {

		protected MST_ACXFR_ACT_R _actR = MST_ACXFR_ACT_R.create();
		protected MCList<MST_ACXFR_ACT_D_R> _actDL = MCList
				.create(MST_ACXFR_ACT_D_R.class);
		protected MST_ACXFR_INST_R _instR = MST_ACXFR_INST_R.create();
		protected MCList<MST_ACXFR_INST_D_R> _instDL = MCList
				.create(MST_ACXFR_INST_D_R.class);
		protected MCList<MST_ACXFR_SCHD_R> _schdL = MCList
				.create(MST_ACXFR_SCHD_R.class);
		protected MCIndexKey _schdIdxKey = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			editUp();

			if (!hasErr()) {
				callAcXfrActServiceChk02();
			}

			setDown();
		}

		/**
		 * 上り電文の編集する。
		 */
		protected void editUp() {
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (hasErr()) {
				return msgL;
			}
			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(lockAct());
			msgL.addAll(lockInst());
			msgL.addAll(lockSchdL());

			return msgL;
		}

		protected MCMessageList lockSchdL() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.acxfr_schd_no()));
			if (bindL.isEmpty()) return msgL;

			MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
			MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(t);
			
			_schdL_bldr.setOrderByAsc(t.acxfr_schd_no);
			dbSelectKeyForUpdateNoWait("MSBEL2420_MST_ACXFR_SCHD_S02", _schdL, _schdL_bldr, bindL.groupBy(MST_ACXFR_SCHD_R.$acxfr_schd_no));
			_schdIdxKey = _schdL.createIndex(MST_ACXFR_SCHD_R.$acxfr_schd_no);
			
			return msgL;
		}

		protected MCMessageList lockInst() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			if (!isNull(up0().acxfr_inst_no())) {
				// 指図ヘッダの検索
				MST_ACXFR_INST_R t = MST_ACXFR_INST_R.create("T");
				MCQueryApiBuilder _instR_bldr = MCQueryApiBuilder.create(t);
				dbSelectKeyForUpdateNoWait("MSBEL2420_MST_ACXFR_INST_S02", _instR, _instR_bldr, up0());

				// 指図明細の検索
				MST_ACXFR_INST_D_R t1 = MST_ACXFR_INST_D_R.create("T1");
				MCQueryApiBuilder _instDL_bldr = MCQueryApiBuilder.create(t1);
				_instDL_bldr.setWhere(t1.acxfr_inst_no.eq(bind("acxfr_inst_no")), up0());
				dbSelectForUpdate("MSBEL2420_MST_ACXFR_INST_D_S02", _instDL, _instDL_bldr);
			}
			return msgL;
		}

		protected MCMessageList lockAct() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;

			// 実績ヘッダの検索
			MCQueryApiBuilder _actR_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL2420_MST_ACXFR_ACT_S01", _actR, _actR_bldr, up0());

			// 更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$act_upd_cntr, _actR));

			if (hasErr()) {
				return msgL;
			}

			// 実績明細の検索
			MST_ACXFR_ACT_D_R t1 = MST_ACXFR_ACT_D_R.create("T1");
			MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(t1);
			_actDL_bldr.setWhere(t1.acxfr_act_no.eq(bind("acxfr_act_no")), up0());
			dbSelectForUpdate("MSBEL2420_MST_ACXFR_ACT_D_S01", _actDL, _actDL_bldr);

			return msgL;
		}

		protected void compBase() {
			// トランザクションデータの補完
			MCNumber oldRevNo = _actR.acxfr_act_rev();
			MCNumber newRevNo = oldRevNo.add(MCNumber.ONE);

			up0().acxfr_inst_no(_actR.acxfr_inst_no());
			up0().acxfr_act_rev(newRevNo);
			up0().trd_cd(_actR.trd_cd());
			up0().trd_ptn_typ(_actR.trd_ptn_typ());
			up0().loc_cd(_actR.loc_cd());
			up0().wg_cd(_actR.wg_cd());

			MCIndexKey idxkeyActD = _actDL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_act_d_no);
			MCIndexKey idxkeyInstD = _instDL
					.createIndex(MST_ACXFR_INST_D_R.$acxfr_inst_d_no);

			for (Chk01_DtlR dtlR : up1()) {
				MST_ACXFR_ACT_D_R actDR = _actDL.getFirst(idxkeyActD,
						dtlR.acxfr_act_d_no());

				dtlR.hdr_dtl_peg(MCNumber.ONE);

				// 新規行
				if (isNull(actDR)) {
					dtlR.acxfr_act_no(_actR.acxfr_act_no());
					dtlR.acxfr_act_rev(newRevNo);
					if (isNull(dtlR.fix_no_typ())) {
						dtlR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					}
				}
				// 訂正行
				else if (!isNull(actDR) && !dtlR.isStatusDelete()) {

					dtlR.acxfr_act_no(_actR.acxfr_act_no());
					dtlR.acxfr_act_rev(newRevNo);
					dtlR.acxfr_inst_d_no(actDR.acxfr_inst_d_no());
					dtlR.acxfr_schd_no(actDR.acxfr_schd_no());
					dtlR.dspsl_no(actDR.dspsl_no());
					dtlR.aprv_flg(actDR.aprv_flg());
					dtlR.aprv_no(actDR.aprv_no());
					dtlR.io_schd_pr_no(actDR.io_schd_pr_no());

					if (!isNull(dtlR.acxfr_inst_d_no())) {
						MST_ACXFR_INST_D_R instDR = _instDL.getFirst(idxkeyInstD,
								dtlR.acxfr_inst_d_no());
						if (!isNull(instDR)) {
							dtlR.inst_base_unit_qty(instDR.base_unit_qty());
						}
					}
					if (!isNull(dtlR.acxfr_schd_no())) {
						MST_ACXFR_SCHD_R schdR = _schdL.getFirst(_schdIdxKey,
								dtlR.acxfr_schd_no());
						if (!isNull(schdR)) {
							dtlR.schd_base_unit_qty(schdR.base_unit_qty());
						}
					}
				}
				// 取消行
				else {
					dtlR.acxfr_act_no(_actR.acxfr_act_no());
					dtlR.acxfr_act_rev(oldRevNo);
					dtlR.base_unit_cd(actDR.base_unit_cd());
					dtlR.stk_insp_typ(actDR.stk_insp_typ());
				}
			}
			// 負担部門の組織変更対応
			up1().setValue(Chk01_DtlR.$ac_dt, up0().ac_dt());
			setDpt(up1(), Chk01_DtlR.$bd_dpt_cd, Chk01_DtlR.$ac_dt);
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd, up0(), up1());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			ListLogicBind strLnBind = getListLogicBind(up1(), Chk01_DtlR.$str_ln_cd);
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			ListLogicBind grRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);
			ListLogicBind giRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);
			ListLogicBind dispRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);

			strLnBind.putBind(MAUAC_List.StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ac_dt);
			grRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg,
					up0(), Chk01_HdrR.$acxfr_gr_flg);
			giRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg,
					up0(), Chk01_HdrR.$acxfr_gi_flg);
			dispRsnBind.putBind(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg,
					up0(), Chk01_HdrR.$disp_flg);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (hasErr() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up1(), MCRow.CREATE, MCRow.MODIFY,
					MCRow.NONE);
			MCList<Chk01_DtlR> notErrDelL = getChkList(up1(), MCRow.DELETE);

			if (!up0().err_flg()) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk01_HdrR.$loc_cd));
				msgL.addAll(checkStkIdTyp(up0(), notErrL));
				msgL.addAll(checkAbortFlg(notErrDelL));
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
				msgL.addAll(chkReqHdr(false, up0()));
				msgL.addAll(chkReqDtl(false, up0(), notErrL));
				msgL.addAll(checkFixNoTyp(up0(), notErrL));
				msgL.addAll(check(up0(), Chk01_HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
			}

			msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place,
					Chk01_DtlR.$trd_unit_qty));

			return msgL;
		}

		/**
		 * 削除行について、打切ＦＬＧがオンかどうかをチェックします。
		 * @param dtlL
		 * @return
		 */
		protected MCMessageList checkAbortFlg(MCList<Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_DtlR dtlR : dtlL) {
				if (dtlR.isStatusDelete() && dtlR.abort_flg()) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$abort_flg, MSBEL0025,
							toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}

		protected void compSub() {
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up0().hdr_dtl_peg(MCNumber.ONE);

			for (Chk01_DtlR dtlR : up1()) {
				// 新規行
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				// 取消行
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 訂正行
				else {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}

				dtlR.hdr_dtl_peg(up0().hdr_dtl_peg());
				dtlR.trd_ptn_typ(up0().trd_ptn_typ());
				dtlR.loc_cd(up0().loc_cd());
				dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				setBaseUnitQty(dtlR);
				setPackUnitQtyForInsUpd(dtlR);
				setStkAmt(up0(), dtlR);
				setStrLn(dtlR);
			}
		}

		protected void callAcXfrActServiceChk02() {
			MSBEL_AcXfrActRegService.AcXfrAct_Chk02 ope = MSBEL_AcXfrActRegService
					.crtAcXfrAct_Chk02();
			AcXfrAct_Chk01_HdrR actR = AcXfrAct_Chk01_HdrR.create();

			copy(actR, up0(), createMap_AcXfrAct_Chk01_HdrR_Chk01_HdrR());
			ope.up0().add(actR);
			addAll(ope.up1(), up1(), createMap_AcXfrAct_Chk01_DtlR_Chk01_DtlR());
			ope.exec();

			String[] destVmiCols = new String[] {
					Chk01_DtlR.$vmi_interim_flg, Chk01_DtlR.$vmi_upri
			};
			String[] srcVmiCols = new String[] {
					AcXfrAct_Chk01_DtlR.$vmi_interim_flg, AcXfrAct_Chk01_DtlR.$vmi_upri
			};
			copyByPegNo(up1(), destVmiCols, ope.down1(), srcVmiCols);
			copyErrFlg(up1(), ope.down1());
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 他勘定振替指図から実績を取消する前に、チェックを実行します。<br>
	 */
	public class Chk03 extends MSBEL_AcXfrActReg_MC_A.Chk03 {

		protected MST_ACXFR_ACT_R _actR = MST_ACXFR_ACT_R.create();
		protected MCList<MST_ACXFR_ACT_D_R> _actDL = MCList
				.create(MST_ACXFR_ACT_D_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callAcXfrActServiceChk03();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (hasErr()) {
				return msgL;
			}
			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(lockAct());
			msgL.addAll(lockInst());
			msgL.addAll(lockSchdL());

			return msgL;
		}

		protected MCMessageList lockSchdL() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			MCList<MST_ACXFR_ACT_D_R> bindL = _actDL.subList(r -> !isNull(r.acxfr_schd_no()));
			if (bindL.isEmpty()) return msgL;

			MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_ACXFR_SCHD_R.create("T"));
			dbSelectKeyForUpdate("MSBEL2420_MST_ACXFR_SCHD_S03", schdL, schdL_bldr, bindL.groupBy(MST_ACXFR_SCHD_R.$acxfr_schd_no));

			return msgL;
		}

		protected MCMessageList lockInst() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			if (!isNull(_actR.acxfr_inst_no())) {
				// 指図ヘッダの検索
				MST_ACXFR_INST_R instR = MST_ACXFR_INST_R.create();
				MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T"));
				dbSelectKeyForUpdate("MSBEL2420_MST_ACXFR_INST_S03", instR, instR_bldr, _actR);

				// 指図明細の検索
				MCList<MST_ACXFR_INST_D_R> instDL = MCList
						.create(MST_ACXFR_INST_D_R.class);
				MST_ACXFR_INST_D_R t1 = MST_ACXFR_INST_D_R.create("T1");
				MCQueryApiBuilder instDL_bldr = MCQueryApiBuilder.create(t1);
				instDL_bldr.setWhere(t1.acxfr_inst_no.eq(bind("acxfr_inst_no")), instR);
				dbSelectForUpdate("MSBEL2420_MST_ACXFR_INST_D_S03", instDL, instDL_bldr);
			}
			return msgL;
		}

		protected MCMessageList lockAct() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;

			// 実績ヘッダの検索
			MCQueryApiBuilder _actR_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL2420_MST_ACXFR_ACT_S02", _actR, _actR_bldr, up0());

			// 更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(up0(), Chk03_HdrR.$act_upd_cntr, _actR));

			if (hasErr()) {
				return msgL;
			}

			// 実績明細の検索
			MST_ACXFR_ACT_D_R t1 = MST_ACXFR_ACT_D_R.create("T1");
			MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(t1);
			_actDL_bldr.setWhere(t1.acxfr_act_no.eq(bind("acxfr_act_no")), up0());
			dbSelectForUpdate("MSBEL2420_MST_ACXFR_ACT_D_S02", _actDL, _actDL_bldr);

			return msgL;
		}

		protected void compBase() {
			// 入力不可項目の補完
			copy(up0(), _actR, createMap_Chk03_HdrR_MST_ACXFR_ACT_R());

			MCIndexKey idxkeyActD = _actDL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_act_d_no);

			for (Chk03_DtlR dtlR : up1()) {
				MST_ACXFR_ACT_D_R actDR = _actDL.getFirst(idxkeyActD,
						dtlR.acxfr_act_d_no());

				actDR.setAttributes(dtlR);

				copy(dtlR, actDR, createMap_Chk03_DtlR_MST_ACXFR_ACT_D_R());
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (hasErr() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk03_DtlR> notErrL = getChkList(up1(), MCRow.NONE);

			if (!up0().err_flg()) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk01_HdrR.$loc_cd));
				msgL.addAll(checkAbortFlg(notErrL));
			}

			return msgL;
		}

		protected MCMessageList checkAbortFlg(MCList<Chk03_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk03_DtlR dtlR : dtlL) {
				if (dtlR.abort_flg()) {
					msgL.add(new MCMessage(dtlR, Chk03_DtlR.$abort_flg, MSBEL0030,
							toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}

		protected void compSub() {
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			up0().hdr_dtl_peg(MCNumber.ONE);

			for (Chk03_DtlR dtlR : up1()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dtlR.hdr_dtl_peg(up0().hdr_dtl_peg());
				dtlR.loc_cd(up0().loc_cd());
			}
		}

		protected void callAcXfrActServiceChk03() {
			MSBEL_AcXfrActRegService.AcXfrAct_Chk03 ope = MSBEL_AcXfrActRegService
					.crtAcXfrAct_Chk03();
			AcXfrAct_Chk03_HdrR actR = AcXfrAct_Chk03_HdrR.create();

			copy(actR, up0(), createMap_AcXfrAct_Chk03_HdrR_Chk03_HdrR());
			ope.up0().add(actR);
			addAll(ope.up1(), up1(), createMap_AcXfrAct_Chk03_DtlR_Chk03_DtlR());
			ope.exec();

			copyErrFlg(up1(), ope.down1());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Ins01オペレーション.
	 * <p>
	 *
	 * 他勘定振替実績を新規登録する。<br>
	 */
	public class Ins01 extends MSBEL_AcXfrActReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			callThisChk01();
			throwUpdErr();
			setLotNo(up0(), up1());
			callAcXfrActServiceIns01();
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// peg_no設定
			setPegNo(up0());
			setPegNo(Chk01_DtlR.$peg_no, up1());
			
		}

		protected void callThisChk01() {
			MSBEL_AcXfrActReg.Chk01 ope = MSBEL_AcXfrActReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callAcXfrActServiceIns01() {
			MSBEL_AcXfrActRegService.AcXfrAct_Ins01 ope = MSBEL_AcXfrActRegService
					.crtAcXfrAct_Ins01();
			AcXfrAct_Chk01_HdrR actR = AcXfrAct_Chk01_HdrR.create();

			copy(actR, up0(), createMap_AcXfrAct_Chk01_HdrR_Chk01_HdrR());
			ope.up0().add(actR);
			addAll(ope.up1(), up1(), createMap_AcXfrAct_Chk01_DtlR_Chk01_DtlR());
			ope.exec();

			up0().acxfr_act_no(ope.down0().get(0).acxfr_act_no());
			up0().acxfr_act_rev(ope.down0().get(0).acxfr_act_rev());
			copyByPegNo(up1(), new String[] {
					Chk01_DtlR.$acxfr_act_d_no, Chk01_DtlR.$acxfr_act_no,
					Chk01_DtlR.$pr_sts_typ
			}, ope.down1(), new String[] {
					AcXfrAct_Chk01_DtlR.$acxfr_act_d_no,
					AcXfrAct_Chk01_DtlR.$acxfr_act_no, AcXfrAct_Chk01_DtlR.$pr_sts_typ
			});
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Upd01オペレーション.
	 * <p>
	 *
	 * 登録済みの他勘定振替実績を更新する。<br>
	 */
	public class Upd01 extends MSBEL_AcXfrActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			callThisChk02();
			throwUpdErr();
			setLotNo(up0(), up1());
			callAcXfrActServiceUpd01();
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// peg_no設定
			setPegNo(up0());
			setPegNo(Chk01_DtlR.$peg_no, up1());

		}

		protected void callThisChk02() {
			MSBEL_AcXfrActReg.Chk02 ope = MSBEL_AcXfrActReg.crtChk02();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callAcXfrActServiceUpd01() {
			MSBEL_AcXfrActRegService.AcXfrAct_Upd01 ope = MSBEL_AcXfrActRegService
					.crtAcXfrAct_Upd01();
			AcXfrAct_Chk01_HdrR actR = AcXfrAct_Chk01_HdrR.create();

			copy(actR, up0(), createMap_AcXfrAct_Chk01_HdrR_Chk01_HdrR());
			ope.up0().add(actR);
			addAll(ope.up1(), up1(), createMap_AcXfrAct_Chk01_DtlR_Chk01_DtlR());
			ope.exec();

			up0().acxfr_act_no(ope.down0().get(0).acxfr_act_no());
			up0().acxfr_act_rev(ope.down0().get(0).acxfr_act_rev());
			copyByPegNo(up1(), new String[] {
					Chk01_DtlR.$acxfr_act_d_no, Chk01_DtlR.$acxfr_act_no,
					Chk01_DtlR.$pr_sts_typ
			}, ope.down1(), new String[] {
					AcXfrAct_Chk01_DtlR.$acxfr_act_d_no,
					AcXfrAct_Chk01_DtlR.$acxfr_act_no, AcXfrAct_Chk01_DtlR.$pr_sts_typ
			});
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 登録済みの他勘定振替実績を削除する。<br>
	 */
	public class Del01 extends MSBEL_AcXfrActReg_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk03();
			throwCanErr();
			callAcXfrActServiceDel01();
		}

		protected void callThisChk03() {
			MSBEL_AcXfrActReg.Chk03 ope = MSBEL_AcXfrActReg.crtChk03();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callAcXfrActServiceDel01() {
			MSBEL_AcXfrActRegService.AcXfrAct_Del01 ope = MSBEL_AcXfrActRegService
					.crtAcXfrAct_Del01();
			AcXfrAct_Chk03_HdrR actR = AcXfrAct_Chk03_HdrR.create();

			copy(actR, up0(), createMap_AcXfrAct_Chk03_HdrR_Chk03_HdrR());
			ope.up0().add(actR);
			addAll(ope.up1(), up1(), createMap_AcXfrAct_Chk03_DtlR_Chk03_DtlR());
			ope.exec();
		}
	}

	protected void setLotNo(Chk01_HdrR up0, MCList<Chk01_DtlR> up1) {
		for (Chk01_DtlR dtlR : up1) {
			if (dtlR.crt_lot_flg()) {
				if (canGenerateLotNo(dtlR)) {
					dtlR.lot_no(getLotNo(up0, dtlR, MAC_NUM_BIZ_TYP.LOT));
				}
			}
			if (dtlR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(dtlR.sublot_mng_typ())) {
				if (canGenerateSubLotNo(dtlR)) {
					dtlR.sublot_no(getLotNo(up0, dtlR, MAC_NUM_BIZ_TYP.SUBLOT));
				}
			}
		}
	}

	protected boolean canGenerateLotNo(Chk01_DtlR dtlR) {
		if (isNull(dtlR)) {
			return false;
		}

		if (MAC_LOT_NO_TYP.isAUTO(dtlR.lot_no_typ())) {
			return true;
		}
		else if (MAC_LOT_NO_TYP.isAUTO_MANU(dtlR.lot_no_typ())) {
			return isNullOrNullVal(dtlR.lot_no());
		}

		return false;
	}

	protected boolean canGenerateSubLotNo(Chk01_DtlR dtlR) {
		if (isNull(dtlR)) {
			return false;
		}

		if (MAC_SUBLOT_MNG_TYP.isSTK(dtlR.sublot_mng_typ())) {
			if (!MAC_LOT_NO_TYP.isMANUAL(dtlR.sublot_no_typ())) {
				return isNullOrNullVal(dtlR.sublot_no());
			}
		}
		else {
			if (MAC_LOT_NO_TYP.isAUTO(dtlR.sublot_no_typ())) {
				return true;
			}
			else if (MAC_LOT_NO_TYP.isAUTO_MANU(dtlR.sublot_no_typ())) {
				return isNullOrNullVal(dtlR.sublot_no());
			}
		}

		return false;
	}

	protected String getLotNo(Chk01_HdrR up0, Chk01_DtlR dtlR,
			MAC_NUM_BIZ_TYP numBizTyp) {

		ElmArgsR lotArgs = ElmArgsR.create();
		if (MAC_NUM_BIZ_TYP.isLOT(numBizTyp)) {
			lotArgs.num_ptn_cd(dtlR.lot_no_ptn_cd());
		}
		else {
			lotArgs.num_ptn_cd(dtlR.sublot_no_ptn_cd());
		}
		lotArgs.itm_cd(dtlR.itm_cd());
		lotArgs.itm_sub1(dtlR.itm_sub1());
		lotArgs.itm_sub2(dtlR.itm_sub2());
		lotArgs.itm_sub3(dtlR.itm_sub3());
		lotArgs.loc_cd(up0.loc_cd());
		lotArgs.dpt_cd(up0.act_dpt_cd());
		lotArgs.co_cd(getCo().co_cd());
		lotArgs.bp_cd(null);
		lotArgs.wg_cd(up0.wg_cd());
		lotArgs.site_cd(null);
		lotArgs.trd_cd(up0.trd_cd());
		lotArgs.dt(up0.acxfr_act_tm());
		lotArgs.str(null);
		lotArgs.str2(null);
		lotArgs.str3(null);
		lotArgs.num(null);
		lotArgs.bp_lot_no(null);
		lotArgs.sno1(dtlR.sno1());
		lotArgs.sno2(dtlR.sno2());
		lotArgs.sno3(dtlR.sno3());
		lotArgs.sno4(dtlR.sno4());
		if (MAC_NUM_BIZ_TYP.isSUBLOT(numBizTyp)) {
			lotArgs.lot_no(dtlR.lot_no());
		}

		return getNum(numBizTyp, lotArgs);
	}

	protected MCMessageList checkStkIdTyp(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		for (Chk01_DtlR dtlR : dtlL) {
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				if (!MSC_STK_ID_TYP.is_act_gr(dtlR.stk_id_typ())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL0083, toDispGUIIndex(dtlR)));
				}
				if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dtlR.stk_id_typ())
						|| MSC_STK_ID_TYP.isCSTSTK(dtlR.stk_id_typ())
						|| MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
					if (!isNull(hdrR.sppl_cd())) {
						msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL1204, hdrR.loc_cd(), toDispGUIIndex(dtlR)));
					}
				}
				if (MSC_STK_ID_TYP.isONR_PROV(dtlR.stk_id_typ())) {
					if (isNull(hdrR.sppl_cd())) {
						msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL1205, hdrR.loc_cd(), toDispGUIIndex(dtlR)));
					}
				}
			}

			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
				if (!MSC_STK_ID_TYP.is_act_gi(dtlR.stk_id_typ())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL0082, toDispGUIIndex(dtlR)));
				}
			}

			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
				if (!MSC_STK_ID_TYP.is_act_scrp(dtlR.stk_id_typ())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL0084, toDispGUIIndex(dtlR)));
				}
			}
		}

		return msgL;
	}

	protected MCMessageList checkFixNoTyp(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
			for (Chk01_DtlR dtlR : dtlL) {
				if (!MSC_FIX_NO_TYP.is_stk_oth_gi(dtlR.fix_no_typ())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$fix_no_typ, MSBEL0308, toDispGUIIndex(dtlR)));
				}
			}
		}
		return msgL;
	}

	/**
	 * ヘッダ情報に対して、条件に応じた必須チェックを実施する。<p>
	 * @param isCrt 新規登録処理FLG　(訂正・取消の場合はfalse)
	 * @param hdr　ヘッダ情報
	 * @return　メッセージリスト
	 */
	protected MCMessageList chkReqHdr(boolean isCrt, Chk01_HdrR hdr) {
		MCMessageList msgList = new MCMessageList();

		if (isCrt) {
			// 指図から実績を登録する場合
			if (!isNull(hdr.inst_upd_cntr())) {
				// 【必須入力】他勘定振替指図ＮＯ
				msgList.addAll(check(hdr, Chk01_HdrR.$acxfr_inst_no,
						new FXUCL_RequiredValidater()));
			}
		}
		else {
			// 【必須入力】他勘定振替実績ＮＯ
			msgList.addAll(
					check(hdr, Chk01_HdrR.$acxfr_act_no, new FXUCL_RequiredValidater()));
			// 【必須入力】改訂番号
			msgList.addAll(
					check(hdr, Chk01_HdrR.$acxfr_act_rev, new FXUCL_RequiredValidater()));
		}

		return msgList;
	}

	/**
	 * ヘッダ情報に対して、条件に応じた必須チェックを実施する。<p>
	 * @param isCrt 新規登録処理FLG　(訂正・取消の場合はfalse)
	 * @param hdr　ヘッダ情報
	 * @param dtlL　明細情報
	 * @return　メッセージリスト
	 */
	protected MCMessageList chkReqDtl(boolean isCrt, Chk01_HdrR hdr,
			MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgList = new MCMessageList();

		if (isCrt) {
			// 指図から実績を登録する場合
			if (!isNull(hdr.inst_upd_cntr())) {
				if (!MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdr.trd_ptn_typ())) {
					// 【必須入力】確定ＮＯ区分
					msgList.addAll(check(dtlL, Chk01_DtlR.$fix_no_typ,
							new FXUCL_RequiredValidater()));
					// 【必須入力】確定ＮＯ
					msgList.addAll(check(dtlL, Chk01_DtlR.$fix_no,
							new FXUCL_RequiredValidater()));
				}
				// 【必須入力】承認対象ＦＬＧ
				msgList.addAll(
						check(dtlL, Chk01_DtlR.$aprv_flg, new FXUCL_RequiredValidater()));

				for (Chk01_DtlR dtl : dtlL) {
					if (dtl.aprv_flg()) {
						// 【必須入力】承認NO
						msgList.addAll(check(dtlL, Chk01_DtlR.$aprv_no,
								new FXUCL_RequiredValidater()));
					}
				}
			}
		}
		else {
			for (Chk01_DtlR dtl : dtlL) {
				// 明細追加
				if (MAC_DATA_CRUD_TYP.isCRT(dtl.data_crud_typ())) {
					if (!MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdr.trd_ptn_typ())) {
						// 【必須入力】確定ＮＯ区分
						msgList.addAll(check(dtl, Chk01_DtlR.$fix_no_typ,
								new FXUCL_RequiredValidater()));
						// 【必須入力】確定ＮＯ
						msgList.addAll(check(dtl, Chk01_DtlR.$fix_no,
								new FXUCL_RequiredValidater()));
					}
					// 【必須入力】承認対象ＦＬＧ
					msgList.addAll(check(dtlL, Chk01_DtlR.$aprv_flg,
							new FXUCL_RequiredValidater()));
					if (dtl.aprv_flg()) {
						// 【必須入力】承認NO
						msgList.addAll(check(dtlL, Chk01_DtlR.$aprv_no,
								new FXUCL_RequiredValidater()));
					}
					// 【必須入力】表示順
					msgList.addAll(check(dtlL, Chk01_DtlR.$disp_seq,
							new FXUCL_RequiredValidater()));
				}
				// 明細訂正
				else if (MAC_DATA_CRUD_TYP.isUPD(dtl.data_crud_typ())) {
					// 【必須入力】他勘定振替実績明細ＮＯ
					msgList.addAll(check(dtlL, Chk01_DtlR.$acxfr_act_d_no,
							new FXUCL_RequiredValidater()));
				}
				// 明細削除
				else if (MAC_DATA_CRUD_TYP.isDEL(dtl.data_crud_typ())) {
					// 【必須入力】他勘定振替実績明細ＮＯ
					msgList.addAll(check(dtlL, Chk01_DtlR.$acxfr_act_d_no,
							new FXUCL_RequiredValidater()));
					// 【必須入力】承認対象ＦＬＧ
					msgList.addAll(check(dtlL, Chk01_DtlR.$aprv_flg,
							new FXUCL_RequiredValidater()));
					if (dtl.aprv_flg()) {
						// 【必須入力】承認NO
						msgList.addAll(check(dtlL, Chk01_DtlR.$aprv_no,
								new FXUCL_RequiredValidater()));
					}
				}
			}
		}

		return msgList;
	}

	protected void setBaseUnitQty(Chk01_DtlR dtlR) {
		if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
	}

	protected void setStkAmt(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		dtlR.stk_amt(MAUCL_AmtUtil.getAmt(
				MAUCL_StdUpriUtil.getStdCost(dtlR.itm_cd(), dtlR.itm_sub1(),
						dtlR.itm_sub2(), dtlR.itm_sub3(), hdrR.ac_dt(), hdrR.wg_cd(),
						getCo().stk_std_upri_typ()),
				dtlR.base_unit_qty(), getBaseCur().amt_dec_place(),
				getCo().stk_amt_rnd_typ()));
	}

	protected void setStrLn(Chk01_DtlR dtlR) {
		if (!isNull(dtlR.loc_cd()) && isNull(dtlR.str_ln_cd())) {
			dtlR.str_ln_cd(MAC_STR.NULL_VAL.value());
		}
	}

	protected void setStkAmtForSrch(Srch01_DtlR dtlR) {
		dtlR.base_cur_cd(getBaseCur().cur_cd());
		dtlR.base_cur_nm(getBaseCur().cur_nm());
		dtlR.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		dtlR.stk_amt(MAUCL_AmtUtil.getAmt(dtlR.std_upri(), dtlR.base_unit_qty(),
				getBaseCur().amt_dec_place(), getCo().stk_amt_rnd_typ()));
	}

	protected void setPackUnitQtyForInsUpd(Chk01_DtlR dtlR) {
		if (dtlR.pack_flg()) {
			dtlR.pack_unit_cd(dtlR.trd_unit_cd());
			dtlR.pack_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.pack_unit_cd(dtlR.base_unit_cd());
			dtlR.pack_unit_qty(dtlR.base_unit_qty());
		}
	}

	protected void customListLogicCndSub(String column, MCNumber paramIndex,
			MCConstRow data, Map<String, Comparable<?>> cnd, Chk01_HdrR hdrR,
			MCList<Chk01_DtlR> dtlL) {
		if (isSame(paramIndex, MCNumber.ONE) && isSame(column, Chk01_DtlR.$rsn_cd)) {
			cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, false);
			cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, false);
			cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, false);

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, true);
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
				cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, true);
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
				cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, true);
			}
			else {
				cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, false);
				cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, false);
				cnd.put(MAUAC_List.AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, false);
			}
		}
		else if (isSame(paramIndex, MCNumber.ONE)
				&& isSame(column, Chk01_DtlR.$stk_bp_cd)) {
			String stkIdTyp = data.getStringNE(Chk01_DtlR.$stk_id_typ);
			if (isNull(stkIdTyp)) {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.COMM.value());
			}
			else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stkIdTyp)
					|| MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.CST.value());
			}
			else if (MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stkIdTyp)
					|| MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp)
					|| MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)
					|| MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.SPPL.value());
			}
			else {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.COMM.value());
			}
		}
		else if (isSame(paramIndex, MCNumber.ONE)
				&& isSame(column, Chk01_DtlR.$stk_arrv_bp_cd)) {
			// 自社場所
			if (isNull(hdrR.sppl_cd())) {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.DLV.value());
			}
			// 外注場所
			else {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.SPPL.value());
			}

		}
	}

	protected Map_AcXfrAct_Chk01_HdrR_Chk01_HdrR<AcXfrAct_Chk01_HdrR, Chk01_HdrR> createMap_AcXfrAct_Chk01_HdrR_Chk01_HdrR() {
		return new Map_AcXfrAct_Chk01_HdrR_Chk01_HdrR<AcXfrAct_Chk01_HdrR, Chk01_HdrR>();
	}

	public class Map_AcXfrAct_Chk01_HdrR_Chk01_HdrR<D extends AcXfrAct_Chk01_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_act_no, Chk01_HdrR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_act_rev,
					Chk01_HdrR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$loc_cd, Chk01_HdrR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_inst_no,
					Chk01_HdrR.$acxfr_inst_no);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$acxfr_act_tm, Chk01_HdrR.$acxfr_act_tm);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$act_usr_cd, Chk01_HdrR.$act_usr_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$act_dpt_cd, Chk01_HdrR.$act_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$prnt_flg, Chk01_HdrR.$prnt_flg);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$hdr_dtl_peg, Chk01_HdrR.$hdr_dtl_peg);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$data_crud_typ,
					Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$err_flg, Chk01_HdrR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);

		}
	}

	protected Map_AcXfrAct_Chk01_DtlR_Chk01_DtlR<AcXfrAct_Chk01_DtlR, Chk01_DtlR> createMap_AcXfrAct_Chk01_DtlR_Chk01_DtlR() {
		return new Map_AcXfrAct_Chk01_DtlR_Chk01_DtlR<AcXfrAct_Chk01_DtlR, Chk01_DtlR>();
	}

	public class Map_AcXfrAct_Chk01_DtlR_Chk01_DtlR<D extends AcXfrAct_Chk01_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$pr_sts_typ, Chk01_DtlR.$pr_sts_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$crt_lot_flg, Chk01_DtlR.$crt_lot_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$base_unit_qty,
					Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$pack_unit_cd, Chk01_DtlR.$pack_unit_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$pack_unit_qty,
					Chk01_DtlR.$pack_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd,
					Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$fix_no_typ, Chk01_DtlR.$fix_no_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$fix_no, Chk01_DtlR.$fix_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_bp_cd, Chk01_DtlR.$bd_bp_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$dspsl_no, Chk01_DtlR.$dspsl_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_schd_no,
					Chk01_DtlR.$acxfr_schd_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_inst_d_no,
					Chk01_DtlR.$acxfr_inst_d_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_act_d_no,
					Chk01_DtlR.$acxfr_act_d_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$aprv_flg, Chk01_DtlR.$aprv_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$aprv_no, Chk01_DtlR.$aprv_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_act_no, Chk01_DtlR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$acxfr_act_rev,
					Chk01_DtlR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$in_xfr_typ, Chk01_DtlR.$in_xfr_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$io_schd_pr_no,
					Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$asset_mng_typ,
					Chk01_DtlR.$asset_mng_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$trd_ptn_typ, Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$sundry_itm_flg,
					Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$inst_base_unit_qty,
					Chk01_DtlR.$inst_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$schd_base_unit_qty,
					Chk01_DtlR.$schd_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$hdr_dtl_peg, Chk01_DtlR.$hdr_dtl_peg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$data_crud_typ,
					Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);

			addColumnPathMap(AcXfrAct_Chk01_DtlR.$vmi_interim_flg,
					Chk01_DtlR.$vmi_interim_flg);
			addColumnPathMap(AcXfrAct_Chk01_DtlR.$vmi_upri, Chk01_DtlR.$vmi_upri);

		}
	}

	protected Map_AcXfrAct_Chk03_HdrR_Chk03_HdrR<AcXfrAct_Chk03_HdrR, Chk03_HdrR> createMap_AcXfrAct_Chk03_HdrR_Chk03_HdrR() {
		return new Map_AcXfrAct_Chk03_HdrR_Chk03_HdrR<AcXfrAct_Chk03_HdrR, Chk03_HdrR>();
	}

	public class Map_AcXfrAct_Chk03_HdrR_Chk03_HdrR<D extends AcXfrAct_Chk03_HdrR, S extends Chk03_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_act_no, Chk03_HdrR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_act_rev,
					Chk03_HdrR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$trd_cd, Chk03_HdrR.$trd_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$trd_ptn_typ, Chk03_HdrR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$loc_cd, Chk03_HdrR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$wg_cd, Chk03_HdrR.$wg_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_inst_no,
					Chk03_HdrR.$acxfr_inst_no);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$acxfr_act_tm, Chk03_HdrR.$acxfr_act_tm);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$ac_dt, Chk03_HdrR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$can_ac_dt, Chk03_HdrR.$can_ac_dt);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$act_usr_cd, Chk03_HdrR.$act_usr_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$act_dpt_cd, Chk03_HdrR.$act_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$trd_rmrks, Chk03_HdrR.$trd_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$intr_rmrks, Chk03_HdrR.$intr_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$prnt_flg, Chk03_HdrR.$prnt_flg);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$sub_char1, Chk03_HdrR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$sub_char2, Chk03_HdrR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$sub_char3, Chk03_HdrR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$hdr_dtl_peg, Chk03_HdrR.$hdr_dtl_peg);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$data_crud_typ,
					Chk03_HdrR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$err_flg, Chk03_HdrR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk03_HdrR.$peg_no, Chk03_HdrR.$peg_no);

		}
	}

	protected Map_AcXfrAct_Chk03_DtlR_Chk03_DtlR<AcXfrAct_Chk03_DtlR, Chk03_DtlR> createMap_AcXfrAct_Chk03_DtlR_Chk03_DtlR() {
		return new Map_AcXfrAct_Chk03_DtlR_Chk03_DtlR<AcXfrAct_Chk03_DtlR, Chk03_DtlR>();
	}

	public class Map_AcXfrAct_Chk03_DtlR_Chk03_DtlR<D extends AcXfrAct_Chk03_DtlR, S extends Chk03_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$abort_flg, Chk03_DtlR.$abort_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$pr_sts_typ, Chk03_DtlR.$pr_sts_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_cd, Chk03_DtlR.$itm_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_sub1, Chk03_DtlR.$itm_sub1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_sub2, Chk03_DtlR.$itm_sub2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_sub3, Chk03_DtlR.$itm_sub3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$itm_nm, Chk03_DtlR.$itm_nm);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$crt_lot_flg, Chk03_DtlR.$crt_lot_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$lot_no, Chk03_DtlR.$lot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sublot_no, Chk03_DtlR.$sublot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$ver_no, Chk03_DtlR.$ver_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_unit_cd, Chk03_DtlR.$trd_unit_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_unit_qty, Chk03_DtlR.$trd_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$base_unit_cd, Chk03_DtlR.$base_unit_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$base_unit_qty,
					Chk03_DtlR.$base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$pack_unit_cd, Chk03_DtlR.$pack_unit_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$pack_unit_qty,
					Chk03_DtlR.$pack_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$str_ln_cd, Chk03_DtlR.$str_ln_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_dpt_cd, Chk03_DtlR.$bd_dpt_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_arrv_bp_cd,
					Chk03_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$quality_typ, Chk03_DtlR.$quality_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_insp_typ, Chk03_DtlR.$stk_insp_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_id_typ, Chk03_DtlR.$stk_id_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$gd_cd, Chk03_DtlR.$gd_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_bp_cd, Chk03_DtlR.$stk_bp_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno1, Chk03_DtlR.$sno1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno2, Chk03_DtlR.$sno2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno3, Chk03_DtlR.$sno3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sno4, Chk03_DtlR.$sno4);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$fix_no_typ, Chk03_DtlR.$fix_no_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$fix_no, Chk03_DtlR.$fix_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_loc_cd, Chk03_DtlR.$bd_loc_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_ctg_cd, Chk03_DtlR.$bd_ctg_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_oper_cd, Chk03_DtlR.$bd_oper_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_bp_cd, Chk03_DtlR.$bd_bp_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_cd, Chk03_DtlR.$bd_itm_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_sub1, Chk03_DtlR.$bd_itm_sub1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_sub2, Chk03_DtlR.$bd_itm_sub2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_itm_sub3, Chk03_DtlR.$bd_itm_sub3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_lot_no, Chk03_DtlR.$bd_lot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sublot_no, Chk03_DtlR.$bd_sublot_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno1, Chk03_DtlR.$bd_sno1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno2, Chk03_DtlR.$bd_sno2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno3, Chk03_DtlR.$bd_sno3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$bd_sno4, Chk03_DtlR.$bd_sno4);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_d_rmrks, Chk03_DtlR.$trd_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$intr_d_rmrks, Chk03_DtlR.$intr_d_rmrks);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$dspsl_no, Chk03_DtlR.$dspsl_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_schd_no,
					Chk03_DtlR.$acxfr_schd_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_inst_d_no,
					Chk03_DtlR.$acxfr_inst_d_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_act_d_no,
					Chk03_DtlR.$acxfr_act_d_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$aprv_flg, Chk03_DtlR.$aprv_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$aprv_no, Chk03_DtlR.$aprv_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$disp_seq, Chk03_DtlR.$disp_seq);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sub_char1, Chk03_DtlR.$sub_char1);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sub_char2, Chk03_DtlR.$sub_char2);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sub_char3, Chk03_DtlR.$sub_char3);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_act_no, Chk03_DtlR.$acxfr_act_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$acxfr_act_rev,
					Chk03_DtlR.$acxfr_act_rev);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$loc_cd, Chk03_DtlR.$loc_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$rsn_cd, Chk03_DtlR.$rsn_cd);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$in_xfr_typ, Chk03_DtlR.$in_xfr_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$io_schd_pr_no,
					Chk03_DtlR.$io_schd_pr_no);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$stk_mng_typ, Chk03_DtlR.$stk_mng_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$asset_mng_typ,
					Chk03_DtlR.$asset_mng_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$ac_dt, Chk03_DtlR.$ac_dt);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$trd_ptn_typ, Chk03_DtlR.$trd_ptn_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$sundry_itm_flg,
					Chk03_DtlR.$sundry_itm_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$inst_base_unit_qty,
					Chk03_DtlR.$inst_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$schd_base_unit_qty,
					Chk03_DtlR.$schd_base_unit_qty);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$hdr_dtl_peg, Chk03_DtlR.$hdr_dtl_peg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$data_crud_typ,
					Chk03_DtlR.$data_crud_typ);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$err_flg, Chk03_DtlR.$err_flg);
			addColumnPathMap(AcXfrAct_Chk03_DtlR.$peg_no, Chk03_DtlR.$peg_no);

		}
	}

	protected Map_Chk03_HdrR_MST_ACXFR_ACT_R<Chk03_HdrR, MST_ACXFR_ACT_R> createMap_Chk03_HdrR_MST_ACXFR_ACT_R() {
		return new Map_Chk03_HdrR_MST_ACXFR_ACT_R<Chk03_HdrR, MST_ACXFR_ACT_R>();
	}

	public class Map_Chk03_HdrR_MST_ACXFR_ACT_R<D extends Chk03_HdrR, S extends MST_ACXFR_ACT_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk03_HdrR.$acxfr_act_no, MST_ACXFR_ACT_R.$acxfr_act_no);
			addColumnPathMap(Chk03_HdrR.$acxfr_act_rev, MST_ACXFR_ACT_R.$acxfr_act_rev);
			addColumnPathMap(Chk03_HdrR.$trd_cd, MST_ACXFR_ACT_R.$trd_cd);
			addColumnPathMap(Chk03_HdrR.$trd_ptn_typ, MST_ACXFR_ACT_R.$trd_ptn_typ);
			addColumnPathMap(Chk03_HdrR.$loc_cd, MST_ACXFR_ACT_R.$loc_cd);
			addColumnPathMap(Chk03_HdrR.$wg_cd, MST_ACXFR_ACT_R.$wg_cd);
			addColumnPathMap(Chk03_HdrR.$acxfr_inst_no, MST_ACXFR_ACT_R.$acxfr_inst_no);
			addColumnPathMap(Chk03_HdrR.$acxfr_act_tm, MST_ACXFR_ACT_R.$acxfr_act_tm);
			addColumnPathMap(Chk03_HdrR.$ac_dt, MST_ACXFR_ACT_R.$ac_dt);
			addColumnPathMap(Chk03_HdrR.$act_usr_cd, MST_ACXFR_ACT_R.$act_usr_cd);
			addColumnPathMap(Chk03_HdrR.$act_dpt_cd, MST_ACXFR_ACT_R.$act_dpt_cd);
			addColumnPathMap(Chk03_HdrR.$trd_rmrks, MST_ACXFR_ACT_R.$trd_rmrks);
			addColumnPathMap(Chk03_HdrR.$intr_rmrks, MST_ACXFR_ACT_R.$intr_rmrks);
			addColumnPathMap(Chk03_HdrR.$sub_char1, MST_ACXFR_ACT_R.$sub_char1);
			addColumnPathMap(Chk03_HdrR.$sub_char2, MST_ACXFR_ACT_R.$sub_char2);
			addColumnPathMap(Chk03_HdrR.$sub_char3, MST_ACXFR_ACT_R.$sub_char3);

		}
	}

	protected Map_Chk03_DtlR_MST_ACXFR_ACT_D_R<Chk03_DtlR, MST_ACXFR_ACT_D_R> createMap_Chk03_DtlR_MST_ACXFR_ACT_D_R() {
		return new Map_Chk03_DtlR_MST_ACXFR_ACT_D_R<Chk03_DtlR, MST_ACXFR_ACT_D_R>();
	}

	public class Map_Chk03_DtlR_MST_ACXFR_ACT_D_R<D extends Chk03_DtlR, S extends MST_ACXFR_ACT_D_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk03_DtlR.$itm_cd, MST_ACXFR_ACT_D_R.$itm_cd);
			addColumnPathMap(Chk03_DtlR.$itm_sub1, MST_ACXFR_ACT_D_R.$itm_sub1);
			addColumnPathMap(Chk03_DtlR.$itm_sub2, MST_ACXFR_ACT_D_R.$itm_sub2);
			addColumnPathMap(Chk03_DtlR.$itm_sub3, MST_ACXFR_ACT_D_R.$itm_sub3);
			addColumnPathMap(Chk03_DtlR.$lot_no, MST_ACXFR_ACT_D_R.$lot_no);
			addColumnPathMap(Chk03_DtlR.$sublot_no, MST_ACXFR_ACT_D_R.$sublot_no);
			addColumnPathMap(Chk03_DtlR.$trd_unit_cd, MST_ACXFR_ACT_D_R.$trd_unit_cd);
			addColumnPathMap(Chk03_DtlR.$trd_unit_qty, MST_ACXFR_ACT_D_R.$trd_unit_qty);
			addColumnPathMap(Chk03_DtlR.$pack_unit_cd, MST_ACXFR_ACT_D_R.$pack_unit_cd);
			addColumnPathMap(Chk03_DtlR.$pack_unit_qty, MST_ACXFR_ACT_D_R.$pack_unit_qty);
			addColumnPathMap(Chk03_DtlR.$base_unit_cd, MST_ACXFR_ACT_D_R.$base_unit_cd);
			addColumnPathMap(Chk03_DtlR.$base_unit_qty, MST_ACXFR_ACT_D_R.$base_unit_qty);
			addColumnPathMap(Chk03_DtlR.$str_ln_cd, MST_ACXFR_ACT_D_R.$str_ln_cd);
			addColumnPathMap(Chk03_DtlR.$stk_arrv_bp_cd,
					MST_ACXFR_ACT_D_R.$stk_arrv_bp_cd);
			addColumnPathMap(Chk03_DtlR.$quality_typ, MST_ACXFR_ACT_D_R.$quality_typ);
			addColumnPathMap(Chk03_DtlR.$stk_insp_typ, MST_ACXFR_ACT_D_R.$stk_insp_typ);
			addColumnPathMap(Chk03_DtlR.$stk_id_typ, MST_ACXFR_ACT_D_R.$stk_id_typ);
			addColumnPathMap(Chk03_DtlR.$gd_cd, MST_ACXFR_ACT_D_R.$gd_cd);
			addColumnPathMap(Chk03_DtlR.$stk_bp_cd, MST_ACXFR_ACT_D_R.$stk_bp_cd);
			addColumnPathMap(Chk03_DtlR.$sno1, MST_ACXFR_ACT_D_R.$sno1);
			addColumnPathMap(Chk03_DtlR.$sno2, MST_ACXFR_ACT_D_R.$sno2);
			addColumnPathMap(Chk03_DtlR.$sno3, MST_ACXFR_ACT_D_R.$sno3);
			addColumnPathMap(Chk03_DtlR.$sno4, MST_ACXFR_ACT_D_R.$sno4);
			addColumnPathMap(Chk03_DtlR.$fix_no_typ, MST_ACXFR_ACT_D_R.$fix_no_typ);
			addColumnPathMap(Chk03_DtlR.$fix_no, MST_ACXFR_ACT_D_R.$fix_no);
			addColumnPathMap(Chk03_DtlR.$bd_dpt_cd, MST_ACXFR_ACT_D_R.$bd_dpt_cd);
			addColumnPathMap(Chk03_DtlR.$bd_itm_cd, MST_ACXFR_ACT_D_R.$bd_itm_cd);
			addColumnPathMap(Chk03_DtlR.$bd_itm_sub1, MST_ACXFR_ACT_D_R.$bd_itm_sub1);
			addColumnPathMap(Chk03_DtlR.$bd_itm_sub2, MST_ACXFR_ACT_D_R.$bd_itm_sub2);
			addColumnPathMap(Chk03_DtlR.$bd_itm_sub3, MST_ACXFR_ACT_D_R.$bd_itm_sub3);
			addColumnPathMap(Chk03_DtlR.$bd_bp_cd, MST_ACXFR_ACT_D_R.$bd_bp_cd);
			addColumnPathMap(Chk03_DtlR.$bd_loc_cd, MST_ACXFR_ACT_D_R.$bd_loc_cd);
			addColumnPathMap(Chk03_DtlR.$bd_ctg_cd, MST_ACXFR_ACT_D_R.$bd_ctg_cd);
			addColumnPathMap(Chk03_DtlR.$bd_oper_cd, MST_ACXFR_ACT_D_R.$bd_oper_cd);
			addColumnPathMap(Chk03_DtlR.$bd_lot_no, MST_ACXFR_ACT_D_R.$bd_lot_no);
			addColumnPathMap(Chk03_DtlR.$bd_sublot_no, MST_ACXFR_ACT_D_R.$bd_sublot_no);
			addColumnPathMap(Chk03_DtlR.$bd_sno1, MST_ACXFR_ACT_D_R.$bd_sno1);
			addColumnPathMap(Chk03_DtlR.$bd_sno2, MST_ACXFR_ACT_D_R.$bd_sno2);
			addColumnPathMap(Chk03_DtlR.$bd_sno3, MST_ACXFR_ACT_D_R.$bd_sno3);
			addColumnPathMap(Chk03_DtlR.$bd_sno4, MST_ACXFR_ACT_D_R.$bd_sno4);
			addColumnPathMap(Chk03_DtlR.$trd_d_rmrks, MST_ACXFR_ACT_D_R.$trd_d_rmrks);
			addColumnPathMap(Chk03_DtlR.$intr_d_rmrks, MST_ACXFR_ACT_D_R.$intr_d_rmrks);
			addColumnPathMap(Chk03_DtlR.$dspsl_no, MST_ACXFR_ACT_D_R.$dspsl_no);
			addColumnPathMap(Chk03_DtlR.$acxfr_schd_no, MST_ACXFR_ACT_D_R.$acxfr_schd_no);
			addColumnPathMap(Chk03_DtlR.$acxfr_inst_d_no,
					MST_ACXFR_ACT_D_R.$acxfr_inst_d_no);
			addColumnPathMap(Chk03_DtlR.$acxfr_act_d_no,
					MST_ACXFR_ACT_D_R.$acxfr_act_d_no);
			addColumnPathMap(Chk03_DtlR.$aprv_flg, MST_ACXFR_ACT_D_R.$aprv_flg);
			addColumnPathMap(Chk03_DtlR.$aprv_no, MST_ACXFR_ACT_D_R.$aprv_no);
			addColumnPathMap(Chk03_DtlR.$sub_char1, MST_ACXFR_ACT_D_R.$sub_char1);
			addColumnPathMap(Chk03_DtlR.$sub_char2, MST_ACXFR_ACT_D_R.$sub_char2);
			addColumnPathMap(Chk03_DtlR.$sub_char3, MST_ACXFR_ACT_D_R.$sub_char3);
			addColumnPathMap(Chk03_DtlR.$disp_seq, MST_ACXFR_ACT_D_R.$disp_seq);
			addColumnPathMap(Chk03_DtlR.$acxfr_act_no, MST_ACXFR_ACT_D_R.$acxfr_act_no);
			addColumnPathMap(Chk03_DtlR.$acxfr_act_rev, MST_ACXFR_ACT_D_R.$acxfr_act_rev);
			addColumnPathMap(Chk03_DtlR.$rsn_cd, MST_ACXFR_ACT_D_R.$rsn_cd);
			addColumnPathMap(Chk03_DtlR.$in_xfr_typ, MST_ACXFR_ACT_D_R.$in_xfr_typ);
			addColumnPathMap(Chk03_DtlR.$io_schd_pr_no, MST_ACXFR_ACT_D_R.$io_schd_pr_no);

		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 振替伝票を印刷する。<br>
	 */
	public class Prnt01 extends MSBEL_AcXfrActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 出荷帳票発行サービス呼び出し
			callShipRprtPrnt01();
			
			MST_ACXFR_ACT_R actR = MST_ACXFR_ACT_R.create();
			MST_ACXFR_ACT_R t = MST_ACXFR_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			actR.acxfr_act_no(up0().dlv_slip_act_no());
			actR_bldr.setSetVL(t.prnt_flg, value(true));
			dbUpdateKey("MSBEL2420_MST_ACXFR_ACT_U01", actR, actR_bldr);
			callRevDataIns01();
		}

		/**
		 * 出荷帳票発行サービスのPrnt01を実行する。
		 */
		protected void callShipRprtPrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 sxa = makelShipRprtPrnt01(up0());
			sxa.exec();
		}

		/**
		 * 出荷帳票発行サービスの「ShipRprt_Prnt01」インスタンスを生成する。
		 */
		protected MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 makelShipRprtPrnt01(
				ShipRprt_Prnt01_HdrR up0) {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 srp = MSBEL_ShipRprtPrntService
					.crtShipRprt_Prnt01();
			up0.trn_typ(MSC_TRN_TYP.ACXFR.value());
			up0.dlv_slip_prnt_flg(true);
			srp.up0().add(up0);

			return srp;
		}
		
		protected void callRevDataIns01() {
			MST_ACXFR_ACT_R actR = MST_ACXFR_ACT_R.create();
			MST_ACXFR_ACT_R t = MST_ACXFR_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			actR.acxfr_act_no(up0().dlv_slip_act_no());
			actR_bldr.setSelect(t.acxfr_act_no, t.acxfr_act_rev);
			dbSelectKey("MSBEL2420_MST_ACXFR_ACT_S03", actR, actR_bldr, actR);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(actR.acxfr_act_no());
			opeR.rev_no(actR.acxfr_act_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_ACXFR_ACT.value());
			ope.up0().add(opeR);
			ope.exec();
		}
	}

	//FMCB CUSTOM END
}