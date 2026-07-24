package mcframe.clientMAUC.MAUCP1050;

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
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.swing.JComponent;

import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.clientFXUC.FXUCP0150.FXUCP_BeansUtil;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP0010.IfMAUDP_PanelBase;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCListLogicUtil;
import mcframe.commonFX.constant.FX_Const;
import mcframe.commonMA.meta.MA_META;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListConfig;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_BeansUtil"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_BeansUtil_MC extends MAUCP_BeansUtil_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final MAUCP_BeansUtil _util = new MAUCP_BeansUtil();
	
	protected String _defAllocGrpCd = null;
	protected String _defLgGrpCd = null;
	protected String _defLocGrpCd = null;
	protected String _defSiteCd = null;
	protected String _defStkGdCd = null;
	protected String _defWgCd = null;
	protected static final String dispKeyAllocGrp = "ALLOC_GRP";
	protected static final String dispKeyLgGrp = "LG_GRP";
	protected static final String dispKeyLocGrp = "LOC_GRP";
	protected static final String dispKeySite = "SITE";
	protected static final String dispKeyStkGd = "STK_GD";
	protected static final String dispKeyWg = "WG";
	/**
	 * 非表示項目単位に初期モード退避を退避するMAP
	 */
	protected static Map<MCBeans, Map<MCRootPanel, Map<String, MCMode>>> invisibleBeansMap = new HashMap<MCBeans, Map<MCRootPanel, Map<String, MCMode>>>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_BeansUtil_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	public static void setNull(FXBAP_PanelBase p, MCPanel...ps){
		_util._setNull(p, ps);
	}

	/**パネル内のRowと関連づいているBeansの値を削除します。*/
	protected void _setNull(FXBAP_PanelBase pb, MCPanel...ps){

		if(ps == null || ps.length <= 0){return;}

		for(MCPanel p : ps){
			MCModeBeans[] modeBeans;
			modeBeans = MCBeansUtil.getAllComponents(MCModeBeans.class, p);
			if (modeBeans != null) {
				for (MCModeBeans bean : modeBeans) {
					if (bean instanceof MCCheckBox) {
						MCCheckBox b = (MCCheckBox)bean;
						pb.setValueEx(b, false);

					}
					else if(bean instanceof MCRowBeans){
						MCRowBeans b = (MCRowBeans)bean;
						pb.setValueEx(b, null);

					}
					else if (bean instanceof MCTable) {
						for(MCColumnConfig c:((MCTable)bean).getColumnConfigs()){
							if(MCDataType.BOOLEAN.equals(c.getDataType())){
								pb.setValueEx(c, false);

							}
							else{
								pb.setValueEx(c, null);
							}
						}
					}
				}
			}

		}

	}

	/**
	 * 全てのGUI部品にＮＵＬＬ文字入力不可のVCイベントを追加する。
	 *
	 * @param panel 画面
	 */
	public static void setNullValVC(MAUDP_RLBase panel){
		_util._setNullValVC(panel);
	}

	/**
	 * 全てのGUI部品にＮＵＬＬ文字入力不可のVCイベントを追加する。
	 *
	 * @param panel 画面
	 */
	protected void _setNullValVC(MAUDP_RLBase panel) {
		List<MCContainer> l = panel.getContainers();

		for (MCContainer c :l) {
			// テーブル
			if (c instanceof MCList) {
				MCList cl = (MCList)c;
				JComponent jc = panel.getComponent(cl);
				if (jc instanceof MCTable) {
					MCTable tbl = (MCTable)jc;
					panel.setExceptNULL_VAL(tbl.getColumnConfigs());
				}
			}
			// 見出し
			else {
				MCConstRow cr = (MCConstRow)c;
				String [] cols = cr.getConstColumnPathArray();
				for (String col :cols) {
					JComponent jc = panel.getComponent(cr, col);
					if (jc instanceof MCVCBeans) {
						panel.setExceptNULL_VAL((MCVCBeans)jc);
					}
				}
			}
		}
	}


	// ///////////////////////////////////////////////
	// リストロジック関連（ここから）
	// ///////////////////////////////////////////////

	protected static final String LL_IN = "LIST_IN";
	protected static final String LL_IN_BASE = "LIST_IN_BASE";
	protected static final String LL_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * リストロジックのカラム名と画面のカラム名とが違う場合の関連付け<BR>
	 * ※画面実装仕様書に設定が必要。
	 */
	public static void listInitCustom(MCRootPanel panel) {
		for(MCContainer c : panel.getContainers()) {
			Map<String, String> inMap = getExtMap(LL_IN, c);
			Map<String, String> inBaseMap = getExtMap(LL_IN_BASE, c);
			Map<String, String> outBaseMap = getExtMap(LL_OUT_BASE, c);

			if (inMap != null) {
				for (Map.Entry<String, String> e : inMap.entrySet()) {
					// リストプッター取得
					MCListPutter p = getListPutter(c, e.getKey(), panel);
					if (p == null) {
						continue;
					}
					String[] inptCols = e.getValue().split(";");
					String[] baseCols = inptCols;
					if (inBaseMap != null) {
						if (inBaseMap.containsKey(e.getKey())) {
							baseCols = inBaseMap.get(e.getKey()).split(";");
						}
					}
					if (!isSame(inptCols.length, baseCols.length)) {
						// デバッグ用のログ出力
//						MCLog.developDebug("▲ クライアントリストロジック設定");
//						MCLog.developDebug("▲ LIST_IN と LIST_IN_BASE の項目数が一致していません。");
//						MCLog.developDebug("▲ 対象項目：" + e.getKey());
//						MCLog.developDebug("▲ LIST_IN：" + Arrays.asList(inptCols));
//						MCLog.developDebug("▲ LIST_IN_BASE：" + Arrays.asList(baseCols));
						continue;
					}

					for (int i = 0; i < inptCols.length; i++) {
						if (isSame(inptCols[i], "true")) {
							p.putBind(baseCols[i], true);

							// ログイン情報設定時（期）の対応
							if (isSame(baseCols[i],"mode_this_month_flg")) {
								p.putBind("_this_term", getTerm((FXBAP_PanelBase)panel));
							}
						}
						else if (isSame(inptCols[i], "false")) {
							p.putBind(baseCols[i], false);
						}
						else if (inptCols[i].indexOf(".") >= 0) {
							// 定数
							String typ = inptCols[i].substring(0, inptCols[i].indexOf("."));
							String key = inptCols[i].substring(inptCols[i].indexOf(".")+1);
							String val = getConstValue(typ, key);
							p.putBind(baseCols[i], val);
						}
						else if (inptCols[i].matches("^\".*\"$")) {
							// リテラル
							String val = inptCols[i].replaceAll("\"", "");
							p.putBind(baseCols[i], val);
						}
						else if (c instanceof MCRow) {
							Component compo = panel.getComponent((MCRow) c, ((MCRow) c).getRealColumnPath(inptCols[i]));
							if (compo != null) {
								p.putBind(baseCols[i], compo);
							}
						}
						else {
							MCColumnConfig cc = getColumnConfig(c, inptCols[i], panel, false);
							if (cc != null) {
								p.putBind(baseCols[i], cc);
							}
						}
					}
				}
			}

			if (outBaseMap != null) {
				for (Map.Entry<String, String> e : outBaseMap.entrySet()) {
					// リストプッター取得
					MCListPutter p = getListPutter(c, e.getKey(), panel);
					if (p == null) {
						continue;
					}
					// リストロジックの一つ目の出力カラム名
					String[] cols = MCListLogicUtil.getOutColumns(p.getListLogicId());
					if (cols.length == 0) {
						continue;
					}
					String firstCol = cols[0];

					String[] lstCols = e.getValue().split(";");
					LinkedHashMap<String,String> d = new LinkedHashMap<>();
					for (int i = 0; i < p.getColumns().length; i++) {
						if (i == 0) {
							d.put(p.getColumns()[i], firstCol);
						}
						else {
							d.put(p.getColumns()[i], lstCols[i-1]);
						}
					}
					p.setColumns(d, panel);
				}
			}
		}
		// 出力連携項目がない（LIST_OUT_BASEを書かない）リストロジックの設定
		setNoOutputListLogic(panel);
	}

	/**
	 * 指定コンテナに定義されている指定グループの項目属性情報を返します。
	 * @param aGroup グループ
	 * @param c コンテナ
	 * @return　項目属性情報
	 */
	protected static Map<String, String> getExtMap(String aGroup, MCContainer c) {
		// ヘッダ
		if (c instanceof MCConstRow) {
			return ((MCConstRow) c).getExtMap(aGroup);
		}
		// 明細
		else if (c instanceof MCList) {
			MCConstRow r = (MCConstRow)((MCList<?>) c).createRow();
			return r.getExtMap(aGroup);
		}
		return null;
	}

	/**
	 * 指定コンテナの指定項目に設定されているリストプッターを返します。
	 * @param c コンテナ
	 * @param colNm 項目名
	 * @return リストプッター
	 */
	protected static MCListPutter getListPutter(MCContainer c, String colNm, MCRootPanel panel) {
		if (c instanceof MCRow) {
			JComponent comp = panel.getComponent((MCRow) c, colNm);
			if (comp instanceof MCTextComboBox) {
				MCTextComboBox cb = (MCTextComboBox) comp;
				return cb.getListConfig().getListPutter();
			}
			else if (comp instanceof MCDateComboBox) {
				MCDateComboBox cb = (MCDateComboBox) comp;
				return cb.getListConfig().getListPutter();
			}
			else if (comp instanceof MCNumberComboBox) {
				MCNumberComboBox cb = (MCNumberComboBox) comp;
				return cb.getListConfig().getListPutter();
			}
			else if (comp instanceof MCTextField) {
				MCTextField tf = (MCTextField) comp;
				return tf.getListConfig().getListPutter();
			}
		}
		else if (c instanceof MCList) {
			MCColumnConfig cc = getColumnConfig(c, colNm, panel, true);
			if (cc != null) {
				return cc.getListConfig().getListPutter();
			}
		}
		return null;
	}

	protected static MCColumnConfig getColumnConfig(MCContainer c, String colNm,
			MCRootPanel panel, boolean baseRowColNmFlg) {
		if (c instanceof MCList) {
			// コンテナからテーブル名取得
			MCTable<?> tb = null;
			for (MCTable<?> t : MCBeansUtil.getAllComponents(MCTable.class, panel)) {
				if (t.getList() == c) {
					tb = t;
					break;
				}
			}
			// 対象のカラムコンフィグ取得
			if (tb != null) {
				// エイリアスがあれば、そちらを優先して使用する
				// エイリアスで検索
				for (MCColumnConfig cc : tb.getColumnConfigs()) {
					String aliasColNm = null;
					String[] a = cc.getAliasNames();
					if (a.length > 0) {
						aliasColNm = a[0].substring(a[0].indexOf(".")+1);
					}
					if (isSame(aliasColNm, colNm)) {
						return cc;
					}
				}
				// カラム名で検索
				for (MCColumnConfig cc : tb.getColumnConfigs()) {
					String baseColNm = null;
					if (baseRowColNmFlg) {
						baseColNm = cc.getBaseRowColumnName();
					}
					else {
						baseColNm = cc.getRowColumnName();
					}
					if (isSame(baseColNm, colNm)) {
						return cc;
					}
				}
			}
		}
		return null;
	}

	/**
	 * リストロジックのカラム名と画面のカラム名とが違う場合の関連付け<BR>
	 * 出力連携項目がない項目の関連付け
	 */
	protected static void setNoOutputListLogic(MCRootPanel panel) {
		List<MCListPutter> pL = new ArrayList<MCListPutter>();

		for (MCTextComboBox cb : MCBeansUtil.getComponents(MCTextComboBox.class, panel)){
			MCListPutter p = cb.getListConfig().getListPutter();
			if (p != null && p.getColumns().length == 1) {
				pL.add(p);
			}
		}
		for (MCDateComboBox cb : MCBeansUtil.getComponents(MCDateComboBox.class, panel)){
			MCListPutter p = cb.getListConfig().getListPutter();
			if (p != null && p.getColumns().length == 1) {
				pL.add(p);
			}
		}
		for (MCTextField tf : MCBeansUtil.getComponents(MCTextField.class, panel)){
			MCListPutter p = tf.getListConfig().getListPutter();
			if (p != null && p.getColumns().length == 1) {
				pL.add(p);
			}
		}
		for (MCTable<?> tb : MCBeansUtil.getComponents(MCTable.class, panel)) {
			for (MCColumnConfig cc : tb.getColumnConfigs()) {
				MCListPutter p = cc.getListConfig().getListPutter();
				if (p != null && p.getColumns().length == 1) {
					pL.add(p);
				}
			}
		}

		for (MCListPutter p : pL) {
			String[] cols = MCListLogicUtil.getOutColumns(p.getListLogicId());
			if (cols.length == 0) {
				continue;
			}
			if (!isSame(p.getColumns()[0], cols[0])) {
				LinkedHashMap<String,String> d = new LinkedHashMap<>();
				d.put(p.getColumns()[0], cols[0]);
				p.setColumns(d, panel);
			}
		}

	}

	/**
	 * 定数（区分）のＩＤに対応する定数オブジェクトの配列を返す。
	 * @param typeId 定数（区分）のＩＤ
	 * @return 定数オブジェクトの配列
	 */
	protected static String getConstValue(String typeId, String typeNm) {
		String mdlId = typeId.substring(0, 2);
		Class cls = MCFactory.getClass(FX_Const.class, "mcframe.common" + mdlId + ".constant." + typeId);
		MCAppConst cst = MCFactory.getFieldValue(cls, MCAppConst.class, typeNm);
		return (String) cst.value();
	}

	// ///////////////////////////////////////////////
	// リストロジック関連（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここから）
	// ///////////////////////////////////////////////

	// リストロジックのカラム名クラスに定義されている入力補助画面のモジュールIDと画面IDを取得するフィールド名
	protected static final String LL_PARAM_ISPNL_MOD_ID = "$p_ispnl_mod_id";
	protected static final String LL_PARAM_ISPNL_SCR_ID = "$p_ispnl_scr_id";
	/**
	 * 入力補助画面の紐づけ（linkBeansToISPanel）に渡す引数の配列を、
	 * 全項目分リストで返します。
	 */
	public static List<Object[]> getLinkBeansToISPanelArgs(FXBAP_PanelBase panel) {
		List<Object[]> oList = new ArrayList<Object[]>();
		Object[] tmp = null;

		for (MCTextField tf : MCBeansUtil.getComponents(MCTextField.class, panel)) {
			tmp = getLinkBeansToISPanelArgs(tf.getListConfig().getListPutter());
			if (tmp != null) {
				oList.add(tmp);
			}
		}
		for (MCTable<?> tb : MCBeansUtil.getComponents(MCTable.class, panel)) {
			if (tb instanceof MCFixedColumnTable2) {
				continue;
			}
			for (MCColumnConfig cconf : tb.getColumnConfigs()) {
				tmp = getLinkBeansToISPanelArgs(cconf.getListConfig().getListPutter());
				if (tmp != null && cconf.getColumnType() == MCColumnType.TEXT) {
					oList.add(tmp);
				}
			}
		}
		return oList;
	}
	/**
	 * linkBeansToISPanelに渡す引数の配列を返します。<BR>
	 * {MCLinkBeans, (String)モジュールＩＤ, (String)画面ＩＤ, false}
	 *
	 * @param putter beans にセットされているプッター
	 */
	public static Object[] getLinkBeansToISPanelArgs(MCListPutter putter) {
		if (putter == null) {
			return null;
		}
		Class<?> cls = MCListLogicUtil.getColsClass(putter.getListLogicId());
		String modId = MCFactory.getFieldValue(cls, String.class, LL_PARAM_ISPNL_MOD_ID);
		if (modId == null) {
			return null;
		}
		String scrId = MCFactory.getFieldValue(cls, String.class, LL_PARAM_ISPNL_SCR_ID);
		return new Object[]{putter.getLinkBeans(), modId, scrId, false};
	}

	// ///////////////////////////////////////////////
	// 入力補助用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 埋込画面用ユーティリティ（ここから）
	// ///////////////////////////////////////////////
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
	public static void setComponentInvisibleAllStatus(MCBeans beans, MCRootPanel[] rootPanels, FXBAP_PanelBase panel) {
		if (beans instanceof MCPanel) {
			MCPanel p = (MCPanel) beans;

			Container container = p.getParent();
			if (container instanceof MCTabbedPane) {
				// タブペインからパネルを剥がす
				panel.add(p);
			}

			p.setPreferredSize(new Dimension(0, 0));
			p.setMaximumSize(new Dimension(0, 0));
			p.setSize(new Dimension(0, 0));
			p.setVisible(false);

			for (MCModeBeans modeBeans : MCBeansUtil.getComponents(MCModeBeans.class, p)) {
				setModeBeansInvisible(modeBeans);
			}
		}
		else if (beans instanceof MCTabbedPane || beans instanceof MCTable
				|| beans instanceof MCTree) {
			Component comp = (Component)beans;
			Container cont = comp.getParent();
			cont.setPreferredSize(new Dimension(0, 0));
			cont.setMaximumSize(new Dimension(0, 0));
			cont.setSize(new Dimension(0, 0));
			cont.setVisible(false);

			for (MCModeBeans modeBeans : MCBeansUtil.getComponents(MCModeBeans.class,
					cont)) {
				setModeBeansInvisible(modeBeans);
			}
		}
		else if (beans instanceof MCModeBeans) {
			setModeBeansInvisible((MCModeBeans)beans);
		}
	}

	protected static void setModeBeansInvisible(MCModeBeans beans) {
		MCModeBeans modeBeans = (MCModeBeans) beans;
		MCRootPanel[] rpl = MCBeansUtil.getRootPanelLayer(modeBeans.getRootPanel());
		
		// 画面単位にステータスに対する初期のモードを退避するMAP
		Map<MCRootPanel , Map<String , MCMode>> invisiblePanelMap =  new HashMap<MCRootPanel, Map<String , MCMode>>();
		for (MCRootPanel rootPanel : rpl) {
			Map<String , MCMode> mcModeMap = new HashMap<String , MCMode>();
			for (String s : rootPanel.getStatusSet()) {
				// ステータス単位に初期のモードを退避するMAP
				mcModeMap.put(s, modeBeans.getMode(rootPanel, s));
				modeBeans.putMode(rootPanel, s, MCMode.INVISIBLE);
				if (beans instanceof JComponent) {
					JComponent c = (JComponent)modeBeans;
					c.setPreferredSize(new Dimension(0, 0));
					c.setMaximumSize(new Dimension(0, 0));
					c.setSize(new Dimension(0, 0));
				}
			}
			if (mcModeMap.isEmpty()) continue;
			invisiblePanelMap.put(rootPanel, mcModeMap);
		}
		if (invisiblePanelMap.isEmpty()) return;
		invisibleBeansMap.put(beans, invisiblePanelMap);
	}
	// ///////////////////////////////////////////////
	// 埋込画面用ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * MCBeansの配列からMCRowBeansの配列を取得する
	 *
	 * @param beans MCBeansの配列
	 * @return MCRowBeansの配列
	 */
	public static MCRowBeans[] getMCRowBeans(MCBeans... beans) {
		if (beans == null) {
			return null;
		}
		List<MCBeans> l = new ArrayList<MCBeans>();
		for (int i = 0; i < beans.length; i++) {
			if (beans[i] instanceof MCRowBeans) {
				l.add(beans[i]);
			}
		}
		return l.toArray(new MCRowBeans[0]);
	}

	/**
	 * MCBeansの配列からMCColumnConfigの配列を取得する
	 *
	 * @param beans MCBeansの配列
	 * @return MCColumnConfigの配列
	 */
	public static MCColumnConfig[] getMCColumnConfig(MCBeans... beans) {
		if (beans == null) {
			return null;
		}
		List<MCBeans> l = new ArrayList<MCBeans>();
		for (int i = 0; i < beans.length; i++) {
			if (beans[i] instanceof MCColumnConfig) {
				l.add(beans[i]);
			}
		}
		return l.toArray(new MCColumnConfig[0]);
	}

	/**
	 * セルが入力可能かどうかを取得する。入力可能な場合はtrue
	 *
	 * @param c カラムコンフィグ
	 * @param index インデックス
	 * @return セルが入力可能かどうか
	 */
	public static boolean isCellEditable(MCColumnConfig c, int index) {
		MCMode m = c.getBaseTable().isCellEditable(index, c);
		if (MCMode.ENABLE == m || MCMode.REQUIRED == m) {
			return true;
		}
		return false;
	}

	// ///////////////////////////////////////////////
	// ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 値の取得（ここから）
	// ///////////////////////////////////////////////
	/**
	 * MCBeansから値を取得する
	 *
	 * @param beans MCBeans
	 * @param i テーブルの行（テーブルでない場合は無効）
	 * @return MCBeansの持つ値
	 */
	public static Comparable getValueOf(MCBeans beans, int i) {

		if (beans == null) {
			return null;
		}

		if (beans instanceof MCColumnConfig) {
			return ((MCColumnConfig)beans).getValue(i);
		}

		return FXUCP_BeansUtil.getValueOf(beans);

	}

	/**
	 * MCBeansから値を取得する<br>
	 * MCRowBeans/MCColumnConfigに対応している<br>
	 * それ以外のBeansの場合はnullを返す<br>
	 * MCColumnConfigである場合は選択行の値を返す（選択行が取得できない場合はnullを返す）
	 *
	 * @param beans 値を取得する
	 * @return MCBeansの値
	 */
	public static Comparable<?> getValueOf(MCBeans beans) {
		return _util._getValueOf(beans);
	}

	/**
	 * MCBeansから値を取得する<br>
	 * MCRowBeans/MCColumnConfigに対応している<br>
	 * それ以外のBeansの場合はnullを返す<br>
	 * MCColumnConfigである場合は選択行の値を返す（選択行が取得できない場合はnullを返す）
	 *
	 * @param beans 値を取得する
	 * @return MCBeansの値
	 */
	protected Comparable<?> _getValueOf(MCBeans beans) {

		if (beans instanceof MCRowBeans){
			return ((MCRowBeans) beans).getRowValue();
		}
		if (beans instanceof MCColumnConfig) {
			MCColumnConfig config = (MCColumnConfig) beans;
			MCTable<?> tbl = config.getTable();
			if (tbl != null) {
				MCRow row = tbl.getSelectedMCRow();
				if (row != null) {
					return row.getValue(config.getRowColumnName());
				}
			}
		}
		return null;
	}
	// ///////////////////////////////////////////////
	// 値の取得（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 初期表示するためのメソッド（ここから）
	// [初期表示の規則]
	// 結果が1件の場合、それを表示する。
	// 複数件の場合は基本的に表示しない。ただし次の場合は表示させる。
	// １、リストに初期表示項目($DEF_FLG)カラムの値がtrueのものがある場合
	// ２、setDefaultValueの引数colsにbooleanのカラム名を設定した場合
	// ///////////////////////////////////////////////
	/**
	 * 初期表示用Rowを取得し、setValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を MCLinkBeansに設定します。ただし、結果が１件の場合はそれを表示します。
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(MCRow row)
	 *
	 * 値のsetは
	 * @param c MCLinkBeans
	 * @param cols booleanのカラム
	 *
	 */
	public static void setDefaultValue(MCLinkBeans c, String... cols) {
		_util._setDefaultValue(c, cols);

	}

	/**
	 * 初期表示用Rowを取得し、<b>引数idxの行の</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 * 上記の場合でも、ステータス s と一致しない場合は表示しません。
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(int index, MCRow row)
	 *
	 * @param c 明細コンボ
	 * @param idx パネル行index
	 * @param s ステータス
	 * @param cols booleanのカラム
	 */
	public static void setDefaultValue(MCColumnConfig c, int idx, Status[] s,
			String... cols) {
		_util._setDefaultValue(c, idx, s, cols);
	}

	/**
	 * 初期表示用Rowを取得し、<b>引数idxの行の</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(int index, MCRow row)
	 *
	 * @param c 明細コンボ
	 * @param idx パネル行index
	 * @param cols booleanのカラム
	 */
	public static void setDefaultValue(MCColumnConfig c, int idx, String... cols) {
		_util._setDefaultValue(c, idx, cols);
	}

	/**
	 * 初期表示用Rowを取得し、<b>すべての行の</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 * 上記の場合でも、ステータス s と一致しない場合は表示しません。
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(int index, MCRow row)
	 *
	 * @param c 明細コンボ
	 * @param s ステータス
	 * @param cols booleanのカラム
	 */
	public static void setDefaultValue(MCColumnConfig c, Status[] s, String... cols) {
		_util._setDefaultValue(c, s, cols);
	}

	/**
	 * 初期表示用Rowを取得し、<b>選択されている</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(int index, MCRow row)
	 *
	 * @param c 明細コンボ
	 * @param cols booleanのカラム
	 */
	public static void setDefaultValue(MCColumnConfig c, String... cols) {
		_util._setDefaultValue(c, cols);
	}

	/**
	 * 初期表示用Rowを取得し、MCLinkBeansにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を MCLinkBeansに設定します。ただし、結果が１件の場合はそれを表示します。
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(MCRow row)
	 *
	 * @param c MCLinkBeans
	 * @param cols booleanのカラム
	 *
	 */
	@SuppressWarnings("unchecked")//MCListのジェネリクス
	protected void _setDefaultValue(MCLinkBeans c, String... cols) {
		MCRow r = getDispRow(c.doListEvent(MCListConfig.LIST), cols);
		setValueEx(c, r);

	}
	/**
	 * 値を設定します。 値がセットできない場合は例外を発生させます。
	 *
	 * @see #handleSetValueMessageList(MCRowBeans, Comparable, MCMessageList)
	 */
	@SuppressWarnings("unchecked")
	// getValueの X へのキャスト
	protected void setValueEx(MCLinkBeans bean, MCRow r) {
		MCRow org =((MCRowBeans) bean).getRow();
		try {
			// 例外処理をしているので setValueEx を使わない
			MCMessageList msg = bean.setValues(r);
			handleSetValueMessageList(bean, r, msg);
		}
		catch (MCException ex) {
			try {
				// 元に入っていた値なので、基本的にセットできるはず。
				// なので setValueEx 使わない
				bean.setValues(org);
			}
			catch (MCException e) {
				// 念のため
				MCLog.write(e);
			}
			throw ex;
		}
	}
	protected void handleSetValueMessageList(MCLinkBeans bean, MCRow r, MCMessageList msg){
		if(0 < msg.size()){
			MCAppException e =  new MCAppException(MAUCP0022);
			e.setCauseMessageList(msg);
			throw e;
		}
	}
	/**
	 * 初期表示用Rowを取得し、<b>引数idxの行の</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 * 上記の場合でも、ステータス s と一致しない場合は表示しません。
	 *
	 * @see mcframe.clientCore.beans.list.MCLinkBeans#setValues(int index, MCRow row)
	 *
	 * @param c 明細コンボ
	 * @param idx パネル行index
	 * @param s ステータス
	 * @param cols booleanのカラム
	 */
	@SuppressWarnings("unchecked")//MCListのジェネリクス
	protected void _setDefaultValue(MCColumnConfig c, int idx, Status[] s, String... cols) {

		if (null == s
				|| containsStatus(c.getBaseTable().getSelectedMCRow().getStatus(), s)) {

			MCRow r = getDispRow(c.doListEvent(MCListConfig.LIST, idx), cols);

			if (0 <= idx) {
				setValuesEx(c, idx, r);
			}
		}
	}
	/**
	 * 値を設定します。 引数で指定された行に値を設定します。
	 * 値がセットできない場合は例外を発生させます。
	 *
	 *
	 * @param bean 値を設定するBeans
	 * @param idx 対象の行
	 * @param val 設定する値
	 *
	 * @see #handleSetValueMessageList(MCRowBeans, int, Comparable, MCMessageList)
	 */
	public void setValuesEx(MCColumnConfig bean, int idx, MCRow val) {
		Comparable<?> org = bean.getValue(idx);
		try {
			// 例外処理をしているので setValuesEx を使わない
			MCMessageList msg = bean.setValues(idx, val);
			handleSetValueMessageList(bean, idx, val, msg);
		}
		catch (MCException ex) {
			try {
				// 元に入っていた値なので、基本的にセットできるはず。
				// なので setValueEx 使わない
				bean.setValue(idx, org);
			}
			catch (MCException e) {
				// 念のため
				MCLog.write(e);
			}
			throw ex;
		}
	}
	protected void handleSetValueMessageList(MCColumnConfig bean, int idx,
			MCRow r, MCMessageList msg) {
		if (msg.size() > 0) {
			MCAppException ae = new MCAppException(MAUCP0022);
			ae.setCauseMessageList(msg);
			throw ae;
		}
	}

	/**
	 * 初期表示用Rowを取得し、<b>引数idxの行の</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 *
	 * @param c 明細コンボ
	 * @param idx パネル行index
	 * @param cols booleanのカラム
	 */
	protected void _setDefaultValue(MCColumnConfig c, int idx, String... cols) {
		Status[] s = null;
		_setDefaultValue(c, idx, s, cols);

	}

	/**
	 * 初期表示用Rowを取得し、<b>すべての行の</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 * 上記の場合でも、ステータス s と一致しない場合は表示しません。
	 *
	 * @param c 明細コンボ
	 * @param s ステータス
	 * @param cols booleanのカラム
	 */
	protected void _setDefaultValue(MCColumnConfig c, Status[] s, String... cols) {
		for (int idx = 0; idx < c.getBaseTable().getRowCount(); idx++)
			_setDefaultValue(c, idx, s, cols);
	}

	/**
	 * 初期表示用Rowを取得し、<b>選択されている</b>明細コンボにsetValues()で設定します。
	 * <p>
	 * 引数colsには、booleanのカラム名を指定できます。<br>
	 * カラム名を指定した場合、それらのカラムがすべてtrueの行を表示します。<br>
	 * ただし、結果が１件の場合はそれを表示します。<br>
	 *
	 * @param c 明細コンボ
	 * @param cols booleanのカラム
	 */
	protected void _setDefaultValue(MCColumnConfig c, String... cols) {
		int idx = c.getBaseTable().getMCSelectedRow();
		_setDefaultValue(c, idx, cols);
	}

	/**
	 * ステータス配列cond 内に ステータス rsと一致するものがあればtrueを返します。
	 * @param rs ステータス
	 * @param ステータスの配列
	 */
	protected boolean containsStatus(Status rs, Status[] cond) {

		for (Status cs : cond) {
			if (rs == cs) {
				return true;
			}
		}
		return false;

	}

	/**
	 * 初期表示するRowを返します。
	 * <p>
	 * 次の仕様に従いRowを返します。
	 * <li>件数が１件の場合はそれを返す。</li>
	 * <li>カラム名 colsが指定されていない場合、初期表示項目($DEF_FLG)カラムがtrueのRowを返す。</li>
	 * <li>colsが指定されている場合、それらのカラムが全てtrueのRowを返す。</li>
	 * <li>複数のRowが初期表示対象のRowである場合、始めに見つけたRowを返す。</li>
	 * </P>
	 * <P>
	 * 次の場合はnullを返します。
	 * <li>初期表示対象のRowが見つからない場合。</li>
	 * <li>条件のカラムが見つからない場合。</li>
	 * <li>条件のカラムが1つでもbooleanでない場合。</li>
	 * </P>
	 */
	protected MCRow getDispRow(MCList<MCRow> lst, String... cols) {

		MCRow down = null;

		if (lst == null || lst.size() <= 0) return null;
		if (lst.size() == 1) return lst.get(0);

		/* colsが指定されていない場合の処理 */
		if (cols.length <= 0) {

			if (isBooleanColumns(lst, $DEF_FLG)) {
				down = lst.getFirst($DEF_FLG, true);
			}
		}
		/* colsが指定されている場合の処理 */
		else {
			boolean b = true;
			for (String col : cols) {
				if (!isBooleanColumns(lst, col)) {
					b = false;
					break;
				}
			}
			if (b) {
				down = getColsTrueRow(lst, cols);
			}
		}

		return down;
	}

	/* 条件のカラムのチェック */
	protected boolean isBooleanColumns(MCList<MCRow> lst, String col) {
		if (0 < lst.size()) {
			return MCDataType.BOOLEAN.equals(lst.get(0).getDataType(col));

		}
		return false;
	}

	/** colsのカラムデータが全てtrueのRowを返します。 */
	protected MCRow getColsTrueRow(MCList<MCRow> lst, String... cols) {

		MCRow down = null;
		boolean f = false;
		for (MCRow r : lst) {
			for (String c : cols) {
				if (r.getBoolean(c)) {
					f = true;
				}
				else {
					f = false;
					break;
				}
			}
			if (f) {
				down = r;
				break;
			}
		}
		return down;
	}

	// ///////////////////////////////////////////////
	// 初期表示するためのメソッド（ここまで）
	// ///////////////////////////////////////////////
	
	public static MCBeans[] getInvisibleBySysParam(IfMAUDP_PanelBase panel) {
		return _util._getInvisibleBySysParam(panel);
	}
	
	protected MCBeans[] _getInvisibleBySysParam(IfMAUDP_PanelBase panel) {
		List<MCBeans> l = new ArrayList<>();
		for (MCContainer c : ((MCRootPanel)panel).getContainers()) {
			if (c instanceof MCConstRow) {
				MCConstRow r = (MCConstRow)((MCConstRow)c).createInstance();
				Map<String, String> m = r.getExtMap("DISP_CTL");
				if (m == null || m.isEmpty()) {
					continue;
				}
				for (Map.Entry<String, String> e : m.entrySet()) {
					if (isInvisibleBySysParam(e.getValue(), panel)) {
						l.add((MCBeans)((MCRootPanel)panel).getComponent((MCRow)c, e.getKey()));
					}
				}
			}
			else if (c instanceof MCList) {
				MCConstRow r = (MCConstRow)((MCList)c).createRow();
				Map<String, String> m = r.getExtMap("DISP_CTL");
				if (m == null || m.isEmpty()) {
					continue;
				}
				
				MCTable table = null;
				for (MCTable t : MCBeansUtil.getComponents(MCTable.class, (MCRootPanel)panel)) {
					if (t.getList() == c) {
						table = t;
						break;
					}
				}
				if (table == null) {
					continue;
				}
				
				for (Map.Entry<String, String> e : m.entrySet()) {
					if (isInvisibleBySysParam(e.getValue(), panel)) {
						for (MCColumnConfig cc : table.getColumnConfigs()) {
							if (isSame(cc.getBaseRowColumnName(), e.getKey()) || isSame(cc.getRowColumnName(), e.getKey())) {
								l.add(cc);
							}
						}
					}
				}
			}
		}
		return l.toArray(new MCBeans[0]);
	}
	
	/**
	 * 表示制御キーに対応するシステムパラメータがオフのときtrue（非表示）を返します。
	 * 
	 * @param dispKey 表示制御キー
	 */
	public static boolean isInvisibleBySysParam(String dispKey, IfMAUDP_PanelBase panel) {
		return _util._isInvisibleBySysParam(dispKey, panel);
	}
	
	protected boolean _isInvisibleBySysParam(String dispKey, IfMAUDP_PanelBase panel) {
		if (isSame(dispKey, "CONT_FCTR")) {
			return isSame(panel.getSysParm("CONT_FCTR_ENABLE_FLG"),"0");
		}
		if (isSame(dispKey, "VER_NO")) {
			return isSame(panel.getSysParm("VER_ENABLE_FLG"),"0");
		}
		if (isSame(dispKey, "MFG_APRV")) {
			return isSame(panel.getSysParm("MFG_APRV_ENABLE_FLG"),"0");
		}
		if (isSame(dispKey, "YIELD")) {
			return isSame(panel.getSysParm("YIELD_ENABLE_FLG"),"0");
		}
		if (isSame(dispKey, "IN_PRMT_INSP")) {
			return isSame(panel.getSysParm("IN_PRMT_INSP_ENABLE_FLG"), "0");
		}
		if (isSame(dispKey, "BASE_CUR")) {
			return isSame(panel.getSysParm("BASE_CUR_FLG"), "1");
		}
		if (isSame(dispKey, "BASE_UNIT")) {
			return isSame(panel.getSysParm("BASE_UNIT_FLG"), "1");
		}
		if (isSame(dispKey, "CRED")) {
			if (!isCredEnabled(panel)) {
				return true;
			}
		}
		if (isSame(dispKey, "MAKER")) {
			if (!isMakerEnabled(panel)) {
				return true;
			}
		}
		if (isSame(dispKey, "PTAX")) {
			if (!isPtaxEnabled(panel)) {
				return true;
			}
		}
		if (isSame(dispKey, "STR_LN")) {
			if (!isStrLnEnabled(panel)) {
				return true;
			}
		}
		if (isSame(dispKey, "TM")) {
			if (!isTmEnabled(panel)) {
				return true;
			}
		}
		if (isSame(dispKey, "WRK")) {
			if (!isWrkEnabled(panel)) {
				return true;
			}
		}
		if (isSame(dispKey, "WTAX")) {
			if (!isWtaxEnabled(panel)) {
				return true;
			}
		}

		int itmSubTyp = MAUCP_AppSys.getItmSubTyp(panel);
		if (isSame(dispKey, "ITM_SUB1")) {
			return itmSubTyp < 1;
		}
		if (isSame(dispKey, "ITM_SUB2")) {
			return itmSubTyp < 2;
		}
		if (isSame(dispKey, "ITM_SUB3")) {
			return itmSubTyp < 3;
		}
		
		int snoTyp = MAUCP_AppSys.getSnoTyp(panel);
		if (isSame(dispKey, "SNO1")) {
			return snoTyp < 1;
		}
		if (isSame(dispKey, "SNO2")) {
			return snoTyp < 2;
		}
		if (isSame(dispKey, "SNO3")) {
			return snoTyp < 3;
		}
		if (isSame(dispKey, "SNO4")) {
			return snoTyp < 4;
		}
		int itmDestTyp = MAUCP_AppSys.getDestTyp(panel);
		if (isSame(dispKey, "DEST1")) {
			return itmDestTyp < 1;
		}
		if (isSame(dispKey, "DEST2")) {
			return itmDestTyp < 2;
		}
		if (isSame(dispKey, "DEST3")) {
			return itmDestTyp < 3;
		}

		int addrTyp = MAUCP_AppSys.getAddrTyp(panel);
		if (isSame(dispKey, "ADDR1")) {
			return addrTyp < 1;
		}
		if (isSame(dispKey, "ADDR2")) {
			return addrTyp < 2;
		}
		if (isSame(dispKey, "ADDR3")) {
			return addrTyp < 3;
		}
		if (isSame(dispKey, "ADDR4")) {
			return addrTyp < 4;
		}
		
		if (isSame(dispKey, dispKeyAllocGrp)) {
			_defAllocGrpCd = panel.getSysParm("DEF_ALLOC_GRP_CD");
			return (!isNull(_defAllocGrpCd));
		}
		if (isSame(dispKey, dispKeyLgGrp)) {
			_defLgGrpCd = panel.getSysParm("DEF_LG_GRP_CD");
			return (!isNull(_defLgGrpCd));
		}
		if (isSame(dispKey, dispKeyLocGrp)) {
			_defLocGrpCd = panel.getSysParm("DEF_LOC_GRP_CD");
			return (!isNull(_defLocGrpCd));
		}
		if (isSame(dispKey, dispKeySite)) {
			_defSiteCd = panel.getSysParm("DEF_SITE_CD");
			return (!isNull(_defSiteCd));
		}
		if (isSame(dispKey, dispKeyStkGd)) {
			_defStkGdCd = panel.getSysParm("DEF_STK_GD_CD");
			return (!isNull(_defStkGdCd));
		}
		if (isSame(dispKey, dispKeyWg)) {
			_defWgCd = panel.getSysParm("DEF_WG_CD");
			return (!isNull(_defWgCd));
		}
		return false;
	}
	
	/**
	 * 表示対象外の項目について、デフォルトのモードを設定します。<br>
	 * 
	 * @param panel
	 */
	public static void setModeBeansDefaultByDispCtl(IfMAUDP_PanelBase panel) {
		_util._setModeBeansDefaultByDispCtl(panel);
	}
	protected void _setModeBeansDefaultByDispCtl(IfMAUDP_PanelBase panel) {
		MCBeans[] re = getDefaultModeBeans(panel);
		setModeBeansDefault(re);
		invisibleBeansMap.clear();
	}
	
	/**
	 * 「DISP_CTL」に「_DISP」が設定されている項目を取得します。
	 * 
	 * @param panel
	 * @return 非表示対象外の項目リスト
	 */
	protected MCBeans[] getDefaultModeBeans(IfMAUDP_PanelBase panel) {
		List<MCBeans> l = new ArrayList<>();
		
		for (MCContainer c : ((MCRootPanel) panel).getContainers()) {
			if (c instanceof MCConstRow) {
				MCConstRow r = (MCConstRow)((MCConstRow)c).createInstance();
				Map<String, String> m = r.getExtMap("DISP_CTL");
				if (m == null || m.isEmpty()) {
					continue;
				}
				for (Map.Entry<String, String> e : m.entrySet()) {
					if (isSame(e.getValue(), "_DISP")) {
						l.add((MCBeans)((MCRootPanel)panel).getComponent((MCRow)c, e.getKey()));
					}
				}
			}
			else if (c instanceof MCList) {
				MCConstRow r = (MCConstRow) ((MCList) c).createRow();
				Map<String, String> m = r.getExtMap("DISP_CTL");
				if (m == null || m.isEmpty()) {
					continue;
				}

				MCTable table = null;
				for (MCTable t : MCBeansUtil.getComponents(MCTable.class, (MCRootPanel)panel)) {
					if (t.getList() == c) {
						table = t;
						break;
					}
				}
				if (table == null) {
					continue;
				}
				for (Map.Entry<String, String> e : m.entrySet()) {
					if (isSame(e.getValue(), "_DISP")) {
						for (MCColumnConfig cc : table.getColumnConfigs()) {
							if (isSame(cc.getBaseRowColumnName(), e.getKey()) || isSame(cc.getRowColumnName(), e.getKey())) {
								l.add(cc);
							}
						}
					}
				}
			}
		}
		return l.toArray(new MCBeans[0]);
	}
	
	/**
	 * 非表示対象外の項目について、モードを非表示からデフォルトに戻します。
	 * @param beansL 非表示対象外の項目リスト
	 */
	protected static void setModeBeansDefault(MCBeans... beansL) {
		for (MCBeans beans : beansL) {
			MCModeBeans modeBeans = (MCModeBeans) beans;
			MCRootPanel[] rpl = MCBeansUtil.getRootPanelLayer(modeBeans.getRootPanel());
			if (invisibleBeansMap.containsKey(beans)) {
				Map<MCRootPanel, Map<String, MCMode>> invisiblePanelMap = invisibleBeansMap.get(beans);
				for (MCRootPanel rootPanel : rpl) {
					if (invisiblePanelMap.containsKey(rootPanel)) {
						Map<String, MCMode> mcModeMap = invisiblePanelMap.get(rootPanel);
						for (String s : rootPanel.getStatusSet()) {
							if (mcModeMap.get(s) == null) continue;
							modeBeans.putMode(rootPanel, s, mcModeMap.get(s));
						}
					}
				}
			}
		}
	}

}