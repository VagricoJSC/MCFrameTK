package mcframe.serverMSBE.MSBEL5210;

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
 * ブロック"XfrInst_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrInst_HdrR_MC_A extends MCConstRow {

	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $hdr_data_crud_typ = "hdr_data_crud_typ";
	public static final String $xih = "xih";
	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $immd_inst_prnt_flg = "immd_inst_prnt_flg";
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public static final String $immd_pick_prnt_flg = "immd_pick_prnt_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $immd_dlv_prnt_flg = "immd_dlv_prnt_flg";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public static final String $ret_sppl_cd = "ret_sppl_cd";

	public static final String $xfr_inst_no = $xih + ".xfr_inst_no";
	public static final String $trd_cd = $xih + ".trd_cd";
	public static final String $trd_ptn_typ = $xih + ".trd_ptn_typ";
	public static final String $wg_cd = $xih + ".wg_cd";
	public static final String $lg_grp_cd = $xih + ".lg_grp_cd";
	public static final String $gr_loc_cd = $xih + ".gr_loc_cd";
	public static final String $gr_stk_arrv_bp_cd = $xih + ".gr_stk_arrv_bp_cd";
	public static final String $xfr_schd_dt = $xih + ".xfr_schd_dt";
	public static final String $xfr_inst_dt = $xih + ".xfr_inst_dt";
	public static final String $inst_usr_cd = $xih + ".inst_usr_cd";
	public static final String $inst_dpt_cd = $xih + ".inst_dpt_cd";
	public static final String $inst_prnt_flg = $xih + ".inst_prnt_flg";
	public static final String $inst_prnt_tm = $xih + ".inst_prnt_tm";
	public static final String $pick_prnt_flg = $xih + ".pick_prnt_flg";
	public static final String $pick_prnt_tm = $xih + ".pick_prnt_tm";
	public static final String $dlv_prnt_flg = $xih + ".dlv_prnt_flg";
	public static final String $dlv_prnt_tm = $xih + ".dlv_prnt_tm";
	public static final String $trd_rmrks = $xih + ".trd_rmrks";
	public static final String $inst_rmrks = $xih + ".inst_rmrks";
	public static final String $intr_rmrks = $xih + ".intr_rmrks";
	public static final String $sub_char1 = $xih + ".sub_char1";
	public static final String $sub_char2 = $xih + ".sub_char2";
	public static final String $sub_char3 = $xih + ".sub_char3";

	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_data_crud_typ_META = createCommonMeta($hdr_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta xih_META = createInnerRowMeta($xih, mcframe.serverMS.dbc.MST_XFR_INST_R.class);
	public static final MCMeta immd_inst_prnt_flg_META = createCommonMeta($immd_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_pick_prnt_flg_META = createCommonMeta($immd_pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_dlv_prnt_flg_META = createCommonMeta($immd_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ret_sppl_cd_META = createCommonMeta($ret_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final ConstMetaList<XfrInst_HdrR> constMetas = new ConstMetaList<XfrInst_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			hdr_peg_no_META,
			hdr_data_crud_typ_META,
			xih_META,
			immd_inst_prnt_flg_META,
			immd_pick_prnt_flg_META,
			immd_dlv_prnt_flg_META,
			slo_no_META,
			ret_sppl_cd_META
		},
		new String[][]{
			{
				"xfr_inst_no",
				"trd_cd",
				"trd_ptn_typ",
				"wg_cd",
				"lg_grp_cd",
				"gr_loc_cd",
				"gr_stk_arrv_bp_cd",
				"xfr_schd_dt",
				"xfr_inst_dt",
				"inst_usr_cd",
				"inst_dpt_cd",
				"inst_prnt_flg",
				"inst_prnt_tm",
				"pick_prnt_flg",
				"pick_prnt_tm",
				"dlv_prnt_flg",
				"dlv_prnt_tm",
				"trd_rmrks",
				"inst_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$xfr_inst_no,
				$trd_cd,
				$trd_ptn_typ,
				$wg_cd,
				$lg_grp_cd,
				$gr_loc_cd,
				$gr_stk_arrv_bp_cd,
				$xfr_schd_dt,
				$xfr_inst_dt,
				$inst_usr_cd,
				$inst_dpt_cd,
				$inst_prnt_flg,
				$inst_prnt_tm,
				$pick_prnt_flg,
				$pick_prnt_tm,
				$dlv_prnt_flg,
				$dlv_prnt_tm,
				$trd_rmrks,
				$inst_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected XfrInst_HdrR_MC_A(ConstMetaList<? extends XfrInst_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_HdrR clone() {
		return (XfrInst_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_HdrR createInstance() {
		return (XfrInst_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_HdrR getValues(String... names) {
		return (XfrInst_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 0, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 0, $err_flg, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String hdr_data_crud_typ() {
		return getConstString(offset + 2, $hdr_data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void hdr_data_crud_typ(String value) {
		setConstString(offset + 2, $hdr_data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_XFR_INST_R xih(){
		return (mcframe.serverMS.dbc.MST_XFR_INST_R) getConstInnerRow(offset + 3, $xih);
	}
	
	public void xih(mcframe.serverMS.dbc.MST_XFR_INST_R row){
		setConstInnerRow(offset + 3, $xih, row);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean immd_inst_prnt_flg() {
		return getConstBoolean(offset + 4, $immd_inst_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void immd_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $immd_inst_prnt_flg, value);
	}


	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean immd_pick_prnt_flg() {
		return getConstBoolean(offset + 5, $immd_pick_prnt_flg);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void immd_pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $immd_pick_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return getConstBoolean(offset + 6, $immd_dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $immd_dlv_prnt_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 7, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 7, $slo_no, value);
	}


	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public String ret_sppl_cd() {
		return getConstString(offset + 8, $ret_sppl_cd);
	}

	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public void ret_sppl_cd(String value) {
		setConstString(offset + 8, $ret_sppl_cd, value);
	}


	public String getString(String name) {
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			return hdr_data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			return ret_sppl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_inst_prnt_flg();
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			return hdr_data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			return ret_sppl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_inst_prnt_flg();
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			hdr_data_crud_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			ret_sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_inst_prnt_flg(value);
			return;
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			hdr_data_crud_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ret_sppl_cd.equalsIgnoreCase(name)) {
			ret_sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($immd_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_inst_prnt_flg(value);
			return;
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xih.equalsIgnoreCase(name)) {
			return xih();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xih.equalsIgnoreCase(name)) {
			xih(
				((MCContainerMeta) xih_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_INST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return xih().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		xih().xfr_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xih().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xih().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return xih().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		xih().trd_ptn_typ(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return xih().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		xih().wg_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xih().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xih().lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xih().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xih().gr_loc_cd(value);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return xih().gr_stk_arrv_bp_cd();
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		xih().gr_stk_arrv_bp_cd(value);
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return xih().xfr_schd_dt();
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		xih().xfr_schd_dt(value);
	}

	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public MCDate xfr_inst_dt() {
		return xih().xfr_inst_dt();
	}

	/**
	 * Movement order date 移動指図日.<p>
	 *
	 */
	public void xfr_inst_dt(MCDate value) {
		xih().xfr_inst_dt(value);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return xih().inst_usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		xih().inst_usr_cd(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return xih().inst_dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		xih().inst_dpt_cd(value);
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return xih().inst_prnt_flg();
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		xih().inst_prnt_flg(value);
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return xih().inst_prnt_tm();
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		xih().inst_prnt_tm(value);
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public boolean pick_prnt_flg() {
		return xih().pick_prnt_flg();
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public void pick_prnt_flg(boolean value) {
		xih().pick_prnt_flg(value);
	}

	/**
	 * Picking list issue date and time ピッキングリスト発行日時.<p>
	 *
	 */
	public MCDate pick_prnt_tm() {
		return xih().pick_prnt_tm();
	}

	/**
	 * Picking list issue date and time ピッキングリスト発行日時.<p>
	 *
	 */
	public void pick_prnt_tm(MCDate value) {
		xih().pick_prnt_tm(value);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return xih().dlv_prnt_flg();
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		xih().dlv_prnt_flg(value);
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public MCDate dlv_prnt_tm() {
		return xih().dlv_prnt_tm();
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public void dlv_prnt_tm(MCDate value) {
		xih().dlv_prnt_tm(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return xih().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		xih().trd_rmrks(value);
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return xih().inst_rmrks();
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		xih().inst_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return xih().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		xih().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return xih().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		xih().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return xih().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		xih().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return xih().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		xih().sub_char3(value);
	}

}

