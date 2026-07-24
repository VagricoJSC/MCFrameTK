package mcframe.serverMGBE.MGBEL0110;

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
 * "MGBEL_StdUpriFix"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBEL_StdUpriFix_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBEL0110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBEL_StdUpriFix.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBEL0110_Srch01_INFO;
		this.aSrch01 = ((MGBEL_StdUpriFix)this).new Srch01();
	}

	public static MGBEL_StdUpriFix.Srch01 crtSrch01() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
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
	public mcframe.serverMGBE.MGBEL0110.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.class);
	}
	protected MGBEL_StdUpriFix.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MG_MGBEL0110_Srch02_INFO;
		this.aSrch02 = ((MGBEL_StdUpriFix)this).new Srch02();
	}

	public static MGBEL_StdUpriFix.Srch02 crtSrch02() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
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
	public mcframe.serverMGBE.MGBEL0110.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Srch01_RsltR createSrch02_RsltR(){
		return mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.class);
	}
	protected MGBEL_StdUpriFix.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBEL0110_Chk01_INFO;
		this.aChk01 = ((MGBEL_StdUpriFix)this).new Chk01();
	}

	public static MGBEL_StdUpriFix.Chk01 crtChk01() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
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
	 * Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createChk01_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
	}

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
	}
	protected MGBEL_StdUpriFix.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBEL0110_Chk02_INFO;
		this.aChk02 = ((MGBEL_StdUpriFix)this).new Chk02();
	}

	public static MGBEL_StdUpriFix.Chk02 crtChk02() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
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
		p.addDownBlock(aChk02.down1());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createChk02_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
	}

	/**
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createChk02_RsltR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
	}
	protected MGBEL_StdUpriFix.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MG_MGBEL0110_Chk03_INFO;
		this.aChk03 = ((MGBEL_StdUpriFix)this).new Chk03();
	}

	public static MGBEL_StdUpriFix.Chk03 crtChk03() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk03_CndR createChk03_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk03_CndR.create();
	}
	protected MGBEL_StdUpriFix.Chk04 aChk04;

	protected void initChk04() {
		this.info = PDef.MG_MGBEL0110_Chk04_INFO;
		this.aChk04 = ((MGBEL_StdUpriFix)this).new Chk04();
	}

	public static MGBEL_StdUpriFix.Chk04 crtChk04() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
		lgc.initChk04();
		return lgc.aChk04;
	}

	protected void paramChk04(MCParam p) {
		if (this.aChk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk04.up0());
	}

	protected void doChk04() {
		aChk04.call();
	};

	/**
	 * Chk04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk04_CndR createChk04_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk04_CndR.create();
	}
	protected MGBEL_StdUpriFix.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBEL0110_Upd01_INFO;
		this.aUpd01 = ((MGBEL_StdUpriFix)this).new Upd01();
	}

	public static MGBEL_StdUpriFix.Upd01 crtUpd01() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
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
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createUpd01_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
	}

	/**
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
	}
	protected MGBEL_StdUpriFix.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBEL0110_Del01_INFO;
		this.aDel01 = ((MGBEL_StdUpriFix)this).new Del01();
	}

	public static MGBEL_StdUpriFix.Del01 crtDel01() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
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
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createDel01_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
	}

	/**
	 * Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createDel01_RsltR(){
		return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
	}
	protected MGBEL_StdUpriFix.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MG_MGBEL0110_Upd02_INFO;
		this.aUpd02 = ((MGBEL_StdUpriFix)this).new Upd02();
	}

	public static MGBEL_StdUpriFix.Upd02 crtUpd02() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk03_CndR createUpd02_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk03_CndR.create();
	}
	protected MGBEL_StdUpriFix.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MG_MGBEL0110_Del02_INFO;
		this.aDel02 = ((MGBEL_StdUpriFix)this).new Del02();
	}

	public static MGBEL_StdUpriFix.Del02 crtDel02() {
		MGBEL_StdUpriFix lgc = new MGBEL_StdUpriFix();
		lgc.initDel02();
		return lgc.aDel02;
	}

	protected void paramDel02(MCParam p) {
		if (this.aDel02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel02.up0());
	}

	protected void doDel02() {
		aDel02.call();
	};

	/**
	 * Del02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBE.MGBEL0110.Chk04_CndR createDel02_CndR(){
		return mcframe.serverMGBE.MGBEL0110.Chk04_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未確定の標準単価を検索する。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.class);

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dcsn_typ</td></tr>
		 * 	<tr><td><br></td><td>exclude_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>diff_flg</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Srch01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>qty_unit</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_ttl</td></tr>
		 * 	<tr><td><br></td><td>inc_per</td></tr>
		 * 	<tr><td><br></td><td>pre_ttl</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>diff_ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>inc_per_unit</td></tr>
		 * 	<tr><td><br></td><td>pre_ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>var_cost_unit</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost_unit</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 確定済の標準単価を検索する。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.class);

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Srch01_RsltR createSrch02_RsltR(){
			return mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0110.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dcsn_typ</td></tr>
		 * 	<tr><td><br></td><td>exclude_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>diff_flg</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Srch01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>qty_unit</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>diff_ttl</td></tr>
		 * 	<tr><td><br></td><td>inc_per</td></tr>
		 * 	<tr><td><br></td><td>pre_ttl</td></tr>
		 * 	<tr><td><br></td><td>ttl</td></tr>
		 * 	<tr><td><br></td><td>var_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost</td></tr>
		 * 	<tr><td><br></td><td>diff_ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>inc_per_unit</td></tr>
		 * 	<tr><td><br></td><td>pre_ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>ttl_unit</td></tr>
		 * 	<tr><td><br></td><td>var_cost_unit</td></tr>
		 * 	<tr><td><br></td><td>fxd_cost_unit</td></tr>
		 * 	<tr><td><br></td><td>col_000</td></tr>
		 * 	<tr><td><br></td><td>col_001</td></tr>
		 * 	<tr><td><br></td><td>col_002</td></tr>
		 * 	<tr><td><br></td><td>col_003</td></tr>
		 * 	<tr><td><br></td><td>col_004</td></tr>
		 * 	<tr><td><br></td><td>col_005</td></tr>
		 * 	<tr><td><br></td><td>col_006</td></tr>
		 * 	<tr><td><br></td><td>col_007</td></tr>
		 * 	<tr><td><br></td><td>col_008</td></tr>
		 * 	<tr><td><br></td><td>col_009</td></tr>
		 * 	<tr><td><br></td><td>col_010</td></tr>
		 * 	<tr><td><br></td><td>col_011</td></tr>
		 * 	<tr><td><br></td><td>col_012</td></tr>
		 * 	<tr><td><br></td><td>col_013</td></tr>
		 * 	<tr><td><br></td><td>col_014</td></tr>
		 * 	<tr><td><br></td><td>col_015</td></tr>
		 * 	<tr><td><br></td><td>col_016</td></tr>
		 * 	<tr><td><br></td><td>col_017</td></tr>
		 * 	<tr><td><br></td><td>col_018</td></tr>
		 * 	<tr><td><br></td><td>col_019</td></tr>
		 * 	<tr><td><br></td><td>col_020</td></tr>
		 * 	<tr><td><br></td><td>col_021</td></tr>
		 * 	<tr><td><br></td><td>col_022</td></tr>
		 * 	<tr><td><br></td><td>col_023</td></tr>
		 * 	<tr><td><br></td><td>col_024</td></tr>
		 * 	<tr><td><br></td><td>col_025</td></tr>
		 * 	<tr><td><br></td><td>col_026</td></tr>
		 * 	<tr><td><br></td><td>col_027</td></tr>
		 * 	<tr><td><br></td><td>col_028</td></tr>
		 * 	<tr><td><br></td><td>col_029</td></tr>
		 * 	<tr><td><br></td><td>col_030</td></tr>
		 * 	<tr><td><br></td><td>col_031</td></tr>
		 * 	<tr><td><br></td><td>col_032</td></tr>
		 * 	<tr><td><br></td><td>col_033</td></tr>
		 * 	<tr><td><br></td><td>col_034</td></tr>
		 * 	<tr><td><br></td><td>col_035</td></tr>
		 * 	<tr><td><br></td><td>col_036</td></tr>
		 * 	<tr><td><br></td><td>col_037</td></tr>
		 * 	<tr><td><br></td><td>col_038</td></tr>
		 * 	<tr><td><br></td><td>col_039</td></tr>
		 * 	<tr><td><br></td><td>col_040</td></tr>
		 * 	<tr><td><br></td><td>col_041</td></tr>
		 * 	<tr><td><br></td><td>col_042</td></tr>
		 * 	<tr><td><br></td><td>col_043</td></tr>
		 * 	<tr><td><br></td><td>col_044</td></tr>
		 * 	<tr><td><br></td><td>col_045</td></tr>
		 * 	<tr><td><br></td><td>col_046</td></tr>
		 * 	<tr><td><br></td><td>col_047</td></tr>
		 * 	<tr><td><br></td><td>col_048</td></tr>
		 * 	<tr><td><br></td><td>col_049</td></tr>
		 * 	<tr><td><br></td><td>col_050</td></tr>
		 * 	<tr><td><br></td><td>col_051</td></tr>
		 * 	<tr><td><br></td><td>col_052</td></tr>
		 * 	<tr><td><br></td><td>col_053</td></tr>
		 * 	<tr><td><br></td><td>col_054</td></tr>
		 * 	<tr><td><br></td><td>col_055</td></tr>
		 * 	<tr><td><br></td><td>col_056</td></tr>
		 * 	<tr><td><br></td><td>col_057</td></tr>
		 * 	<tr><td><br></td><td>col_058</td></tr>
		 * 	<tr><td><br></td><td>col_059</td></tr>
		 * 	<tr><td><br></td><td>col_060</td></tr>
		 * 	<tr><td><br></td><td>col_061</td></tr>
		 * 	<tr><td><br></td><td>col_062</td></tr>
		 * 	<tr><td><br></td><td>col_063</td></tr>
		 * 	<tr><td><br></td><td>col_064</td></tr>
		 * 	<tr><td><br></td><td>col_065</td></tr>
		 * 	<tr><td><br></td><td>col_066</td></tr>
		 * 	<tr><td><br></td><td>col_067</td></tr>
		 * 	<tr><td><br></td><td>col_068</td></tr>
		 * 	<tr><td><br></td><td>col_069</td></tr>
		 * 	<tr><td><br></td><td>col_070</td></tr>
		 * 	<tr><td><br></td><td>col_071</td></tr>
		 * 	<tr><td><br></td><td>col_072</td></tr>
		 * 	<tr><td><br></td><td>col_073</td></tr>
		 * 	<tr><td><br></td><td>col_074</td></tr>
		 * 	<tr><td><br></td><td>col_075</td></tr>
		 * 	<tr><td><br></td><td>col_076</td></tr>
		 * 	<tr><td><br></td><td>col_077</td></tr>
		 * 	<tr><td><br></td><td>col_078</td></tr>
		 * 	<tr><td><br></td><td>col_079</td></tr>
		 * 	<tr><td><br></td><td>col_080</td></tr>
		 * 	<tr><td><br></td><td>col_081</td></tr>
		 * 	<tr><td><br></td><td>col_082</td></tr>
		 * 	<tr><td><br></td><td>col_083</td></tr>
		 * 	<tr><td><br></td><td>col_084</td></tr>
		 * 	<tr><td><br></td><td>col_085</td></tr>
		 * 	<tr><td><br></td><td>col_086</td></tr>
		 * 	<tr><td><br></td><td>col_087</td></tr>
		 * 	<tr><td><br></td><td>col_088</td></tr>
		 * 	<tr><td><br></td><td>col_089</td></tr>
		 * 	<tr><td><br></td><td>col_090</td></tr>
		 * 	<tr><td><br></td><td>col_091</td></tr>
		 * 	<tr><td><br></td><td>col_092</td></tr>
		 * 	<tr><td><br></td><td>col_093</td></tr>
		 * 	<tr><td><br></td><td>col_094</td></tr>
		 * 	<tr><td><br></td><td>col_095</td></tr>
		 * 	<tr><td><br></td><td>col_096</td></tr>
		 * 	<tr><td><br></td><td>col_097</td></tr>
		 * 	<tr><td><br></td><td>col_098</td></tr>
		 * 	<tr><td><br></td><td>col_099</td></tr>
		 * 	<tr><td><br></td><td>col_100</td></tr>
		 * 	<tr><td><br></td><td>col_101</td></tr>
		 * 	<tr><td><br></td><td>col_102</td></tr>
		 * 	<tr><td><br></td><td>col_103</td></tr>
		 * 	<tr><td><br></td><td>col_104</td></tr>
		 * 	<tr><td><br></td><td>col_105</td></tr>
		 * 	<tr><td><br></td><td>col_106</td></tr>
		 * 	<tr><td><br></td><td>col_107</td></tr>
		 * 	<tr><td><br></td><td>col_108</td></tr>
		 * 	<tr><td><br></td><td>col_109</td></tr>
		 * 	<tr><td><br></td><td>col_110</td></tr>
		 * 	<tr><td><br></td><td>col_111</td></tr>
		 * 	<tr><td><br></td><td>col_112</td></tr>
		 * 	<tr><td><br></td><td>col_113</td></tr>
		 * 	<tr><td><br></td><td>col_114</td></tr>
		 * 	<tr><td><br></td><td>col_115</td></tr>
		 * 	<tr><td><br></td><td>col_116</td></tr>
		 * 	<tr><td><br></td><td>col_117</td></tr>
		 * 	<tr><td><br></td><td>col_118</td></tr>
		 * 	<tr><td><br></td><td>col_119</td></tr>
		 * 	<tr><td><br></td><td>col_120</td></tr>
		 * 	<tr><td><br></td><td>col_121</td></tr>
		 * 	<tr><td><br></td><td>col_122</td></tr>
		 * 	<tr><td><br></td><td>col_123</td></tr>
		 * 	<tr><td><br></td><td>col_124</td></tr>
		 * 	<tr><td><br></td><td>col_125</td></tr>
		 * 	<tr><td><br></td><td>col_126</td></tr>
		 * 	<tr><td><br></td><td>col_127</td></tr>
		 * 	<tr><td><br></td><td>col_128</td></tr>
		 * 	<tr><td><br></td><td>col_129</td></tr>
		 * 	<tr><td><br></td><td>col_130</td></tr>
		 * 	<tr><td><br></td><td>col_131</td></tr>
		 * 	<tr><td><br></td><td>col_132</td></tr>
		 * 	<tr><td><br></td><td>col_133</td></tr>
		 * 	<tr><td><br></td><td>col_134</td></tr>
		 * 	<tr><td><br></td><td>col_135</td></tr>
		 * 	<tr><td><br></td><td>col_136</td></tr>
		 * 	<tr><td><br></td><td>col_137</td></tr>
		 * 	<tr><td><br></td><td>col_138</td></tr>
		 * 	<tr><td><br></td><td>col_139</td></tr>
		 * 	<tr><td><br></td><td>col_140</td></tr>
		 * 	<tr><td><br></td><td>col_141</td></tr>
		 * 	<tr><td><br></td><td>col_142</td></tr>
		 * 	<tr><td><br></td><td>col_143</td></tr>
		 * 	<tr><td><br></td><td>col_144</td></tr>
		 * 	<tr><td><br></td><td>col_145</td></tr>
		 * 	<tr><td><br></td><td>col_146</td></tr>
		 * 	<tr><td><br></td><td>col_147</td></tr>
		 * 	<tr><td><br></td><td>col_148</td></tr>
		 * 	<tr><td><br></td><td>col_149</td></tr>
		 * 	<tr><td><br></td><td>col_150</td></tr>
		 * 	<tr><td><br></td><td>col_151</td></tr>
		 * 	<tr><td><br></td><td>col_152</td></tr>
		 * 	<tr><td><br></td><td>col_153</td></tr>
		 * 	<tr><td><br></td><td>col_154</td></tr>
		 * 	<tr><td><br></td><td>col_155</td></tr>
		 * 	<tr><td><br></td><td>col_156</td></tr>
		 * 	<tr><td><br></td><td>col_157</td></tr>
		 * 	<tr><td><br></td><td>col_158</td></tr>
		 * 	<tr><td><br></td><td>col_159</td></tr>
		 * 	<tr><td><br></td><td>col_160</td></tr>
		 * 	<tr><td><br></td><td>col_161</td></tr>
		 * 	<tr><td><br></td><td>col_162</td></tr>
		 * 	<tr><td><br></td><td>col_163</td></tr>
		 * 	<tr><td><br></td><td>col_164</td></tr>
		 * 	<tr><td><br></td><td>col_165</td></tr>
		 * 	<tr><td><br></td><td>col_166</td></tr>
		 * 	<tr><td><br></td><td>col_167</td></tr>
		 * 	<tr><td><br></td><td>col_168</td></tr>
		 * 	<tr><td><br></td><td>col_169</td></tr>
		 * 	<tr><td><br></td><td>col_170</td></tr>
		 * 	<tr><td><br></td><td>col_171</td></tr>
		 * 	<tr><td><br></td><td>col_172</td></tr>
		 * 	<tr><td><br></td><td>col_173</td></tr>
		 * 	<tr><td><br></td><td>col_174</td></tr>
		 * 	<tr><td><br></td><td>col_175</td></tr>
		 * 	<tr><td><br></td><td>col_176</td></tr>
		 * 	<tr><td><br></td><td>col_177</td></tr>
		 * 	<tr><td><br></td><td>col_178</td></tr>
		 * 	<tr><td><br></td><td>col_179</td></tr>
		 * 	<tr><td><br></td><td>col_180</td></tr>
		 * 	<tr><td><br></td><td>col_181</td></tr>
		 * 	<tr><td><br></td><td>col_182</td></tr>
		 * 	<tr><td><br></td><td>col_183</td></tr>
		 * 	<tr><td><br></td><td>col_184</td></tr>
		 * 	<tr><td><br></td><td>col_185</td></tr>
		 * 	<tr><td><br></td><td>col_186</td></tr>
		 * 	<tr><td><br></td><td>col_187</td></tr>
		 * 	<tr><td><br></td><td>col_188</td></tr>
		 * 	<tr><td><br></td><td>col_189</td></tr>
		 * 	<tr><td><br></td><td>col_190</td></tr>
		 * 	<tr><td><br></td><td>col_191</td></tr>
		 * 	<tr><td><br></td><td>col_192</td></tr>
		 * 	<tr><td><br></td><td>col_193</td></tr>
		 * 	<tr><td><br></td><td>col_194</td></tr>
		 * 	<tr><td><br></td><td>col_195</td></tr>
		 * 	<tr><td><br></td><td>col_196</td></tr>
		 * 	<tr><td><br></td><td>col_197</td></tr>
		 * 	<tr><td><br></td><td>col_198</td></tr>
		 * 	<tr><td><br></td><td>col_199</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 標準単価確定前のチェックを行う。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBE.MGBEL0110.Chk01_CndR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
			down0 = mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
			down1 = MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createChk01_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
		}

		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR down0() {
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
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 標準単価確定解除前のチェックを行う。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBE.MGBEL0110.Chk01_CndR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> down1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
			down0 = mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
			down1 = MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createChk02_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
		}

		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createChk02_RsltR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR down0() {
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
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 標準単価一括確定前のチェックを行う。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Chk03_CndR up0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk03_CndR.create();

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk03_CndR createChk03_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk03_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk03_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 標準単価一括確定解除前のチェックを行う。<br>
	 */
	abstract public class Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBE.MGBEL0110.Chk04_CndR up0;
		
		
		// コンストラクタ
		protected Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk04_CndR.create();

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk04_CndR createChk04_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk04_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk04_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk04_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 標準単価を確定する。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createUpd01_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
		}

		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 標準単価を確定解除する。<br>
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
		private final mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR createDel01_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_CndR.create();
		}

		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_RsltR createDel01_RsltR(){
			return mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMGBE.MGBEL0110.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk01_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dbc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dbc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dbc.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dbc.calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBE.MGBEL0110.Chk01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 標準単価を一括確定する。<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBE.MGBEL0110.Chk03_CndR up0;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk03_CndR.create();

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk03_CndR createUpd02_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk03_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk03_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 標準単価を一括確定解除する。<br>
	 */
	abstract public class Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBE.MGBEL0110.Chk04_CndR up0;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBE.MGBEL0110.Chk04_CndR.create();

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
			invoke((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk04_CndR createDel02_CndR(){
			return mcframe.serverMGBE.MGBEL0110.Chk04_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBE.MGBEL0110.Chk04_CndR
		 */
		public mcframe.serverMGBE.MGBEL0110.Chk04_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBEL_StdUpriFix)MGBEL_StdUpriFix_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}