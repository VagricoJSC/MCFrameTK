package mcframe.serverMGBD.MGBDL0530;

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
 * "MGBDL_BomLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_BomLst_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDL0530";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_BomLst.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBDL0530_Srch01_INFO;
		this.aSrch01 = ((MGBDL_BomLst)this).new Srch01();
	}

	public static MGBDL_BomLst.Srch01 crtSrch01() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
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
	public mcframe.serverMGBD.MGBDL0530.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBD.MGBDL0530.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Srch01_RsltR.class);
	}
	protected MGBDL_BomLst.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBDL0530_Chk01_INFO;
		this.aChk01 = ((MGBDL_BomLst)this).new Chk01();
	}

	public static MGBDL_BomLst.Chk01 crtChk01() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
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
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
	}

	/**
	 * Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR createChk01_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
	}
	protected MGBDL_BomLst.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBDL0530_Chk02_INFO;
		this.aChk02 = ((MGBDL_BomLst)this).new Chk02();
	}

	public static MGBDL_BomLst.Chk02 crtChk02() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
		p.addDownBlock(aChk02.down0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);
	}

	/**
	 * Chk02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR createChk02_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR.create();
	}
	protected MGBDL_BomLst.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MG_MGBDL0530_Chk03_INFO;
		this.aChk03 = ((MGBDL_BomLst)this).new Chk03();
	}

	public static MGBDL_BomLst.Chk03 crtChk03() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addUpBlock(aChk03.up1());
		p.addUpBlock(aChk03.up2());
		p.addDownBlock(aChk03.down0());
		p.addDownBlock(aChk03.down1());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk03_CndR createChk03_CndR(){
		return mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
	}

	/**
	 * Chk03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk03_RsltR createChk03_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.create();
	}

	/**
	 * Chk03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> createChk03_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);
	}

	/**
	 * Chk03_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR createChk03_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR.create();
	}
	protected MGBDL_BomLst.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBDL0530_Upd01_INFO;
		this.aUpd01 = ((MGBDL_BomLst)this).new Upd01();
	}

	public static MGBDL_BomLst.Upd01 crtUpd01() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
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
	public mcframe.serverMGBD.MGBDL0530.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
	}

	/**
	 * Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR createUpd01_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
	}
	protected MGBDL_BomLst.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBDL0530_Del01_INFO;
		this.aDel01 = ((MGBDL_BomLst)this).new Del01();
	}

	public static MGBDL_BomLst.Del01 crtDel01() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
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
	public mcframe.serverMGBD.MGBDL0530.Chk02_RsltR createDel01_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);
	}

	/**
	 * Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR createDel01_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR.create();
	}
	protected MGBDL_BomLst.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MG_MGBDL0530_Imp01_INFO;
		this.aImp01 = ((MGBDL_BomLst)this).new Imp01();
	}

	public static MGBDL_BomLst.Imp01 crtImp01() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
		lgc.initImp01();
		return lgc.aImp01;
	}

	protected void paramImp01(MCParam p) {
		if (this.aImp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp01.up0());
		p.addUpBlock(aImp01.up1());
		p.addDownBlock(aImp01.down0());
	}

	protected void doImp01() {
		aImp01.call();
	};

	/**
	 * Imp01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk01_RsltR createImp01_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.create();
	}

	/**
	 * Imp01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> createImp01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
	}

	/**
	 * Imp01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR createImp01_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
	}
	protected MGBDL_BomLst.Cnv01 aCnv01;

	protected void initCnv01() {
		this.info = PDef.MG_MGBDL0530_Cnv01_INFO;
		this.aCnv01 = ((MGBDL_BomLst)this).new Cnv01();
	}

	public static MGBDL_BomLst.Cnv01 crtCnv01() {
		MGBDL_BomLst lgc = new MGBDL_BomLst();
		lgc.initCnv01();
		return lgc.aCnv01;
	}

	protected void paramCnv01(MCParam p) {
		if (this.aCnv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCnv01.up0());
		p.addUpBlock(aCnv01.up1());
		p.addUpBlock(aCnv01.up2());
		p.addDownBlock(aCnv01.down0());
	}

	protected void doCnv01() {
		aCnv01.call();
	};

	/**
	 * Cnv01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk03_CndR createCnv01_CndR(){
		return mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
	}

	/**
	 * Cnv01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk03_RsltR createCnv01_RsltR(){
		return mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.create();
	}

	/**
	 * Cnv01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> createCnv01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);
	}

	/**
	 * Cnv01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR createCnv01_CtrlR(){
		return mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0530.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0530.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Srch01_RsltR.class);

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
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBD.MGBDL0530.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>no_alt_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>expns_cd</td></tr>
		 * 	<tr><td><br></td><td>expns_nm</td></tr>
		 * 	<tr><td><br></td><td>no_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>off_non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>on_non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Srch01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0530.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>par_dec_place</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>expns_cd</td></tr>
		 * 	<tr><td><br></td><td>expns_nm</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>non_calc_flg</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録・訂正する前のチェックを行う<br>
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
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
			up1 = mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);

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
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
		}

		/**
		 * Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR createChk01_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>par_dec_place</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>expns_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 削除する前のチェックを行う<br>
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
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);
			up1 = mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);

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
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);
		}

		/**
		 * Chk02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR createChk02_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 置換する前のチェックを行う<br>
	 */
	abstract public class Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk03_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk03_CndR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> down1;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);
			up2 = mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR.create();
			down0 = mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
			down1 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CndR createChk03_CndR(){
			return mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
		}

		/**
		 * Chk03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_RsltR createChk03_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.create();
		}

		/**
		 * Chk03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> createChk03_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);
		}

		/**
		 * Chk03_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR createChk03_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk03_CndR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_dec_place</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk03_CndR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CndR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>new_par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>new_par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>new_par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>new_par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>new_chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>new_chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>new_chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>new_chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>new_bom_ptn</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録・訂正処理をする<br>
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
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
			up1 = mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);

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
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
		}

		/**
		 * Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR createUpd01_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR up1() {
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
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
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
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);
			up1 = mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);

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
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk02_RsltR createDel01_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk02_RsltR.class);
		}

		/**
		 * Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR createDel01_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk02_CtrlR up1() {
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
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル入力処理をする<br>
	 */
	abstract public class Imp01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Imp01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
			up1 = mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);

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
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_RsltR createImp01_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.create();
		}

		/**
		 * Imp01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> createImp01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk01_RsltR.class);
		}

		/**
		 * Imp01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR createImp01_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>par_dec_place</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>expns_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Cnv01オペレーション.<p>
	 *
	 * 置換処理をする<br>
	 */
	abstract public class Cnv01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cnv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk03_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> down0;
		
		
		// コンストラクタ
		protected Cnv01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);
			up2 = mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_BomLst)MGBDL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Cnv01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CndR createCnv01_CndR(){
			return mcframe.serverMGBD.MGBDL0530.Chk03_CndR.create();
		}

		/**
		 * Cnv01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_RsltR createCnv01_RsltR(){
			return mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.create();
		}

		/**
		 * Cnv01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> createCnv01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0530.Chk03_RsltR.class);
		}

		/**
		 * Cnv01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR createCnv01_CtrlR(){
			return mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk03_CndR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.term</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dbc.par_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_min_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.chd_batch_qty</td></tr>
		 * 	<tr><td><br></td><td>dbc.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>dbc.rmrks</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dbc.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dbc.non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dbc.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR
		 */
		public mcframe.serverMGBD.MGBDL0530.Chk03_CtrlR up2() {
			return up2;
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
		public MCList<mcframe.serverMGBD.MGBDL0530.Chk03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_BomLst)MGBDL_BomLst_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}