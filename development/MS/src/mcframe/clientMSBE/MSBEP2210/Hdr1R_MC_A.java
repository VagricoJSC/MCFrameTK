package mcframe.clientMSBE.MSBEP2210;

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
 * ブロック"Hdr1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Hdr1R_MC_A extends mcframe.clientMSBD.MSBDP0140.Hdr1R {

	public static final String $bef_fix_flg = "bef_fix_flg";
	public static final String $bef_purc_schd_dt = "bef_purc_schd_dt";

	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $sppl_show_dtl = $sppl_addr_p + ".show_dtl";
	public static final String $sppl_lg_grp_cd = $sppl_addr_p + ".lg_grp_cd";
	public static final String $sppl_lg_grp_nm = $sppl_addr_p + ".lg_grp_nm";
	public static final String $sppl_cntry_cd = $sppl_addr_p + ".cntry_cd";
	public static final String $sppl_cntry_nm = $sppl_addr_p + ".cntry_nm";
	public static final String $sppl_zip_cd = $sppl_addr_p + ".zip_cd";
	public static final String $sppl_addr1 = $sppl_addr_p + ".addr1";
	public static final String $sppl_addr2 = $sppl_addr_p + ".addr2";
	public static final String $sppl_addr3 = $sppl_addr_p + ".addr3";
	public static final String $sppl_addr4 = $sppl_addr_p + ".addr4";
	public static final String $sppl_cntct_dpt = $sppl_addr_p + ".cntct_dpt";
	public static final String $sppl_cntct_psn = $sppl_addr_p + ".cntct_psn";
	public static final String $sppl_tel = $sppl_addr_p + ".tel";
	public static final String $sppl_fax = $sppl_addr_p + ".fax";
	public static final String $purc_usr_cd = $purc_usr_dpt_p + ".usr_cd";
	public static final String $purc_usr_nm = $purc_usr_dpt_p + ".usr_nm";
	public static final String $purc_dpt_cd = $purc_usr_dpt_p + ".dpt_cd";
	public static final String $purc_dpt_nm = $purc_usr_dpt_p + ".dpt_nm";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $ptax_xrate = $ptax_xrate_p + ".xrate";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_inc_tax_amt_p + ".amt";

	public static final MCMeta bef_fix_flg_META = createCommonMeta($bef_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_purc_schd_dt_META = createCommonMeta($bef_purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Hdr1R> constMetas = new ConstMetaList<Hdr1R>(
		mcframe.clientMSBD.MSBDP0140.Hdr1R.constMetas,
		new MCMeta[]{
			bef_fix_flg_META,
			bef_purc_schd_dt_META
		},
		new String[][]{
			{
				"ac_dt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"sppl_lg_grp_cd",
				"sppl_lg_grp_nm",
				"sppl_cntry_cd",
				"sppl_cntry_nm",
				"sppl_zip_cd",
				"sppl_addr1",
				"sppl_addr2",
				"sppl_addr3",
				"sppl_addr4",
				"sppl_cntct_dpt",
				"sppl_cntct_psn",
				"sppl_tel",
				"sppl_fax",
				"purc_usr_cd",
				"purc_usr_nm",
				"purc_dpt_cd",
				"purc_dpt_nm",
				"xrate",
				"ptax_xrate",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt"
			},
			{
				$ac_dt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$sppl_lg_grp_cd,
				$sppl_lg_grp_nm,
				$sppl_cntry_cd,
				$sppl_cntry_nm,
				$sppl_zip_cd,
				$sppl_addr1,
				$sppl_addr2,
				$sppl_addr3,
				$sppl_addr4,
				$sppl_cntct_dpt,
				$sppl_cntct_psn,
				$sppl_tel,
				$sppl_fax,
				$purc_usr_cd,
				$purc_usr_nm,
				$purc_dpt_cd,
				$purc_dpt_nm,
				$xrate,
				$ptax_xrate,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		mcframe.clientMSBD.MSBDP0140.Hdr1R.KEYS,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[PURC_ONLY_ITEM]のキー定数 */
	public static final String $$PURC_ONLY_ITEM = "PURC_ONLY_ITEM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.clientMSBD.MSBDP0140.Hdr1R.EXTMAP,
		new MCExtMap.Entry($$PURC_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$purc_act_no, "E"},	// purc_act_no
				{$purc_act_seq, "E"},	// purc_act_seq
				{$purc_act_rev, "E"},	// purc_act_rev
				{$po_no, "E"},	// po_no
				{$def_purc_usr_cd, "E"},	// def_purc_usr_cd
				{$def_purc_dpt_cd, "E"}	// def_purc_dpt_cd
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
	protected Hdr1R_MC_A(ConstMetaList<? extends Hdr1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R clone() {
		return (Hdr1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R createInstance() {
		return (Hdr1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Hdr1R getValues(String... names) {
		return (Hdr1R) super.getValues(names);
	}



	public boolean bef_fix_flg() {
		return getConstBoolean(offset + 0, $bef_fix_flg);
	}

	public void bef_fix_flg(boolean value) {
		setConstBoolean(offset + 0, $bef_fix_flg, value);
	}


	public MCDate bef_purc_schd_dt() {
		return getConstDate(offset + 1, $bef_purc_schd_dt);
	}

	public void bef_purc_schd_dt(MCDate value) {
		setConstDate(offset + 1, $bef_purc_schd_dt, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bef_purc_schd_dt.equalsIgnoreCase(name)) {
			return bef_purc_schd_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			return bef_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bef_purc_schd_dt.equalsIgnoreCase(name)) {
			return bef_purc_schd_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			return bef_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bef_purc_schd_dt.equalsIgnoreCase(name)) {
			bef_purc_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			bef_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bef_purc_schd_dt.equalsIgnoreCase(name)) {
			bef_purc_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bef_fix_flg.equalsIgnoreCase(name)) {
			bef_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		super.setInnerRow(name, value);
	}


}

