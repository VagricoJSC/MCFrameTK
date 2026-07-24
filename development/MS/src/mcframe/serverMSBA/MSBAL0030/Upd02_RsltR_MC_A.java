package mcframe.serverMSBA.MSBAL0030;

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
 * ブロック"Upd02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd02_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Period start date 期間開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Period end date 期間終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public static final String $dly_div_flg = "dly_div_flg";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_dpt_cd = "dmnd_dpt_cd";
	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public static final String $dmnd_dpt_nm = "dmnd_dpt_nm";
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dly_div_flg_META = createCommonMeta($dly_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta dmnd_dpt_cd_META = createCommonMeta($dmnd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dmnd_dpt_nm_META = createCommonMeta($dmnd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);

	protected static final ConstMetaList<Upd02_RsltR> constMetas = new ConstMetaList<Upd02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			st_dt_META,
			end_dt_META,
			dly_div_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			dmnd_dpt_cd_META,
			dmnd_dpt_nm_META,
			dmnd_date_div_mons_META
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
	protected Upd02_RsltR_MC_A(ConstMetaList<? extends Upd02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_RsltR clone() {
		return (Upd02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_RsltR createInstance() {
		return (Upd02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd02_RsltR getValues(String... names) {
		return (Upd02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Period start date 期間開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 3, $st_dt);
	}

	/**
	 * Period start date 期間開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 3, $st_dt, value);
	}


	/**
	 * Period end date 期間終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 4, $end_dt);
	}

	/**
	 * Period end date 期間終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 4, $end_dt, value);
	}


	/**
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public boolean dly_div_flg() {
		return getConstBoolean(offset + 5, $dly_div_flg);
	}

	/**
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public void dly_div_flg(boolean value) {
		setConstBoolean(offset + 5, $dly_div_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
	}


	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public String dmnd_dpt_cd() {
		return getConstString(offset + 11, $dmnd_dpt_cd);
	}

	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public void dmnd_dpt_cd(String value) {
		setConstString(offset + 11, $dmnd_dpt_cd, value);
	}


	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public String dmnd_dpt_nm() {
		return getConstString(offset + 12, $dmnd_dpt_nm);
	}

	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public void dmnd_dpt_nm(String value) {
		setConstString(offset + 12, $dmnd_dpt_nm, value);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 13, $dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 13, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 13, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 13, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 13, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 13, $dmnd_date_div_mons, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return dmnd_dpt_cd();
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return dmnd_dpt_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			return dly_div_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return dmnd_dpt_cd();
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return dmnd_dpt_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			return dly_div_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			dmnd_dpt_cd(value);
			return;
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			dmnd_dpt_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			dly_div_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			dmnd_dpt_cd(value);
			return;
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			dmnd_dpt_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			dly_div_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

