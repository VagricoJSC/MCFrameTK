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
 * ブロック"Btn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BtnR_MC_A extends MCConstRow {

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $inst_immed_prnt_flg = "inst_immed_prnt_flg";
	/**
	 * Change list immediate issue 変更リスト即時発行.<p>
	 *
	 */
	public static final String $chg_list_immed_prnt_flg = "chg_list_immed_prnt_flg";
	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public static final String $xfr_inst_del_enable_flg = "xfr_inst_del_enable_flg";
	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public static final String $comp_dt_from_oper_flg = "comp_dt_from_oper_flg";


	public static final MCMeta inst_immed_prnt_flg_META = createCommonMeta($inst_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chg_list_immed_prnt_flg_META = createCommonMeta($chg_list_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_inst_del_enable_flg_META = createCommonMeta($xfr_inst_del_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_dt_from_oper_flg_META = createCommonMeta($comp_dt_from_oper_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BtnR> constMetas = new ConstMetaList<BtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inst_immed_prnt_flg_META,
			chg_list_immed_prnt_flg_META,
			xfr_inst_del_enable_flg_META,
			comp_dt_from_oper_flg_META
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
	protected BtnR_MC_A(ConstMetaList<? extends BtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR clone() {
		return (BtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR createInstance() {
		return (BtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR getValues(String... names) {
		return (BtnR) super.getValues(names);
	}



	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean inst_immed_prnt_flg() {
		return getConstBoolean(offset + 0, $inst_immed_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void inst_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 0, $inst_immed_prnt_flg, value);
	}


	/**
	 * Change list immediate issue 変更リスト即時発行.<p>
	 *
	 */
	public boolean chg_list_immed_prnt_flg() {
		return getConstBoolean(offset + 1, $chg_list_immed_prnt_flg);
	}

	/**
	 * Change list immediate issue 変更リスト即時発行.<p>
	 *
	 */
	public void chg_list_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 1, $chg_list_immed_prnt_flg, value);
	}


	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public boolean xfr_inst_del_enable_flg() {
		return getConstBoolean(offset + 2, $xfr_inst_del_enable_flg);
	}

	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public void xfr_inst_del_enable_flg(boolean value) {
		setConstBoolean(offset + 2, $xfr_inst_del_enable_flg, value);
	}


	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public boolean comp_dt_from_oper_flg() {
		return getConstBoolean(offset + 3, $comp_dt_from_oper_flg);
	}

	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public void comp_dt_from_oper_flg(boolean value) {
		setConstBoolean(offset + 3, $comp_dt_from_oper_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			return chg_list_immed_prnt_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			return comp_dt_from_oper_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			return chg_list_immed_prnt_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			return comp_dt_from_oper_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			chg_list_immed_prnt_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
			return;
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			comp_dt_from_oper_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			chg_list_immed_prnt_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
			return;
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			comp_dt_from_oper_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

