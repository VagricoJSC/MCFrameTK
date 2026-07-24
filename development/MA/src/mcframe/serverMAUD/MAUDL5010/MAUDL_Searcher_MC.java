package mcframe.serverMAUD.MAUDL5010;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRowComparator;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportType;
import mcframe.commonCore.resource.ctrl.MCCustomResource;
import mcframe.commonCore.sys.MCClientOperation;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv;
import mcframe.serverCore.mining.IfMCMiningOperation;
import mcframe.serverCore.acl.MCACLManager;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.push.MCServerPushManager;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverCore.report.MCReportConf;
import mcframe.serverCore.requester.report.MCReportDecorator;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil;
import mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
import static mcframe.serverMAUD.MAUDL5010.MAUDL_BizDatDLer.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonCore.lang.*;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import mcframe.serverMA.dbc.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;


/**
 * "MAUDL_Searcher"ロジッククラスです。<p>
 *
 */
public abstract class MAUDL_Searcher_MC extends MAUDL_Operation implements IfMCMiningOperation {

	/**
	 * Switcher（検索とファイルダウンロードの切替ユーティリティ）<p>
	 */
	protected SrchDLSwitcher<? extends MCRow> _switcher = null;

	/**
	 * ファイルダウンロード制御用のリソース<p>
	 */
	protected MCBizDatDLResource _dlRes = null;
	
	/**
	 * 変更前の論理削除フラグ制御有無の値<p>
	 */
	protected String _orgDelFlgCtl = null;

	/**
	 * 変更前のリリースフラグ制御有無の値<p>
	 */
	protected String _orgReleaseFlgCtl = null;

	@Override
	protected void call() {
		setDelFlgCtl(isDelFlgCtl());
		setReleaseFlgCtl(isReleaseFlgCtl());
		try {
			super.call();
		}
		catch (Exception e) {
			if (isBizDatDL()) {
				File f = new File(getCltFilePath());
				updBizDatDlHst(_hstNo, null, null, null, null, null, null, MAC_BIZ_DAT_DL_STS_TYP.ERROR.value(),
						true, getFileTyp(f.getName()));
			}
			throw e;
		}
		finally {
			rvrsDelFlgCtl();
			rvrsReleaseFlgCtl();
			clearisMiningDL();
			releaseHstDBTran();
		}
	}

	/**
	 * 論理削除フラグ制御のオン・オフを取得します。<p>
	 * デフォルトではfalseを返します。<p>
	 */
	protected boolean isDelFlgCtl() {
		return false;
	}

