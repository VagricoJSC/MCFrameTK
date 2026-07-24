package mcframe.serverMSBE.MSBEL1160;

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
 * "MSBEL_ProvDtlModReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ProvDtlModReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL1160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ProvDtlModReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL1160_Srch01_INFO;
		this.aSrch01 = ((MSBEL_ProvDtlModReg)this).new Srch01();
	}

	public static MSBEL_ProvDtlModReg.Srch01 crtSrch01() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
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
	public mcframe.serverMSBE.MSBEL1160.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL1160.Srch01_CndR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1160.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Srch01_DtlR.class);
	}
	protected MSBEL_ProvDtlModReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL1160_Chk01_INFO;
		this.aChk01 = ((MSBEL_ProvDtlModReg)this).new Chk01();
	}

	public static MSBEL_ProvDtlModReg.Chk01 crtChk01() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
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
	public mcframe.serverMSBE.MSBEL1160.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);
	}
	protected MSBEL_ProvDtlModReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL1160_Upd01_INFO;
		this.aUpd01 = ((MSBEL_ProvDtlModReg)this).new Upd01();
	}

	public static MSBEL_ProvDtlModReg.Upd01 crtUpd01() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
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
	public mcframe.serverMSBE.MSBEL1160.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1160.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMSBE.MSBEL1160.Upd01_CndR.create();
	}
	protected MSBEL_ProvDtlModReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBEL1160_Sprt01_INFO;
		this.aSprt01 = ((MSBEL_ProvDtlModReg)this).new Sprt01();
	}

	public static MSBEL_ProvDtlModReg.Sprt01 crtSprt01() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
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
	public mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR.class);
	}
	protected MSBEL_ProvDtlModReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBEL1160_Sprt02_INFO;
		this.aSprt02 = ((MSBEL_ProvDtlModReg)this).new Sprt02();
	}

	public static MSBEL_ProvDtlModReg.Sprt02 crtSprt02() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
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
	public mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR createSprt02_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR.create();
	}

	/**
	 * Sprt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR> createSprt02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR.class);
	}
	protected MSBEL_ProvDtlModReg.Sprt03 aSprt03;

	protected void initSprt03() {
		this.info = PDef.MS_MSBEL1160_Sprt03_INFO;
		this.aSprt03 = ((MSBEL_ProvDtlModReg)this).new Sprt03();
	}

	public static MSBEL_ProvDtlModReg.Sprt03 crtSprt03() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
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
	public mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR createSprt03_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR.create();
	}

	/**
	 * Sprt03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR> createSprt03_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR.class);
	}
	protected MSBEL_ProvDtlModReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBEL1160_Chk02_INFO;
		this.aChk02 = ((MSBEL_ProvDtlModReg)this).new Chk02();
	}

	public static MSBEL_ProvDtlModReg.Chk02 crtChk02() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addDownBlock(aChk02.down0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1160.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);
	}
	protected MSBEL_ProvDtlModReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBEL1160_Prnt01_INFO;
		this.aPrnt01 = ((MSBEL_ProvDtlModReg)this).new Prnt01();
	}

	public static MSBEL_ProvDtlModReg.Prnt01 crtPrnt01() {
		MSBEL_ProvDtlModReg lgc = new MSBEL_ProvDtlModReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1160.Chk02_DtlR createPrnt01_DtlR(){
		return mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.create();
	}

	/**
	 * Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> createPrnt01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);
	}

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1160.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBE.MSBEL1160.Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支給予定、支給実績を検索する<br>
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
		private final mcframe.serverMSBE.MSBEL1160.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Srch01_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1160.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Srch01_DtlR.class);

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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL1160.Srch01_CndR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>prov</td></tr>
		 * 	<tr><td><br></td><td>prov_rtn</td></tr>
		 * 	<tr><td><br></td><td>ffr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>not_subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_not_prnted</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnted</td></tr>
		 * 	<tr><td><br></td><td>accpt_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>accpt_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_act_hm_to</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_site_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_site_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dis_can_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sign_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>on_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>off_edi_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1160.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1160.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>accpt_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act_hm</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>prsppl_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_qty</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>old_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnted_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_rev</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_close_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Srch01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 支給実績情報の訂正前チェックを行う<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);

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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>chk_grp_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支給実績情報の訂正を行う<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1160.Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> down0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk01_DtlR&gt; （{@link #chk01_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> chk01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> chk01_down0;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL1160.Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR>)chk01.up(0);
			chk01_down0 = (MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR>)chk01.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk01_DtlR&gt;（{@link #chk01_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), chk01_down0);
			}
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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMSBE.MSBEL1160.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xfr_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> up0() {
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
		 * @see mcframe.serverMSBE.MSBEL1160.Upd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1160.Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE_chk01_0(dest0_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("base_ac_dt", "base_ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("xfr_rsn_cd", "xfr_rsn_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("prov_act_no", "prov_act_no");
				addColumnPathMap("prov_act_seq", "prov_act_seq");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("prov_src_act_typ", "prov_src_act_typ");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("prsppl_cd", "prsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("prov_upd_cntr", "prov_upd_cntr");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("iv_trd_flg", "iv_trd_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_0(MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_0();
			for(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> dest_Upd01_Dtl, MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> src0_0){
			down_CALL_OPE_chk01_0(dest_Upd01_Dtl, src0_0);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("base_ac_dt", "base_ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("xfr_rsn_cd", "xfr_rsn_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("prov_act_no", "prov_act_no");
				addColumnPathMap("prov_act_seq", "prov_act_seq");
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("chk_grp_no", "chk_grp_no");
				addColumnPathMap("prov_src_act_typ", "prov_src_act_typ");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("prsppl_cd", "prsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("prov_upd_cntr", "prov_upd_cntr");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("iv_trd_flg", "iv_trd_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_0(MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL1160.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_0();
			for(mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL1160.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
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
		private final MCList<mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR.class);

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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR.class);
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
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>grp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
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
		private final MCList<mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR.class);

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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR createSprt02_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR.create();
		}

		/**
		 * Sprt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR> createSprt02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xrate_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR> up0() {
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
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
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
		private final MCList<mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR.class);

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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR createSprt03_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR.create();
		}

		/**
		 * Sprt03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR> createSprt03_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR.class);
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
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR> up0() {
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
		public MCList<mcframe.serverMSBE.MSBEL1160.Sprt03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 納品書発行前のチェックを行う<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);

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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>trn_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1160.Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> down0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.Chk02 （{@link #chk02}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.Chk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk02_DtlR&gt; （{@link #chk02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk02_DtlR&gt; （{@link #chk02_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.Chk02 chk02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> chk02_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> chk02_down0;
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL1160.Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);

			// 連携オペレーションの初期化
			chk02 = mcframe.serverMSBE.MSBEL1160.MSBEL_ProvDtlModReg.crtChk02();
			
			// 連携オペレーションのコンテナ取得
			chk02_up0 = (MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR>)chk02.up(0);
			chk02_down0 = (MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR>)chk02.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk02_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL1160.Chk02_DtlR&gt;（{@link #chk02_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), chk02_down0);
			}
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
			invoke((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Chk02_DtlR createPrnt01_DtlR(){
			return mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.create();
		}

		/**
		 * Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> createPrnt01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR.class);
		}

		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1160.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBE.MSBEL1160.Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>prov_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> up0() {
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
		 * @see mcframe.serverMSBE.MSBEL1160.Prnt01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1160.Prnt01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ProvDtlModReg)MSBEL_ProvDtlModReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> src_Prnt01_Dtl){
			up_CALL_OPE_chk02_0(dest0_0, src_Prnt01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("prov_src_act_typ", "prov_src_act_typ");
				addColumnPathMap("prov_act_no", "prov_act_no");
				addColumnPathMap("prov_act_seq", "prov_act_seq");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("trn_typ", "trn_typ");
				addColumnPathMap("dlv_prnt_flg", "dlv_prnt_flg");
				addColumnPathMap("dlv_prnt_tm", "dlv_prnt_tm");
				addColumnPathMap("prov_upd_cntr", "prov_upd_cntr");
				addColumnPathMap("xfr_act_no", "xfr_act_no");
				addColumnPathMap("xfr_upd_cntr", "xfr_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_0(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_dest, mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk02_0(MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk02_0();
			for(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> dest_Prnt01_Dtl, MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> src0_0){
			down_CALL_OPE_chk02_0(dest_Prnt01_Dtl, src0_0);
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("prov_src_act_typ", "prov_src_act_typ");
				addColumnPathMap("prov_act_no", "prov_act_no");
				addColumnPathMap("prov_act_seq", "prov_act_seq");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("trn_typ", "trn_typ");
				addColumnPathMap("dlv_prnt_flg", "dlv_prnt_flg");
				addColumnPathMap("dlv_prnt_tm", "dlv_prnt_tm");
				addColumnPathMap("prov_upd_cntr", "prov_upd_cntr");
				addColumnPathMap("xfr_act_no", "xfr_act_no");
				addColumnPathMap("xfr_upd_cntr", "xfr_upd_cntr");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_0(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_dest, mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_0(MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL1160.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_0();
			for(mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL1160.Chk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}