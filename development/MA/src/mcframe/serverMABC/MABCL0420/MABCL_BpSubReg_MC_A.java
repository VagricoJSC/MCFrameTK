package mcframe.serverMABC.MABCL0420;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_BpSubReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_BpSubReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0420";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_BpSubReg.BpSub_UpdChk01 aBpSub_UpdChk01;

	protected void initBpSub_UpdChk01() {
		this.info = PDef.MA_MABCL0420_BpSub_UpdChk01_INFO;
		this.aBpSub_UpdChk01 = ((MABCL_BpSubReg)this).new BpSub_UpdChk01();
	}

	public static MABCL_BpSubReg.BpSub_UpdChk01 crtBpSub_UpdChk01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
		lgc.initBpSub_UpdChk01();
		return lgc.aBpSub_UpdChk01;
	}

	protected void paramBpSub_UpdChk01(MCParam p) {
		if (this.aBpSub_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpSub_UpdChk01.up0());
	}

	protected void doBpSub_UpdChk01() {
		aBpSub_UpdChk01.call();
	};

	/**
	 * BpSub_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createBpSub_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
	}

	/**
	 * BpSub_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createBpSub_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
	}
	protected MABCL_BpSubReg.BpSub_Upd01 aBpSub_Upd01;

	protected void initBpSub_Upd01() {
		this.info = PDef.MA_MABCL0420_BpSub_Upd01_INFO;
		this.aBpSub_Upd01 = ((MABCL_BpSubReg)this).new BpSub_Upd01();
	}

	public static MABCL_BpSubReg.BpSub_Upd01 crtBpSub_Upd01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
		lgc.initBpSub_Upd01();
		return lgc.aBpSub_Upd01;
	}

	protected void paramBpSub_Upd01(MCParam p) {
		if (this.aBpSub_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpSub_Upd01.up0());
	}

	protected void doBpSub_Upd01() {
		aBpSub_Upd01.call();
	};

	/**
	 * BpSub_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createBpSub_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
	}

	/**
	 * BpSub_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createBpSub_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
	}
	protected MABCL_BpSubReg.BpSub_DelChk01 aBpSub_DelChk01;

	protected void initBpSub_DelChk01() {
		this.info = PDef.MA_MABCL0420_BpSub_DelChk01_INFO;
		this.aBpSub_DelChk01 = ((MABCL_BpSubReg)this).new BpSub_DelChk01();
	}

	public static MABCL_BpSubReg.BpSub_DelChk01 crtBpSub_DelChk01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
		lgc.initBpSub_DelChk01();
		return lgc.aBpSub_DelChk01;
	}

	protected void paramBpSub_DelChk01(MCParam p) {
		if (this.aBpSub_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpSub_DelChk01.up0());
	}

	protected void doBpSub_DelChk01() {
		aBpSub_DelChk01.call();
	};

	/**
	 * BpSub_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR createBpSub_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.create();
	}

	/**
	 * BpSub_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> createBpSub_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);
	}
	protected MABCL_BpSubReg.BpSub_Del01 aBpSub_Del01;

	protected void initBpSub_Del01() {
		this.info = PDef.MA_MABCL0420_BpSub_Del01_INFO;
		this.aBpSub_Del01 = ((MABCL_BpSubReg)this).new BpSub_Del01();
	}

	public static MABCL_BpSubReg.BpSub_Del01 crtBpSub_Del01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
		lgc.initBpSub_Del01();
		return lgc.aBpSub_Del01;
	}

	protected void paramBpSub_Del01(MCParam p) {
		if (this.aBpSub_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpSub_Del01.up0());
	}

	protected void doBpSub_Del01() {
		aBpSub_Del01.call();
	};

	/**
	 * BpSub_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR createBpSub_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.create();
	}

	/**
	 * BpSub_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> createBpSub_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);
	}
	protected MABCL_BpSubReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0420_Srch01_INFO;
		this.aSrch01 = ((MABCL_BpSubReg)this).new Srch01();
	}

	public static MABCL_BpSubReg.Srch01 crtSrch01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
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
	public mcframe.serverMABC.MABCL0420.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0420.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0420.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.Srch01_RsltR.class);
	}
	protected MABCL_BpSubReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MA_MABCL0420_Sprt01_INFO;
		this.aSprt01 = ((MABCL_BpSubReg)this).new Sprt01();
	}

	public static MABCL_BpSubReg.Sprt01 crtSprt01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
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
	public mcframe.serverMABC.MABCL0420.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMABC.MABCL0420.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.Sprt01_DtlR.class);
	}
	protected MABCL_BpSubReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0420_Upd01_INFO;
		this.aUpd01 = ((MABCL_BpSubReg)this).new Upd01();
	}

	public static MABCL_BpSubReg.Upd01 crtUpd01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
	}
	protected MABCL_BpSubReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0420_Del01_INFO;
		this.aDel01 = ((MABCL_BpSubReg)this).new Del01();
	}

	public static MABCL_BpSubReg.Del01 crtDel01() {
		MABCL_BpSubReg lgc = new MABCL_BpSubReg();
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
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BpSub_UpdChk01オペレーション.<p>
	 *
	 * 取引先補助マスタを登録する前のチェックを行う<br>
	 */
	abstract public class BpSub_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpSub_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpSub_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);

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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpSub_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createBpSub_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
		}

		/**
		 * BpSub_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createBpSub_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}


	}
	/**
	 * BpSub_Upd01オペレーション.<p>
	 *
	 * 取引先補助マスタを登録する<br>
	 */
	abstract public class BpSub_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpSub_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_SUB_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_SUB_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpSub_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_SUB_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_SUB_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_SUB_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_SUB_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpSub_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createBpSub_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
		}

		/**
		 * BpSub_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createBpSub_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_SUB_R> dest0_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src_BpSub_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpSub_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_SUB_R r_dest, mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src : src){
				MAM_BP_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_SUB_R> dest0_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src_BpSub_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpSub_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_SUB_R r_dest, mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src : src){
				MAM_BP_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * BpSub_DelChk01オペレーション.<p>
	 *
	 * 取引先補助マスタを削除する前のチェックを行う<br>
	 */
	abstract public class BpSub_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpSub_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpSub_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);

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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpSub_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR createBpSub_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.create();
		}

		/**
		 * BpSub_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> createBpSub_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}


	}
	/**
	 * BpSub_Del01オペレーション.<p>
	 *
	 * 取引先補助マスタを削除する<br>
	 */
	abstract public class BpSub_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpSub_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_BP_SUB_R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpSub_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_BP_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_BP_SUB_R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpSub_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR createBpSub_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.create();
		}

		/**
		 * BpSub_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> createBpSub_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_SUB_R> dest0_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> src_BpSub_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_BpSub_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_BP_SUB_R r_dest, mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_BP_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_src : src){
				MAM_BP_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0420.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BP_SUB_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0420.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0420.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_BP_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_BP_SUB_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_BP_SUB_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0420.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0420.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>new_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_abl_only_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0420.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0420.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_BP_SUB_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_nm1", "sls_anly_nm1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_nm2", "sls_anly_nm2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("sls_anly_nm3", "sls_anly_nm3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bcst_dpt_nm", "bcst_dpt_nm");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("vmi_purc_dpt_nm", "vmi_purc_dpt_nm");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("pay_dpt_nm", "pay_dpt_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0420.Srch01_RsltR r_dest, MAM_BP_SUB_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0420.Srch01_RsltR> dest, MCList<MAM_BP_SUB_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_BP_SUB_R r_src : src){
				mcframe.serverMABC.MABCL0420.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLStEndDupChecker {
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
		private final MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> down0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_SUB_R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMABC.MABCL0420.Sprt01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_SUB_R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMABC.MABCL0420.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_SUB_R> dest0_0, MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> src_Sprt01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Sprt01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_nm1", "sls_anly_nm1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_nm2", "sls_anly_nm2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("sls_anly_nm3", "sls_anly_nm3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bcst_dpt_nm", "bcst_dpt_nm");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("vmi_purc_dpt_nm", "vmi_purc_dpt_nm");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("pay_dpt_nm", "pay_dpt_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_SUB_R r_dest, mcframe.serverMABC.MABCL0420.Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0420.Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0420.Sprt01_DtlR r_src : src){
				MAM_BP_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
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
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.crtBpSub_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.crtBpSub_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0420.BpSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
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
		private final MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.BpSub_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.crtBpSub_DelChk01();
			del01 = mcframe.serverMABC.MABCL0420.MABCL_BpSubReg.crtBpSub_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
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
			invoke((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpSubReg)MABCL_BpSubReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> src_Del01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0420.BpSub_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}