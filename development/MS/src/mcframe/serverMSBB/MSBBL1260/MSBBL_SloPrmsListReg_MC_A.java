package mcframe.serverMSBB.MSBBL1260;

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
 * "MSBBL_SloPrmsListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SloPrmsListReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL1260";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SloPrmsListReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1260_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SloPrmsListReg)this).new Srch01();
	}

	public static MSBBL_SloPrmsListReg.Srch01 crtSrch01() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
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
	public mcframe.serverMSBB.MSBBL1260.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBB.MSBBL1260.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.class);
	}
	protected MSBBL_SloPrmsListReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBBL1260_Srch02_INFO;
		this.aSrch02 = ((MSBBL_SloPrmsListReg)this).new Srch02();
	}

	public static MSBBL_SloPrmsListReg.Srch02 crtSrch02() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
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
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBB.MSBBL1260.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Srch01_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.class);
	}
	protected MSBBL_SloPrmsListReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBBL1260_Chk01_INFO;
		this.aChk01 = ((MSBBL_SloPrmsListReg)this).new Chk01();
	}

	public static MSBBL_SloPrmsListReg.Chk01 crtChk01() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
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
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
	}

	/**
	 * Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Chk01_CndR createChk01_CndR(){
		return mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
	}
	protected MSBBL_SloPrmsListReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBBL1260_Upd01_INFO;
		this.aUpd01 = ((MSBBL_SloPrmsListReg)this).new Upd01();
	}

	public static MSBBL_SloPrmsListReg.Upd01 crtUpd01() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
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
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Chk01_CndR createUpd01_CndR(){
		return mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
	}
	protected MSBBL_SloPrmsListReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBBL1260_Del01_INFO;
		this.aDel01 = ((MSBBL_SloPrmsListReg)this).new Del01();
	}

	public static MSBBL_SloPrmsListReg.Del01 crtDel01() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Chk01_RsltR createDel01_RsltR(){
		return mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
	}

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Chk01_CndR createDel01_CndR(){
		return mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
	}
	protected MSBBL_SloPrmsListReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBBL1260_Prnt01_INFO;
		this.aPrnt01 = ((MSBBL_SloPrmsListReg)this).new Prnt01();
	}

	public static MSBBL_SloPrmsListReg.Prnt01 crtPrnt01() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
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
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR.class);
	}

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1260.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBB.MSBBL1260.Prnt01_CndR.create();
	}
	protected MSBBL_SloPrmsListReg.RevUpd01 aRevUpd01;

	protected void initRevUpd01() {
		this.info = PDef.MS_MSBBL1260_RevUpd01_INFO;
		this.aRevUpd01 = ((MSBBL_SloPrmsListReg)this).new RevUpd01();
	}

	public static MSBBL_SloPrmsListReg.RevUpd01 crtRevUpd01() {
		MSBBL_SloPrmsListReg lgc = new MSBBL_SloPrmsListReg();
		lgc.initRevUpd01();
		return lgc.aRevUpd01;
	}

	protected void paramRevUpd01(MCParam p) {
		if (this.aRevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRevUpd01.up0());
	}

	protected void doRevUpd01() {
		aRevUpd01.call();
	};

	/**
	 * RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷予定を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1260.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1260.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.class);

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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBB.MSBBL1260.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_not_prnted</td></tr>
		 * 	<tr><td><br></td><td>prms_prnted</td></tr>
		 * 	<tr><td><br></td><td>slo_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>slo_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm_to</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_hm_to</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_hm_to</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>prms_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>prms_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>prms_dt_to</td></tr>
		 * 	<tr><td><br></td><td>prms_hm_to</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1260.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_send_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>after_exec_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 納期回答を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1260.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1260.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.class);

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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBB.MSBBL1260.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Srch01_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1260.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_not_prnted</td></tr>
		 * 	<tr><td><br></td><td>prms_prnted</td></tr>
		 * 	<tr><td><br></td><td>slo_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>slo_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm_to</td></tr>
		 * 	<tr><td><br></td><td>prms_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>prms_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>prms_dt_to</td></tr>
		 * 	<tr><td><br></td><td>prms_hm_to</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>incl_can_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1260.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_send_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
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
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>after_exec_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行います。<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Chk01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Chk01_CndR down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
			down1 = mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();

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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
		}

		/**
		 * Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR createChk01_CndR(){
			return mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1260.Chk01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>re_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1260.Chk01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納期回答を訂正する<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Chk01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> down0;
		/** [Upd01_Cnd]ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Chk01_CndR aUpd01_Cnd;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMSBB.MSBBL1260.Chk01_CndR （{@link #chk01_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt; （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス mcframe.serverMSBB.MSBBL1260.Chk01_CndR （{@link #chk01_down1}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> chk01_up0;
		public final mcframe.serverMSBB.MSBBL1260.Chk01_CndR chk01_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> chk01_down0;
		public final mcframe.serverMSBB.MSBBL1260.Chk01_CndR chk01_down1;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
			aUpd01_Cnd = mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR>)chk01.up(0);
			chk01_up1 = (mcframe.serverMSBB.MSBBL1260.Chk01_CndR)chk01.up(1);
			chk01_down0 = (MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR>)chk01.down(0);
			chk01_down1 = (mcframe.serverMSBB.MSBBL1260.Chk01_CndR)chk01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt; （{@link #chk01_up0}）<br>
		 * up1() => mcframe.serverMSBB.MSBBL1260.Chk01_CndR （{@link #chk01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, chk01_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt;（{@link #chk01_down0}）=> down0()<br>
		 * mcframe.serverMSBB.MSBBL1260.Chk01_CndR（{@link #chk01_down1}）=> aUpd01_Cnd<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), aUpd01_Cnd, chk01_down0, chk01_down1);
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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR createUpd01_CndR(){
			return mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1260.Chk01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Upd01_Cnd]ブロックのコンテナaUpd01_CndRを返します。
		 *
		 * @return Upd01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR Upd01_Cnd() {
			return aUpd01_Cnd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest0_0, mcframe.serverMSBB.MSBBL1260.Chk01_CndR dest0_1, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src_Upd01_Rslt, mcframe.serverMSBB.MSBBL1260.Chk01_CndR src_Upd01_Cnd){
			up_CALL_OPE_chk01_0(dest0_0, src_Upd01_Rslt);
			up_CALL_OPE_chk01_1(dest0_1, src_Upd01_Cnd);
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
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_prms_qty", "trd_unit_prms_qty");
				addColumnPathMap("ship_rqst_tm", "ship_rqst_tm");
				addColumnPathMap("pd_inst_dlv_tm", "pd_inst_dlv_tm");
				addColumnPathMap("ship_schd_tm", "ship_schd_tm");
				addColumnPathMap("dlv_schd_tm", "dlv_schd_tm");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("org_slo_prms_h_no", "org_slo_prms_h_no");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("slo_prms_rev", "slo_prms_rev");
				addColumnPathMap("prms_dlv_tm", "prms_dlv_tm");
				addColumnPathMap("prms_prnt_tm", "prms_prnt_tm");
				addColumnPathMap("last_prms_rev", "last_prms_rev");
				addColumnPathMap("slo_prms_prnt_flg", "slo_prms_prnt_flg");
				addColumnPathMap("prms_rmrks", "prms_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("edi_prms_flg", "edi_prms_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("slo_prms_data_crud_typ", "slo_prms_data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest, mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_0(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_0();
			for(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("indiv_prnt_flg", "indiv_prnt_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1260.Chk01_CndR dest, mcframe.serverMSBB.MSBBL1260.Chk01_CndR src) {
			createMap_up_CALL_OPE_chk01_1().copy(dest, src);
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest_Upd01_Rslt, mcframe.serverMSBB.MSBBL1260.Chk01_CndR dest_Upd01_Cnd, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src0_0, mcframe.serverMSBB.MSBBL1260.Chk01_CndR src0_1){
			down_CALL_OPE_chk01_0(dest_Upd01_Rslt, src0_0);
			down_CALL_OPE_chk01_1(dest_Upd01_Cnd, src0_1);
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
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_prms_qty", "trd_unit_prms_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("ship_rqst_tm", "ship_rqst_tm");
				addColumnPathMap("pd_inst_dlv_tm", "pd_inst_dlv_tm");
				addColumnPathMap("ship_schd_tm", "ship_schd_tm");
				addColumnPathMap("dlv_schd_tm", "dlv_schd_tm");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("org_slo_prms_h_no", "org_slo_prms_h_no");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("slo_prms_rev", "slo_prms_rev");
				addColumnPathMap("prms_dlv_tm", "prms_dlv_tm");
				addColumnPathMap("prms_prnt_tm", "prms_prnt_tm");
				addColumnPathMap("last_prms_rev", "last_prms_rev");
				addColumnPathMap("slo_prms_prnt_flg", "slo_prms_prnt_flg");
				addColumnPathMap("prms_rmrks", "prms_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("edi_prms_flg", "edi_prms_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("fix_flg", "fix_flg");
				addColumnPathMap("re_ship_schd_flg", "re_ship_schd_flg");
				addColumnPathMap("ship_block_flg", "ship_block_flg");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("ship_cnt_rmrks", "ship_cnt_rmrks");
				addColumnPathMap("not_dt_calc_flg", "not_dt_calc_flg");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_lg_grp_cd", "dlv_lg_grp_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("tdlv_sundry_flg", "tdlv_sundry_flg");
				addColumnPathMap("tdlv_nm", "tdlv_nm");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_cntct_dpt", "tdlv_cntct_dpt");
				addColumnPathMap("tdlv_cntct_psn", "tdlv_cntct_psn");
				addColumnPathMap("tdlv_zip_cd", "tdlv_zip_cd");
				addColumnPathMap("tdlv_addr1", "tdlv_addr1");
				addColumnPathMap("tdlv_addr2", "tdlv_addr2");
				addColumnPathMap("tdlv_addr3", "tdlv_addr3");
				addColumnPathMap("tdlv_addr4", "tdlv_addr4");
				addColumnPathMap("tdlv_tel", "tdlv_tel");
				addColumnPathMap("tdlv_fax", "tdlv_fax");
				addColumnPathMap("tdlv_lg_grp_cd", "tdlv_lg_grp_cd");
				addColumnPathMap("dlv_day_week_typ", "dlv_day_week_typ");
				addColumnPathMap("ship_schd_sub_char1", "ship_schd_sub_char1");
				addColumnPathMap("ship_schd_sub_char2", "ship_schd_sub_char2");
				addColumnPathMap("ship_schd_sub_char3", "ship_schd_sub_char3");
				addColumnPathMap("slo_prms_data_crud_typ", "slo_prms_data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest, mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_0(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_0();
			for(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("indiv_prnt_flg", "indiv_prnt_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1260.Chk01_CndR r_dest, mcframe.serverMSBB.MSBBL1260.Chk01_CndR r_src) {
			createMap_down_CALL_OPE_chk01_1().copy(r_dest, r_src);
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 納期回答を取り消す<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Chk01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> down0;
		/** [Del01_Cnd]ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Chk01_CndR aDel01_Cnd;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMSBB.MSBBL1260.Chk01_CndR （{@link #chk01_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt; （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス mcframe.serverMSBB.MSBBL1260.Chk01_CndR （{@link #chk01_down1}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> chk01_up0;
		public final mcframe.serverMSBB.MSBBL1260.Chk01_CndR chk01_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> chk01_down0;
		public final mcframe.serverMSBB.MSBBL1260.Chk01_CndR chk01_down1;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
			aDel01_Cnd = mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1260.MSBBL_SloPrmsListReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR>)chk01.up(0);
			chk01_up1 = (mcframe.serverMSBB.MSBBL1260.Chk01_CndR)chk01.up(1);
			chk01_down0 = (MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR>)chk01.down(0);
			chk01_down1 = (mcframe.serverMSBB.MSBBL1260.Chk01_CndR)chk01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt; （{@link #chk01_up0}）<br>
		 * up1() => mcframe.serverMSBB.MSBBL1260.Chk01_CndR （{@link #chk01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, chk01_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1260.Chk01_RsltR&gt;（{@link #chk01_down0}）=> down0()<br>
		 * mcframe.serverMSBB.MSBBL1260.Chk01_CndR（{@link #chk01_down1}）=> aDel01_Cnd<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), aDel01_Cnd, chk01_down0, chk01_down1);
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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_RsltR createDel01_RsltR(){
			return mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR.class);
		}

		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR createDel01_CndR(){
			return mcframe.serverMSBB.MSBBL1260.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1260.Chk01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Del01_Cnd]ブロックのコンテナaDel01_CndRを返します。
		 *
		 * @return Del01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Chk01_CndR Del01_Cnd() {
			return aDel01_Cnd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest0_0, mcframe.serverMSBB.MSBBL1260.Chk01_CndR dest0_1, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src_Del01_Rslt, mcframe.serverMSBB.MSBBL1260.Chk01_CndR src_Del01_Cnd){
			up_CALL_OPE_chk01_0(dest0_0, src_Del01_Rslt);
			up_CALL_OPE_chk01_1(dest0_1, src_Del01_Cnd);
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
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_prms_qty", "trd_unit_prms_qty");
				addColumnPathMap("ship_rqst_tm", "ship_rqst_tm");
				addColumnPathMap("pd_inst_dlv_tm", "pd_inst_dlv_tm");
				addColumnPathMap("ship_schd_tm", "ship_schd_tm");
				addColumnPathMap("dlv_schd_tm", "dlv_schd_tm");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("org_slo_prms_h_no", "org_slo_prms_h_no");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("slo_prms_rev", "slo_prms_rev");
				addColumnPathMap("prms_dlv_tm", "prms_dlv_tm");
				addColumnPathMap("prms_prnt_tm", "prms_prnt_tm");
				addColumnPathMap("last_prms_rev", "last_prms_rev");
				addColumnPathMap("slo_prms_prnt_flg", "slo_prms_prnt_flg");
				addColumnPathMap("prms_rmrks", "prms_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("edi_prms_flg", "edi_prms_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("slo_prms_data_crud_typ", "slo_prms_data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest, mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_0(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_0();
			for(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("indiv_prnt_flg", "indiv_prnt_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1260.Chk01_CndR dest, mcframe.serverMSBB.MSBBL1260.Chk01_CndR src) {
			createMap_up_CALL_OPE_chk01_1().copy(dest, src);
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest_Del01_Rslt, mcframe.serverMSBB.MSBBL1260.Chk01_CndR dest_Del01_Cnd, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src0_0, mcframe.serverMSBB.MSBBL1260.Chk01_CndR src0_1){
			down_CALL_OPE_chk01_0(dest_Del01_Rslt, src0_0);
			down_CALL_OPE_chk01_1(dest_Del01_Cnd, src0_1);
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
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_prms_qty", "trd_unit_prms_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("ship_rqst_tm", "ship_rqst_tm");
				addColumnPathMap("pd_inst_dlv_tm", "pd_inst_dlv_tm");
				addColumnPathMap("ship_schd_tm", "ship_schd_tm");
				addColumnPathMap("dlv_schd_tm", "dlv_schd_tm");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("org_slo_prms_h_no", "org_slo_prms_h_no");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("slo_prms_rev", "slo_prms_rev");
				addColumnPathMap("prms_dlv_tm", "prms_dlv_tm");
				addColumnPathMap("prms_prnt_tm", "prms_prnt_tm");
				addColumnPathMap("last_prms_rev", "last_prms_rev");
				addColumnPathMap("slo_prms_prnt_flg", "slo_prms_prnt_flg");
				addColumnPathMap("prms_rmrks", "prms_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("edi_prms_flg", "edi_prms_flg");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("fix_flg", "fix_flg");
				addColumnPathMap("re_ship_schd_flg", "re_ship_schd_flg");
				addColumnPathMap("ship_block_flg", "ship_block_flg");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("ship_cnt_rmrks", "ship_cnt_rmrks");
				addColumnPathMap("not_dt_calc_flg", "not_dt_calc_flg");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_lg_grp_cd", "dlv_lg_grp_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("tdlv_sundry_flg", "tdlv_sundry_flg");
				addColumnPathMap("tdlv_nm", "tdlv_nm");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_cntct_dpt", "tdlv_cntct_dpt");
				addColumnPathMap("tdlv_cntct_psn", "tdlv_cntct_psn");
				addColumnPathMap("tdlv_zip_cd", "tdlv_zip_cd");
				addColumnPathMap("tdlv_addr1", "tdlv_addr1");
				addColumnPathMap("tdlv_addr2", "tdlv_addr2");
				addColumnPathMap("tdlv_addr3", "tdlv_addr3");
				addColumnPathMap("tdlv_addr4", "tdlv_addr4");
				addColumnPathMap("tdlv_tel", "tdlv_tel");
				addColumnPathMap("tdlv_fax", "tdlv_fax");
				addColumnPathMap("tdlv_lg_grp_cd", "tdlv_lg_grp_cd");
				addColumnPathMap("dlv_day_week_typ", "dlv_day_week_typ");
				addColumnPathMap("ship_schd_sub_char1", "ship_schd_sub_char1");
				addColumnPathMap("ship_schd_sub_char2", "ship_schd_sub_char2");
				addColumnPathMap("ship_schd_sub_char3", "ship_schd_sub_char3");
				addColumnPathMap("slo_prms_data_crud_typ", "slo_prms_data_crud_typ");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest, mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_0(MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> dest, MCList<mcframe.serverMSBB.MSBBL1260.Chk01_RsltR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_0();
			for(mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_src : src){
				mcframe.serverMSBB.MSBBL1260.Chk01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("prnt_out_flg", "prnt_out_flg");
				addColumnPathMap("indiv_prnt_flg", "indiv_prnt_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1260.Chk01_CndR r_dest, mcframe.serverMSBB.MSBBL1260.Chk01_CndR r_src) {
			createMap_down_CALL_OPE_chk01_1().copy(r_dest, r_src);
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納期回答書を発行する。<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1260.Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR> down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1260.Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR.class);

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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR.class);
		}

		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1260.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBB.MSBBL1260.Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR> up0() {
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
		 * @see mcframe.serverMSBB.MSBBL1260.Prnt01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1260.Prnt01_CndR up1() {
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
		public MCList<mcframe.serverMSBB.MSBBL1260.Prnt01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}


	}
	/**
	 * RevUpd01オペレーション.<p>
	 *
	 * 受注納期回答改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected RevUpd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

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
			invoke((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRevUpd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloPrmsListReg)MSBBL_SloPrmsListReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}