package mcframe.clientMSBC.MSBCP1040;

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
 * ブロック"InstBulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InstBulkSetR_MC_A extends MCConstRow {

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";
	/**
	 * Mfg. order date 製造指図日.<p>
	 *
	 */
	public static final String $mfg_inst_dt = "mfg_inst_dt";
	public static final String $inst_usr_dpt_p = "inst_usr_dpt_p";
	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $inst_immed_prnt_flg = "inst_immed_prnt_flg";
	/**
	 * Re-allocate 再引当.<p>
	 *
	 */
	public static final String $re_alloc_mode_flg = "re_alloc_mode_flg";
	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public static final String $async_flg = "async_flg";
	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	/**
	 * Allocation type 引当種別.<p>
	 *
	 */
	public static final String $alloc_ope_flg = "alloc_ope_flg";

	public static final String $inst_usr_cd = $inst_usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $inst_usr_dpt_p + ".usr_nm";
	public static final String $inst_usr_dpt_cd = $inst_usr_dpt_p + ".dpt_cd";
	public static final String $inst_usr_dpt_nm = $inst_usr_dpt_p + ".dpt_nm";

	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta mfg_inst_dt_META = createCommonMeta($mfg_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_dpt_p_META = createInnerRowMeta($inst_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta inst_immed_prnt_flg_META = createCommonMeta($inst_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_alloc_mode_flg_META = createCommonMeta($re_alloc_mode_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta async_flg_META = createCommonMeta($async_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ope_flg_META = createCommonMeta($alloc_ope_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<InstBulkSetR> constMetas = new ConstMetaList<InstBulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			mfg_inst_dt_META,
			inst_usr_dpt_p_META,
			inst_immed_prnt_flg_META,
			re_alloc_mode_flg_META,
			async_flg_META,
			oper_unit_flg_META,
			alloc_ope_flg_META
		},
		new String[][]{
			{
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_usr_dpt_cd",
				"inst_usr_dpt_nm"
			},
			{
				$inst_usr_cd,
				$inst_usr_nm,
				$inst_usr_dpt_cd,
				$inst_usr_dpt_nm
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
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// inst_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.MFG;mfg_inst_dt;inst_usr_cd"}	// inst_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"}	// inst_usr_dpt_p.dpt_cd
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
	protected InstBulkSetR_MC_A(ConstMetaList<? extends InstBulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InstBulkSetR clone() {
		return (InstBulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InstBulkSetR createInstance() {
		return (InstBulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InstBulkSetR getValues(String... names) {
		return (InstBulkSetR) super.getValues(names);
	}



	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 0, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 0, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 1, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 1, $mfg_sts_typ_nm, value);
	}


	/**
	 * Mfg. order date 製造指図日.<p>
	 *
	 */
	public MCDate mfg_inst_dt() {
		return getConstDate(offset + 2, $mfg_inst_dt);
	}

	/**
	 * Mfg. order date 製造指図日.<p>
	 *
	 */
	public void mfg_inst_dt(MCDate value) {
		setConstDate(offset + 2, $mfg_inst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR inst_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 3, $inst_usr_dpt_p);
	}
	
	public void inst_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 3, $inst_usr_dpt_p, row);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean inst_immed_prnt_flg() {
		return getConstBoolean(offset + 4, $inst_immed_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void inst_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $inst_immed_prnt_flg, value);
	}


	/**
	 * Re-allocate 再引当.<p>
	 *
	 */
	public boolean re_alloc_mode_flg() {
		return getConstBoolean(offset + 5, $re_alloc_mode_flg);
	}

	/**
	 * Re-allocate 再引当.<p>
	 *
	 */
	public void re_alloc_mode_flg(boolean value) {
		setConstBoolean(offset + 5, $re_alloc_mode_flg, value);
	}


	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public boolean async_flg() {
		return getConstBoolean(offset + 6, $async_flg);
	}

	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public void async_flg(boolean value) {
		setConstBoolean(offset + 6, $async_flg, value);
	}


	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 7, $oper_unit_flg);
	}

	/**
	 * Operation unit mfg. order 工程単位製造指図.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 7, $oper_unit_flg, value);
	}


	/**
	 * Allocation type 引当種別.<p>
	 *
	 */
	public boolean alloc_ope_flg() {
		return getConstBoolean(offset + 8, $alloc_ope_flg);
	}

	/**
	 * Allocation type 引当種別.<p>
	 *
	 */
	public void alloc_ope_flg(boolean value) {
		setConstBoolean(offset + 8, $alloc_ope_flg, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_inst_dt.equalsIgnoreCase(name)) {
			return mfg_inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			return async_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			return alloc_ope_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_inst_dt.equalsIgnoreCase(name)) {
			return mfg_inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			return re_alloc_mode_flg();
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			return async_flg();
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			return alloc_ope_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_inst_dt.equalsIgnoreCase(name)) {
			mfg_inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			async_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			alloc_ope_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_inst_dt.equalsIgnoreCase(name)) {
			mfg_inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($re_alloc_mode_flg.equalsIgnoreCase(name)) {
			re_alloc_mode_flg(value);
			return;
		}
		if ($async_flg.equalsIgnoreCase(name)) {
			async_flg(value);
			return;
		}
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($alloc_ope_flg.equalsIgnoreCase(name)) {
			alloc_ope_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			return inst_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			inst_usr_dpt_p(
				((MCContainerMeta) inst_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return inst_usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		inst_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return inst_usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		inst_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_usr_dpt_cd() {
		return inst_usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_usr_dpt_cd(String value) {
		inst_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_usr_dpt_nm() {
		return inst_usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_usr_dpt_nm(String value) {
		inst_usr_dpt_p().dpt_nm(value);
	}

}

