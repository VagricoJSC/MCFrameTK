package mcframe.serverMSBE.MSBEL1750;

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
 * "MSBEL_PlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_PlReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL1750";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_PlReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL1750_Srch01_INFO;
		this.aSrch01 = ((MSBEL_PlReg)this).new Srch01();
	}

	public static MSBEL_PlReg.Srch01 crtSrch01() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
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
		p.addDownBlock(aSrch01.down1());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
	}
	protected MSBEL_PlReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBEL1750_Srch02_INFO;
		this.aSrch02 = ((MSBEL_PlReg)this).new Srch02();
	}

	public static MSBEL_PlReg.Srch02 crtSrch02() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
		p.addDownBlock(aSrch02.down1());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_CndR.create();
	}

	/**
	 * Srch02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_HdrR createSrch02_HdrR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_HdrR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
	}
	protected MSBEL_PlReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBEL1750_Srch03_INFO;
		this.aSrch03 = ((MSBEL_PlReg)this).new Srch03();
	}

	public static MSBEL_PlReg.Srch03 crtSrch03() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch03.up0());
		p.addDownBlock(aSrch03.down0());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * Srch03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Srch01_DtlR createSrch03_DtlR(){
		return mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.create();
	}

	/**
	 * Srch03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> createSrch03_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
	}
	protected MSBEL_PlReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL1750_Chk01_INFO;
		this.aChk01 = ((MSBEL_PlReg)this).new Chk01();
	}

	public static MSBEL_PlReg.Chk01 crtChk01() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
	}
	protected MSBEL_PlReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL1750_Upd01_INFO;
		this.aUpd01 = ((MSBEL_PlReg)this).new Upd01();
	}

	public static MSBEL_PlReg.Upd01 crtUpd01() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
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
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
	}
	protected MSBEL_PlReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL1750_Del01_INFO;
		this.aDel01 = ((MSBEL_PlReg)this).new Del01();
	}

	public static MSBEL_PlReg.Del01 crtDel01() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR createDel01_HdrR(){
		return mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
	}

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Chk01_DtlR createDel01_DtlR(){
		return mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
	}
	protected MSBEL_PlReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBEL1750_Prnt01_INFO;
		this.aPrnt01 = ((MSBEL_PlReg)this).new Prnt01();
	}

	public static MSBEL_PlReg.Prnt01 crtPrnt01() {
		MSBEL_PlReg lgc = new MSBEL_PlReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1750.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBE.MSBEL1750.Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * パッキングリスト登録対象のインボイス情報を検索する<br>
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
		private final mcframe.serverMSBE.MSBEL1750.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1750.Srch01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL1750.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ttl_net_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_grss_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_dim</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Srch01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sim_cnd_grp_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>cntnr_nm</td></tr>
		 * 	<tr><td><br></td><td>cntnr_no_fr</td></tr>
		 * 	<tr><td><br></td><td>cntnr_no_to</td></tr>
		 * 	<tr><td><br></td><td>net_wt</td></tr>
		 * 	<tr><td><br></td><td>grss_wt</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>sum_qty</td></tr>
		 * 	<tr><td><br></td><td>pl_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * パッキングリスト情報を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> down1;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1750.Srch01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL1750.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_CndR.create();
		}

		/**
		 * Srch02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_HdrR createSrch02_HdrR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_HdrR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ttl_net_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_grss_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_dim</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Srch01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sim_cnd_grp_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>cntnr_nm</td></tr>
		 * 	<tr><td><br></td><td>cntnr_no_fr</td></tr>
		 * 	<tr><td><br></td><td>cntnr_no_to</td></tr>
		 * 	<tr><td><br></td><td>net_wt</td></tr>
		 * 	<tr><td><br></td><td>grss_wt</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>sum_qty</td></tr>
		 * 	<tr><td><br></td><td>pl_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 純重量・容積を検索する<br>
	 */
	abstract public class Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);

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
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Srch01_DtlR createSrch03_DtlR(){
			return mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.create();
		}

		/**
		 * Srch03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> createSrch03_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1750.Srch01_DtlR.class);
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
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>net_wt</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Srch01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * パッキングリスト情報の更新前チェックをする<br>
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
		private final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>pl_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>PL_d.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_no_fr</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_no_to</td></tr>
		 * 	<tr><td><br></td><td>PL_d.net_wt</td></tr>
		 * 	<tr><td><br></td><td>PL_d.grss_wt</td></tr>
		 * 	<tr><td><br></td><td>PL_d.dim</td></tr>
		 * 	<tr><td><br></td><td>PL_d.pl_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>pl_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>PL_d.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_no_fr</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_no_to</td></tr>
		 * 	<tr><td><br></td><td>PL_d.net_wt</td></tr>
		 * 	<tr><td><br></td><td>PL_d.grss_wt</td></tr>
		 * 	<tr><td><br></td><td>PL_d.dim</td></tr>
		 * 	<tr><td><br></td><td>PL_d.pl_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * パッキングリスト情報を登録・訂正する<br>
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
		private final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> up1;
		/** [Upd01_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> aUpd01_Dtl;
		/** [Upd01_Hdr]ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR aUpd01_Hdr;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL1750.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL1750.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL1750.Chk01_HdrR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL1750.Chk01_DtlR&gt; （{@link #chk01_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> chk01_up1;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR chk01_down0;
		public final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> chk01_down1;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
			aUpd01_Dtl = MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
			aUpd01_Hdr = mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBE.MSBEL1750.Chk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR>)chk01.up(1);
			chk01_down0 = (mcframe.serverMSBE.MSBEL1750.Chk01_HdrR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR>)chk01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => mcframe.serverMSBE.MSBEL1750.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBE.MSBEL1750.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, chk01_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * mcframe.serverMSBE.MSBEL1750.Chk01_HdrR（{@link #chk01_down0}）=> aUpd01_Hdr<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL1750.Chk01_DtlR&gt;（{@link #chk01_down1}）=> aUpd01_Dtl<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01(aUpd01_Hdr, aUpd01_Dtl, chk01_down0, chk01_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>pl_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>PL_d.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>PL_d.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_no_fr</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cntnr_no_to</td></tr>
		 * 	<tr><td><br></td><td>PL_d.net_wt</td></tr>
		 * 	<tr><td><br></td><td>PL_d.grss_wt</td></tr>
		 * 	<tr><td><br></td><td>PL_d.dim</td></tr>
		 * 	<tr><td><br></td><td>PL_d.pl_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>PL_d.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>PL_d.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>PL_d.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> up1() {
			return up1;
		}



		/**
		 * [Upd01_Dtl]ブロックのコンテナaUpd01_DtlLを返します。
		 *
		 * @return Upd01_DtlL
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> Upd01_Dtl() {
			return aUpd01_Dtl;
		}

		/**
		 * [Upd01_Hdr]ブロックのコンテナaUpd01_HdrRを返します。
		 *
		 * @return Upd01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR Upd01_Hdr() {
			return aUpd01_Hdr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> dest0_1, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR src_Upd01_Hdr, MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Hdr);
			up_CALL_OPE01_chk01_1(dest0_1, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("pl_immed_prnt_flg", "pl_immed_prnt_flg");
				addColumnPathMap("pl_rmrks", "pl_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR dest, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR src) {
			createMap_up_CALL_OPE01_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("PL_d.itm_cd", "PL_d.itm_cd");
				addColumnPathMap("PL_d.itm_sub1", "PL_d.itm_sub1");
				addColumnPathMap("PL_d.itm_sub2", "PL_d.itm_sub2");
				addColumnPathMap("PL_d.itm_sub3", "PL_d.itm_sub3");
				addColumnPathMap("PL_d.sundry_itm_flg", "PL_d.sundry_itm_flg");
				addColumnPathMap("PL_d.itm_nm", "PL_d.itm_nm");
				addColumnPathMap("PL_d.sno1", "PL_d.sno1");
				addColumnPathMap("PL_d.sno2", "PL_d.sno2");
				addColumnPathMap("PL_d.sno3", "PL_d.sno3");
				addColumnPathMap("PL_d.sno4", "PL_d.sno4");
				addColumnPathMap("PL_d.iv_itm_nm", "PL_d.iv_itm_nm");
				addColumnPathMap("PL_d.cntry_org_cd", "PL_d.cntry_org_cd");
				addColumnPathMap("PL_d.trd_unit_cd", "PL_d.trd_unit_cd");
				addColumnPathMap("PL_d.trd_unit_qty", "PL_d.trd_unit_qty");
				addColumnPathMap("PL_d.cntnr_cd", "PL_d.cntnr_cd");
				addColumnPathMap("PL_d.cntnr_no_fr", "PL_d.cntnr_no_fr");
				addColumnPathMap("PL_d.cntnr_no_to", "PL_d.cntnr_no_to");
				addColumnPathMap("PL_d.net_wt", "PL_d.net_wt");
				addColumnPathMap("PL_d.grss_wt", "PL_d.grss_wt");
				addColumnPathMap("PL_d.dim", "PL_d.dim");
				addColumnPathMap("PL_d.pl_d_rmrks", "PL_d.pl_d_rmrks");
				addColumnPathMap("PL_d.cst_po_no", "PL_d.cst_po_no");
				addColumnPathMap("PL_d.cst_po_d_no", "PL_d.cst_po_d_no");
				addColumnPathMap("PL_d.cst_itm_cd", "PL_d.cst_itm_cd");
				addColumnPathMap("PL_d.cst_itm_nm", "PL_d.cst_itm_nm");
				addColumnPathMap("PL_d.intr_d_rmrks", "PL_d.intr_d_rmrks");
				addColumnPathMap("PL_d.sub_char1", "PL_d.sub_char1");
				addColumnPathMap("PL_d.sub_char2", "PL_d.sub_char2");
				addColumnPathMap("PL_d.sub_char3", "PL_d.sub_char3");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_1(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_1(MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_1();
			for(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR dest_Upd01_Hdr, MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> dest_Upd01_Dtl, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR src0_0, MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> src0_1){
			down_CALL_OPE01_chk01_0(dest_Upd01_Hdr, src0_0);
			down_CALL_OPE01_chk01_1(dest_Upd01_Dtl, src0_1);
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("pl_immed_prnt_flg", "pl_immed_prnt_flg");
				addColumnPathMap("pl_rmrks", "pl_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_rev", "iv_rev");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE01_chk01_0(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR r_dest, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR r_src) {
			createMap_down_CALL_OPE01_chk01_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("PL_d.itm_cd", "PL_d.itm_cd");
				addColumnPathMap("PL_d.itm_sub1", "PL_d.itm_sub1");
				addColumnPathMap("PL_d.itm_sub2", "PL_d.itm_sub2");
				addColumnPathMap("PL_d.itm_sub3", "PL_d.itm_sub3");
				addColumnPathMap("PL_d.sundry_itm_flg", "PL_d.sundry_itm_flg");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("PL_d.itm_nm", "PL_d.itm_nm");
				addColumnPathMap("PL_d.sno1", "PL_d.sno1");
				addColumnPathMap("PL_d.sno2", "PL_d.sno2");
				addColumnPathMap("PL_d.sno3", "PL_d.sno3");
				addColumnPathMap("PL_d.sno4", "PL_d.sno4");
				addColumnPathMap("PL_d.iv_itm_nm", "PL_d.iv_itm_nm");
				addColumnPathMap("PL_d.cntry_org_cd", "PL_d.cntry_org_cd");
				addColumnPathMap("PL_d.trd_unit_cd", "PL_d.trd_unit_cd");
				addColumnPathMap("PL_d.trd_unit_qty", "PL_d.trd_unit_qty");
				addColumnPathMap("PL_d.cntnr_cd", "PL_d.cntnr_cd");
				addColumnPathMap("PL_d.cntnr_no_fr", "PL_d.cntnr_no_fr");
				addColumnPathMap("PL_d.cntnr_no_to", "PL_d.cntnr_no_to");
				addColumnPathMap("PL_d.net_wt", "PL_d.net_wt");
				addColumnPathMap("PL_d.grss_wt", "PL_d.grss_wt");
				addColumnPathMap("PL_d.dim", "PL_d.dim");
				addColumnPathMap("PL_d.pl_d_rmrks", "PL_d.pl_d_rmrks");
				addColumnPathMap("PL_d.cst_po_no", "PL_d.cst_po_no");
				addColumnPathMap("PL_d.cst_po_d_no", "PL_d.cst_po_d_no");
				addColumnPathMap("PL_d.cst_itm_cd", "PL_d.cst_itm_cd");
				addColumnPathMap("PL_d.cst_itm_nm", "PL_d.cst_itm_nm");
				addColumnPathMap("PL_d.intr_d_rmrks", "PL_d.intr_d_rmrks");
				addColumnPathMap("PL_d.sub_char1", "PL_d.sub_char1");
				addColumnPathMap("PL_d.sub_char2", "PL_d.sub_char2");
				addColumnPathMap("PL_d.sub_char3", "PL_d.sub_char3");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE01_chk01_1(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE01_chk01_1(MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE01_chk01_1();
			for(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL1750.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE01_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * パッキングリスト情報を取り消す。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR up0;
		/** [Del01_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> aDel01_Dtl;
		/** [Del01_Hdr]ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR aDel01_Hdr;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL1750.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL1750.Chk01_HdrR （{@link #chk01_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR chk01_up0;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL1750.Chk01_HdrR chk01_down0;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
			aDel01_Dtl = MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
			aDel01_Hdr = mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBE.MSBEL1750.MSBEL_PlReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBE.MSBEL1750.Chk01_HdrR)chk01.up(0);
			chk01_down0 = (mcframe.serverMSBE.MSBEL1750.Chk01_HdrR)chk01.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => mcframe.serverMSBE.MSBEL1750.Chk01_HdrR （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * mcframe.serverMSBE.MSBEL1750.Chk01_HdrR（{@link #chk01_down0}）=> aDel01_Hdr<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01(aDel01_Hdr, chk01_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR createDel01_HdrR(){
			return mcframe.serverMSBE.MSBEL1750.Chk01_HdrR.create();
		}

		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_DtlR createDel01_DtlR(){
			return mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1750.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR up0() {
			return up0;
		}



		/**
		 * [Del01_Dtl]ブロックのコンテナaDel01_DtlLを返します。
		 *
		 * @return Del01_DtlL
		 */
		public MCList<mcframe.serverMSBE.MSBEL1750.Chk01_DtlR> Del01_Dtl() {
			return aDel01_Dtl;
		}

		/**
		 * [Del01_Hdr]ブロックのコンテナaDel01_HdrRを返します。
		 *
		 * @return Del01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1750.Chk01_HdrR Del01_Hdr() {
			return aDel01_Hdr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR dest0_0, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR src_Del01_Hdr){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Hdr);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR dest, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR src) {
			createMap_up_CALL_OPE01_chk01_0().copy(dest, src);
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR dest_Del01_Hdr, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR src0_0){
			down_CALL_OPE01_chk01_0(dest_Del01_Hdr, src0_0);
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_rev", "iv_rev");
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE01_chk01_0(mcframe.serverMSBE.MSBEL1750.Chk01_HdrR r_dest, mcframe.serverMSBE.MSBEL1750.Chk01_HdrR r_src) {
			createMap_down_CALL_OPE01_chk01_0().copy(r_dest, r_src);
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * パッキングリストを発行する<br>
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
		private final mcframe.serverMSBE.MSBEL1750.Prnt01_CndR up0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1750.Prnt01_CndR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_PlReg)MSBEL_PlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1750.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBE.MSBEL1750.Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1750.Prnt01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1750.Prnt01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_PlReg)MSBEL_PlReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}