package mcframe.clientMBBC.MBBCP0020;

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

import mcframe.clientMAUB.MAUBP5310.*;

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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import java.io.File;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBCP_AttachmentLstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBCP_AttachmentLstReg_MC extends MBBCP_AttachmentLstReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCList<RsltR> _list = MCList.create(RsltR.class);
	protected List<MCColumnConfig> _varColConfig = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBCP_AttachmentLstReg_MC() {
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
	public MBBCP_AttachmentLstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_file]の押下時の処理
	 */
	@Override
	public void doBtn_open_file(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (null == r) {
			return ;
		}
		
		String path = null;
		try {
			Desktop desktop = Desktop.getDesktop();
			if (isIA(r)) {
				path = r.preview_url();
				if (isNull(path)) {
					dialog(new MCMessage(MABCP0020, path));
					return;
				}
				desktop.browse(new URI(path));
			}
			else {
				File f = new File(r.old_file_path(), r.old_file_nm());
				path = f.getAbsolutePath();
				desktop.open(f);
			}
		}
		catch (IllegalArgumentException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
		catch (IOException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
		catch (URISyntaxException ex) {
			dialog(new MCMessage(MABCP0020, path));
		}
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMB_MBBCL0020_Srch01();
	}
	/**
	 * [MB_MBBCL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0020_Srch01Caller<P extends MBBCP_AttachmentLstReg, B extends MB_MBBCL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBCL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			setOldFile();
		}

		protected void setOldFile() {
			for (RsltR r : bridge.down0()) {
				if (r.archive_flg()) {
					r.old_file_path(r.file_path());
					r.old_file_nm(r.file_nm());
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			_list = getRsltL().clone();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MB_MBBCL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0020_Upd01Caller<P extends MBBCP_AttachmentLstReg, B extends MB_MBBCL0020_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MB_MBBCL0020_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			for (RsltR r : getRsltL()) {
				if (!r.check()) {
					continue;
				}
				if (isNull(r.data_no()) && !r.attach_file_flg() && !r.select_file_flg()) {
					msgList.add(new MCMessage(r, null, MBBCP0001));
				}
				else if (r.attach_file_flg()) {
					// src_file_nmがNULLなら例外がでるがNULLにならない想定
					File f = new File(r.src_file_path(), r.src_file_nm());
					if (!f.exists()) {
						msgList.add(new MCMessage(r, null, MBBCP0002, r.src_file_path(),
								r.src_file_nm()));
					}
				}
			}
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();

			for (RsltR r : bridge.up0()) {
				if (r.attach_file_flg()) {
					if (!isNullOr(r.src_file_path(), r.src_file_nm())) {
						File f = new File(r.src_file_path(), r.src_file_nm());
						r.file_bin(MCBinary.valueOf(f));
					}
				}
				else if (r.select_file_flg()) {
					r.file_path(r.src_file_path());
					r.file_nm(r.src_file_nm());
				}
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setSrchStatus();
		}
	}

	/**
	 * Panel[Rslt]のボタン[attach]の押下時の処理
	 */
	@Override
	public void doRslt_attach(MCEventInfo info) {
		File f = MCFileChooser.showLoadDialog(null, this, getExtensions());
		if (f == null) {
			return;
		}
		setValueEx(columnRslt_src_file_path, info.getEventIndex(), f.getParent());
		setValueEx(columnRslt_src_file_nm, info.getEventIndex(), f.getName());
		RsltR r = getRsltL().get(info.getEventIndex());
		r.attach_file_flg(true);
		r.select_file_flg(false);
		if (r.archive_flg()) {
			r.file_nm(null);
		}
		matchExt(r);
		RsltTable.adjustWidth();
	}
	/**
	 * Panel[Rslt]のボタン[select_file]の押下時の処理
	 */
	@Override
	public void doRslt_select_file(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.fs_flg()) {
			File f = MCFileChooser.showLoadDialog(isNull(r.file_path()) ? null : new File(r.file_path()), this, getExtensions());
			if (f == null) {
				return;
			}
			setValueEx(columnRslt_src_file_path, info.getEventIndex(), f.getParent());
			setValueEx(columnRslt_src_file_nm, info.getEventIndex(), f.getName());
		}
		else {
			if (isNull(r.ext_sys_cd())) {
				return;
			}
			MCRow bind = MCRow.create();
			bind.addStringColumn("file_path", nvl(r.file_path(),"/"));
			bind.addBooleanColumn("folder_select_mode_flg", false);
			bind.addStringColumn("ext_sys_cd", r.ext_sys_cd());
			openModalPanel("MB", "MBBCP0030", T1, bind, r, RsltR.$src_file_path, RsltR.$src_file_nm);
		}
		setValueEx(columnRslt_check, info.getEventIndex(), true);
		setValueEx(columnRslt_file_path, info.getEventIndex(), null);
		setValueEx(columnRslt_file_nm, info.getEventIndex(), null);
		r.attach_file_flg(false);
		r.select_file_flg(true);
		RsltTable.adjustWidth();
	}
	/**
	 * Panel[Rslt]のボタン[save_as]の押下時の処理
	 */
	@Override
	public void doRslt_save_as(MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.fs_flg()) {
			File f = MCFileChooser.showSelectDirDialog(null, this);
			if (f == null) {
				return;
			}
			setValueEx(columnRslt_file_path, info.getEventIndex(), f.getAbsolutePath());
		}
		else {
			if (isNull(r.ext_sys_cd())) {
				return;
			}
			MCRow bind = MCRow.create();
			bind.addStringColumn("file_path", nvl(r.file_path(),"/"));
			bind.addBooleanColumn("folder_select_mode_flg", true);
			bind.addStringColumn("ext_sys_cd", r.ext_sys_cd());
			openModalPanel("MB", "MBBCP0030", T1, bind, r, RsltR.$file_path, RsltR.$file_nm);
		}
		RsltTable.adjustWidth();
	}
	protected String[] getExtensions() {
		ArrayList<String> l = new ArrayList<String>();
		for (String ext : getDocExt().split(",")) {
			l.add(ext);
		}
		return (String[])l.toArray(new String[0]);
	}
	protected String getDocExt() {
		String def = MCFileChooser.ALL;
		return getPgmSettingStringNE(this, def, "doc.ext");
	}
	/** 
	 * 添付元ファイルと保存先ファイルの拡張子を揃える
	 * */
	protected void matchExt(RsltR r) {
		if (isNullOr(r.src_file_nm(), r.file_nm())) {
			return;
		}

		String filename = r.file_nm();
		int i = r.src_file_nm().lastIndexOf(".");
		if (i != -1) {
			String ext = r.src_file_nm().substring(i);
			int j = r.file_nm().lastIndexOf(".");
			if (j == -1) {
				filename = filename + ext;
			}
			else {
				filename = filename.substring(0, j) + ext;
			}
			r.file_nm(filename);
		}
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		RsltR r = deleteRow(RsltTable);
		if (r == null || r.isStatusCreate()) {
			return;
		}
		setValueEx(columnRslt_check, r.getGUIIndex(), true);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR r = copyRow(RsltTable);
		if (r == null) {
			return;
		}
		r.src_file_path(null);
		r.src_file_nm(null);
		r.rmrks1(null);
		r.rmrks2(null);
		r.rmrks3(null);
		r.rmrks4(null);
		r.rmrks5(null);
		r.select_file_flg(false);
		r.attach_file_flg(false);
		r.data_no(null);
		r.edition(null);
		r.archive_flg(false);
		r.file_nm(null);
		r.old_file_path(null);
		r.old_file_nm(null);
		r.doc_id(null);
		r.preview_url(null);
		r.data_crud_typ(null);
		r.data_crud_typ_nm(null);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMB_MBBCL0020_Upd01();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(AttachTyp_attach_flg, true);
		setValueEx(AttachTyp_no_attach_flg, true);
	}

	protected void setSrchStatus() {
		setSRCHStatus();
	}

	protected void setRefStatus() {
		setREFStatus();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setFocus();
		setBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setFocus();
		setBtnMode();
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setColModeByFlg(MCColumnConfig col, boolean isVisible) {
		if (isVisible) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}

	protected List<MCColumnConfig> getVarColConfig() {
		if (_varColConfig == null) {
			MCColumnConfig[] arr = new MCColumnConfig[] {
					columnRslt_biz_key1, columnRslt_biz_key2, columnRslt_biz_key3,
					columnRslt_biz_key4, columnRslt_biz_key5, columnRslt_biz_key6,
					columnRslt_biz_key7, columnRslt_biz_key8, columnRslt_biz_key9,
					columnRslt_biz_key10
			};
			_varColConfig = Arrays.asList(arr);
		}
		return _varColConfig;
	}

	@Override
	public boolean doAttachTyp_attach_flg_VC(MCEventInfo info) {
		if (!super.doAttachTyp_attach_flg_VC(info)) {
			return false;
		}
		return confirmRegDataClear();
	}

	@Override
	public boolean doAttachTyp_no_attach_flg_VC(MCEventInfo info) {
		if (!super.doAttachTyp_no_attach_flg_VC(info)) {
			return false;
		}
		return confirmRegDataClear();
	}

	@Override
	public void doAttachTyp_attach_flg_NC(MCEventInfo info) {
		super.doAttachTyp_attach_flg_NC(info);
		if (!getAttachTypR().attach_flg() && !getAttachTypR().no_attach_flg()) {
			setValueEx(AttachTyp_no_attach_flg, true);
		}
		setRsltList();
	}

	@Override
	public void doAttachTyp_no_attach_flg_NC(MCEventInfo info) {
		super.doAttachTyp_no_attach_flg_NC(info);
		if (!getAttachTypR().attach_flg() && !getAttachTypR().no_attach_flg()) {
			setValueEx(AttachTyp_attach_flg, true);
		}
		setRsltList();
	}

	protected void setRsltList() {
		if (getAttachTypR().attach_flg() && getAttachTypR().no_attach_flg()) {
			getRsltL().setAll(_list.clone());
		}
		else if (getAttachTypR().attach_flg()) {
			getRsltL().setAll(_list.subList(RsltR.$archive_flg, true));
		}
		else {
			getRsltL().setAll(_list.subList(RsltR.$archive_flg, false));
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (null == r) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
		if (null == r || !r.archive_flg() && (r.isStatusNone() || r.isStatusModify())) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
		if (null == r || !r.archive_flg() || r.archive_flg() && isIA(r) && !isPdfFile(r)) {
			Btn_open_file.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_file);
		}
	}

	protected boolean isIA(RsltR r) {
		return !isNull(r.doc_id());
	}

	protected boolean isPdfFile(RsltR r) {
		return r.old_file_nm().toLowerCase().endsWith(".pdf");
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltTableCellConfig());
	}

	/**
	 * RsltTable用のCellConfigを作成します。
	 */
	protected MCCellConfig createRsltTableCellConfig() {
		return new RsltTableCellConfig();
	}

	/**
	 * RsltTable用のCellConfig
	 */
	public class RsltTableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("rawtypes")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR row = RsltTable.getRow(index);

			if (column == columnRslt_file_path || column == columnRslt_file_nm || column == columnRslt_save_as) {
				if (row.select_file_flg() || row.archive_flg() && !row.attach_file_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnRslt_biz_typ) {
				if (row.archive_flg() || !row.archive_flg() && (row.isStatusNone() || row.isStatusModify())) {
					return MCMode.READ_ONLY;
				}
			}

			return super.getPriorMode(index, column, table);
		}

	}

	/**
	 * @param panel 起動元画面
	**/
	public void screenOpen(MCRootPanel panel, Map<String, String> args) {
		MCList<RsltR> list = MCList.create(RsltR.class);
		Map<String, MCRow> rowContainerMap = new HashMap<>();
		MCList<MCRow> listContainer = setContainer(rowContainerMap, panel, args);

		if (null == listContainer) {
			// 遷移元の見出しから値を取得
			RsltR r = list.createRow();
			setSrcValue(r, args, rowContainerMap);
			list.add(r);
		}
		else {
			// 遷移元の一覧でループ
			for (MCRow row : listContainer) {
				RsltR r = list.createRow();
				rowContainerMap.put(_listContainerNm, row);
				setSrcValue(r, args, rowContainerMap);
				list.add(r);
			}
		}

		if (panel instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase) {
			((mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase) panel).editListForOpenMBBCP0020(panel, args, list);
			replaceNullToZero(list);
			replaceNullValToNull(list);
			((mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase) panel).openModalPanel("MB", "MBBCP0020", T1, null, list);
		}
	}

	protected void replaceNullToZero(MCList<RsltR> argL) {
		for (RsltR argR : argL) {
			if (isReplaceTargetBizTyp(argR)) {
				argR.amt(nvl(argR.amt(), MCNumber.ZERO));
			}
		}
	}

	protected boolean isReplaceTargetBizTyp(RsltR argR) {
		if (!MAC_BIZ_TYP.isINSP_INST(argR.biz_typ())
				&& !MAC_BIZ_TYP.isINSP_ACT(argR.biz_typ())) {
			return true;
		}
		return false;
	}

	protected void replaceNullValToNull(MCList<RsltR> argL) {
		for (RsltR argR : argL) {
			if (isSame(MAC_STR.NULL_VAL.value(), argR.bp_cd())) {
				argR.bp_cd(null);
			}
			if (isSame(MAC_STR.NULL_VAL.value(), argR.sppl_cd())) {
				argR.sppl_cd(null);
			}
		}
	}

	protected String _listContainerNm = null;
	
	protected MCList<MCRow> setContainer(Map<String, MCRow> rowMap, MCRootPanel panel, Map<String, String> args) {
		MCList<MCRow> listContainer = null;
		for (Map.Entry<String, String> e : args.entrySet()) {
			String key = e.getKey();
			String srcKey = e.getValue();
			if (isSame(key, "biz_typ")) {
				continue;
			}
			String[] keys = srcKey.split("\\.");
			if (rowMap.containsKey(keys[0])) {
				continue;
			}
			MCContainer container = panel.getContainer(keys[0]);
			if (null == container) {
				continue;
			}
			if (container instanceof MCRow) {
				rowMap.put(keys[0], (MCRow) container);
			}
			else if (container instanceof MCList) {
				if (null == _listContainerNm) {
					_listContainerNm = keys[0];
					listContainer = (MCList<MCRow>) container;
					rowMap.put(_listContainerNm, null);
				}
			}
		}
		return listContainer;
	}

	protected void setSrcValue(RsltR row, Map<String, String> args, Map<String, MCRow> rowMap) {
		for (Map.Entry<String, String> e : args.entrySet()) {
			String key = e.getKey();
			String srcKey = e.getValue();

			// 固定値のリソースキー
			if (isSame(key, "biz_typ")) {
				row.setString(key, srcKey);
				continue;
			}

			String[] keys = srcKey.split("\\.");
			MCRow src = rowMap.get(keys[0]);
			if (null == src) {
				continue;
			}

			Comparable<?> v = src.getValueNE(keys[1]);
			if (isNull(v)) {
				continue;
			}
			if (v instanceof MCDate) {
				row.setDate(key, (MCDate) v);
			}
			else if (v instanceof MCNumber) {
				if (row.getDataType(key) == MCDataType.NUMBER) {
					row.setNumber(key, (MCNumber) v);
				}
				else {
					row.setString(key, ((MCNumber) v).toString());
				}
			}
			else {
				row.setString(key, (String) v);
			}
		}
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (isSame(T1, openTyp)) {
			valueInit();

			if (args == null || args.length < 1) {
				return;
			}
			getRsltL().addAll((MCList) args[0]);
			callMB_MBBCL0020_Srch01();
		}
	}

	// ///////////////////// IfListRegPanel ///////////////////////////////////
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

}