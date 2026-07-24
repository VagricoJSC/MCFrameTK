package mcframe.clientMBBE.MBBEP0040;

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
import java.io.File;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JComponent;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
import mcframe.clientCore.report.MCClientReportInfoR;
import mcframe.clientCore.report.MCClientReportManager;
import mcframe.clientCore.report.MCReportJob;
import mcframe.clientFXBA.FXBAP0010.FXBAP_CallerNoPanel;
import mcframe.clientFXUC.FXUCP0040.OpenScreenParamR;
import mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv_MC.UpDLInfo;
import mcframe.clientMBBE.MBBEP0060.MBBEP_SrchSQLReg_MC.AfterDwnldExcelRpt;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_BizDatDLConf"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_BizDatDLConf_MC extends MBBEP_BizDatDLConf_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	/**
	 * ツールバーの画面遷移ボタン実行時に渡されてくる値を保持するコンテナです。
	 */
	protected MCRow _scr_opn_bind = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BizDatDLConf_MC() {
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
	public MBBEP_BizDatDLConf_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MB_MBBEL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0040_Prnt01Caller<P extends MBBEP_BizDatDLConf, B extends MB_MBBEL0040_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0040_Prnt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}

		@Override
		protected void setMode() {
			super.setMode();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().bind(crtBindStrForSrch());
		}

		@Override
		protected boolean beforeExecMainWhenShouldDL() {
			// 実行ボタン押下時に表示されるファイル選択ダイアログ
			if (MAC_BIZ_DAT_FILE_TYP.isREPORT(getCndR().biz_dat_file_typ())) {
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
			if (MAC_BIZ_DAT_FILE_TYP.isEXCEL(getCndR().biz_dat_file_typ())) {
				super.showBackgroundDLMsg();
			}
		}

		@Override
		protected String getDLBziDatDlId() {
			return getCndR().biz_dat_id();
		}

		@Override
		protected String getDLBziDatDlNm() {
			return getCndR().biz_dat_nm();
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		MCMessageList msgList = new MCMessageList();
		msgList.addAll(checkReq(getCndR()));
		msgList.addAll(checkReq(getBackR()));
		if (0 < msgList.size()) {
			message(msgList);
			return;
		}
		// 画面表示する場合は、検索結果表示画面に遷移
		if (MAC_BIZ_DAT_FILE_TYP.isSCREEN(getCndR().biz_dat_file_typ())) {
			MCRow r = MCRow.create();
			r.setStringNE("biz_dat_id", getCndR().biz_dat_id());
			r.setStringNE("bind", crtBindStrForSrch());
			openPanel("MB", "MBBEP0100", T1, r);
		}
		else {
			createMB_MBBEL0040_Prnt01().execDL();
		}
	}

	protected String crtBindStr() {
		StringBuilder buf = new StringBuilder();
		for (BindR r : getBindL()) {
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

		for (BindR r : getBindL()) {
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
	
	@Override
	public void doCnd_biz_dat_id_LC(MCEventInfo info) {
		super.doCnd_biz_dat_id_LC(info);
		
		mcframe.clientMBBE.MBBEP0030.RsltR dr = getBizDatBind();
		setUpCond(dr);
		if (dr.print_flg()) {
			Cnd_biz_dat_file_typ_REPORT.setMode(MCMode.REQUIRED);
		}
		else {
			Cnd_biz_dat_file_typ_REPORT.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 業務データIDに対応した検索条件を返します。
	 * @return 検索条件
	 */
	protected mcframe.clientMBBE.MBBEP0030.RsltR getBizDatBind() {
		getBackR().clearAll();
		MCOperationInfo MB_MBBEL0030_Srch01_INFO = new MCOperationInfo("MB", "MBBEL0030",
				"Srch01", "000000", new mcframe.clientMBBE.MBBEP0030.PDef());
		MCParam p = new MCParam(MB_MBBEL0030_Srch01_INFO);
		mcframe.clientMBBE.MBBEP0030.CndR up = mcframe.clientMBBE.MBBEP0030.CndR.create();
		up.res_flg(true);
		up.biz_dat_id(getCndR().biz_dat_id());
		MCList<mcframe.clientMBBE.MBBEP0030.RsltR> down = MCList
				.create(mcframe.clientMBBE.MBBEP0030.RsltR.class);
		p.addUpBlock(up);
		p.addDownBlock(down);
		new FXBAP_CallerNoPanel(p).exec();
		return down.isEmpty() ? down.createRow() : down.get(0);
	}

	@Override
	public void screenClearSetMode() {
		// クリア時にモードは変更しない
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		setUpCond(getBizDatDLRec(null));
		setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Cnd_biz_dat_file_typ_REPORT.setMode(MCMode.READ_ONLY);
	}

	@Override
	protected void setValueByScreenOpener() {
		super.setValueByScreenOpener();
		// ブックマーク連携起動時は業務データIDが検索条件設定で設定される前提
	}

	protected MCList<mcframe.clientMBBE.MBBEP0030.RsltR> _srch_list = MCList
			.create(mcframe.clientMBBE.MBBEP0030.RsltR.class);

	protected String _srch_key = mcframe.clientMBBE.MBBEP0030.RsltR.$biz_dat_id;

	/**
	 * 業務データIDで検索条件の情報を取得（リソースを読んでラベルも取得する）
	 */
	protected mcframe.clientMBBE.MBBEP0030.RsltR getBizDatDLRec(String id) {
		if (id != null && !isNull(_srch_list)) {
			return _srch_list.subList(_srch_key, id).get(0);
		}
		else {
			return _srch_list.createRow();
		}
	}

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <P><li>起動タイプ：T1<br>
	 * バインド値＜必須＞<br>
	 * <table border = 1>
	 * <tr><th>カラム名</th><th>型</th><th>備考</th></tr>
	 * <tr><td>biz_dat_id</td><td>String</td><td></td></tr>
	 * </table><br>
	 * その他の引数：なし
	 * </li></P>
	 *  
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args その他の引数
	 * </P>
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			String id = bind.getStringNE("biz_dat_id");
			_openTyp = id;
		}
		else if ("SPN_SCR_BIND".equals(openTyp)) {
			_scr_opn_bind = bind;
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}

	protected String _openTyp = null;

	/**
	 * 検索条件項目の設定、画面のリサイズ
	 */
	protected void setUpCond(MCRow bind) {
		getCndR().cartridge(bind.getStringNE("cartridge"));
		getCndR().dwnld_flg(bind.getBooleanNE("dwnld_flg"));
		
		// 検索条件項目の設定、画面のリサイズ
		int y = ST_Y;
		_max_x = 0;
		y = moveItm(Back_dt1, Back_dt1_Label, bind, "dt_cond_col1", "dt_lbl1", y);
		y = moveItm(Back_dt2, Back_dt2_Label, bind, "dt_cond_col2", "dt_lbl2", y);
		y = moveItm(Back_dt3, Back_dt3_Label, bind, "dt_cond_col3", "dt_lbl3", y);
		y = moveItm(Back_dt4, Back_dt4_Label, bind, "dt_cond_col4", "dt_lbl4", y);
		y = moveItm(Back_dt5, Back_dt5_Label, bind, "dt_cond_col5", "dt_lbl5", y);
		y = moveItm(Back_dt6, Back_dt6_Label, bind, "dt_cond_col6", "dt_lbl6", y);
		y = moveItm(Back_dt7, Back_dt7_Label, bind, "dt_cond_col7", "dt_lbl7", y);
		y = moveItm(Back_dt8, Back_dt8_Label, bind, "dt_cond_col8", "dt_lbl8", y);
		y = moveItm(Back_dt9, Back_dt9_Label, bind, "dt_cond_col9", "dt_lbl9", y);
		y = moveItm(Back_dt10, Back_dt10_Label, bind, "dt_cond_col10", "dt_lbl10", y);
		y = moveItm(Back_str1, Back_str1_Label, bind, "str_cond_col1", "str_lbl1", y);
		y = moveItm(Back_str2, Back_str2_Label, bind, "str_cond_col2", "str_lbl2", y);
		y = moveItm(Back_str3, Back_str3_Label, bind, "str_cond_col3", "str_lbl3", y);
		y = moveItm(Back_str4, Back_str4_Label, bind, "str_cond_col4", "str_lbl4", y);
		y = moveItm(Back_str5, Back_str5_Label, bind, "str_cond_col5", "str_lbl5", y);
		y = moveItm(Back_num1, Back_num1_Label, bind, "num_cond_col1", "num_lbl1", y);
		y = moveItm(Back_num2, Back_num2_Label, bind, "num_cond_col2", "num_lbl2", y);
		y = moveItm(Back_num3, Back_num3_Label, bind, "num_cond_col3", "num_lbl3", y);
		y = moveItm(Back_num4, Back_num4_Label, bind, "num_cond_col4", "num_lbl4", y);
		y = moveItm(Back_num5, Back_num5_Label, bind, "num_cond_col5", "num_lbl5", y);
		y = moveItm(Back_flg1, bind, "flg_cond_col1", "flg_lbl1", y);
		y = moveItm(Back_flg2, bind, "flg_cond_col2", "flg_lbl2", y);
		y = moveItm(Back_flg3, bind, "flg_cond_col3", "flg_lbl3", y);
		y = moveItm(Back_flg4, bind, "flg_cond_col4", "flg_lbl4", y);
		y = moveItm(Back_flg5, bind, "flg_cond_col5", "flg_lbl5", y);

		_max_width = _init_max_width;
		for (Component c : BackPanel.getComponents()) {
			if (c instanceof MCField) {
				if (c.isVisible()) {
					// 最長のラベルに合わせてフィールドのx座標を揃える
					c.setLocation(_max_x, c.getLocation().y);
					// ラベル＋フィールドの幅が最大幅を超えたら置き換え
					int w = _max_x + c.getSize().width + ST_X;
					if (w > _max_width) {
						_max_width = w;
					}
				}
				else {
					((MCModeBeans) c).setMode(MCMode.READ_ONLY);
					c.setSize(0, 0);
					c.setLocation(-1, -1);
				}
			}
			else if (c instanceof MCCheckBox) {
				if (c.isVisible()) {
					// チェックボックスの幅が最大幅を超えたら置き換え
					int w = c.getSize().width + ST_X;
					if (w > _max_width) {
						_max_width = w;
					}
				}
				else {
					((MCModeBeans) c).setMode(MCMode.READ_ONLY);
					c.setSize(0, 0);
					c.setLocation(-1, -1);
				}
			}
			else if (c instanceof MCLabel) {
				if (!c.isVisible()) {
					((MCModeBeans) c).setMode(MCMode.READ_ONLY);
					c.setSize(0, 0);
					c.setLocation(-1, -1);
				}
			}
		}
		// FrontPanelの幅から増大した分をフレームのサイズに加算して画面の最大幅とする
		_max_width = _frame_width + (_max_width - _init_max_width);

		// 追加した項目に合わせて画面の幅・高さを調整する
		Container c = BackPanel;
		boolean iniFlg = _posiMap == null;
		if (iniFlg) {
			_posiMap = new HashMap<Container, Dimension>();
			//先に初期サイズを取得
			Container[] ps = new Container[] {
					BackPanel, BindTable
			};
			for (Container p : ps) {
				while (p != null) {
					if (_posiMap.containsKey(p)) {
						_bothResizedContainer = p;
						break;
					}
					_posiMap.put(p, p.getSize());
					if (this == p) {
						break;
					}
					p = p.getParent();
				}
			}
		}

		String str_cnd_list = bind.getStringNE("str_cnd_list");
		if (isNull(bind.getStringNE("str_cnd_list"))) {
			getBindL().clear();
			BindTable.setMode(MCMode.INVISIBLE);
			if (_bindParent != null) {
				_bindParent.remove(BindPanel);
			}

		}
		else {
			MCList<BindR> bindL = createBindL();
			for (String b : MCStringUtil.split(",", str_cnd_list)) {
				BindR r = createBindR();
				r.cond_col(b);
				bindL.add(r);
			}
			
			if (_scr_opn_bind != null) {
				bindL.forEach(r -> {
					String v = _scr_opn_bind.getStringNE(r.cond_col());
					r.cond_val(v);
				});
				_scr_opn_bind = null;
			}
			
			getBindL().setAll(bindL);
			BindTable.setMode(MCMode.ENABLE);
			if (_bindParent != null) {
				_bindParent.add(BindPanel, BorderLayout.CENTER);
			}
		}
		//以降、Backブロックの変更を反映させる処理
		int minush = 0;
		if (!BindTable.isVisible()) {
			//レイアウタにより決定される高さを保存。
			minush = BindPanel.getHeight();
		}
		boolean brc = false;
		while (c != null) {
			if (brc || c == _bothResizedContainer) {
				brc = true;
				c.setSize(_max_width - INTERVAL_X, c.getHeight() + y - minush);
			}
			else {
				c.setSize(_max_width - INTERVAL_X, _posiMap.get(c).height + y);
			}
			c.setPreferredSize(c.getSize());
			if (c == this) {
				if (c.getLayout() instanceof java.awt.BorderLayout) {
					java.awt.BorderLayout l = (java.awt.BorderLayout) c.getLayout();
					Component n = l.getLayoutComponent(BorderLayout.NORTH);
					Component s = l.getLayoutComponent(BorderLayout.SOUTH);
					int h = c.getHeight();
					if (n != null) {
						h += n.getHeight() + l.getHgap();
					}
					if (s != null) {
						h += s.getHeight() + l.getHgap();
					}
					c.setSize(_max_width, h);
				}
				break;
			}
			c = c.getParent();

		}
		if (getFrame().isMaximum()) return;
		c = this;
		Dimension fd = getFrame().getSize();
		fd.height = getHeight();
		Insets insets = getFrame().getInsets();
		fd.height += insets.bottom + insets.top;
		getFrame().setSize(fd);
	}

	@Override
	protected void afterOpenByInitParamCustom(String openTyp, MCRow bind,
			Object... args) {
		super.afterOpenByInitParamCustom(openTyp, bind, args);
		if (_openTyp != null) {
			Cnd_biz_dat_id.setValue(_openTyp);
		}
	}

	protected HashMap<Container, Dimension> _posiMap;

	protected HashMap<JComponent, Dimension> _sizeMap = new HashMap<JComponent, Dimension>();

	protected static final int ST_X = 7; // 配置開始x座標

	protected static final int ST_Y = 5; // 配置開始y座標

	protected static final int INTERVAL_X = 10; // x座標配置間隔

	protected static final int INTERVAL_Y = 24; // y座標配置間隔

	protected int _max_x; // 一番長いラベルに合わせたx座標

	protected int _max_width; // 画面の最大幅

	protected int _init_max_width = -1; // 画面の最大幅

	protected int _frame_width = -1;

	Container _bothResizedContainer = null;

	Container _bindParent = null;

	/**
	 * 検索条件項目の設定（移動、モード変更、ラベル変更、リサイズ、配置）
	 */
	protected int moveItm(MCField f, MCLabel l, MCRow bind, String colStr, String lblStr,
			int y) {
		String col = bind.getStringNE(colStr);
		boolean flg = !isNull(col);
		if (!_sizeMap.containsKey(f)) {
			_sizeMap.put((JComponent) f, ((MCField) f).getDefaultSize());
		}
		else {
			f.setSize(_sizeMap.get(f));
		}
		f.setMode(flg ? MCMode.ENABLE : MCMode.INVISIBLE);
		String lbl = bind.getStringNE(lblStr);
		if (flg) {
			if (lbl == null) {
				lbl = col;
			}
			l.setText(lbl);
			l.setMessageName(lbl);
			l.setPreferredSize(null);
			l.setSize(l.getPreferredSize());
			l.setLocation(ST_X, y);
			f.setMessageName(lbl);
			f.setLocation(ST_X + l.getSize().width + INTERVAL_X, y);
			if (f.getLocation().x > _max_x) _max_x = f.getLocation().x;
			return y + INTERVAL_Y;
		}
		else {
			f.setMessageName(lbl);
		}
		return y;
	}

	/**
	 * 検索条件項目の設定（チェックボックス用）
	 */
	protected int moveItm(MCCheckBox f, MCRow bind, String colStr, String lblStr, int y) {
		String col = bind.getStringNE(colStr);
		boolean flg = !isNull(col);
		if (!_sizeMap.containsKey(f)) {
			_sizeMap.put((JComponent) f, ((MCCheckBox) f).getDefaultSize());
		}
		else {
			f.setSize(_sizeMap.get(f));
		}
		f.setMode(flg ? MCMode.ENABLE : MCMode.INVISIBLE);
		if (flg) {
			String lbl = bind.getStringNE(lblStr);
			if (lbl == null) {
				lbl = col;
			}
			f.setText(lbl);
			f.setMessageName(lbl);
			f.setPreferredSize(null);
			f.setSize(f.getPreferredSize());
			f.setLocation(ST_X, y);
			return y + INTERVAL_Y;
		}
		return y;
	}

	@Override
	public void setUserSrchCnd() {
		//検索条件設定より前にREAD_ONLYにしないと値が入力されてしまう。
		if (getScreenOpener() == null) {
			for (MCModeBeans b : MCBeansUtil.getAllComponents(MCModeBeans.class,
					BackPanel)) {
				b.setMode(MCMode.READ_ONLY);
			}
		}
		super.setUserSrchCnd();
	}

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		Cnd_biz_dat_id.setIgnoreStatus(true);
		Cnd_biz_dat_nm.setIgnoreStatus(true);
		Cnd_biz_dat_file_typ_Group.setIgnoreStatus(true);
		Cnd_biz_dat_file_typ_Group.setIgnoreStatus(true);
		_bindParent = BindPanel.getParent();
	}


	@Override
	public MCList<OpenScreenParamR> getOpnScrBinds(Map<String, Comparable<?>> m) {
		if (m == null) {
			return null;
		}
		else {

			MCList<OpenScreenParamR> l = MCList.create(OpenScreenParamR.class);
			
			String k = MCScreenOpener.createGUIKey(Cnd_biz_dat_id);
			String v = (String)m.get(k);
			
			setValueEx(Cnd_biz_dat_id, v);
			mcframe.clientMBBE.MBBEP0030.RsltR bind = getBizDatBind();
			
			String str_cnd_list = bind.getStringNE("str_cnd_list");
			if (!isNull(bind.getStringNE("str_cnd_list"))) {
				String lbl = columnBind_cond_col.getHeaderName();
				for (String b : MCStringUtil.split(",", str_cnd_list)) {
					OpenScreenParamR r = OpenScreenParamR.create();
					r.to_key(b);
					r.type(MCDataType.STRING.name());
					r.to_name(b);
					r.to_panel(lbl);
					l.add(r);
				}
			}
			return l;
		}
	}

	@Override
	public ArrayList<MCRowBeans> getOpnScrBindsChangeTriggers() {
		ArrayList<MCRowBeans> m = new ArrayList<>();
		m.add(Cnd_biz_dat_id);
		return m;
	}
	@Override
	public String getOpnScrOpenTyp() {
		return "SPN_SCR_BIND";
	}

}