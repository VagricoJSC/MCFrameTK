package mcframe.serverMSBB.MSBBL1250;

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
import mcframe.serverMSBB.MSBBL1250.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import static mcframe.serverMSBB.MSBBL1250.Query.*;
import mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR;
import mcframe.serverMSBB.MSBBL6230.MSBBL_DlvInstRcptService;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_DlvInstRcptListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_DlvInstRcptListReg_MC extends MSBBL_DlvInstRcptListReg_MC_A{
	//FMCB CUSTOM START
	protected boolean _addFlg = false;
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 納入指示受領可能な受注明細及び納入指示受領を検索する<br>
	 */
	public class Srch01 extends MSBBL_DlvInstRcptListReg_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUp();
			
			srch();
		}
		
		/**
		 * 上り電文の編集。
		 */
		protected void editUp() {
			// マスタ取得基準日
			up0().addDateColumn("today", getToday());
			if (!isSame(up0().not_edi_flg(), up0().edi_flg())) {
				
				up0().addStringColumn("edi_flg_str", MCBooleanUtil.booleanToDBString(up0().edi_flg()));
			}
		}
		
		/**
		 * 未受領の受注明細、受領済の納入指示を検索する。
		 */
		protected void srch() {
			
			if (up0().dlv_inst_rcpt_flg()) {
				MCQueryPlan sql = MSBBL1250_MST_DLV_INST_RCPT_S01();
				searchForDL(sql, up0(), down0());
			}
			if (doSrchSloD()) {
				MCQueryPlan sql = MSBBL1250_MST_SLO_D_S01();
				searchForDL(sql, up0(), down0());
			}
		}
		
		/**
		 * 未受領の受注明細を検索する判定する。
		 * @return 納入指示未受領がオン かつEDIがオンとオフ両方選択した かつ納入指示受領の条件が未指定の場合はtrue
		 */
		protected boolean doSrchSloD() {

			if (up0().dlv_inst_not_rcpt_flg() 
					&& isNullAnd(up0().dlv_inst_rcpt_dt_fr(),
							up0().dlv_inst_rcpt_dt_to(),
							up0().dlv_rqst_dt_fr(),
							up0().dlv_rqst_hm_fr(),
							up0().dlv_rqst_dt_to(),
							up0().dlv_rqst_hm_to(),
							up0().dlv_cd(),
							up0().dlv_nm(),
							up0().tdlv_cd(),
							up0().tdlv_nm(),
							up0().cst_dlv_inst_no(),
							up0().cst_dlv_inst_d_no(),
							up0().dlv_inst_rcpt_no(),
							up0().dlv_grp_cd1(),
							up0().dlv_grp_nm1(),
							up0().dlv_grp_cd2(),
							up0().dlv_grp_nm2(),
							up0().dlv_grp_cd3(),
							up0().dlv_grp_nm3(),
							up0().dlv_grp_cd4(),
							up0().dlv_grp_nm4(),
							up0().dlv_grp_cd5(),
							up0().dlv_grp_nm5(),
							up0().dlv_grp_cd6(),
							up0().dlv_grp_nm6(),
							up0().dlv_grp_cd7(),
							up0().dlv_grp_nm7(),
							up0().dlv_grp_cd8(),
							up0().dlv_grp_nm8(),
							up0().dlv_grp_cd9(),
							up0().dlv_grp_nm9(),
							up0().dlv_grp_cd10(),
							up0().dlv_grp_nm10(),
							up0().cst_dlv_inst_no(),
							up0().cst_dlv_inst_d_no(),
							up0().cst_dlv_inst_rmrks(),
							up0().cst_dlv_inst_d_rmrks(),
							up0().intr_rmrks(),
							up0().sub_char1(),
							up0().sub_char2(),
							up0().sub_char3(),
							up0().dlv_inst_rcpt_no())) {
				return true;
			}
			
			return false;
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			editList();
			
			setAllocStsTyp(down0());
		}
		
		/**
		 * 受注明細の検索結果を編集する。
		 */
		protected void editList() {
			
			if (isNull(down0())) {
				return;
			}
			iniItmUnitCache(down0());
			MCList<Srch01_RsltR> tmpRsltL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> sloDRsltL = MCList.create(Srch01_RsltR.class);
			crtShipPrWk(down0().distinctNE(Srch01_RsltR.$ship_pr_no).getStringNE(Srch01_RsltR.$ship_pr_no));
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchd();
			MCIndexKey idxPrkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			MCIndexKey idxSchdkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			
			for (Srch01_RsltR rsltR: down0()) {		
				if (!isNull(rsltR.dlv_inst_rcpt_no())) {
					MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(idxSchdkey, rsltR.dlv_inst_rcpt_no());
					rsltR.after_exec_flg(isAfterExec(rsltR, subShipSchdL));
					// 受領済
					tmpRsltL.add(rsltR);
				}
				else {
					// 未受領
					sloDRsltL.add(rsltR);
				}
			}
			
			for (Srch01_RsltR rsltR:  sloDRsltL) {
				MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(idxPrkey, rsltR.ship_pr_no());
				MCNumber notDlvInstRcptQty = getNotDlvInstRcptQty(rsltR, subShipSchdL);
				if (notDlvInstRcptQty.gt(MCNumber.ZERO)) {
					rsltR.base_unit_qty(notDlvInstRcptQty);
					
					MAVM_ITM_UNIT_R itmUnitR = getItmUnit(rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3(), rsltR.trd_unit_cd());
					MCNumber trdUnitQty = rvrsBaseUnitConv(
							notDlvInstRcptQty, itmUnitR.conv_base_qty(),
							itmUnitR.conv_qty(), itmUnitR.dec_place(),
							itmUnitR.rnd_typ(), false);
					if (!isNull(trdUnitQty)) {
						rsltR.trd_unit_qty(trdUnitQty);
					}
					else {
						rsltR.trd_unit_qty(notDlvInstRcptQty);
					}
					tmpRsltL.add(rsltR);
				}
			}
			
			down0().clear();
			down0().addAll(tmpRsltL);
		}
		
		/**
		 * 納入指示受領可能か判定する。
		 * @param rsltR 検索結果の受注明細情報
		 * @param shipSchdL 受注明細に紐づく出荷予定
		 * @return 納入指示受領可能の場合はtrue
		 */
		protected  MCNumber getNotDlvInstRcptQty(Srch01_RsltR rsltR, MCList<MST_SHIP_SCHD_R> shipSchdL) {
			
			MCNumber dlvInstRcptQty = MCNumber.ZERO;
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(rsltR.proc_typ())) {
				dlvInstRcptQty = dlvInstRcptQty.add(rsltR.dlv_inst_rcpt_qty());
			}
			else {
				for (MST_SHIP_SCHD_R shipSchdR : shipSchdL) {
					// 納入指示受領不可の出荷予定：	
					// ①確定ＦＬＧがオン	
					// ②打切ＦＬＧがオン	
					// ③納入指示受領ＮＯが設定されている	
					// ④出荷指図数量 > 0	
					// ⑤出荷実績数量 > 0	
					// ⑥インボイス出荷予定数量 > 0	
					if (shipSchdR.fix_flg() 
							|| shipSchdR.abort_flg()
							|| !isNull(shipSchdR.dlv_inst_rcpt_no())
							|| shipSchdR.ship_inst_qty().isPositive()
							|| shipSchdR.ship_act_qty().isPositive()
							|| shipSchdR.iv_schd_qty().isPositive()) {
						dlvInstRcptQty = dlvInstRcptQty.add(shipSchdR.base_unit_qty());
					}
				}
			}
			
			return rsltR.base_unit_qty().subtract(dlvInstRcptQty);
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			sort();
		}
		
		/**
		 * 検索結果をソートする。
		 */
		protected void sort() {
			
			MCSortPolicy sortPolicy = new MCSortPolicy();

			sortPolicy.add(SortType.ASC, Srch01_RsltR.$slo_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$slo_d_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$dlv_rqst_dt);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$dlv_rqst_hm);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$dlv_inst_rcpt_no);

			down0().sort(sortPolicy);
		}
		/** 品目単位マスタのキャッシュ */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit = null;
		protected void iniItmUnitCache(MCList<Srch01_RsltR> rsltL) {
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
					rsltL, Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3, Srch01_RsltR.$trd_unit_cd);
		}
		
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
	}
	
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 納入指示受領を検索する<br>
	 */
	public class Srch02 extends MSBBL_DlvInstRcptListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUp();
			
			MCQueryPlan sql = MSBBL1250_MST_DLV_INST_RCPT_S01();
			
			searchForDL(sql, up0(), down0());
		}
		
		protected void editUp() {
			// マスタ取得基準日
			up0().addDateColumn("today", getToday());
			if (!isSame(up0().not_edi_flg(), up0().edi_flg())) {
				
				up0().addStringColumn("edi_flg_str", MCBooleanUtil.booleanToDBString(up0().edi_flg()));
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			setAllocStsTyp(down0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納入指示受領情報を更新する<br>
	 */
	public class Upd01 extends MSBBL_DlvInstRcptListReg_MC_A.Upd01 {
		
		/**
		 * 納入指示受領サービスの更新前チェックオペレーション
		 */
		protected MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 _chkOpe = null;
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccessUpd(up0());
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleExUpd(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callDlvInstRcptChkSrv();
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			callDlvInstRcptUpdSrv();
			
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 上り電文の編集。
		 */
		protected void editUp() {
			
			setPegNo(up0());
		}
		
		/**
		 * 納入指示受領サービスの更新前チェック処理を呼び出す。
		 */
		protected void callDlvInstRcptChkSrv() {

			_chkOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Chk01();
			
			addAll(_chkOpe.up0(), up0(), createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR());
			
			addDlvInstRcpt();
			
			_chkOpe.exec();
			
			if (!_chkOpe.down0().isEmpty()) {
				// 明細に１件でもエラーが存在した場合、同一ヘッダのレコードは全てエラーとする
				MCList<DlvInstRcv_Upd01_DtlR>[] grpL =  _chkOpe.down0().groupList(DlvInstRcv_Upd01_DtlR.$slo_no);
				for (MCList<DlvInstRcv_Upd01_DtlR> l : grpL) {
					boolean err_flg = !isNull(l.getFirst(DlvInstRcv_Upd01_DtlR.$err_flg, true));
					
					l.setBooleanNE(DlvInstRcv_Upd01_DtlR.$err_flg, err_flg);
				}
				
				copyErrFlg(up0(), _chkOpe.down0());
			}
		}
		
		/**
		 * 同一受注明細NOで上り電文にわたってない納入指示受領を追加する。
		 */
		protected void addDlvInstRcpt() {

			MCList<Chk01_DtlR> dlvInstRcptL  = getDlvInstRcptExceptUpL(up0());
			_addFlg = true;
			
			addAll(_chkOpe.up0(), dlvInstRcptL, createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR());
		}
		
		/**
		 * 納入指示受領サービスの更新処理を呼び出す。
		 */
		protected void callDlvInstRcptUpdSrv() {
			
			MCList<DlvInstRcv_Upd01_DtlR> tgtL = MCList.create(DlvInstRcv_Upd01_DtlR.class);
			
			 // 受注NO単位で納入指示受領を更新する（納入指示受領を更新する際に、受注ヘッダの更新カウンターを更新するため）。
			for (MCList<DlvInstRcv_Upd01_DtlR> grpL : _chkOpe.down0().groupList(DlvInstRcv_Upd01_DtlR.$slo_no)) {
				MCList<DlvInstRcv_Upd01_DtlR> subL = grpL.subList(DlvInstRcv_Upd01_DtlR.$err_flg, true);
				if (subL.isEmpty()) {
					tgtL.addAll(grpL);
				}
			}
			
			if (!tgtL.isEmpty()) {
				MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 updOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Upd01();
				updOpe.up0().setAll(tgtL);

				updOpe.exec();
				
				if (!updOpe.down0().isEmpty()) {
					String[] srcCols = {DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no, DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_rev};
					String[] destCols = {Chk01_DtlR.$dlv_inst_rcpt_no, Chk01_DtlR.$dlv_inst_rcpt_rev};
					copyByPegNo(up0(), destCols, updOpe.down0(), srcCols);
					
					// メッセージ編集
					MCMessageList msgL = MCMessagePool.getMessageList();
					MCMessageList removeMsgl = new MCMessageList();
					MCMessageList addMsgl = new MCMessageList();
					boolean exitFlg = false;
					
					for (Chk01_DtlR r : up0()) {
						// 退避していたメッセージを格納
						for(MCMessage msg : msgL) {
							MCRow causerow = msg.getCauseRow();
							
							if (isSame(msg.getID(), MSBEL0162) || isSame(msg.getID(), MSBEL0163)) {
								removeMsgl.add(msg);
								
								if(!exitFlg) {
									if(isSame(causerow.getParamRowIndex(), r.getParamRowIndex())) {
										addMsgl.add(msg);
										exitFlg = true;
									}
								}
							}
						}
					}
					
					MCMessagePool.removeAll(removeMsgl);
					MCMessagePool.addAll(addMsgl);
				}
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 納入指示受領情報を取り消す<br>
	 */
	public class Del01 extends MSBBL_DlvInstRcptListReg_MC_A.Del01 {
		
		/**
		 * 納入指示受領サービスの更新前チェックオペレーション
		 */
		protected MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 _chkOpe = null;
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccessUpd(up0());
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleExUpd(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callDlvInstRcptChkSrv();
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			callDlvInstRcptUpdSrv();
			
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 上り電文の編集。
		 */
		protected void editUp() {
			
			setPegNo(up0());
			up0().setValueNE(Chk01_DtlR.$del_flg, true);
		}
		
		/**
		 * 納入指示受領サービスの更新前チェック処理を呼び出す。
		 */
		protected void callDlvInstRcptChkSrv() {

			_chkOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Chk01();
			
			addAll(_chkOpe.up0(), up0(), createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR());
			
			addDlvInstRcpt();
			
			_chkOpe.exec();
			
			if (!_chkOpe.down0().isEmpty()) {
				copyErrFlg(up0(), _chkOpe.down0());
			}
		}
		
		/**
		 * 同一受注明細NOで上り電文にわたってない納入指示受領を追加する。
		 */
		protected void addDlvInstRcpt() {

			MCList<Chk01_DtlR> dlvInstRcptL  = getDlvInstRcptExceptUpL(up0());
			_addFlg = true;
			
			addAll(_chkOpe.up0(), dlvInstRcptL, createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR());
		}
		
		/**
		 * 納入指示受領サービスの更新処理を呼び出す。
		 */
		protected void callDlvInstRcptUpdSrv() {
			
			MCList<DlvInstRcv_Upd01_DtlR> notErrL = _chkOpe.down0().subList(DlvInstRcv_Upd01_DtlR.$err_flg, false);
			
			if (!notErrL.isEmpty()) {
				MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 updOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Upd01();
				updOpe.up0().setAll(notErrL);

				updOpe.exec();
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * ファイル入力前のチェック処理を行う<br>
	 */
	public class Chk01 extends MSBBL_DlvInstRcptListReg_MC_A.Chk01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callDlvInstRcptChkSrv();
			}
			
			setErrToRtnStsTyp();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chkReq(up0()));
			
			msgL.addAll(chkSloDNo(up0()));
			
			msgL.addAll(super.doServerCheck());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			msgL.addAll(chkDlv(up0()));
			
			msgL.addAll(chkTdlv(up0()));
			
			compl(up0());
			
			return msgL;
		}
		
		protected MCMessageList chkReq(MCList<Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_DtlR dtlR : dtlL)  {
				
				if (isNull(dtlR.slo_d_no()) && isNullOr(dtlR.cst_cd(), dtlR.cst_po_no())) {
					msgL.add(new MCMessage(dtlR, Chk01_DtlR.$slo_d_no, MSBBL0601, toDispGUIIndex(dtlR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 得意先注文NOと得意先注文明細NOを元に、受注明細NOを補完する。
		 */
		protected MCMessageList chkSloDNo(MCList<Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_DtlR> noErrList = getChkList(up0());
			
			if (!noErrList.isEmpty()) {
				
				MCList<Chk01_DtlR> sloDL = getSloDNo(noErrList);
				MCIndexKey sloDIdxkey = sloDL.createIndex(Chk01_DtlR.$slo_d_no);
				MCIndexKey cstPoIdxkey = sloDL.createIndex(
						Chk01_DtlR.$cst_cd, Chk01_DtlR.$cst_po_no,  Chk01_DtlR.$cst_po_d_no);
				
				Comparable<?>[] vals = null;
				Chk01_DtlR sloDR = null;
				
				for (Chk01_DtlR dtlR : noErrList) {
					
					if (!isNull(dtlR.slo_d_no())) {
						vals = new Comparable[] {dtlR.slo_d_no()};
						
						sloDR= sloDL.getFirst(sloDIdxkey, vals);
					}
					else {
						vals = new Comparable[] {
								dtlR.cst_cd(),
								dtlR.cst_po_no(),
								dtlR.cst_po_d_no()
						};
						
						sloDR= sloDL.getFirst(cstPoIdxkey, vals);
					}
					
					if (isNull(sloDR)) {
						String causeCol = isNull(dtlR.slo_d_no()) ? Chk01_DtlR.$cst_po_no : Chk01_DtlR.$slo_d_no;
						msgL.add(new MCMessage(dtlR, causeCol, MSBBL0602,
								dtlR.slo_d_no(), dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no()));
					}
					else if (isNull(dtlR.slo_d_no())) {
						dtlR.slo_d_no(sloDR.slo_d_no());
					}
					
					if (!isNull(sloDR)) {
						dtlR.slo_dt(sloDR.slo_dt());
						dtlR.cst_cd(sloDR.cst_cd());
						dtlR.ship_pr_no(sloDR.ship_pr_no());
						dtlR.sls_cststk_flg(sloDR.sls_cststk_flg());
						dtlR.ship_inst_typ(sloDR.ship_inst_typ());
						dtlR.slo_via_dlv_typ(sloDR.slo_via_dlv_typ());
					}
					
					if (!MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
						
						msgL.addAll(check(dtlR, Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
						msgL.addAll(check(dtlR, Chk01_DtlR.$dlv_rqst_tm, new FXUCL_RequiredValidater()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 受注明細NO情報を取得する。
		 * @param bindL 得意先注文NOと得意先注文明細NOを格納するリスト
		 * @return 受注明細NO情報
		 */
		protected MCList<Chk01_DtlR> getSloDNo(MCList<Chk01_DtlR> bindL) {
			
			MCList<Chk01_DtlR> rsltL = MCList.create(Chk01_DtlR.class);
			
			executeQuery(rsltL, MSBBL1250_MST_SLO_D_S02(), 
					bindL.distinctNE(Chk01_DtlR.$slo_d_no, Chk01_DtlR.$cst_cd, Chk01_DtlR.$cst_po_no, Chk01_DtlR.$cst_po_d_no));
			
			return rsltL;
		}
		
		/**
		 * 納品先に関連するチェック処理を行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDlv(MCList<Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
					
					continue;
				}
				
				setDlv(dtlR);
				
				if (dtlR.dlv_sundry_flg() && isNull(dtlR.dlv_nm())) {
					
					msgL.add(new MCMessage(dtlR, null, MSBBL0149, toDispGUIIndex(dtlR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 配送先に関連するチェック処理を行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTdlv(MCList<Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
					
					continue;
				}
				
				setTdlv(dtlR);
				
				if (dtlR.tdlv_sundry_flg() && isNull(dtlR.tdlv_nm())) {
					
					msgL.add(new MCMessage(dtlR, null, MSBBL0152, toDispGUIIndex(dtlR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納品先に関連する項目を設定する。
		 * @param dtlR 納入指示CSVファイル
		 */
		protected void setDlv(Chk01_DtlR dtlR) {
			
			if (!dtlR.dlv_sundry_flg()) {
				
				dtlR.dlv_nm(dtlR.mst_dlv_nm());
				dtlR.dlv_lg_grp_cd(dtlR.mst_dlv_lg_grp_cd());
				dtlR.dlv_cntct_dpt(dtlR.mst_dlv_cntct_dpt());
				dtlR.dlv_cntct_psn(dtlR.mst_dlv_cntct_psn());
				dtlR.dlv_zip_cd(dtlR.mst_dlv_zip_cd());
				dtlR.dlv_addr1(dtlR.mst_dlv_addr1());
				dtlR.dlv_addr2(dtlR.mst_dlv_addr2());
				dtlR.dlv_addr3(dtlR.mst_dlv_addr3());
				dtlR.dlv_addr4(dtlR.mst_dlv_addr4());
				dtlR.dlv_tel(dtlR.mst_dlv_tel());
				dtlR.dlv_fax(dtlR.mst_dlv_fax());
			}
			else {
				if (isNull(dtlR.dlv_lg_grp_cd())) {
					dtlR.dlv_lg_grp_cd(dtlR.mst_dlv_lg_grp_cd());
				}
			}
			
			if (!isNull(dtlR.dlv_lg_grp_cd())) {
				MAM_LG_GRP_R lgGrpR = getLgGrp(dtlR.dlv_lg_grp_cd());
				dtlR.dlv_lg_grp_nm(lgGrpR.lg_grp_nm());
			}
			
			if (!isNull(dtlR.dlv_cntry_cd())) {
				MAM_CNTRY_R cntryR = getCntryR(dtlR.dlv_cntry_cd());
				dtlR.dlv_cntry_nm(cntryR.cntry_nm());
			}
		}
		
		/**
		 * 納入指示明細の配送先を保持する。
		 * @param dtlR 納入指示CSVファイル
		 */
		protected void setTdlv(Chk01_DtlR dtlR) {
			
			if (!dtlR.tdlv_sundry_flg()) {
				
				dtlR.tdlv_nm(dtlR.mst_tdlv_nm());
				dtlR.tdlv_lg_grp_cd(dtlR.mst_tdlv_lg_grp_cd());
				dtlR.tdlv_cntct_dpt(dtlR.mst_tdlv_cntct_dpt());
				dtlR.tdlv_cntct_psn(dtlR.mst_tdlv_cntct_psn());
				dtlR.tdlv_zip_cd(dtlR.mst_tdlv_zip_cd());
				dtlR.tdlv_addr1(dtlR.mst_tdlv_addr1());
				dtlR.tdlv_addr2(dtlR.mst_tdlv_addr2());
				dtlR.tdlv_addr3(dtlR.mst_tdlv_addr3());
				dtlR.tdlv_addr4(dtlR.mst_tdlv_addr4());
				dtlR.tdlv_tel(dtlR.mst_tdlv_tel());
				dtlR.tdlv_fax(dtlR.mst_tdlv_fax());
			}
			
			if (isNull(dtlR.tdlv_lg_grp_cd())) {
				dtlR.tdlv_lg_grp_cd(dtlR.mst_tdlv_lg_grp_cd());
			}
			
			if (!isNull(dtlR.tdlv_lg_grp_cd())) {
				MAM_LG_GRP_R lgGrpR = getLgGrp(dtlR.tdlv_lg_grp_cd());
				dtlR.tdlv_lg_grp_nm(lgGrpR.lg_grp_nm());
			}
			if (!isNull(dtlR.tdlv_cntry_cd())) {
				MAM_CNTRY_R cntryR = getCntryR(dtlR.tdlv_cntry_cd());
				dtlR.tdlv_cntry_nm(cntryR.cntry_nm());
			}
			
			if (isNull(dtlR.tdlv_cd())) {
				
				dtlR.via_dlv_typ(null);
			}
			else {
				if( !dtlR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					
					dtlR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
				}
			}
		}
		
		/**
		 * 納入指示CSVファイルの補完を行う。
		 */
		protected void compl(MCList<Chk01_DtlR> dtlL) {
			
			crtWk(dtlL);
			compSlo(dtlL);
			setAfterExecFlg(dtlL);
			setAllocStsTyp(dtlL);
			setPriPrntFlg(dtlL);
			setDlvDayWeekTyp(dtlL);
			clear(dtlL);
		}
		
		/**
		 * 検索に必要なワークテーブルを作成する。
		 * @param dtlL 上り電文（エラーなし）
		 */
		protected void crtWk(MCList<Chk01_DtlR> dtlL) {
			
			crtSloDWk(dtlL.distinctNE(Chk01_DtlR.$slo_d_no).getStringNE(Chk01_DtlR.$slo_d_no));
			crtShipPrWk(dtlL.distinctNE(Chk01_DtlR.$ship_pr_no).getStringNE(Chk01_DtlR.$ship_pr_no));
		}
		
		/**
		 * 受注情報を補完する。
		 * @param dtlL 上り電文（エラーなし）
		 */
		protected void compSlo(MCList<Chk01_DtlR> dtlL) {
			
			MCList<Chk01_DtlR> sloDL = getSloDL();
			
			MCIndexKey sloDIdxkey = up0().createIndex(Chk01_DtlR.$slo_d_no);
			
			for (Chk01_DtlR sloDR : sloDL) {
				
				MCList<Chk01_DtlR> subL = up0().subList(sloDIdxkey, sloDR.slo_d_no());
				
				for (String col : getCols()) {
					subL.setValueNE(col, sloDR.getValueNE(col));
				}
			}
		}
		/**
		 * 後続処理実行を設定する。
		 * @param dtlL 上り電文（エラーなし）
		 */
		protected void setAfterExecFlg(MCList<Chk01_DtlR> dtlL) {
			
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchd();
			MCIndexKey idxSchdkey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (isNull(dtlR.dlv_inst_rcpt_no())) {
					continue;
				}
				
				MCList<MST_SHIP_SCHD_R> subShipSchdL = shipSchdL.subList(idxSchdkey, dtlR.dlv_inst_rcpt_no());
				dtlR.after_exec_flg(isAfterExec(dtlR, subShipSchdL));
			}
		}
		
		/**
		 * 引当状況区分を設定する。
		 * @param dtlL 上り電文（エラーなし）
		 */
		protected void setAllocStsTyp(MCList<Chk01_DtlR> dtlL) {

			MCList<Chk01_DtlR> rsltL = MCList.create(Chk01_DtlR.class);
			executeQuery(rsltL, MSBBL1250_MST_SHIP_SCHD_S01());
			
			MCIndexKey idxkey = rsltL.createIndex(Chk01_DtlR.$slo_d_no);
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (isNull(dtlR.slo_d_no())) {
					continue;
				}
				
				Chk01_DtlR rsltR = rsltL.getFirst(idxkey, dtlR.slo_d_no());
				
				MCNumber allocQty = MCNumber.ZERO;
				if (!isNull(rsltR)) {
					
					allocQty = nvl(rsltR.alloc_qty(), MCNumber.ZERO);
				}
				
				dtlR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp(
						dtlR.alloc_typ(),
						dtlR.ship_pr_base_unit_qty(),
						allocQty,
						dtlR.ship_schd_abort_qty(),
						dtlR.slo_d_can_flg()));
			}
		}
		
		/**
		 * 補完対象の項目を返す。
		 * @return 補完対象の項目
		 */
		protected String[] getCols() {
			return new String[]  {
					Chk01_DtlR.$slo_no,
					Chk01_DtlR.$sls_sts_typ,
					Chk01_DtlR.$slo_dt,
					Chk01_DtlR.$cst_cd,
					Chk01_DtlR.$cst_nm,
					Chk01_DtlR.$sls_usr_cd,
					Chk01_DtlR.$sls_usr_nm,
					Chk01_DtlR.$sls_dpt_cd,
					Chk01_DtlR.$sls_dpt_nm,
					Chk01_DtlR.$assort_typ,
					Chk01_DtlR.$cst_po_no,
					Chk01_DtlR.$cst_po_rev,
					Chk01_DtlR.$cst_po_d_no,
					Chk01_DtlR.$itm_cd,
					Chk01_DtlR.$itm_sub1,
					Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3,
					Chk01_DtlR.$itm_nm,
					Chk01_DtlR.$sundry_itm_flg,
					Chk01_DtlR.$slo_qty,
					Chk01_DtlR.$set_itm_grp_no,
					Chk01_DtlR.$ship_schd_dt,
					Chk01_DtlR.$ship_schd_hm,
					Chk01_DtlR.$dlv_schd_dt,
					Chk01_DtlR.$dlv_schd_hm,
					Chk01_DtlR.$trd_unit_cd,
					Chk01_DtlR.$trd_unit_nm,
					Chk01_DtlR.$trd_unit_dec_place,
					Chk01_DtlR.$trd_unit_conv_base_qty,
					Chk01_DtlR.$trd_unit_conv_qty,
					Chk01_DtlR.$base_unit_cd,
					Chk01_DtlR.$base_unit_nm,
					Chk01_DtlR.$base_unit_dec_place,
					Chk01_DtlR.$base_unit_rnd_typ,
					Chk01_DtlR.$ship_pr_no,
					Chk01_DtlR.$ship_pr_upd_cntr,
					Chk01_DtlR.$slo_upd_cntr,
					Chk01_DtlR.$trd_ptn_typ,
					Chk01_DtlR.$vmi_flg,
					Chk01_DtlR.$cst_iv_flg,
					Chk01_DtlR.$proc_typ,
					Chk01_DtlR.$slo_tdlv_cd,
					Chk01_DtlR.$slo_via_dlv_typ,
					Chk01_DtlR.$alloc_typ,
					Chk01_DtlR.$ship_pr_base_unit_qty,
					Chk01_DtlR.$ship_schd_abort_qty,
					Chk01_DtlR.$slo_d_can_flg
			};
		}
		
		/**
		 * 受注情報を取得する。
		 * @return 受注情報
		 */
		protected MCList<Chk01_DtlR> getSloDL() {
			
			MCList<Chk01_DtlR> rsltL = MCList.create(Chk01_DtlR.class);
			
			executeQuery(rsltL, MSBBL1250_MST_SLO_D_S03());
			
			return rsltL;
		}
		
		/**
		 * 価格印字を設定する。
		 * @param dtlR 納入指示受信ＩＦ
		 */
		protected void setPriPrntFlg(MCList<Chk01_DtlR> dtlL) {
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (isNull(dtlR.dlv_cd()) || MAC_TRD_PTN_TYP.isSHIP(dtlR.trd_ptn_typ()) || dtlR.vmi_flg()) {
					
					dtlR.pri_prnt_flg(false);
				}
			}
		}
		
		/**
		 * 着曜日を設定する。
		 * @param dtlR 納入指示CSVファイル
		 */
		protected void setDlvDayWeekTyp(MCList<Chk01_DtlR> dtlL) {
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) || MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ()) 
						|| (isNull(dtlR.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(dtlR.slo_via_dlv_typ()))) {
					
					dtlR.dlv_day_week_typ(null);
				}
			}
		}
		
		/**
		 * 出荷品揃区分：品揃するまたは品揃グループＮＯが設定されている場合、設定不要の項目をクリアする。
		 * 出荷指図区分：ピッキングなしの場合、設定不要の項目をクリアする。
		 * @param dtlR 納入指示CSVファイル
		 */
		protected void clear(MCList<Chk01_DtlR> dtlL) {
			
			for (Chk01_DtlR dtlR : dtlL) {
				
				if (MSC_SHIP_ASSORT_TYP.isAST(dtlR.assort_typ())
						|| !isNull(dtlR.set_itm_grp_no())) {
					
					dtlR.dlv_cd(null);
					dtlR.dlv_nm(null);
					dtlR.dlv_cntry_cd(null);
					dtlR.dlv_cntry_nm(null);
					dtlR.pri_prnt_flg(false);
					dtlR.dlv_sundry_flg(false);
					dtlR.dlv_lg_grp_cd(null);
					dtlR.dlv_lg_grp_nm(null);
					dtlR.dlv_zip_cd(null);
					dtlR.dlv_addr1(null);
					dtlR.dlv_addr2(null);
					dtlR.dlv_addr3(null);
					dtlR.dlv_addr4(null);
					dtlR.dlv_tel(null);
					dtlR.dlv_fax(null);
					dtlR.dlv_cntct_dpt(null);
					dtlR.dlv_cntct_psn(null);
					dtlR.tdlv_cd(null);
					dtlR.tdlv_nm(null);
					dtlR.tdlv_cntry_cd(null);
					dtlR.tdlv_cntry_nm(null);
					dtlR.tdlv_sundry_flg(false);
					dtlR.tdlv_lg_grp_cd(null);
					dtlR.tdlv_lg_grp_nm(null);
					dtlR.tdlv_zip_cd(null);
					dtlR.tdlv_addr1(null);
					dtlR.tdlv_addr2(null);
					dtlR.tdlv_addr3(null);
					dtlR.tdlv_addr4(null);
					dtlR.tdlv_tel(null);
					dtlR.tdlv_fax(null);
					dtlR.tdlv_cntct_dpt(null);
					dtlR.tdlv_cntct_psn(null);
					dtlR.via_dlv_typ(null);
					dtlR.dlv_day_week_typ(null);
				}
				
				if (MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())) {
					
					dtlR.cst_dlv_inst_no(null);
					dtlR.cst_dlv_inst_rev(null);
					dtlR.cst_dlv_inst_d_no(null);
					dtlR.dlv_rqst_tm(null);
					dtlR.cst_dlv_inst_rmrks(null);
					dtlR.cst_dlv_inst_d_rmrks(null);
					dtlR.trd_unit_qty(null);
					dtlR.intr_rmrks(null);
					dtlR.dlv_cd(null);
					dtlR.dlv_nm(null);
					dtlR.dlv_cntry_cd(null);
					dtlR.dlv_cntry_nm(null);
					dtlR.pri_prnt_flg(false);
					dtlR.dlv_sundry_flg(false);
					dtlR.dlv_lg_grp_cd(null);
					dtlR.dlv_lg_grp_nm(null);
					dtlR.dlv_zip_cd(null);
					dtlR.dlv_addr1(null);
					dtlR.dlv_addr2(null);
					dtlR.dlv_addr3(null);
					dtlR.dlv_addr4(null);
					dtlR.dlv_tel(null);
					dtlR.dlv_fax(null);
					dtlR.dlv_cntct_dpt(null);
					dtlR.dlv_cntct_psn(null);
					dtlR.tdlv_cd(null);
					dtlR.tdlv_nm(null);
					dtlR.tdlv_cntry_cd(null);
					dtlR.tdlv_cntry_nm(null);
					dtlR.tdlv_sundry_flg(false);
					dtlR.tdlv_lg_grp_cd(null);
					dtlR.tdlv_lg_grp_nm(null);
					dtlR.tdlv_zip_cd(null);
					dtlR.tdlv_addr1(null);
					dtlR.tdlv_addr2(null);
					dtlR.tdlv_addr3(null);
					dtlR.tdlv_addr4(null);
					dtlR.tdlv_tel(null);
					dtlR.tdlv_fax(null);
					dtlR.tdlv_cntct_dpt(null);
					dtlR.tdlv_cntct_psn(null);
					dtlR.via_dlv_typ(null);
					dtlR.dlv_day_week_typ(null);
					dtlR.sub_char1(null);
					dtlR.sub_char2(null);
					dtlR.sub_char3(null);
				}
			}
		}
		
		/**
		 * 納入指示受領サービスの更新前チェック処理を呼び出す。
		 */
		protected void callDlvInstRcptChkSrv() {

			MCList<Chk01_DtlR> upL = up0().subList(r -> !MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ()));
			MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 chkOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Chk01();
			
			addAll(chkOpe.up0(), upL, createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR());
			
			addDlvInstRcpt(chkOpe.up0());
			
			chkOpe.exec();
			
			if (!chkOpe.down0().isEmpty()) {
				copyErrFlg(up0(), chkOpe.down0());
				copyByPegNo(up0(), new String[] { Chk01_DtlR.$base_unit_qty }, chkOpe.down0(), new String[] { DlvInstRcv_Upd01_DtlR.$base_unit_qty });
			}
		}
		
		/**
		 * 同一受注明細NOで上り電文にわたってない納入指示受領を追加する。
		 * @param upL
		 */
		protected void addDlvInstRcpt(MCList<DlvInstRcv_Upd01_DtlR> upL) {

			MCList<Chk01_DtlR> dlvInstRcptL  = getDlvInstRcptExceptUpL(up0());
			
			addAll(upL, dlvInstRcptL, createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR());
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/** 物流グループマスタ取得 */
		protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _lgGrpR;
		protected MAM_LG_GRP_R getLgGrp(String lgGrpCd) {
			if (_lgGrpR == null) {
				_lgGrpR = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(MCQueryApiBuilder.create(MAM_LG_GRP_R.create("T")));
			}
			return _lgGrpR.get(lgGrpCd);
		}
		
		/** 国マスタ取得 */
		protected FXUCL_MCDbcCache<MAM_CNTRY_R> _cntryCache = null;
		protected MAM_CNTRY_R getCntryR(String cntryCd){
			if (_cntryCache == null) {
				_cntryCache = new FXUCL_MCDbcCache<MAM_CNTRY_R>(MCQueryApiBuilder.create(MAM_CNTRY_R.create("T")));
			}
			
			return _cntryCache.get(cntryCd);
		}
	}
	
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ納入指示受領情報情報をチェックする。<br>
	 */
	public class Imp01 extends MSBBL_DlvInstRcptListReg_MC_A.Imp01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			callThisChk01();
			
			compl();
			
			setDown();
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
			List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
			MCList<Chk01_DtlR>[] grpL = list.groupList(getSplitColumn());
			MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
			for (MCList<Chk01_DtlR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_DtlR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
		
		protected String[] getSplitColumn(){
			return new String[]{
				Chk01_DtlR.$cst_cd
			};
		}
		
		/**
		 * 上り電文の編集。
		 */
		protected void editUp() {
			
			setPegNo(up0());
		}
		
		/**
		 * ファイル入力前チェックを実行する。
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
			up0().setAll(chk01_down0);
		}
		
		/**
		 * 補完処理。
		 */
		protected void compl() {
			
			setDlvRqstDtHm(up0());
		}
		
		/**
		 * 納入希望日と納入希望時刻を設定する。
		 * @param dtlL 上り電文（エラーなし）
		 */
		protected void setDlvRqstDtHm(MCList<Chk01_DtlR> dtlL) {
			
			up0().forEach(r->{
				if (!isNull(r.dlv_rqst_tm())) {
					r.dlv_rqst_dt(r.dlv_rqst_tm().startTimeOfDay());
					if (!isSame(r.dlv_rqst_tm(), r.dlv_rqst_dt())) {
						r.dlv_rqst_hm(r.dlv_rqst_tm());
					}
				}
			});
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			putNames();
			
			down0().setAll(up0());
		}
		
		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			
			MSC_SLS_STS_TYP.putNameNE(up0(), Chk01_DtlR.$sls_sts_typ, Chk01_DtlR.$sls_sts_typ_nm, getUsrLocale());
			MSC_ALLOC_STS_TYP.putNameNE(up0(), Chk01_DtlR.$alloc_sts_typ, Chk01_DtlR.$alloc_sts_typ_nm, getUsrLocale());
			MSC_SHIP_ASSORT_TYP.putNameNE(up0(), Chk01_DtlR.$assort_typ, Chk01_DtlR.$assort_typ_nm, getUsrLocale());
			MAC_VIA_DLV_TYP.putNameNE(up0(), Chk01_DtlR.$via_dlv_typ, Chk01_DtlR.$via_dlv_typ_nm, getUsrLocale());
			MAC_DAY_WEEK_TYP.putNameNE(up0(), Chk01_DtlR.$dlv_day_week_typ, Chk01_DtlR.$dlv_day_week_typ_nm, getUsrLocale());
		}
	}
	
	/**
	 * 同一処理単位で分割する(更新、削除用)。
	 * @param list 上り電文のリスト
	 * @param max １スレッドあたりの処理数
	 * @return 分割した電文
	 */
	protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
		List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
		MCList<Chk01_DtlR>[] grpL = list.groupList(getSplitColumn());
		MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
		for (MCList<Chk01_DtlR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_DtlR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	/**
	 * 電文分割のカラムを返す。
	 */
	protected String[] getSplitColumn(){
		return new String[]{ 
			Chk01_DtlR.$cst_cd
		};
	}
	
	/**
	 * 引当状況区分を設定する。
	 * @param rsltL 検索結果
	 */
	protected void setAllocStsTyp(MCList<Srch01_RsltR> rsltL) {
		
		crtSloDWk(rsltL.distinctNE(Srch01_RsltR.$slo_d_no).getStringNE(Srch01_RsltR.$slo_d_no));

		MCList<Srch01_RsltR> shipSchdL = MCList.create(Srch01_RsltR.class);
		executeQuery(shipSchdL, MSBBL1250_MST_SHIP_SCHD_S01());
		
		MCIndexKey idxkey = shipSchdL.createIndex(Srch01_RsltR.$slo_d_no);
		
		for (Srch01_RsltR rsltR : rsltL) {
			
			Srch01_RsltR shipSchdR = shipSchdL.getFirst(idxkey, rsltR.slo_d_no());
			
			MCNumber allocQty = MCNumber.ZERO;
			if (!isNull(shipSchdR)) {
				
				allocQty = nvl(shipSchdR.alloc_qty(), MCNumber.ZERO);
			}
			
			rsltR.alloc_sts_typ(MSUCL_SlsUtil.getAllocStsTyp(
					rsltR.alloc_typ(),
					rsltR.ship_pr_base_unit_qty(),
					allocQty,
					rsltR.ship_schd_abort_qty(),
					rsltR.slo_d_can_flg()));
		}
	}
	
	/**
	 * 同一受注明細NOで上り電文にわたってない納入指示受領を取得する。
	 * @param dtlL  上り電文の納入指示受領リスト
	 * @return  同一受注明細NOの納入指示受領リスト（上り電文の納入指示受領を除外）
	 */
	protected MCList<Chk01_DtlR> getDlvInstRcptExceptUpL(MCList<Chk01_DtlR> dtlL) {
		
		crtWk(dtlL);
		
		MCList<Chk01_DtlR> dlvInstRcptL = MCList.create(Chk01_DtlR.class);
		executeQuery(dlvInstRcptL, MSBBL1250_MST_DLV_INST_RCPT_S02());
		
		if (!dlvInstRcptL.isEmpty()) {
			
			int i = ((MCNumber)dtlL.max(Chk01_DtlR.$peg_no)).intValue();
			for (Chk01_DtlR dlvInstRcptR : dlvInstRcptL) {
				
				Chk01_DtlR upR = dtlL.getFirst(Chk01_DtlR.$slo_d_no, dlvInstRcptR.slo_d_no());
				
				dlvInstRcptR.ship_pr_upd_cntr(upR.ship_pr_upd_cntr());
				dlvInstRcptR.slo_upd_cntr(upR.slo_upd_cntr());
				dlvInstRcptR.peg_no(++i);
			}
		}
		
		return dlvInstRcptL;
	}
	
	/**
	 * 検索に必要なワークテーブルを作成する。
	 * @param dtlL 納入指示受領リスト
	 */
	protected void crtWk(MCList<Chk01_DtlR> dtlL) {
		
		crtSloDWk(dtlL.distinctNE(Chk01_DtlR.$slo_d_no).getStringNE(Chk01_DtlR.$slo_d_no));
		
		crtDlvInstRcptWk(dtlL.distinctNE(Chk01_DtlR.$dlv_inst_rcpt_no).getStringNE(Chk01_DtlR.$dlv_inst_rcpt_no));
	}
	
	/**
	 * 受注明細のワークテーブルを作成する。
	 * @param sloDNoL 受注明細NOリスト
	 */
	protected void crtSloDWk(List<String> sloDNoL) {
		
		MCList<MST_SLO_D_R> lst = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R sloDR = null;
		
		for (String sloDNo : sloDNoL) {
			
			sloDR = MST_SLO_D_R.create();
			sloDR.slo_d_no(sloDNo);
			
			lst.add(sloDR);
		}

		MCQueryApiBuilder sloD_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
		dbWkDelete("MSBBL1250_MSW_SLO_D_D01", sloD_bldr.getBaseDbc());
		dbWkInsert("MSBBL1250_MSW_SLO_D_I01", lst, sloD_bldr.getBaseDbc());
	}
	
	/**
	 * 出荷進捗のワークテーブルを作成する。
	 * @param shipPrNoL 出荷進捗NOリスト
	 */
	protected void crtShipPrWk(List<String> shipPrNoL) {
		
		MCList<MST_SHIP_PR_R> lst = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R shipPrR = null;
		
		for (String shipPrNo :shipPrNoL) {
			
			shipPrR = MST_SHIP_PR_R.create();
			shipPrR.ship_pr_no(shipPrNo);
			
			lst.add(shipPrR);
		}

		MCQueryApiBuilder shipPr_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
		dbWkDelete("MSBBL1250_MSW_SHIP_PR_D01", shipPr_bldr.getBaseDbc());
		dbWkInsert("MSBBL1250_MSW_SHIP_PR_I01", lst, shipPr_bldr.getBaseDbc());
	}
	
	/**
	 * 納入指示受領のワークテーブルを作成する。
	 * @param dlvInstRcptNoL 納入指示受領NOリスト
	 */
	protected void crtDlvInstRcptWk(List<String> dlvInstRcptNoL) {
		
		MCList<MST_DLV_INST_RCPT_R> lst = MCList.create(MST_DLV_INST_RCPT_R.class);
		MST_DLV_INST_RCPT_R dlvInstRcptR = null;
		
		for (String dlvInstRcptNo : dlvInstRcptNoL) {
			
			if (isNull(dlvInstRcptNo)) {
				continue;
			}
			
			dlvInstRcptR = MST_DLV_INST_RCPT_R.create();
			dlvInstRcptR.dlv_inst_rcpt_no(dlvInstRcptNo);
			
			lst.add(dlvInstRcptR);
		}

		MCQueryApiBuilder dlvInstRcpt_bldr = MCQueryApiBuilder.create(MST_DLV_INST_RCPT_R.create("T"));
		dbWkDelete("MSBBL1250_MSW_DLV_INST_RCPT_D01", dlvInstRcpt_bldr.getBaseDbc());
		dbWkInsert("MSBBL1250_MSW_DLV_INST_RCPT_I01", lst, dlvInstRcpt_bldr.getBaseDbc());
	}
	
	/**
	 * 出荷予定を取得する。
	 * @return 出荷予定リスト
	 */
	protected MCList<MST_SHIP_SCHD_R> getShipSchd() {
		
		MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R shipSchdL_t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchdL_t);
		
		MSW_SHIP_PR_KEY_R w1 = MSW_SHIP_PR_KEY_R.create("W");
		shipSchdL_bldr.addInnerJoin(w1, bracket(shipSchdL_t.ship_pr_no.eq(w1.ship_pr_no)));
		
		dbSelect("MSBBL1250_MST_SHIP_SCHD_S01", shipSchdL, shipSchdL_bldr);
		
		return shipSchdL;
	}
	
	/**
	 * 後続処理実行か判定する。
	 * @param rsltR 検索結果の受注明細情報
	 * @return 後続処理実行される場合はtrue
	 */
	protected boolean isAfterExec(MCRow rsltR, MCList<MST_SHIP_SCHD_R> shipSchdL) {
		
		for (MST_SHIP_SCHD_R shipSchdR : shipSchdL) {

			if (shipSchdR.ship_inst_qty().isPositive()
					|| shipSchdR.ship_act_qty().isPositive()
					|| shipSchdR.iv_schd_qty().isPositive()
					|| (!rsltR.getBoolean("sls_cststk_flg") && shipSchdR.sls_qty().isPositive())) {
				return true;
			}
		}
		
		return false;
	}
	/**
	 * 正常終了処理。
	 * @param dtlL 納入指示明細リスト
	 */
	protected void handleSuccessUpd(MCList<Chk01_DtlR> dtlL) {
		dbTran().commit();
		
		for (Chk01_DtlR r : dtlL) {
			if (r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
			else {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	/**
	 * 例外処理。
	 * @param ex 例外
	 * @param dtlL 納入指示明細リスト
	 */
	protected void handleExUpd(Exception ex, MCList<Chk01_DtlR> dtlL) {
		dbTran().rollback();
		
		MCException mcex;
		if (ex instanceof MCException) {
			mcex = (MCException)ex;
		}
		else {
			mcex = new MCException(ex);
		}
		MCLog.write(mcex);
		
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk01_DtlR r : dtlL) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	protected Map_DlvInstRcv_Upd01_DtlR_Chk01_DtlR<DlvInstRcv_Upd01_DtlR,Chk01_DtlR> createMap_DlvInstRcv_Upd01_DtlR_Chk01_DtlR() {
		return new Map_DlvInstRcv_Upd01_DtlR_Chk01_DtlR<DlvInstRcv_Upd01_DtlR, Chk01_DtlR>();
	}

	public class Map_DlvInstRcv_Upd01_DtlR_Chk01_DtlR<D extends DlvInstRcv_Upd01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no, Chk01_DtlR.$dlv_inst_rcpt_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_rev, Chk01_DtlR.$dlv_inst_rcpt_rev);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_no, Chk01_DtlR.$cst_dlv_inst_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_rev, Chk01_DtlR.$cst_dlv_inst_rev);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_d_no, Chk01_DtlR.$cst_dlv_inst_d_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_rqst_tm, Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_rmrks, Chk01_DtlR.$cst_dlv_inst_rmrks);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_d_rmrks, Chk01_DtlR.$cst_dlv_inst_d_rmrks);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$edi_flg, Chk01_DtlR.$edi_flg);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_lg_grp_cd, Chk01_DtlR.$dlv_lg_grp_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_nm, Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$via_dlv_typ, Chk01_DtlR.$via_dlv_typ);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cntct_dpt, Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cntct_psn, Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_zip_cd, Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr1, Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr2, Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr3, Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr4, Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_tel, Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_fax, Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_lg_grp_cd, Chk01_DtlR.$tdlv_lg_grp_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_day_week_typ, Chk01_DtlR.$dlv_day_week_typ);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$ship_pr_upd_cntr, Chk01_DtlR.$ship_pr_upd_cntr);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$slo_upd_cntr, Chk01_DtlR.$slo_upd_cntr);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$peg_no, Chk01_DtlR.$peg_no);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			src.setAttributes(src);
			
			if(!_addFlg) {
				
				if (isNull(src.dlv_inst_rcpt_no())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.del_flg() || src.isStatusDelete()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
	}

	//FMCB CUSTOM END
}