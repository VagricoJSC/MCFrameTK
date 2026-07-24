package mcframe.clientMBBE.MBBEP0060;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.io.*;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.report.*;
import mcframe.clientCore.report.MCClientReportManager;
import mcframe.clientCore.report.MCReportJob;
import static mcframe.commonFSUA.FSUAC0010.FSUAC_List.*;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv_MC.UpDLInfo;
import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_SrchSQLReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_SrchSQLReg_MC extends MBBEP_SrchSQLReg_MC_A implements IfOpePanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCList<DtlR> _dtlL = null;

	/**
	 * カートリッジリストロジックのカラム名
	 */
	protected static final String[] CARTRIDGE_KEY = {
			ReportCartridgeCols.$o_cartridge, ReportCartridgeCols.$o_cartridge_type
	};
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_SrchSQLReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_SrchSQLReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBEL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Srch01Caller<P extends MBBEP_SrchSQLReg, B extends MB_MBBEL0060_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0060_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();

			_dtlL = null;
		}

		@Override
		protected void resultSuccess() {
			super.resultSuccess();

			_dtlL = exceptDeleteAndEmpty(getDtlL().clone());
		}

		@Override
		protected void show() {
			super.show();

			showSub();
		}

		protected void showSub() {
			getSqlSrcR().sql_src_org(bridge.down1().sql_src());

			if (isSame(bridge.down0().module_id(), getModuleID())
					&& isSame(bridge.down0().screen_id(), getScreenID())
					&& isSame(bridge.down0().func_actyp(), Btn_exec.getACType())) {

				getBaseR().admin_flg(true);
			}
		}
	}

	/**
	 * [MB_MBBEL0060_Srch02]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Srch02Caller<P extends MBBEP_SrchSQLReg, B extends MB_MBBEL0060_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0060_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean execConfirm() {
			//ダイアログを表示しない
			return true;
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			getDtlL().clear();
		}

		@Override
		protected void showNoDownDataMsg() {
			//ダイアログを表示しない
		}

		@Override
		protected void showMsg() {
			//ボタン実行ではないので、メッセージは出さない
		}

		@Override
		protected void setMode() {
			//何もしない
		}

		@Override
		protected void setModeNoDown() {
			//何もしない
		}

		@Override
		protected void initCaller() {
			setScreenAsync(false);
		}

	}

	/**
	 * [MB_MBBEL0060_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Ins01Caller<P extends MBBEP_SrchSQLReg, B extends MB_MBBEL0060_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBEL0060_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDtlL());
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			_dtlL = exceptDeleteAndEmpty(getDtlL().clone());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}

		@Override
		protected void show() {
			super.show();

			if (isDtlLChngd()) {
				_dtlL = exceptDeleteAndEmpty(getDtlL().clone());
				dialog(new MCMessage(MBBEP0001));
			}
		}

	}

	/**
	 * [MB_MBBEL0060_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Upd01Caller<P extends MBBEP_SrchSQLReg, B extends MB_MBBEL0060_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBEL0060_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDtlL());
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			_dtlL = exceptDeleteAndEmpty(getDtlL().clone());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}

		@Override
		protected void show() {
			super.show();

			setCndVal();

			if (isDtlLChngd()) {
				_dtlL = exceptDeleteAndEmpty(getDtlL().clone());
				dialog(new MCMessage(MBBEP0001));
			}
		}

	}

	/**
	 * [MB_MBBEL0060_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0060_Del01Caller<P extends MBBEP_SrchSQLReg, B extends MB_MBBEL0060_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MB_MBBEL0060_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MB_MBBEL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0040_Prnt01Caller<P extends MBBEP_SrchSQLReg, B extends MB_MBBEL0040_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0040_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().sql_src(getSqlSrcR().sql_src());
			bridge.up0().bind(crtBindStrForSrch());
			bridge.up0().biz_dat_file_typ(getBtnR().biz_dat_file_typ());
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Base_biz_dat_id));
			msgList.addAll(panel.checkReq(Base_biz_dat_nm));
			msgList.addAll(panel.checkReq(SqlSrc_sql_src));
		}

		@Override
		protected void clear() {
			// 実行ボタン押下時にラジオボタンがクリアされることを防ぐため、何もしない。
		}

		@Override
		protected boolean beforeExecMainWhenShouldDL() {
			// 実行ボタン押下時に表示されるファイル選択ダイアログの制御
			if (MAC_BIZ_DAT_FILE_TYP.isREPORT(bridge.up0().biz_dat_file_typ())) {
				return true;
			}
			else if (isDownloadReport()) {
				File f = MCFileChooser.showSaveDialog(getDLInitPath(), panel, getExtention());
				if (f == null) {
					return false;
				}
				param().getArgs().put(UpDLInfo.PATH, f.getPath());
				param().getArgs().put(UpDLInfo.FUNC, getDLFuncName());
				return true;
			}
			return super.beforeExecMainWhenShouldDL();
		}

		/**
		 * @return　帳票をダウンロードする設定になっているかどうか
		 */
		protected boolean isDownloadReport() {
			return MAC_BIZ_DAT_FILE_TYP.isEXCEL(bridge.up0().biz_dat_file_typ())
					&& bridge.up0().dwnld_flg();
		}

		protected String getExtention() {
			if (isNull(bridge.up0().cartridge())) {
				return null;
			}
			else if (isSame(bridge.up0().cartridge(), "SVFPDF")) {
				return "PDF";
			}
			else if (isSame(bridge.up0().cartridge(), "Excel")) {
				return "XLSX";
			}
			return null;
		}

		@Override
		protected void requestWhenShouldDL() {
			if (MAC_BIZ_DAT_FILE_TYP.isREPORT(bridge.up0().biz_dat_file_typ())) {
				MCClientReportManager.request(param(), false);
				showBackgroundDLMsg();
			}
			else {
				if (bridge.up0().dwnld_flg()) {
					// 中断時のダイアログ、Excel帳票ダウンロード時の後処理をセットする
					MCReportJob job = isSame(bridge.up0().cartridge(), "Excel")
							? MCReportJob.createServerUp(param(), AfterDwnldExcelRpt.class,
									"afterPrint", bridge.up0().cartridge())
							: MCReportJob.createServerUp(param());

					job.setConfirmMsg(new MCMessage(MBBEP0005, getCndR().biz_dat_nm()));
					MCClientReportManager.request(job, true);

					showBackgroundDLMsg();
				}
				else {
					super.requestWhenShouldDL();
				}
			}
		}

		@Override
		protected MCMessage getConfirmRequestWhenShouldDLMsg() {
			return MAC_BIZ_DAT_FILE_TYP.isREPORT(bridge.up0().biz_dat_file_typ())
					? msgPrintConfirm()
					: super.getConfirmRequestWhenShouldDLMsg();
		}

		@Override
		protected void showBackgroundDLMsg() {
			if (MAC_BIZ_DAT_FILE_TYP.isEXCEL(bridge.up0().biz_dat_file_typ())) {
				super.showBackgroundDLMsg();
			}
		}

		@Override
		protected String getDLBziDatDlId() {
			return getBaseR().biz_dat_id();
		}

		@Override
		protected String getDLBziDatDlNm() {
			return getBaseR().biz_dat_nm();
		}
	}

	/**
	 * Excel帳票ダウンロード時の後処理を実行するためのクラスです。
	 */
	public static class AfterDwnldExcelRpt {

		protected void afterPrint(MCParam p, MCException e) {
			if (e == null) {
				// MBBEP0040/MBBEP0060のRsltSmlRを取得
				MCRow row  = (MCRow)p.getContainerParam().getDownBlock(2);
				if (row.getNumber("all_cnt").eq(0)) {
					return;
				}
				// print success
				javax.swing.SwingUtilities.invokeLater(() -> MCMessageBox.dialog(null,
						getFinDLMsg(p.getReqSrcId(), p.getArgs().get(UpDLInfo.PATH))));
			}
		}

		protected MCMessage getFinDLMsg(String func, String path) {
			File f = new File(path);
			return new MCMessage(MAUDP0404, func, f.getParent(), f.getName());
		}

	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMB_MBBEL0060_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[exec]の押下時の処理
	 */
	@Override
	public void doBtn_exec(MCEventInfo info) {
		MCMessageList msgList = new MCMessageList();
		msgList.addAll(checkReq(Base_biz_dat_id));
		msgList.addAll(checkReq(Base_biz_dat_nm));
		msgList.addAll(checkReq(SqlSrc_sql_src));

		if (!isNull(getSqlSrcR().sql_src()) && !isSelectSql(getSqlSrcR().sql_src())) {
			//SQLがselect文でないならエラーを返す。
			msgList.add(new MCMessage(getSqlSrcR(), SqlSrcR.$sql_src, MBBEP0002));
		}

		if (!msgList.isEmpty()) {
			message(msgList);
			return;
		}

		_dtlL = exceptDeleteAndEmpty(getDtlL().clone());

		//SQL <> SQL_ORGならバインド変数更新
		if (!isSame(getSqlSrcR().sql_src(), getSqlSrcR().sql_src_org())) {
			callMB_MBBEL0060_Srch02();
			getSqlSrcR().sql_src_org(getSqlSrcR().sql_src());
		}

		setCndVal();

		//バインド変数が存在すれば、確認ダイアログを表示
		if (isDtlLChngd()) {
			_dtlL = exceptDeleteAndEmpty(getDtlL().clone());
			dialog(new MCMessage(MBBEP0001));
			return;
		}

		// 画面表示する場合は、検索結果表示画面に遷移
		if (MAC_BIZ_DAT_FILE_TYP.isSCREEN(getBtnR().biz_dat_file_typ())) {

			MCRow r = MCRow.create();
			r.setStringNE("biz_dat_id", getBaseR().biz_dat_id());
			r.setStringNE("biz_dat_nm", getBaseR().biz_dat_nm());
			r.setStringNE("bind", crtBindStrForSrch());
			r.setStringNE("sql_src", getSqlSrcR().sql_src());
			openPanel("MB", "MBBEP0100", T1, r);
		}
		// ファイルダウンロード、帳票出力の場合はオペレーション呼び出し
		else {
			createMB_MBBEL0040_Prnt01().execDL();
		}
	}

	protected String crtBindStr() {
		StringBuilder buf = new StringBuilder();
		for (DtlR r : getDtlL()) {
			if (!isNull(r.cond_col())) {
				buf.append(r.cond_col());
				buf.append("=");
				if (!isNull(r.cond_val())) {
					buf.append(r.cond_val());
				}
				buf.append("|");
			}
		}
		return buf.toString();
	}

	protected String crtBindStrForSrch() {
		List<String> binds = new ArrayList<>();
		
		for (DtlR r : getDtlL()) {
			if (!isNull(r.cond_col())) {
				String cnd = r.cond_col() + "=";
				if (!isNull(r.cond_val())) {
					cnd += r.cond_val();
				}
				binds.add(cnd);
			}
		}
		return MCStringUtil.join(
				MCStringUtil.getArrayValueEscape().toCharArray()[0],
				"|", binds.toArray(new String[binds.size()]));
	}
	
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMB_MBBEL0060_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMB_MBBEL0060_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMB_MBBEL0060_Del01();
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		//バインド枠のソート順を変更させない。
		DtlTable.setSortable(false);
	}

	@Override
	protected void listInit() {
		super.listInit();

		Base_module_id.setListVisibleColumn("module_id");
		Base_screen_id.setListVisibleColumn("screen_id");

		getBase_module_id_ListPutter().setColumns("module_id");
		getBase_screen_id_ListPutter().setColumns("screen_id");
		getBase_cartridge_ListPutter().setColumns(ReportCartridgeCols.outAll());
	}

	@Override
	protected void listInitCustom() {
		// XAの共通処理の仕様でリストロジックを動作させるため、listInitCustomを実行しない
	}

	@Override
	public void setAdjustWidth() {
		super.setAdjustWidth();

		// この画面ではカラムの列幅調整をすると見づらくなるので、
		// 自動列幅調整はしない。
		DtlTable.setAdjustWidth(false);
	}

	@SuppressWarnings("unchecked")
	@Override
	public MCList getBase_screen_id(MCRow row, MCEventInfo info) {
		row.addStringColumn("module_id", getBaseR().module_id());

		return super.getBase_screen_id(row, info);
	}

	//種別部品
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> l = new ArrayList<MCContainer>();
		l.add(getCndR());
		return l;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> l = new ArrayList<MCContainer>();
		l.add(getBaseR());
		l.add(getSqlSrcR());
		l.add(getDtlL());
		return l;
	}

	@Override
	protected void opePanelFillSpace() {
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getBaseR()) {
			list.add(BaseR.$biz_dat_id);
			list.add(BaseR.$biz_dat_nm);
		}
		return list;
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();

		_dtlL = null;
	}

	//ステータス
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setBaseMode();
		RegTabTab.focusActiveFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setBaseMode();
		RegTabTab.focusActiveFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setBaseMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		CndPanel.focusFirstComponent();
		setRptBtnMode();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
		setCartridgeMode();
		setRptBtnMode();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
		setRptBtnMode();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void doBase_module_id_NC(MCEventInfo info) {
		super.doBase_module_id_NC(info);

		Base_screen_id.setValue(null);
	}

	@Override
	public void doBase_admin_flg_NC(MCEventInfo info) {
		super.doBase_admin_flg_NC(info);

		if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
			setBaseMode();
			setBaseDefVal();
		}
	}

	@Override
	public void doBase_print_flg_NC(MCEventInfo info) {
		super.doBase_print_flg_NC(info);
		setRptBtnMode();
	}

	@Override
	public void doBase_dwnld_flg_NC(MCEventInfo info) {
		super.doBase_dwnld_flg_NC(info);
		setCartridgeMode();
	}

	protected void setBaseMode() {
		if (getBaseR().admin_flg()) {
			Base_module_id.setMode(MCMode.READ_ONLY);
			Base_screen_id.setMode(MCMode.READ_ONLY);
			Base_func_actyp.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Base_module_id);
			setDefaultMode(Base_screen_id);
			setDefaultMode(Base_func_actyp);
		}
		setCartridgeMode();
		setRptBtnMode();
	}

	protected void setBaseDefVal() {
		if (getBaseR().admin_flg()) {
			Base_module_id.setValue(getModuleID());
			Base_screen_id.setValue(getScreenID());
			Base_func_actyp.setValue(Btn_exec.getACType());
		}
	}

	protected void setCartridgeMode() {
		if (getBaseR().dwnld_flg()) {
			Base_cartridge.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Base_cartridge);
		}
	}

	protected void setRptBtnMode() {
		if (!getBaseR().print_flg()) {
			Btn_biz_dat_file_typ_REPORT.setMode(MCMode.READ_ONLY);
			if (Btn_biz_dat_file_typ_Group
					.getSelectedButton() == Btn_biz_dat_file_typ_REPORT) {
					Btn_biz_dat_file_typ_Group.clear();
			}
		}
		else {
			setDefaultMode(Btn_biz_dat_file_typ_Group);
		}
	}

	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().biz_dat_id(getBaseR().biz_dat_id());
			getCndR().biz_dat_nm(getBaseR().biz_dat_nm());
		}
	}

	@Override
	public MCList getCnd_biz_dat_id(MCRow row, MCEventInfo info) {
		row.setStringNE(BizDatIDCols.$i_biz_dat_get_typ,
				MAC_BIZ_DAT_GET_TYP.SQL_REG.value());

		return super.getCnd_biz_dat_id(row, info);
	}

	@Override
	public MCList getBase_cartridge(MCRow row, MCEventInfo info) {
		row.setStringNE(ReportCartridgeCols.$i_cartridge_type, MCReportConst.KEY_CLIENT);
		MCList<?> list = super.getBase_cartridge(row, info);
		return list.subList(r -> 
			r.getStringNE(ReportCartridgeCols.$i_cartridge).equalsIgnoreCase("SVFPDF")
			|| r.getStringNE(ReportCartridgeCols.$i_cartridge).equalsIgnoreCase("Excel"));
	}

	protected void checkForCallStackSub(MCMessageList msgList) {
		if (!isSelectSql(getSqlSrcR().sql_src())) {
			msgList.add(new MCMessage(getSqlSrcR(), SqlSrcR.$sql_src, MBBEP0002));
		}
	}

	protected boolean isDtlLChngd() {
		boolean chg_flg = false;

		//新規登録
		if (isNull(_dtlL)) {
			//バインド変数あり
			if (getDtlL().size() > 0) {
				chg_flg = true;
			}
			return chg_flg;
		}

		//更新、参照、参照登録
		if (_dtlL.size() != getDtlL().size()) {
			chg_flg = true;
		}
		else {
			int idx = 0;
			for (DtlR r : _dtlL) {
				if (!isSame(r.cond_col(), getDtlL().get(idx).cond_col())) {
					chg_flg = true;
					break;
				}
				idx++;
			}
		}
		return chg_flg;
	}

	protected void setCndVal() {
		MCIndexKey key = getDtlL().createIndex(DtlR.$cond_col);

		for (DtlR r : _dtlL) {
			DtlR rtrgt = getDtlL().getFirst(key, r.cond_col());
			if (!isNull(rtrgt)) {
				rtrgt.cond_val(r.cond_val());
			}
		}
	}

	/**
	 * 行コメントの接頭辞です。
	 */
	protected static final String COMMENT_HYPHEN = "--";

	/**
	 * 行コメントの接尾辞です。
	 */
	protected static final String COMMENT_HYPHEN_END = "\n";

	/**
	 * ブロックコメントの接頭辞です。
	 */
	protected static final String COMMENT_SLAASTER = "/*";

	/**
	 * ブロックコメントの接尾辞です。
	 */
	protected static final String COMMENT_SLAASTER_END = "*/";

	/**
	 * SELECT文の接頭辞です。
	 */
	protected static final String SELECT = "SELECT";

	/**
	 * WITH文の接頭辞です。
	 */
	protected static final String WITH = "WITH";

	/**
	 * SQLがSELECT文の場合trueを返します。
	 * 
	 * @param sql SQL
	 * @return SQLがSELECT文の場合true
	 */
	protected boolean isSelectSql(String sql) {
		if (isNull(sql)) {
			return false;
		}
		sql = deleteCommentLine(sql);
		if (isNull(sql) || sql.length() < SELECT.length()) {
			return false;
		}
		return sql.substring(0, SELECT.length()).equalsIgnoreCase(SELECT)
				|| sql.substring(0, WITH.length()).equalsIgnoreCase(WITH);
	}

	/**
	 * SQLの先頭にあるコメントを除去します。
	 * 
	 * @param sql SQL
	 * @return 先頭のコメントを除去したSQL
	 */
	protected String deleteCommentLine(String sql) {
		sql = sql.trim();
		if (isNull(sql)) {
			return null;
		}
		if (sql.startsWith(COMMENT_HYPHEN)) {
			int index = sql.indexOf(COMMENT_HYPHEN_END);
			if (index == -1 || index + COMMENT_HYPHEN_END.length() == sql.length()) {
				return null;
			}
			return deleteCommentLine(sql.substring(index + COMMENT_HYPHEN_END.length()));
		}
		if (sql.startsWith(COMMENT_SLAASTER)) {
			int index = sql.indexOf(COMMENT_SLAASTER_END);
			if (index == -1 || index + COMMENT_SLAASTER_END.length() == sql.length()) {
				return null;
			}
			return deleteCommentLine(
					sql.substring(index + COMMENT_SLAASTER_END.length()));
		}
		return sql;
	}

}