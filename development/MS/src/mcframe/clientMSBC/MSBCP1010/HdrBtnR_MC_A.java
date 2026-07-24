package mcframe.clientMSBC.MSBCP1010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"HdrBtn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrBtnR_MC_A extends MCConstRow {

	/**
	 * Lot ロット.<p>
	 *
	 */
	public static final String $lot_issue_flg = "lot_issue_flg";
	/**
	 * Sublots サブロット.<p>
	 *
	 */
	public static final String $sublot_issue_flg = "sublot_issue_flg";
	/**
	 * Need re-explosion 再展開未実施.<p>
	 *
	 */
	public static final String $unexec_re_ext_flg = "unexec_re_ext_flg";
	/**
	 * Display target operation only 対象工程のみ表示.<p>
	 *
	 */
	public static final String $disp_tgt_oper_only = "disp_tgt_oper_only";
	/**
	 * Display selected operation only 選択工程のみ表示.<p>
	 *
	 */
	public static final String $disp_select_oper_only = "disp_select_oper_only";


	public static final MCMeta lot_issue_flg_META = createCommonMeta($lot_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_issue_flg_META = createCommonMeta($sublot_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unexec_re_ext_flg_META = createCommonMeta($unexec_re_ext_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_tgt_oper_only_META = createCommonMeta($disp_tgt_oper_only, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_select_oper_only_META = createCommonMeta($disp_select_oper_only, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrBtnR> constMetas = new ConstMetaList<HdrBtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lot_issue_flg_META,
			sublot_issue_flg_META,
			unexec_re_ext_flg_META,
			disp_tgt_oper_only_META,
			disp_select_oper_only_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected HdrBtnR_MC_A(ConstMetaList<? extends HdrBtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrBtnR clone() {
		return (HdrBtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrBtnR createInstance() {
		return (HdrBtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrBtnR getValues(String... names) {
		return (HdrBtnR) super.getValues(names);
	}



	/**
	 * Lot ロット.<p>
	 *
	 */
	public boolean lot_issue_flg() {
		return getConstBoolean(offset + 0, $lot_issue_flg);
	}

	/**
	 * Lot ロット.<p>
	 *
	 */
	public void lot_issue_flg(boolean value) {
		setConstBoolean(offset + 0, $lot_issue_flg, value);
	}


	/**
	 * Sublots サブロット.<p>
	 *
	 */
	public boolean sublot_issue_flg() {
		return getConstBoolean(offset + 1, $sublot_issue_flg);
	}

	/**
	 * Sublots サブロット.<p>
	 *
	 */
	public void sublot_issue_flg(boolean value) {
		setConstBoolean(offset + 1, $sublot_issue_flg, value);
	}


	/**
	 * Need re-explosion 再展開未実施.<p>
	 *
	 */
	public boolean unexec_re_ext_flg() {
		return getConstBoolean(offset + 2, $unexec_re_ext_flg);
	}

	/**
	 * Need re-explosion 再展開未実施.<p>
	 *
	 */
	public void unexec_re_ext_flg(boolean value) {
		setConstBoolean(offset + 2, $unexec_re_ext_flg, value);
	}


	/**
	 * Display target operation only 対象工程のみ表示.<p>
	 *
	 */
	public boolean disp_tgt_oper_only() {
		return getConstBoolean(offset + 3, $disp_tgt_oper_only);
	}

	/**
	 * Display target operation only 対象工程のみ表示.<p>
	 *
	 */
	public void disp_tgt_oper_only(boolean value) {
		setConstBoolean(offset + 3, $disp_tgt_oper_only, value);
	}


	/**
	 * Display selected operation only 選択工程のみ表示.<p>
	 *
	 */
	public boolean disp_select_oper_only() {
		return getConstBoolean(offset + 4, $disp_select_oper_only);
	}

	/**
	 * Display selected operation only 選択工程のみ表示.<p>
	 *
	 */
	public void disp_select_oper_only(boolean value) {
		setConstBoolean(offset + 4, $disp_select_oper_only, value);
	}


	public boolean getBoolean(String name) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			return lot_issue_flg();
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			return sublot_issue_flg();
		}
		if ($unexec_re_ext_flg.equalsIgnoreCase(name)) {
			return unexec_re_ext_flg();
		}
		if ($disp_tgt_oper_only.equalsIgnoreCase(name)) {
			return disp_tgt_oper_only();
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			return disp_select_oper_only();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			return lot_issue_flg();
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			return sublot_issue_flg();
		}
		if ($unexec_re_ext_flg.equalsIgnoreCase(name)) {
			return unexec_re_ext_flg();
		}
		if ($disp_tgt_oper_only.equalsIgnoreCase(name)) {
			return disp_tgt_oper_only();
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			return disp_select_oper_only();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			lot_issue_flg(value);
			return;
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			sublot_issue_flg(value);
			return;
		}
		if ($unexec_re_ext_flg.equalsIgnoreCase(name)) {
			unexec_re_ext_flg(value);
			return;
		}
		if ($disp_tgt_oper_only.equalsIgnoreCase(name)) {
			disp_tgt_oper_only(value);
			return;
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			disp_select_oper_only(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			lot_issue_flg(value);
			return;
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			sublot_issue_flg(value);
			return;
		}
		if ($unexec_re_ext_flg.equalsIgnoreCase(name)) {
			unexec_re_ext_flg(value);
			return;
		}
		if ($disp_tgt_oper_only.equalsIgnoreCase(name)) {
			disp_tgt_oper_only(value);
			return;
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			disp_select_oper_only(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

