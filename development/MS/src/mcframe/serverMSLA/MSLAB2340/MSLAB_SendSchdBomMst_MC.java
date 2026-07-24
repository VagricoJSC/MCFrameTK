package mcframe.serverMSLA.MSLAB2340;

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
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverMSLA.MSLAL9310.MSLAL_OrdSendIfService;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR;
import mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SendSchdBomMst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SendSchdBomMst_MC extends MSLAB_SendSchdBomMst_MC_A{
	//FMCB CUSTOM START

	/**
	 * データＮＯ
	 */
	protected MCNumber _dataNo = null;

	/**
	 * エラーＦＬＧ
	 */
	protected boolean _errFlg = false;

	/**
	 * オーダ送信ＩＦサービスの下り電文
	 */
	protected MCList<OrdSendIf_Bom_Srch01_RsltR>_targetL = null;
	/**
	 * 送信ＩＦ登録用コンテナ
	 */
	protected MCList<MST_ORDSND_BOM_IF_R> _sndIfL = null;
	protected MST_ORDSND_BOM_IF_R _sndIfL_t = null;
	protected MCQueryApiBuilder _sndIfL_bldr = null;

	/**
	 * SendSchdBomMst_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用のＢＯＭマスタデータをＩＦテーブルに登録する。<br>
	 */
	public class SendSchdBomMst_Upd01 extends MSLAB_SendSchdBomMst_MC_A.SendSchdBomMst_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {

				initLogger();
				writeStartLog();

				chk();

				if (!_errFlg) {

					getMstData();

					if (!_targetL.isEmpty()) {
						crtSndIfData();

						insSndIfData();

						insSdrvIfData();
					}

				}
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {

			FXBAL_BatchLogManager.getLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {

			FXBAL_BatchLogManager.logger().writeStartLog(MSLAL0710, up0().ext_sys_cd(),
					up0().master_dt(), up0().wg_cd());
			pushStartLog(FXBAL_BatchLogManager.logger());
		}

		/**
		 * チェック結果を判定する。
		 */
		protected void chk() {

			MCMessageList msgList = new MCMessageList();
			chkSub(msgList);

			if (msgList.size() > 0) {
				FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
				_errFlg = true;
			}
		}

		/**
		 * チェック処理を実行する。
		 */
		protected MCMessageList chkSub(MCMessageList msgList) {

			msgList.add(chkExtSysCd());
			msgList.add(chkMasterDt());
			msgList.add(chkWgCd());

			return msgList;
		}

		/**
		 * 外部システムＣＤの存在チェック
		 * */
		protected MCMessage chkExtSysCd() {

			if (isNull(up0().ext_sys_cd())) {
				return new MCMessage(MSLAL0702, getLabel(up0(),SendSchdBomMst_Upd01_CndR.$ext_sys_cd));
			}

			return null;
		}

		/**
		 * マスタ適用日の存在チェック
		 * */
		protected MCMessage chkMasterDt() {

			if (isNull(up0().master_dt())) {
				return new MCMessage(MSLAL0702, getLabel(up0(),SendSchdBomMst_Upd01_CndR.$master_dt));
			}

			return null;
		}

		/**
		 * ワーキンググループＣＤの存在チェック
		 * */
		protected MCMessage chkWgCd() {

			if (isNull(up0().wg_cd())) {
				return new MCMessage(MSLAL0702, getLabel(up0(),SendSchdBomMst_Upd01_CndR.$wg_cd));
			}

			return null;
		}

		/**
		 * オーダ送信ＩＦサービスを呼び出してＢＯＭマスタのデータを取得して登録する
		 */
		protected void getMstData() {
			MSLAL_OrdSendIfService.OrdSendIf_Bom_Srch01 ope = MSLAL_OrdSendIfService.crtOrdSendIf_Bom_Srch01();
			setArg(ope.up0());
			ope.exec();
			_targetL = MCList.create(OrdSendIf_Bom_Srch01_RsltR.class);
			_targetL.addAll(ope.down0());
		}

		/**
		 * バッチ実行時の引数を検索サービスの上り電文に設定する。
		 * @param arg
		 */
		protected void setArg(OrdSendIf_Bom_Srch01_DtlR arg) {
			arg.wg_cd(up0().wg_cd());
			arg.master_dt(up0().master_dt());
		}

		/**
		 * 送信対象データを作成する。
		 */
		protected void crtSndIfData() {

			_sndIfL = MCList.create(MST_ORDSND_BOM_IF_R.class);

			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

			doSeqCache(MSC_NUM_SYS_TYP.ORDERSENDITMBOMIF, _targetL.size());

			setAll(_sndIfL, _targetL, createMap_Mst_OrdSnd_Bom_If_R_OrdSendIf_Bom_Srch01_RsltR());

			clearParamRowIndex();
			writeBatchLog();
		}

		/**
		 * 送信ＩＦを登録する。
		 */
		protected void insSndIfData() {
			_sndIfL_t = MST_ORDSND_BOM_IF_R.create("T");
			_sndIfL_bldr = MCQueryApiBuilder.create(_sndIfL_t);
			dbInsertEx("MSLAB2310_MST_ORDER_SEND_BOM_IF_I01", _sndIfL, _sndIfL_bldr);
		}

		/**
		 * 行インデックスをクリアする。<br>
		 * バッチログのサブキーを自動発番させるため、行インデックスをクリアする。
		 */
		protected void clearParamRowIndex() {

			for (MST_ORDSND_BOM_IF_R sndR : _sndIfL) {
				sndR.setParamIndex(-1);
				sndR.setParamRowIndex(-1);
			}
		}

		/**
		 * バッチログを出力する。
		 */
		protected void writeBatchLog() {
			MCMessageList msgList = MCMessagePool.getMessageList();
			FXBAL_BatchLogManager.logger().setLogKey(_sndIfL, MST_ORDSND_BOM_IF_R.$batch_log_no,
					MST_ORDSND_BOM_IF_R.$log_sub_key1, MST_ORDSND_BOM_IF_R.$log_sub_key2);
			FXBAL_BatchLogManager.logger().writeDataLog(msgList);
		}

		/**
		 * 送受信ＩＦ制御を登録する。
		 */
		protected void insSdrvIfData() {
			PFBZL_SendRecvIfCtrl.Ins01 ope = PFBZL_SendRecvIfCtrl.crtIns01();
			DtlR r = createSdrvIfUpRow();
			ope.up0().add(r);
			ope.exec();
		}

		/**
		 * 送受信ＩＦ制御上り電文作成処理
		 * */
		protected DtlR createSdrvIfUpRow() {
			DtlR r = DtlR.create();
			r.data_no(_dataNo);
			r.ext_sys_cd(up0().ext_sys_cd());
			r.if_proc_typ(MAC_IF_PROC_TYP.MES_ORDER_SEND_BOM.value());

			return r;
		}

		/**
		 * 例外処理
		 *
		 * @param ex
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			FXBAL_BatchLogManager.logger().writeProcessLog(mcex);

			_errFlg = true;

			throw mcex;
		}

		/**
		 * 終了ログを出力する。
		 */
		protected void writeEndLog() {

			if (_errFlg) {
				writeErrLog();
				pushErrorLog(FXBAL_BatchLogManager.logger());
			}
			else if (isNull(_sndIfL)) {
				writeEmptyLog();
			}

			writeRsltLog();
			pushEndLog(FXBAL_BatchLogManager.logger());
		}

		/**
		 * エラーが発生した場合のログを出力する。
		 */
		protected void writeErrLog() {

			FXBAL_BatchLogManager.logger().writeProcessLog(MAUDL0009);
			MCMessagePool.add(MAUDL0009);
		}

		/**
		 * 抽出対象が0件だった場合のログを出力する。
		 */
		protected void writeEmptyLog() {

			FXBAL_BatchLogManager.logger().writeProcessLog(MAUDL0008);
			MCMessagePool.add(MAUDL0008);
		}

		/**
		 * 処理結果の終了ログを出力する。
		 */
		protected void writeRsltLog() {

			FXBAL_BatchLogManager.logger().writeEndLog(MSLAL0711, up0().ext_sys_cd(), !isNull(_sndIfL) ? _sndIfL.size() : 0);
		}

		protected Map_Mst_OrdSnd_Bom_If_R_OrdSendIf_Bom_Srch01_RsltR<MST_ORDSND_BOM_IF_R,OrdSendIf_Bom_Srch01_RsltR> createMap_Mst_OrdSnd_Bom_If_R_OrdSendIf_Bom_Srch01_RsltR() {
			return new Map_Mst_OrdSnd_Bom_If_R_OrdSendIf_Bom_Srch01_RsltR<MST_ORDSND_BOM_IF_R, OrdSendIf_Bom_Srch01_RsltR>();
		}

		public class Map_Mst_OrdSnd_Bom_If_R_OrdSendIf_Bom_Srch01_RsltR<D extends MST_ORDSND_BOM_IF_R, S extends OrdSendIf_Bom_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$wg_cd, OrdSendIf_Bom_Srch01_RsltR.$wg_cd);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$par_itm_cd, OrdSendIf_Bom_Srch01_RsltR.$par_itm_cd);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$par_itm_sub1, OrdSendIf_Bom_Srch01_RsltR.$par_itm_sub1);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$par_itm_sub2, OrdSendIf_Bom_Srch01_RsltR.$par_itm_sub2);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$par_itm_sub3, OrdSendIf_Bom_Srch01_RsltR.$par_itm_sub3);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$bom_ptn, OrdSendIf_Bom_Srch01_RsltR.$bom_ptn);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$oper_cd, OrdSendIf_Bom_Srch01_RsltR.$oper_cd);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$oper_seq, OrdSendIf_Bom_Srch01_RsltR.$oper_seq);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$chd_itm_cd, OrdSendIf_Bom_Srch01_RsltR.$chd_itm_cd);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$chd_itm_sub1, OrdSendIf_Bom_Srch01_RsltR.$chd_itm_sub1);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$chd_itm_sub2, OrdSendIf_Bom_Srch01_RsltR.$chd_itm_sub2);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$chd_itm_sub3, OrdSendIf_Bom_Srch01_RsltR.$chd_itm_sub3);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$st_dt, OrdSendIf_Bom_Srch01_RsltR.$st_dt);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$end_dt, OrdSendIf_Bom_Srch01_RsltR.$end_dt);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$ver_no, OrdSendIf_Bom_Srch01_RsltR.$ver_no);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$ph_flg, OrdSendIf_Bom_Srch01_RsltR.$ph_flg);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$ph_bom_ptn, OrdSendIf_Bom_Srch01_RsltR.$ph_bom_ptn);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$alt_grp_cd, OrdSendIf_Bom_Srch01_RsltR.$alt_grp_cd);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$alt_grp_seq, OrdSendIf_Bom_Srch01_RsltR.$alt_grp_seq);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$alt_itm_typ, OrdSendIf_Bom_Srch01_RsltR.$alt_itm_typ);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$alt_itm_ratio, OrdSendIf_Bom_Srch01_RsltR.$alt_itm_ratio);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$alt_alloc_prio, OrdSendIf_Bom_Srch01_RsltR.$alt_alloc_prio);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$par_inst_qty, OrdSendIf_Bom_Srch01_RsltR.$par_inst_qty);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$chd_rqmt_qty, OrdSendIf_Bom_Srch01_RsltR.$chd_rqmt_qty);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$fxd_chd_rqmt_qty, OrdSendIf_Bom_Srch01_RsltR.$fxd_chd_rqmt_qty);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$sno_typ1, OrdSendIf_Bom_Srch01_RsltR.$sno_typ1);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$min_sno1, OrdSendIf_Bom_Srch01_RsltR.$min_sno1);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$max_sno1, OrdSendIf_Bom_Srch01_RsltR.$max_sno1);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$sno_typ2, OrdSendIf_Bom_Srch01_RsltR.$sno_typ2);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$min_sno2, OrdSendIf_Bom_Srch01_RsltR.$min_sno2);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$max_sno2, OrdSendIf_Bom_Srch01_RsltR.$max_sno2);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$sno_typ3, OrdSendIf_Bom_Srch01_RsltR.$sno_typ3);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$min_sno3, OrdSendIf_Bom_Srch01_RsltR.$min_sno3);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$max_sno3, OrdSendIf_Bom_Srch01_RsltR.$max_sno3);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$sno_typ4, OrdSendIf_Bom_Srch01_RsltR.$sno_typ4);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$min_sno4, OrdSendIf_Bom_Srch01_RsltR.$min_sno4);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$max_sno4, OrdSendIf_Bom_Srch01_RsltR.$max_sno4);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$in_offst_typ, OrdSendIf_Bom_Srch01_RsltR.$in_offst_typ);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$in_offst, OrdSendIf_Bom_Srch01_RsltR.$in_offst);
				addColumnPathMap( MST_ORDSND_BOM_IF_R.$inpt_ctl_typ, OrdSendIf_Bom_Srch01_RsltR.$inpt_ctl_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// ＩＦ共通項目の設定
				MCNumber dataLno = getSequence(
						MSC_NUM_SYS_TYP.ORDERSENDITMBOMIF.value());
				dest.data_lno(dataLno);
				dest.data_no(_dataNo);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(up0().ext_sys_cd());
			}
		}
	}

	//FMCB CUSTOM END
}