package mcframe.clientMAUD.MAUDP0010;

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
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.*;
import java.io.File;
import java.nio.file.Files;

import javax.swing.BoxLayout;
import javax.swing.JComponent;

import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientCore.sys.MCSys;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUC.MAUCP1060.TrdR;
import mcframe.clientMAUD.MAUDP0100.MAUDP_PopupConfig;
import mcframe.clientMAUD.MAUDP0110.MAUDP_ListListener;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientFXUB.FXUBP0000.IfParts;
import mcframe.clientFXUC.FXUCP0070.FXUCP_SrchCndUtil;
import mcframe.clientFXUC.FXUCP0070.SrchCndInfo;
import mcframe.commonCore.container.io.MCContainerIOConfig.Delimiter;
import mcframe.commonCore.container.io.MCContainerIOConfig.Encode;
import mcframe.clientCore.container.io.MCExcelReader;
import mcframe.clientCore.container.io.MCContainerIOConfig;
import mcframe.clientCore.container.io.MCCsvReader;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.clientMAUC.MAUCP1060.MAUCP_TrdUtil.*;
import mcframe.clientMAUC.MAUCP0020.*;
import mcframe.clientMAUC.MAUCP0050.Srch01_RsltR;
import mcframe.clientMAUC.MAUCP0050.Srch02_DtlR;
import static mcframe.clientMAUC.MAUCP0050.MAUCP_InptChkUtil.*;
import mcframe.commonCore.resource.MCConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_PanelBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_PanelBase_MC extends MAUDP_PanelBase_MC_A implements IfMAUDP_PanelBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 表示制御キーに対する項目を保持します。<p>
	 * コンテナ拡張項目「DISP_CTL」未設定の項目のみ保持します。<br>
	 * 表示制御キーに対するシステムパラメータが非表示対象の場合、
	 * MAUCP_AppScreenOpenerは、表示制御キーに対する項目のモードが「入力可」の場合にのみ値を連携します。<br>
	 * @see mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener
	 */
	protected Map<String, HashSet<MCModeBeans>> _dispctl2Comps = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_PanelBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * 画面初期化処理である {@link #afterOpen()} の中で例外が発生した
	 * 場合の処理を記述します。<br>
	 * 特に理由がない限り、引数の例外をthrowしてください。
	 * @param ex
	 * @return
	 */
	@Override
	protected void handleMCExAfterOpen(MCException ex) {
		if (isSame(MAUCL0013, ex.getID())) {
			requestCloseWindow();
		}
		super.handleMCExAfterOpen(ex);
	}

	// ///////////////////////////////////////////////
	// クライアントチェック関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 引数のチェックボックスに一つもチェックが入っていない、または２つ以上チェックが入っている場合はメッセージを返します。
	 * １つだけチェックが入っている場合は空のメッセージリストを返します。
	 * @param beans チェックボックス
	 */
	public MCMessageList checkOnlyOneInput(MCCheckBox... beans) {
		if (beans == null || beans.length == 0) {
			return new MCMessageList();
		}
		MCMessageList ret = new MCMessageList();
		
		int input = getInputCount(beans);
		if(input != 1) {
			MCMessage msg;
			if(input == 0) {
				msg = msgAtLeastOne(beans);
			}
			else {
				msg = msgTooManyInputs(beans);
			}
			MCRow r = beans[0].getBaseRow();
			String col = beans[0].getBaseRowColumnName();
			msg.setCauseRow(r, col);
			ret.add(msg);
		}
		return ret;
	}
	/**
	 * チェックされている項目の数を返します。
	 */
	protected int getInputCount(MCCheckBox[] beans) {
		int ret = 0;
		if (beans != null) {
			for (MCCheckBox b : beans) {
				boolean val = b.getValue();
				if (val) {
					ret++;
				}
			}
		}
		return ret;
	}
	// ///////////////////////////////////////////////
	// クライアントチェック関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 拡張属性関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * @deprecated 各画面での使用は推奨されません。
	 */
	@Override
	public void afterInit() {
		if (getBaseRootPanel() == this) {
			checkCo();
		}

		setInvisibleBySysParam();

		super.afterInit();
	}

	/**
	 * システムパラメータによって項目を非表示にします。<br>
	 * 実装仕様書のコンテナ属性ＩＤ「DISP_CTL」に下記のキーを指定すると<br>
	 * 対応するシステムパラメータがオフの場合に項目を非表示にします。<br>
	 * 「DISP_CTL」に「_DISP」の設定がある場合は、非表示対象外とします。<br>
	 * 
	 * 「CONT_FCTR」（有効成分）：CONT_FCTR_ENABLE_FLG<br>
	 * 「VER_NO」（版）：VER_ENABLE_FLG<br>
	 * 「MFG_APRV」（製造承認）：MFG_APRV_ENABLE_FLG<br>
	 * 「YIELD」（収率）：YIELD_ENABLE_FLG<br>
	 */
	protected void setInvisibleBySysParam() {
		MCBeans[] a = MAUCP_BeansUtil.getInvisibleBySysParam(this);
		setComponentInvisibleAllStatus(a);
		MAUCP_BeansUtil.setModeBeansDefaultByDispCtl(this);
	}

	/**
	 * 会社の設定を検査し、必要な情報がセットされていなければ例外をスローします。
	 */
	protected void checkCo() {
		if (isNull(mcframe.clientCore.sys.MCSys.user.coCD())) {
			throw new MCAppException(MAUDP0087);
		}
	}

	// ///////////////////////////////////////////////
	// 拡張属性関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ロケール、言語関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * ロケール情報から言語ＣＤを返す。
	 */
	public String toLangCd(Locale lcl) {
		// 言語ＣＤはMCFrame上で定義している言語ＣＤを返す。
		// 現状は Locale#getLanguage() と同値だが、変更される可能性もある。
		if (lcl == null)
			return null;
		return lcl.getLanguage();
	}

	/**
	 * 言語ＣＤからをロケール情報返す。
	 */
	public Locale toLocaleFromLangCd(String langCd) {
		// 言語ＣＤはMCFrame上で定義している言語ＣＤを返す。
		// 現状は Locale#getLanguage() と同値だが、変更される可能性もある。
		if (langCd == null)
			return null;
		return new Locale(langCd);
	}

	/**
	 * ロケール情報からロケールＣＤを返す。
	 */
	public String toLclCd(Locale lcl) {
		// ロケールＣＤはMCFrame上で定義しているロケールＣＤを返す。
		// 現状は Locale#toString() と同値だが、変更される可能性もある。
		if (lcl == null)
			return null;
		return lcl.toString();
	}

	/**
	 * ロケールＣＤからをロケール情報返す。
	 */
	public Locale toLocaleFromLclCd(String lclCd) {
		// ロケールＣＤはMCFrame上で定義しているロケールＣＤを返す。
		// 現状は Locale#toString() と同値だが、変更される可能性もある。
		if (lclCd == null)
			return null;
		Locale ans;
		int idx = lclCd.indexOf('_');
		if (idx < 0) {
			ans = new Locale(lclCd);
		}
		else if (idx == lclCd.length() - 1) {
			ans = new Locale(lclCd);
		}
		else {
			String lang = lclCd.substring(0, idx);
			String cntry = lclCd.substring(idx + 1, lclCd.length());
			ans = new Locale(lang, cntry);
		}
		return ans;
	}

	/**
	 * ログインユーザのロケール
	 */
	public Locale getUsrLocale() {
		return MCSys.user.locale();
	}

	/**
	 * ログインユーザの言語ＣＤ
	 */
	public String getUsrLangCd() {
		return toLangCd(MCSys.user.locale());
	}

	/**
	 * ログインユーザのロケールＣＤ
	 */
	public String getUsrLclCd() {
		return toLclCd(MCSys.user.locale());
	}

	// ///////////////////////////////////////////////
	// ロケール、言語関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// リストロジック関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * リストのオペレーションタイプが {@link MCListConfig#INPUT} の場合は true を返す。
	 *
	 * @param compo GUI 部品
	 * @return リストのオペレーションタイプが {@link MCListConfig#INPUT} 以外の場合は false
	 */
	protected boolean isListOpeTypINPUT(MCLinkBeans compo) {
		return compo != null ? MCListConfig.INPUT.equals(compo.getListConfig()
				.getOpeType()) : false;
	}

	/**
	 * リストのオペレーションタイプが {@link MCListConfig#LIST} の場合は true を返す。
	 *
	 * @param compo GUI 部品
	 * @return リストのオペレーションタイプが {@link MCListConfig#LIST} 以外の場合は false
	 */
	protected boolean isListOpeTypLIST(MCLinkBeans compo) {
		return compo != null ? MCListConfig.LIST.equals(compo.getListConfig()
				.getOpeType()) : false;
	}

	@Override
	protected void customInit() {
		super.customInit();
		// setListLogicColumnMappingでは内部でListPutterを取得しているが、
		// ListPutterの関連付けが各アプリのオートクラスのlistInitで行われるため
		// listInitではなく、その後のcustomInitに実装しています。
		listInitCustom();
	}

	/**
	 * リストロジックのカラム名と画面のカラム名とが違う場合の関連付け<BR>
	 * ※画面実装仕様書に設定が必要。
	 */
	protected void listInitCustom() {
		MAUCP_BeansUtil.listInitCustom(this);
	}

	// ///////////////////////////////////////////////
	// リストロジック関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();

		linkBeansToISPanelCustom();
	}

	/**
	 * 入力補助画面の紐づけ（linkBeansToISPanel）を行います。
	 */
	protected void linkBeansToISPanelCustom() {
		for (Object[] args : MAUCP_BeansUtil.getLinkBeansToISPanelArgs(this)) {
			linkBeansToISPanel((MCLinkBeans) args[0], (String) args[1], (String) args[2],
					(boolean) args[3]);
		}
	}

	/**
	 * 指定したGUI部品を入力補助画面に紐付けます。<br>
	 * コンボボックスから入力補助画面を起動したい場合等に使用してください。<br>
	 * linkBeansToISPanel()メソッドをO/Rし、実装される想定です。<p>
	 *
	 * @param beans GUI部品
	 */
	protected void linkBeansToISPanelCustom(MCLinkBeans beans) {
		Object[] args = MAUCP_BeansUtil
				.getLinkBeansToISPanelArgs(beans.getListConfig().getListPutter());
		if (args != null) {
			linkBeansToISPanel(beans, (String) args[1], (String) args[2],
					(boolean) args[3]);
		}
	}
	
	/**
	 * 指定したGUI部品を入力補助画面に紐付けます。<br>
	 * コンボボックスから入力補助画面を起動したい場合等に使用してください。<br>
	 * linkBeansToISPanel()メソッドをO/Rし、実装される想定です。<p>
	 * 
	 * @param beans GUI部品
	 * @param usingForInput beansに手入力した場合に入力補助画面を使って連携項目を取得する場合true
	 */
	protected void linkBeansToISPanelCustom(MCLinkBeans beans, boolean usingForInput) {
		Object[] args = MAUCP_BeansUtil
				.getLinkBeansToISPanelArgs(beans.getListConfig().getListPutter());
		if (args != null) {
			linkBeansToISPanel(beans, (String) args[1], (String) args[2], usingForInput);
		}
	}

	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ポップアップコンフィグ関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		return new MAUDP_PopupConfig();
	}

	/**
	 * ポップアップメニューにファイル入力を表示するか否か<br>
	 * デフォルト実装：false
	 * @param table
	 */
	protected boolean useFileIn(MCTable table) {
		MCRootPanel under = getUnderPanel();

		// 埋込画面の場合は利用画面に処理を委ねる
		if (under != null) {
			if (under instanceof MAUDP_PanelBase) {
				MAUDP_PanelBase p = (MAUDP_PanelBase)under;
				return p.useFileIn(table);
			}
		}

		return false;
	}

	public boolean useExcelIn(MCTable table) {
		return useFileIn(table);
	}

	public boolean useCsvIn(MCTable table) {
		return useFileIn(table);
	}

	protected boolean useCustomExcelIn(MCTable table) {
		return useExcelIn(table);
	}

	protected boolean useCustomCsvIn(MCTable table) {
		return useCsvIn(table);
	}

	@Override
	protected void doExcelInAction(MCTable<?> table) {
		if (useCustomExcelIn(table)) {
			// ファイル選択
			MCRootPanel under = getUnderPanel();
			MCRootPanel panel = (under != null) ? under : this;
			File f = MCFileChooser.showXlsLoadDialog(null, panel);
			if (f == null) {
				return ;
			}
			if (!f.exists()) {
				MCMessageBox.dialog(panel, new MCMessage(MAUDP0004, f));
				return ;
			}

			// ファイルの内容をコンテナに入力
			table.getList().clear();
			MCList list = table.getList().createInstance();
			MCExcelReader reader = new MCExcelReader(panel.getModuleID(),
					panel.getScreenID(), list, f, table);

			MCContainerIOConfig config = new MCContainerIOConfig(panel.getModuleID(), panel.getScreenID());
			config.setReaderEncode(Encode.getEncode(getFileEncode(), config.getReaderEncode()));
			config.setReaderDelimiter(Delimiter.getDelimiter(getFileDelimiter(), config.getReaderDelimiter()));
			config.setReaderNameOut(isUsedNameLine());
			config.setReaderTitleOut(isUsedTitleLine());

			MCMessageList msgList;
			if (config.isReaderNameOut()) {
				// ファイルに項目行がある場合はファイルにある項目名で取り込む
				msgList = reader.read(config);
			}
			else {
				// ファイルに項目行がない場合は表示されているカラム順で取り込む
				MCColumnConfig[] columns = table.getViewColumnConfigs();
				List<String> names = new ArrayList<>();
				for (MCColumnConfig column : columns) {
					String name = column.getBaseRowColumnName();
					if (!isNull(name)) {
						names.add(name);
					}
				}
				msgList = reader.read(config, names.toArray(new String[0]));
			}

			// ファイル入力後の処理
			doCustomFileInAction(table, list, msgList);
		}
		else {
			table.setBeansReader(createBeansReader());
			super.doExcelInAction(table);
		}
	}

	@Override
	protected void doCSVInAction(MCTable<?> table) {
		if (useCustomCsvIn(table)) {
			// ファイル選択
			MCRootPanel under = getUnderPanel();
			MCRootPanel panel = (under != null) ? under : this;
			File f = MCFileChooser.showCsvLoadDialog(null, panel);
			if (f == null) {
				return ;
			}
			if (!f.exists()) {
				MCMessageBox.dialog(panel, new MCMessage(MAUDP0004, f));
				return ;
			}

			// ファイルの内容をコンテナに入力
			table.getList().clear();
			MCList list = table.getList().createInstance();
			MCCsvReader reader = new MCCsvReader(panel.getModuleID(),
					panel.getScreenID(), list, f, table);

			MCContainerIOConfig config = new MCContainerIOConfig(panel.getModuleID(), panel.getScreenID());
			config.setReaderEncode(Encode.getEncode(getFileEncode(), config.getReaderEncode()));
			config.setReaderDelimiter(Delimiter.getDelimiter(getFileDelimiter(), config.getReaderDelimiter()));
			config.setReaderNameOut(isUsedNameLine());
			config.setReaderTitleOut(isUsedTitleLine());

			MCMessageList msgList;
			if (config.isReaderNameOut()) {
				// ファイルに項目行がある場合はファイルにある項目名で取り込む
				List<String> names = new ArrayList<>();
				java.io.BufferedReader br = null;
				String line = null;
				try {
					br = Files.newBufferedReader(f.toPath(), config.getReaderEncode().getCharset());
					line = br.readLine();
				}
				catch (java.io.IOException e) {
					e.printStackTrace();
				}
				finally {
					try {
						if (br != null) {
							br.close();
						}
					}
					catch (java.io.IOException e) {
						e.printStackTrace();
					}
				}
				if (line != null) {
					MCRow prot = list.createRow();
					StringTokenizer token = new StringTokenizer(line, config.getReaderDelimiter().toString());
					while (token.hasMoreTokens()) {
						String tkn = token.nextToken();
						tkn = tkn.replaceAll("^\"|\"$", "");
						for (MCColumnConfig column : table.getViewColumnConfigs()) {
							if (isSame(tkn, column.getBaseRowColumnName())
									|| isSame(prot.getRealColumnPath(tkn), column.getBaseRowColumnName())) {
								names.add(tkn);
								break;
							}
						}
					}
				}
				msgList = reader.read(config, names.toArray(new String[0]));
			}
			else {
				// ファイルに項目行がない場合は表示されているカラム順で取り込む
				MCColumnConfig[] columns = table.getViewColumnConfigs();
				List<String> names = new ArrayList<>();
				for (MCColumnConfig column : columns) {
					String name = column.getBaseRowColumnName();
					if (!isNull(name)) {
						names.add(name);
					}
				}
				msgList = reader.read(config, names.toArray(new String[0]));
			}

			// ファイル入力後の処理
			doCustomFileInAction(table, list, msgList);
		}
		else {
			table.setBeansReader(createBeansReader());
			super.doCSVInAction(table);
		}
	}

	protected void doCustomFileInAction(MCTable<?> table, MCList list, MCMessageList msgList) {
		checkCustomFileInAction(table, list, msgList);

		if (msgList.isEmpty()) {
			if (getCheckColumnConfig(table) != null) {
				// テーブルに格納する前にtrueにする（ロウリスナーの一括設定項目の連動を行わずファイル取り込みした内容を優先したいので）
				// ※ListRegRowListenerリスナーのstatusChangedでは、元の選択チェックがオンの場合は、
				// setDefaultValueWhenCheckedを呼ばないようにしている。
				list.setBoolean(getCheckColumn(), true);
				list.setStatus(MCRow.Status.CREATE);
				table.getList().setAll(list);
				changeFileInRowStatus();
			}
			doFileInSuccessAction(table);
		}
		else {
			doFileInErrorAction(table, msgList);
		}
	}

	/**
	 * ファイル取り込み後、通信前にクライアント側でチェックを行います。（カスタマイズ用）<br>
	 * エラーがあった場合には通信を行いません。<br>
	 */
	protected void checkCustomFileInAction(MCTable<?> table, MCList list, MCMessageList msgList) {
		
	}
	/**
	 * 登録対象が共通の場合のファイル入力で対象外の項目（例：ＷＧ）が指定されていた場合のエラーメッセージ
	 * <p>
	 * @param col 対象外項目
	 */
	protected MCMessage msgRegTgtCmnInvalidCol(MCColumnConfig col) {
		return new MCMessage(MAUDP0010, col.getMessageByLocale());
	}

	protected void setFileInStatus(MCRow r) {
		r.setStatus(MCRow.Status.CREATE);
	}

	/**
	 * ファイル取り込み後に、ステータスをCREATE以外に変更する場合にオーバライドしてください<br>
	 * <P>
	 * for (RsltR r : getRsltL()) {
	 * 	if (!isNull(r.rqmt_no)) {
	 *		r.setStatus(MCRow.Status.MODIFY);
	 *  }
	 * }
	 * </P>
	 */
	protected void changeFileInRowStatus() {

	}

	/**
	 * コンテナへのファイル入力が正常終了した場合に実行されます。<br>
	 * デフォルト実装：何もなし<br>
	 * オーバーライドして、下記のように実装してください。
	 * <P>
	 * callMS_MSBCL0010_Imp01(); // ファイル入力のCallerの呼出
	 * </P>
	 * @param table ファイル入力したテーブル
	 */
	protected void doFileInSuccessAction(MCTable<?> table) {

	}

	/**
	 * コンテナへのファイル入力でエラーが発生した場合に実行されます。<br>
	 * デフォルト実装：エラーメッセージのマルチダイアログ表示
	 * @param table ファイル入力したテーブル
	 * @param msgList エラーメッセージ
	 */
	protected void doFileInErrorAction(MCTable<?> table, MCMessageList msgList) {
		// クライアントで行うのは型のエラーチェックのみ。
		// そのため、エラーが発生した場合、テーブルに行を貼り付けできないので、ここで行うのは、マルチメッセージダイアログの表示のみ
		// ※サーバでエラーになった場合は、一覧の処理結果にエラー内容が表示される
		// 一覧にデータを貼り付けていないので、画面ステータスを登録不可モードにする必要はない
		message(msgList);
	}

	/**
	 * ファイル入力処理が完了したときのメッセージ
	 */
	public MCMessage msgFileImported() {
		return new MCMessage(MAUDP0005);
	}

	/**
	 * ファイル入力できなかったときのメッセージ
	 */
	public MCMessage msgFileImportFailed() {
		return new MCMessage(MAUDP0006);
	}

	/**
	 * ファイル入力で入力するファイルに項目行が存在する場合はtrue、存在しない場合はfalseを返す。
	 */
	protected boolean isUsedNameLine() {
		boolean def = MCConst.beans.getBoolean("beansreader.isName");
		return getPgmSettingBooleanNE(this, def, "file_io.name_out");
	}

	/**
	 * ファイル入力で入力するファイルにタイトル行が存在する場合はtrue、存在しない場合はfalseを返す。
	 */
	protected boolean isUsedTitleLine() {
		boolean def = MCConst.beans.getBoolean("beansreader.isTitle");
		return getPgmSettingBooleanNE(this, def, "file_io.title_out");
	}

	/**
	 * ファイル入力の文字コードを取得する。
	 */
	protected String getFileEncode() {
		String def = MCConst.beans.getString("beansreader.encode");
		return getPgmSettingStringNE(this, def, "file_io.encode");
	}

	/**
	 * ファイル入力の区切り文字を取得する。
	 */
	protected String getFileDelimiter() {
		String def = MCConst.beans.getString("beansreader.delimiter");
		return getPgmSettingStringNE(this, def, "file_io.delimiter");
	}
	/**
	 * ファイル出力で項目行を出力する場合はtrue、出力しない場合はfalseを返す。
	 */
	protected boolean isWriteUsedNameLine() {
		boolean def = MCConst.beans.getBoolean("beanswriter.nameOut");
		return getPgmSettingBooleanNE(this, def, "file_io.name_out");
	}

	/**
	 * ファイル出力でタイトル行を出力する場合はtrue、出力しない場合はfalseを返す。
	 */
	protected boolean isWriteUsedTitleLine() {
		boolean def = MCConst.beans.getBoolean("beanswriter.titleOut");
		return getPgmSettingBooleanNE(this, def, "file_io.title_out");
	}

	/**
	 * ファイル出力の文字コードを取得する。
	 */
	protected String getWriteFileEncode() {
		String def = MCConst.beans.getString("beanswriter.encode");
		return getPgmSettingStringNE(this, def, "file_io.encode");
	}

	/**
	 * ファイル出力の区切り文字を取得する。
	 */
	protected String getWriteFileDelimiter() {
		String def = MCConst.beans.getString("beanswriter.delimiter");
		return getPgmSettingStringNE(this, def, "file_io.delimiter");
	}

	@Override
	protected void doExcelOutAction(MCTable<?> table, MCWriteType type) {
		table.setBeansWriter(createBeansWriter());
		super.doExcelOutAction(table, type);
	}

	@Override
	protected void doExcelOpenAction(MCTable<?> table, MCWriteType type) {
		table.setBeansWriter(createBeansWriter());
		super.doExcelOpenAction(table, type);
	}

	@Override
	protected void doCSVOutAction(MCTable<?> table, MCWriteType type) {
		table.setBeansWriter(createBeansWriter());
		super.doCSVOutAction(table, type);
	}

	/**
	 * MCBeansReaderを作成する。
	 */
	protected MCBeansReader createBeansReader() {
		MCBeansReader reader = new MCBeansReader();
		reader.setEncode(getFileEncode());
		reader.setDelimiter(getFileDelimiter());
		reader.isNameLine(isUsedNameLine());
		reader.isTitleLine(isUsedTitleLine());
		return reader;
	}

	/**
	 * MCBeansWriterを作成する。
	 */
	protected MCBeansWriter createBeansWriter() {
		MCBeansWriter writer = new MCBeansWriter();
		writer.setEncode(getWriteFileEncode());
		writer.setDelimiter(getWriteFileDelimiter());
		writer.setNameOut(isWriteUsedNameLine());
		writer.setTitleOut(isWriteUsedTitleLine());
		return writer;
	}


	// ///////////////////////////////////////////////
	// ポップアップコンフィグ関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ユーティリティ関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * panelに配置されているMCCheckBoxすべてに、valueの値を設定します。
	 *
	 * @param panel
	 * @param value
	 */
	protected void setBoolean(MCPanel panel, boolean value) {
		if (panel == null) {
			return;
		}
		for (MCCheckBox cb : MCBeansUtil.getAllComponents(MCCheckBox.class,
				panel)) {
			cb.getRow().setBoolean(cb.getRowColumnName(), value);
		}
	}

	/**
	 * 日付の範囲が最大日数を超える場合は、メッセージを追加したメッセージリストを返します。 それ以外は、空のメッセージリストを返します。
	 * <P>
	 * なお、以下の場合も、空のメッセージリストを返します。
	 * <li>dt1 または dt2 がnullの場合</li>
	 * <li>dt1 > dt2 の場合</li>
	 * <li>max_termが0以下の場合</li>
	 * </P>
	 *
	 * @exception 日付の範囲が最大日数を超える場合
	 * @param dt1 開始日付
	 * @param dt2 終了日付
	 * @param max_term 最大日数
	 * @return メッセージリスト
	 */
	public MCMessageList checkTermDt(MCRowBeans dt1, MCRowBeans dt2,
			int max_term) {
		MCMessageList msgList = new MCMessageList();

		if (dt1 == null || dt2 == null) {
			return msgList;
		}
		if (max_term <= 0) {
			return msgList;
		}
		Comparable<?> c1 = dt1.getRowValue();
		Comparable<?> c2 = dt2.getRowValue();
		if (isNullOr(c1, c2)) {
			return msgList;
		}

		if (isCalendarDate(c1, c2)) {
			MCCalendarDate<?> mcdt1 = (MCDate) c1;
			MCCalendarDate<?> mcdt2 = (MCCalendarDate<?>) c2;
			if (mcdt1.addDay(max_term).lte(mcdt2)) {
				msgList.add(msgOverTermDt(dt1, max_term));
			}
		}
		return msgList;
	}

	/**
	 * 年月の範囲が最大月数を超える場合は、メッセージを追加したメッセージリストを返します。 それ以外は、空のメッセージリストを返します。
	 * <P>
	 * なお、以下の場合も、空のメッセージリストを返します。
	 * <li>ym1 または ym2 がnullの場合</li>
	 * <li>ym1 > ym2 の場合</li>
	 * <li>max_termが0以下の場合</li>
	 * </P>
	 *
	 * @exception 年月の範囲が最大月数を超える場合
	 * @param ym1 開始年月
	 * @param ym2 終了年月
	 * @param max_term 最大月数
	 * @return メッセージリスト
	 */
	public MCMessageList checkTermYm(MCRowBeans ym1, MCRowBeans ym2,
			int max_term) {
		MCMessageList msgList = new MCMessageList();

		if (ym1 == null || ym2 == null) {
			return msgList;
		}
		if (max_term <= 0) {
			return msgList;
		}
		Comparable<?> c1 = ym1.getRowValue();
		Comparable<?> c2 = ym2.getRowValue();
		if (isNullOr(c1, c2)) {
			return msgList;
		}

		if (isCalendarDate(c1, c2)) {
			MCCalendarDate<?> mcdt1 = (MCCalendarDate<?>) c1;
			MCCalendarDate<?> mcdt2 = (MCCalendarDate<?>) c2;
			if (mcdt1.addMonth(max_term).lte(mcdt2)) {
				msgList.add(msgOverTermYm(ym1, max_term));
			}
		}
		return msgList;
	}

	// ///////////////////////////////////////////////
	// ユーティリティ関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// メッセージ関連（ここから）
	// ///////////////////////////////////////////////

	/**
	 * 日付の範囲が最大日数を超えた場合のメッセージを返す。
	 * 
	 * @param dt1 開始日付
	 * @param max_term 最大日数
	 * @return メッセージ
	 */
	public MCMessage msgOverTermDt(MCRowBeans dt1, int max_term) {
		MCMessage msg = new MCMessage(MAUDP0410, String.valueOf(max_term));
		msg.setCauseRow(dt1.getBaseRow(), dt1.getBaseRowColumnName());
		return msg;
	}

	/**
	 * 年月の範囲が最大月数を超えた場合のメッセージを返す。
	 * 
	 * @param ym1 開始年月
	 * @param max_term 最大月数
	 * @return メッセージ
	 */
	public MCMessage msgOverTermYm(MCRowBeans ym1, int max_term) {
		MCMessage msg = new MCMessage(MAUDP0411, String.valueOf(max_term));
		msg.setCauseRow(ym1.getBaseRow(), ym1.getBaseRowColumnName());
		return msg;
	}
	
	/**
	 * 取消処理の実行を確認するメッセージを返す。
	 */
	public MCMessage msgCancelConfirm() {
		if (this instanceof IfOpePanel) {
			return msgOpeConfirm((IfOpePanel)this);
		}
		return new MCMessage(MAUDP0098);
	}

	/**
	 * 取消処理の実行終了時のメッセージを返す。
	 */
	public MCMessage msgCanceled() {
		if (this instanceof IfOpePanel) {
			return msgOpeDone((IfOpePanel)this);
		}
		return new MCMessage(MAUDP0099);
	}

	/**
	 * 取消できなかったときのメッセージを返す。
	 */
	public MCMessage msgCancelFailed() {
		if (this instanceof IfOpePanel) {
			return msgOpeFailed((IfOpePanel)this);
		}
		return new MCMessage(MAUDP0100);
	}

	/**
	 * 一覧に選択チェックボックスがあって、それがチェックされていない時のメッセージを返す
	 */
	public MCMessage msgNoCheckedRow() {
		return new MCMessage(MAUDP0038);
	}

	// ///////////////////////////////////////////////
	// メッセージ関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// リスナー関連（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected MCListListener createListListener(EventListener... listeners) {
		// Ｘ と違う箇所（ここから）
		MAUDP_ListListener listListener = new MAUDP_ListListener();
		// Ｘ と違う箇所（ここまで）
		if (listeners != null && listeners.length > 0) {
			for (EventListener listener : listeners) {
				boolean isSet = false;
				if (listener instanceof MCRowListener) {
					listListener.addRowListener((MCRowListener) listener);
					isSet = true;
				}
				if (listener instanceof MCRowStatusListener) {
					listListener.addRowStatusListener((MCRowStatusListener) listener);
					isSet = true;
				}
				if (!isSet) {
					throw new MCAppException(FXBAP0063);
				}
			}
		}
		return listListener;
	}

	// ///////////////////////////////////////////////
	// リスナー関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 埋込画面用ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 引数をループして、 {@link #setComponentInvisibleAllStatus(MCBeans)}
	 * を呼び出します。
	 *
	 * @see #setComponentInvisibleAllStatus(MCBeans)
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans... beans) {
		if (beans == null) {
			return;
		}
		for (MCBeans b : beans) {
			setComponentInvisibleAllStatus(b);
		}
	}

	/**
	 * 引数で指定されたコンポーネントを全ての画面ステータスで非表示状態にします。
	 * <p>
	 * 注意事項<br>
	 * 引数にセットしたコンポーネントに対して {@link MCModeBeans#setMode}
	 * をすると、そのモードになります。その後、画面ステータスが変わると
	 * 非表示になります。<br>
	 * タブの構成要素であるMCPanelを引数にセットすると、タブペインからMCPanelを
	 * 除去します。結果、 {@link MCTabbedPane#indexOfComponent(Component)}が
	 * -1 を返すようになります。<br>
	 * </p>
	 *
	 * @param beans
	 */
	protected void setComponentInvisibleAllStatus(MCBeans beans) {
		MAUCP_BeansUtil.setComponentInvisibleAllStatus(beans, getPanelLayerList(), this);
	}

	/**
	 * リストロジックの検索条件を設定する。
	 *
	 * @param cnd 検索条件
	 * @param typs 定数
	 */
	protected void addListLogicCnd(MCRow cnd, MCAppConst[] typs) {
		if (typs == null || typs.length == 0) {
			return;
		}
		for (MCAppConst typ : typs) {
			cnd.addBooleanColumn(typ.key(), true);
		}
	}

	// ///////////////////////////////////////////////
	// 埋込画面用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 行コピーの実装（ここから）
	// ///////////////////////////////////////////////
	@Override
	public <E extends MCConstRow> E copyRow(MCTable<E> t) {
		E dest = super.copyRow(t);
		return copyRowSub(t, dest);
	}

	/**
	 * 行コピーの後処理
	 *
	 * @param table テーブル
	 * @param row 行コピーして新規に作成されたRow
	 */
	public <E extends MCConstRow> E copyRowSub(MCTable<E> table, E row) {
		if (row != null && !row.isEmpty()) {
			clearNotInheritInfo(table, row);
			if (isListRegTable(table)) {
				clearRtnMsgInfo(table, row);
				if (!isNull(getCheckColumn())) {
					setValueEx(getCheckColumnConfig(table), row.getGUIIndex(), true);
				}
			}
		}
		return row;
	}

	/**
	 * 結果情報部品の項目をクリアします。
	 *
	 * @param table テーブル
	 * @param row Rowコンテナ
	 */
	protected void clearRtnMsgInfo(MCTable<?> table, MCRow row) {
		MCTable<?> rtn = getRtnMsgTable(table);
		if (rtn != null) {
			List<String> names = new ArrayList<>();
			for (MCColumnConfig column : rtn.getColumnConfigs()) {
				names.add(column.getBaseRowColumnName());
			}
			row.clear(names.toArray(new String[0]));
		}
	}

	/**
	 * 結果情報部品のテーブルを返します。
	 *
	 * @param table テーブル
	 * @return 結果情報部品のテーブル、または null
	 */
	protected MCTable<?> getRtnMsgTable(MCTable<?> table) {
		MCRootPanel panel = table.getRootPanel();
		if (panel instanceof mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D) {
			return table;
		}
		for (MCTable<?> parts : table.getPartsTables()) {
			MCTable<?> t = getRtnMsgTable(parts);
			if (t != null) {
				return t;
			}
		}
		return null;
	}

	// ///////////////////////////////////////////////
	// 行コピーの実装（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 操作種別画面の実装（ここから）
	// ///////////////////////////////////////////////
	private final String OPE_INS = "0";
	private final String OPE_UPD = "1";
	private final String OPE_DEL = "2";
	private final String OPE_REF = "3";

	private final String ST_SRCH = "SRCH";
	private final String ST_REF = "REF";
	private final String ST_INS = "INS";
	private final String ST_UPD = "UPD";
	private final String ST_DEL = "DEL";
	private final String ST_FIX_I = "FIX_I";
	private final String ST_FIX_U = "FIX_U";
	private final String ST_FIX_D = "FIX_D";

	protected final String INS_USR_ID = "ins_usr_id";
	protected final String INS_USR_NM = "ins_usr_nm";
	protected final String INS_TS = "ins_ts";
	protected final String INS_FUNC_ID = "ins_func_id";
	protected final String INS_FUNC_NM = "ins_func_nm";
	protected final String UPD_CNTR = "upd_cntr";
	protected final String UPD_USR_ID = "upd_usr_id";
	protected final String UPD_USR_NM = "upd_usr_nm";
	protected final String UPD_TS = "upd_ts";
	protected final String UPD_FUNC_ID = "upd_func_id";
	protected final String UPD_FUNC_NM = "upd_func_nm";
	protected final String UPD_SRV_REQ_NO = "upd_srv_req_no";
	protected final String DEL_USR_ID = "del_usr_id";
	protected final String DEL_USR_NM = "del_usr_nm";
	protected final String DEL_TS = "del_ts";

	/**
	 * 操作種別変更時などにコンテをナクリアするメソッド
	 * containers をListに格納し直して実行（ヘッダ、明細対応）
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void clearContainers(MCContainer... containers) {
		List<MCContainer> l = new ArrayList<MCContainer>();
		for (MCContainer c :containers) {
			l.add(c);
		}
		clearContainers(l);
	}
	/**
	 * 操作種別変更時などにコンテをナクリアするメソッド
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void clearContainers(List<MCContainer> containers) {
		if (containers == null)
			return;
		for (MCContainer c : containers) {
			c.clear();
			if (c instanceof MCRow) {
				((MCRow) c).setStatus(Status.NONE);
			}
		}
	}

	/**
	 * 参照登録時のRowステータスを変更するメソッド
	 * containers をListに格納し直して実行（ヘッダ、明細対応）
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void setRowStatusForIns(MCContainer... containers) {
		List<MCContainer> l = new ArrayList<MCContainer>();
		for (MCContainer c :containers) {
			l.add(c);
		}
		setRowStatusForIns(l);
	}
	/**
	 * 参照登録時のRowステータスを変更するメソッド
	 *
	 * @param containers Rowステータスを変更するコンテナ
	 */
	protected void setRowStatusForIns(List<MCContainer> containers) {
		for (MCContainer cont : containers) {
			if (cont instanceof MCList) {
				MCList<?> ls = (MCList<?>) cont;
				ls.removeAll(ls.subList(MCRow.DELETE));
				ls.setStatus(MCRow.CREATE);
			}
			else if (cont instanceof MCRow) {
				MCRow row = (MCRow) cont;
				if (!row.isEmpty()) {
					row.setStatus(MCRow.CREATE);
				}
			}
		}
	}

	/**
	 * 行コピーを表す定数。
	 * {@link #getNotInheritCols(MCContainer)} で利用する。
	 */
	protected static final String NOT_INHERIT_TYPE_COPY_ROW = "NOT_INHERIT_TYPE_COPY_ROW";

	/**
	 * 参照登録を表す定数。
	 * {@link #getNotInheritCols(MCContainer)} で利用する。
	 */
	protected static final String NOT_INHERIT_TYPE_REF_UPD = "NOT_INHERIT_TYPE_REF_UPD";

	/**
	 * 行コピー時の引き継がない項目をクリアするメソッド
	 *
	 * @param table テーブル
	 * @param row 行コピーして新規に作成されたRow
	 */
	protected <E extends MCConstRow> void clearNotInheritInfo(MCTable<E> table, E row) {
		List<String> cols = getNotInheritCols(NOT_INHERIT_TYPE_COPY_ROW, table.getList());
		row.clear(cols.toArray(new String[0]));
	}

	/**
	 * 参照登録時の引き継がない項目をクリアするメソッド
	 *
	 * @param containers 引き継がない項目をクリアするコンテナ
	 */
	protected void clearNotInheritInfo(List<MCContainer> containers) {
		for (MCContainer cont : containers) {
			List<String> cols = getNotInheritCols(NOT_INHERIT_TYPE_REF_UPD, cont);
			cont.clear(cols.toArray(new String[0]));
		}
	}
	/**
	 * 参照登録時・行コピー時の引き継がない項目名を返すメソッド
	 * システム情報は追加済みです。
	 *
	 * @param type 行コピーの場合は {@link #NOT_INHERIT_TYPE_COPY_ROW} 、参照登録の場合は {@link #NOT_INHERIT_TYPE_REF_UPD} が指定される。
	 * @param cont opePanelGetRegBlocks()で指定した登録用コンテナ
	 */
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> l = new ArrayList<>();

		if (cont instanceof MCList) {
			MCList<?> ls = (MCList<?>) cont;
			l = Arrays.asList(ls.createRow().getColumnPathArray());
		}
		else if (cont instanceof MCRow) {
			MCRow row = (MCRow) cont;
			l = Arrays.asList(row.getColumnPathArray());
		}

		List<String> colL = new ArrayList<>();
		// システム情報
		for (String col : getSystemInfoCols()) {
			if (l.contains(col)) {
				colL.add(col);
			}
		}
		// 更新カウンタ
		for (String col : l) {
			if (cont.getMeta(col).metaEquals(mcframe.commonMA.meta.MA_META.UPD_CNT)) {
				colL.add(col);
			}
		}
		return colL;
	}
	/**
	 * システム情報の項目名を返すメソッド
	 */
	protected String[] getSystemInfoCols() {
		return new String[] {
				INS_USR_ID, INS_USR_NM, INS_TS, INS_FUNC_ID, INS_FUNC_NM, UPD_CNTR,
				UPD_USR_ID, UPD_USR_NM, UPD_TS, UPD_FUNC_ID, UPD_FUNC_NM, UPD_SRV_REQ_NO,
				DEL_USR_ID, DEL_USR_NM, DEL_TS
		};
	}
	/**
	 * システムパラメータDEF_WG_CDが設定されている場合、登録対象の「共通」、「WG」をREAD_ONLYの状態にします。
	 * @param cmn_flg 共通のMCCheckBox
	 * @param wg_flg WGのMCCheckBox
	 */
	protected void setRegTgtModeByDefWgCd(MCCheckBox cmn_flg, MCCheckBox wg_flg) {
		String dispKeyWg = "WG";
		if (!isNull(getSysParm("DEF_WG_CD"))) {
			cmn_flg.setMode(MCMode.READ_ONLY);
			wg_flg.setMode(MCMode.READ_ONLY);
			if (_dispctl2Comps == null) {
				_dispctl2Comps = new HashMap<>();
				_dispctl2Comps.put(dispKeyWg, new HashSet<>());
			}
			HashSet<MCModeBeans> s = _dispctl2Comps.get(dispKeyWg);
			s.add(cmn_flg);
			s.add(wg_flg);
		}
	}
	/**
	 * システムパラメータDEF_WG_CDが設定されている場合、登録対象の「共通」をOFF、「WG」をONの状態にします。
	 * @param cmn_flg 共通のMCCheckBox
	 * @param wg_flg WGのMCCheckBox
	 */
	protected void initRegTgtByDefWgCd(MCCheckBox cmn_flg, MCCheckBox wg_flg) {
		if(!isNull(getSysParm("DEF_WG_CD"))){
			cmn_flg.setValue(true);
			wg_flg.setValue(false);
		}
	}
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (this instanceof IfOpePanel) {
			IfOpePanel p = (IfOpePanel)this;
			if (vc == p.getOpeButtonGroup()) {
				return doOpeChngVCBase(info, p);
			}
		}
		return true;
	}
	/**
	 * IfOpePanelの操作種別のValidationChangeメソッド。<BR>
	 * オーバーライド用
	 * @param info イベント情報
	 * @param p IfOpePanel
	 * @param bfOpe 変更前操作種別
	 * @param afOpe 変更後操作種別
	 * @param bfSt 変更前画面ステータス
	 * @return boolean 変更可ならtrue
	 */
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {
		return true ;
	}
	/**
	 * IfOpePanelの操作種別のValidationChangeメソッド。
	 *
	 * @param info イベント情報
	 * @param p IfOpePanel
	 */
	protected boolean doOpeChngVCBase(MCEventInfo info, IfOpePanel p) {
		String bfOpe = (String)info.getOldValue();
		String afOpe = (String)info.getNewValue();
		String bfSt = this.getStatus();

		// オーバーライド用メソッドの呼び出し
		if (!doOpeChngVC(info, p, bfOpe, afOpe, bfSt)) {
			return false;
		}

		// 「参照する」で過去のリビジョンＮＯのデータを検索した後に
		// 「訂正する」「取り消す」を選択することはできない
		if (p.getRegLatestFlg() != null) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt) && (isUPDOpe(afOpe) || isDELOpe(afOpe))) {
				if (!p.getRegLatestFlg().getValue()) {
					dialog(msgPastRevisionCannotChanged());
					return false;
				}
 			}
		}
		// 「参照する」で取消データを検索した後に
		// 「訂正する」「取り消す」を選択することはできない
		if (p.getRegCanFlg() != null) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt) && (isUPDOpe(afOpe) || isDELOpe(afOpe))) {
				if (p.getRegCanFlg().getValue()) {
					dialog(msgCanCannotChanged());
					return false;
				}
 			}
		}

		// 登録枠のクリア確認
		if (isFIX_IStatus(bfSt) || isFIX_UStatus(bfSt) || isFIX_DStatus(bfSt)) {
			return true;
		}
		else {
			if (isStatusNone(p.opePanelGetRegBlocks())) {
				return true;
			}
			return confirmRegDataClear();
		}
	}

	/**
	 * 取消データは変更できないメッセージ
	 */
	public MCMessage msgCanCannotChanged() {
		return new MCMessage(MAUDP0009);
	}

	/**
	 * 過去リビジョンのデータは変更できないメッセージ
	 */
	public MCMessage msgPastRevisionCannotChanged() {
		return new MCMessage(MAUDP0007);
	}

	/**
	 * 指定されたステータスが「SRCH」かどうか確認する
	 */
	public boolean isSRCHStatus(String status) {
		return isSame(status, ST_SRCH);
	}

	/**
	 * 指定されたステータスが「REF」かどうか確認する
	 */
	public boolean isREFStatus(String status) {
		return isSame(status, ST_REF);
	}

	/**
	 * 指定されたステータスが「INS」かどうか確認する
	 */
	public boolean isINSStatus(String status) {
		return isSame(status, ST_INS);
	}

	/**
	 * 指定されたステータスが「UPD」かどうか確認する
	 */
	public boolean isUPDStatus(String status) {
		return isSame(status, ST_UPD);
	}

	/**
	 * 指定されたステータスが「DEL」かどうか確認する
	 */
	public boolean isDELStatus(String status) {
		return isSame(status, ST_DEL);
	}

	/**
	 * 指定されたステータスが「FIX_I」かどうか確認する
	 */
	public boolean isFIX_IStatus(String status) {
		return isSame(status, ST_FIX_I);
	}

	/**
	 * 指定されたステータスが「FIX_U」かどうか確認する
	 */
	public boolean isFIX_UStatus(String status) {
		return isSame(status, ST_FIX_U);
	}

	/**
	 * 指定されたステータスが「FIX_D」かどうか確認する
	 */
	public boolean isFIX_DStatus(String status) {
		return isSame(status, ST_FIX_D);
	}

	/**
	 * 指定された種別が「登録」かどうか確認する
	 */
	public boolean isINSOpe(String ope) {
		return isSame(ope, OPE_INS);
	}

	/**
	 * 指定された種別が「訂正」かどうか確認する
	 */
	public boolean isUPDOpe(String ope) {
		return isSame(ope, OPE_UPD);
	}

	/**
	 * 指定された種別が「取消」かどうか確認する
	 */
	public boolean isDELOpe(String ope) {
		return isSame(ope, OPE_DEL);
	}

	/**
	 * 指定された種別が「参照」かどうか確認する
	 */
	public boolean isREFOpe(String ope) {
		return isSame(ope, OPE_REF);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (this instanceof IfOpePanel) {
			IfOpePanel p = (IfOpePanel)this;
			if (nc == p.getOpeButtonGroup()) {
				doOpeChngNCBase(info, p);
			}
			else if (nc == getCndLatestFlg()) {
				doCndLatestFlgNCBase(info);
			}
			else if (nc == getCndRevNo()) {
				doCndRevNoNCBase(info);
			}
		}
	}

	/**
	 * IfOpePanelの操作種別のNotificationChangeメソッド。<BR>
	 * オーバーライド用<BR>
	 * doOpeChngNCの前処理を実装する。<BR>
	 * doOpeChngNCはdoOpeChngNCBaseで登録枠などがクリアされた後で呼ばれるため、クリア前の情報を使った処理はここに実装する。<BR>
	 * 
	 * @param info イベント情報
	 * @param p IfOpePanel
	 * @param bfOpe 変更前操作種別
	 * @param afOpe 変更後操作種別
	 * @param bfSt 変更前画面ステータス
	 * @param afSt 変更後画面ステータス
	 */
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		// 何もしない
	}

	/**
	 * IfOpePanelの操作種別のNotificationChangeメソッド。<BR>
	 * オーバーライド用
	 * 種別変更後の初期値設定などを実装する。<BR>
	 * doOpeChngNCBaseで登録枠などがクリアされた後で呼ばれる点に注意する。<BR>
	 * @param info イベント情報
	 * @param p IfOpePanel
	 * @param bfOpe 変更前操作種別
	 * @param afOpe 変更後操作種別
	 * @param bfSt 変更前画面ステータス
	 * @param afSt 変更後画面ステータス
	 */
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		// 何もしない
	}

	/**
	 * IfOpePanelの操作種別のNotificationChangeメソッド。
	 *
	 * @param info イベント情報
	 * @param p IfOpePanel
	 */
	protected void doOpeChngNCBase(MCEventInfo info, IfOpePanel p) {
		String bfSt = this.getStatus();
		String bfOpe = (String)info.getOldValue();
		String afOpe = (String)info.getNewValue();

		// オーバーライド用メソッドの呼び出し
		beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, this.getStatus());

		// 登録枠のクリア
		if (!(isREFOpe(bfOpe) && isREFStatus(bfSt))) {
			clearContainers(p.opePanelGetRegBlocks());
		}

		// 検索枠のクリア
		if (isINSOpe(afOpe)) {
			clearContainers(p.opePanelGetCndBlocks());
		}

		// 参照登録用ST設定setRowStatusForIns
		// 参照登録時引き継がない項目クリアclearNotInheritInfo
		if (isINSOpe(afOpe)
				&& isREFOpe(bfOpe) && isREFStatus(bfSt)) {
			setRowStatusForIns(p.opePanelGetRegBlocks());
			clearNotInheritInfo(p.opePanelGetRegBlocks());
		}

		// モード変更
		setOpeStatus(bfOpe, afOpe, bfSt);

		// 最新ＦＬＧ
		// 訂正, 取消, 参照に変更した場合はONにする
		// 登録に変更した場合はOFFにする
		if (p.getCndLatestFlg() != null) {
			if ((isUPDOpe(afOpe) || isDELOpe(afOpe) || isREFOpe(afOpe))) {
				setValueEx(p.getCndLatestFlg(), true);
			}
			else if (isINSOpe(afOpe)) {
				setValueEx(p.getCndLatestFlg(), false);
			}
		}

		// フィルスペース
		if (isINSOpe(afOpe)) {
			opePanelFillSpace();
		}
		else if (isUPDOpe(afOpe)) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt)) {
				opePanelFillSpace();
			}
		}

		// STクリア
		if (!(isINSOpe(afOpe)
				&& isREFOpe(bfOpe) && isREFStatus(bfSt))) {
			statusClear();
		}

		// オーバーライド用メソッドの呼び出し
		doOpeChngNC(info, p, bfOpe, afOpe, bfSt, this.getStatus());
	}

	/**
	 * 種別切替時のステータス設定をする処理です。
	 *
	 * @param bfOpe 変更前の種別
	 * @param afOpe 変更後の種別
	 * @param bfSt 変更前のステータス
	 */
	protected void setOpeStatus(String bfOpe, String afOpe, String bfSt) {
		if (isINSOpe(afOpe)) {
			setINSStatus();
		}
		else if (isUPDOpe(afOpe)) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt)) {
				setUPDStatus();
			}
			else {
				setSRCHStatus();
			}
		}
		else if (isDELOpe(afOpe)) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt)) {
				setDELStatus();
			}
			else {
				setSRCHStatus();
			}
		}
		else if (isREFOpe(afOpe)) {
			setSRCHStatus();
		}
	}

	public void setSRCHStatus() {

	}

	public void setINSStatus() {

	}

	public void setUPDStatus() {

	}

	public void setDELStatus() {

	}

	public void setREFStatus() {

	}

	public void setFIX_IStatus() {

	}

	public void setFIX_UStatus() {

	}

	public void setFIX_DStatus() {

	}

	// 以下、フィルスペース関連
	protected void opePanelFillSpace() {
		for (MCTable<?> tbl : opePanelFillSpaceTables()) {
			tbl.fillSpace();
		}
	}

	private List<MCTable> _opePanelFillSpaceTables;
	protected List<MCTable> opePanelFillSpaceTables() {
		if (_opePanelFillSpaceTables == null) {
			_opePanelFillSpaceTables = new ArrayList<MCTable>();
			if (this instanceof IfOpePanel) {
				IfOpePanel p = (IfOpePanel) this;
				for (MCContainer c : p.opePanelGetRegBlocks()) {
					if (c instanceof MCList) {
						javax.swing.JComponent comp = getComponent((MCList<?>) c);
						if (comp instanceof MCTable) {
							_opePanelFillSpaceTables.add((MCTable<?>) comp);
						}
					}
				}
			}
		}
		return _opePanelFillSpaceTables;
	}
	@Override
	public boolean clear(MCTable table) {
		if (super.clear(table)) {
			return true;
		}
		MCList<?> list = table.getList();
		boolean ans = false;
		if (list.isStatusNone() || confirmTableClear()) {
			table.clear();
			if (this instanceof IfOpePanel) {
				String st = this.getStatus();
				if (isINSStatus(st) || isUPDStatus(st)) {

					List<MCTable> tList = opePanelFillSpaceTables();
					if (tList != null && tList.contains(table)) {
						table.fillSpace();
					}
				}
			}
			ans = true;
		}
		return ans;
	}

	@Override
	protected void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		if (this instanceof IfOpePanel) {
			String st = this.getStatus();
			if (isINSStatus(st) || isUPDStatus(st)) {
				opePanelFillSpace();
			}
		}
	}

	public MCMessage msgOpeConfirm(IfOpePanel p) {
		MCButtonGroup b = p.getOpeButtonGroup();
		return new MCMessage(MAUDP0001, b.getSelectedButton().getMessageByLocale());
	}
	@Override
	public MCMessage msgUpdateConfirm() {
		if (this instanceof IfOpePanel) {
			return msgOpeConfirm((IfOpePanel)this);
		}
		return super.msgUpdateConfirm();
	}
	@Override
	public MCMessage msgDeleteConfirm() {
		if (this instanceof IfOpePanel) {
			return msgOpeConfirm((IfOpePanel)this);
		}
		return msgCancelConfirm();
	}
	@Override
	public MCMessage msgDeleted() {
		if (this instanceof IfOpePanel) {
			return msgOpeDone((IfOpePanel)this);
		}
		return msgCanceled();
	}
	@Override
	public MCMessage msgDeleteFailed() {
		if (this instanceof IfOpePanel) {
			return msgOpeFailed((IfOpePanel)this);
		}
		return msgCancelFailed();
	}

	public MCMessage msgOpeDone(IfOpePanel p) {
		MCButtonGroup b = p.getOpeButtonGroup();
		return new MCMessage(MAUDP0002, b.getSelectedButton().getMessageByLocale());
	}
	@Override
	public MCMessage msgUpdated() {
		if (this instanceof IfOpePanel) {
			return msgOpeDone((IfOpePanel)this);
		}
		return super.msgUpdated();
	};

	public MCMessage msgOpeFailed(IfOpePanel p) {
		MCButtonGroup b = p.getOpeButtonGroup();
		return new MCMessage(MAUDP0003, b.getSelectedButton().getMessageByLocale());
	}
	@Override
	public MCMessage msgUpdateFailed() {
		if (this instanceof IfOpePanel) {
			return msgOpeFailed((IfOpePanel)this);
		}
		return super.msgUpdateFailed();
	};

	// 最新ＦＬＧ・リビジョンＮＯ制御（ここから）

	/**
	 * 検索枠の最新ＦＬＧの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 *
	 * @return　検索枠の最新ＦＬＧ画面部品
	 */
	public MCCheckBox getCndLatestFlg() {
		return null;
	}

	/**
	 * 検索枠のリビジョンＮＯの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 *
	 * @return　検索枠のリビジョンＮＯ画面部品
	 */
	public MCRowBeans getCndRevNo() {
		return null;
	}

	/**
	 * 登録枠の最新ＦＬＧの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 *
	 * @return　登録枠の最新ＦＬＧ画面部品
	 */
	public MCCheckBox getRegLatestFlg() {
		return null;
	}
	
	/**
	 * 登録枠の取消ＦＬＧの画面部品を返します。<br>
	 * 取消データを照会できるアプリでオーバーライドします。
	 * 
	 * @return　登録枠の取消ＦＬＧ画面部品
	 */
	public MCCheckBox getRegCanFlg() {
		return null;
	}

	protected void doCndLatestFlgNCBase(MCEventInfo info) {
		setRevNo();
		setRevNoMode();
	}

	/**
	 * 検索枠のリビジョン番号のモードを設定します。
	 */
	public void setRevNoMode() {
		if (getCndRevNo() == null) {
			return;
		}

		if (this instanceof IfOpePanel) {
			if (isREFOpe(((IfOpePanel)this).getOpeButtonGroup().getSelectedButton().getActionCommand())) {
				getCndLatestFlg().setMode(MCMode.REQUIRED);
				if (getCndLatestFlg().getValue()) {
					((MCModeBeans) getCndRevNo()).setMode(MCMode.ENABLE);
				}
				else {
					((MCModeBeans) getCndRevNo()).setMode(MCMode.REQUIRED);
				}
			}
			else {
				((MCModeBeans) getCndRevNo()).setMode(MCMode.READ_ONLY);
				getCndLatestFlg().setMode(MCMode.READ_ONLY);
			}
		}
	}

	protected boolean isEditableMode(MCModeBeans beans) {
		if (beans == null) {
			return false;
		}
		MCMode mode = beans.getMode();
		return (MCMode.ENABLE == mode || MCMode.REQUIRED == mode);
	}

	protected void setRevNo() {
		if (getCndRevNo() == null) {
			return;
		}

		if (getCndLatestFlg().getValue()) {
			setValueEx(getCndRevNo(), null);
		}
	}

	protected void doCndRevNoNCBase(MCEventInfo info) {
		setLatestFlg();
	}

	protected void setLatestFlg() {
		if (getCndLatestFlg() == null) {
			return;
		}

		if (!isNull(getCndRevNo().getRowValue())) {
			setValueEx(getCndLatestFlg(), false);
		}
	}

	// 最新ＦＬＧ・リビジョンＮＯ制御（ここまで）

	// ///////////////////////////////////////////////
	// 操作種別画面の実装（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 選択チェック関連ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 更新対象（選択＝オン）に絞り込んで返します。
	 * @param list リスト
	 * @return 選択＝オンのリスト
	 */
	public MCList<MCRow> getPickedRows(MCList<MCRow> list) {
		return list.subList(getCheckColumn(), true);
	}

	/**
	 * 全選択<br>
	 * 指定テーブルの既存行・変更行を全選択します。
	 * @param tab テーブル
	 */
	protected void doSelectAll(MCTable tab) {
		MCColumnConfig chkCol = getCheckColumnConfig(tab);
		doSelectAll(tab, chkCol);
	}

	/**
	 * 全選択<br>
	 * 指定テーブルの既存行・変更行を全選択します。
	 * @param tab テーブル
	 * @param chkCol 「選択」のカラムコンフィグ
	 */
	protected void doSelectAll(MCTable tab, MCColumnConfig chkCol) {
		if (chkCol == null) {
			return ;
		}
		MCList<MCRow> l = (MCList<MCRow>)tab.getViewRows();
		for (MCRow row : l) {
			int i = row.getGUIIndex();
			// 編集可能かつ固定カラムが一つでも空でない行を選択チェック
			if (isEditable(chkCol, i) && !row.isEmpty(row.getConstNameArray())) {
				setValueEx(chkCol, i, true);
			}
		}
	}

	/**
	 * 全選択解除<br>
	 * 指定テーブルの全選択を解除します。
	 * @param tab テーブル
	 */
	protected void doDeselectAll(MCTable tab) {
		MCColumnConfig chkCol = getCheckColumnConfig(tab);
		doDeselectAll(tab, chkCol);
	}

	/**
	 * 全選択解除<br>
	 * 指定テーブルの全選択を解除します。
	 * @param tab テーブル
	 * @param chkCol 「選択」のカラムコンフィグ
	 */
	protected void doDeselectAll(MCTable tab, MCColumnConfig chkCol) {
		if (chkCol == null) {
			return ;
		}
		MCList<MCRow> l = (MCList<MCRow>)tab.getViewRows();
		for (MCRow row : l) {
			int i = row.getGUIIndex();
			// 編集可能な選択チェックをオフ
			if (isEditable(chkCol, i)) {
				setValueEx(chkCol, i , false);
			}
		}
	}

	/**
	 * 指定テーブルの「選択」のカラムコンフィグを返します。
	 * @param tab テーブル
	 * @return 「選択」のカラムコンフィグ
	 */
	protected MCColumnConfig getCheckColumnConfig(MCTable tab) {
		for (MCColumnConfig c : tab.getColumnConfigs()) {
			if (getCheckColumn().equals(c.getRowColumnName())) {
				return c;
			}
		}
		return null;
	}

	/**
	 * 「選択」のカラム名を返します。<br>
	 * （デフォルトは"check"。）
	 * @return 「選択」のカラム名
	 */
	public String getCheckColumn() {
		return "check";
	}

	protected boolean isListRegTable(MCTable<?> table) {
		return table != null && (this instanceof IfListRegPanel)
				&& table.equals(((IfListRegPanel)this).getListRegTable());
	}

	// ///////////////////////////////////////////////
	//　一覧登録画面用の共通処理（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void listenerInit() {
		super.listenerInit();
		if (this instanceof IfListRegPanel) {
			IfListRegPanel p = (IfListRegPanel)this;
			MCTable<?> t = p.getListRegTable();

			// Rowコンテナの値の変更を検知するためRowListnerをセットする
			setListListener(t, createListRegRowListener());
		}
	}


	protected MAUDP_RowListener createListRegRowListener() {
		return new ListRegRowListener();
	}

	protected class ListRegRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			if (event.getOldStatus() != MCRow.Status.NONE) {
				return;
			}
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				// 「選択」カラム以外の値変更によってステータスが変更された場合はチェックをオンにする
				// チェックをオンにした場合のデフォルト値の制御は各画面で行う想定
				boolean check = r.getBoolean(getCheckColumn());
				if (!check) {
					setCheckOnWhenStatusChanged(r);
				}
			}
		}
	}

	/**
	 * Rowステータスが変更されたときの処理を実行する。
	 *  IfListRegPanelを実装している画面で、Rowステータスが変更されたときの処理を変更する場合は、この処理をO/Rし、実装します。
	 *
	 * @param row ステータスが変更されたRow
	 */
	protected void setCheckOnWhenStatusChanged(MCConstRow row) {
		row.setBoolean(getCheckColumn(), true);
		setDefaultValueWhenChecked(row);
	}

	/**
	 * チェックがオンになった行へ初期値を設定する。
	 * IfListRegPanelを実装している画面で、選択カラムのチェックをオンにしたときに
	 * 初期値を設定する場合は、この処理をO/Rし、実装します。
	 *
	 * @param srcRow
	 */
	public void setDefaultValueWhenChecked(MCRow srcRow) {

	}

	// ///////////////////////////////////////////////
	//　一覧登録画面用の共通処理（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	//　行移動の共通処理（ここから）
	// ///////////////////////////////////////////////

	/**
	 * テーブルの選択行を１行上に移動します。
	 * @param t 対象のテーブル
	 */
	protected void upwardRows(MCTable<?> t) {
		int[] o = t.getMCSelectedRows();

		// 移動可否をチェックする
		if (!canUpward(o)) {
			return;
		}

		// 選択をクリアする
		t.mcClearSelection();

		int[] n = new int[o.length];
		int c = 0;
		int midx = 0;

		// 選択行を移動する
		for (int i : o) {
			if (i >= 0) {
				if (i != 0 && c != i) {
					midx = i - 1;
					t.moveRow(i, midx);
					i--;
				}
				n[c++] = i;
			}
		}

		// 移動後の行を選択する
		if (c != 0) {
			t.selectRowsNoFocus(n);
		}
	}

	/**
	 * テーブルの行移動可否をチェックします。
	 * テーブルの指定されたインデックスの行を１行上に移動できる場合は true を返します。
	 *
	 * @param indexes 行インデックスの配列
	 * @return 指定された行を１行上に移動できない場合は false
	 */
	boolean canUpward(int[] indexes) {
		if (indexes == null) {
			return false;
		}
		int m = 0;
		for (int i = indexes.length - 1; i > -1; i--) {
			if (indexes[i] != m++) {
				return true;
			}
		}
		return false;
	}

	/**
	 * テーブルの選択行を１行下に移動します。
	 * @param t 対象のテーブル
	 */
	protected void downwardRows(MCTable<?> t) {
		int[] o = t.getMCSelectedRows();

		// 移動可否をチェックする
		if (!canDownward(t, o)) {
			return;
		}

		// 選択をクリアする
		t.mcClearSelection();

		int[] n = new int[o.length];
		int c = 0;
		int m = t.getRowCount() - 1;
		int tc = t.getRowCount();
		int midx = 0;

		// 選択行を移動する
		for (int i=o.length-1;i>=0;i--) {
			int idx = o[i];
			if (m >= idx) {
				if (idx != m && (c != tc - idx)) {
					midx = idx + 1;
					t.moveRow(idx, midx);
					idx++;
				}
				n[c++] = idx;
			}
		}

		// 移動後の行を選択する
		if (c != 0) {
			t.selectRowsNoFocus(n);
		}
	}

	/**
	 * 選択された行を下に移動できる場合は true を返します。
	 *
	 * @param t 対象のテーブル
	 * @param indexes 行のインデックス値
	 * @return 選択された行を下に移動できない場合は false
	 */
	boolean canDownward(MCTable<?> t, int[] indexes) {
		if (indexes == null) {
			return false;
		}
		int m = t.getRowCount() - 1;
		for (int i=indexes.length - 1;i>-1;i--) {
			if (indexes[i] != m--) {
				return true;
			}
		}
		return false;
	}

	/**
	 * テーブルの選択行を一番上に移動します。
	 * @param t 対象のテーブル
	 */
	protected void moveToTopRows(MCTable<?> t) {
		int[] o = t.getMCSelectedRows();

		// 移動可否をチェックする
		if (!canUpward(o)) {
			return;
		}

		// 選択をクリアする
		t.mcClearSelection();

		int[] n = new int[o.length];
		int c = 0;

		// 選択行を移動する
		for (int i=0;i<o.length;i++) {
			int idx = o[i];
			if (idx >= 0) {
				if (idx != 0) {
					t.moveRow(idx, i);
				}
				n[c++] = i;
			}
		}

		// 移動後の行を選択する
		if (c != 0) {
			t.selectRowsNoFocus(n);
		}
	}

	/**
	 * テーブルの選択行を一番下に移動します。
	 * @param t 対象のテーブル
	 */
	protected void moveToBottomRows(MCTable<?> t) {
		int[] o = t.getMCSelectedRows();

		// 移動可否をチェックする
		if (!canDownward(t, o)) {
			return;
		}

		// 選択をクリアする
		t.mcClearSelection();
		int[] n = new int[o.length];
		int c = 0;
		int m = t.getRowCount() - 1;
		int t_cnt = t.getRowCount();

		// 選択行を移動する
		for (int i=o.length - 1;i>-1;i--) {
			int idx = o[i];
			if (c + idx != t_cnt) {
				t.moveRow(idx, m);
			}
			n[c++] = m--;
		}

		// 移動後の行を選択する
		if (c != 0) {
			t.selectRowsNoFocus(n);
		}
	}
	// ///////////////////////////////////////////////
	//　行移動の共通処理（ここまで）
	// ///////////////////////////////////////////////

	@Override
	public void layoutInit() {
		boolean initialized = isLayoutInitialized();
		
		super.layoutInit();

		MCPanel panel = getOpeHdrPanel();
		if (panel != null) {
			MCScrollPane sp = null;

			Container parent = panel.getParent();
			LayoutManager layout = parent.getLayout();
			Component[] compos = parent.getComponents();
			if (layout instanceof BorderLayout) {
				BorderLayout bl = (BorderLayout)layout;
				Object[] consts = new Object[compos.length];
				for (int i = 0; i < compos.length; i++) {
					consts[i] = bl.getConstraints(compos[i]);
				}

				parent.removeAll();

				sp = beansFactory.createScrollPane("_for_header");
				sp.setViewportView(panel);

				for (int i = 0; i < compos.length; i++) {
					parent.add(compos[i] == panel ? sp : compos[i], consts[i]);
				}
			}
			else if (layout instanceof BoxLayout) {
				parent.removeAll();

				sp = beansFactory.createScrollPane("_for_header");
				sp.setViewportView(panel);

				for (int i = 0; i < compos.length; i++) {
					parent.add(compos[i] == panel ? sp : compos[i]);
				}
			}

			if (sp != null) {
				int w = sp.getVerticalScrollBar().getPreferredSize().width;
				Dimension ps = getPreferredSize();
				setPreferredSize(new Dimension(ps.width + w, ps.height));
				
				if (!initialized) {
					Dimension fs = getFrame().getSize();
					getFrame().setSize(fs.width + w, fs.height);
				}
			}
		}

		panel = getSplitPaneTopPanel();
		if (panel != null) {
			Container p = panel.getParent();
			while (p != null) {
				if (p instanceof MCSplitPane) {
					int pos = getOpeTopPanelDividerLocation();
					if (((MCSplitPane)p).getDividerLocation() > pos) {
						((MCSplitPane)p).setDividerLocation(pos);
					}
					break;
				}
				p = p.getParent();
			}
		}

	}

	/**
	 * 単票画面のヘッダパネルを返します。
	 */
	protected MCPanel getOpeHdrPanel() {
		if (this instanceof IfOpePanel) {
			for (MCPanel panel : MCBeansUtil.getComponents(MCPanel.class, this)) {
				String pos = panel.getLayoutPosition();
				if (!isNull(pos) && pos.startsWith("CT")) {
					return panel;
				}
			}
		}
		return null;
	}

	/**
	 * スプリットペインのTOPに配置されるパネルを返します。
	 */
	protected MCPanel getSplitPaneTopPanel() {
		if (this instanceof IfOpePanel) {
			for (MCPanel panel : MCBeansUtil.getComponents(MCPanel.class, this)) {
				String pos = panel.getLayoutPosition();
				if (!isNull(pos) && pos.startsWith("CT")) {
					return panel;
				}
			}
		}
		return null;
	}

	/**
	 * 単票画面のヘッダと明細を分割するスプリットペインのディバイダ位置を返します。
	 * <p>
	 * デフォルトは300です。
	 * 変更する場合はMCAppClientリソースに[MODULE_ID].[SCREEN_ID].ope.top.divider.locationを設定してください。
	 */
	protected int getOpeTopPanelDividerLocation() {
		int def = 300;
		return getPgmSettingIntNE(this, def, "ope.top.divider.location");
	}

	/**
	 * 会社情報を取得しキャッシュします。
	 *
	 * @return 会社情報
	 */
	public CoR getCo() {
		String key = "MA.MAUDP0010.CO";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getCoNoCache());
		}
		return (CoR) getCachedSysInfo(key);
	}

	@Override
	public String getSysParm(String parm_key) {
		String key = "MA.MAUDP0010.SYS_PARM.";
		if (!isCachedSysInfo(key + parm_key)) {
			for(SysParmR r: getSysParmAllNoCache()){
				cacheSysInfo(key + r.parm_key(), r.parm_val());
			}
		}
		return (String) getCachedSysInfo(key + parm_key);
	}
	/**
	 * 担当者権限情報を取得しキャッシュします。
	 *
	 * @return 担当者権限情報
	 */
	public UsrAclR getUsrAcl() {
		String key = "MA.MAUDP0010.USR_ACL";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getUsrAclNoCache());
		}
		return (UsrAclR) getCachedSysInfo(key);
	}


	// ///////////////////////////////////////////////
	// 取引関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 指定された取引パタン区分で自動時採用ＦＬＧがオンのものをデフォルト取引ＣＤとして取得しキャッシュします。
	 *
	 * @param trd_ptn_typ 取引パタン区分
	 * @return デフォルト取引ＣＤ
	 */
	public String getDefaultTrdCd(String trd_ptn_typ) {
		String key = "MA.MAUDP0010.TRD_PTN_TYP." + trd_ptn_typ;
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getDefaultTrdCdNoCache(trd_ptn_typ));
		}
		return (String) getCachedSysInfo(key);
	}

	/**
	 * 指定された取引ＣＤに応じた取引情報を取得しキャッシュします。
	 *
	 * @param trd_cd 取引ＣＤ
	 * @return 取引情報
	 */
	public TrdR getTrd(String trd_cd) {
		String key = "MA.MAUDP0010.TRD_CD." + trd_cd;
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getTrdNoCache(trd_cd));
		}
		return (TrdR) getCachedSysInfo(key);
	}
	// ///////////////////////////////////////////////
	// 取引関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 基準通貨、納税通貨関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 基準通貨情報を取得しキャッシュします。
	 *
	 * @return 基準通貨情報
	 */
	public BaseCurR getBaseCur() {

		String key = "MA.MAUDP0010.BASE_CUR";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getBaseCurNoCache());
		}
		return (BaseCurR) getCachedSysInfo(key);
	}

	/**
	 * 納税通貨情報を取得しキャッシュします。
	 *
	 * @return 納税通貨情報
	 */
	public PtaxCurR getPtaxCur() {
		String key = "MA.MAUDP0010.PTAX_CUR";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getPtaxCurNoCache());
		}
		return (PtaxCurR) getCachedSysInfo(key);
	}
	// ///////////////////////////////////////////////
	// 基準通貨、納税通貨関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// デフォルト格付関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * デフォルト格付情報を取得しキャッシュします。
	 *
	 * @return デフォルト格付情報
	 */
	public GdR getDefaultFeedStkGd() {
		String key = "MA.MAUDP0010.DEFFD_STKGD";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getDefaultFeedStkGdNoCache());
		}
		return (GdR) getCachedSysInfo(key);
	}
	// ///////////////////////////////////////////////
	// デフォルト格付関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// ライセンス関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * ライセンス情報を取得しキャッシュします。
	 *
	 * @return ライセンス情報
	 */
	public LicenceR getLicenceInfo() {
		String key = "MA.MAUDP0010.LICENCE_INFO";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getLicenceInfoNoCache());
		}
		return (LicenceR) getCachedSysInfo(key);
	}
	// ///////////////////////////////////////////////
	// ライセンス関連（ここまで）
	// ///////////////////////////////////////////////

	
	/**
	 * 対象期間マスタ情報を取得しキャッシュします。
	 * @return 対象期間マスタ情報（全て）
	 */
	public MCList<TermR> getTermList() {
		String key = "MA.MAUDP0010.TERM_LIST";
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getTermListNoCache());
		}
		return (MCList<TermR>) getCachedSysInfo(key);
	}

	// ///////////////////////////////////////////////
	// 入力値チェック関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 入力値チェックを行います。
	 *
	 * @param func_typ 機能区分
	 * @param tarL 入力チェックのリスト
	 */
	protected void doInptChk(String func_typ, MCList<Srch02_DtlR> tarL) {
		// テストに便利なように、開発時は常に入力値チェックするようにする実装
		if (!isInptChkFunc(func_typ) && MCConfig.common.getBoolean("log.devlog", false) == false) {
			return;
		}

		doInptChkNoCache(func_typ, tarL);
	}

	/**
	 * 入力値チェックをする。
	 *
	 * @param func_typ 機能区分
	 * @param itm_cd 品目ＣＤのカラム
	 * @param itm_sub1 枝番１のカラム
	 * @param itm_sub2 枝番２のカラム
	 * @param itm_sub3 枝番３のカラム
	 * @param num 実績数のカラム（数値型）
	 * @param base_num 予定数のカラム（数値型）
	 * @param tarL チェック対象のListコンテナ
	 * @param keyColumns 対象行を特定するためのキー項目のカラム
	 * @return チェックの結果
	 */
	public MCMessageList doInptChk(String func_typ, MCColumnConfig itm_cd,
			MCColumnConfig itm_sub1, MCColumnConfig itm_sub2, MCColumnConfig itm_sub3,
			MCColumnConfig num, MCColumnConfig base_num, MCList<?> tarL,
			MCColumnConfig... keyColumns) {
		
		return doInptChk(func_typ, itm_cd, itm_sub1, itm_sub2, itm_sub3, num, base_num, num, tarL, keyColumns);
	}

	/**
	 * 入力値チェックをする。
	 *
	 * @param func_typ 機能区分
	 * @param itm_cd 品目ＣＤのカラム
	 * @param itm_sub1 枝番１のカラム
	 * @param itm_sub2 枝番２のカラム
	 * @param itm_sub3 枝番３のカラム
	 * @param num 実績数のカラム（数値型）
	 * @param base_num 予定数のカラム（数値型）
	 * @param causeColumn メッセージを作成する場合のcauseColumn
	 * @param tarL チェック対象のListコンテナ
	 * @param keyColumns 対象行を特定するためのキー項目のカラム
	 * @return チェックの結果
	 */
	public MCMessageList doInptChk(String func_typ, MCColumnConfig itm_cd,
			MCColumnConfig itm_sub1, MCColumnConfig itm_sub2, MCColumnConfig itm_sub3,
			MCColumnConfig num, MCColumnConfig base_num,
			MCColumnConfig causeColumn, MCList<?> tarL,
			MCColumnConfig... keyColumns) {
		
		MCList<mcframe.clientMAUC.MAUCP0050.Srch02_DtlR> dtl = MCList
				.create(mcframe.clientMAUC.MAUCP0050.Srch02_DtlR.class);
		mcframe.clientMAUC.MAUCP0050.Srch02_DtlR dtlR;

		String tarIndexColumn = "tarIndexColumn";
		for (int i = 0; i < tarL.size(); i++) {
			MCRow r = tarL.get(i);
			dtlR = dtl.createRow();
			dtlR.itm_cd(r.getString(itm_cd.getBaseRowColumnName()));
			dtlR.itm_sub1(r.getString(itm_sub1.getBaseRowColumnName()));
			dtlR.itm_sub2(r.getString(itm_sub2.getBaseRowColumnName()));
			dtlR.itm_sub3(r.getString(itm_sub3.getBaseRowColumnName()));
			dtlR.num(r.getNumber(num.getBaseRowColumnName()));
			dtlR.base_num(r.getNumber(base_num.getBaseRowColumnName()));
			dtlR.setGUIIndex(r.getGUIIndex());
			dtlR.addNumberColumn(tarIndexColumn, MCNumber.valueOf(i));
			dtl.add(dtlR);
		}

		doInptChk(func_typ, dtl);
		
		MCMessageList ret = new MCMessageList();
		for (mcframe.clientMAUC.MAUCP0050.Srch02_DtlR r : dtl) {
			if (r.up_lmt_rslt_flg()) {
				StringBuilder keyString = new StringBuilder();
				String sp = "";

				MCNumber tarIndex = r.getNumber(tarIndexColumn);
				MCRow tar = tarL.get(tarIndex.intValueExact());
				for (MCColumnConfig keyCol : keyColumns) {
					MCMessage msgForBind = new MCMessage(MAUCP0025, keyCol.getMessageByLocale(), 
							tar.getValue(keyCol.getBaseRowColumnName()));
					keyString.append(msgForBind.toString() + sp);
					sp = MCStringUtil.CRLF_CODE;
				}

				ret.add(new MCMessage(tar, causeColumn.getBaseRowColumnName(),
						MAUCP0023, num.getMessageByLocale(), r.num(), base_num.getMessageByLocale(), 
							r.up_rate_lmt(), r.up_rate_lmt().multiply(r.base_num()),keyString, toDispGUIIndex(tar)));
			}
			else if (r.low_lmt_rslt_flg()) {
				StringBuilder keyString = new StringBuilder();
				String sp = "";
				MCNumber tarIndex = r.getNumber(tarIndexColumn);
				MCRow tar = tarL.get(tarIndex.intValueExact());
				for (MCColumnConfig keyCol : keyColumns) {
					MCMessage msgForBind = new MCMessage(MAUCP0025, keyCol.getMessageByLocale(), 
							tar.getValue(keyCol.getBaseRowColumnName()));
					keyString.append(msgForBind.toString() + sp);
					sp = MCStringUtil.CRLF_CODE;
				}
				
				ret.add(new MCMessage(tar, causeColumn.getBaseRowColumnName(),
						MAUCP0024, num.getMessageByLocale(), r.num(), base_num.getMessageByLocale(), 
							r.low_rate_lmt(), r.low_rate_lmt().multiply(r.base_num()), keyString, toDispGUIIndex(tar)));
			}
		}

		// sort
		MCMessage[] a = ret.toArray(new MCMessage[0]);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				MCRow ajRow = a[j].getCauseRow();
				int ajIndex = -1;
				if (ajRow != null) {
					ajIndex = ajRow.getGUIIndex();
				}
				MCRow aj_1Row = a[j - 1].getCauseRow();
				int aj_1Index = -1;
				if (aj_1Row != null) {
					aj_1Index = aj_1Row.getGUIIndex();
				}
				if (ajIndex < aj_1Index) {
					MCMessage t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		MCMessageList msgList = new MCMessageList();
		for (MCMessage m : a) {
			msgList.add(m);
		}
		return msgList;
	}
	
	/**
	 * 入力値チェック対象かの判定を行い結果をキャッシュします
	 *
	 * @param func_typ 機能区分
	 * @return 入力値チェック対象かどうか
	 */
	public boolean isInptChkFunc(String func_typ) {
		String key = "MA.MAUDP0010.FAILSAFE_FUNC" + func_typ;
		if (!isCachedSysInfo(key)) {
			cacheSysInfo(key, getInptChkFunc(func_typ));
		}
		MCList<Srch01_RsltR> list = (MCList<Srch01_RsltR>) getCachedSysInfo(key);
		return list.subList(Srch01_RsltR.$func_typ, func_typ).size() > 0;
	}

	/**
	 * 入力値チェックをする。
	 *
	 * @param func_typ 機能区分
	 * @param itm_cd 品目ＣＤのカラム
	 * @param itm_sub1 枝番１のカラム
	 * @param itm_sub2 枝番２のカラム
	 * @param itm_sub3 枝番３のカラム
	 * @param act_no 実績ＮＯのカラム
	 * @param before_num 変更前数量のカラム（数値型）
	 * @param input_num 入力値のカラム（数値型）
	 * @param result_num 実績数のカラム（数値型）
	 * @param base_num 予定数のカラム（数値型）
	 * @param tarL チェック対象のListコンテナ
	 * @param causeColumn フォーカスをあてるカラム
	 * @param keyColumns 対象行を特定するためのキー項目のカラム
	 * @return チェックの結果
	 */
	public MCMessageList doInptChk(String func_typ, MCColumnConfig itm_cd,
			MCColumnConfig itm_sub1, MCColumnConfig itm_sub2, MCColumnConfig itm_sub3,
			MCColumnConfig act_no, MCColumnConfig before_num, MCColumnConfig input_num,
			MCColumnConfig result_num, MCColumnConfig base_num, MCList<?> tarL,
			MCColumnConfig causeColumn,
			MCColumnConfig... keyColumns) {
		
		if (isSame(getSysParm("INPT_CHK_INCLD_ACT_QTY_FLG"), "1")) {
			return doInptChk(func_typ, itm_cd, itm_sub1, itm_sub2, itm_sub3, input_num, base_num, causeColumn, tarL, keyColumns);
		}
		return doInptChk(func_typ, itm_cd, itm_sub1, itm_sub2, itm_sub3, act_no, before_num, input_num, result_num, base_num, causeColumn, tarL, keyColumns);
	}

	/**
	 * 入力値チェックをする。
	 *
	 * @param func_typ 機能区分
	 * @param itm_cd 品目ＣＤのカラム
	 * @param itm_sub1 枝番１のカラム
	 * @param itm_sub2 枝番２のカラム
	 * @param itm_sub3 枝番３のカラム
	 * @param act_no 実績ＮＯのカラム
	 * @param before_num 変更前数量のカラム（数値型）
	 * @param input_num 入力値のカラム（数値型）
	 * @param result_num 実績数のカラム（数値型）
	 * @param base_num 予定数のカラム（数値型）
	 * @param causeColumn メッセージを作成する場合のcauseColumn
	 * @param tarL チェック対象のListコンテナ
	 * @param keyColumns 対象行を特定するためのキー項目のカラム
	 * @return チェックの結果
	 */
	public MCMessageList doInptChk(String func_typ, MCColumnConfig itm_cd,
			MCColumnConfig itm_sub1, MCColumnConfig itm_sub2, MCColumnConfig itm_sub3,
			MCColumnConfig act_no, MCColumnConfig before_num, MCColumnConfig input_num,
			MCColumnConfig result_num, MCColumnConfig base_num,
			MCColumnConfig causeColumn, MCList<?> tarL, MCColumnConfig... keyColumns) {

		String tarIndexColumn = "tarIndexColumn";
		MCList<Srch02_DtlR> dtl = createDtlList(tarL, keyColumns, itm_cd, itm_sub1,
				itm_sub2, itm_sub3, act_no, before_num, input_num, result_num, base_num, tarIndexColumn);
		doInptChk(func_typ, dtl);

		MCMessageList ret = extractErrMsg(dtl, tarL, input_num, result_num,
				base_num, causeColumn, keyColumns, tarIndexColumn);
		MCMessageList msgList = sortMsg(ret);
		
		return msgList;
	}

	protected MCList<Srch02_DtlR> createDtlList(MCList<?> tarL,
			MCColumnConfig[] keyColumns, MCColumnConfig itm_cd, MCColumnConfig itm_sub1,
			MCColumnConfig itm_sub2, MCColumnConfig itm_sub3, MCColumnConfig act_no,
			MCColumnConfig before_num, MCColumnConfig input_num,
			MCColumnConfig result_num, MCColumnConfig base_num, String tarIndexColumn) {

		MCList<Srch02_DtlR> dtl = MCList.create(Srch02_DtlR.class);
		for (int i = 0; i < tarL.size(); i++) {
			MCRow r = tarL.get(i);
			Srch02_DtlR dtlR = setDtl(tarL, r, keyColumns, itm_cd, itm_sub1, itm_sub2,
					itm_sub3, act_no, before_num, input_num, result_num, base_num,
					tarIndexColumn, i);
			dtl.add(dtlR);
		}
		return dtl;
	}

	protected Srch02_DtlR setDtl(MCList<?> tarL, MCRow tarR,
			MCColumnConfig[] keyColumns, MCColumnConfig itm_cd, MCColumnConfig itm_sub1,
			MCColumnConfig itm_sub2, MCColumnConfig itm_sub3, MCColumnConfig act_no,
			MCColumnConfig before_num, MCColumnConfig input_num,
			MCColumnConfig result_num, MCColumnConfig base_num, String tarIndexColumn,int i) {

		Srch02_DtlR dtlR = Srch02_DtlR.create();
		dtlR.itm_cd(tarR.getString(itm_cd.getBaseRowColumnName()));
		dtlR.itm_sub1(tarR.getString(itm_sub1.getBaseRowColumnName()));
		dtlR.itm_sub2(tarR.getString(itm_sub2.getBaseRowColumnName()));
		dtlR.itm_sub3(tarR.getString(itm_sub3.getBaseRowColumnName()));
		dtlR.num(getTotalNum(tarR, act_no, before_num, input_num, result_num, tarL, keyColumns));
		dtlR.base_num(tarR.getNumber(base_num.getBaseRowColumnName()));
		dtlR.input_num(tarR.getNumber(input_num.getBaseRowColumnName()));
		dtlR.result_num(tarR.getNumber(result_num.getBaseRowColumnName()));
		dtlR.setGUIIndex(tarR.getGUIIndex());
		dtlR.addNumberColumn(tarIndexColumn, MCNumber.valueOf(i));
		return dtlR;
	}

	protected MCMessageList extractErrMsg(MCList<Srch02_DtlR> dtl,
			MCList<?> tarL, MCColumnConfig input_num, MCColumnConfig result_num,
			MCColumnConfig base_num, MCColumnConfig causeColumn,
			MCColumnConfig[] keyColumns, String tarIndexColumn) {

		MCMessageList ret = new MCMessageList();
		for (mcframe.clientMAUC.MAUCP0050.Srch02_DtlR r : dtl) {
			if (r.up_lmt_rslt_flg()) {
				StringBuilder keyString = new StringBuilder();
				String sp = "";

				MCNumber tarIndex = r.getNumber(tarIndexColumn);
				MCRow tar = tarL.get(tarIndex.intValueExact());
				for (MCColumnConfig keyCol : keyColumns) {
					MCMessage msgForBind = new MCMessage(MAUCP0025, keyCol.getMessageByLocale(), 
							tar.getValue(keyCol.getBaseRowColumnName()));
					keyString.append(msgForBind.toString() + sp);
					sp = MCStringUtil.CRLF_CODE;
				}

				ret.add(new MCMessage(tar, causeColumn.getBaseRowColumnName(),
						MAUCP0069, input_num.getMessageByLocale(), r.input_num(),
							result_num.getMessageByLocale(), r.result_num(),
							r.num(), base_num.getMessageByLocale(),
							r.up_rate_lmt(), r.up_rate_lmt().multiply(r.base_num()),keyString, toDispGUIIndex(tar)));
			}
			else if (r.low_lmt_rslt_flg()) {
				StringBuilder keyString = new StringBuilder();
				String sp = "";
				MCNumber tarIndex = r.getNumber(tarIndexColumn);
				MCRow tar = tarL.get(tarIndex.intValueExact());
				for (MCColumnConfig keyCol : keyColumns) {
					MCMessage msgForBind = new MCMessage(MAUCP0025, keyCol.getMessageByLocale(), 
							tar.getValue(keyCol.getBaseRowColumnName()));
					keyString.append(msgForBind.toString() + sp);
					sp = MCStringUtil.CRLF_CODE;
				}
				
				ret.add(new MCMessage(tar, causeColumn.getBaseRowColumnName(),
						MAUCP0070, input_num.getMessageByLocale(), r.input_num(),
						result_num.getMessageByLocale(), r.result_num(),
						r.num(), base_num.getMessageByLocale(),
							r.low_rate_lmt(), r.low_rate_lmt().multiply(r.base_num()), keyString, toDispGUIIndex(tar)));
			}
		}
		return ret;
	}

	protected MCMessageList sortMsg(MCMessageList msgLst) {
		List<MCMessage> sortedList = new ArrayList<>(msgLst);

		sortedList.sort((msg1, msg2) -> {
			MCRow row1 = msg1.getCauseRow();
			MCRow row2 = msg2.getCauseRow();

			int idx1 = row1 != null ? row1.getGUIIndex() : -1;
			int idx2 = row2 != null ? row2.getGUIIndex() : -1;

			return Integer.compare(idx1, idx2);
		});

		MCMessageList result = new MCMessageList();
		result.addAll(sortedList);
		return result;
	}

	protected MCNumber getTotalNum(MCRow tarR, MCColumnConfig act_no,
			MCColumnConfig before_num, MCColumnConfig input_num,
			MCColumnConfig result_num, MCList<?> tarL, MCColumnConfig... keyColumns) {

		MCList<?> subL = createSubList(tarR, tarL, keyColumns);
		MCNumber total = calculateTotal(tarR, subL, act_no, before_num, input_num, result_num);
		return total;
	}

	protected MCList<?> createSubList(MCRow tarR, MCList<?> tarL, MCColumnConfig... keyColumns) {

		String[] keyCols = Arrays.stream(keyColumns)
				.map(MCColumnConfig::getBaseRowColumnName)
				.toArray(String[]::new);
		Comparable<?>[] binds = Arrays.stream(keyCols).
				map(tarR::getValue)
				.toArray(Comparable[]::new);

		MCIndexKey idxkey = tarL.createIndex(keyCols);
		return tarL.subList(idxkey, binds);
	}

	protected MCNumber calculateTotal(MCRow tarR, MCList<?> subL, MCColumnConfig act_no,
			MCColumnConfig before_num, MCColumnConfig input_num, MCColumnConfig result_num) {

		MCNumber total = tarR.getNumber(result_num.getBaseRowColumnName());
		for (MCRow r : subL) {
			total = total.add(r.getNumber(input_num.getBaseRowColumnName()));
			if (!isNull(r.getString(act_no.getBaseRowColumnName()))) {
				total = total.subtract(r.getNumber(before_num.getBaseRowColumnName()));
			}
		}
		return total;
	}
	// ///////////////////////////////////////////////
	// 入力値チェック関連（ここまで）
	// ///////////////////////////////////////////////

	@Override
	public boolean confirmRegDataClear() {
		if (isChanged()) {
			return super.confirmRegDataClear();
		}
		return true;
	}

	@Override
	public boolean confirmTableClear() {
		if (isChanged()) {
			return super.confirmTableClear();
		}
		return true;
	}

	@Override
	public boolean isChanged(MCTable<?> tbl) {
		if (tbl == null) {
			return false;
		}
		MCList<?> list = tbl.getList();
		if (list == null) {
			return false;
			// メモ：list.isStatusNONE は、listの中を全部調査するので、先にカラムの調査を行う。
			// (＝全行の調査より全カラムの調査の方が低負荷と判断しての実装)
		}

		MCModeInfo mi = tbl.getModeInfo();
		if (mi != null && MCMode.INVISIBLE_STATUS == mi.getStatus()) {
			return false;
		}

		boolean result = false;
		for (MCColumnConfig config : tbl.getVisibleColumnConfigs()) {
			// すべてのカラムが DISABLE または READ_ONLE INVISIBLEの場合は、変更なしと判断する。
			MCModeInfo cmi = config.getModeInfo();
			if (cmi != null && MCMode.ENABLE_STATUS != cmi.getStatus()) {
				// 何もしない
			}
			else {
				// 登録用テーブルにあるボタンは評価しない
				if (config.getColumnType() != MCColumnType.BUTTON) {
					result = list.isStatusNone() ? false : true;
					break;
				}
			}
		}

		if (result) {
			if (tbl.getRootPanel() instanceof IfListRegPanel) {
				if (isListRegTable(tbl)) {
					MCTable<?> rtn = getRtnMsgTable(tbl);
					if (rtn != null) {
						String n = ((mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D) rtn
								.getRootPanel()).columnRtnMsg_rtn_sts_typ
										.getBaseRowColumnName();
						MCList data = tbl.getList()
								.subList(o -> !MAC_RTN_STS_TYP.isOK(o.getString(n)));
						return !data.isStatusNone();
					}
				}
				else {
					return false;
				}
			}
		}
		return result;
	}

	/**
	 * マイニング連携用の状態にあるかの設定を保持します。
	 */
	protected boolean _mining = false;

	/**
	 * マイニング連携Callerを保持します。
	 */
	protected MCCaller<?, ?> _miningCaller = null;

	/**
	 * マイニング連携用の状態にある場合にtrueが返ります。
	 */
	protected boolean isMining() {
		return _mining;
	}

	/**
	 * マイニング連携Callerを設定します。
	 */
	protected void setMiningCaller(MCCaller<?, ?> caller) {
		_miningCaller = caller;
	}

	@Override
	public MCCaller<?, ?> getMiningCaller() {
		try {
			_mining = true;
			MCButton button = getMiningSrchButton();
			if (button != null) {
				button.doAP();
			}
			return _miningCaller;
		}
		finally {
			_mining = false;
			_miningCaller = null;
		}
	}

	/**
	 * マイニング連携Callerに対応する検索ボタンを取得します。
	 */
	protected MCButton getMiningSrchButton() {
		for (MCButton button : getSrchButtons()) {
			if (!MCMode.isInvisible(button)) {
				return button;
			}
		}
		return null;
	}
	/**
	 * パーソナライズによる検索条件を設定します。<p>
	 * この画面が埋込画面の場合は何もしません。
	 * 検索条件設定機能が無効になっている場合は何もしません。
	 *
	 * @see #ignoreSrchCnd()
	 */
	public void setUserSrchCndWithoutInitSrch() {
		if (isPartsPanel() || ignoreSrchCnd()) {
			return;
		}
		try {
			SrchCndInfo si = getSrchCndInfo();
			if (si == null) {
				si = getInitSrchCndInfo();
			}
			if (si != null) {
				_setSrchCndInfo(si);
				FXUCP_SrchCndUtil.updateCnd(this, si.getSrchCndList(), FXUCP_SrchCndUtil.getSrchCndBeans(this, true));
				FXUCP_SrchCndUtil.setInitFocus(this, si);
			}
		}
		catch (Exception e) {
			MCBeansUtil.handle(this, e);
		}
	}

	protected boolean _initSrch = false;
	
	@Override
	protected void setValueByScreenOpener() {
		_initSrch = false;
		setValueByScreenOpenerBefore();
		super.setValueByScreenOpener();
		setValueByScreenOpenerAfter();
	}
	
	/**
	 * {@link #setValueByScreenOpener()}の前処理です。
	 */
	protected void setValueByScreenOpenerBefore() {

		final MCScreenOpener so = getScreenOpener();
		if (so instanceof MAUCP_AppScreenOpener) {
			MCBehindEventInfo info = new MCBehindEventInfo() {
				@Override
				protected void doBehindEvent() {
					MAUCP_AppScreenOpener aso = (MAUCP_AppScreenOpener) so;
					if (aso.isPsnlInput()) {
						_initSrch = aso.isPsnlInputInitSrch();
						try {
							setUserSrchCndWithoutInitSrch();
						}
						catch (Exception e){
							_initSrch = false;
							throw e;
						}
					}
				}
			};
			addBehindEventInfo(info);
		}
		
	}
	/**
	 * {@link #setValueByScreenOpener()}の後処理です。
	 */
	protected void setValueByScreenOpenerAfter() {
		MCBehindEventInfo info = new MCBehindEventInfo() {
			@Override
			protected void doBehindEvent() {
				if (_initSrch) {
					doUserSrchCndInitSrch();
				}
			}
		};
		addBehindEventInfo(info);
	}
	
	/**
	 * 入力値設定の初期検索に応じて検索を実行します。<p>
	 * この画面が埋込画面の場合は何もしません。
	 * 入力値設定機能が無効になっている場合は何もしません。
	 *
	 * @see #ignoreSrchCnd()
	 */
	public void doUserSrchCndInitSrch() {
		if (isPartsPanel() || ignoreSrchCnd()) {
			return;
		}

		if (!_initSrch) {
			return;
		}
		try {
			SrchCndInfo si = getSrchCndInfo();
			if (si == null) {
				si = getInitSrchCndInfo();
			}
			if (si != null) {
				_setSrchCndInfo(si);
					FXUCP_SrchCndUtil.doInitSrch(this, si);
			}
		
		}
		catch (Exception e) {
			MCBeansUtil.handle(this, e);
		}
		finally {
			_initSrch = false;
		}
	}

	@Override
	protected MCErrorHandler createErrorHandler() {
		return new mcframe.clientFXBA.FXBAP0010.FXBAP_ErrorHandler(this) {
			@Override
			protected void handleException(MCException e) {
				try{
					super.handleException(e);
				}
				finally{
					setInProgressUpdater(null);
				}
			}
		};
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected MCMessageAdapter createMCMessageAdapter(MCMessage msg,
			MCRootPanel basePanel) {
		return new MAUDP_MessageAdapter(msg, basePanel);
	}
	
	@SuppressWarnings("rawtypes")
	protected MAUDP_Updater _progUpdr;
	
	/**
	 * 実行中の通信処理クラスを設定する。
	 * @param prog 通信処理クラス
	 */
	public void setInProgressUpdater(@SuppressWarnings("rawtypes") MAUDP_Updater prog) {
		_progUpdr = prog;
	}
	
	@SuppressWarnings("deprecation")
	public class MAUDP_MessageAdapter extends MCMessageAdapter{
		public MAUDP_MessageAdapter(MCMessage msg, MCRootPanel basePanel) {
			super(msg, basePanel);
		}
		/**
		 * causeRowに対応するＧＵＩコンポーネントを返す。
		 */
		public JComponent comp() {
			if (!_isCompSearched) {
				MCMessage msg = msg();
				String causeColumn = msg.getCauseColumn();
				if (isNull(causeColumn)) {
					String[] nArray = msg.getCauseRow().getNameArray();
					if (nArray.length > 0) {
						causeColumn = nArray[0];
					}
				}
				_comp = basePanel().getComponent(msg.getCauseRow(), causeColumn);
				
				if (_comp == null && _progUpdr != null) {
					MCTable<?> fut = _progUpdr.getFileImpTable();
					if (fut != null) {
						@SuppressWarnings("unchecked")
						int i = _progUpdr.getUpParamBlockIndex(fut);
						if (i != Integer.MAX_VALUE) {
							MCList<?> ful = _progUpdr.getUpParamList(i);
							if (ful.contains(msg.getCauseRow())) {
								_comp = fut;
							}
						}
					}
				}
				
				_isCompSearched = true;
			}
			return _comp;
		}
	}

	// ///////////////////////////////////////////////
	// データキャッシュ（ここから）
	// ///////////////////////////////////////////////

	/** 原価会社パラメータ情報の格納用フィールド */
	protected CoParmR _coParmR;

	public CoParmR getCoParm() {
		if (isNull(_coParmR)) {
			_coParmR = getCoParmNoCache();
		}
		return _coParmR;
	}

	// ///////////////////////////////////////////////
	// データキャッシュ（ここまで）
	// ///////////////////////////////////////////////
	
	@Override
	public Set<String> getDispCtl2CompsKeys() {
		if (_dispctl2Comps != null) {
			return new HashSet<String>(_dispctl2Comps.keySet());
		}
		return null;
	}
	
	@Override
	public Set<MCModeBeans> getDispCtl2CompsValue(String dispCtlKey) {
		if (_dispctl2Comps != null) {
			return new HashSet<MCModeBeans>(_dispctl2Comps.get(dispCtlKey));
		}
		return null;
	}

	/**
	 * 添付帳票一覧登録に遷移する前に、一覧の内容を加工する場合にオーバーライドする。
	 * @param panel 起動元画面
	 * @param args MCAppClientリソースから取得した引数の文字列
	 * @param list 添付帳票一覧登録画面の一覧に表示するリスト
	**/
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		// 自由に加工できるメソッド。ここでは何もしない
	}

}