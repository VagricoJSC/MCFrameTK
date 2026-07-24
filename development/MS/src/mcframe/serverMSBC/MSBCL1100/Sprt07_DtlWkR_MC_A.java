package mcframe.serverMSBC.MSBCL1100;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Sprt07_DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt07_DtlWkR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public static final String $wk_act_no = "wk_act_no";
	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public static final String $st_cost = "st_cost";
	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
	public static final String $st_fxd_cost = "st_fxd_cost";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta st_cost_META = createCommonMeta($st_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_fxd_cost_META = createCommonMeta($st_fxd_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);

	protected static final ConstMetaList<Sprt07_DtlWkR> constMetas = new ConstMetaList<Sprt07_DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			wk_schd_no_META,
			wk_act_no_META,
			st_cost_META,
			act_cost_META,
			dec_place_META,
			add_flg_META,
			st_fxd_cost_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Sprt07_DtlWkR_MC_A(ConstMetaList<? extends Sprt07_DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt07_DtlWkR clone() {
		return (Sprt07_DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt07_DtlWkR createInstance() {
		return (Sprt07_DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt07_DtlWkR getValues(String... names) {
		return (Sprt07_DtlWkR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 3, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 3, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 4, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 4, $oper_act_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 5, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 5, $wk_schd_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 6, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 6, $wk_act_no, value);
	}


	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public MCNumber st_cost() {
		return getConstNumber(offset + 7, $st_cost);
	}

	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public void st_cost(MCNumber value) {
		setConstNumber(offset + 7, $st_cost, value);
	}

	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public void st_cost(int value) {
		setConstNumber(offset + 7, $st_cost, value);
	}

	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public void st_cost(long value) {
		setConstNumber(offset + 7, $st_cost, value);
	}

	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public void st_cost(float value) {
		setConstNumber(offset + 7, $st_cost, value);
	}

	/**
	 * Number of started man-hours 着手工数.<p>
	 *
	 */
	public void st_cost(double value) {
		setConstNumber(offset + 7, $st_cost, value);
	}


	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 8, $act_cost);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 8, $act_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 8, $act_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 8, $act_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 8, $act_cost, value);
	}

	/**
	 * Result man-hour 実績工数.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 8, $act_cost, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 9, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 9, $dec_place, value);
	}


	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 10, $add_flg);
	}

	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 10, $add_flg, value);
	}


	public MCNumber st_fxd_cost() {
		return getConstNumber(offset + 11, $st_fxd_cost);
	}

	public void st_fxd_cost(MCNumber value) {
		setConstNumber(offset + 11, $st_fxd_cost, value);
	}

	public void st_fxd_cost(int value) {
		setConstNumber(offset + 11, $st_fxd_cost, value);
	}

	public void st_fxd_cost(long value) {
		setConstNumber(offset + 11, $st_fxd_cost, value);
	}

	public void st_fxd_cost(float value) {
		setConstNumber(offset + 11, $st_fxd_cost, value);
	}

	public void st_fxd_cost(double value) {
		setConstNumber(offset + 11, $st_fxd_cost, value);
	}


	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			return st_cost();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			return st_fxd_cost();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			return st_cost();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			return st_fxd_cost();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($st_cost.equalsIgnoreCase(name)) {
			st_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_cost.equalsIgnoreCase(name)) {
			st_fxd_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

