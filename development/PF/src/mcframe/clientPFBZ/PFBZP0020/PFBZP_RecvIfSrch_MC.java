package mcframe.clientPFBZ.PFBZP0020;

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

import mcframe.clientFXBA.FXBAP0130.*;

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
import static mcframe.commonPF.notice.PF_Msg.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.HashMap;
import javax.swing.JComponent;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"PFBZP_RecvIfSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class PFBZP_RecvIfSrch_MC extends PFBZP_RecvIfSrch_MC_A implements MCResultViewerNoParam {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	// MsgのキャッシュとMsgテーブルの更新
	protected Map<DtlR, MCList<BatchLogMsgR>> _msgLCache;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public PFBZP_RecvIfSrch_MC() {
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
	public PFBZP_RecvIfSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * MCResultViewerの実装
	 * 
	 * サーバ処理確認画面からの画面遷移対応
	 */
	@Override
	public boolean notificationResultInfo(MCResultInfo info) {
		//検索処理を実行させるために別インスタンスで表示する。
		showPFBZP0020(info);
		return false;
	}

	protected void showPFBZP0020(MCResultInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("PF", "PFBZP0020");
		setupPFBZP0020AsoParam(aso, info);
		aso.show();
	}

	protected void setupPFBZP0020AsoParam(MAUCP_AppScreenOpener aso, MCResultInfo info) {
		aso.putCnd(crtOpenPFBZP0020CndR(aso, info), crtOpenPFBZP0020CndRNullCols(aso, info));
		aso.runValueInit();
		aso.putSearchAction();
	}

	protected List<String> crtOpenPFBZP0020CndRNullCols(MAUCP_AppScreenOpener aso,
			MCResultInfo info) {
		return null;
	}

	protected mcframe.clientPFBZ.PFBZP0020.CndR crtOpenPFBZP0020CndR(
			MAUCP_AppScreenOpener aso, MCResultInfo info) {
		mcframe.clientPFBZ.PFBZP0020.CndR to = mcframe.clientPFBZ.PFBZP0020.CndR.create();
		to.ins_srv_req_no(info.srvReqNo());
		to.recv_conv_ok_flg(true);
		return to;
	}

	/**
	 * [PF_PFBZL0020_Srch01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0020_Srch01Caller<P extends PFBZP_RecvIfSrch, B extends PF_PFBZL0020_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected PF_PFBZL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			
			addDownContainer(getMsgL(), getMsgAreaR());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkAtLeastOne(KndPanel));
			msgList.addAll(checkSmallLarge(Cnd_data_no_fr, Cnd_data_no_to));
			msgList.addAll(checkBeforeAfter(Cnd_sdrv_tm_fr, Cnd_sdrv_tm_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt1_fr, Cnd_attr_dt1_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt2_fr, Cnd_attr_dt2_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt3_fr, Cnd_attr_dt3_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt4_fr, Cnd_attr_dt4_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_dt5_fr, Cnd_attr_dt5_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm1_fr, Cnd_attr_tm1_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm2_fr, Cnd_attr_tm2_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm3_fr, Cnd_attr_tm3_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm4_fr, Cnd_attr_tm4_to));
			msgList.addAll(checkBeforeAfter(Cnd_attr_tm5_fr, Cnd_attr_tm5_to));
		}

		@Override
		protected void setMode() {
			super.setMode();
			setUPDStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

	}

	
	/**
	 * [PF_PFBZL0020_Srch02]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0020_Srch02Caller<P extends PFBZP_RecvIfSrch, B extends PF_PFBZL0020_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected PF_PFBZL0020_Srch02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [PF_PFBZL0020_Conv01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0020_Conv01Caller<P extends PFBZP_RecvIfSrch, B extends PF_PFBZL0020_Conv01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected PF_PFBZL0020_Conv01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setAsync(true);
		}		

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(PFBZP0001);
		}
		
		@Override
		public MCMessage msgUpdated() {
			return new MCMessage(PFBZP0002);
		}
		
		@Override
		public MCMessage msgNoUpdateData() {
			return new MCMessage(PFBZP0003);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIXStatus();
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(getDtlL().subList(DtlR.$recv_flg, true));
		}

	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callPF_PFBZL0020_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[conv]の押下時の処理
	 */
	@Override
	public void doBtn_conv(MCEventInfo info) {
		callPF_PFBZL0020_Conv01();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (DtlR row : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_recv_flg, row.getGUIIndex())) {
				setValueEx(columnDtl_recv_flg, row.getGUIIndex(), true);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (DtlR row : DtlTable.getViewRows()) {
			if (isEditable(columnDtl_recv_flg, row.getGUIIndex())) {
				setValueEx(columnDtl_recv_flg, row.getGUIIndex(), false);
			}
		}
	}

	@Override
	public void doCnd_sdrv_tm_to_NC(MCEventInfo info){
		super.doCnd_sdrv_tm_to_NC(info);
		MCDate ts = (MCDate)info.getNewValue();
		if (!isNull(getCndR().sdrv_tm_to())) {
			getCndR().sdrv_tm_to(ts.addSecond(59));
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().recv_err_flg(true);
		getCndR().recv_ok_flg(true);
		getCndR().recv_conv_err_flg(true);
		getCndR().recv_conv_ok_flg(false);	// デフォルトOFF

		setValueEx(Filter_disp_warn, true);
		setValueEx(Filter_disp_not_warn, true);
		setValueEx(Filter_disp_start_log, true);
		setValueEx(Filter_disp_data_log, true);
		setValueEx(Filter_disp_proc_log, true);
		setValueEx(Filter_disp_end_log, true);
	}
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (isSame(openTyp, T1)) {
			String batchLogNo = bind.getStringNE("batch_log_no");
			if (!isNull(batchLogNo)) {
				MCTextField comp = getBatchLogNoBeans();
				if (comp != null) {
					setValueEx(comp, batchLogNo);
					valueInit();
					getCndR().recv_conv_ok_flg(true);
					callPF_PFBZL0020_Srch01();
				}
			}
		}
	}

	protected MCTextField getBatchLogNoBeans() {
		JComponent comp = getComponent(getCndR(), "batch_log_no");
		if (comp instanceof MCTextField) {
			return (MCTextField) comp;
		}
		return null;
	}

	@Override
	public void setSortColumn() {
		super.setSortColumn();
		DtlTable.addSortColumn(columnDtl_if_proc_typ, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_ext_sys_cd, SortType.ASC);
		DtlTable.addSortColumn(columnDtl_data_no, SortType.ASC);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		Ctrl_ctrl_PPanel.expand(false);
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	protected DtlTableCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	protected class DtlTableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		protected MCMode getDefaultMode(int index, MCColumnConfig column, MCTable table) {
	
			DtlR dtlR = getDtlL().get(index);
			if (column == columnDtl_recv_flg
			 && !execCallRecvIf(dtlR)) {
				return MCMode.READ_ONLY;
			}

			return super.getDefaultMode(index, column, table);
		}
	}
	
	protected boolean execCallRecvIf(DtlR dtlR) {
		return MAC_SDRV_STS_TYP.isRECV_CONV_ERR(dtlR.sdrv_sts_typ())
			|| MAC_SDRV_STS_TYP.isRECV_CONV_OK(dtlR.sdrv_sts_typ())
			|| MAC_SDRV_STS_TYP.isRECV_OK(dtlR.sdrv_sts_typ());
	}

	// Msgを選択した時にメッセージエリアを更新する
	@Override
	public void doMsg_NC(MCEventInfo info) {
		super.doMsg_NC(info);
		updateMsgArea();
	}

	protected void updateMsgArea() {
		MCTextArea ta = MsgArea_msg;
		if (ta == null) {
			return;
		}
		BatchLogMsgR r = MsgTable.getSelectedMCRow();
		if (isNull(r)) {
			return;
		}
		String v = null;
		v = r.msg_txt();
		ta.setValue(v);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_data_log_NC(MCEventInfo info) {
		super.doFilter_disp_data_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());

	}

	@Override
	public void doFilter_disp_start_log_NC(MCEventInfo info) {
		super.doFilter_disp_start_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_proc_log_NC(MCEventInfo info) {
		super.doFilter_disp_proc_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_end_log_NC(MCEventInfo info) {
		super.doFilter_disp_end_log_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_warn_NC(MCEventInfo info) {
		super.doFilter_disp_warn_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	@Override
	public void doFilter_disp_not_warn_NC(MCEventInfo info) {
		super.doFilter_disp_not_warn_NC(info);
		updateMsgL(DtlTable.getSelectedMCRows());
	}

	protected Map<DtlR, MCList<BatchLogMsgR>> msgLCache() {
		if (_msgLCache == null) {
			_msgLCache = new HashMap<DtlR, MCList<BatchLogMsgR>>();
		}
		return _msgLCache;
	}

	protected void updateMsgL(MCList<DtlR> cnds) {
		BatchLogMsgR selected = MsgTable.getSelectedMCRow();

		// クリア
		getMsgL().clear();
		getMsgAreaR().clear();

		// チェック
		if (cnds == null || cnds.isEmpty()) {
			return;
		}

		Map<DtlR, MCList<BatchLogMsgR>> cache = msgLCache();
		MCList<DtlR> noCache = MCList.create(DtlR.class);
		MCList<BatchLogMsgR> msgs = MCList.create(BatchLogMsgR.class);

		// キャッシュから取得
		for (DtlR cnd : cnds) {
			if (cache.containsKey(cnd)) {
				msgs.addAll(cache.get(cnd));
			}
			else {
				noCache.add(cnd);
			}
		}
		// 検索
		if (!noCache.isEmpty()) {
			MCList<BatchLogMsgR> blm = doSrch(noCache);
			Map<DtlR, MCList<BatchLogMsgR>> m;
			m = toMap(noCache, blm);
			cache.putAll(m);
			for (MCList<BatchLogMsgR> l : m.values()) {
				msgs.addAll(l);
			}
		}

		msgs = filter(msgs);

		// 結果をセット
		getMsgL().setAll(msgs);
		sort(MsgTable);
		MsgTable.adjustWidth();

		if (getMsgL().size() > 0) {
			int newIndex = -1;
			if (selected != null && !isNull(selected.batch_log_no())
					&& !isNull(selected.seq())) {
				String[] keys = MsgTable.getSortColumns();
				if (keys == null || keys.length == 0) {
					keys = new String[] {
							BatchLogMsgR.$batch_log_no, BatchLogMsgR.$seq
					};
				}

				int i = 0;
				while (i < getMsgL().size()) {
					BatchLogMsgR tarRow = getMsgL().get(i);
					int matchCnt = 0;
					for (int j = 0; j < keys.length; j++) {
						Comparable tarVal = tarRow.getValue(keys[j]);
						Comparable slctVal = selected.getValue(keys[j]);
						if (tarVal == null && slctVal == null) {
							matchCnt++;
						}
						else if (tarVal.compareTo(slctVal) >= 0) {
							matchCnt++;
						}
						if (matchCnt >= keys.length) {
							newIndex = i;
							break;
						}
					}
					if (newIndex >= 0) {
						break;
					}
					i++;
				}
			}
			if (newIndex < 0) {
				MsgTable.selectRowNoFocus(getMsgL().size() - 1);
			}
			else {
				MsgTable.selectRowNoFocus(newIndex);
			}
		}
	}

	protected MCList<BatchLogMsgR> doSrch(MCList<DtlR> cnds) {
		if (cnds == null || cnds.isEmpty()) {
			return null;
		}
		MCList<BatchLogKeyR> keys = MCList.create(BatchLogKeyR.class);
		for (DtlR cnd : cnds) {
			BatchLogKeyR key = BatchLogKeyR.create();
			key.batch_log_no(cnd.batch_log_no());
			keys.add(key);
		}
		
		return _read(keys);
	}

	protected MCList<BatchLogMsgR> _read(MCList<BatchLogKeyR> keys) {
		if (keys == null || keys.isEmpty()) {
			MCList<BatchLogMsgR> ret = MCList.create(BatchLogMsgR.class);
			return ret;
		}
		MCParam p = new MCParam(PDef.PF_PFBZL0020_Srch02_INFO);

		MCList<BatchLogMsgR> ret = MCList.create(BatchLogMsgR.class);

		p.addUpBlock(keys);
		p.addDownBlock(ret);
		createCaller(p).exec();

		return ret;
	}

	private mcframe.clientCore.requester.MCCaller createCaller(MCParam p) {
		return new mcframe.clientCore.requester.MCCaller(p);
	}

	protected Map<DtlR, MCList<BatchLogMsgR>> toMap(MCList<DtlR> keys,
			MCList<BatchLogMsgR> values) {
		
		Map<DtlR, MCList<BatchLogMsgR>> ret = new HashMap<>();
		if (isNull(values)) {
			for (DtlR key : keys) {
				ret.put(key, null);
			}
		}
		MCJoinKey<MCList<BatchLogMsgR>> jk;
		jk = keys.join(DtlR.$batch_log_no, values, BatchLogMsgR.$batch_log_no);
		for (DtlR key : keys) {
			ret.put(key, key.getJoined(jk));
		}
		return ret;
	}

	protected MCList<BatchLogMsgR> filter(MCList<BatchLogMsgR> list) {
		MCList<BatchLogMsgR> ret = MCList.create(BatchLogMsgR.class);
		if (isNull(list)) {
			return ret;
		}
		for (BatchLogMsgR r : list) {
			if (filter_msgLvl(r)) {
				if (filter_batchLogTyp(r)) {
					ret.add(r);
				}
			}
		}
		return ret;
	}

	/**
	 * @param r 対象行
	 * @return 対象行を表示する場合 true
	 */
	protected boolean filter_msgLvl(BatchLogMsgR r) {
		if (r == null) {
			return false;
		}
		if (isNull(r.msg_lvl())) {
			return true;
		}
		FilterR f = getFilterR();
		if (f.disp_not_warn() && f.disp_warn()) {
			return true;
		}
		if (isWarn(r)) {
			return f.disp_warn();
		}
		else {
			return f.disp_not_warn();
		}
	}

	protected Map<String, Boolean> _map_msglvl_warn;

	protected Map<String, Boolean> map_msglvl_warn() {
		if (_map_msglvl_warn == null) {
			_map_msglvl_warn = new HashMap<String, Boolean>();
			for (MCMessageLevel lvl : MCMessageLevel.values()) {
				String lvlStr = lvl.name().substring(0, 1);
				boolean isWarn = (MCMessageLevel.WARN.compareTo(lvl) <= 0);
				_map_msglvl_warn.put(lvlStr, isWarn);
			}
		}
		return _map_msglvl_warn;
	}

	protected boolean isWarn(BatchLogMsgR r) {
		if (r.msg_lvl() == null) {
			return true;
		}
		return map_msglvl_warn().get(r.msg_lvl());
	}

	/**
	 * @param r 対象行
	 * @return 対象行を表示する場合 true
	 */
	protected boolean filter_batchLogTyp(BatchLogMsgR r) {
		if (r == null) {
			return false;
		}
		MAC_BATCH_LOG_TYP type = MAC_BATCH_LOG_TYP.getNE(r.batch_log_typ());
		if (type == null) {
			return true;
		}
		FilterR f = getFilterR();
		if (MAC_BATCH_LOG_TYP.isSTART_LOG(type)) {
			return f.disp_start_log();
		}
		if (MAC_BATCH_LOG_TYP.isDATA_LOG(type)) {
			return f.disp_data_log();
		}
		if (MAC_BATCH_LOG_TYP.isPROC_LOG(type)) {
			return f.disp_proc_log();
		}
		if (MAC_BATCH_LOG_TYP.isEND_LOG(type)) {
			return f.disp_end_log();
		}
		return true;
	}

}