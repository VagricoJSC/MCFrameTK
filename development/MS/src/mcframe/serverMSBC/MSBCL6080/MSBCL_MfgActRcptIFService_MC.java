package mcframe.serverMSBC.MSBCL6080;

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
import mcframe.serverMSBC.MSBCL6080.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Set;
import java.util.HashSet;

import mcframe.serverMSBC.MSBCL6050.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgActRcptIFService_MC extends MSBCL_MfgActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgActIF_Upd01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正を行う。<br>
	 */
	public class MfgActIF_Upd01 extends MSBCL_MfgActRcptIFService_MC_A.MfgActIF_Upd01 {
		protected MCList<MfgActIF_Upd01_HdrR>        _noErr_Upd01_Hdr       = MCList.create(MfgActIF_Upd01_HdrR.class);
		protected MCList<MfgActIF_Upd01_DtlOperR>    _noErr_Upd01_DtlOper   = MCList.create(MfgActIF_Upd01_DtlOperR.class);
		protected MCList<MfgActIF_Upd01_DtlInptR>    _noErr_Upd01_DtlInpt   = MCList.create(MfgActIF_Upd01_DtlInptR.class);
		protected MCList<MfgActIF_Upd01_DtlLossR>    _noErr_Upd01_DtlLoss   = MCList.create(MfgActIF_Upd01_DtlLossR.class);
		protected MCList<MfgActIF_Upd01_DtlWkR>      _noErr_Upd01_DtlWk     = MCList.create(MfgActIF_Upd01_DtlWkR.class);
		protected MCList<MfgActIF_Upd01_DtlYieldR>   _noErr_Upd01_DtlYield  = MCList.create(MfgActIF_Upd01_DtlYieldR.class);
		protected MCList<MfgActIF_Upd01_DtlByProdR>  _noErr_Upd01_DtlByProd = MCList.create(MfgActIF_Upd01_DtlByProdR.class);
		protected MCNumber      _minErrPegNo = null;
		protected Set<MCNumber> _pegNoErrSet = new HashSet<MCNumber>();
		protected Set<MCNumber> _pegNoHdrSet = new HashSet<MCNumber>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			preProc();

			// 更新可能チェック
			chkBeforeUpd();

			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwUpdErr();
			}

			// 製造実績の登録・訂正
			updMfgAct();
		}

		/**
		 * 製造実績の登録・訂正可能かをチェックする。
		 */
		protected void chkBeforeUpd() {
			mapUpContainers(MARC);
			for (MfgActReg_Chk01_DtlInptR inptR : chk01.up2()) {
				if (isNull(inptR.inpt_rsn_cd())) {
					inptR.inpt_rsn_comp_flg(true);
				}
				if(inptR.inpt_rsn_not_comp_flg()) {
					inptR.inpt_rsn_comp_flg(false);
				}
			}
			chk01.exec();
			mapDownContainers(MARC);

			// チェックによりデータ補完結果を得る
			up1().setAll(down0()); down0().clear();
			up2().setAll(down1()); down1().clear();
			up3().setAll(down2()); down2().clear();
			up4().setAll(down3()); down3().clear();
			up5().setAll(down4()); down4().clear();
			up6().setAll(down5()); down5().clear();
			up7().setAll(down6()); down6().clear();
		}

		/**
		 * 製造実績の登録・訂正処理を行う。
		 */
		protected void updMfgAct() {
			mapUpContainers(MARU);
			if (!upd01.up0().isEmpty()) {
				upd01.exec();
				mapDownContainers(MARU);
			}
			addChkErrToDown();
		}

		/**
		 * 業務チェックエラーとなった製造指図も下り電文に追加する。
		 */
		protected void addChkErrToDown() {
			if (_pegNoErrSet.isEmpty()) {
				return;
			}

			for (MfgActIF_Upd01_HdrR hdrR : up1()) {
				if (!_pegNoErrSet.contains(hdrR.peg_no())) {
					continue;
				}

				hdrR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				down0().add(hdrR);
			}
		}

		@Override
		protected void up_MARU(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest0_6, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR dest0_7, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_HdrR> src_MfgActIF_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlOperR> src_MfgActIF_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlInptR> src_MfgActIF_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlLossR> src_MfgActIF_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlWkR> src_MfgActIF_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlYieldR> src_MfgActIF_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_DtlByProdR> src_MfgActIF_Upd01_DtlByProd, mcframe.serverMSBC.MSBCL6080.MfgActIF_Upd01_IO_CtrlR src_MfgActIF_Upd01_IO_Ctrl){

			// エラー発生時、すべて登録しない場合、全て登録対象とする。
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				super.up_MARU(dest0_0, dest0_1, dest0_2, dest0_3, dest0_4, dest0_5, dest0_6, dest0_7, 
						src_MfgActIF_Upd01_Hdr, src_MfgActIF_Upd01_DtlOper, src_MfgActIF_Upd01_DtlInpt, src_MfgActIF_Upd01_DtlLoss, 
						src_MfgActIF_Upd01_DtlWk, src_MfgActIF_Upd01_DtlYield, src_MfgActIF_Upd01_DtlByProd, src_MfgActIF_Upd01_IO_Ctrl);
				return;
			}

			// 全てのチェックエラーを含む紐付けＮＯを取得する。
			specifyAllErrPegNo( src_MfgActIF_Upd01_Hdr.subList(MfgActIF_Upd01_HdrR.$err_flg, true),
					src_MfgActIF_Upd01_DtlOper.subList(MfgActIF_Upd01_DtlOperR.$err_flg, true),
					src_MfgActIF_Upd01_DtlInpt,
					src_MfgActIF_Upd01_DtlLoss.subList(MfgActIF_Upd01_DtlLossR.$err_flg, true),
					src_MfgActIF_Upd01_DtlWk.subList(MfgActIF_Upd01_DtlWkR.$err_flg, true),
					src_MfgActIF_Upd01_DtlYield.subList(MfgActIF_Upd01_DtlYieldR.$err_flg, true),
					src_MfgActIF_Upd01_DtlByProd.subList(MfgActIF_Upd01_DtlByProdR.$err_flg, true)
				);

			// 更新処理対象を洗い出す。（チェックエラーが発生しないデータ）
			getNoErrUpdHdr(src_MfgActIF_Upd01_Hdr);
			if (!_noErr_Upd01_Hdr.isEmpty()) {
				_pegNoHdrSet.addAll(_noErr_Upd01_Hdr.getNumberNE(MfgActIF_Upd01_HdrR.$peg_no));
				getNoErrDtlOper(src_MfgActIF_Upd01_DtlOper);
				getNoErrDtlInpt(src_MfgActIF_Upd01_DtlInpt);
				getNoErrDtlLoss(src_MfgActIF_Upd01_DtlLoss);
				getNoErrDtlWk(src_MfgActIF_Upd01_DtlWk);
				getNoErrDtlYield(src_MfgActIF_Upd01_DtlYield);
				getNoErrDtlByProd(src_MfgActIF_Upd01_DtlByProd);

				super.up_MARU(dest0_0, dest0_1, dest0_2, dest0_3, dest0_4, dest0_5, dest0_6, dest0_7, 
						_noErr_Upd01_Hdr, _noErr_Upd01_DtlOper, _noErr_Upd01_DtlInpt, _noErr_Upd01_DtlLoss, 
						_noErr_Upd01_DtlWk, _noErr_Upd01_DtlYield, _noErr_Upd01_DtlByProd, src_MfgActIF_Upd01_IO_Ctrl);
			}


		}

		// チェックエラーを含む紐付けＮＯを全て取得する。
		protected void specifyAllErrPegNo (
				MCList<MfgActIF_Upd01_HdrR> errHdr,
				MCList<MfgActIF_Upd01_DtlOperR> errDtlOper,
				MCList<MfgActIF_Upd01_DtlInptR> allDtlInpt,
				MCList<MfgActIF_Upd01_DtlLossR> errDtlLoss,
				MCList<MfgActIF_Upd01_DtlWkR> errDtlWk,
				MCList<MfgActIF_Upd01_DtlYieldR> errDtlYield,
				MCList<MfgActIF_Upd01_DtlByProdR> errDtlByProd) {
			// ロスエラー行を含む投入のチェックエラー行を特定する
			MCList<MfgActIF_Upd01_DtlInptR> errDtlInpt = allDtlInpt.subList(MfgActIF_Upd01_DtlInptR.$err_flg, true);
			for (MfgActIF_Upd01_DtlLossR lossR : errDtlLoss) {
				errDtlInpt.addAll(allDtlInpt.subList(MfgActIF_Upd01_DtlInptR.$peg_no, lossR.inpt_peg_no()));
			}

			// エラーが発生した全ての紐付けＮＯを得る。
			_pegNoErrSet.addAll(errHdr.getNumberNE(MfgActIF_Upd01_HdrR.$peg_no));
			_pegNoErrSet.addAll(errDtlOper.getNumberNE(MfgActIF_Upd01_DtlOperR.$hdr_peg_no));
			_pegNoErrSet.addAll(errDtlInpt.getNumberNE(MfgActIF_Upd01_DtlInptR.$hdr_peg_no));
			_pegNoErrSet.addAll(errDtlWk.getNumberNE(MfgActIF_Upd01_DtlWkR.$hdr_peg_no));
			_pegNoErrSet.addAll(errDtlYield.getNumberNE(MfgActIF_Upd01_DtlYieldR.$hdr_peg_no));
			_pegNoErrSet.addAll(errDtlByProd.getNumberNE(MfgActIF_Upd01_DtlByProdR.$hdr_peg_no));

			// 最小の紐付けＮＯを得る。
			for (MCNumber pegNo : _pegNoErrSet) {
				if (_minErrPegNo == null || _minErrPegNo.gt(pegNo)) {
					_minErrPegNo = pegNo;
				}
			}
		}


		/**
		 * チェックエラーが発生しないヘッダを取得する。
		 * @param orgHdr ヘッダ（上り電文）
		 */
		protected void getNoErrUpdHdr(MCList<MfgActIF_Upd01_HdrR> orgHdr) {
			for (MfgActIF_Upd01_HdrR r : orgHdr) {
				if (_pegNoErrSet.contains(r.peg_no())) {
					continue;
				}
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					if (_minErrPegNo != null && _minErrPegNo.lte(r.peg_no())) {
						continue;
					}
				}

				_noErr_Upd01_Hdr.add(r);
			}
		}

		/**
		 * チェックエラーが発生しない工程を取得する。
		 * @param orgDtlOper 工程（上り電文）
		 */
		protected void getNoErrDtlOper(MCList<MfgActIF_Upd01_DtlOperR> orgDtlOper) {
			for (MfgActIF_Upd01_DtlOperR r : orgDtlOper) {
				if (_pegNoHdrSet.contains(r.hdr_peg_no())) {
					_noErr_Upd01_DtlOper.add(r);
				}
			}
		}

		/**
		 * チェックエラーが発生しない投入を取得する。
		 * @param orgDtlInpt 投入（上り電文）
		 */
		protected void getNoErrDtlInpt(MCList<MfgActIF_Upd01_DtlInptR> orgDtlInpt) {
			for (MfgActIF_Upd01_DtlInptR r : orgDtlInpt) {
				if (_pegNoHdrSet.contains(r.hdr_peg_no())) {
					_noErr_Upd01_DtlInpt.add(r);
				}
			}
		}

		/**
		 * チェックエラーが発生しないロスを取得する。
		 * @param orgDtlInpt ロス（上り電文）
		 */
		protected void getNoErrDtlLoss(MCList<MfgActIF_Upd01_DtlLossR> orgDtlLoss) {
			if (_noErr_Upd01_DtlInpt.isEmpty()) {
				return;
			}
			Set<MCNumber> inptPegNoSet = new HashSet<MCNumber>();
			inptPegNoSet.addAll(_noErr_Upd01_DtlInpt.getNumberNE(MfgActIF_Upd01_DtlInptR.$peg_no));
			for (MfgActIF_Upd01_DtlLossR r : orgDtlLoss) {
				if (inptPegNoSet.contains(r.inpt_peg_no())) {
					_noErr_Upd01_DtlLoss.add(r);
				}
			}
		}

		/**
		 * チェックエラーが発生しない工数を取得する。
		 * @param orgDtlWk 工数（上り電文）
		 */
		protected void getNoErrDtlWk(MCList<MfgActIF_Upd01_DtlWkR> orgDtlWk) {
			for (MfgActIF_Upd01_DtlWkR r : orgDtlWk) {
				if (_pegNoHdrSet.contains(r.hdr_peg_no())) {
					_noErr_Upd01_DtlWk.add(r);
				}
			}
		}

		/**
		 * チェックエラーが発生しない出来高を取得する。
		 * @param orgDtlYield 出来高（上り電文）
		 */
		protected void getNoErrDtlYield(MCList<MfgActIF_Upd01_DtlYieldR> orgDtlYield) {
			for (MfgActIF_Upd01_DtlYieldR r : orgDtlYield) {
				if (_pegNoHdrSet.contains(r.hdr_peg_no())) {
					_noErr_Upd01_DtlYield.add(r);
				}
			}
		}

		/**
		 * チェックエラーが発生しない副産品を取得する。
		 * @param orgDtlByProd 副産品（上り電文）
		 */
		protected void getNoErrDtlByProd(MCList<MfgActIF_Upd01_DtlByProdR> orgDtlByProd) {
			for (MfgActIF_Upd01_DtlByProdR r : orgDtlByProd) {
				if (_pegNoHdrSet.contains(r.hdr_peg_no())) {
					_noErr_Upd01_DtlByProd.add(r);
				}
			}
		}

		protected void preProc() {
			// 必須チェック
			MCMessagePool.addAll(checkReq());
		}

		protected MCMessageList checkReq() {
			MCMessageList msgL = new MCMessageList();

			// 更新制御ブロック（電文）の必須チェック
			msgL.addAll(check(up0(), MfgActIF_Upd01_CtrlR.$if_upd_typ, new FXUCL_RequiredValidater()));

			// 製造実績ブロック（電文）の必須チェック
			for (MfgActIF_Upd01_HdrR up1R : up1()) {
				msgL.addAll(check(up1R, MfgActIF_Upd01_HdrR.$mfg_inst_no, new FXUCL_RequiredValidater()));
				if (up0().upd_cntr_chk_flg() || up1R.upd_cntr_chk_flg()) {
					msgL.addAll(check(up1R, MfgActIF_Upd01_HdrR.$mfg_inst_upd_cntr, new FXUCL_RequiredValidater()));
					msgL.addAll(check(up1R, MfgActIF_Upd01_HdrR.$mfg_inst_pr_upd_cntr, new FXUCL_RequiredValidater()));
					if (!isNull(up1R.mfg_act_no()) && !isNull(up1R.mfg_act_upd_cntr())) {
						msgL.addAll(check(up1R, MfgActIF_Upd01_HdrR.$mfg_act_upd_cntr, new FXUCL_RequiredValidater()));
					}
				}
			}

			return msgL;
		}

		@Override
		protected void up_MARC_chk01_0(MfgActReg_Chk01_HdrR r_dest, MfgActIF_Upd01_HdrR r_src) {
			super.up_MARC_chk01_0(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		@Override
		protected void up_MARC_chk01_1(MfgActReg_Chk01_DtlOperR r_dest, MfgActIF_Upd01_DtlOperR r_src) {
			super.up_MARC_chk01_1(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		@Override
		protected void up_MARC_chk01_2(MfgActReg_Chk01_DtlInptR r_dest, MfgActIF_Upd01_DtlInptR r_src) {
			super.up_MARC_chk01_2(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		@Override
		protected void up_MARC_chk01_3(MfgActReg_Chk01_DtlLossR r_dest, MfgActIF_Upd01_DtlLossR r_src) {
			super.up_MARC_chk01_3(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		@Override
		protected void up_MARC_chk01_4(MfgActReg_Chk01_DtlWkR r_dest, MfgActIF_Upd01_DtlWkR r_src) {
			super.up_MARC_chk01_4(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		@Override
		protected void up_MARC_chk01_5(MfgActReg_Chk01_DtlYieldR r_dest, MfgActIF_Upd01_DtlYieldR r_src) {
			super.up_MARC_chk01_5(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		@Override
		protected void up_MARC_chk01_6(MfgActReg_Chk01_DtlByProdR r_dest, MfgActIF_Upd01_DtlByProdR r_src) {
			super.up_MARC_chk01_6(r_dest, r_src);

			r_dest.setStatus(getRowStatus(r_src.data_crud_typ()));
		}

		/**
		 * データ更新区分により、行ステータスを返す。<br>&nbsp;&nbsp;
		 *   CRT=>CREATE, UPD=>MODIFY, DEL=>DELETE
		 * @param dataCurdTyp データ更新区分
		 * @return Status 行ステータス
		 */
		protected Status getRowStatus(String dataCurdTyp) {
			if (MAC_DATA_CRUD_TYP.isCRT(dataCurdTyp)) {
				return Status.CREATE;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(dataCurdTyp)) {
				return Status.DELETE;
			}
			if (MAC_DATA_CRUD_TYP.isUPD(dataCurdTyp)) {
				return Status.MODIFY;
			}

			return Status.NONE;
		}
	}
	/**
	 * MfgActIF_Del01オペレーション.<p>
	 *
	 * 製造実績の取消を行う。<br>
	 */
	public class MfgActIF_Del01 extends MSBCL_MfgActRcptIFService_MC_A.MfgActIF_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 取消前処理 
			preProc();

			// 製造実績の取消
			delMfgAct();
		}

		/**
		 * 製造実績の取消処理を行う。
		 */
		protected void delMfgAct() {
			mapUpContainers(MARD);
			del01.exec();
			mapDownContainers(MARD);
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

			// 取消制御ブロック（電文）の必須チェック
			msgL.addAll(check(up0(), MfgActIF_Del01_CtrlR.$if_upd_typ, new FXUCL_RequiredValidater()));

			// 製造実績ブロック（電文）の必須チェック
			for (MfgActIF_Del01_HdrR up1R : up1()) {
				msgL.addAll(check(up1R, MfgActIF_Del01_HdrR.$mfg_act_no, new FXUCL_RequiredValidater()));
				if (up0().upd_cntr_chk_flg() || up1R.upd_cntr_chk_flg()) {
					msgL.addAll(check(up1R, MfgActIF_Del01_HdrR.$mfg_inst_upd_cntr, new FXUCL_RequiredValidater()));
					msgL.addAll(check(up1R, MfgActIF_Del01_HdrR.$mfg_inst_pr_upd_cntr, new FXUCL_RequiredValidater()));
					msgL.addAll(check(up1R, MfgActIF_Del01_HdrR.$mfg_act_upd_cntr, new FXUCL_RequiredValidater()));
				}
			}

			return msgL;
		}
	}

	/**
	 * MfgActIF_Upd02オペレーション.<p>
	 *
	 * 工数実績の登録・訂正を行う。<br>
	 */
	public class MfgActIF_Upd02 extends MSBCL_MfgActRcptIFService_MC_A.MfgActIF_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 登録・訂正前処理 
			editUp();

			// 業務チェック
			callWkActUpdChk();
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwUpdErr();
			}

			// 工数実績の登録・訂正
			updWkAct();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			if (!up1().isEmpty() && isNull(up1().get(0).peg_no())) {
				setPegNo(MfgActIF_Upd02_RsltR.$peg_no, up1());
			}

			for (MfgActIF_Upd02_RsltR r : up1()) {
				if (isNull(r.wk_act_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callWkActUpdChk() {
			mapUpContainers(MARC);
			chk04.exec();
			mapDownContainers(MARC);

			// チェックによりデータ補完結果を得る
			up1().setAll(down0());
			down0().clear();
		}

		/**
		 * 工数実績の登録・訂正処理を行う。
		 */
		protected void updWkAct() {
			mapUpContainers(MARU);
			upd03.exec();
			mapDownContainers(MARU);
		}

		@Override
		protected void up_MARU_upd03_1(MCList<MfgActReg_Chk04_RsltR> dest0_1,
				MCList<MfgActIF_Upd02_RsltR> src_MfgActIF_Upd02_Rslt) {
			MCList<MfgActIF_Upd02_RsltR> updL = MCList.create(MfgActIF_Upd02_RsltR.class);

			// ＩＦ更新区分：すべて登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				updL = src_MfgActIF_Upd02_Rslt;
			// ＩＦ更新区分：エラーを無視
			} else if (MAC_IF_UPD_TYP.isSKIP_ERROR(up0().if_upd_typ())) {
				updL = src_MfgActIF_Upd02_Rslt.subList(MfgActIF_Upd02_RsltR.$err_flg, false);
			// ＩＦ更新区分：エラー行まで登録
			} else if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
				for (MfgActIF_Upd02_RsltR rR : src_MfgActIF_Upd02_Rslt) {
					if (rR.err_flg()) {
						break;
					}

					updL.add(rR);
				}
			}

			super.up_MARU_upd03_1(dest0_1, updL);
		}
	}

	/**
	 * MfgActIF_Del02オペレーション.<p>
	 *
	 * 工数実績の取消を行う。<br>
	 */
	public class MfgActIF_Del02 extends MSBCL_MfgActRcptIFService_MC_A.MfgActIF_Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 取消前処理 
			editUp();

			// 業務チェック
			callWkActDelChk();
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwCanErr();
			}

			// 工数実績の取消
			delWkAct();
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			if (!up1().isEmpty() && isNull(up1().get(0).peg_no())) {
				setPegNo(MfgActIF_Upd02_RsltR.$peg_no, up1());
			}
			
			for (MfgActIF_Upd02_RsltR r : up1()) {
				r.setStatus(MCRow.Status.DELETE);
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callWkActDelChk() {
			mapUpContainers(MARC);
			chk05.exec();
			mapDownContainers(MARC);

			// チェックによりデータ補完結果を得る
			up1().setAll(down0());
			down0().clear();
		}

		/**
		 * 工数実績の取消処理を行う。
		 */
		protected void delWkAct() {
			mapUpContainers(MARD);
			del02.exec();
			mapDownContainers(MARD);
		}

		@Override
		protected void up_MARD_del02_1(MCList<MfgActReg_Chk04_RsltR> dest0_1,
				MCList<MfgActIF_Upd02_RsltR> src_MfgActIF_Del02_Rslt) {
			MCList<MfgActIF_Upd02_RsltR> delL = MCList.create(MfgActIF_Upd02_RsltR.class);

			// ＩＦ更新区分：すべて登録
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				delL = src_MfgActIF_Del02_Rslt;
			// ＩＦ更新区分：エラーを無視
			} else if (MAC_IF_UPD_TYP.isSKIP_ERROR(up0().if_upd_typ())) {
				delL = src_MfgActIF_Del02_Rslt.subList(MfgActIF_Upd02_RsltR.$err_flg, false);
			// ＩＦ更新区分：エラー行まで登録
			} else if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
				for (MfgActIF_Upd02_RsltR rR : src_MfgActIF_Del02_Rslt) {
					if (rR.err_flg()) {
						break;
					}

					delL.add(rR);
				}
			}

			super.up_MARD_del02_1(dest0_1, delL);
		}
	}
	/**
	 * MfgActIF_Upd03オペレーション.<p>
	 *
	 * 製造実績の一括登録・訂正処理<br>
	 */
	public class MfgActIF_Upd03 extends MSBCL_MfgActRcptIFService_MC_A.MfgActIF_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			updMfgAct();
		}

		/**
		 * 製造実績の一括登録・訂正処理を行う。
		 */
		protected void updMfgAct() {
			mapUpContainers(MARU);
			upd02.exec();
			mapDownContainers(MARU);
		}
	}

	/**
	 * MfgActIF_Upd04オペレーション.<p>
	 *
	 * 工程（製造）実績の完了処理を行う。<br>
	 */
	public class MfgActIF_Upd04 extends MSBCL_MfgActRcptIFService_MC_A.MfgActIF_Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			cmplOperAct();
		}

		/**
		 * 工程（製造）実績の完了処理を行う。
		 */
		protected void cmplOperAct() {
			mapUpContainers(MARU);
			upd04.exec();
			mapDownContainers(MARU);
		}
	}

	//FMCB CUSTOM END
}