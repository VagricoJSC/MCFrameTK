package mcframe.serverMBBE.MBBEL0040;

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
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv_MC.CltDLInfo;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv_MC.FileInfo;
import mcframe.serverMAUD.MAUDL5010.MAUDL_BizDatDLer_MC.BizDatDLer;
import mcframe.serverCore.acl.MCACLManager;
import mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.flex.MCFlexReportSet;
import mcframe.commonCore.report.container.MCReportType;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_BizDatDLConf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_BizDatDLConf_MC extends MBBEL_BizDatDLConf_MC_A{
	//FMCB CUSTOM START

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 業務データダウンロードを実行する<br>
	 */
	public class Prnt01 extends MBBEL_BizDatDLConf_MC_A.Prnt01 {

		MCFileWriteListerner _lstnr = null;

		@Override
		protected void call() {
			MBT_BIZ_DAT_DL_R r = getBizDatDl();
			if (!isNull(up0().sql_src())
					|| (isNull(r.biz_dat_id()) && isMiningDL())
					|| MAC_BIZ_DAT_GET_TYP.isSQL_REG(r.biz_dat_get_typ())) {
				if (!isNull(getCltFilePath())) {
					setBizDatDL(true);
				}
				else {
					setBizDatScreenOrReport(true);
				}
			}
			super.call();
		}

		
		@Override
		protected void initForBizDatDL() {
			if (MAC_BIZ_DAT_FILE_TYP.isREPORT(up0().biz_dat_file_typ())) {
				return;
			}
			super.initForBizDatDL();
		}

		@Override
		protected void doIt() {
			// 画面に検索結果を表示する場合、処理時間を返す
			MCDate startDt = MCDate.now();
			super.doIt();
			MCDate endDt = MCDate.now();
			down2().exec_time(endDt.diffSecond(startDt));
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MBT_BIZ_DAT_DL_R bizDatDlR;

			// 上り電文にSQLがない場合は業務データＩＤを元にテーブルの情報で初期化、
			if (isNull(up0().sql_src())) {
				bizDatDlR = getBizDatDl();
				// 対応するデータがない場合、かつマイニングでない場合はリターン
				if (isNull(bizDatDlR.biz_dat_id()) && !isMiningDL()) {
					return;
				}
				// 対応するデータがない場合、かつマイニングの場合は、ダウンロード用のファイルが作成されるよう、適当なSQLを実行
				// （biz_dat_idが取得できない可能性があるのは、検索ＳＱＬ登録でユーザが任意に登録したデータのみの想定）
				else if (isNull(bizDatDlR.biz_dat_id()) && isMiningDL()) {
					bizDatDlR = MBT_BIZ_DAT_DL_R.create();
					bizDatDlR.biz_dat_id(up0().biz_dat_id());
					bizDatDlR.sql_src("SELECT '' DUMMY FROM DUAL WHERE 0 = 1");
					bizDatDlR.biz_dat_get_typ(MAC_BIZ_DAT_GET_TYP.SQL_REG.value());
					_bizDatDlR = bizDatDlR;
				}
				else {
					// 権限チェック（権限がない場合は例外なので、後続の処理は実行されない）
					chkAuthorize(bizDatDlR);
				}
			}
			// 上り電文にSQLがある場合は手動で初期化、
			else {
				bizDatDlR = MBT_BIZ_DAT_DL_R.create();
				bizDatDlR.biz_dat_id(up0().biz_dat_id());
				bizDatDlR.sql_src(up0().sql_src());
				bizDatDlR.biz_dat_get_typ(MAC_BIZ_DAT_GET_TYP.SQL_REG.value());
				bizDatDlR.form_file_nm(up0().form_file_nm());
				bizDatDlR.cartridge(up0().cartridge());
				bizDatDlR.dwnld_flg(up0().dwnld_flg());
				_bizDatDlR = bizDatDlR;
			}

			// 業務データ取得区分ごとに検索処理
			if (MAC_BIZ_DAT_GET_TYP.isOPE(bizDatDlR.biz_dat_get_typ())) {
				doSearchMainOpe(bizDatDlR);
			}
			else if (MAC_BIZ_DAT_GET_TYP.isSQL_REG(bizDatDlR.biz_dat_get_typ())) {
				doSearchMainSqlReg(bizDatDlR);
			}
			else if (MAC_BIZ_DAT_GET_TYP.isSQL_SRC(bizDatDlR.biz_dat_get_typ())) {
				doSearchMainSqlSrc(bizDatDlR);
			}
			else if (MAC_BIZ_DAT_GET_TYP.isRSC(bizDatDlR.biz_dat_get_typ())) {
				doSearchMainRsc(bizDatDlR);
			}
		}

		protected MBT_BIZ_DAT_DL_R _bizDatDlR = null;
		
		protected MBT_BIZ_DAT_DL_R getBizDatDl() {
			if (_bizDatDlR != null) {
				return _bizDatDlR;
			}
			MBT_BIZ_DAT_DL_R dbcR = MBT_BIZ_DAT_DL_R.create();
			MBT_BIZ_DAT_DL_R cndR = MBT_BIZ_DAT_DL_R.create();
			cndR.biz_dat_id(up0().biz_dat_id());
			MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(MBT_BIZ_DAT_DL_R.create("T"));
			dbSelectKey("MBBEL0040_MBT_BIZ_DAT_DL_S01", dbcR, dbcR_bldr, cndR);
			_bizDatDlR = dbcR;
			return _bizDatDlR;
		}

		/**
		 * 権限チェックを行う
		 */
		protected void chkAuthorize(MBT_BIZ_DAT_DL_R r) {
			MCACLManager m = MCACLManager.createClientManager();
			if (!m.authorize(r.module_id(), r.logic_id(), r.func_actyp(),
					r.biz_dat_nm())) {
				throw new MCAppException(MAUDL0402);
			}
		}

		protected void doSearchMainOpe(MBT_BIZ_DAT_DL_R bizDatDlR) {
			String[] strAry = bizDatDlR.operation().split("\\.");
			MAUDL_Searcher o = createOperationWD(strAry[0], strAry[1], strAry[2],
					MAUDL_Searcher.class);

			o.setBizDatDL(true);

			// 業務データＤＬ用の検索条件を渡す処理は未実装（ファイル名などは電文パラメータに設定するため呼出先で参照可能）
			o.exec();
		}

		protected void doSearchMainSqlReg(MBT_BIZ_DAT_DL_R bizDatDlR) {
			MCRow cndR = MCRow.create();
			setSqlBind(cndR);
			try {
				if (isOutputReport()) {
					// Output report / Download report file
					requestReport(bizDatDlR, cndR);
				}
				else {
					// Download Excel / CSV file
					searchForDL(bizDatDlR.sql_src(), cndR, down0());
				}
			}
			catch (MCException e) {
				Throwable c = e.getCause();

				while (c != null) {
					if (c instanceof java.sql.SQLSyntaxErrorException) {
						String msg = ((java.sql.SQLSyntaxErrorException) c).getMessage();
						throw new MCAppException(e, MBBEL0003, msg);
					}
					else if (c instanceof java.sql.SQLException) {
						throw new MCAppException(e, MBBEL0002);
					}
					c = c.getCause();
				}
				throw e;
			}

		}

		protected void setSqlBind(MCRow cndR) {
			if (isNull(up0().bind())) {
				return;
			}
			
			String[] binds = MCStringUtil.split(
							MCStringUtil.getArrayValueEscape().toCharArray()[0],
							"|", up0().bind());
			
			for (String bind : binds) {
				int i = bind.indexOf("=");
				if (i <= 0) {
					continue;
				}
				
				String bindKey = bind.substring(0, i);
				String bindVal =  bind.substring(i+1);
				if (isNull(bindVal)) {
					cndR.setStringNE(bindKey, null);
				}
				else {
					cndR.setStringNE(bindKey, bindVal);
				}
			}
		}

		/**
		 * 業務データのSQLを利用して、フレームワークに印刷処理を依頼します。
		 * 
		 * @param bizDatDlR 業務データの管理情報
		 * @param cndR 検索条件のバインド値
		 */
		protected void requestReport(MBT_BIZ_DAT_DL_R bizDatDlR, MCRow cndR) {
			MCFlexReportSet reportSet = MCFlexReportSet.create();
			_lstnr = new MCFileWriteListerner();
			reportSet.addWriteListener(_lstnr);
			MCReportInfoR infoR = reportSet.getReportInfo();
			infoR.module_id(getModuleID());
			infoR.report_id(bizDatDlR.biz_dat_id());
			infoR.form_file_name(bizDatDlR.form_file_nm());
			infoR.cartridge(bizDatDlR.cartridge());

			if (bizDatDlR.dwnld_flg()) {
				// 帳票をダウンロード→保存するための印刷情報設定
				infoR.reportType(MCReportType.CLIENT_SERVER);
				infoR.register(false);
				if (MAC_BIZ_DAT_FILE_TYP.isEXCEL(up0().biz_dat_file_typ())) {
					infoR.save_file(true);
					infoR.save_file_name(getCltFilePath());
					infoR.print_exec(false);
					infoR.confirm(false);
					infoR.preview(false);
				}
			}

			MCServerReportManager.requestImmediate(reportSet, bizDatDlR.sql_src(), cndR);
			down2().all_cnt(reportSet.size());

			if (reportSet.size() == 0) {
				MCMessagePool.add(msgNoPrintData());
			}
		}

		protected void doSearchMainSqlSrc(MBT_BIZ_DAT_DL_R bizDatDlR) {
			// 業務データ取得区分がSQL_SRCの場合は未実装
		}

		protected void doSearchMainRsc(MBT_BIZ_DAT_DL_R bizDatDlR) {
			// 業務データ取得区分がRSCの場合は未実装
		}

		@Override
		protected void postOfSwitcherForDL() {
			super.postOfSwitcherForDL();

			if (_switcher == null) {
				return;
			}
			if (!down0().isEmpty()) {
				updBizDatDlHst(_hstNo, null, null, MCDate.now(), null,
						MCNumber.valueOf(down0().size()), null,
						MAC_BIZ_DAT_DL_STS_TYP.DOWNLOAD.value(), true,
						MAC_BIZ_DAT_FILE_TYP.SCREEN.value());
			}
		}

		@Override
		protected void postOfRepForDL() {
			if (!isOutputReport()) {
				super.postOfRepForDL();
				return;
			}

			// Update BizData Download Histories
			List<MCReportSet> reportSetL = _lstnr.getReportSetList();

			String path = getCltFilePath();
			String fileType = null;
			boolean isReport = MAC_BIZ_DAT_FILE_TYP.isREPORT(up0().biz_dat_file_typ());

			if (isReport) {
				fileType = MAC_BIZ_DAT_FILE_TYP.REPORT.value();
			}
			else {
				File f = new File(path);
				fileType = getFileTyp(f.getName());
			}

			if (reportSetL.size() == 0) {
				// ファイルをダウンロードしないので、失敗扱いとする。
				updBizDatDlHst(_hstNo, null, null, null, null, null, null,
						MAC_BIZ_DAT_DL_STS_TYP.ERROR.value(), true, fileType);
			}
			else {
				java.util.stream.IntStream.range(0, reportSetL.size())
						.forEachOrdered(i -> {
							if (isReport) {
								updBizDatReportHst(reportSetL.get(i), i);
							}
							else {
								updBizDatDlHst(reportSetL.get(i), path, i);
							}
						});
			}
		}

		/**
		 * @return 「帳票出力もしくは帳票出力したファイルのダウンロード」を行うかどうか
		 */
		protected boolean isOutputReport() {
			return MAC_BIZ_DAT_FILE_TYP.isREPORT(up0().biz_dat_file_typ())
			|| (MAC_BIZ_DAT_FILE_TYP.isEXCEL(up0().biz_dat_file_typ())
					&& getBizDatDl().dwnld_flg());
		}

		/**
		 * @return 印刷対象のデータが存在しない場合のメッセージ
		 */
		protected MCMessage msgNoPrintData() {
			return new MCMessage(MAUDL0029);
		}

		/**
		 * 業務データダウンロード履歴の管理情報を更新します。
		 * 
		 * @param r 帳票データ
		 * @param dwnldPath クライアントで指定されたダウンロードパス
		 * @param cnt 帳票データの連番
		 */
		protected void updBizDatDlHst(MCReportSet r, String dwnldPath, int cnt) {
			MCReportInfoR infoR = r.getReportInfo();
			String newhstNo = (cnt == 0 ? _hstNo : getHstNo());
			String fileNm = new File(FileInfo.getRevPath(getCltFilePath(), cnt))
					.getName();
			String status = null;
			String fileTyp = null;
			MCBinary bin = null;
			long filesize = 0;

			if (isSame(infoR.cartridge(), "Excel")) {
				// Excelは再ダウンロード不可
				bin = infoR.data_file();
				status = MAC_BIZ_DAT_DL_STS_TYP.DOWNLOAD.value();
				fileTyp = MAC_BIZ_DAT_FILE_TYP.EXCEL.value();
				filesize = (bin == null) ? 0 : bin.toFile().length();
			}
			else {
				bin = infoR.save_file_bin();
				status = MAC_BIZ_DAT_DL_STS_TYP.SUCCESS.value();
				fileTyp = MAC_BIZ_DAT_FILE_TYP.CSV.value();
				filesize = (bin == null) ? 0 : bin.toFile().length();

				MAUDC_BizDatDLEnv.DownDLInfo dlInfo = MAUDC_BizDatDLEnv.getDownDLInfo();
				dlInfo.setFuncName(getDLFuncName());
				dlInfo.setFileName(fileNm);
				dlInfo.setFileSeq(cnt);
				dlInfo.overWrite(cnt == 0 ? true : false);
				dlInfo.setHstNo(newhstNo);
				dlInfo.setReqSrcId(mcframe.serverCore.sys.MCSys.request.reqSrcId());

				infoR.data_file(bin);
				infoR.locale(mcframe.serverCore.sys.MCSys.user.locale().toString());
				infoR.cartridge(CltDLInfo.CRTG);
				infoR.print_exec(false);
				infoR.save_file(true);
				infoR.save_file_name(dwnldPath == null ? null
						: new File(new File(dwnldPath).getParent(), fileNm).getPath());
				infoR.option(dlInfo.getParam());
			}

			// update history
			if (bin == null) {
				// 印刷処理で何らかの例外発生
				updBizDatDlHst(_hstNo, null, null, null, null, null, null,
						MAC_BIZ_DAT_DL_STS_TYP.ERROR.value(), true, fileTyp);

				if (isSame(infoR.cartridge(), CltDLInfo.CRTG)) {
					// クライアントのカートリッジでPDFダウンロードさせないように
					MCException e = new MCException(MAUDL0010);
					e.setCauseMessageList(MCMessagePool.getMessageList());
					throw e;
				}
			}
			else {
				updBizDatDlHst(_hstNo, newhstNo, fileNm, MCDate.now(), bin,
						MCNumber.valueOf(r.size()),
						MCNumber.valueOf(filesize).divide(MCNumber.valueOf(1024))
								.setScale(0, MCNumber.ROUND_UP),
						status, cnt == 0, fileTyp);
			}
		}

		protected void updBizDatReportHst(MCReportSet r, int cnt) {
			String newhstNo = (cnt == 0 ? _hstNo : getHstNo());
			updBizDatDlHst(_hstNo, newhstNo, null, MCDate.now(), null,
					MCNumber.valueOf(r.size()), null,
					MAC_BIZ_DAT_DL_STS_TYP.DOWNLOAD.value(), cnt == 0,
					MAC_BIZ_DAT_FILE_TYP.REPORT.value());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			MBT_BIZ_DAT_DL_R bizDatDlR = getBizDatDl();
			// 対応するデータがない場合はリターン
			if (isNull(bizDatDlR.biz_dat_id())) {
				return;
			}

			// 業務データ取得区分ごとに検索結果の編集処理
			if (MAC_BIZ_DAT_GET_TYP.isOPE(bizDatDlR.biz_dat_get_typ())) {
				editListMainOpe();
			}
			else if (MAC_BIZ_DAT_GET_TYP.isSQL_REG(bizDatDlR.biz_dat_get_typ())) {
				editListMainSqlReg();
			}
			else if (MAC_BIZ_DAT_GET_TYP.isSQL_SRC(bizDatDlR.biz_dat_get_typ())) {
				editListMainSqlSrc();
			}
			else if (MAC_BIZ_DAT_GET_TYP.isRSC(bizDatDlR.biz_dat_get_typ())) {
				editListMainRsc();
			}
		}

		protected void editListMainOpe() {
			// 業務データ取得区分がOPEの場合は未実装
		}

		protected java.util.Map<String, String> _colMap = new java.util.LinkedHashMap<String, String>();
		protected java.util.Map<String, String> _typMap = new java.util.LinkedHashMap<String, String>();

		protected boolean _initColMap = false;

		protected void editListMainSqlReg() {
			if (down0().isEmpty()) {
				return;
			}
			initColMap();
			setDLerLbls();

			Prnt01_RsltR protoR = down0().get(0);
			for (Prnt01_RsltR r : down0()) {
				for (String col : _colMap.keySet()) {
					String tmpCol = _colMap.get(col);
					if (r.getValueNE(tmpCol) == null) {
						if (col.startsWith("disp_str")) {
							r.setStringNE(col, null);
						}
						else if (col.startsWith("disp_dt")) {
							r.setDateNE(col, null);
						}
						else if (col.startsWith("disp_num")) {
							r.setNumberNE(col, null);
						}
						continue;
					}
					MCDataType type = protoR.getDataType(tmpCol);
					if (type == MCDataType.BOOLEAN) {
						r.setStringNE(col, r.getBooleanNE(tmpCol) ? "1" : "0");
					}
					else if (type == MCDataType.DATE) {
						r.setDateNE(col, r.getDateNE(tmpCol));
					}
					else if (type == MCDataType.NUMBER) {
						r.setNumberNE(col, r.getNumberNE(tmpCol));
					}
					else if (type == MCDataType.STRING) {
						r.setStringNE(col, r.getStringNE(tmpCol));
					}
					else if (type == MCDataType.TIMESTAMP) {
						r.setDateNE(col, r.getTimestampNE(tmpCol).toMCDate());
					}
				}
				java.util.ArrayList<String> dataL = new java.util.ArrayList<>();
				for (String col : _typMap.keySet()) {
					if (r.getValueNE(col) == null) {
						dataL.add(null);
					}
					else {
						if (isSame(_typMap.get(col),"D")) {
							Comparable<?> v = r.getValueNE(col);
							if (v instanceof MCDate) {
								dataL.add(r.getDateNE(col).toString("yyyyMMddHHmmss"));
							}
							else {
								dataL.add(r.getTimestampNE(col).toString("yyyyMMddHHmmss"));
							}
						}
						else {
							dataL.add(r.getValueNE(col).toString());
						}
					}
				}
				r.add_col_data(MCStringUtil.arrayValueJoin(dataL.toArray(new String[0])));
			}
		}

		protected void initColMap() {
			if (_initColMap) {
				return;
			}

			int strColCnt = 1;
			int dtColCnt = 1;
			int numColCnt = 1;
			Prnt01_RsltR protoR = down0().get(0);
			for (String tmpCol : protoR.getTempNameArray()) {
				if (protoR.getDataType(tmpCol) == MCDataType.BINARY) {
					// 対応しない
					continue;
				}
				else if (protoR.getDataType(tmpCol) == MCDataType.BOOLEAN) {
					if (strColCnt > 200) {
						_typMap.put(tmpCol, "S");
					}
					String col = "disp_str" + lpad(strColCnt++, 3, "0");
					_colMap.put(col, tmpCol);
				}
				else if (protoR.getDataType(tmpCol) == MCDataType.DATE) {
					if (dtColCnt > 10) {
						_typMap.put(tmpCol, "D");
					}
					String col = "disp_dt" + lpad(dtColCnt++, 3, "0");
					_colMap.put(col, tmpCol);
				}
				else if (protoR.getDataType(tmpCol) == MCDataType.NUMBER) {
					if (numColCnt > 10) {
						_typMap.put(tmpCol, "N");
					}
					String col = "disp_num" + lpad(numColCnt++, 3, "0");
					_colMap.put(col, tmpCol);
				}
				else if (protoR.getDataType(tmpCol) == MCDataType.ROW) {
					// 対応しない
					continue;
				}
				else if (protoR.getDataType(tmpCol) == MCDataType.STRING) {
					if (strColCnt > 200) {
						_typMap.put(tmpCol, "S");
					}
					String col = "disp_str" + lpad(strColCnt++, 3, "0");
					_colMap.put(col, tmpCol);
				}
				else if (protoR.getDataType(tmpCol) == MCDataType.TIMESTAMP) {
					if (dtColCnt > 10) {
						_typMap.put(tmpCol, "D");
					}
					String col = "disp_dt" + lpad(dtColCnt++, 3, "0");
					_colMap.put(col, tmpCol);
				}
			}
			for (String col : _colMap.keySet()) {
				down1().setStringNE(col + "_lbl", _colMap.get(col));
			}
			_initColMap = true;
			java.util.ArrayList<String> lblL = new java.util.ArrayList<>();
			java.util.ArrayList<String> typL = new java.util.ArrayList<>();
			java.util.ArrayList<String> colL = new java.util.ArrayList<>();
			java.util.ArrayList<String> sortL = new java.util.ArrayList<>();
			strColCnt = 200;
			dtColCnt = 10;
			numColCnt = 10;
			for (String col : _colMap.keySet()) {
				sortL.add(col);
			}
			for (String col : _typMap.keySet()) {
				lblL.add(col);
				typL.add(_typMap.get(col));
				if (isSame(_typMap.get(col), "S")) {
					String dispCol = "disp_str" + lpad(++strColCnt, 3, "0");
					colL.add(dispCol);
				}
				else if (isSame(_typMap.get(col), "D")) {
					String dispCol = "disp_dt" + lpad(++dtColCnt, 3, "0");
					colL.add(dispCol);
				}
				else if (isSame(_typMap.get(col), "N")) {
					String dispCol = "disp_num" + lpad(++numColCnt, 3, "0");
					colL.add(dispCol);
				}
			}
			down1().add_col_lbl(MCStringUtil.arrayValueJoin(lblL.toArray(new String[0])));
			down1().add_col_typ(MCStringUtil.arrayValueJoin(typL.toArray(new String[0])));
			down1().add_col_nm(MCStringUtil.arrayValueJoin(colL.toArray(new String[0])));
			down1().sort_info(MCStringUtil.arrayValueJoin(sortL.toArray(new String[0])));
		}

		protected void editListMainSqlSrc() {
			// 業務データ取得区分がSQL_SRCの場合は未実装
		}

		protected void editListMainRsc() {
			// 業務データ取得区分がRSCの場合は未実装
		}

		protected boolean _initDLerLbls = false;

		protected void setDLerLbls() {
			BizDatDLer dler = _switcher.getDLer();
			if (_initDLerLbls) {
				return;
			}
			if (!isMiningDL() && _initColMap) {
				boolean dispHms = mcframe.serverCore.resource.MCConst.app.getBoolean("MB.MBBEL0040.fmt.date.disp_hms", false);
				java.util.List<String> lblL = new java.util.ArrayList<>();
				java.util.List<String> colL = new java.util.ArrayList<>();
				java.util.Map<String, String> fmtMap = new java.util.HashMap<String, String>();
				for (String col : _colMap.keySet()) {
					lblL.add(_colMap.get(col));
					colL.add(col);
					if (col.startsWith("disp_dt")) {
						if (dispHms) {
							fmtMap.put(col, mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
						}
						else {
							fmtMap.put(col, mcframe.commonMA.meta.MA_META.DT_FORMAT);
						}
					}
				}
				dler.setHdrLbls(lblL.toArray(new String[0]));
				dler.setDatCols(colL.toArray(new String[0]));
				for (java.util.Map.Entry<String, String> e : fmtMap.entrySet()) {
					dler.setFmt(e.getKey(), e.getValue());
				}
			}
			_initDLerLbls = true;
		}

		@Override
		protected void doEditDown(MCContainer container) {
			//何もしない
		}
	}

	/**
	 * 印刷に使用されたReportSetを取得するためのリスナです。</p>
	 * 
	 * 帳票カートリッジにSVFが選択された場合は、PDFが複数生成される可能性があります。<br>
	 * こうした場合に生成された単位で情報を保持できるようにします。
	 * なお、複数生成されるかどうかは帳票出力設定マスタの設定に依存します。
	 */
	protected class MCFileWriteListerner
			extends mcframe.commonCore.report.MCFileWriteListener {

		private List<MCReportSet> _reportSetL = new ArrayList<>();

		@Override
		public void initWrite(MCReportFile rf) {
			_reportSetL.add(rf.getReportSet());
			super.initWrite(rf);
		}

		public List<MCReportSet> getReportSetList() {
			return _reportSetL;
		}

	}

	//FMCB CUSTOM END
}