package mcframe.serverMSBD.MSBDL0190;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBDL_PurcDtlModReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcDtlModReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL0190";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcDtlModReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBDL0190_Srch01_INFO;
		this.aSrch01 = ((MSBDL_PurcDtlModReg)this).new Srch01();
	}

	public static MSBDL_PurcDtlModReg.Srch01 crtSrch01() {
		MSBDL_PurcDtlModReg lgc = new MSBDL_PurcDtlModReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBD.MSBDL0190.Srch01_CndR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBD.MSBDL0190.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0190.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0190.Srch01_DtlR.class);
	}
	protected MSBDL_PurcDtlModReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBDL0190_Sprt01_INFO;
		this.aSprt01 = ((MSBDL_PurcDtlModReg)this).new Sprt01();
	}

	public static MSBDL_PurcDtlModReg.Sprt01 crtSprt01() {
		MSBDL_PurcDtlModReg lgc = new MSBDL_PurcDtlModReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR.class);
	}
	protected MSBDL_PurcDtlModReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBDL0190_Sprt02_INFO;
		this.aSprt02 = ((MSBDL_PurcDtlModReg)this).new Sprt02();
	}

	public static MSBDL_PurcDtlModReg.Sprt02 crtSprt02() {
		MSBDL_PurcDtlModReg lgc = new MSBDL_PurcDtlModReg();
		lgc.initSprt02();
		return lgc.aSprt02;
	}

	protected void paramSprt02(MCParam p) {
		if (this.aSprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt02.up0());
		p.addDownBlock(aSprt02.down0());
	}

	protected void doSprt02() {
		aSprt02.call();
	};

	/**
	 * Sprt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR createSprt02_DtlR(){
		return mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR.create();
	}

	/**
	 * Sprt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR> createSprt02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR.class);
	}
	protected MSBDL_PurcDtlModReg.Sprt03 aSprt03;

	protected void initSprt03() {
		this.info = PDef.MS_MSBDL0190_Sprt03_INFO;
		this.aSprt03 = ((MSBDL_PurcDtlModReg)this).new Sprt03();
	}

	public static MSBDL_PurcDtlModReg.Sprt03 crtSprt03() {
		MSBDL_PurcDtlModReg lgc = new MSBDL_PurcDtlModReg();
		lgc.initSprt03();
		return lgc.aSprt03;
	}

	protected void paramSprt03(MCParam p) {
		if (this.aSprt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt03.up0());
		p.addDownBlock(aSprt03.down0());
	}

	protected void doSprt03() {
		aSprt03.call();
	};

	/**
	 * Sprt03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR createSprt03_DtlR(){
		return mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR.create();
	}

	/**
	 * Sprt03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR> createSprt03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR.class);
	}
	protected MSBDL_PurcDtlModReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBDL0190_Chk01_INFO;
		this.aChk01 = ((MSBDL_PurcDtlModReg)this).new Chk01();
	}

	public static MSBDL_PurcDtlModReg.Chk01 crtChk01() {
		MSBDL_PurcDtlModReg lgc = new MSBDL_PurcDtlModReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);
	}
	protected MSBDL_PurcDtlModReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBDL0190_Upd01_INFO;
		this.aUpd01 = ((MSBDL_PurcDtlModReg)this).new Upd01();
	}

	public static MSBDL_PurcDtlModReg.Upd01 crtUpd01() {
		MSBDL_PurcDtlModReg lgc = new MSBDL_PurcDtlModReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);
	}

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0190.Upd01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBD.MSBDL0190.Upd01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 仕入情報（仕入・返品・値引情報）を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0190.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Srch01_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0190.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Srch01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBD.MSBDL0190.Srch01_CndR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBD.MSBDL0190.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0190.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>disp_unit</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_trgt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_not_trgt_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>not_subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_from</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_from</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_from</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_to</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_src_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_src_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dis_can_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_past_flg</td></tr>
		 * 	<tr><td><br></td><td>incl_temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sign_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0190.Srch01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0190.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>old_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>old_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>old_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dscnt_loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_src_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_src_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>base_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>base_in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>base_in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>base_in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sbst_dt</td></tr>
		 * 	<tr><td><br></td><td>base_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Srch01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を取得する<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqst_avl_rqst_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 為替レートを取得する<br>
	 */
	abstract public class Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR createSprt02_DtlR(){
			return mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR.create();
		}

		/**
		 * Sprt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR> createSprt02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xrate_base_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 税を取得する<br>
	 */
	abstract public class Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR createSprt03_DtlR(){
			return mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR.create();
		}

		/**
		 * Sprt03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR> createSprt03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Sprt03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕入実績明細情報の訂正前のチェックを実行する<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕入実績明細情報を訂正する<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0190.Upd01_HdrR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);
			up1 = mcframe.serverMSBD.MSBDL0190.Upd01_HdrR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0190.Chk01_DtlR.class);
		}

		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0190.Upd01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBD.MSBDL0190.Upd01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0190.Upd01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0190.Upd01_HdrR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0190.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDtlModReg)MSBDL_PurcDtlModReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}