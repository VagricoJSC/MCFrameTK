package mcframe.serverMABC.MABCL0020;

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
 * "MABCL_CoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_CoReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_CoReg.Co_UpdChk01 aCo_UpdChk01;

	protected void initCo_UpdChk01() {
		this.info = PDef.MA_MABCL0020_Co_UpdChk01_INFO;
		this.aCo_UpdChk01 = ((MABCL_CoReg)this).new Co_UpdChk01();
	}

	public static MABCL_CoReg.Co_UpdChk01 crtCo_UpdChk01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
		lgc.initCo_UpdChk01();
		return lgc.aCo_UpdChk01;
	}

	protected void paramCo_UpdChk01(MCParam p) {
		if (this.aCo_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCo_UpdChk01.up0());
	}

	protected void doCo_UpdChk01() {
		aCo_UpdChk01.call();
	};

	/**
	 * Co_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR createCo_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.create();
	}

	/**
	 * Co_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> createCo_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
	}
	protected MABCL_CoReg.Co_Upd01 aCo_Upd01;

	protected void initCo_Upd01() {
		this.info = PDef.MA_MABCL0020_Co_Upd01_INFO;
		this.aCo_Upd01 = ((MABCL_CoReg)this).new Co_Upd01();
	}

	public static MABCL_CoReg.Co_Upd01 crtCo_Upd01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
		lgc.initCo_Upd01();
		return lgc.aCo_Upd01;
	}

	protected void paramCo_Upd01(MCParam p) {
		if (this.aCo_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCo_Upd01.up0());
	}

	protected void doCo_Upd01() {
		aCo_Upd01.call();
	};

	/**
	 * Co_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR createCo_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.create();
	}

	/**
	 * Co_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> createCo_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
	}
	protected MABCL_CoReg.CoSub_UpdChk01 aCoSub_UpdChk01;

	protected void initCoSub_UpdChk01() {
		this.info = PDef.MA_MABCL0020_CoSub_UpdChk01_INFO;
		this.aCoSub_UpdChk01 = ((MABCL_CoReg)this).new CoSub_UpdChk01();
	}

	public static MABCL_CoReg.CoSub_UpdChk01 crtCoSub_UpdChk01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
		lgc.initCoSub_UpdChk01();
		return lgc.aCoSub_UpdChk01;
	}

	protected void paramCoSub_UpdChk01(MCParam p) {
		if (this.aCoSub_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCoSub_UpdChk01.up0());
	}

	protected void doCoSub_UpdChk01() {
		aCoSub_UpdChk01.call();
	};

	/**
	 * CoSub_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR createCoSub_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.create();
	}

	/**
	 * CoSub_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> createCoSub_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
	}
	protected MABCL_CoReg.CoSub_Upd01 aCoSub_Upd01;

	protected void initCoSub_Upd01() {
		this.info = PDef.MA_MABCL0020_CoSub_Upd01_INFO;
		this.aCoSub_Upd01 = ((MABCL_CoReg)this).new CoSub_Upd01();
	}

	public static MABCL_CoReg.CoSub_Upd01 crtCoSub_Upd01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
		lgc.initCoSub_Upd01();
		return lgc.aCoSub_Upd01;
	}

	protected void paramCoSub_Upd01(MCParam p) {
		if (this.aCoSub_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCoSub_Upd01.up0());
	}

	protected void doCoSub_Upd01() {
		aCoSub_Upd01.call();
	};

	/**
	 * CoSub_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR createCoSub_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.create();
	}

	/**
	 * CoSub_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> createCoSub_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
	}
	protected MABCL_CoReg.CoLcl_UpdChk01 aCoLcl_UpdChk01;

	protected void initCoLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0020_CoLcl_UpdChk01_INFO;
		this.aCoLcl_UpdChk01 = ((MABCL_CoReg)this).new CoLcl_UpdChk01();
	}

	public static MABCL_CoReg.CoLcl_UpdChk01 crtCoLcl_UpdChk01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
		lgc.initCoLcl_UpdChk01();
		return lgc.aCoLcl_UpdChk01;
	}

	protected void paramCoLcl_UpdChk01(MCParam p) {
		if (this.aCoLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCoLcl_UpdChk01.up0());
	}

	protected void doCoLcl_UpdChk01() {
		aCoLcl_UpdChk01.call();
	};

	/**
	 * CoLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR createCoLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CoLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> createCoLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_CoReg.CoLcl_Upd01 aCoLcl_Upd01;

	protected void initCoLcl_Upd01() {
		this.info = PDef.MA_MABCL0020_CoLcl_Upd01_INFO;
		this.aCoLcl_Upd01 = ((MABCL_CoReg)this).new CoLcl_Upd01();
	}

	public static MABCL_CoReg.CoLcl_Upd01 crtCoLcl_Upd01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
		lgc.initCoLcl_Upd01();
		return lgc.aCoLcl_Upd01;
	}

	protected void paramCoLcl_Upd01(MCParam p) {
		if (this.aCoLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCoLcl_Upd01.up0());
	}

	protected void doCoLcl_Upd01() {
		aCoLcl_Upd01.call();
	};

	/**
	 * CoLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR createCoLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CoLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> createCoLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_CoReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0020_Srch01_INFO;
		this.aSrch01 = ((MABCL_CoReg)this).new Srch01();
	}

	public static MABCL_CoReg.Srch01 crtSrch01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
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
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0020.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0020.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltR.class);
	}

	/**
	 * Srch01_RsltSubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Srch01_RsltSubR createSrch01_RsltSubR(){
		return mcframe.serverMABC.MABCL0020.Srch01_RsltSubR.create();
	}

	/**
	 * Srch01_RsltSubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltSubR> createSrch01_RsltSubL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltSubR.class);
	}

	/**
	 * Srch01_RsltLclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Srch01_RsltLclR createSrch01_RsltLclR(){
		return mcframe.serverMABC.MABCL0020.Srch01_RsltLclR.create();
	}

	/**
	 * Srch01_RsltLclブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltLclR> createSrch01_RsltLclL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltLclR.class);
	}
	protected MABCL_CoReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0020_Upd01_INFO;
		this.aUpd01 = ((MABCL_CoReg)this).new Upd01();
	}

	public static MABCL_CoReg.Upd01 crtUpd01() {
		MABCL_CoReg lgc = new MABCL_CoReg();
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
		p.addUpBlock(aUpd01.up2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_DtlSubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR createUpd01_DtlSubR(){
		return mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlSubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> createUpd01_DtlSubL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_DtlLclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR createUpd01_DtlLclR(){
		return mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlLclブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> createUpd01_DtlLclL(){
		return MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Co_UpdChk01オペレーション.<p>
	 *
	 * 会社マスタを登録する前のチェックを行う<br>
	 */
	abstract public class Co_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Co_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Co_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);

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
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Co_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR createCo_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.create();
		}

		/**
		 * Co_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> createCo_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_mon</td></tr>
		 * 	<tr><td><br></td><td>dt_switch_time</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_mon_base</td></tr>
		 * 	<tr><td><br></td><td>std_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>mon01_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon02_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon03_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon04_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon05_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon06_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon07_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon08_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon09_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon10_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon11_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon12_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>setoff_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sls_bdj_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_cnf_num</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_limit_num</td></tr>
		 * 	<tr><td><br></td><td>gm_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>early_ship_dt_add_days</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_digit</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_strg_ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}


	}
	/**
	 * Co_Upd01オペレーション.<p>
	 *
	 * 会社マスタを登録する<br>
	 */
	abstract public class Co_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Co_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CO_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CO_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Co_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CO_R.create("T1"));
			chkMaster = MCController.create(MAM_CO_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CO_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CO_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CO_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CO_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Co_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR createCo_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.create();
		}

		/**
		 * Co_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> createCo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_mon</td></tr>
		 * 	<tr><td><br></td><td>dt_switch_time</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_mon_base</td></tr>
		 * 	<tr><td><br></td><td>std_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>mon01_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon02_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon03_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon04_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon05_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon06_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon07_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon08_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon09_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon10_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon11_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon12_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>setoff_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sls_bdj_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_cnf_num</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_limit_num</td></tr>
		 * 	<tr><td><br></td><td>gm_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>early_ship_dt_add_days</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_digit</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_strg_ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src_Co_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Co_Upd01_Dtl);
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("st_mon", "st_mon");
				addColumnPathMap("dt_switch_time", "dt_switch_time");
				addColumnPathMap("ac_cl_day", "ac_cl_day");
				addColumnPathMap("ac_cl_mon_base", "ac_cl_mon_base");
				addColumnPathMap("std_cal_cd", "std_cal_cd");
				addColumnPathMap("bill_cl_cal_cd", "bill_cl_cal_cd");
				addColumnPathMap("ar_no_use_flg", "ar_no_use_flg");
				addColumnPathMap("ap_no_use_flg", "ap_no_use_flg");
				addColumnPathMap("temp_ap_use_flg", "temp_ap_use_flg");
				addColumnPathMap("sls_cl_flg", "sls_cl_flg");
				addColumnPathMap("rcv_cl_flg", "rcv_cl_flg");
				addColumnPathMap("purc_cl_flg", "purc_cl_flg");
				addColumnPathMap("pay_cl_flg", "pay_cl_flg");
				addColumnPathMap("stk_cl_cal_cd", "stk_cl_cal_cd");
				addColumnPathMap("sls_cl_cal_cd", "sls_cl_cal_cd");
				addColumnPathMap("rcv_cl_cal_cd", "rcv_cl_cal_cd");
				addColumnPathMap("purc_cl_cal_cd", "purc_cl_cal_cd");
				addColumnPathMap("pay_cl_cal_cd", "pay_cl_cal_cd");
				addColumnPathMap("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd");
				addColumnPathMap("stk_cl_delay_days", "stk_cl_delay_days");
				addColumnPathMap("stk_cl_ba_typ", "stk_cl_ba_typ");
				addColumnPathMap("sls_cl_delay_days", "sls_cl_delay_days");
				addColumnPathMap("sls_cl_ba_typ", "sls_cl_ba_typ");
				addColumnPathMap("rcv_cl_delay_days", "rcv_cl_delay_days");
				addColumnPathMap("rcv_cl_ba_typ", "rcv_cl_ba_typ");
				addColumnPathMap("purc_cl_delay_days", "purc_cl_delay_days");
				addColumnPathMap("purc_cl_ba_typ", "purc_cl_ba_typ");
				addColumnPathMap("pay_cl_delay_days", "pay_cl_delay_days");
				addColumnPathMap("pay_cl_ba_typ", "pay_cl_ba_typ");
				addColumnPathMap("sls_xrate_cd", "sls_xrate_cd");
				addColumnPathMap("purc_xrate_cd", "purc_xrate_cd");
				addColumnPathMap("prov_xrate_cd", "prov_xrate_cd");
				addColumnPathMap("bill_xrate_conv_flg", "bill_xrate_conv_flg");
				addColumnPathMap("bill_xrate_cd", "bill_xrate_cd");
				addColumnPathMap("pay_xrate_conv_flg", "pay_xrate_conv_flg");
				addColumnPathMap("pay_xrate_cd", "pay_xrate_cd");
				addColumnPathMap("mon01_xrate_rev_flg", "mon01_xrate_rev_flg");
				addColumnPathMap("mon02_xrate_rev_flg", "mon02_xrate_rev_flg");
				addColumnPathMap("mon03_xrate_rev_flg", "mon03_xrate_rev_flg");
				addColumnPathMap("mon04_xrate_rev_flg", "mon04_xrate_rev_flg");
				addColumnPathMap("mon05_xrate_rev_flg", "mon05_xrate_rev_flg");
				addColumnPathMap("mon06_xrate_rev_flg", "mon06_xrate_rev_flg");
				addColumnPathMap("mon07_xrate_rev_flg", "mon07_xrate_rev_flg");
				addColumnPathMap("mon08_xrate_rev_flg", "mon08_xrate_rev_flg");
				addColumnPathMap("mon09_xrate_rev_flg", "mon09_xrate_rev_flg");
				addColumnPathMap("mon10_xrate_rev_flg", "mon10_xrate_rev_flg");
				addColumnPathMap("mon11_xrate_rev_flg", "mon11_xrate_rev_flg");
				addColumnPathMap("mon12_xrate_rev_flg", "mon12_xrate_rev_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("xfr_stk_mng_typ", "xfr_stk_mng_typ");
				addColumnPathMap("setoff_tax_rnd_typ", "setoff_tax_rnd_typ");
				addColumnPathMap("xrate_rnd_typ", "xrate_rnd_typ");
				addColumnPathMap("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ");
				addColumnPathMap("wtax_rnd_typ", "wtax_rnd_typ");
				addColumnPathMap("stk_amt_rnd_typ", "stk_amt_rnd_typ");
				addColumnPathMap("stk_amt_dec_place", "stk_amt_dec_place");
				addColumnPathMap("sls_bdj_rnd_typ", "sls_bdj_rnd_typ");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("stk_lst_cnf_num", "stk_lst_cnf_num");
				addColumnPathMap("stk_lst_limit_num", "stk_lst_limit_num");
				addColumnPathMap("gm_std_upri_typ", "gm_std_upri_typ");
				addColumnPathMap("stk_std_upri_typ", "stk_std_upri_typ");
				addColumnPathMap("early_ship_dt_add_days", "early_ship_dt_add_days");
				addColumnPathMap("ac_slip_digit", "ac_slip_digit");
				addColumnPathMap("ac_slip_seq_flg", "ac_slip_seq_flg");
				addColumnPathMap("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_CO_R r_dest, mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CO_R> dest, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src : src){
				MAM_CO_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src_Co_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Co_Upd01_Dtl);
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
				addColumnPathMap("co_cd", "co_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_CO_R r_dest, mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CO_R> dest, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src : src){
				MAM_CO_R r_dest = dest.createRow();
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
	 * CoSub_UpdChk01オペレーション.<p>
	 *
	 * 会社補助マスタを登録する前のチェックを行う<br>
	 */
	abstract public class CoSub_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CoSub_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_CO_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CoSub_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_CO_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_CO_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_CO_R&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(EXISTS)) {
				up_EXISTS(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * EXISTS<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(EXISTS)) {
				down_EXISTS();
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
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CoSub_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR createCoSub_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.create();
		}

		/**
		 * CoSub_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> createCoSub_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src_CoSub_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CoSub_UpdChk01_Dtl);
		}
		
		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_EXISTS_chk01_0() {
			MCRowMapper map = new Map_up_EXISTS_chk01_0();
			return map;
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_EXISTS_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_CO_R r_dest, mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_CO_R> dest, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src : src){
				MAM_CO_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_EXISTS_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------EXISTS専用down関連メソッド--------------------------

		/**
		 * オペレーショングループEXISTSの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_EXISTS(){
		}
	}
	/**
	 * CoSub_Upd01オペレーション.<p>
	 *
	 * 会社補助マスタを登録する<br>
	 */
	abstract public class CoSub_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CoSub_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_SUB_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_SUB_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_SUB_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CO_SUB_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_SUB_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_SUB_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_SUB_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CO_SUB_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CoSub_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CO_SUB_R.create("T1"));
			chkMaster = MCController.create(MAM_CO_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CO_SUB_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CO_SUB_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CO_SUB_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CO_SUB_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CoSub_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR createCoSub_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.create();
		}

		/**
		 * CoSub_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> createCoSub_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_CO_SUB_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src_CoSub_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CoSub_Upd01_Dtl);
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_CO_SUB_R r_dest, mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CO_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src : src){
				MAM_CO_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CO_SUB_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src_CoSub_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CoSub_Upd01_Dtl);
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_CO_SUB_R r_dest, mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CO_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src : src){
				MAM_CO_SUB_R r_dest = dest.createRow();
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
	 * CoLcl_UpdChk01オペレーション.<p>
	 *
	 * 会社マスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class CoLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CoLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_CO_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CoLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_CO_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_CO_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_CO_R&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(EXISTS)) {
				up_EXISTS(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * EXISTS<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(EXISTS)) {
				down_EXISTS();
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
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CoLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR createCoLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CoLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> createCoLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src_CoLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CoLcl_UpdChk01_Dtl);
		}
		
		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_EXISTS_chk01_0() {
			MCRowMapper map = new Map_up_EXISTS_chk01_0();
			return map;
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_EXISTS_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_CO_R r_dest, mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_CO_R> dest, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src : src){
				MAM_CO_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_EXISTS_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------EXISTS専用down関連メソッド--------------------------

		/**
		 * オペレーショングループEXISTSの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_EXISTS(){
		}
	}
	/**
	 * CoLcl_Upd01オペレーション.<p>
	 *
	 * 会社マスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class CoLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CoLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CO_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CO_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CO_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CoLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CO_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_CO_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CO_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CO_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CO_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CO_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CoLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR createCoLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CoLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> createCoLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_CO_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src_CoLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CoLcl_Upd01_Dtl);
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_CO_LCL_R r_dest, mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CO_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src : src){
				MAM_CO_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CO_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src_CoLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CoLcl_Upd01_Dtl);
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_CO_LCL_R r_dest, mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CO_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src : src){
				MAM_CO_LCL_R r_dest = dest.createRow();
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
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLSearcher {
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
		private final mcframe.serverMABC.MABCL0020.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltSubR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltLclR> down2;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_R&gt;<br>
		 * 第1 上りブロッククラス MAM_CO_R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_CO_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_R> c0;
		// 連携ロジック上り
		public final MAM_CO_R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_CO_R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_SUB_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB = "SELECT_SUB";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_SUB_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_CO_SUB_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_SUB_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_CO_SUB_R> c1_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CO_LCL_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CO_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_CO_LCL_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_CO_LCL_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_CO_LCL_R> c2_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0020.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltSubR.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltLclR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_CO_R.create("T1"));
			c1 = MCController.create(MAM_CO_SUB_R.create("T1"));
			c2 = MCController.create(MAM_CO_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_CO_R)c0.up(0);
			c0_down0 = (MCList<MAM_CO_R>)c0.down(0);
			c1_down0 = (MCList<MAM_CO_SUB_R>)c1.down(0);
			c2_down0 = (MCList<MAM_CO_LCL_R>)c2.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB, c1);
			appendOpe(SELECT_LCL, c2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_CO_R （{@link #c0_up0}）<br>
		 * SELECT_SUB<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_SUB)) {
				up_SELECT_SUB();
			}
			if (key.equals(SELECT_LCL)) {
				up_SELECT_LCL();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_CO_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB<br>
		 * MCList&lt;MAM_CO_SUB_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_CO_LCL_R&gt;（{@link #c2_down0}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB)) {
				down_SELECT_SUB(down1(), c1_down0);
			}
			if (key.equals(SELECT_LCL)) {
				down_SELECT_LCL(down2(), c2_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0020.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0020.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltR.class);
		}

		/**
		 * Srch01_RsltSubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Srch01_RsltSubR createSrch01_RsltSubR(){
			return mcframe.serverMABC.MABCL0020.Srch01_RsltSubR.create();
		}

		/**
		 * Srch01_RsltSubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltSubR> createSrch01_RsltSubL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltSubR.class);
		}

		/**
		 * Srch01_RsltLclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Srch01_RsltLclR createSrch01_RsltLclR(){
			return mcframe.serverMABC.MABCL0020.Srch01_RsltLclR.create();
		}

		/**
		 * Srch01_RsltLclブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltLclR> createSrch01_RsltLclL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.Srch01_RsltLclR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0020.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0020.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_mon</td></tr>
		 * 	<tr><td><br></td><td>dt_switch_time</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_mon_base</td></tr>
		 * 	<tr><td><br></td><td>std_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>mon01_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon02_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon03_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon04_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon05_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon06_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon07_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon08_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon09_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon10_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon11_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon12_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>setoff_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sls_bdj_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_cnf_num</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_limit_num</td></tr>
		 * 	<tr><td><br></td><td>gm_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>early_ship_dt_add_days</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_digit</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_strg_ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_strg_ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_bdj_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_print_nm</td></tr>
		 * 	<tr><td><br></td><td>gm_std_upri_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_std_upri_typ_nm</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltSubR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltLclR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_CO_R dest0_0, mcframe.serverMABC.MABCL0020.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_CO_R dest, mcframe.serverMABC.MABCL0020.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUBの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB(){
		}
		//-----------------------SELECT_LCL専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCLの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_CO_R> src0_0){
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("co_alt_nm1", "base_co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "base_co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "base_co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "base_co_alt_nm4");
				addColumnPathMap("zip_cd", "base_zip_cd");
				addColumnPathMap("addr1", "base_addr1");
				addColumnPathMap("addr2", "base_addr2");
				addColumnPathMap("addr3", "base_addr3");
				addColumnPathMap("addr4", "base_addr4");
				addColumnPathMap("tel", "base_tel");
				addColumnPathMap("fax", "base_fax");
				addColumnPathMap("co_repl_nm", "base_co_repl_nm");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("st_mon", "st_mon");
				addColumnPathMap("dt_switch_time", "dt_switch_time");
				addColumnPathMap("ac_cl_day", "ac_cl_day");
				addColumnPathMap("ac_cl_mon_base", "ac_cl_mon_base");
				addColumnPathMap("std_cal_cd", "std_cal_cd");
				addColumnPathMap("bill_cl_cal_cd", "bill_cl_cal_cd");
				addColumnPathMap("ar_no_use_flg", "ar_no_use_flg");
				addColumnPathMap("ap_no_use_flg", "ap_no_use_flg");
				addColumnPathMap("temp_ap_use_flg", "temp_ap_use_flg");
				addColumnPathMap("sls_cl_flg", "sls_cl_flg");
				addColumnPathMap("rcv_cl_flg", "rcv_cl_flg");
				addColumnPathMap("purc_cl_flg", "purc_cl_flg");
				addColumnPathMap("pay_cl_flg", "pay_cl_flg");
				addColumnPathMap("stk_cl_cal_cd", "stk_cl_cal_cd");
				addColumnPathMap("sls_cl_cal_cd", "sls_cl_cal_cd");
				addColumnPathMap("rcv_cl_cal_cd", "rcv_cl_cal_cd");
				addColumnPathMap("purc_cl_cal_cd", "purc_cl_cal_cd");
				addColumnPathMap("pay_cl_cal_cd", "pay_cl_cal_cd");
				addColumnPathMap("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd");
				addColumnPathMap("stk_cl_delay_days", "stk_cl_delay_days");
				addColumnPathMap("stk_cl_ba_typ", "stk_cl_ba_typ");
				addColumnPathMap("sls_cl_delay_days", "sls_cl_delay_days");
				addColumnPathMap("sls_cl_ba_typ", "sls_cl_ba_typ");
				addColumnPathMap("rcv_cl_delay_days", "rcv_cl_delay_days");
				addColumnPathMap("rcv_cl_ba_typ", "rcv_cl_ba_typ");
				addColumnPathMap("purc_cl_delay_days", "purc_cl_delay_days");
				addColumnPathMap("purc_cl_ba_typ", "purc_cl_ba_typ");
				addColumnPathMap("pay_cl_delay_days", "pay_cl_delay_days");
				addColumnPathMap("pay_cl_ba_typ", "pay_cl_ba_typ");
				addColumnPathMap("sls_xrate_cd", "sls_xrate_cd");
				addColumnPathMap("purc_xrate_cd", "purc_xrate_cd");
				addColumnPathMap("prov_xrate_cd", "prov_xrate_cd");
				addColumnPathMap("bill_xrate_conv_flg", "bill_xrate_conv_flg");
				addColumnPathMap("bill_xrate_cd", "bill_xrate_cd");
				addColumnPathMap("pay_xrate_conv_flg", "pay_xrate_conv_flg");
				addColumnPathMap("pay_xrate_cd", "pay_xrate_cd");
				addColumnPathMap("mon01_xrate_rev_flg", "mon01_xrate_rev_flg");
				addColumnPathMap("mon02_xrate_rev_flg", "mon02_xrate_rev_flg");
				addColumnPathMap("mon03_xrate_rev_flg", "mon03_xrate_rev_flg");
				addColumnPathMap("mon04_xrate_rev_flg", "mon04_xrate_rev_flg");
				addColumnPathMap("mon05_xrate_rev_flg", "mon05_xrate_rev_flg");
				addColumnPathMap("mon06_xrate_rev_flg", "mon06_xrate_rev_flg");
				addColumnPathMap("mon07_xrate_rev_flg", "mon07_xrate_rev_flg");
				addColumnPathMap("mon08_xrate_rev_flg", "mon08_xrate_rev_flg");
				addColumnPathMap("mon09_xrate_rev_flg", "mon09_xrate_rev_flg");
				addColumnPathMap("mon10_xrate_rev_flg", "mon10_xrate_rev_flg");
				addColumnPathMap("mon11_xrate_rev_flg", "mon11_xrate_rev_flg");
				addColumnPathMap("mon12_xrate_rev_flg", "mon12_xrate_rev_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("xfr_stk_mng_typ", "xfr_stk_mng_typ");
				addColumnPathMap("setoff_tax_rnd_typ", "setoff_tax_rnd_typ");
				addColumnPathMap("xrate_rnd_typ", "xrate_rnd_typ");
				addColumnPathMap("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ");
				addColumnPathMap("wtax_rnd_typ", "wtax_rnd_typ");
				addColumnPathMap("stk_amt_rnd_typ", "stk_amt_rnd_typ");
				addColumnPathMap("stk_amt_dec_place", "stk_amt_dec_place");
				addColumnPathMap("sls_bdj_rnd_typ", "sls_bdj_rnd_typ");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("stk_lst_cnf_num", "stk_lst_cnf_num");
				addColumnPathMap("stk_lst_limit_num", "stk_lst_limit_num");
				addColumnPathMap("gm_std_upri_typ", "gm_std_upri_typ");
				addColumnPathMap("stk_std_upri_typ", "stk_std_upri_typ");
				addColumnPathMap("early_ship_dt_add_days", "early_ship_dt_add_days");
				addColumnPathMap("ac_slip_digit", "ac_slip_digit");
				addColumnPathMap("ac_slip_seq_flg", "ac_slip_seq_flg");
				addColumnPathMap("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd");
				addColumnPathMap("rpt_strg_ext_sys_nm", "rpt_strg_ext_sys_nm");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("cntry_nm", "cntry_nm");
				addColumnPathMap("area_nm", "area_nm");
				addColumnPathMap("base_cur_nm", "base_cur_nm");
				addColumnPathMap("ptax_cur_nm", "ptax_cur_nm");
				addColumnPathMap("std_cal_nm", "std_cal_nm");
				addColumnPathMap("stk_cl_cal_nm", "stk_cl_cal_nm");
				addColumnPathMap("sls_cl_cal_nm", "sls_cl_cal_nm");
				addColumnPathMap("bill_cl_cal_nm", "bill_cl_cal_nm");
				addColumnPathMap("rcv_cl_cal_nm", "rcv_cl_cal_nm");
				addColumnPathMap("purc_cl_cal_nm", "purc_cl_cal_nm");
				addColumnPathMap("pay_cl_cal_nm", "pay_cl_cal_nm");
				addColumnPathMap("pay_schd_cl_cal_nm", "pay_schd_cl_cal_nm");
				addColumnPathMap("sls_xrate_nm", "sls_xrate_nm");
				addColumnPathMap("purc_xrate_nm", "purc_xrate_nm");
				addColumnPathMap("prov_xrate_nm", "prov_xrate_nm");
				addColumnPathMap("bill_xrate_nm", "bill_xrate_nm");
				addColumnPathMap("pay_xrate_nm", "pay_xrate_nm");
				addColumnPathMap("po_print_nm", "po_print_nm");
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
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0020.Srch01_RsltR r_dest, MAM_CO_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltR> dest, MCList<MAM_CO_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_CO_R r_src : src){
				mcframe.serverMABC.MABCL0020.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUBの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB(MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltSubR> dest_Srch01_RsltSub, MCList<MAM_CO_SUB_R> src0_0){
			down_SELECT_SUB_c1_0(dest_Srch01_RsltSub, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
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
			}
		}

		/**
		 * 連携処理SELECT_SUB_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB_c1_0(mcframe.serverMABC.MABCL0020.Srch01_RsltSubR r_dest, MAM_CO_SUB_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB_c1_0(MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltSubR> dest, MCList<MAM_CO_SUB_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB_c1_0();
			for(MAM_CO_SUB_R r_src : src){
				mcframe.serverMABC.MABCL0020.Srch01_RsltSubR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltLclR> dest_Srch01_RsltLcl, MCList<MAM_CO_LCL_R> src0_0){
			down_SELECT_LCL_c2_0(dest_Srch01_RsltLcl, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL_c2_0() {
			MCRowMapper map = new Map_down_SELECT_LCL_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
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
			}
		}

		/**
		 * 連携処理SELECT_LCL_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL_c2_0(mcframe.serverMABC.MABCL0020.Srch01_RsltLclR r_dest, MAM_CO_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c2_0(MCList<mcframe.serverMABC.MABCL0020.Srch01_RsltLclR> dest, MCList<MAM_CO_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c2_0();
			for(MAM_CO_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0020.Srch01_RsltLclR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
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
		private final MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> up2;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0020.MABCL_CoReg.Co_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0020.MABCL_CoReg.Co_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0020.MABCL_CoReg.Co_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0020.MABCL_CoReg.Co_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0020.MABCL_CoReg.Co_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0020.MABCL_CoReg.Co_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoSub_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoSub_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoSub_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoSub_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoSub_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoSub_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoLcl_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoLcl_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoLcl_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0020.MABCL_CoReg.CoLcl_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0020.MABCL_CoReg.crtCo_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0020.MABCL_CoReg.crtCo_Upd01();
			chk02 = mcframe.serverMABC.MABCL0020.MABCL_CoReg.crtCoSub_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0020.MABCL_CoReg.crtCoSub_Upd01();
			chk03 = mcframe.serverMABC.MABCL0020.MABCL_CoReg.crtCoLcl_UpdChk01();
			upd03 = mcframe.serverMABC.MABCL0020.MABCL_CoReg.crtCoLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR>)upd03.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_CoReg)MABCL_CoReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_DtlSubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR createUpd01_DtlSubR(){
			return mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlSubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> createUpd01_DtlSubL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_DtlLclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR createUpd01_DtlLclR(){
			return mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlLclブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> createUpd01_DtlLclL(){
			return MCList.create(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_mon</td></tr>
		 * 	<tr><td><br></td><td>dt_switch_time</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_mon_base</td></tr>
		 * 	<tr><td><br></td><td>std_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>mon01_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon02_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon03_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon04_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon05_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon06_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon07_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon08_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon09_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon10_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon11_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>mon12_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>setoff_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sls_bdj_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_cnf_num</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_limit_num</td></tr>
		 * 	<tr><td><br></td><td>gm_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>early_ship_dt_add_days</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_digit</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_strg_ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CoReg)MABCL_CoReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src_Upd01_Dtl){
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("st_mon", "st_mon");
				addColumnPathMap("dt_switch_time", "dt_switch_time");
				addColumnPathMap("ac_cl_day", "ac_cl_day");
				addColumnPathMap("ac_cl_mon_base", "ac_cl_mon_base");
				addColumnPathMap("std_cal_cd", "std_cal_cd");
				addColumnPathMap("bill_cl_cal_cd", "bill_cl_cal_cd");
				addColumnPathMap("ar_no_use_flg", "ar_no_use_flg");
				addColumnPathMap("ap_no_use_flg", "ap_no_use_flg");
				addColumnPathMap("temp_ap_use_flg", "temp_ap_use_flg");
				addColumnPathMap("sls_cl_flg", "sls_cl_flg");
				addColumnPathMap("rcv_cl_flg", "rcv_cl_flg");
				addColumnPathMap("purc_cl_flg", "purc_cl_flg");
				addColumnPathMap("pay_cl_flg", "pay_cl_flg");
				addColumnPathMap("stk_cl_cal_cd", "stk_cl_cal_cd");
				addColumnPathMap("sls_cl_cal_cd", "sls_cl_cal_cd");
				addColumnPathMap("rcv_cl_cal_cd", "rcv_cl_cal_cd");
				addColumnPathMap("purc_cl_cal_cd", "purc_cl_cal_cd");
				addColumnPathMap("pay_cl_cal_cd", "pay_cl_cal_cd");
				addColumnPathMap("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd");
				addColumnPathMap("stk_cl_delay_days", "stk_cl_delay_days");
				addColumnPathMap("stk_cl_ba_typ", "stk_cl_ba_typ");
				addColumnPathMap("sls_cl_delay_days", "sls_cl_delay_days");
				addColumnPathMap("sls_cl_ba_typ", "sls_cl_ba_typ");
				addColumnPathMap("rcv_cl_delay_days", "rcv_cl_delay_days");
				addColumnPathMap("rcv_cl_ba_typ", "rcv_cl_ba_typ");
				addColumnPathMap("purc_cl_delay_days", "purc_cl_delay_days");
				addColumnPathMap("purc_cl_ba_typ", "purc_cl_ba_typ");
				addColumnPathMap("pay_cl_delay_days", "pay_cl_delay_days");
				addColumnPathMap("pay_cl_ba_typ", "pay_cl_ba_typ");
				addColumnPathMap("sls_xrate_cd", "sls_xrate_cd");
				addColumnPathMap("purc_xrate_cd", "purc_xrate_cd");
				addColumnPathMap("prov_xrate_cd", "prov_xrate_cd");
				addColumnPathMap("bill_xrate_conv_flg", "bill_xrate_conv_flg");
				addColumnPathMap("bill_xrate_cd", "bill_xrate_cd");
				addColumnPathMap("pay_xrate_conv_flg", "pay_xrate_conv_flg");
				addColumnPathMap("pay_xrate_cd", "pay_xrate_cd");
				addColumnPathMap("mon01_xrate_rev_flg", "mon01_xrate_rev_flg");
				addColumnPathMap("mon02_xrate_rev_flg", "mon02_xrate_rev_flg");
				addColumnPathMap("mon03_xrate_rev_flg", "mon03_xrate_rev_flg");
				addColumnPathMap("mon04_xrate_rev_flg", "mon04_xrate_rev_flg");
				addColumnPathMap("mon05_xrate_rev_flg", "mon05_xrate_rev_flg");
				addColumnPathMap("mon06_xrate_rev_flg", "mon06_xrate_rev_flg");
				addColumnPathMap("mon07_xrate_rev_flg", "mon07_xrate_rev_flg");
				addColumnPathMap("mon08_xrate_rev_flg", "mon08_xrate_rev_flg");
				addColumnPathMap("mon09_xrate_rev_flg", "mon09_xrate_rev_flg");
				addColumnPathMap("mon10_xrate_rev_flg", "mon10_xrate_rev_flg");
				addColumnPathMap("mon11_xrate_rev_flg", "mon11_xrate_rev_flg");
				addColumnPathMap("mon12_xrate_rev_flg", "mon12_xrate_rev_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("xfr_stk_mng_typ", "xfr_stk_mng_typ");
				addColumnPathMap("setoff_tax_rnd_typ", "setoff_tax_rnd_typ");
				addColumnPathMap("xrate_rnd_typ", "xrate_rnd_typ");
				addColumnPathMap("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ");
				addColumnPathMap("wtax_rnd_typ", "wtax_rnd_typ");
				addColumnPathMap("stk_amt_rnd_typ", "stk_amt_rnd_typ");
				addColumnPathMap("stk_amt_dec_place", "stk_amt_dec_place");
				addColumnPathMap("sls_bdj_rnd_typ", "sls_bdj_rnd_typ");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("stk_lst_cnf_num", "stk_lst_cnf_num");
				addColumnPathMap("stk_lst_limit_num", "stk_lst_limit_num");
				addColumnPathMap("gm_std_upri_typ", "gm_std_upri_typ");
				addColumnPathMap("stk_std_upri_typ", "stk_std_upri_typ");
				addColumnPathMap("early_ship_dt_add_days", "early_ship_dt_add_days");
				addColumnPathMap("ac_slip_digit", "ac_slip_digit");
				addColumnPathMap("ac_slip_seq_flg", "ac_slip_seq_flg");
				addColumnPathMap("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("st_mon", "st_mon");
				addColumnPathMap("dt_switch_time", "dt_switch_time");
				addColumnPathMap("ac_cl_day", "ac_cl_day");
				addColumnPathMap("ac_cl_mon_base", "ac_cl_mon_base");
				addColumnPathMap("std_cal_cd", "std_cal_cd");
				addColumnPathMap("bill_cl_cal_cd", "bill_cl_cal_cd");
				addColumnPathMap("ar_no_use_flg", "ar_no_use_flg");
				addColumnPathMap("ap_no_use_flg", "ap_no_use_flg");
				addColumnPathMap("temp_ap_use_flg", "temp_ap_use_flg");
				addColumnPathMap("sls_cl_flg", "sls_cl_flg");
				addColumnPathMap("rcv_cl_flg", "rcv_cl_flg");
				addColumnPathMap("purc_cl_flg", "purc_cl_flg");
				addColumnPathMap("pay_cl_flg", "pay_cl_flg");
				addColumnPathMap("stk_cl_cal_cd", "stk_cl_cal_cd");
				addColumnPathMap("sls_cl_cal_cd", "sls_cl_cal_cd");
				addColumnPathMap("rcv_cl_cal_cd", "rcv_cl_cal_cd");
				addColumnPathMap("purc_cl_cal_cd", "purc_cl_cal_cd");
				addColumnPathMap("pay_cl_cal_cd", "pay_cl_cal_cd");
				addColumnPathMap("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd");
				addColumnPathMap("stk_cl_delay_days", "stk_cl_delay_days");
				addColumnPathMap("stk_cl_ba_typ", "stk_cl_ba_typ");
				addColumnPathMap("sls_cl_delay_days", "sls_cl_delay_days");
				addColumnPathMap("sls_cl_ba_typ", "sls_cl_ba_typ");
				addColumnPathMap("rcv_cl_delay_days", "rcv_cl_delay_days");
				addColumnPathMap("rcv_cl_ba_typ", "rcv_cl_ba_typ");
				addColumnPathMap("purc_cl_delay_days", "purc_cl_delay_days");
				addColumnPathMap("purc_cl_ba_typ", "purc_cl_ba_typ");
				addColumnPathMap("pay_cl_delay_days", "pay_cl_delay_days");
				addColumnPathMap("pay_cl_ba_typ", "pay_cl_ba_typ");
				addColumnPathMap("sls_xrate_cd", "sls_xrate_cd");
				addColumnPathMap("purc_xrate_cd", "purc_xrate_cd");
				addColumnPathMap("prov_xrate_cd", "prov_xrate_cd");
				addColumnPathMap("bill_xrate_conv_flg", "bill_xrate_conv_flg");
				addColumnPathMap("bill_xrate_cd", "bill_xrate_cd");
				addColumnPathMap("pay_xrate_conv_flg", "pay_xrate_conv_flg");
				addColumnPathMap("pay_xrate_cd", "pay_xrate_cd");
				addColumnPathMap("mon01_xrate_rev_flg", "mon01_xrate_rev_flg");
				addColumnPathMap("mon02_xrate_rev_flg", "mon02_xrate_rev_flg");
				addColumnPathMap("mon03_xrate_rev_flg", "mon03_xrate_rev_flg");
				addColumnPathMap("mon04_xrate_rev_flg", "mon04_xrate_rev_flg");
				addColumnPathMap("mon05_xrate_rev_flg", "mon05_xrate_rev_flg");
				addColumnPathMap("mon06_xrate_rev_flg", "mon06_xrate_rev_flg");
				addColumnPathMap("mon07_xrate_rev_flg", "mon07_xrate_rev_flg");
				addColumnPathMap("mon08_xrate_rev_flg", "mon08_xrate_rev_flg");
				addColumnPathMap("mon09_xrate_rev_flg", "mon09_xrate_rev_flg");
				addColumnPathMap("mon10_xrate_rev_flg", "mon10_xrate_rev_flg");
				addColumnPathMap("mon11_xrate_rev_flg", "mon11_xrate_rev_flg");
				addColumnPathMap("mon12_xrate_rev_flg", "mon12_xrate_rev_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("xfr_stk_mng_typ", "xfr_stk_mng_typ");
				addColumnPathMap("setoff_tax_rnd_typ", "setoff_tax_rnd_typ");
				addColumnPathMap("xrate_rnd_typ", "xrate_rnd_typ");
				addColumnPathMap("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ");
				addColumnPathMap("wtax_rnd_typ", "wtax_rnd_typ");
				addColumnPathMap("stk_amt_rnd_typ", "stk_amt_rnd_typ");
				addColumnPathMap("stk_amt_dec_place", "stk_amt_dec_place");
				addColumnPathMap("sls_bdj_rnd_typ", "sls_bdj_rnd_typ");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("stk_lst_cnf_num", "stk_lst_cnf_num");
				addColumnPathMap("stk_lst_limit_num", "stk_lst_limit_num");
				addColumnPathMap("gm_std_upri_typ", "gm_std_upri_typ");
				addColumnPathMap("stk_std_upri_typ", "stk_std_upri_typ");
				addColumnPathMap("early_ship_dt_add_days", "early_ship_dt_add_days");
				addColumnPathMap("ac_slip_digit", "ac_slip_digit");
				addColumnPathMap("ac_slip_seq_flg", "ac_slip_seq_flg");
				addColumnPathMap("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0020.Co_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src_Upd01_DtlSub){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_DtlSub);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_DtlSub);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0020.CoSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src_Upd01_DtlLcl){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_DtlLcl);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_DtlLcl);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("co_alt_nm1", "co_alt_nm1");
				addColumnPathMap("co_alt_nm2", "co_alt_nm2");
				addColumnPathMap("co_alt_nm3", "co_alt_nm3");
				addColumnPathMap("co_alt_nm4", "co_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("co_repl_nm", "co_repl_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0020.CoLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}