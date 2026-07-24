package mcframe.clientMGBE.MGBEP0040;

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
 * ブロック"DtlOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlOperR_MC_A extends MCConstRow {

	public static final String $calc_grp_cd = "calc_grp_cd";
	public static final String $calc_no = "calc_no";
	public static final String $top_rec_no = "top_rec_no";
	public static final String $inpt_rec_no = "inpt_rec_no";
	public static final String $oper_rec_no = "oper_rec_no";
	public static final String $wg_cd = "wg_cd";
	public static final String $org_loc_cd = "org_loc_cd";
	public static final String $itm_cd = "itm_cd";
	public static final String $itm_sub1 = "itm_sub1";
	public static final String $itm_sub2 = "itm_sub2";
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	public static final String $std_qty_p = "std_qty_p";
	public static final String $the_qty_p = "the_qty_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $oper_qty_p = "oper_qty_p";
	public static final String $the_oper_qty_p = "the_oper_qty_p";
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	public static final String $oper_dec_place = "oper_dec_place";
	public static final String $oper_std_qty = "oper_std_qty";
	public static final String $oper_conv_qty = "oper_conv_qty";
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";

	public static final String $std_qty = $std_qty_p + ".qty";
	public static final String $the_qty = $the_qty_p + ".qty";
	public static final String $oper_qty = $oper_qty_p + ".qty";
	public static final String $the_oper_qty = $the_oper_qty_p + ".qty";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta top_rec_no_META = createCommonMeta($top_rec_no, mcframe.commonMG.meta.MG_META.TOP_REC_NO);
	public static final MCMeta inpt_rec_no_META = createCommonMeta($inpt_rec_no, mcframe.commonMG.meta.MG_META.INPT_REC_NO);
	public static final MCMeta oper_rec_no_META = createCommonMeta($oper_rec_no, mcframe.commonMG.meta.MG_META.OPER_REC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta org_loc_cd_META = createCommonMeta($org_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta std_qty_p_META = createInnerRowMeta($std_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta the_qty_p_META = createInnerRowMeta($the_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_qty_p_META = createInnerRowMeta($oper_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta the_oper_qty_p_META = createInnerRowMeta($the_oper_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_dec_place_META = createCommonMeta($oper_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);

	protected static final ConstMetaList<DtlOperR> constMetas = new ConstMetaList<DtlOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			top_rec_no_META,
			inpt_rec_no_META,
			oper_rec_no_META,
			wg_cd_META,
			org_loc_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			loc_nm_META,
			disp_seq_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			std_qty_p_META,
			the_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			oper_qty_p_META,
			the_oper_qty_p_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_dec_place_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_conv_rnd_typ_META
		},
		new String[][]{
			{
				"std_qty",
				"the_qty",
				"oper_qty",
				"the_oper_qty"
			},
			{
				$std_qty,
				$the_qty,
				$oper_qty,
				$the_oper_qty
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected DtlOperR_MC_A(ConstMetaList<? extends DtlOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlOperR clone() {
		return (DtlOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlOperR createInstance() {
		return (DtlOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlOperR getValues(String... names) {
		return (DtlOperR) super.getValues(names);
	}



	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
	}


	public MCNumber top_rec_no() {
		return getConstNumber(offset + 2, $top_rec_no);
	}

	public void top_rec_no(MCNumber value) {
		setConstNumber(offset + 2, $top_rec_no, value);
	}

	public void top_rec_no(int value) {
		setConstNumber(offset + 2, $top_rec_no, value);
	}

	public void top_rec_no(long value) {
		setConstNumber(offset + 2, $top_rec_no, value);
	}

	public void top_rec_no(float value) {
		setConstNumber(offset + 2, $top_rec_no, value);
	}

	public void top_rec_no(double value) {
		setConstNumber(offset + 2, $top_rec_no, value);
	}


	public MCNumber inpt_rec_no() {
		return getConstNumber(offset + 3, $inpt_rec_no);
	}

	public void inpt_rec_no(MCNumber value) {
		setConstNumber(offset + 3, $inpt_rec_no, value);
	}

	public void inpt_rec_no(int value) {
		setConstNumber(offset + 3, $inpt_rec_no, value);
	}

	public void inpt_rec_no(long value) {
		setConstNumber(offset + 3, $inpt_rec_no, value);
	}

	public void inpt_rec_no(float value) {
		setConstNumber(offset + 3, $inpt_rec_no, value);
	}

	public void inpt_rec_no(double value) {
		setConstNumber(offset + 3, $inpt_rec_no, value);
	}


	public MCNumber oper_rec_no() {
		return getConstNumber(offset + 4, $oper_rec_no);
	}

	public void oper_rec_no(MCNumber value) {
		setConstNumber(offset + 4, $oper_rec_no, value);
	}

	public void oper_rec_no(int value) {
		setConstNumber(offset + 4, $oper_rec_no, value);
	}

	public void oper_rec_no(long value) {
		setConstNumber(offset + 4, $oper_rec_no, value);
	}

	public void oper_rec_no(float value) {
		setConstNumber(offset + 4, $oper_rec_no, value);
	}

	public void oper_rec_no(double value) {
		setConstNumber(offset + 4, $oper_rec_no, value);
	}


	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	public String org_loc_cd() {
		return getConstString(offset + 6, $org_loc_cd);
	}

	public void org_loc_cd(String value) {
		setConstString(offset + 6, $org_loc_cd, value);
	}


	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}


	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 11, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 11, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 12, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 12, $loc_nm, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 13, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 13, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 14, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 14, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 15, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 15, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 16, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 16, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 16, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 16, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 16, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 16, $oper_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR std_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 17, $std_qty_p);
	}
	
	public void std_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 17, $std_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR the_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $the_qty_p);
	}
	
	public void the_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $the_qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 19, $base_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 19, $base_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 20, $base_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 20, $base_unit_nm, value);
	}


	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 21, $base_unit_dec_place);
	}

	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 21, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 21, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 21, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 21, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $oper_qty_p);
	}
	
	public void oper_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $oper_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR the_oper_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $the_oper_qty_p);
	}
	
	public void the_oper_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $the_oper_qty_p, row);
	}


	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 24, $oper_unit_cd);
	}

	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 24, $oper_unit_cd, value);
	}


	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 25, $oper_unit_nm);
	}

	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 25, $oper_unit_nm, value);
	}


	public MCNumber oper_dec_place() {
		return getConstNumber(offset + 26, $oper_dec_place);
	}

	public void oper_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $oper_dec_place, value);
	}

	public void oper_dec_place(int value) {
		setConstNumber(offset + 26, $oper_dec_place, value);
	}

	public void oper_dec_place(long value) {
		setConstNumber(offset + 26, $oper_dec_place, value);
	}

	public void oper_dec_place(float value) {
		setConstNumber(offset + 26, $oper_dec_place, value);
	}

	public void oper_dec_place(double value) {
		setConstNumber(offset + 26, $oper_dec_place, value);
	}


	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 27, $oper_std_qty);
	}

	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	public void oper_std_qty(int value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	public void oper_std_qty(long value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	public void oper_std_qty(float value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}

	public void oper_std_qty(double value) {
		setConstNumber(offset + 27, $oper_std_qty, value);
	}


	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 28, $oper_conv_qty);
	}

	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	public void oper_conv_qty(int value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	public void oper_conv_qty(long value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	public void oper_conv_qty(float value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}

	public void oper_conv_qty(double value) {
		setConstNumber(offset + 28, $oper_conv_qty, value);
	}


	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 29, $oper_unit_conv_rnd_typ);
	}

	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 29, $oper_unit_conv_rnd_typ, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($org_loc_cd.equalsIgnoreCase(name)) {
			return org_loc_cd();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			return top_rec_no();
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			return oper_rec_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			return oper_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($org_loc_cd.equalsIgnoreCase(name)) {
			return org_loc_cd();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			return top_rec_no();
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			return oper_rec_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			return oper_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($org_loc_cd.equalsIgnoreCase(name)) {
			org_loc_cd(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($org_loc_cd.equalsIgnoreCase(name)) {
			org_loc_cd(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($top_rec_no.equalsIgnoreCase(name)) {
			top_rec_no(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($oper_rec_no.equalsIgnoreCase(name)) {
			oper_rec_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_dec_place.equalsIgnoreCase(name)) {
			oper_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($std_qty_p.equalsIgnoreCase(name)) {
			return std_qty_p();
		}
		if ($the_qty_p.equalsIgnoreCase(name)) {
			return the_qty_p();
		}
		if ($oper_qty_p.equalsIgnoreCase(name)) {
			return oper_qty_p();
		}
		if ($the_oper_qty_p.equalsIgnoreCase(name)) {
			return the_oper_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($std_qty_p.equalsIgnoreCase(name)) {
			std_qty_p(
				((MCContainerMeta) std_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($the_qty_p.equalsIgnoreCase(name)) {
			the_qty_p(
				((MCContainerMeta) the_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_qty_p.equalsIgnoreCase(name)) {
			oper_qty_p(
				((MCContainerMeta) oper_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($the_oper_qty_p.equalsIgnoreCase(name)) {
			the_oper_qty_p(
				((MCContainerMeta) the_oper_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCNumber std_qty() {
		return std_qty_p().qty();
	}

	public void std_qty(MCNumber value) {
		std_qty_p().qty(value);
	}

	public void std_qty(int value) {
		std_qty_p().qty(value);
	}

	public void std_qty(long value) {
		std_qty_p().qty(value);
	}

	public void std_qty(float value) {
		std_qty_p().qty(value);
	}

	public void std_qty(double value) {
		std_qty_p().qty(value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public MCNumber the_qty() {
		return the_qty_p().qty();
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(MCNumber value) {
		the_qty_p().qty(value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(int value) {
		the_qty_p().qty(value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(long value) {
		the_qty_p().qty(value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(float value) {
		the_qty_p().qty(value);
	}

	/**
	 * Ideal qty. 理論数量.<p>
	 *
	 */
	public void the_qty(double value) {
		the_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public MCNumber oper_qty() {
		return oper_qty_p().qty();
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(MCNumber value) {
		oper_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(int value) {
		oper_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(long value) {
		oper_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(float value) {
		oper_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_qty(double value) {
		oper_qty_p().qty(value);
	}

	/**
	 * Ideal operation management unit qty. 理論工程管理単位数量.<p>
	 *
	 */
	public MCNumber the_oper_qty() {
		return the_oper_qty_p().qty();
	}

	/**
	 * Ideal operation management unit qty. 理論工程管理単位数量.<p>
	 *
	 */
	public void the_oper_qty(MCNumber value) {
		the_oper_qty_p().qty(value);
	}

	/**
	 * Ideal operation management unit qty. 理論工程管理単位数量.<p>
	 *
	 */
	public void the_oper_qty(int value) {
		the_oper_qty_p().qty(value);
	}

	/**
	 * Ideal operation management unit qty. 理論工程管理単位数量.<p>
	 *
	 */
	public void the_oper_qty(long value) {
		the_oper_qty_p().qty(value);
	}

	/**
	 * Ideal operation management unit qty. 理論工程管理単位数量.<p>
	 *
	 */
	public void the_oper_qty(float value) {
		the_oper_qty_p().qty(value);
	}

	/**
	 * Ideal operation management unit qty. 理論工程管理単位数量.<p>
	 *
	 */
	public void the_oper_qty(double value) {
		the_oper_qty_p().qty(value);
	}

}

