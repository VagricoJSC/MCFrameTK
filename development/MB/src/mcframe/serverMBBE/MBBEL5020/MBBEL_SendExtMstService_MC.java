package mcframe.serverMBBE.MBBEL5020;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBE.MBBEL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num_MC.getSequence;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMBBE.MBBEL5020.Query.*;
import mcframe.serverMAUC.MAUCL1120.MAUCL_ContextUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_SendExtMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_SendExtMstService_MC extends MBBEL_SendExtMstService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendExtMst_Chk01オペレーション.<p>
	 *
	 * 外部マスタ情報送信前チェック<br>
	 */
	public class SendExtMst_Chk01 extends MBBEL_SendExtMstService_MC_A.SendExtMst_Chk01 {
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
			MCMessageList msgL = super.doServerCheckSub();
			chkExtMasterTyp(msgL);
			return msgL;
		}
		
		protected void chkExtMasterTyp(MCMessageList msgL) {
			if (MAC_EXT_MASTER_TYP.is_recv(up0().ext_master_typ())) {
				msgL.add(new MCMessage(up0(), null , MBBEL0104, up0().ext_master_typ()));
			}
		}
	
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * SendExtMst_Chk02オペレーション.<p>
	 *
	 * 外部マスタ情報送信取消前チェック<br>
	 */
	public class SendExtMst_Chk02 extends MBBEL_SendExtMstService_MC_A.SendExtMst_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * SendExtMst_Ins01オペレーション.<p>
	 *
	 * 外部マスタ情報を送信する。<br>
	 */
	public class SendExtMst_Ins01 extends MBBEL_SendExtMstService_MC_A.SendExtMst_Ins01 {
		protected MCNumber _dataNo = null;

		/**
		 * 論理削除フラグの制御を行うテーブル名を指定します。
		 */
		protected String[] _delFlgTblNm = {
			MAM_BP_R.TABLE_NAME,
			MAM_ITM_STOP_R.TABLE_NAME,
			MAM_BP_STOP_R.TABLE_NAME
		};

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			main();
		}

		protected void callThisChk01() {
			MBBEL_SendExtMstService.SendExtMst_Chk01 o = MBBEL_SendExtMstService
					.crtSendExtMst_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			if (isInsSndIfExt()) {
				callSendRecvIf(createSendRecvIfUpL());
			}
		}

		protected boolean isInsSndIfExt() {
			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			MCQueryPlan sql = null;
			if (MAC_EXT_MASTER_TYP.isCST_BP(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_BP_SND_IF_EXT_I01();
			}
			else if (MAC_EXT_MASTER_TYP.isDLV_BP(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_BP_SND_IF_EXT_I02();
			}
			else if (MAC_EXT_MASTER_TYP.isDEST_BP(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_BP_SND_IF_EXT_I03();
			}
			else if (MAC_EXT_MASTER_TYP.isSPPL_BP(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_BP_SND_IF_EXT_I04();
			}
			else if (MAC_EXT_MASTER_TYP.isPROD_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I01();
			}
			else if (MAC_EXT_MASTER_TYP.isOTHER_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I02();
			}
			else if (MAC_EXT_MASTER_TYP.isGOODS_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I03();
			}
			else if (MAC_EXT_MASTER_TYP.isWIP_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I04();
			}
			else if (MAC_EXT_MASTER_TYP.isPARTS_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I05();
			}
			else if (MAC_EXT_MASTER_TYP.isMATE_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I06();
			}
			else if (MAC_EXT_MASTER_TYP.isRAWMATE_ITM(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_SND_IF_I07();
			}
			else if (MAC_EXT_MASTER_TYP.isBP_STOP(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_BP_STOP_SND_IF_I01();
			}
			else if (MAC_EXT_MASTER_TYP.isITM_STOP(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_ITM_STOP_IF_I01();
			}
			else if (MAC_EXT_MASTER_TYP.isEX_CTRL(up0().ext_master_typ())) {
				sql = MBBEL5020_MBT_EX_CTRL_SND_IF_I01();
			}
			up0().setNumberNE("DATA_NO", _dataNo);
			MAUCL_ContextUtil.enableDelFlgOn(_delFlgTblNm);
			executeUpdate(sql, up0());
			boolean isInsSndIf = dbTran().getLastUpdateCnt() > 0;
			MAUCL_ContextUtil.unableDelFlgOn(_delFlgTblNm);
			return isInsSndIf;
		}

		/**
		 * 送受信ＩＦ制御の新規追加オペレーションに渡す上り電文を返す。
		 */
		protected MCList<MCRow> createSendRecvIfUpL() {
			String ifProcTyp = null;
			if (MAC_EXT_MASTER_TYP.isCST_BP(up0().ext_master_typ())) {
				// 取引先マスタ（得意先）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_BP_CST_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isDLV_BP(up0().ext_master_typ())) {
				// 取引先マスタ（納品先）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_BP_DLV_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isDEST_BP(up0().ext_master_typ())) {
				// 取引先マスタ（仕向先）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_BP_DEST_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isSPPL_BP(up0().ext_master_typ())) {
				// 取引先マスタ（発注先）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_BP_SPPL_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isPROD_ITM(up0().ext_master_typ())) {
				// 品目マスタ（製品）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_PROD_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isOTHER_ITM(up0().ext_master_typ())) {
				// 品目マスタ（その他）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_OTHER_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isGOODS_ITM(up0().ext_master_typ())) {
				// 品目マスタ（商品）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_GOODS_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isWIP_ITM(up0().ext_master_typ())) {
				// 品目マスタ（中間品）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_WIP_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isPARTS_ITM(up0().ext_master_typ())) {
				// 品目マスタ（部品）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_PARTS_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isMATE_ITM(up0().ext_master_typ())) {
				// 品目マスタ（資材）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_MATE_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isRAWMATE_ITM(up0().ext_master_typ())) {
				// 品目マスタ（原料）送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_RAWMATE_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isBP_STOP(up0().ext_master_typ())) {
				// 取引先禁止マスタ送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_BP_STOP_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isITM_STOP(up0().ext_master_typ())) {
				// 品目禁止マスタ送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_ITM_STOP_SEND.value();
			}
			else if (MAC_EXT_MASTER_TYP.isEX_CTRL(up0().ext_master_typ())) {
				// 輸出規制マスタ送信
				ifProcTyp = MAC_IF_PROC_TYP.EXT_EX_CTRL_SEND.value();
			}

			MCList<MCRow> l = MCList.create(MCRow.class);
			MCRow r = createSendRecvIfUpR(_dataNo, up0().ext_sys_cd(), ifProcTyp);
			l.add(r);
			return l;
		}
	}

	/**
	 * SendExtMst_Del01オペレーション.<p>
	 *
	 * 外部マスタ情報の送信を取り消す。<br>
	 */
	public class SendExtMst_Del01 extends MBBEL_SendExtMstService_MC_A.SendExtMst_Del01 {
		protected MCList<MBT_BP_SND_IF_EXT_R> _bpSndIfExtL = null;

		protected MCList<MBT_ITM_SND_IF_R> _itmSndIfL = null;

		protected MCList<MBT_BP_STOP_SND_IF_R> _bpStopSndIfL = null;

		protected MCList<MBT_ITM_STOP_SND_IF_R> _itmStopSndIfL = null;

		protected MCList<MBT_EX_CTRL_SND_IF_R> _exCtrlSndIfL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk02();
			throwUpdErr();
			main();
		}

		protected void callThisChk02() {
			MBBEL_SendExtMstService.SendExtMst_Chk02 o = MBBEL_SendExtMstService
					.crtSendExtMst_Chk02();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			if (MAC_EXT_MASTER_TYP.isPROD_ITM(up0().ext_master_typ())
					|| MAC_EXT_MASTER_TYP.isOTHER_ITM(up0().ext_master_typ())
					|| MAC_EXT_MASTER_TYP.isGOODS_ITM(up0().ext_master_typ())
					|| MAC_EXT_MASTER_TYP.isWIP_ITM(up0().ext_master_typ())
					|| MAC_EXT_MASTER_TYP.isPARTS_ITM(up0().ext_master_typ())
					|| MAC_EXT_MASTER_TYP.isMATE_ITM(up0().ext_master_typ())
					|| MAC_EXT_MASTER_TYP.isRAWMATE_ITM(up0().ext_master_typ())) {
				// 品目マスタ送信IF
				lockItmSndIf();
				deleteItmSndIf();
				delPftSdrvIf(_itmSndIfL);
			}
			else if (MAC_EXT_MASTER_TYP.isBP_STOP(up0().ext_master_typ())) {
				// 取引先禁止マスタ送信IF
				lockBpStopSndIf();
				deleteBpStopSndIf();
				delPftSdrvIf(_bpStopSndIfL);
			}
			else if (MAC_EXT_MASTER_TYP.isITM_STOP(up0().ext_master_typ())) {
				// 品目禁止マスタ送信IF
				lockItmStopSndIf();
				deleteItmStopSndIf();
				delPftSdrvIf(_itmStopSndIfL);
			}
			else if (MAC_EXT_MASTER_TYP.isEX_CTRL(up0().ext_master_typ())) {
				// 輸出規制マスタ送信ＩＦ
				lockExCtrlSndIf();
				deleteExCtrlSndIf();
				delPftSdrvIf(_exCtrlSndIfL);
			}
			else {
				// 残りは取引マスタ送信IF
				lockBpSndIfExt();
				deleteBpSndIfExt();
				delPftSdrvIf(_bpSndIfExtL);
			}
		}

		protected void lockItmSndIf() {
			// MBT_ITM_SND_IFのロック
			_itmSndIfL = MCList.create(MBT_ITM_SND_IF_R.class);
			MBT_ITM_SND_IF_R t = MBT_ITM_SND_IF_R.create("T");
			MCQueryApiBuilder itmSndIfL_bldr = MCQueryApiBuilder.create(t);
			MBT_ITM_SND_IF_R S1W = MBT_ITM_SND_IF_R.create("W");
			itmSndIfL_bldr.setSelect(itmSndIfL_bldr.getBaseDbc().getKeyColumn$());
			itmSndIfL_bldr.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			itmSndIfL_bldr.addWhereWithAnd(t.ext_master_typ.eq(bind("1")), up0().ext_master_typ());
			itmSndIfL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			dbSelectForUpdateNoWait("MBBEL5020_MBT_ITM_SND_IF_S01", _itmSndIfL, itmSndIfL_bldr);
			// PFT_SDRV_IFから削除するDATA_NOの取得（未処理以外のデータがあるものは対象外）
			MCQueryApiBuilder itmSndIfL_bldr2 = MCQueryApiBuilder.create(t);
			itmSndIfL_bldr2.setDistinct();
			itmSndIfL_bldr2.setSelect(t.data_no);
			itmSndIfL_bldr2.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			itmSndIfL_bldr2.addWhereWithAnd(t.ext_master_typ.eq(bind("1")), up0().ext_master_typ());
			itmSndIfL_bldr2.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			itmSndIfL_bldr2.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1W).where(S1W.data_no.eq(t.data_no)
							.and(S1W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))))));
			dbSelect("MBBEL5020_MBT_ITM_SND_IF_S02", _itmSndIfL, itmSndIfL_bldr2);
		}

		protected void deleteItmSndIf() {
			MBT_ITM_SND_IF_R t = MBT_ITM_SND_IF_R.create("T");

			execDbDelete("MBBEL5020_MBT_ITM_SND_IF_D01", t,
					t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))
							.and(t.ext_master_typ.eq(bind("1")))
							.and(t.ext_sys_cd.eq(bind("2"))),
					up0().ext_master_typ(), up0().ext_sys_cd());
		}

		protected void lockItmStopSndIf() {
			// MBT_ITM_STOP_SND_IFのロック
			_itmStopSndIfL = MCList.create(MBT_ITM_STOP_SND_IF_R.class);
			MBT_ITM_STOP_SND_IF_R t = MBT_ITM_STOP_SND_IF_R.create("T");
			MCQueryApiBuilder itmStopSndIfL_bldr = MCQueryApiBuilder.create(t);
			MBT_ITM_STOP_SND_IF_R S1W = MBT_ITM_STOP_SND_IF_R.create("W");
			itmStopSndIfL_bldr.setSelect(itmStopSndIfL_bldr.getBaseDbc().getKeyColumn$());
			itmStopSndIfL_bldr.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			itmStopSndIfL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			dbSelectForUpdateNoWait("MBBEL5020_MBT_ITM_STOP_SND_IF_S01", _itmStopSndIfL, itmStopSndIfL_bldr);

			// PFT_SDRV_IFから削除するDATA_NOの取得（未処理以外のデータがあるものは対象外）
			MCQueryApiBuilder itmStopSndIfL_bldr2 = MCQueryApiBuilder.create(t);
			itmStopSndIfL_bldr2.setDistinct();
			itmStopSndIfL_bldr2.setSelect(t.data_no);
			itmStopSndIfL_bldr2.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			itmStopSndIfL_bldr2.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			itmStopSndIfL_bldr2.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1W).where(S1W.data_no.eq(t.data_no)
							.and(S1W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))))));
			dbSelect("MBBEL5020_MBT_ITM_STOP_SND_IF_S02", _itmStopSndIfL, itmStopSndIfL_bldr2);
		}

		protected void deleteItmStopSndIf() {
			MBT_ITM_STOP_SND_IF_R t = MBT_ITM_STOP_SND_IF_R.create("T");

			execDbDelete("MBBEL5020_MBT_ITM_STOP_SND_IF_D01", t,
					t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))
							.and(t.ext_sys_cd.eq(bind("1"))),
					up0().ext_sys_cd());
		}

		protected void lockBpStopSndIf() {
			// MBT_BP_STOP_SND_IFのロック
			_bpStopSndIfL = MCList.create(MBT_BP_STOP_SND_IF_R.class);
			MBT_BP_STOP_SND_IF_R t = MBT_BP_STOP_SND_IF_R.create("T");
			MCQueryApiBuilder bpStopSndIfL_bldr = MCQueryApiBuilder.create(t);
			MBT_BP_STOP_SND_IF_R S1W = MBT_BP_STOP_SND_IF_R.create("W");
			bpStopSndIfL_bldr.setSelect(bpStopSndIfL_bldr.getBaseDbc().getKeyColumn$());
			bpStopSndIfL_bldr.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			bpStopSndIfL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			dbSelectForUpdateNoWait("MBBEL5020_MBT_BP_STOP_SND_IF_S01", _bpStopSndIfL, bpStopSndIfL_bldr);
			// PFT_SDRV_IFから削除するDATA_NOの取得（未処理以外のデータがあるものは対象外）
			MCQueryApiBuilder bpStopSndIfL_bldr2 = MCQueryApiBuilder.create(t);
			bpStopSndIfL_bldr2.setDistinct();
			bpStopSndIfL_bldr2.setSelect(t.data_no);
			bpStopSndIfL_bldr2.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			bpStopSndIfL_bldr2.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			bpStopSndIfL_bldr2.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1W).where(S1W.data_no.eq(t.data_no)
							.and(S1W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))))));
			dbSelect("MBBEL5020_MBT_BP_STOP_SND_IF_S02", _bpStopSndIfL, bpStopSndIfL_bldr2);
		}

		protected void deleteBpStopSndIf() {
			MBT_BP_STOP_SND_IF_R t = MBT_BP_STOP_SND_IF_R.create("T");

			execDbDelete("MBBEL5020_MBT_BP_STOP_SND_IF_D01", t,
					t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))
							.and(t.ext_sys_cd.eq(bind("1"))),
					up0().ext_sys_cd());
		}

		protected void lockExCtrlSndIf() {
			// MBT_EX_CTRL_SNDのロック
			_exCtrlSndIfL = MCList.create(MBT_EX_CTRL_SND_IF_R.class);
			MBT_EX_CTRL_SND_IF_R t = MBT_EX_CTRL_SND_IF_R.create("T");
			MCQueryApiBuilder exCtrlSndIfL_bldr = MCQueryApiBuilder.create(t);
			MBT_EX_CTRL_SND_IF_R S1W = MBT_EX_CTRL_SND_IF_R.create("W");
			exCtrlSndIfL_bldr.setSelect(exCtrlSndIfL_bldr.getBaseDbc().getKeyColumn$());
			exCtrlSndIfL_bldr.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			exCtrlSndIfL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			dbSelectForUpdateNoWait("MBBEL5020_MBT_EX_CTRL_SND_IF_S01", _exCtrlSndIfL, exCtrlSndIfL_bldr);
			// PFT_SDRV_IFから削除するDATA_NOの取得（未処理以外のデータがあるものは対象外）
			MCQueryApiBuilder exCtrlSndIfL_bldr2 = MCQueryApiBuilder.create(t);
			exCtrlSndIfL_bldr2.setDistinct();
			exCtrlSndIfL_bldr2.setSelect(t.data_no);
			exCtrlSndIfL_bldr2.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			exCtrlSndIfL_bldr2.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());

			exCtrlSndIfL_bldr2.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1W).where(S1W.data_no.eq(t.data_no)
							.and(S1W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))))));
			dbSelect("MBBEL5020_MBT_EX_CTRL_SND_IF_S02", _exCtrlSndIfL, exCtrlSndIfL_bldr2);
		}

		protected void deleteExCtrlSndIf() {
			MBT_EX_CTRL_SND_IF_R t = MBT_EX_CTRL_SND_IF_R.create("T");

			execDbDelete("MBBEL5020_MBT_EX_CTRL_SND_IF_D01", t,
					t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))
							.and(t.ext_sys_cd.eq(bind("1"))),
					up0().ext_sys_cd());
		}

		protected void lockBpSndIfExt() {
			// MBT_BP_SND_IF_EXTのロック
			_bpSndIfExtL = MCList.create(MBT_BP_SND_IF_EXT_R.class);
			MBT_BP_SND_IF_EXT_R t = MBT_BP_SND_IF_EXT_R.create("T");
			MCQueryApiBuilder bpSndIfExtL_bldr = MCQueryApiBuilder.create(t);
			MBT_BP_SND_IF_EXT_R S1W = MBT_BP_SND_IF_EXT_R.create("W");
			bpSndIfExtL_bldr.setSelect(bpSndIfExtL_bldr.getBaseDbc().getKeyColumn$());
			bpSndIfExtL_bldr.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			bpSndIfExtL_bldr.addWhereWithAnd(t.ext_master_typ.eq(bind("1")), up0().ext_master_typ());
			bpSndIfExtL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			bpSndIfExtL_bldr.setOrderByAsc(bpSndIfExtL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWait("MBBEL5020_MBT_BP_SND_IF_EXT_S01", _bpSndIfExtL, bpSndIfExtL_bldr);
			// PFT_SDRV_IFから削除するDATA_NOの取得（未処理以外のデータがあるものは対象外）
			MCQueryApiBuilder bpSndIfExtL_bldr2 = MCQueryApiBuilder.create(t);
			bpSndIfExtL_bldr2.setDistinct();
			bpSndIfExtL_bldr2.setSelect(t.data_no);
			bpSndIfExtL_bldr2.setWhere(t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value())));
			bpSndIfExtL_bldr2.addWhereWithAnd(t.ext_master_typ.eq(bind("1")), up0().ext_master_typ());
			bpSndIfExtL_bldr2.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), up0().ext_sys_cd());
			bpSndIfExtL_bldr2.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1W).where(S1W.data_no.eq(t.data_no)
							.and(S1W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))))));
			dbSelect("MBBEL5020_MBT_BP_SND_IF_EXT_S02", _bpSndIfExtL, bpSndIfExtL_bldr2);
		}

		protected void deleteBpSndIfExt() {
			MBT_BP_SND_IF_EXT_R t = MBT_BP_SND_IF_EXT_R.create("T");

			execDbDelete("MBBEL5020_MBT_BP_SND_IF_EXT_D01", t,
					t.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.NOT_EXE.value()))
							.and(t.ext_master_typ.eq(bind("1")))
							.and(t.ext_sys_cd.eq(bind("2"))),
					up0().ext_master_typ(), up0().ext_sys_cd());
		}

	}

	//FMCB CUSTOM END
}