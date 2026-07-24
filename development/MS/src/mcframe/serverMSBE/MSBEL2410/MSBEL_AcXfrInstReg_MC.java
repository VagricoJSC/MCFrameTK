package mcframe.serverMSBE.MSBEL2410;

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
import mcframe.serverMSBE.MSBEL2410.*; // このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverMSBE.MSBEL2410.Query.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;

import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMAUC.MAUCL0080.*;
import mcframe.serverMAUC.MAUCL0100.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMABC.MABCL5010.*;
import mcframe.serverMSBF.MSBFL5210.*;

import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AcXfrInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AcXfrInstReg_MC extends MSBEL_AcXfrInstReg_MC_A{
	//FMCB CUSTOM START

	protected String _acxfrInstNo = null;

	protected int _dtlSize = 0;

	/**	HashMap(IoSchdCol, AcXfrInstCol) */
	protected Map<String, String> _insIoSchdMap = new HashMap<String, String>();

	// 登録対象明細、訂正対象明細、削除対象明細、取消対象明細のレコードを一時的に格納する
	protected MCList<MST_ACXFR_INST_D_R> _createInstDL = MCList.create(MST_ACXFR_INST_D_R.class);
	protected MST_ACXFR_INST_D_R _createInstDL_t = MST_ACXFR_INST_D_R.create("T");
	protected MCQueryApiBuilder _createInstDL_bldr = MCQueryApiBuilder.create(_createInstDL_t);
	protected MCList<MST_ACXFR_INST_D_R> _modifyInstDL = MCList.create(MST_ACXFR_INST_D_R.class);
	protected MST_ACXFR_INST_D_R _modifyInstDL_t = MST_ACXFR_INST_D_R.create("T");
	protected MCQueryApiBuilder _modifyInstDL_bldr = MCQueryApiBuilder.create(_modifyInstDL_t);
	protected MCList<MST_ACXFR_INST_D_R> _modifyInstDWithActL = MCList.create(MST_ACXFR_INST_D_R.class); //実績計上済の明細格納用（表示順の更新のみ）
	protected MST_ACXFR_INST_D_R _modifyInstDWithActL_t = MST_ACXFR_INST_D_R.create("T");
	protected MCQueryApiBuilder _modifyInstDWithActL_bldr = MCQueryApiBuilder.create(_modifyInstDWithActL_t); //実績計上済の明細格納用（表示順の更新のみ）
	protected MCList<MST_ACXFR_INST_D_R> _deleteInstDL = MCList.create(MST_ACXFR_INST_D_R.class);
	protected MST_ACXFR_INST_D_R _deleteInstDL_t = MST_ACXFR_INST_D_R.create("T");
	protected MCQueryApiBuilder _deleteInstDL_bldr = MCQueryApiBuilder.create(_deleteInstDL_t);

	// 他勘定振替予定分割関係のレコードを一時的に格納する
	protected MCList<MST_ACXFR_SCHD_R> _createSchdL = MCList.create(MST_ACXFR_SCHD_R.class);
	protected MST_ACXFR_SCHD_R _createSchdL_t = MST_ACXFR_SCHD_R.create("T");
	protected MCQueryApiBuilder _createSchdL_bldr = MCQueryApiBuilder.create(_createSchdL_t);
	protected MCList<MST_ACXFR_SCHD_R> _modifySchdL = MCList.create(MST_ACXFR_SCHD_R.class);
	protected MST_ACXFR_SCHD_R _modifySchdL_t = MST_ACXFR_SCHD_R.create("T");
	protected MCQueryApiBuilder _modifySchdL_bldr = MCQueryApiBuilder.create(_modifySchdL_t);
	protected MCList<MST_ACXFR_SCHD_R> _oldSchdL = MCList.create(MST_ACXFR_SCHD_R.class);

	protected MCList<MST_ACXFR_ACT_D_R> _actDL = MCList.create(MST_ACXFR_ACT_D_R.class);
	protected MST_ACXFR_ACT_D_R _actDL_t = MST_ACXFR_ACT_D_R.create("T");
	protected MCQueryApiBuilder _actDL_bldr = MCQueryApiBuilder.create(_actDL_t);

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 他勘定振替指図を検索する。<br>
	 */
	public class Srch01 extends MSBEL_AcXfrInstReg_MC_A.Srch01 {
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

			srchInstDtl();
		}

		/**
		 * 他勘定振替指図ヘッダを検索する。
		 *
		 * @return 検索件数
		 */
		protected int srchInstHdr() {
			if (isSame(up0().screen_ope(), OPE_UPD)
					|| isSame(up0().screen_ope(), OPE_DEL)) {
				up0().setStringNE("w_can_flg", toFalseStr(false));
			}
			return executeQuery(down0(), MSBEL2410_MST_ACXFR_INST_S01(), up0());
		}

		/**
		 * 他勘定振替指図明細を検索する。
		 */
		protected void srchInstDtl() {
			up0().setStringNE("w_unit_pack_flg", toTrueStr(true));

			int cnt = executeQuery(down1(), MSBEL2410_MST_ACXFR_INST_D_S01(), up0());

			if (isSame(cnt, 0)) {
				throw new MCAppException(up0(), null, MSBEL0005, up0().acxfr_inst_no());
			}
			editDownForSrch(down0(), down1());
		}
	}

	protected void editDownForSrch(Srch01_HdrR hdrR, MCList<Srch01_DtlR> dtlL) {
		// 取引パタン区分によって、理由ＣＤを設定する列を変える
		setOtherForSrch(dtlL);
	}

	protected void setOtherForSrch(MCList<Srch01_DtlR> dtlL) {
		for (Srch01_DtlR dtlR : dtlL) {
			setBaseUnitQtyForSrch(dtlR);
			setStkAmtForSrch(dtlR);
		}
	}

	protected void setBaseUnitQtyForSrch(Srch01_DtlR dtlR) {
		if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.trd_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
					dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
	}

	protected void setStkAmtForSrch(Srch01_DtlR dtlR) {
		dtlR.base_cur_cd(getBaseCur().cur_cd());
		dtlR.base_cur_nm(getBaseCur().cur_nm());
		dtlR.base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		dtlR.stk_amt(MAUCL_AmtUtil.getAmt(dtlR.std_upri(), dtlR.base_unit_qty(),
				getBaseCur().amt_dec_place(), getCo().stk_amt_rnd_typ()));
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 他勘定振替指図を登録する前に、チェックを実行します。<br>
	 */
	public class Chk01 extends MSBEL_AcXfrInstReg_MC_A.Chk01 {

		protected MCList<MST_ACXFR_SCHD_R> _schdL = MCList.create(MST_ACXFR_SCHD_R.class);
		protected MST_ACXFR_SCHD_R _schdL_t = MST_ACXFR_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCIndexKey _schdIdxKey = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (hasErr()) {
				return;
			}

			initCache(up1());
			editUp(up0(), up1());

			//チェック
			checkValues(up0(), up1());

			if (hasErr()) {
				return;
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

			msgL.addAll(lockSchdL());
			msgL.addAll(checkAprvSts(up1()));

			return msgL;
		}

		protected MCMessageList lockSchdL() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.acxfr_schd_no()));
			if (bindL.isEmpty()) return msgL;

			_schdL_bldr.setOrderByAsc(_schdL_t.acxfr_schd_no);
			dbSelectKeyForUpdateNoWait("MSBEL2410_MST_ACXFR_SCHD_S01", _schdL, _schdL_bldr,
					bindL.groupBy(MST_ACXFR_SCHD_R.$acxfr_schd_no));
			_schdIdxKey = _schdL.createIndex(MST_ACXFR_SCHD_R.$acxfr_schd_no);
			
			for (Chk01_DtlR r : bindL) {
				MST_ACXFR_SCHD_R selectR = _schdL.getFirst(_schdIdxKey, r.acxfr_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$schd_upd_cntr, selectR));
			}
			return msgL;
		}

		protected void compBase() {
			// トランザクションデータからの補完

			for (Chk01_DtlR dtlR : up1()) {
				if (isNull(dtlR.fix_no_typ())) {
					dtlR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
				}

				if (!isNull(dtlR.acxfr_schd_no())) {
					MST_ACXFR_SCHD_R schdR = _schdL.getFirst(_schdIdxKey, dtlR.acxfr_schd_no());
					if (!isNull(schdR)) {
						dtlR.schd_base_unit_qty(schdR.base_unit_qty());
					}
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());

			if (!up0().err_flg()) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk01_HdrR.$loc_cd));
				msgL.addAll(checkStkIdTyp(up0(), notErrL));
				msgL.addAll(checkFixNoTyp(up0(), notErrL));
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
			}
			msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place,
					Chk01_DtlR.$trd_unit_qty));
			
			msgL.addAll(callLotServiceChkBdItm(notErrL));

			return msgL;
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up0().hdr_dtl_peg(MCNumber.ONE);

			for (Chk01_DtlR dtlR : up1()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlR.hdr_dtl_peg(up0().hdr_dtl_peg());
				dtlR.trd_ptn_typ(up0().trd_ptn_typ());
				dtlR.loc_cd(up0().loc_cd());
				dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				//dtlR.fix_no("1");
				setIoSchdPrNo(dtlR);
				setBaseUnitQty(dtlR);
				setPackUnitQtyForInsUpd(dtlR);
				setStkAmt(up0(), dtlR);
				setStrLn(dtlR);
				setLot(dtlR);
			}

			setDispSeq(up1());
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd, up0());
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

			strLnBind.putBind(StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			bdDptBind.putBind(DptCols.$i_dt, up0(), Chk01_HdrR.$acxfr_inst_dt);
			grRsnBind.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, up0(),
					Chk01_HdrR.$acxfr_gr_flg);
			giRsnBind.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, up0(),
					Chk01_HdrR.$acxfr_gi_flg);
			dispRsnBind.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, up0(),
					Chk01_HdrR.$disp_flg);
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 他勘定振替指図を更新する前に、チェックを実行します。<br>
	 */
	public class Chk02 extends MSBEL_AcXfrInstReg_MC_A.Chk02 {

		protected MST_ACXFR_INST_R _instR = MST_ACXFR_INST_R.create();
		protected MST_ACXFR_INST_R _instR_t = MST_ACXFR_INST_R.create("T");
		protected MCQueryApiBuilder _instR_bldr = MCQueryApiBuilder.create(_instR_t);
		protected MCList<MST_ACXFR_INST_D_R> _instDL = MCList.create(MST_ACXFR_INST_D_R.class);
		protected MST_ACXFR_INST_D_R _instDL_t = MST_ACXFR_INST_D_R.create("T");
		protected MCQueryApiBuilder _instDL_bldr = MCQueryApiBuilder.create(_instDL_t);
		protected MCList<MST_ACXFR_SCHD_R> _schdL = MCList.create(MST_ACXFR_SCHD_R.class);
		protected MST_ACXFR_SCHD_R _schdL_t = MST_ACXFR_SCHD_R.create("T");
		protected MCQueryApiBuilder _schdL_bldr = MCQueryApiBuilder.create(_schdL_t);
		protected MCIndexKey _schdIdxKey = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			//実績計上済で編集していない明細は対象外（表示順だけを更新するため）
			MCList<Chk01_DtlR> dtlL = up1().subList(r -> !isNull(r.data_crud_typ()));

			initCache(dtlL);
			editUp(up0(), dtlL);

			//チェック
			checkValues(up0(), dtlL);

			if (hasErr()) {
				return;
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

			msgL.addAll(lockInst());
			msgL.addAll(lockSchdL());

			return msgL;
		}

		protected MCMessageList lockSchdL() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			MCList<Chk01_DtlR> bindL = up1().subList(r -> !isNull(r.acxfr_schd_no()));
			if (bindL.isEmpty()) return msgL;

			_schdL_bldr.setOrderByAsc(_schdL_t.acxfr_schd_no);
			dbSelectKeyForUpdateNoWait("MSBEL2410_MST_ACXFR_SCHD_S02", _schdL, _schdL_bldr, bindL.groupBy(MST_ACXFR_SCHD_R.$acxfr_schd_no));
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
				// 指図ヘッダの検索
				dbSelectKeyForUpdateNoWait("MSBEL2410_MST_ACXFR_INST_S01", _instR, _instR_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$inst_upd_cntr, _instR));

				if (hasErr()) {
					return msgL;
				}

				// 指図明細の検索
				_instDL_bldr.setWhere(_instDL_t.acxfr_inst_no.eq(bind("acxfr_inst_no")), up0());
				dbSelectForUpdate("MSBEL2410_MST_ACXFR_INST_D_S01", _instDL, _instDL_bldr);
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
				up0().acxfr_inst_no(_instR.acxfr_inst_no());
			}

			MCIndexKey idxkeyInstD = _instDL
					.createIndex(MST_ACXFR_INST_D_R.$acxfr_inst_d_no);

			for (Chk01_DtlR dtlR : up1()) {
				if (dtlR.isStatusCreate()) {
					if (isNull(dtlR.fix_no_typ())) {
						dtlR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					}
				}

				MST_ACXFR_INST_D_R instDR = _instDL.getFirst(idxkeyInstD,
						dtlR.acxfr_inst_d_no());
				if (!isNull(dtlR.acxfr_schd_no())) {
					MST_ACXFR_SCHD_R schdR = _schdL.getFirst(_schdIdxKey, dtlR.acxfr_schd_no());
					if (!isNull(schdR)) {
						dtlR.schd_base_unit_qty(schdR.base_unit_qty());
					}
				}

				if (!isNull(instDR)) {
					dtlR.acxfr_inst_d_no(instDR.acxfr_inst_d_no());
					dtlR.acxfr_schd_no(instDR.acxfr_schd_no());
					dtlR.dspsl_no(instDR.dspsl_no());
					dtlR.aprv_flg(instDR.aprv_flg());
					dtlR.aprv_no(instDR.aprv_no());
					dtlR.acxfr_inst_no(instDR.acxfr_inst_no());
					dtlR.disp_seq(instDR.disp_seq());
//					dtlR.fix_no(instDR.fix_no());
//					dtlR.fix_no_typ(instDR.fix_no_typ());
				}
				else {
					dtlR.acxfr_inst_no(up0().acxfr_inst_no());
				}
			}
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd, up0());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			ListLogicBind strLnBind = getListLogicBind(up1(), Chk01_DtlR.$str_ln_cd);
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			ListLogicBind actDptBind = getListLogicBind(up0(), Chk01_HdrR.$inst_dpt_cd);
			ListLogicBind grRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);
			ListLogicBind giRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);
			ListLogicBind dispRsnBind = getListLogicBind(up1(), Chk01_DtlR.$rsn_cd);

			strLnBind.putBind(StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			bdDptBind.putBind(DptCols.$i_dt, up0(), Chk01_HdrR.$acxfr_inst_dt);
			actDptBind.putBind(DptCols.$i_dt, Chk01_HdrR.$acxfr_inst_dt);
			grRsnBind.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, up0(),
					Chk01_HdrR.$acxfr_gr_flg);
			giRsnBind.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, up0(),
					Chk01_HdrR.$acxfr_gi_flg);
			dispRsnBind.putBind(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, up0(),
					Chk01_HdrR.$disp_flg);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (!msgL.isEmpty() || hasErrFlgOn(up0(), up1())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up1());

			if (!up0().err_flg()) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk01_HdrR.$loc_cd));
				msgL.addAll(checkStkIdTyp(up0(), notErrL));
				msgL.addAll(checkFixNoTyp(up0(), notErrL));
				msgL.addAll(checkAtLeastOneDtl(up0(), notErrL));
			}

			msgL.addAll(checkDecPlace(notErrL, Chk01_DtlR.$trd_unit_dec_place,
					Chk01_DtlR.$trd_unit_qty));
			
			msgL.addAll(callLotServiceChkBdItm(notErrL));

			return msgL;
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up0().hdr_dtl_peg(MCNumber.ONE);

			for (Chk01_DtlR dtlR : up1()) {
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (dtlR.isStatusModify()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (!MSC_PR_STS_TYP.isPART_COMP(dtlR.pr_sts_typ())
						&& !MSC_PR_STS_TYP.isCOMP(dtlR.pr_sts_typ())) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					dtlR.data_crud_typ(null);
				}

				dtlR.hdr_dtl_peg(up0().hdr_dtl_peg());
				dtlR.trd_ptn_typ(up0().trd_ptn_typ());
				dtlR.loc_cd(up0().loc_cd());
				dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				//dtlR.fix_no("1");
				setIoSchdPrNo(dtlR);
				setBaseUnitQty(dtlR);
				setPackUnitQtyForInsUpd(dtlR);
				setStkAmt(up0(), dtlR);
				setStrLn(dtlR);
				setLot(dtlR);
			}

			setDispSeq(up1());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	private void initCache(MCList<Chk01_DtlR> dtlL) {
		initTrdCache();
		initItmCache(dtlL);
		initItmUnitCache(dtlL);
	}

	protected void customListLogicCndSub(String column, MCNumber paramIndex,
			MCConstRow data, Map<String, Comparable<?>> cnd, Chk01_HdrR hdrR) {
		if (isSame(paramIndex, MCNumber.ONE) && isSame(column, Chk01_DtlR.$rsn_cd)) {
			cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, false);
			cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, false);
			cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, false);

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, true);
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
				cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, true);
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
				cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, true);
			}
			else {
				cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg, false);
				cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg, false);
				cnd.put(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg, false);
			}
		}
		else if (isSame(paramIndex, MCNumber.ONE)
				&& isSame(column, Chk01_DtlR.$stk_bp_cd)) {
			String stkIdTyp = data.getStringNE(Chk01_DtlR.$stk_id_typ);
			if (isNull(stkIdTyp)) {
				cnd.put(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.COMM.value());
			}
			else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stkIdTyp)
					|| MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
				cnd.put(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.CST.value());
			}
			else if (MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)
					|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stkIdTyp)
					|| MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp)
					|| MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)
					|| MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {
				cnd.put(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.SPPL.value());
			}
			else {
				cnd.put(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.COMM.value());
			}
		}
		else if (isSame(paramIndex, MCNumber.ONE)
				&& isSame(column, Chk01_DtlR.$stk_arrv_bp_cd)) {
			// 自社場所
			if (isNull(hdrR.sppl_cd())) {
				cnd.put(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.DLV.value());
			}
			// 外注場所
			else {
				cnd.put(BpCols.$i_bp_is_srch_typ,
						MAC_BP_IS_SRCH_TYP.SPPL.value());
			}
		}
	}

	protected void editUp(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		for (Chk01_DtlR upR : dtlL) {
			if (!MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
				MAM_ITM_R itmCacheR = getItmCache().getEx(upR.itm_cd(), upR.itm_sub1(),
						upR.itm_sub2(), upR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(upR.itm_cd(),
						upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(),
						upR.trd_unit_cd());
				MAM_TRD_R trdCacheR = getTrdCache().getEx(hdrR.trd_cd());

				// マスタからの補完
				upR.trd_ptn_typ(trdCacheR.trd_ptn_typ());
				upR.base_unit_cd(itmCacheR.unit_cd());
				upR.sundry_itm_flg(itmCacheR.sundry_itm_flg());

				upR.not_lot_mix_flg(false);
				upR.not_sublot_mix_flg(false);
				upR.vld_dt_fr(null);

				// 計算によって求める項目
				upR.base_unit_qty(convToBaseUnit(upR.trd_unit_qty(),
						itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
						itmCacheR.dec_place(), itmCacheR.rnd_typ()));

				// 固定値での補完
				upR.io_schd_typ(getIoSchdTypForAcXfr(upR.trd_ptn_typ()));
				upR.stk_alloc_flg(false);
			}
		}
	}

	protected void checkValues(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<SundryItm_Chk01_DtlR> siL = MCList.create(SundryItm_Chk01_DtlR.class);

		for (Chk01_DtlR r : dtlL) {
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				if (!chkStkPtn(r)) {
					msgL.add(new MCMessage(r, null, MSBEL0309, toDispGUIIndex(r)));
					r.err_flg(true);
				}

				// 諸口品の場合、品名が諸口品マスタと矛盾しないこと（削除以外）
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.sundry_itm_flg()) {
					SundryItm_Chk01_DtlR siR = SundryItm_Chk01_DtlR.create();
					copy(siR, r, createMap_SundryItm_Chk01_DtlR_Chk01_DtlR());
					siL.add(siR);
				}
			}
			
			// 承認済みの他勘定予定に対しては数量増加はできない
			if (MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())) {
				if (r.base_unit_qty().gt(r.schd_base_unit_qty())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$trd_unit_qty, MSBEL0310, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		// 諸口品チェック
		if (!siL.isEmpty()) {
			MABCL_SundryItmRegService.SundryItm_Chk01 o = MABCL_SundryItmRegService.crtSundryItm_Chk01();
			o.up0().setAll(siL);
			o.exec();
			copyErrFlg(dtlL, o.down0());
		}
		
		//引当可能数チェック
		checkAlloc(hdrR, dtlL);

		// ロットチェック
		callLotChk03(dtlL);

		MCMessagePool.addAll(msgL);
	}

	/**
	 * 引当可能数チェック
	 * @param dtlL
	 */
	protected void checkAlloc(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
			MCList<Chk01_DtlR> subL = dtlL.subList(r -> r.alloc_flg() && !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (!subL.isEmpty()) {
				callAllocMngServiceLockUpd01(hdrR, subL);
				MCList<Srch_RsltR> allocRsltL = callAllocMngServiceAllocSrch01(hdrR, subL, dtlL);
				doCheckAlloc(allocRsltL, subL);
			}
		}
	}

	protected MCMessageList checkStkIdTyp(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		for (Chk01_DtlR dtlR : dtlL) {
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				if (!MSC_STK_ID_TYP.is_inst_gr(dtlR.stk_id_typ())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL0083, toDispGUIIndex(dtlR)));
				}
				if (MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
					if (!isNull(hdrR.sppl_cd())) {
						msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL1203, hdrR.loc_cd(), toDispGUIIndex(dtlR)));
					}
				}
				if (MSC_STK_ID_TYP.isONR_PROV(dtlR.stk_id_typ())) {
					if (isNull(hdrR.sppl_cd())) {
						msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL1205, hdrR.loc_cd(), toDispGUIIndex(dtlR)));
					}
				}
			}

			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
				if (!MSC_STK_ID_TYP.is_inst_gi(dtlR.stk_id_typ())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$stk_id_typ, MSBEL0082, toDispGUIIndex(dtlR)));
				}
			}

			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
				if (!MSC_STK_ID_TYP.is_inst_scrp(dtlR.stk_id_typ())) {
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
	 * 承認状況をチェックする。
	 * @param dtlL
	 */
	protected MCMessageList checkAprvSts(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		for (Chk01_DtlR dtlR : dtlL) {
			if (isNull(dtlR.acxfr_schd_no())) {
				continue;
			}

			if (!MAC_APRV_STS_TYP.isACPT(dtlR.aprv_sts_typ())) {
				msgL.add(new MCMessage(dtlR, Chk01_DtlR.$acxfr_schd_no, MSBEL0058,
						dtlR.acxfr_schd_no()));
			}
		}

		return msgL;
	}

	protected void setIoSchdPrNo(Chk01_DtlR dtlR) {
		if (!isNull(dtlR.io_schd_pr_no())) {
			return;
		}

		if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(dtlR.trd_ptn_typ())) {
			String no = getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR);

			dtlR.io_schd_pr_no(no);
		}
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

	protected void setPackUnitQtyForInsUpd(Chk01_DtlR dtlR) {
		MAVM_ITM_UNIT_R conv = MAVM_ITM_UNIT_R.create();

		dbSelectKey("MSBEL2410_MAVM_ITM_UNIT_S01", conv, MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
				dtlR.itm_cd(), dtlR.itm_sub1(),
				dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.pack_unit_cd());

		if (isSame(dtlR.base_unit_cd(), dtlR.pack_unit_cd())) {
			dtlR.pack_unit_qty(dtlR.base_unit_qty());
		}
		else {
			dtlR.pack_unit_qty(
					rvrsBaseUnitConv(dtlR.base_unit_qty(), conv.conv_base_qty(),
							conv.conv_qty(), conv.dec_place(), conv.rnd_typ()));
		}
	}

	protected void setStkAmt(Chk01_HdrR hdrR, Chk01_DtlR dtlR) {
		dtlR.stk_amt(MAUCL_AmtUtil.getAmt(
				MAUCL_StdUpriUtil.getStdCost(dtlR.itm_cd(), dtlR.itm_sub1(),
						dtlR.itm_sub2(), dtlR.itm_sub3(), hdrR.acxfr_inst_dt(),
						hdrR.wg_cd(), getCo().stk_std_upri_typ()),
				dtlR.base_unit_qty(), getBaseCur().amt_dec_place(),
				getCo().stk_amt_rnd_typ()));
	}

	protected void setStrLn(Chk01_DtlR dtlR) {
		if (!isNull(dtlR.loc_cd()) && isNull(dtlR.str_ln_cd())) {
			dtlR.str_ln_cd(MAC_STR.NULL_VAL.value());
		}
	}

	protected void setLot(Chk01_DtlR dtlR) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())) {
			dtlR.lot_no(MAC_STR.NULL_VAL.value());
		}
		else if (isSame(dtlR.lot_no(), MAC_STR.NULL_VAL.value())) {
			dtlR.lot_no(null);
		}

		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtlR.sublot_mng_typ())) {
			dtlR.sublot_no(MAC_STR.NULL_VAL.value());
		}
		else if (isSame(dtlR.sublot_no(), MAC_STR.NULL_VAL.value())) {
			dtlR.sublot_no(null);
		}
	}

	protected void callAllocMngServiceLockUpd01(Chk01_HdrR h, MCList<Chk01_DtlR> dtlL) {

		MSBEL_AllocMngService.Alloc_Lock_Upd01 ope = MSBEL_AllocMngService
				.crtAlloc_Lock_Upd01();

		for (Chk01_DtlR r : dtlL) {
			MSW_ALLOC_LOC_MAP_R opeUp0R = MSW_ALLOC_LOC_MAP_R.create();
			copy(opeUp0R, r, createMap_MSW_ALLOC_LOC_MAP_R_Chk01_DtlR());
			opeUp0R.gi_loc_cd(h.loc_cd());
			opeUp0R.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());

			ope.up0().add(opeUp0R);
		}

		ope.exec();
	}

	protected Map_MSW_ALLOC_LOC_MAP_R_Chk01_DtlR<MSW_ALLOC_LOC_MAP_R, Chk01_DtlR> createMap_MSW_ALLOC_LOC_MAP_R_Chk01_DtlR() {
		return new Map_MSW_ALLOC_LOC_MAP_R_Chk01_DtlR<MSW_ALLOC_LOC_MAP_R, Chk01_DtlR>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_Chk01_DtlR<D extends MSW_ALLOC_LOC_MAP_R, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, Chk01_DtlR.$itm_sub3);

		}
	}

	protected MCList<Srch_RsltR> callAllocMngServiceAllocSrch01(Chk01_HdrR h,
			MCList<Chk01_DtlR> dtlL, MCList<Chk01_DtlR> hasUnAllocDelDtlL) {

		MSBEL_AllocMngService.Alloc_Srch01 op = MSBEL_AllocMngService.crtAlloc_Srch01();
		op.up0().stk_flg(false);
		op.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
		op.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
		op.up0().except_alloc_wait_flg(false);
		op.up0().nm_srch_flg(true);

		addAll(op.up1(), dtlL, createMap_Srch_TgtR_Chk01_DtlR());
		addAll(op.up3(), hasUnAllocDelDtlL, createMap_Srch_Io_SchdR_Chk01_DtlR());
		op.up1().setValue(Srch_TgtR.$gi_loc_cd, h.loc_cd());
		
		MCSortPolicy sp = new MCSortPolicy();
		// 出庫日が直近のものに対して優先して引当するために、日付でソートする
		sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
		op.up1().sort(sp);

		op.exec();
		MCGroupByPolicy policy = new MCGroupByPolicy(Srch_RsltR.$peg_no,
				Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2,
				Srch_RsltR.$itm_sub3, Srch_RsltR.$ver_no, Srch_RsltR.$stk_loc_cd,
				Srch_RsltR.$stk_loc_nm, Srch_RsltR.$stk_str_ln_cd,
				Srch_RsltR.$stk_str_ln_nm, Srch_RsltR.$stk_sppl_cd,
				Srch_RsltR.$stk_lg_grp_cd, Srch_RsltR.$asst_typ, Srch_RsltR.$in_xfr_typ,
				Srch_RsltR.$quality_typ, Srch_RsltR.$stk_insp_typ, Srch_RsltR.$stk_id_typ,
				Srch_RsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_nm, Srch_RsltR.$gd_cd,
				Srch_RsltR.$gd_nm, Srch_RsltR.$lot_no, Srch_RsltR.$sublot_no,
				Srch_RsltR.$sno1, Srch_RsltR.$sno2, Srch_RsltR.$sno3, Srch_RsltR.$sno4,
				Srch_RsltR.$base_unit_cd, Srch_RsltR.$base_unit_nm,
				Srch_RsltR.$base_unit_dec_place, Srch_RsltR.$vld_dt_fr,
				Srch_RsltR.$vld_dt_to, Srch_RsltR.$pack_unit_cd);
		policy.sum(Srch_RsltR.$base_unit_qty, Srch_RsltR.$pack_unit_qty);

		return op.down0().groupBy(policy);
	}

	protected void doCheckAlloc(MCList<Srch_RsltR> allocRsltL, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

		for (Chk01_DtlR r : dtlL) {

			rsltL.init();
			if (!allocRsltL.isEmpty()) {
				rsltL = allocRsltL.subList(Srch_RsltR.$peg_no, r.peg_no());
			}
			if (rsltL.isEmpty()) {
				msgL.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
				r.err_flg(true);
			}
			else {
				// 残数
				MCNumber remain_qty = r.base_unit_qty()
						.subtract(rsltL.sum(Srch_RsltR.$base_unit_qty));
				if (remain_qty.isPositive()) {
					msgL.add(new MCMessage(r, null, MSBEL0229, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}

		if (!msgL.isEmpty()) {
			MCMessagePool.addAll(msgL);
		}
	}

	protected Map_Srch_TgtR_Chk01_DtlR<Srch_TgtR, Chk01_DtlR> createMap_Srch_TgtR_Chk01_DtlR() {
		return new Map_Srch_TgtR_Chk01_DtlR<Srch_TgtR, Chk01_DtlR>();
	}

	public class Map_Srch_TgtR_Chk01_DtlR<D extends Srch_TgtR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			MAM_ITM_R itmCacheR = getItmCache().getEx(src.itm_cd(), src.itm_sub1(),
					src.itm_sub2(), src.itm_sub3());
			MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(src.itm_cd(),
					src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());

			// 荷姿対象かつ取引単位が荷姿単位なら取引単位を荷姿単位とする
			// 取引単位が荷姿単位でない場合は基準単位での提案とする(何もいれない)
			if (itmCacheR.pack_alloc_flg() && itmUnitR.pack_flg()) {
				dest.pack_alloc_flg(true);
				dest.pack_unit_cd(src.trd_unit_cd());
				dest.pack_unit_qty(src.trd_unit_qty());
			}

		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Srch_TgtR.$gi_schd_dt, Chk01_DtlR.$acxfr_schd_dt);
			addColumnPathMap(Srch_TgtR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Srch_TgtR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Srch_TgtR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Srch_TgtR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, Chk01_DtlR.$no_lot_fix_flg);
			addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg,
					Chk01_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr, Chk01_DtlR.$vld_dt_fr);
			addColumnPathMap(Srch_TgtR.$io_schd_typ, Chk01_DtlR.$io_schd_typ);
			addColumnPathMap(Srch_TgtR.$stk_alloc_flg, Chk01_DtlR.$stk_alloc_flg);
		}
	}

	protected Map_Srch_Io_SchdR_Chk01_DtlR<Srch_Io_SchdR, Chk01_DtlR> createMap_Srch_Io_SchdR_Chk01_DtlR() {
		return new Map_Srch_Io_SchdR_Chk01_DtlR<Srch_Io_SchdR, Chk01_DtlR>();
	}

	public class Map_Srch_Io_SchdR_Chk01_DtlR<D extends Srch_Io_SchdR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_Io_SchdR.$io_schd_no, Chk01_DtlR.$acxfr_inst_d_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(getIoSchdTypForAcXfr(src.trd_ptn_typ()));
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
		}
	}

	protected void callLotChk03(MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR> chkL = dtlL.subList(r -> isChkLotR(r));
		if (chkL.isEmpty()) return;

		MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
		setAll(o.up0(), chkL, createMap_Lot_Chk03_CndR_Chk01_DtlR());
		o.exec();
		copyErrFlg(chkL, o.down0());
	}

	protected boolean isChkLotR(Chk01_DtlR chkR) {
		if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
			return false;
		}
		if (isNullOrNullVal(chkR.lot_no())) {
			return false;
		}
		return true;
	}

	protected Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR, Chk01_DtlR>();
	}
	public class Map_Lot_Chk03_CndR_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_DtlR.$ver_no);
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 他勘定振替指図を取消する前に、チェックを実行します。<br>
	 */
	public class Chk03 extends MSBEL_AcXfrInstReg_MC_A.Chk03 {

		protected MST_ACXFR_INST_R _instR = MST_ACXFR_INST_R.create();
		protected MST_ACXFR_INST_R _instR_t = MST_ACXFR_INST_R.create("T");
		protected MCQueryApiBuilder _instR_bldr = MCQueryApiBuilder.create(_instR_t);

		protected MCList<MST_ACXFR_INST_D_R> _instDL = MCList.create(MST_ACXFR_INST_D_R.class);
		protected MST_ACXFR_INST_D_R _instDL_t = MST_ACXFR_INST_D_R.create("T");
		protected MCQueryApiBuilder _instDL_bldr = MCQueryApiBuilder.create(_instDL_t);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (hasErr()) {
				return;
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

			msgL.addAll(lockInst());
			msgL.addAll(lockSchdL());

			return msgL;
		}

		protected MCMessageList lockSchdL() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;

			MCList<MST_ACXFR_INST_D_R> bindL = _instDL.subList(r -> !isNull(r.acxfr_schd_no()));
			if (bindL.isEmpty()) return msgL;

			MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
			dbSelectKeyForUpdate("MSBEL2410_MST_ACXFR_SCHD_S03", schdL,
					MCQueryApiBuilder.create(MST_ACXFR_SCHD_R.create("T")),
					bindL.groupBy(MST_ACXFR_SCHD_R.$acxfr_schd_no));

			return msgL;
		}

		protected MCMessageList lockInst() {
			MCMessageList msgL = new MCMessageList();
			if (hasErr()) return msgL;
			
			if (!isNull(up0().acxfr_inst_no())) {
				// 指図ヘッダの検索
				dbSelectKeyForUpdateNoWait("MSBEL2410_MST_ACXFR_INST_S02", _instR, _instR_bldr, up0());
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$inst_upd_cntr, _instR));

				if (hasErr()) {
					return msgL;
				}

				// 指図明細の検索
				_instDL_bldr.setWhere(_instDL_t.acxfr_inst_no.eq(bind("acxfr_inst_no")), up0());
				dbSelectForUpdate("MSBEL2410_MST_ACXFR_INST_D_S02", _instDL, _instDL_bldr);
			}
			return msgL;
		}

		protected void compBase() {
			// トランザクションデータからの補完
			up0().trd_ptn_typ(_instR.trd_ptn_typ());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (!msgL.isEmpty() || hasErrFlgOn(up0())) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();

			if (!up0().err_flg()) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk03_HdrR.$loc_cd));
				msgL.addAll(checkPrStatusTyp(_instDL));
			}

			return msgL;
		}

		protected MCMessageList checkPrStatusTyp(
				MCList<MST_ACXFR_INST_D_R> instDL) {
			MCMessageList msgL = new MCMessageList();

			for (MST_ACXFR_INST_D_R r : instDL) {
				if (MSC_PR_STS_TYP.isPART_COMP(r.pr_sts_typ())
						|| MSC_PR_STS_TYP.isCOMP(r.pr_sts_typ())) {
					msgL.add(new MCMessage(MSBEL0230));

					break;
				}
			}

			return msgL;
		}

		protected void compSub() {
			// リストロジックチェックで補完しきれない項目を補完する
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			down0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			up0().hdr_dtl_peg(MCNumber.ONE);
		}

		protected void setDown() {
			copyall(down0(), up0());
			addAll(down1(), _instDL, createMap_Chk03_DtlR_MST_ACXFR_INST_D_R());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 他勘定振替指図を新規登録する。<br>
	 */
	public class Ins01 extends MSBEL_AcXfrInstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理を呼び出し、throwUpdErrを利用して、エラーがあれば中断する。
			callThisChk01();
			throwUpdErr();
			execIns();
			setDown();
		}

		protected void callThisChk01() {
			MSBEL_AcXfrInstReg.Chk01 ope = MSBEL_AcXfrInstReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected void execIns() {
			prepare(up1());
			execOpe();
		}

		protected void execOpe() {
			clearList();
			beforeIns();
			insert();
			afterIns();
		}

		protected void insert() {
			insInstHdr();
			insInstDtl();
		}

		protected void insInstHdr() {
			MST_ACXFR_INST_R instR = MST_ACXFR_INST_R.create();

			setInstNo(up0());
			copy(instR, up0(), createMap_MST_ACXFR_INST_R_Chk01_HdrR());
			dbInsertEx("MSBEL2410_MST_ACXFR_INST_I01", instR,
					MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T")));
		}

		protected void insInstDtl() {
			for (Chk01_DtlR dtlR : up1()) {
				dtlCreate(dtlR);
			}
			dbInsertEx("MSBEL2410_MST_ACXFR_INST_D_I01", _createInstDL, _createInstDL_bldr);
			dbInsertEx("MSBEL2410_MST_ACXFR_SCHD_I01", _createSchdL, _createSchdL_bldr);
		}

		protected void beforeIns() {
			execIoSchdDel01Service(up0(), up1());
		}

		protected void afterIns() {
			updSchd(up1());
			schdIntegration(up1());
			execIoSchdIns01Service(up0(), up1());
			execIoSchdIns01ServiceForSchd(up1());
			setSundryItm(up1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録済みの他勘定振替指図を更新する。<br>
	 */
	public class Upd01 extends MSBEL_AcXfrInstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理を呼び出し、throwUpdErrを利用して、エラーがあれば中断する。
			callThisChk02();
			throwUpdErr();
			execInsUpdDel();
			setDown();
		}

		protected void callThisChk02() {
			MSBEL_AcXfrInstReg.Chk02 ope = MSBEL_AcXfrInstReg.crtChk02();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void setDown() {
			down0().setAll(up1());
		}

		protected void execInsUpdDel() {
			prepare(up1());
			execOpe();
		}

		protected void execOpe() {
			//実績計上済で編集していない明細は対象外（表示順だけを更新するため）
			MCList<Chk01_DtlR> dtlL = up1().subList(r -> !isNull(r.data_crud_typ()));

			clearList();
			beforeInsUpdDel(dtlL);
			insUpdDel();
			afterInsUpdDel(dtlL);
		}

		protected void insUpdDel() {
			if (up0().isStatusModify()) {
				updInstHdr(up0());
			}
			else {
				updInstHdrTs(up0());
			}

			updInstDtl();
		}

		protected void updInstHdr(Chk01_HdrR hdrR) {
			MST_ACXFR_INST_R inst = MST_ACXFR_INST_R.create();

			copy(inst, hdrR, createMap_MST_ACXFR_INST_R_Chk01_HdrR());
			dbUpdateKey("MSBEL2410_MST_ACXFR_INST_U01", inst,
					MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T")));
		}

		protected void updInstHdrTs(Chk01_HdrR hdrR) {
			MST_ACXFR_INST_R inst = MST_ACXFR_INST_R.create();

			inst.acxfr_inst_no(hdrR.acxfr_inst_no());
			dbTsUpdateKey("MSBEL2410_MST_ACXFR_INST_U02", inst,
					MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T")).getBaseDbc());
		}

		protected void updInstDtl() {
			for (Chk01_DtlR dtlR : up1()) {
				//実績計上済で編集していない明細は表示順だけを更新する
				if (isNull(dtlR.data_crud_typ())) {
					dtlModifyDispSeq(dtlR);
				}
				// 新規
				else if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					dtlCreate(dtlR);
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					dtlModify(dtlR);
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					dtlDelete(dtlR);
				}
			}

			dbInsertEx("MSBEL2410_MST_ACXFR_INST_D_I02", _createInstDL, _createInstDL_bldr);
			dbUpdateKey("MSBEL2410_MST_ACXFR_INST_D_U01", _modifyInstDL, _modifyInstDL_bldr);
			dbUpdateKey("MSBEL2410_MST_ACXFR_INST_D_U02", _modifyInstDWithActL, _modifyInstDWithActL_bldr);
			dbDeleteKey("MSBEL2410_MST_ACXFR_INST_D_D01", _deleteInstDL, _deleteInstDL_bldr);
		}

		/**
		 * 実績を計上した明細は、表示順だけを更新
		 * @param dtlR
		 */
		protected void dtlModifyDispSeq(Chk01_DtlR dtlR) {
			MST_ACXFR_INST_D_R instR = MST_ACXFR_INST_D_R.create();

			instR.acxfr_inst_d_no(dtlR.acxfr_inst_d_no());
			instR.disp_seq(dtlR.disp_seq());
			_modifyInstDWithActL.add(instR);
		}

		protected void beforeInsUpdDel(MCList<Chk01_DtlR> dtlL) {
			execIoSchdDel01Service(up0(), dtlL);
			getActDtl(dtlL);
		}

		protected void afterInsUpdDel(MCList<Chk01_DtlR> dtlL) {
			updSchd(up1());
			schdIntegration(up1());
			execIoSchdIns01Service(up0(), dtlL);
			execIoSchdIns01ServiceForSchd(dtlL);
			setSundryItm(up1());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 登録済みの他勘定振替指図を削除する。<br>
	 */
	public class Del01 extends MSBEL_AcXfrInstReg_MC_A.Del01 {

		protected MCList<Chk03_DtlR> _dtlL = MCList.create(Chk03_DtlR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理を呼び出し、throwUpdErrを利用して、エラーがあれば中断する。
			callThisChk03();
			throwUpdErr();
			execDelete();
			setDown();
		}

		protected void callThisChk03() {
			MSBEL_AcXfrInstReg.Chk03 ope = MSBEL_AcXfrInstReg.crtChk03();

			copyall(ope.up0(), up0());
			ope.exec();
			copyall(up0(), ope.down0());
			_dtlL.addAll(ope.down1());
		}

		protected void setDown() {

		}

		protected void execDelete() {
			prepare();
			execOpe();
		}

		protected void execOpe() {
			clearList();
			beforeDelete();
			delete();
			afterDelete();
		}

		protected void delete() {
			deleteInstHdr(up0());
			deleteInstDtl();
		}

		protected void deleteInstHdr(Chk03_HdrR hdrR) {
			MST_ACXFR_INST_R inst = MST_ACXFR_INST_R.create();

			inst.acxfr_inst_no(hdrR.acxfr_inst_no());
			dbDeleteKey("MSBEL2410_MST_ACXFR_INST_D01", inst,
					MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T")));
		}

		protected void deleteInstDtl() {
			for (Chk03_DtlR dtlR : _dtlL) {
				dtlDelete(dtlR);
			}
			dbDeleteKey("MSBEL2410_MST_ACXFR_INST_D_D02", _deleteInstDL, _deleteInstDL_bldr);
		}

		protected void beforeDelete() {
			execIoSchdDel01Service(up0(), _dtlL);
		}

		protected void afterDelete() {
			updSchd();
			schdIntegration(_dtlL);
			//他勘定振替予定に紐づく受払予定を作成する
			execIoSchdIns01ServiceForSchd(_dtlL);
		}

		protected void updSchd() {
			MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
			for (Chk03_DtlR dtlR : _dtlL) {
				MST_ACXFR_SCHD_R schd = MST_ACXFR_SCHD_R.create();
				schd.acxfr_schd_no(dtlR.acxfr_schd_no());
				schd.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
				schdL.add(schd);
			}
			MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSet(t.pr_sts_typ);
			dbUpdateKey("MSBEL2410_MST_ACXFR_SCHD_U01", schdL, schdL_bldr);
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * ロット提案を行う。<br>
	 */
	public class Sprt01 extends MSBEL_AcXfrInstReg_MC_A.Sprt01 {
		protected MCList<Srch_RsltR> _allocRsltL = MCList.create(Srch_RsltR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			initCache();
			editUp();

			if (!doChk()) {
				return;
			}

			callIoSchdServiceIns01(up1().subList(r -> isIoSchdServiceIns01R(r)));
			callAllocMngServiceAllocSrch01(up1().subList(Sprt01_DtlR.$check, true), up1().subList(r -> r.check() || r.isStatusDelete()));
			dbTran().rollback();

			setDown();
		}

		private boolean isIoSchdServiceIns01R(Sprt01_DtlR r) {
			return !r.check() && r.alloc_flg()
					&& (r.isStatusCreate() || r.isStatusModify()) && !isNull(r.itm_cd())
					&& !isNull(r.itm_sub1()) && !isNull(r.itm_sub2())
					&& !isNull(r.itm_sub3()) && !isNull(r.trd_unit_cd())
					&& !isNull(r.trd_unit_qty()) && !isNull(r.base_unit_cd())
					&& !isNull(r.base_unit_qty());
		}

		private void initCache() {
			initTrdCache();
			initItmCache(up1());
			initItmUnitCache(up1());
		}

		protected void editUp() {
			for (Sprt01_DtlR upR : up1().subList(r -> isIoSchdServiceUp1R(r))) {
				MAM_ITM_R itmCacheR = getItmCache().getEx(upR.itm_cd(), upR.itm_sub1(),
						upR.itm_sub2(), upR.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(upR.itm_cd(),
						upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(),
						upR.trd_unit_cd());
				MAM_TRD_R trdCacheR = getTrdCache().getEx(up0().trd_cd());

				// マスタからの補完
				upR.trd_ptn_typ(trdCacheR.trd_ptn_typ());
				upR.base_unit_cd(itmCacheR.unit_cd());

				upR.loc_cd(up0().loc_cd());
				if (upR.str_ln_cd_none_flg()) {
					upR.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				upR.not_lot_mix_flg(false);
				upR.not_sublot_mix_flg(false);
				upR.vld_dt_fr(null);

				// 計算によって求める項目
				upR.base_unit_qty(convToBaseUnit(upR.trd_unit_qty(),
						itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
						itmCacheR.dec_place(), itmCacheR.rnd_typ()));

				// 固定値での補完
				upR.io_schd_typ(getIoSchdTypForAcXfr(upR.trd_ptn_typ()));
				upR.stk_alloc_flg(false);

				// Nullのとき補完する固定値
				if (isNull(upR.gd_cd())) {
					upR.gd_cd(getDefaultFeedStkGd().gd_cd());
				}
				if (isNull(upR.quality_typ())) {
					upR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				if (isNull(upR.stk_id_typ())) {
					upR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
			}
		}

		private boolean isIoSchdServiceUp1R(Sprt01_DtlR r) {
			return (r.isStatusCreate() || r.isStatusModify() || r.isStatusDelete()) && !isNull(r.itm_cd())
					&& !isNull(r.itm_sub1()) && !isNull(r.itm_sub2())
					&& !isNull(r.itm_sub3()) && !isNull(r.trd_unit_cd())
					&& !isNull(r.trd_unit_qty());
		}

		/**
		 * チェック処理
		 */
		protected boolean doChk() {
			MCList<Sprt01_DtlR> tmpUp1L = up1().subList(Sprt01_DtlR.$check, true);
			List<IfValidater> valL = new ArrayList<IfValidater>();
			valL.add(new FXUCL_RequiredValidater());
			MCMessagePool.addAll(check(up0(), Sprt01_HdrR.$loc_cd, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$itm_cd, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$itm_sub1, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$itm_sub2, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$itm_sub3, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$trd_unit_cd, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$trd_unit_qty, valL));
			MCMessagePool.addAll(check(tmpUp1L, Sprt01_DtlR.$acxfr_schd_dt, valL));
			return MCMessagePool.size() == 0;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(setAllocRsltL(up1()));
		}

		protected void callAllocMngServiceAllocSrch01(MCList<Sprt01_DtlR> dtlL, MCList<Sprt01_DtlR> hasDelDtlL) {
			if (dtlL.isEmpty()) {
				return;
			}

			MSBEL_AllocMngService.Alloc_Srch01 op = MSBEL_AllocMngService
					.crtAlloc_Srch01();
			op.up0().stk_flg(false);
			op.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			op.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			op.up0().except_alloc_wait_flg(false);
			op.up0().nm_srch_flg(true);

			MCSortPolicy sp = new MCSortPolicy();
			// 引当済のものから先に引当処理を行うことで引当処理の度に未引当が分割されるのを防ぐ
			sp.add(SortType.DESC, Sprt01_DtlR.$alloc_flg);
			// 他勘定振替予定日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Sprt01_DtlR.$acxfr_schd_dt);
			dtlL.sort(sp);
			addAll(op.up1(), dtlL, createMap_Srch_TgtR_Sprt01_DtlR());
			addAll(op.up3(), hasDelDtlL, createMap_Srch_Io_SchdR_Sprt01_DtlR());

			op.exec();
			MCGroupByPolicy policy = new MCGroupByPolicy(Srch_RsltR.$peg_no,
					Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2,
					Srch_RsltR.$itm_sub3, Srch_RsltR.$ver_no, Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_loc_nm, Srch_RsltR.$stk_str_ln_cd,
					Srch_RsltR.$stk_str_ln_nm, Srch_RsltR.$stk_sppl_cd,
					Srch_RsltR.$stk_lg_grp_cd, Srch_RsltR.$asst_typ,
					Srch_RsltR.$in_xfr_typ, Srch_RsltR.$quality_typ,
					Srch_RsltR.$stk_insp_typ, Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_nm, Srch_RsltR.$gd_cd,
					Srch_RsltR.$gd_nm, Srch_RsltR.$lot_no, Srch_RsltR.$sublot_no,
					Srch_RsltR.$sno1, Srch_RsltR.$sno2, Srch_RsltR.$sno3,
					Srch_RsltR.$sno4, Srch_RsltR.$base_unit_cd, Srch_RsltR.$base_unit_nm,
					Srch_RsltR.$base_unit_dec_place, Srch_RsltR.$vld_dt_fr,
					Srch_RsltR.$vld_dt_to, Srch_RsltR.$pack_unit_cd);
			policy.sum(Srch_RsltR.$base_unit_qty, Srch_RsltR.$pack_unit_qty);
			_allocRsltL.setAll(op.down0().groupBy(policy));
		}

		/**
		 * 引当結果を上り電文に反映して返す
		 */
		protected MCList<Sprt01_DtlR> setAllocRsltL(MCList<Sprt01_DtlR> list) {
			MCList<Sprt01_DtlR> l = MCList.create(Sprt01_DtlR.class);
			MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

			for (Sprt01_DtlR r : list.subList(Sprt01_DtlR.$check, true)) {

				MCNumber remain_qty = MCNumber.ZERO;

				rsltL.init();
				if (!_allocRsltL.isEmpty()) {
					rsltL = _allocRsltL.subList(Srch_RsltR.$peg_no, r.peg_no());
				}
				if (rsltL.isEmpty()) {
					r.no_alloc_flg(true);
					l.add(r);
				}
				else {
					// 引当できた
					remain_qty = r.base_unit_qty();

					MAVM_ITM_UNIT_R trdItmUnitR = getItmUnitCache().getEx(r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());

					for (Srch_RsltR rsltR : rsltL) {
						// 引当できた分のレコード作成
						Sprt01_DtlR tmpR = r.clone();
						tmpR.lot_no(rsltR.lot_no());
						tmpR.sublot_no(rsltR.sublot_no());
						tmpR.ver_no(rsltR.ver_no());

						// 荷姿単位での引当の場合
						if (isSame(tmpR.trd_unit_cd(), rsltR.pack_unit_cd())) {
							tmpR.trd_unit_qty(rsltR.pack_unit_qty());
						}
						// 基準単位での引当の場合
						else {
							MCNumber trdQty = rvrsBaseUnitConv(rsltR.base_unit_qty(),
									trdItmUnitR.conv_base_qty(), trdItmUnitR.conv_qty(),
									trdItmUnitR.dec_place(), trdItmUnitR.rnd_typ(), true);
							if (isNull(trdQty)) {
								tmpR.trd_unit_cd(rsltR.base_unit_cd());
								tmpR.trd_unit_nm(rsltR.base_unit_nm());
								tmpR.trd_unit_conv_base_qty(MCNumber.ONE);
								tmpR.trd_unit_conv_qty(MCNumber.ONE);
								tmpR.trd_unit_rnd_typ(rsltR.base_unit_rnd_typ());
								tmpR.trd_unit_dec_place(rsltR.base_unit_dec_place());
								tmpR.trd_unit_qty(rsltR.base_unit_qty());
							}
							else {
								tmpR.trd_unit_qty(trdQty);
							}
						}
						tmpR.base_unit_qty(rsltR.base_unit_qty());
						tmpR.loc_cd(rsltR.stk_loc_cd());
						tmpR.loc_nm(rsltR.stk_loc_nm());
						tmpR.str_ln_cd(rsltR.stk_str_ln_cd());
						tmpR.str_ln_nm(rsltR.stk_str_ln_nm());
//						tmpR.stk_arrv_bp_cd(rsltR.stk_arrv_bp_cd());
//						tmpR.stk_arrv_bp_nm(rsltR.stk_arrv_bp_nm());
						tmpR.gd_cd(rsltR.gd_cd());
						tmpR.gd_nm(rsltR.gd_nm());
						tmpR.quality_typ(rsltR.quality_typ());
						tmpR.stk_id_typ(rsltR.stk_id_typ());
						tmpR.stk_bp_cd(rsltR.stk_bp_cd());
						tmpR.stk_bp_nm(rsltR.stk_bp_nm());

						l.add(tmpR);

						// 残数
						remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
					}
					// 残数がある場合は未引当レコードを作成する
					// 未引当行は単位と数量のみ下らせる
					if (remain_qty.isPositive()) {
						Sprt01_DtlR tmpR = r.clone();
						MCNumber trdQty = rvrsBaseUnitConv(remain_qty,
								trdItmUnitR.conv_base_qty(), trdItmUnitR.conv_qty(),
								trdItmUnitR.dec_place(), trdItmUnitR.rnd_typ(), true);
						if (isNull(trdQty)) {
							Srch_RsltR rsltR = rsltL.get(0);
							tmpR.trd_unit_cd(rsltR.base_unit_cd());
							tmpR.trd_unit_nm(rsltR.base_unit_nm());
							tmpR.trd_unit_conv_base_qty(MCNumber.ONE);
							tmpR.trd_unit_conv_qty(MCNumber.ONE);
							tmpR.trd_unit_rnd_typ(rsltR.base_unit_rnd_typ());
							tmpR.trd_unit_dec_place(rsltR.base_unit_dec_place());
							tmpR.trd_unit_qty(remain_qty);
						}
						else {
							tmpR.trd_unit_qty(trdQty);
						}
						tmpR.base_unit_qty(remain_qty);
						tmpR.no_alloc_flg(true);
						l.add(tmpR);
					}
				}
			}
			return l;
		}

		/**
		 * 受払予定作成
		 */
		protected void callIoSchdServiceIns01(MCList<Sprt01_DtlR> dtlL) {
			if (dtlL.isEmpty()) {
				return;
			}

			MSBEL_IoSchdService.IoSchd_Ins01 op = MSBEL_IoSchdService.crtIoSchd_Ins01();
			addAll(op.up0(), dtlL, createMap_IoSchd_Ins01_DtlR_Sprt01_DtlR());
			op.exec();
		}

		protected Map_IoSchd_Ins01_DtlR_Sprt01_DtlR<IoSchd_Ins01_DtlR, Sprt01_DtlR> createMap_IoSchd_Ins01_DtlR_Sprt01_DtlR() {
			return new Map_IoSchd_Ins01_DtlR_Sprt01_DtlR<IoSchd_Ins01_DtlR, Sprt01_DtlR>();
		}

		public class Map_IoSchd_Ins01_DtlR_Sprt01_DtlR<D extends IoSchd_Ins01_DtlR, S extends Sprt01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(getIoSchdTypForAcXfr(src.trd_ptn_typ()));
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_no(MAC_STR.NULL_VAL.value());
				dest.io_schd_pr_no(MAC_STR.NULL_VAL.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, Sprt01_DtlR.$acxfr_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, Sprt01_DtlR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, Sprt01_DtlR.$loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, Sprt01_DtlR.$str_ln_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, Sprt01_DtlR.$lot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, Sprt01_DtlR.$sublot_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, Sprt01_DtlR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, Sprt01_DtlR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, Sprt01_DtlR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, Sprt01_DtlR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd,
						Sprt01_DtlR.$trd_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty,
						Sprt01_DtlR.$trd_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd,
						Sprt01_DtlR.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty,
						Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, Sprt01_DtlR.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ,
						Sprt01_DtlR.$quality_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_id_typ, Sprt01_DtlR.$stk_id_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$stk_bp_cd, Sprt01_DtlR.$stk_bp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alloc_flg, Sprt01_DtlR.$alloc_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, Sprt01_DtlR.$vld_dt_fr);
				addColumnPathMap(IoSchd_Ins01_DtlR.$rsn_cd, Sprt01_DtlR.$rsn_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_ptn_typ,
						Sprt01_DtlR.$trd_ptn_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$peg_no, Sprt01_DtlR.$peg_no);
			}
		}

		protected Map_Srch_Io_SchdR_Sprt01_DtlR<Srch_Io_SchdR, Sprt01_DtlR> createMap_Srch_Io_SchdR_Sprt01_DtlR() {
			return new Map_Srch_Io_SchdR_Sprt01_DtlR<Srch_Io_SchdR, Sprt01_DtlR>();
		}

		public class Map_Srch_Io_SchdR_Sprt01_DtlR<D extends Srch_Io_SchdR, S extends Sprt01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_Io_SchdR.$io_schd_no, Sprt01_DtlR.$acxfr_inst_d_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(getIoSchdTypForAcXfr(src.trd_ptn_typ()));
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
			}
		}
		protected Map_Srch_TgtR_Sprt01_DtlR<Srch_TgtR, Sprt01_DtlR> createMap_Srch_TgtR_Sprt01_DtlR() {
			return new Map_Srch_TgtR_Sprt01_DtlR<Srch_TgtR, Sprt01_DtlR>();
		}

		public class Map_Srch_TgtR_Sprt01_DtlR<D extends Srch_TgtR, S extends Sprt01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MAM_ITM_R itmCacheR = getItmCache().getEx(src.itm_cd(), src.itm_sub1(),
						src.itm_sub2(), src.itm_sub3());
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitCache().getEx(src.itm_cd(),
						src.itm_sub1(), src.itm_sub2(), src.itm_sub3(),
						src.trd_unit_cd());

				dest.gi_loc_cd(up0().loc_cd());

				// 荷姿対象かつ取引単位が荷姿単位なら取引単位を荷姿単位とする
				// 取引単位が荷姿単位でない場合は基準単位での提案とする(何もいれない)
				if (itmCacheR.pack_alloc_flg() && itmUnitR.pack_flg()) {
					dest.pack_alloc_flg(true);
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}

			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, Sprt01_DtlR.$peg_no);
				addColumnPathMap(Srch_TgtR.$gi_schd_dt, Sprt01_DtlR.$acxfr_schd_dt);
				addColumnPathMap(Srch_TgtR.$itm_cd, Sprt01_DtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, Sprt01_DtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, Sprt01_DtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, Sprt01_DtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$ver_no, Sprt01_DtlR.$ver_no);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Sprt01_DtlR.$str_ln_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, Sprt01_DtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, Sprt01_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, Sprt01_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, Sprt01_DtlR.$gd_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, Sprt01_DtlR.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, Sprt01_DtlR.$sublot_no);
				addColumnPathMap(Srch_TgtR.$sno1, Sprt01_DtlR.$sno1);
				addColumnPathMap(Srch_TgtR.$sno2, Sprt01_DtlR.$sno2);
				addColumnPathMap(Srch_TgtR.$sno3, Sprt01_DtlR.$sno3);
				addColumnPathMap(Srch_TgtR.$sno4, Sprt01_DtlR.$sno4);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, Sprt01_DtlR.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_qty, Sprt01_DtlR.$base_unit_qty);
				addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, Sprt01_DtlR.$no_lot_fix_flg);
				addColumnPathMap(Srch_TgtR.$not_lot_mix_flg,
						Sprt01_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg,
						Sprt01_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(Srch_TgtR.$vld_dt_fr, Sprt01_DtlR.$vld_dt_fr);
				addColumnPathMap(Srch_TgtR.$io_schd_typ, Sprt01_DtlR.$io_schd_typ);
				addColumnPathMap(Srch_TgtR.$stk_alloc_flg, Sprt01_DtlR.$stk_alloc_flg);
			}
		}
	}

	protected void prepare(MCList<Chk01_DtlR> dtlL) {
		_dtlSize = dtlL.size();

		_acxfrInstNo = null;
	}

	protected void prepare() {
		_acxfrInstNo = null;
	}

	protected void clearList() {
		_createInstDL.clear();
		_modifyInstDL.clear();
		_modifyInstDWithActL.clear();
		_deleteInstDL.clear();
		_createSchdL.clear();
		_modifySchdL.clear();
		_actDL.clear();

		MST_ACXFR_INST_D_R t = MST_ACXFR_INST_D_R.create("T");
		_modifyInstDWithActL_bldr.setSet(t.disp_seq);
	}

	protected void dtlCreate(Chk01_DtlR dtlR) {
		MST_ACXFR_INST_D_R instR = MST_ACXFR_INST_D_R.create();

		setInstDNo(dtlR);
		setPrStsTyp(dtlR);
		copy(instR, dtlR, createMap_MST_ACXFR_INST_D_R_Chk01_DtlR());
		instR.abort_flg(false);
		_createInstDL.add(instR);
	}

	protected void dtlModify(Chk01_DtlR dtlR) {
		MST_ACXFR_INST_D_R instR = MST_ACXFR_INST_D_R.create();

		setPrStsTyp(dtlR);
		copy(instR, dtlR, createMap_MST_ACXFR_INST_D_R_Chk01_DtlR());
		_modifyInstDL.add(instR);
	}

	protected void dtlDelete(Chk01_DtlR dtlR) {
		MST_ACXFR_INST_D_R delR = MST_ACXFR_INST_D_R.create();

		delR.acxfr_inst_d_no(dtlR.acxfr_inst_d_no());
		_deleteInstDL.add(delR);
	}

	protected void dtlDelete(Chk03_DtlR dtlR) {
		MST_ACXFR_INST_D_R delR = MST_ACXFR_INST_D_R.create();

		delR.acxfr_inst_d_no(dtlR.acxfr_inst_d_no());
		_deleteInstDL.add(delR);
	}

	protected void setPrStsTyp(Chk01_DtlR dtlR) {
		if (_actDL.isEmpty()) {
			dtlR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
			return;
		}

		MCIndexKey actIdx = _actDL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_inst_d_no);
		MST_ACXFR_ACT_D_R actDR = _actDL.getFirst(actIdx, dtlR.acxfr_inst_d_no());

		if (isNull(actDR)) {
			dtlR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
		}

		else if (actDR.base_unit_qty().gte(dtlR.base_unit_qty())) {
			dtlR.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
		}
		else {
			dtlR.pr_sts_typ(MSC_PR_STS_TYP.PART_COMP.value());
		}
	}

	protected void getActDtl(MCList<Chk01_DtlR> bindL) {
		_actDL_bldr.setSelect(_actDL_t.acxfr_inst_d_no);
		_actDL_bldr.addSum(_actDL_t.base_unit_qty, MST_ACXFR_ACT_D_R.$base_unit_qty);
		_actDL_bldr.addWhereWithAnd(_actDL_t.can_flg.eq(value(false)));
		_actDL_bldr.addWhereWithAnd(_actDL_t.acxfr_inst_d_no.eq(bind("acxfr_inst_d_no")));
		_actDL_bldr.addGroupBy(_actDL_t.acxfr_inst_d_no);
		_actDL_bldr.setOrderByAsc(_actDL_t.acxfr_inst_d_no);
		dbSelect("MSBEL2410_MST_ACXFR_ACT_D_S01", _actDL, _actDL_bldr, bindL);
	}

	protected void setInstNo(Chk01_HdrR hdrR) {
		ElmArgsR args = ElmArgsR.create();
		args.dpt_cd(hdrR.inst_dpt_cd());
		args.co_cd(getCo().co_cd());
		args.wg_cd(hdrR.wg_cd());
		args.dt(hdrR.acxfr_inst_dt());
		args.trd_cd(hdrR.trd_cd());
		args.str(isNull(hdrR.trd_rmrks()) ? null 
				: hdrR.trd_rmrks().substring(0, Integer.min(hdrR.trd_rmrks().length(), 20)));
		String hNo = getNum(MAC_NUM_BIZ_TYP.ACXINST, args);

		_acxfrInstNo = hNo;

		hdrR.acxfr_inst_no(_acxfrInstNo);
	}

	protected void setInstDNo(Chk01_DtlR dtlR) {
		doSeqCache(MSC_NUM_SYS_TYP.ACXINSTD, _dtlSize);
		String dNo = getStrSeq(MSC_NUM_SYS_TYP.ACXINSTD);

		if (isNull(dtlR.acxfr_inst_no())) {
			dtlR.acxfr_inst_no(_acxfrInstNo);
		}

		dtlR.acxfr_inst_d_no(dNo);
	}

	/**
	 * 受払予定の削除
	 * @param hdrR
	 * @param dtlL
	 */
	protected void execIoSchdDel01Service(MCRow hdrR, MCList<? extends MCRow> dtlL) {
		MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();

		Map<String, String> delIoSchdMap = setIoSchdAcXfrInstDeleteMap(hdrR);

		// 予定に基づく受払予定を削除する
		MCList<? extends MCRow> schdDtlL = dtlL.subList(r -> !isNull(r.getStringNE("acxfr_schd_no")));
		if (!schdDtlL.isEmpty()) {
			// まとまる可能性のある予定も取得する
			MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
			MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.addWhereWithAnd(bracket(t.acxfr_schd_no.eq(bind("acxfr_schd_no"))
					.or(t.old_acxfr_schd_no.eq(bind("acxfr_schd_no")))));
			schdL_bldr.addWhereWithAnd(
					t.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())));
			dbSelect("MSBEL2410_MST_ACXFR_SCHD_S04", schdL, schdL_bldr,
					schdDtlL.groupBy("acxfr_schd_no"));
			for (MST_ACXFR_SCHD_R schdR : schdL) {
				MSW_IO_SCHD_DEL_R ioR = MSW_IO_SCHD_DEL_R.create();

				delIoSchdMap.put(MSW_IO_SCHD_DEL_R.$io_schd_no, MST_ACXFR_SCHD_R.$acxfr_schd_no);

				ioR.setValues(delIoSchdMap, schdR);

				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());

				if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.getStringNE("trd_ptn_typ"))) {
					ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GR.value());
				}
				else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.getStringNE("trd_ptn_typ"))) {
					ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI.value());
				}
				else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.getStringNE("trd_ptn_typ"))) {
					ioR.io_schd_typ(MSC_IO_SCHD_TYP.SCRP.value());
				}
				ope.up0().add(ioR);
			}
		}
		
		// 指図に基づく受払予定を削除する
		delIoSchdMap = setIoSchdAcXfrInstDeleteMap(hdrR);
		MCList<? extends MCRow> instDtlL = dtlL.subList(r -> !isNull(r.getStringNE("acxfr_inst_d_no")));
		for (MCRow dtlR : instDtlL) {
			MSW_IO_SCHD_DEL_R ioR = MSW_IO_SCHD_DEL_R.create();

			delIoSchdMap.put(MSW_IO_SCHD_DEL_R.$io_schd_no, "acxfr_inst_d_no");

			ioR.setValues(delIoSchdMap, dtlR);

			ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GR.value());
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.SCRP.value());
			}
			ope.up0().add(ioR);
		}

		ope.exec();
	}

	protected Map<String, String> setIoSchdAcXfrInstDeleteMap(MCRow hdrR) {
		Map<String, String> Map = new HashMap<String, String>();
		// なし
		return Map;
	}

	/**
	 * 他勘定振替指図に基づく受払予定の作成
	 * @param hdrR
	 * @param dtlL
	 */
	protected void execIoSchdIns01Service(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MSBEL_IoSchdService.IoSchd_Ins01 ope = MSBEL_IoSchdService.crtIoSchd_Ins01();
		// 新規、または打ち切りでない更新
		MCList<Chk01_DtlR> instDtlL =
				dtlL.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && !r.abort_flg()));

		setIoSchdAcXfrInstInsertMap(hdrR);

		for (Chk01_DtlR dtlR : instDtlL) {
			IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();

			ioR.setValues(_insIoSchdMap, dtlR);

			if (_actDL.isEmpty()) {
				ioR.base_unit_qty(dtlR.base_unit_qty());
				ioR.trd_unit_qty(dtlR.trd_unit_qty());
				ioR.trd_unit_cd(dtlR.trd_unit_cd());
			}
			else {
				MCIndexKey actIdx = _actDL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_inst_d_no);
				MST_ACXFR_ACT_D_R actDR = _actDL.getFirst(actIdx, dtlR.acxfr_inst_d_no());

				if (isNull(actDR)) {
					ioR.base_unit_qty(dtlR.base_unit_qty());
					ioR.trd_unit_qty(dtlR.trd_unit_qty());
					ioR.trd_unit_cd(dtlR.trd_unit_cd());
				}
				else if (actDR.base_unit_qty().gte(dtlR.base_unit_qty())) {
					continue;
				}
				else {
					MCNumber base_unit_qty = dtlR.base_unit_qty().subtract(actDR.base_unit_qty());
					ioR.base_unit_qty(base_unit_qty);
					MAVM_ITM_UNIT_R unitR = getItmUnitCache().getEx(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
					MCNumber trd_q = rvrsBaseUnitConv(base_unit_qty, unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ(), true);
					if (isNull(trd_q)) {
						ioR.trd_unit_qty(base_unit_qty);
						ioR.trd_unit_cd(dtlR.base_unit_cd());
					}
					else {
						ioR.trd_unit_qty(trd_q);
						ioR.trd_unit_cd(dtlR.trd_unit_cd());
					}
				}
			}

			ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GR.value());
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.SCRP.value());
			}
			ope.up0().add(ioR);
		}
		ope.exec();
	}

	/**
	 * 受払予定作成／削除時に渡すカラムのマッピング情報を設定する<br>
	 * 手動設定する必要があるカラムについては、本処理では設定しない
	 * @param up0
	 */
	protected void setIoSchdAcXfrInstInsertMap(MCRow row) {
		_insIoSchdMap.clear();
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$io_schd_no, Chk01_DtlR.$acxfr_inst_d_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$schd_dt, Chk01_DtlR.$acxfr_schd_dt);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno1, Chk01_DtlR.$sno1);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno2, Chk01_DtlR.$sno2);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno3, Chk01_DtlR.$sno3);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno4, Chk01_DtlR.$sno4);
//		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
//		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
//		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);

		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(row.getStringNE(Chk01_DtlR.$trd_ptn_typ))
				|| (MAC_TRD_PTN_TYP.isSCRP(row.getStringNE(Chk01_DtlR.$trd_ptn_typ)))) {
			_insIoSchdMap.put(IoSchd_Ins01_DtlR.$alloc_flg, Chk01_DtlR.$alloc_flg);
			_insIoSchdMap.put(IoSchd_Ins01_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
		}
	}

	/**
	 * 他勘定振替予定に基づく受払予定の作成
	 */
	protected void execIoSchdIns01ServiceForSchd(MCList<? extends MCRow> dtlL) {
		if (_oldSchdL.isEmpty()) return;
		
		MCList<MST_ACXFR_SCHD_R> bindL = _oldSchdL.groupBy(MST_ACXFR_SCHD_R.$old_acxfr_schd_no);

		MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
		MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		schdL_bldr.setWhere(t.old_acxfr_schd_no.eq(bind("old_acxfr_schd_no")));
		schdL_bldr.addWhereWithAnd(t.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())));
		schdL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false)));
		dbSelect("MSBEL2410_MST_ACXFR_SCHD_S05", schdL, schdL_bldr, bindL);
		
		if (schdL.isEmpty()) return;

		MSBEL_IoSchdService.IoSchd_Ins01 ope = MSBEL_IoSchdService.crtIoSchd_Ins01();

		for (MST_ACXFR_SCHD_R schdR : schdL) {
			IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
			setIoSchdAcXfrSchdInsertMap(schdR);

			ioR.setValues(_insIoSchdMap, schdR);
			ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(schdR.trd_ptn_typ())) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GR.value());
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(schdR.trd_ptn_typ())) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(schdR.trd_ptn_typ())) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.SCRP.value());
			}
			ope.up0().add(ioR);
		}
		ope.exec();
	}

	protected void setIoSchdAcXfrSchdInsertMap(MST_ACXFR_SCHD_R rsltR) {
		_insIoSchdMap.clear();
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$io_schd_no, MST_ACXFR_SCHD_R.$acxfr_schd_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$io_schd_pr_no, MST_ACXFR_SCHD_R.$io_schd_pr_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$schd_dt, MST_ACXFR_SCHD_R.$acxfr_schd_dt);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_cd, MST_ACXFR_SCHD_R.$itm_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub1, MST_ACXFR_SCHD_R.$itm_sub1);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub2, MST_ACXFR_SCHD_R.$itm_sub2);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub3, MST_ACXFR_SCHD_R.$itm_sub3);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$ver_no, MST_ACXFR_SCHD_R.$ver_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$loc_cd, MST_ACXFR_SCHD_R.$loc_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$str_ln_cd, MST_ACXFR_SCHD_R.$str_ln_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, MST_ACXFR_SCHD_R.$stk_arrv_bp_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$lot_no, MST_ACXFR_SCHD_R.$lot_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sublot_no, MST_ACXFR_SCHD_R.$sublot_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno1, MST_ACXFR_SCHD_R.$sno1);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno2, MST_ACXFR_SCHD_R.$sno2);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno3, MST_ACXFR_SCHD_R.$sno3);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno4, MST_ACXFR_SCHD_R.$sno4);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$trd_unit_cd, MST_ACXFR_SCHD_R.$trd_unit_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$trd_unit_qty, MST_ACXFR_SCHD_R.$trd_unit_qty);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$base_unit_cd, MST_ACXFR_SCHD_R.$base_unit_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$base_unit_qty, MST_ACXFR_SCHD_R.$base_unit_qty);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$gd_cd, MST_ACXFR_SCHD_R.$gd_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$quality_typ, MST_ACXFR_SCHD_R.$quality_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_insp_typ, MST_ACXFR_SCHD_R.$stk_insp_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_id_typ, MST_ACXFR_SCHD_R.$stk_id_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_bp_cd, MST_ACXFR_SCHD_R.$stk_bp_cd);

		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(rsltR.trd_ptn_typ())
				|| (MAC_TRD_PTN_TYP.isSCRP(rsltR.trd_ptn_typ()))) {
			//_insIoSchdMap.put(IoSchd_Ins01_DtlR.$alloc_flg, MST_ACXFR_SCHD_R.$alloc_flg);
			_insIoSchdMap.put(IoSchd_Ins01_DtlR.$rsn_cd, MST_ACXFR_SCHD_R.$rsn_cd);
		}
	}

	/**
	 * 他勘定振替予定の更新<br>
	 * @param dtlL
	 */
	protected void updSchd(MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR> subL = dtlL.subList(r -> !isNull(r.acxfr_schd_no()));
		if (subL.isEmpty()) return;

		MCList<Chk01_DtlR> bindL = subL.groupBy(Chk01_DtlR.$acxfr_schd_no);
		MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
		dbSelectKey("MSBEL2410_MST_ACXFR_SCHD_S06", schdL,
				MCQueryApiBuilder.create(MST_ACXFR_SCHD_R.create("T")), bindL);
		MCIndexKey schdIdxKey = schdL.createIndex(MST_ACXFR_SCHD_R.$acxfr_schd_no);

		MCList<Chk01_DtlR>[] gl = subL.groupList(Chk01_DtlR.$acxfr_schd_no);
		for (MCList<Chk01_DtlR> l : gl) {
			MCNumber inst_qty_b = MCNumber.ZERO;
			for (Chk01_DtlR r : l) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					inst_qty_b = inst_qty_b.add(r.base_unit_qty());
				}
			}
			Chk01_DtlR dtlR = l.get(0);
			MST_ACXFR_SCHD_R schdR = schdL.getFirst(schdIdxKey, dtlR.acxfr_schd_no());
			
			if (inst_qty_b.isZero()) {
				// 未指図に戻す
				schdR.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
				_modifySchdL.add(schdR);
			}
			else if (inst_qty_b.gte(l.get(0).schd_base_unit_qty()) || l.get(0).abort_flg()) {
				// 指図済み
				schdR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
				_modifySchdL.add(schdR);
			}
			else {
				// 分割
				schdSplit(dtlR, schdR);
			}
		}
		if (!_createSchdL.isEmpty()) {
			dbInsertEx("MSBEL2410_MST_ACXFR_SCHD_I02", _createSchdL, _createSchdL_bldr);
		}
		dbUpdateKey("MSBEL2410_MST_ACXFR_SCHD_U02", _modifySchdL, _modifySchdL_bldr);
	}

	/**
	 * 他勘定振替予定の統合<br>
	 * データベース更新後に実行する
	 * @param dtlR
	 */
	protected void schdIntegration(MCList<? extends MCRow> dtlL) {
		MCList<? extends MCRow> subL = dtlL.subList(r -> !isNull(r.getStringNE("acxfr_schd_no")));
		if (subL.isEmpty()) return;

		MCList<? extends MCRow> bindL = subL.groupBy("acxfr_schd_no");
		MCList<MST_ACXFR_SCHD_R> schdL = MCList.create(MST_ACXFR_SCHD_R.class);
		MST_ACXFR_SCHD_R schdL_t = MST_ACXFR_SCHD_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(schdL_t);
		MST_ACXFR_SCHD_R t1 = MST_ACXFR_SCHD_R.create("T1");
		schdL_bldr.setDistinct();
		schdL_bldr.addInnerJoin(t1, bracket(t1.old_acxfr_schd_no.eq(schdL_t.old_acxfr_schd_no)));
		schdL_bldr.setWhere(t1.acxfr_schd_no.eq(bind("acxfr_schd_no")));
		schdL_bldr.addWhereWithAnd(schdL_t.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())));
		schdL_bldr.addWhereWithAnd(schdL_t.abort_flg.eq(value(false)));
		dbSelect("MSBEL2410_MST_ACXFR_SCHD_S07", schdL, schdL_bldr, bindL);
		_oldSchdL = schdL.clone();

		MCList<MST_ACXFR_SCHD_R> updL = MCList.create(MST_ACXFR_SCHD_R.class);
		MCList<MST_ACXFR_SCHD_R> delL = MCList.create(MST_ACXFR_SCHD_R.class);

		MCList<MST_ACXFR_SCHD_R>[] gl = schdL.groupList(MST_ACXFR_SCHD_R.$old_acxfr_schd_no);
		for (MCList<MST_ACXFR_SCHD_R> l : gl) {
			MST_ACXFR_SCHD_R tgtSchd = l.getFirst(MST_ACXFR_SCHD_R.$acxfr_schd_no, l.get(0).old_acxfr_schd_no());
			if (isNull(tgtSchd)) {
				tgtSchd = l.get(0);
			}
			for (MST_ACXFR_SCHD_R r : l) {
				if (isSame(r.acxfr_schd_no(), tgtSchd.acxfr_schd_no())) continue;
				
				tgtSchd.base_unit_qty(tgtSchd.base_unit_qty().add(r.base_unit_qty()));
				delL.add(r);
			}
			MAVM_ITM_UNIT_R unitR = getItmUnitCache().getEx(tgtSchd.itm_cd(), tgtSchd.itm_sub1(), tgtSchd.itm_sub2(), tgtSchd.itm_sub3(), tgtSchd.trd_unit_cd());
			MCNumber trd_q = rvrsBaseUnitConv(tgtSchd.base_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ(), true);
			if (isNull(trd_q)) {
				tgtSchd.trd_unit_qty(tgtSchd.base_unit_qty());
				tgtSchd.trd_unit_cd(tgtSchd.base_unit_cd());
			}
			else {
				tgtSchd.trd_unit_qty(trd_q);
			}
			updL.add(tgtSchd);
		}
		dbUpdateKey("MSBEL2410_MST_ACXFR_SCHD_U03", updL, MCQueryApiBuilder.create(MST_ACXFR_SCHD_R.create("T")));
		dbDeleteKey("MSBEL2410_MST_ACXFR_SCHD_D01", delL, MCQueryApiBuilder.create(MST_ACXFR_SCHD_R.create("T")));
	}

	/**
	 * 他勘定振替予定の分割
	 */
	protected void schdSplit(Chk01_DtlR dtlR, MST_ACXFR_SCHD_R schdR) {
		MST_ACXFR_SCHD_R newSchd = schdR.clone();
		MCNumber schdRemain = schdR.base_unit_qty().subtract(dtlR.base_unit_qty());

		if (isNull(schdR.old_acxfr_schd_no())) {
			schdR.old_acxfr_schd_no(schdR.acxfr_schd_no());
			newSchd.old_acxfr_schd_no(schdR.old_acxfr_schd_no());
		}

		setSchdNo(newSchd);
		newSchd.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
		newSchd.base_unit_qty(schdRemain);
		MAVM_ITM_UNIT_R unitR = getItmUnitCache().getEx(newSchd.itm_cd(), newSchd.itm_sub1(), newSchd.itm_sub2(), newSchd.itm_sub3(), newSchd.trd_unit_cd());
		MCNumber trd_q = rvrsBaseUnitConv(schdRemain, unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ(), true);
		if (isNull(trd_q)) {
			newSchd.trd_unit_qty(newSchd.base_unit_qty());
			newSchd.trd_unit_cd(newSchd.base_unit_cd());
		}
		else {
			newSchd.trd_unit_qty(trd_q);
		}
		_createSchdL.add(newSchd);

		schdR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
		schdR.trd_unit_qty(dtlR.trd_unit_qty());
		schdR.trd_unit_cd(dtlR.trd_unit_cd());
		schdR.base_unit_qty(dtlR.base_unit_qty());
		_modifySchdL.add(schdR);
	}

	protected void setSchdNo(MST_ACXFR_SCHD_R schdR) {
		ElmArgsR args = ElmArgsR.create();
		args.dpt_cd(schdR.rqst_dpt_cd());
		args.co_cd(getCo().co_cd());
		args.wg_cd(schdR.wg_cd());
		args.dt(schdR.acxfr_schd_dt());
		args.str(schdR.trd_d_rmrks());
		String dNo = getNum(MAC_NUM_BIZ_TYP.ACXSCHD, args);

		schdR.acxfr_schd_no(lpad(dNo, MAC_NUM_BIZ_TYP.ACXSCHD.length().intValue(), "0"));
	}

	protected void setSundryItm(MCList<Chk01_DtlR> dtlL) {
		MCList<SundryItm_Upd01_DtlR> siL = MCList.create(SundryItm_Upd01_DtlR.class);
		for (Chk01_DtlR r : dtlL) {
			if (r.sundry_itm_flg()) {
				SundryItm_Upd01_DtlR siR = SundryItm_Upd01_DtlR.create();
				copy(siR, r, createMap_SundryItm_Upd01_DtlR_Chk01_DtlR());
				siL.add(siR);
			}
		}
		// 諸口品マスタ追加
		if (!siL.isEmpty()) {
			MABCL_SundryItmRegService.SundryItm_Upd01 o = MABCL_SundryItmRegService.crtSundryItm_Upd01();
			o.up0().setAll(siL);
			o.exec();
		}
	}

	
	protected Map_Chk03_DtlR_MST_ACXFR_INST_D_R<Chk03_DtlR, MST_ACXFR_INST_D_R> createMap_Chk03_DtlR_MST_ACXFR_INST_D_R() {
		return new Map_Chk03_DtlR_MST_ACXFR_INST_D_R<Chk03_DtlR, MST_ACXFR_INST_D_R>();
	}

	public class Map_Chk03_DtlR_MST_ACXFR_INST_D_R<D extends Chk03_DtlR, S extends MST_ACXFR_INST_D_R>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk03_DtlR.$acxfr_schd_no,
					MST_ACXFR_INST_D_R.$acxfr_schd_no);
			addColumnPathMap(Chk03_DtlR.$acxfr_inst_d_no,
					MST_ACXFR_INST_D_R.$acxfr_inst_d_no);
			addColumnPathMap(Chk03_DtlR.$acxfr_inst_no,
					MST_ACXFR_INST_D_R.$acxfr_inst_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}
	}

	protected Map_MST_ACXFR_INST_R_Chk01_HdrR<MST_ACXFR_INST_R, Chk01_HdrR> createMap_MST_ACXFR_INST_R_Chk01_HdrR() {
		return new Map_MST_ACXFR_INST_R_Chk01_HdrR<MST_ACXFR_INST_R, Chk01_HdrR>();
	}

	public class Map_MST_ACXFR_INST_R_Chk01_HdrR<D extends MST_ACXFR_INST_R, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ACXFR_INST_R.$acxfr_inst_no, Chk01_HdrR.$acxfr_inst_no);
			addColumnPathMap(MST_ACXFR_INST_R.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(MST_ACXFR_INST_R.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(MST_ACXFR_INST_R.$loc_cd, Chk01_HdrR.$loc_cd);
			addColumnPathMap(MST_ACXFR_INST_R.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(MST_ACXFR_INST_R.$acxfr_inst_dt, Chk01_HdrR.$acxfr_inst_dt);
			addColumnPathMap(MST_ACXFR_INST_R.$inst_dpt_cd, Chk01_HdrR.$inst_dpt_cd);
			addColumnPathMap(MST_ACXFR_INST_R.$inst_usr_cd, Chk01_HdrR.$inst_usr_cd);
			addColumnPathMap(MST_ACXFR_INST_R.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(MST_ACXFR_INST_R.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(MST_ACXFR_INST_R.$inst_rmrks, Chk01_HdrR.$inst_rmrks);
			addColumnPathMap(MST_ACXFR_INST_R.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_ACXFR_INST_R.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_ACXFR_INST_R.$sub_char3, Chk01_HdrR.$sub_char3);

		}
	}

	protected Map_MST_ACXFR_INST_D_R_Chk01_DtlR<MST_ACXFR_INST_D_R, Chk01_DtlR> createMap_MST_ACXFR_INST_D_R_Chk01_DtlR() {
		return new Map_MST_ACXFR_INST_D_R_Chk01_DtlR<MST_ACXFR_INST_D_R, Chk01_DtlR>();
	}

	public class Map_MST_ACXFR_INST_D_R_Chk01_DtlR<D extends MST_ACXFR_INST_D_R, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ACXFR_INST_D_R.$acxfr_inst_d_no,
					Chk01_DtlR.$acxfr_inst_d_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$acxfr_inst_no,
					Chk01_DtlR.$acxfr_inst_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$pr_sts_typ, Chk01_DtlR.$pr_sts_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$acxfr_schd_no,
					Chk01_DtlR.$acxfr_schd_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$acxfr_schd_dt,
					Chk01_DtlR.$acxfr_schd_dt);
			addColumnPathMap(MST_ACXFR_INST_D_R.$rsn_cd, Chk01_DtlR.$rsn_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_ACXFR_INST_D_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_ACXFR_INST_D_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_ACXFR_INST_D_R.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$stk_arrv_bp_cd,
					Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$no_lot_fix_flg,
					Chk01_DtlR.$no_lot_fix_flg);
			addColumnPathMap(MST_ACXFR_INST_D_R.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(MST_ACXFR_INST_D_R.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$fix_no_typ, Chk01_DtlR.$fix_no_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$fix_no, Chk01_DtlR.$fix_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$in_xfr_typ, Chk01_DtlR.$in_xfr_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_ACXFR_INST_D_R.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$base_unit_qty,
					Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(MST_ACXFR_INST_D_R.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_bp_cd, Chk01_DtlR.$bd_bp_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(MST_ACXFR_INST_D_R.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(MST_ACXFR_INST_D_R.$io_schd_pr_no,
					Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$dspsl_no, Chk01_DtlR.$dspsl_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(MST_ACXFR_INST_D_R.$aprv_flg, Chk01_DtlR.$aprv_flg);
			addColumnPathMap(MST_ACXFR_INST_D_R.$aprv_no, Chk01_DtlR.$aprv_no);
			addColumnPathMap(MST_ACXFR_INST_D_R.$aprv_sts_typ, Chk01_DtlR.$aprv_sts_typ);
			addColumnPathMap(MST_ACXFR_INST_D_R.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(MST_ACXFR_INST_D_R.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(MST_ACXFR_INST_D_R.$inst_d_rmrks, Chk01_DtlR.$inst_d_rmrks);
			addColumnPathMap(MST_ACXFR_INST_D_R.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_ACXFR_INST_D_R.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(MST_ACXFR_INST_D_R.$alloc_flg, Chk01_DtlR.$alloc_flg);

		}
	}

			protected Map_SundryItm_Chk01_DtlR_Chk01_DtlR<SundryItm_Chk01_DtlR,Chk01_DtlR> createMap_SundryItm_Chk01_DtlR_Chk01_DtlR() {
				return new Map_SundryItm_Chk01_DtlR_Chk01_DtlR<SundryItm_Chk01_DtlR, Chk01_DtlR>();
			}

			public class Map_SundryItm_Chk01_DtlR_Chk01_DtlR<D extends SundryItm_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
				@Override
				protected void setupColumnPathMap() {
					addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
					addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
					addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
					addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
					addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
					addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
					addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, Chk01_DtlR.$sno1);
					addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, Chk01_DtlR.$sno2);
					addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, Chk01_DtlR.$sno3);
					addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, Chk01_DtlR.$sno4);
					addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
					addColumnPathMap(SundryItm_Chk01_DtlR.$err_flg, Chk01_DtlR.$err_flg);

				}
			}

			protected Map_SundryItm_Upd01_DtlR_Chk01_DtlR<SundryItm_Upd01_DtlR,Chk01_DtlR> createMap_SundryItm_Upd01_DtlR_Chk01_DtlR() {
				return new Map_SundryItm_Upd01_DtlR_Chk01_DtlR<SundryItm_Upd01_DtlR, Chk01_DtlR>();
			}

			public class Map_SundryItm_Upd01_DtlR_Chk01_DtlR<D extends SundryItm_Upd01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
				@Override
				protected void setupColumnPathMap() {
					addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
					addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
					addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
					addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
					addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
					addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
					addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
					addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
					addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);

				}
			}

	// キャッシュ関連
	protected static final Class<MSBEL_AcXfrInstReg> CLAZZ = MSBEL_AcXfrInstReg.class;

	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;

	protected FXUCL_MCDbcCache<MAM_TRD_R> _trdCache = null;

	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;

	// 品目マスタ 基準単位ＣＤ、荷姿引当ＦＬＧ
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return object(CLAZZ)._itmCache;
	}

	protected static void initItmCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmCache(bindL);
	}

	protected void _initItmCache(MCList<? extends MCRow> bindL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
		itmL_bldr.setSelect(t.unit_cd, t.pack_alloc_flg, t.dec_place, t.rnd_typ, t.sundry_itm_flg);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindL, Chk01_DtlR.$itm_cd,
				Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3);
	}

	protected static void initItmUnitCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}

	protected void _initItmUnitCache(MCList<? extends MCRow> bindL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		itmUnitL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ, t.pack_flg);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, bindL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}

	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}

	// 取引マスタ (取引ＣＤの取得) 「取引パタン区分」「自動時採用フラグ=1」
	protected static FXUCL_MCDbcCache<MAM_TRD_R> getTrdCache() {
		if (object(CLAZZ)._trdCache == null) {
			initTrdCache();
		}
		return object(CLAZZ)._trdCache;
	}

	public static void initTrdCache() {
		object(CLAZZ)._initTrdCache();
	}

	protected void _initTrdCache() {
		MAM_TRD_R t = MAM_TRD_R.create("T");
		MCQueryApiBuilder trdR_bldr = MCQueryApiBuilder.create(t);
		trdR_bldr.setSelect(t.trd_ptn_typ);
		_trdCache = new FXUCL_MCDbcCache<MAM_TRD_R>(trdR_bldr);
	}

	/**
	 * 負担ロットＮＯの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト
	 * @return メッセージリスト
	 */
	protected MCMessageList callLotServiceChkBdItm(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Chk01_DtlR> bdLotChkTgtL = MCList.create(Chk01_DtlR.class);
		
		for (Chk01_DtlR dr : dtlL) {
			if (dr.getStatus() == MCRow.DELETE) {
				continue;
			}
			if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
				bdLotChkTgtL.add(dr);
			}
		}
		
		if (bdLotChkTgtL.isEmpty()) {
			return msgL;
		}
		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
		addAll(ope.up0(), bdLotChkTgtL, createMap_Lot_Chk03_CndR_Chk01_DtlR_Bd());
		ope.exec();
		copyErrFlg(bdLotChkTgtL, ope.up0());
		return msgL;
	}

	protected Map_Lot_Chk03_CndR_Chk01_DtlR_Bd<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR_Bd() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR_Bd<Lot_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Chk01_DtlR_Bd<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$bd_sublot_no);
		}
	}

	//FMCB CUSTOM END
}