	/**
	 * 論理削除フラグ制御のオン・オフを設定します。<p>
	 * @param flg 論理削除フラグ制御のオン・オフ<p>
	 */
	protected void setDelFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		sql(createSqlId("MAUDL5010", "MAPA_CONTEXT$F_GET_DEL_FLG_CTL", "MAUDL_Searcher_setDelFlgCtl"))
		.mainQuery().select(
				MABCFunction.MAPA_CONTEXT$F_GET_DEL_FLG_CTL().as("del_flg_ctl")
				).executeQuery(r);
		_orgDelFlgCtl = r.getString("del_flg_ctl");
		r.setString("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId("MAUDL5010", procid, "MAUDL_Searcher_setDelFlgCtl")
				, procid, r, ":del_flg_ctl");
	}

	/**
	 * リリースフラグ制御のオン・オフを取得します。<p>
	 * デフォルトではfalseを返します。<p>
	 */
	protected boolean isReleaseFlgCtl() {
		return false;
	}

	/**
	 * リリースフラグ制御のオン・オフを設定します。<p>
	 * @param flg リリースフラグ制御のオン・オフ<p>
	 */
	protected void setReleaseFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		sql(createSqlId("MAUDL5010", "MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL", "MAUDL_Searcher_setReleaseFlgCtl"))
		.mainQuery().select(
				MABCFunction.MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL().as("release_flg_ctl")
				).executeQuery(r);
		_orgReleaseFlgCtl = r.getString("release_flg_ctl");
		r.setString("release_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		execProc(createSqlId("MAUDL5010", procid, "MAUDL_Searcher_setReleaseFlgCtl")
				, procid, r, ":release_flg_ctl");
	}

	/**
	 * 論理削除フラグ制御のオン・オフを戻す。<p>
	 */
	protected void rvrsDelFlgCtl() {
		MCRow r = MCRow.create();
		r.addStringColumn("del_flg_ctl", _orgDelFlgCtl);
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId("MAUDL5010", procid, "MAUDL_Searcher_rvrsDelFlgCtl")
				, procid, r, ":del_flg_ctl");

	}

	/**
	 * リリースフラグ制御のオン・オフを戻す。<p>
	 */
	protected void rvrsReleaseFlgCtl() {
		MCRow r = MCRow.create();
		r.addStringColumn("release_flg_ctl", _orgReleaseFlgCtl);
		String procid = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		execProc(createSqlId("MAUDL5010", procid, "MAUDL_Searcher_rvrsReleaseFlgCtl")
				, procid, r, ":release_flg_ctl");

	}

	/**
	 * 初期処理を行います。<p>
	 */
	@Override
	void init() {
		super.init();
		initForDL();
		initSearch();
		if (isBizDatDL()) {
			initForBizDatDL();
		}
		if (isBizDatScreenOrReport()) {
			initForBizDatScreenOrReport();
		}
	}

	/**
	 * ファイルダウンロードの初期処理を行います。<p>
	 */
	protected void initForDL() {
		getReqInfoForDL().setInitOpeInfo(getOperationInfo());
	}

	/**
	 * ファイルダウンロード制御用のリクエスト情報を取得します。<p>
	 */
	protected MAUDC_BizDatDLEnv.RequestInfo getReqInfoForDL() {
		return object(BIZ_DAT_DL_ENV_CLAZZ).getRequestInfo();
	}

	/**
	 * 検索の前処理を実行します。<p>
	 */
	protected void initSearch() {
		int i = 0;
		while (up(i) != null) {
			doCompTime(up(i++), true);
		}
	}

	/**
	 * 履歴作成用のトランザクション.<p>
	 */
	protected MCDBTransaction _hstDBTran;

	/**
	 * 履歴作成用トランザクションを取得します。<p>
	 * トランザクションが開始していない場合は新しいデータベーストランザクションを作成します。
	 * @return 履歴作成用トランザクション
	 */
	protected MCDBTransaction getHstDBTran() {
		if (_hstDBTran == null) {
			_hstDBTran = MCTransactionManager.createDBTran(false);
		}
		return _hstDBTran;
	}

	/**
	 * トランザクションを開放します。<p>
	 */
	protected void releaseHstDBTran() {
		if (_hstDBTran != null) {
			MCTransactionManager.releaseDBTran(_hstDBTran);
		}
	}

	/**
	 * 業務データダウンロード履歴ＮＯ.<p>
	 */
	protected String _hstNo = null;

	/**
	 * 業務データダウンロード実行履歴登録.
	 */
	protected void initForBizDatDL() {
		MCTransactionManager.setCurrentDBTran(getHstDBTran());
		try {
			_hstNo = getStrSeq(MAC_NUM_SYS_TYP.BIZ_DAT_DL_HST);
			File f = new File(getCltFilePath());
	
			MAT_BIZ_DAT_DL_HST_R dbc = MAT_BIZ_DAT_DL_HST_R.create();
			String sqlid = createSqlId("MAUDL5010", dbc, "MAUDL_Searcher_I01");
			dbc.biz_dat_dl_hst_no(_hstNo);
			dbc.proc_st_tm(MCDate.now());
			dbc.biz_dat_dl_sts_typ(MAC_BIZ_DAT_DL_STS_TYP.RUNNING.value());
			dbc.biz_dat_id(((MCRow)up(0)).getStringNE("biz_dat_id"));
			String bind = ((MCRow)up(0)).getStringNE("bind");
			int bindMaxLength = mcframe.commonMA.meta.MA_META.SQL_BIND.length();
			if (!isNull(bind) && bind.length() > bindMaxLength) {
				bind = bind.substring(0, bindMaxLength);
			}
			dbc.biz_dat_dl_cond(bind);
			dbc.usr_cd(MCSys.user.ID());
			dbc.dl_file_path(f.getParent());
			dbc.dl_file_nm(f.getName());
			dbc.biz_dat_file_typ(getFileTyp(f.getName()));
			
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			dbInsertEx(sqlid, dbc, builder);

			dbTran().commit();
		}
		finally {
			MCTransactionManager.returnedCurrentDBTran();
		}
	}

	protected void initForBizDatScreenOrReport() {
		MCTransactionManager.setCurrentDBTran(getHstDBTran());
		try {
			_hstNo = getStrSeq(MAC_NUM_SYS_TYP.BIZ_DAT_DL_HST);

			MAT_BIZ_DAT_DL_HST_R dbc = MAT_BIZ_DAT_DL_HST_R.create();
			String sqlid = createSqlId("MAUDL5010", dbc, "MAUDL_Searcher_I01");
			dbc.biz_dat_dl_hst_no(_hstNo);
			dbc.proc_st_tm(MCDate.now());
			dbc.biz_dat_dl_sts_typ(MAC_BIZ_DAT_DL_STS_TYP.RUNNING.value());
			dbc.biz_dat_id(((MCRow)up(0)).getStringNE("biz_dat_id"));
			String bind = ((MCRow)up(0)).getStringNE("bind");
			int bindMaxLength = mcframe.commonMA.meta.MA_META.SQL_BIND.length();
			if (!isNull(bind) && bind.length() > bindMaxLength) {
				bind = bind.substring(0, bindMaxLength);
			}
			dbc.biz_dat_dl_cond(bind);
			dbc.usr_cd(MCSys.user.ID());
			String FileTyp = ((MCRow) up(0)).getStringNE("biz_dat_file_typ");
			if (!isNull(FileTyp)) {
				dbc.biz_dat_file_typ(FileTyp);
			}
			else {
				dbc.biz_dat_file_typ(MAC_BIZ_DAT_FILE_TYP.SCREEN.value());
			}
			
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			dbInsertEx(sqlid, dbc, builder);

			dbTran().commit();
		}
		finally {
			MCTransactionManager.returnedCurrentDBTran();
		}
	}

	/**
	 * 業務データダウンロード実行履歴更新.<p>
	 * 更新フラグがfalseの場合はnewHstNoで業務データダウンロード実行履歴を登録します。
	 * 
	 * @param baseHstNo 業務データダウンロード履歴ＮＯ
	 * @param newHstNo New業務データダウンロード履歴ＮＯ
	 * @param newFileNm ダウンロードファイル名
	 * @param endTm 処理終了日時
	 * @param bin ダウンロードファイル
	 * @param cnt データ件数
	 * @param size ファイル容量
	 * @param status 業務データダウンロード実行状況区分
	 * @param updFlg 更新フラグ
	 */
	protected void updBizDatDlHst(String baseHstNo, String newHstNo, String newFileNm, MCDate endTm, MCBinary bin, MCNumber cnt, MCNumber size, String status, boolean updFlg, String fileTyp) {
		MCTransactionManager.setCurrentDBTran(getHstDBTran());
		try {
			MAT_BIZ_DAT_DL_HST_R dbc = MAT_BIZ_DAT_DL_HST_R.create();
			String sqlid_s = createSqlId("MAUDL5010", dbc, "MAUDL_Searcher_S01");
			String sqlid_u = createSqlId("MAUDL5010", dbc, "MAUDL_Searcher_U01");
			String sqlid_i = createSqlId("MAUDL5010", dbc, "MAUDL_Searcher_I02");
			dbc.biz_dat_dl_hst_no(baseHstNo);
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			// #dbSelectKeyForUpdateNoWait(sqlid, result, builder, bind)
			// bindは参照のみ。resultに検索結果がセットされる。
			if (dbSelectKeyForUpdateNoWait(sqlid_s, dbc, builder, dbc) == 0) {
				return;
			}
			dbc.proc_end_tm(endTm);
			dbc.file_bin(bin);
			dbc.data_cnt(cnt);
			dbc.file_size(size);
			dbc.biz_dat_dl_sts_typ(status);
			dbc.biz_dat_file_typ(fileTyp);
	
			if (updFlg) {
				builder.setSet(
					dbc.proc_end_tm,
					dbc.biz_dat_dl_sts_typ,
					dbc.data_cnt,
					dbc.file_size,
					dbc.file_bin,
					dbc.biz_dat_file_typ);
				dbUpdateKey(sqlid_u, dbc, builder);
			}
			else {
				dbc.biz_dat_dl_hst_no(newHstNo);
				dbc.dl_file_nm(newFileNm);
				dbInsertEx(sqlid_i, dbc, builder);
			}
			dbTran().commit();
		}
		finally {
			MCTransactionManager.returnedCurrentDBTran();
		}
	}
	
	/**
	 * 業務データダウンロード履歴ＮＯ発番
	 * @return 業務データダウンロード履歴ＮＯ
	 */
	protected String getHstNo() {
		MCTransactionManager.setCurrentDBTran(getHstDBTran());
		try {
			return getStrSeq(MAC_NUM_SYS_TYP.BIZ_DAT_DL_HST);
		}
		finally {
			MCTransactionManager.returnedCurrentDBTran();
		}
	}

	/**
	 * 処理を実行します。<p>
	 */
	@Override
	protected void doIt() {
		if (isBizDatDL()) {
			beforeSearchForBizDatDL();
		}
		doSearchMain();
		if (_switcher == null) {
			editListMain();
		}
		else {
			_switcher.restore();
		}
		doSearchSub();
		editListSub();
	}

	protected boolean _bizDatDL = false;
	/**
	 * 業務データダウンロードによる呼出である場合にtrueが返ります。<p>
	 */
	protected boolean isBizDatDL() {
		// 業務データダウンロード画面専用の処理
		return _bizDatDL;
	}

	/**
	 * 業務データダウンロードの場合にtrueを設定します。<p>
	 */
	public void setBizDatDL(boolean bizDatDL) {
		_bizDatDL = bizDatDL;
	}

	protected boolean _isBizDatScreenOrReport = false;
	public boolean isBizDatScreenOrReport() {
		return _isBizDatScreenOrReport;
	}
	public void setBizDatScreenOrReport(boolean isBizDatScreenOrReport) {
		_isBizDatScreenOrReport = isBizDatScreenOrReport;
	}

	/**
	 * 業務データダウンロード用の前処理を行います。<p>
	 */
	protected void beforeSearchForBizDatDL() {

	}

	/**
	 * 業務データダウンロード用の検索条件の反映を行います。<p>
	 */
	protected <R extends MCRow> void refBindForBizDatDL(R bindR) {
		// 業務データダウンロード画面専用の処理
	}

	/**
	 * 検索を実行します。<p>
	 */
	protected void doSearchMain() {

	}

	/**
	 * フェッチ方式で検索を行います。<p>
	 * @param plan MCQueryPlan
	 * @param bindR バインド変数名に対応する値が格納されたMCRow
	 * @param downL 検索結果を格納するためのMCList
	 * @param grpCols grpCols
	 * @see mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan
	 */
	protected void searchForDL(MCQueryPlan plan, MCRow bindR,
			MCList<? extends MCRow> downL, String... grpCols) {
		getSwitcher(downL).searchForDL(plan, bindR, downL, grpCols);
	}

	/**
	 * フェッチ方式で検索を行います。文字列SQL用。<p>
	 * @param sql 文字列SQL
	 * @param bindR バインド変数名に対応する値が格納されたMCRow
	 * @param downL 検索結果を格納するためのMCList
	 * @param grpCols grpCols
	 */
	protected void searchForDL(String sql, MCRow bindR,
			MCList<? extends MCRow> downL, String... grpCols) {
		getSwitcher(downL).searchForDL(sql, bindR, downL, grpCols);
	}

	/**
	 * Switcherを取得します。<p>
	 */
	protected <R extends MCRow> SrchDLSwitcher<? extends MCRow> getSwitcher(
			MCList<R> list) {
		if (_switcher == null) {
			_switcher = new SrchDLSwitcher<R>(list);
		}
		return _switcher;
	}

	/**
	 * doSearchMain()の検索結果を編集します。<p>
	 */
	protected void editListMain() {

	}

	/**
	 * 検索を実行します。<p>
	 * 但し、doSearchMain()で検索からファイルダウンロードへの切替が行われた場合は実行されません。<p>
	 */
	protected void doSearchSub() {

	}

	/**
	 * doSearchSub()の検索結果を編集します。<p>
	 */
	protected void editListSub() {

	}

	@Override
	protected void doEditDown(MCContainer container) {
		super.doEditDown(container);

		// 機能名の設定
		setFuncNm(container);
		// 時刻の補完
		doCompTime(container, false);
		// 棚・ライン無ＦＬＧ補完
		doCompStrLnNoneFlg(container);
	}

	/**
	 * 後処理を行います。<p>
	 */
	@Override
	void post() {
		super.post();
		postForDL();
	}

	/**
	 * 検索とファイルダウンロードの後処理を行います。<p>
	 */
	protected void postForDL() {
		postOfSwitcherForDL();
		postOfRepForDL();
	}

	/**
	 * Switcherの後処理を行います。<p>
	 */
	protected void postOfSwitcherForDL() {
		if (_switcher == null) {
			return;
		}
		_switcher.post();
		if (isMiningDL()) {
			List<File> fileL = _switcher.getDLer().getFileL();
			if (fileL.size() == 1) {
				getReqInfoForDL().setMiningFile(fileL.get(0));
			}
		}
	}

	/**
	 * ガジェット連携用の呼出である場合にtrueが返ります。<p>
	 */
	protected boolean isMiningDL() {
		return getReqInfoForDL().getMiningDir() != null;
	}

	/**
	 * ガジェット連携用の呼出である場合にtrueが返ります。<p>
	 */
	protected void clearisMiningDL() {		
		MCOperationInfo info = getReqInfoForDL().getInitOpeInfo();
		if (info != null && 
				isSame(info.moduleId, getOperationInfo().moduleId) &&
				isSame(info.logicId, getOperationInfo().logicId) &&
				isSame(info.operationId, getOperationInfo().operationId)) {
			getReqInfoForDL().setMiningDir(null);
		}
	}

	/**
	 * Reportの後処理を行います。<p>
	 */
	protected void postOfRepForDL() {
		if (_switcher == null) {
			return;
		}
		List<File> fileL = _switcher.getDLer().getFileL();
		if (fileL.size() > 0) {
			String path = getCltFilePath();
			for (int i = 0; i < fileL.size(); i++) {
				String name = fileL.get(i).getName();
				MCReportInfoR r = MCReportInfoR.create();
				r.reportType(MCReportType.CLIENT_SERVER);
				r.data_file(MCBinary.valueOf(fileL.get(i)));
				r.locale(MCSys.user.locale().toString());
				r.cartridge(CltDLInfo.CRTG);
				r.print_exec(false);
				r.save_file(true);
				r.save_file_name(path == null ? null : new File(
						new File(path).getParent(), name).getPath());
				MAUDC_BizDatDLEnv.DownDLInfo dlInfo =
						MAUDC_BizDatDLEnv.getDownDLInfo();
				dlInfo.setFuncName(getDLFuncName());
				dlInfo.setFileName(name);
				dlInfo.setFileSeq(i);
				dlInfo.overWrite(i == 0 ? true : false);
				dlInfo.setLimRowCnt(getLimRowCnt());
				dlInfo.setTtlCnt(_switcher.getTtlCnt());
				String hstNo = i == 0 ? _hstNo : getHstNo();
				dlInfo.setHstNo(hstNo);
				dlInfo.setReqSrcId(MCSys.request.reqSrcId());
				r.option(dlInfo.getParam());
				MCReportDecorator.addReportInfo(r);
				String typ = FileInfo.getTyp(r.save_file_name());
				String fileTyp = getFileTyp(r.save_file_name());
				int limit = 0, rowNum = dlInfo.getTtlCnt()+1;
				if (isSame(typ, FileInfo.XLS)) {
					limit = FileInfo.MAX_ROW_XLS;
				}
				else if (isSame(typ, FileInfo.XLSX)) {
					limit = FileInfo.MAX_ROW_XLSX;
				}
				if (limit > 0) {
					rowNum = rowNum > limit*(i+1) ? limit : rowNum - (limit*i) + i;
				}
				updBizDatDlHst(_hstNo, hstNo, name, MCDate.now(), MCBinary.valueOf(fileL.get(i)),
						MCNumber.valueOf(rowNum),
						MCNumber.valueOf(fileL.get(i).length()).divide(MCNumber.valueOf(1024)).setScale(0, MCNumber.ROUND_UP),
						MAC_BIZ_DAT_DL_STS_TYP.SUCCESS.value(), i == 0, fileTyp);
			}
		}
		else if (_switcher.dl()) {
			MCMessagePool.add(new MCMessage(MAUDL0405,
					getLimRowCnt(), _switcher.getTtlCnt()));
		}
	}

	protected String getFileTyp(String fileName) {
		String fileTyp = null;
		String typ = FileInfo.getTyp(fileName);
		if (isSame(typ, FileInfo.XLS) || isSame(typ, FileInfo.XLSX)) {
			fileTyp = MAC_BIZ_DAT_FILE_TYP.EXCEL.value();
		}
		else {
			fileTyp = MAC_BIZ_DAT_FILE_TYP.CSV.value();
		}
		return fileTyp;
	}

	/**
	 * 初期設定済のダウンローダを取得します。<p>
	 */
	protected <R extends MCRow> BizDatDLer getInitDLer(MCList<R> list) {
		BizDatDLer ret = new MCBizDatDLer(getSrvFilePath());
		if (list == null) {
			return ret;
		}
		if (isMiningDL()) {
			String[] cols = getReqInfoForDL().getMiningCols();
			if (cols == null && this.down(0) != null) {
				// Miningの場合、連携するCSVにカラム名が一つも指定されていないとエラーになる
				// Mining用のカラムが取得できない場合（＝件数のみ定義されている場合）
				// 下り電文を定義したリソースが取得できた場合は、いずれか1カラム設定する
				// 下り電文を定義したリソースが取得できない、あるいはリソースに項目が定義されていない場合は、コンテナの全カラム設定する
				MCBizDatDLResource res = getDLRes();
				if (res == null) {
					String[] wkCols = list.getColumnPathArray();
					ret.setHdrLbls(wkCols);
					ret.setDatCols(wkCols);
				}
				else {
					String[] arr = res.getStringArray(getDLResColKey());
					if (arr == null || arr.length == 0) {
						String[] wkCols = list.getColumnPathArray();
						ret.setHdrLbls(wkCols);
						ret.setDatCols(wkCols);
					}
					else {
						String[] wkCols = {arr[0]};
						ret.setHdrLbls(wkCols);
						ret.setDatCols(wkCols);
					}
				}
			}
			else {
				ret.setHdrLbls(cols);
				ret.setDatCols(cols);
			}
			ret.setDtFmt(null);
			ret.setTsFmt(null);
			return ret;
		}
		else {
			List<String> lblL = new ArrayList<>();
			List<String> colL = new ArrayList<>();
			Map<String, String> fmtMap = new HashMap<>();
			MCBizDatDLResource res = getDLRes();
			if (res == null) {
				return ret;
			}
			String[] arr = res.getStringArray(getDLResColKey());
			if (arr == null) {
				return ret;
			}
			for (int i = 0; i < arr.length / 2; i++) {
				String col = arr[i * 2];
				if (!isAuthCol(col)) {
					continue;
				}

				String fmt = arr[i * 2 + 1];
				colL.add(arr[i * 2]);
				if (!isNull(fmt)) {
					fmtMap.put(col, fmt);
				}
			}
			R protoR = list.createRow();
			protoR.setParamIndex(0);
			for (String col : colL) {
				lblL.add(FXUCL_ValidaterUtil.getLabel(protoR, protoR.getRealColumnPath(col), false));
			}
			ret.setHdrLbls(lblL.toArray(new String[0]));
			ret.setDatCols(colL.toArray(new String[0]));
			for (Map.Entry<String, String> e : fmtMap.entrySet()) {
				ret.setFmt(e.getKey(), e.getValue());
			}
			return ret;
		}
	}

	/**
	 * ダウンロード機能にて出力権限がある項目である場合にtrueが返ります。<p>
	 */
	protected boolean isAuthCol(String col) {
		List<String> colL = new ArrayList<>();
		colL.add(col);
		MCOperationInfo info = getReqInfoForDL().getInitOpeInfo();
		List<String> authColL = FXUCL_ValidaterUtil.getDownloadItemList(info.moduleId, info.logicId, info.operationId, colL);
		return !authColL.isEmpty();
	}

	/**
	 * サーバにおけるファイル出力パスを取得します。<p>
	 */
	protected String getSrvFilePath() {
		return new File(getSvrFileDir(), getSvrFileName()).getPath();
	}

	/**
	 * サーバにおけるファイル出力ディレクトリを取得します。<p>
	 */
	protected String getSvrFileDir() {
		File dir = null;
		if (isMiningDL()) {
			dir = getReqInfoForDL().getMiningDir();
		}
		else {
			dir = new File(MCReportFile.setSeparator(
					MCReportConf.getDataPath((String) null)) +
					File.separator + MCSys.request.serverRequestNo());
		}
		if (!dir.exists() && hasDLAuth()) {
			dir.mkdirs();
		}
		return dir.getPath();
	}

	/**
	 * ダウンロード権限がある場合にtrueが返ります。<p>
	 */
	protected boolean hasDLAuth() {
		if (isBizDatDL()) {
			return true;
		}
		if (isMiningDL()) {
			return true;
		}
		if (shouldDL() || canDL()) {
			MCACLManager mgr = MCACLManager.createClientManager();
			MCClientOperation cltOpe = MCSys.request.clientOperation();
			String mdl = cltOpe.getModuleID();
			String scr = cltOpe.getScreenID();
			String auth = CltDLInfo.AUTH;
			String func = getDLFuncName();
			return mgr.authorize(mdl, scr, auth, func);
		}
		return false;
	}

	/**
	 * ダウンロード対象機能の名称を取得します。<p>
	 */
	protected String getDLFuncName() {
		if (isBizDatDL()) {
			return null;
		}
		if (isMiningDL()) {
			MCOperationInfo info = getReqInfoForDL().getInitOpeInfo();
			String mdl = info.moduleId;
			String lgc = info.logicId;
			String ope = info.operationId;
			return MCServerPushManager.createOpeName(
					mdl, lgc, ope, MCSys.user.locale());
		}
		if (shouldDL() || canDL()) {
			return MCSys.request.args().get(UpDLInfo.FUNC);
		}
		return null;
	}

	/**
	 * ファイルダウンロード方式の場合にtrueが返ります。<p>
	 */
	protected boolean shouldDL() {
		return !isNull(getCltFilePath());
	}

	/**
	 * クライアントで指定されたファイルダウンロードパスを取得します。<p>
	 */
	protected String getCltFilePath() {
		return MCSys.request.args().get(UpDLInfo.PATH);
	}

	/**
	 * 検索からファイルダウンロードへの切替を可能とする場合にtrueが返ります。<p>
	 */
	protected boolean canDL() {
		return !isNull(getCltDefFileExt());
	}

	/**
	 * クライアントで指定されたデフォルトのファイル拡張子を取得します。<p>
	 */
	protected String getCltDefFileExt() {
		return MCSys.request.args().get(UpDLInfo.EXT);
	}

	/**
	 * サーバにおける出力ファイル名を取得します。<p>
	 */
	protected String getSvrFileName() {
		if (isMiningDL()) {
			String name = MCSys.request.serverRequestNo();
			String ext = SvrDLInfo.getMiningExt();
			return name + ext;
		}
		else {
			String path = getCltFilePath();
			if (isNull(path)) {
				String name = MCSys.request.clientRequestNo();
				String ext = getCltDefFileExt();
				if (isNull(ext)) {
					ext = FileInfo.SEP + CltDLInfo.getDefTyp();
				}
				return name + ext;
			}
			else {
				return new File(path).getName();
			}
		}
	}

	/**
	 * ファイルダウンロード制御用のリソースを取得します。<p>
	 */
	protected MCBizDatDLResource getDLRes() {
		if (_dlRes != null) {
			return _dlRes;
		}
		MCOperationInfo info = getReqInfoForDL().getInitOpeInfo();
		if (info != null) {
			String mdl = info.moduleId;
			String lgc = info.logicId;
			String pkg = MCConst.operation.getPackage(mdl, lgc);
			if (pkg != null) {
				MCBizDatDLResource cr =
						new MCBizDatDLResource(SvrDLInfo.OPE_RES);
				String path = pkg.replaceAll("\\.", "/");
				try {
					cr.loadInit(null, path, MCSys.user.locale());
					_dlRes = cr;
				}
				catch (Exception e) {
					// リソースがない場合でもエラーとはしない
				}
			}
		}
		return _dlRes;
	}

	/**
	 * ファイルダウンロード制御用のリソースのカラム情報に対応するキーを取得します。<p>
	 */
	protected String getDLResColKey() {
		MCOperationInfo info = getReqInfoForDL().getInitOpeInfo();
		String mdl = info.moduleId;
		String lgc = info.logicId;
		String ope = info.operationId;
		return MCConst.createKey(mdl, lgc, ope, SvrDLInfo.COLUMN);
	}

	/**
	 * コンテナへの格納上限行数を取得します。<p>
	 */
	protected int getLimRowCnt() {
		MCNumber num = MCSys.request.limitDLSize();
		if (num == null || num.lt(0)) {
			return -1;
		}
		else {
			return num.intValueExact();
		}
	}

	@Override
	public void setMiningDirForDL(File file) {
		getReqInfoForDL().setMiningDir(file);
	}

	@Override
	public void setMiningColumnForDL(String[] cols) {
		getReqInfoForDL().setMiningCols(cols);
	}

	@Override
	public File getMiningFileForDL() {
		return getReqInfoForDL().getMiningFile();
	}

	/**
	 * 検索とファイルダウンロードの切替に関するユーティリティクラス<p>
	 */
	protected class SrchDLSwitcher<R extends MCRow> {

		/**
		 * 編集対象の検索結果<p>
		 */
		protected MCList<R> _editL = null;

		/**
		 * 退避した検索結果<p>
		 */
		protected MCList<R> _evacL = null;

		/**
		 * ダウンローダ<p>
		 */
		protected BizDatDLer _dler = null;

		/**
		 * コンテナへの格納上限行数<p>
		 */
		protected int _limRowCnt = 0;

		/**
		 * ダウンロードを行う権限があるか<p>
		 */
		protected boolean _dlAuth = false;

		/**
		 * 検索からファイルダウンロードへの切替が行われたか<p>
		 */
		protected boolean _dl = false;

		/**
		 * 総検索件数<p>
		 */
		protected int _ttlCnt = 0;

		/**
		 * コンストラクタ<p>
		 */
		protected SrchDLSwitcher(MCList<R> list) {
			if (list == null) {
				throw new MCAppException(MAUDL0401);
			}
			_editL = list;
			_evacL = list.createInstance();
			_dler = getInitDLer(list);
			_limRowCnt = getLimRowCnt();
			_dlAuth = hasDLAuth();
			_dl = isBizDatDL() || isMiningDL() || shouldDL() ;
		}

		/**
		 * ダウンローダを取得します。<p>
		 */
		public BizDatDLer getDLer() {
			return _dler;
		}

		/**
		 * 検索からファイルダウンロードへの切替が行われた場合にtrueが返ります。<p>
		 */
		protected boolean dl() {
			return _dl;
		}

		/**
		 * 総検索件数を取得します。<p>
		 */
		protected int getTtlCnt() {
			return _ttlCnt;
		}

		/**
		 * フェッチ方式で検索を行います。<p>
		 */
		protected void searchForDL(MCQueryPlan plan, MCRow bindR,
				MCList<? extends MCRow> list, String... grpCols) {
			if (_editL != list) {
				return;
			}
			@SuppressWarnings("unchecked")
			Class<R> rowc = (Class<R>) _editL.createRow().getClass();
			MCCursor<R> cur = getOpenCur(plan, bindR, rowc);
			MCList<R> bufL = MCList.create(rowc);
			MCRowComparator<R> cp = new MCRowComparator.ASC<R>(grpCols);
			try {
				while (hasNextL(cur, bufL, cp, plan.getSQLID())) {
					if (!_editL.isEmpty()) {
						editListMain();
						doEditDown(_editL);
						evacuate(grpCols);
					}
				}
			}
			finally {
				cur.dbCloseCur();
			}
		}
		/**
		 * フェッチ方式で検索を行います。文字列SQL用。<p>
		 */
		protected void searchForDL(String sql, MCRow bindR,
				MCList<? extends MCRow> list, String... grpCols) {
			if (_editL != list) {
				return;
			}
			@SuppressWarnings("unchecked")
			Class<R> rowc = (Class<R>) _editL.createRow().getClass();
			MCCursor<R> cur = getOpenCur(sql, bindR, rowc);
			MCList<R> bufL = MCList.create(rowc);
			MCRowComparator<R> cp = new MCRowComparator.ASC<R>(grpCols);
			try {
				while (hasNextL(cur, bufL, cp)) {
					if (!_editL.isEmpty()) {
						editListMain();
						doEditDown(_editL);
						evacuate(grpCols);
					}
				}
			}
			finally {
				cur.dbCloseCur();
			}
		}

		/**
		 * MCCursorをオープンして取得します。<p>
		 */
		protected MCCursor<R> getOpenCur(
				MCQueryPlan plan, MCRow bindR, Class<R> rowc) {
			return FXUCL_MCDbUtil.openCursor(rowc, plan, bindR);
		}

		/**
		 * MCCursorをオープンして取得します。文字列ＳＱＬ用。<p>
		 */
		protected MCCursor<R> getOpenCur(
				String sql, MCRow bindR, Class<R> rowc) {
			return dbTran().statement().openCursor(
					createSqlId("MAUDL5010", "getOpenCur", "MAUDL_Searcher_S02"), sql,
					bindR, null, MCList.create(MCRow.class), rowc);
		}

		/**
		 * 次のフェッチ結果を取得できた場合にtrueが返ります。<p>
		 */
		protected boolean hasNextL(
				MCCursor<R> cur, MCList<R> bufL, MCRowComparator<R> cp) {
			return hasNextL(cur, bufL, cp, null);
		}
		protected boolean hasNextL(
				MCCursor<R> cur, MCList<R> bufL, MCRowComparator<R> cp, String sqlid) {
			if (cur == null || bufL == null || cp == null) {
				return false;
			}
			_editL.clear();
			if (cur.dbFetch(getFetchSize(sqlid)) > 0) {
				String[] keys = cp.getKeys();
				if (keys == null || keys.length == 0) {
					_editL.addAll(cur.getList());
				}
				else {
					for (R r : cur.getList()) {
						if (!bufL.isEmpty() && cp.compare(bufL.get(0), r) != 0) {
							_editL.addAll(bufL);
							bufL.clear();
						}
						bufL.add(r);
					}
				}
				return true;
			}
			else if (!bufL.isEmpty()) {
				_editL.addAll(bufL);
				bufL.clear();
				return true;
			}
			else {
				return false;
			}
		}

		/**
		 * フェッチサイズを取得します。<p>
		 */
		protected int getFetchSize(String sqlid) {
			int size = MCConst.app.getInteger(MCConst.createKey(SvrDLInfo.FETCH_SIZE, sqlid), 0);
			if (size > 0) {
				return size;
			}
			return MCConst.app.getInteger(SvrDLInfo.FETCH_SIZE, 0);
		}

		/**
		 * 編集結果を退避します。<p>
		 */
		protected void evacuate(String... grpCols) {
			if (!_dl) {
				if (_limRowCnt < 0) {
					_evacL.addAll(_editL);
				}
				else {
					int rsdl = _limRowCnt - _evacL.size();
					if (_editL.size() <= rsdl) {
						_evacL.addAll(_editL);
					}
					else {
						append(_evacL);
						if (grpCols == null || grpCols.length == 0) {
							if (rsdl > 0) {
								_evacL.addAll(_editL.subList(0, rsdl));
							}
						}
						else {
							MCList<R>[] lArr = _editL.groupList(grpCols);
							for (MCList<R> l : lArr) {
								if (rsdl >= l.size()) {
									_evacL.addAll(l);
									rsdl -= l.size();
								}
								else {
									break;
								}
							}
						}
						_dl = true;
					}
				}
			}
			if (_dl) {
				append(_editL);
			}
		}

		/**
		 * 出力内容を追加します。<p>
		 */
		protected void append(MCList<R> list) {
			if (list == null) {
				return;
			}
			if (_dlAuth) {
				_dler.append(list);
			}
			_ttlCnt += list.size();
		}

		/**
		 * 退避を解除します。<p>
		 */
		protected void restore() {
			_editL.setAll(_evacL);
		}

		/**
		 * 後処理を行います。<p>
		 */
		protected void post() {
			if (_dl && _dlAuth) {
				_dler.out();
			}
		}

	}

	/**
	 * ファイルダウンロード制御に関するリソースクラス<p>
	 */
	protected class MCBizDatDLResource extends MCCustomResource {

		protected MCBizDatDLResource(String name) {
			super(Type.CONST, name);
		}

	}
	
	/**
	 * ダウンロードファイル出力用クラス
	 */
	private static class MCBizDatDLer extends BizDatDLer {
		protected MCBizDatDLer(String path) {
			super(path);
		}
	}

}
