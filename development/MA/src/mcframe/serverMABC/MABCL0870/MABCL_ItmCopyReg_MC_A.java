package mcframe.serverMABC.MABCL0870;

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
 * "MABCL_ItmCopyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_ItmCopyReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0870";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_ItmCopyReg.ItmCopy_UpdChk01 aItmCopy_UpdChk01;

	protected void initItmCopy_UpdChk01() {
		this.info = PDef.MA_MABCL0870_ItmCopy_UpdChk01_INFO;
		this.aItmCopy_UpdChk01 = ((MABCL_ItmCopyReg)this).new ItmCopy_UpdChk01();
	}

	public static MABCL_ItmCopyReg.ItmCopy_UpdChk01 crtItmCopy_UpdChk01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
		lgc.initItmCopy_UpdChk01();
		return lgc.aItmCopy_UpdChk01;
	}

	protected void paramItmCopy_UpdChk01(MCParam p) {
		if (this.aItmCopy_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCopy_UpdChk01.up0());
		p.addUpBlock(aItmCopy_UpdChk01.up1());
	}

	protected void doItmCopy_UpdChk01() {
		aItmCopy_UpdChk01.call();
	};

	/**
	 * ItmCopy_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR createItmCopy_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.create();
	}

	/**
	 * ItmCopy_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> createItmCopy_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
	}

	/**
	 * ItmCopy_UpdChk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR createItmCopy_UpdChk01_CndR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();
	}
	protected MABCL_ItmCopyReg.ItmCopy_Upd01 aItmCopy_Upd01;

	protected void initItmCopy_Upd01() {
		this.info = PDef.MA_MABCL0870_ItmCopy_Upd01_INFO;
		this.aItmCopy_Upd01 = ((MABCL_ItmCopyReg)this).new ItmCopy_Upd01();
	}

	public static MABCL_ItmCopyReg.ItmCopy_Upd01 crtItmCopy_Upd01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
		lgc.initItmCopy_Upd01();
		return lgc.aItmCopy_Upd01;
	}

	protected void paramItmCopy_Upd01(MCParam p) {
		if (this.aItmCopy_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCopy_Upd01.up0());
		p.addUpBlock(aItmCopy_Upd01.up1());
	}

	protected void doItmCopy_Upd01() {
		aItmCopy_Upd01.call();
	};

	/**
	 * ItmCopy_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR createItmCopy_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.create();
	}

	/**
	 * ItmCopy_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> createItmCopy_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
	}

	/**
	 * ItmCopy_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR createItmCopy_Upd01_CndR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();
	}
	protected MABCL_ItmCopyReg.ItmCopy_DelChk01 aItmCopy_DelChk01;

	protected void initItmCopy_DelChk01() {
		this.info = PDef.MA_MABCL0870_ItmCopy_DelChk01_INFO;
		this.aItmCopy_DelChk01 = ((MABCL_ItmCopyReg)this).new ItmCopy_DelChk01();
	}

	public static MABCL_ItmCopyReg.ItmCopy_DelChk01 crtItmCopy_DelChk01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
		lgc.initItmCopy_DelChk01();
		return lgc.aItmCopy_DelChk01;
	}

	protected void paramItmCopy_DelChk01(MCParam p) {
		if (this.aItmCopy_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCopy_DelChk01.up0());
	}

	protected void doItmCopy_DelChk01() {
		aItmCopy_DelChk01.call();
	};

	/**
	 * ItmCopy_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR createItmCopy_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.create();
	}

	/**
	 * ItmCopy_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> createItmCopy_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);
	}
	protected MABCL_ItmCopyReg.ItmCopy_Del01 aItmCopy_Del01;

	protected void initItmCopy_Del01() {
		this.info = PDef.MA_MABCL0870_ItmCopy_Del01_INFO;
		this.aItmCopy_Del01 = ((MABCL_ItmCopyReg)this).new ItmCopy_Del01();
	}

	public static MABCL_ItmCopyReg.ItmCopy_Del01 crtItmCopy_Del01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
		lgc.initItmCopy_Del01();
		return lgc.aItmCopy_Del01;
	}

	protected void paramItmCopy_Del01(MCParam p) {
		if (this.aItmCopy_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCopy_Del01.up0());
	}

	protected void doItmCopy_Del01() {
		aItmCopy_Del01.call();
	};

	/**
	 * ItmCopy_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR createItmCopy_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.create();
	}

	/**
	 * ItmCopy_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> createItmCopy_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);
	}
	protected MABCL_ItmCopyReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0870_Srch01_INFO;
		this.aSrch01 = ((MABCL_ItmCopyReg)this).new Srch01();
	}

	public static MABCL_ItmCopyReg.Srch01 crtSrch01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
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
	public mcframe.serverMABC.MABCL0870.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0870.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0870.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.Srch01_RsltR.class);
	}
	protected MABCL_ItmCopyReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MA_MABCL0870_Srch02_INFO;
		this.aSrch02 = ((MABCL_ItmCopyReg)this).new Srch02();
	}

	public static MABCL_ItmCopyReg.Srch02 crtSrch02() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
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
	public mcframe.serverMABC.MABCL0870.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMABC.MABCL0870.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.Srch02_RsltR createSrch02_RsltR(){
		return mcframe.serverMABC.MABCL0870.Srch02_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.Srch02_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.Srch02_RsltR.class);
	}
	protected MABCL_ItmCopyReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0870_Upd01_INFO;
		this.aUpd01 = ((MABCL_ItmCopyReg)this).new Upd01();
	}

	public static MABCL_ItmCopyReg.Upd01 crtUpd01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
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
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR createUpd01_CndR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();
	}
	protected MABCL_ItmCopyReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0870_Del01_INFO;
		this.aDel01 = ((MABCL_ItmCopyReg)this).new Del01();
	}

	public static MABCL_ItmCopyReg.Del01 crtDel01() {
		MABCL_ItmCopyReg lgc = new MABCL_ItmCopyReg();
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
	public mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ItmCopy_UpdChk01オペレーション.<p>
	 *
	 * 品目系マスタのコピー登録前のチェックを行います。<br>
	 */
	abstract public class ItmCopy_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCopy_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR up1;
		
		
		// コンストラクタ
		protected ItmCopy_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();

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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmCopy_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR createItmCopy_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.create();
		}

		/**
		 * ItmCopy_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> createItmCopy_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
		}

		/**
		 * ItmCopy_UpdChk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR createItmCopy_UpdChk01_CndR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();
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
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ex_on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>ex_past_end_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * ItmCopy_Upd01オペレーション.<p>
	 *
	 * 品目系マスタのコピー登録を行います。<br>
	 */
	abstract public class ItmCopy_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCopy_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR up1;
		
		
		// コンストラクタ
		protected ItmCopy_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();

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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmCopy_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR createItmCopy_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.create();
		}

		/**
		 * ItmCopy_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> createItmCopy_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
		}

		/**
		 * ItmCopy_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR createItmCopy_Upd01_CndR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();
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
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ex_on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>ex_past_end_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * ItmCopy_DelChk01オペレーション.<p>
	 *
	 * 品目系マスタの削除前のチェックを行います。<br>
	 */
	abstract public class ItmCopy_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCopy_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmCopy_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);

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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmCopy_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR createItmCopy_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.create();
		}

		/**
		 * ItmCopy_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> createItmCopy_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * ItmCopy_Del01オペレーション.<p>
	 *
	 * 品目系マスタの削除を行います。<br>
	 */
	abstract public class ItmCopy_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCopy_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmCopy_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);

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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmCopy_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR createItmCopy_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.create();
		}

		/**
		 * ItmCopy_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> createItmCopy_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目系マスタの検索を行います。<br>
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
		private final mcframe.serverMABC.MABCL0870.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0870.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM__R> c0_down0;
		/**
		 * 連携情報 PI<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #s0}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SUB_R&gt; （{@link #s1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_UNIT__R&gt; （{@link #s2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ATTACH_INFO_R&gt; （{@link #s3}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STOP_R&gt; （{@link #s4}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_NOT_FIX_R&gt; （{@link #s5}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STDCOST__R&gt; （{@link #s6}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SUNDRY_ITM_R&gt; （{@link #s7}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STRG_R&gt; （{@link #s8}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALLOC_CTL_R&gt; （{@link #s9}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STK_RPL_R&gt; （{@link #s10}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_ITM_R&gt; （{@link #s11}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_WG__R&gt; （{@link #s12}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_DTL__R&gt; （{@link #s13}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_OPER_R&gt; （{@link #s14}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #s15}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #s16}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_WK_COST_R&gt; （{@link #s17}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_INSP_PTN_R&gt; （{@link #s18}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_INSP_R&gt; （{@link #s19}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_SPEC_R&gt; （{@link #s20}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SITE_R&gt; （{@link #s21}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_VER_R&gt; （{@link #s22}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #s23}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #s24}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_R&gt; （{@link #s25}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_DESC_R&gt; （{@link #s26}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_R&gt; （{@link #s27}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_R&gt; （{@link #s28}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_ITM__R&gt; （{@link #s29}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SPLN_ITM_CONF_R&gt; （{@link #s30}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PURC_DDLV_LT_R&gt; （{@link #s31}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BP_ITM_R&gt; （{@link #s32}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PROC_UPRI__R&gt; （{@link #s33}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PROV_UPRI__R&gt; （{@link #s34}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PURC_UPRI__R&gt; （{@link #s35}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #s36}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SLS_UPRI__R&gt; （{@link #s37}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CST_SLS_UPRI__R&gt; （{@link #s38}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SET_ITM_R&gt; （{@link #s39}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SET_ITM_R&gt; （{@link #s40}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_IF_X_R&gt; （{@link #s41}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_CONFIG_R&gt; （{@link #s42}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_R&gt; （{@link #s43}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COEF_CONFIG_R&gt; （{@link #s44}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_EXPNS_R&gt; （{@link #s45}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_INPT_R&gt; （{@link #s46}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COST_ITM_OUT_R&gt; （{@link #s47}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_XPNS_PURC_ALC_R&gt; （{@link #s48}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_LG_GRP_R&gt; （{@link #s49}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt; （{@link #s50}）<br>
		 */
		public final String PI = "PI";

		/**
		 * DBC連携 s0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> s0;
		/**
		 * DBC連携 s1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SUB_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SUB_R> s1;
		/**
		 * DBC連携 s2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_UNIT__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_UNIT__R> s2;
		/**
		 * DBC連携 s3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ATTACH_INFO_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ATTACH_INFO_R> s3;
		/**
		 * DBC連携 s4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STOP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STOP_R> s4;
		/**
		 * DBC連携 s5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_NOT_FIX_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_NOT_FIX_R> s5;
		/**
		 * DBC連携 s6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STDCOST__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_STDCOST__R> s6;
		/**
		 * DBC連携 s7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SUNDRY_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SUNDRY_ITM_R> s7;
		/**
		 * DBC連携 s8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STRG_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STRG_R> s8;
		/**
		 * DBC連携 s9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALLOC_CTL_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALLOC_CTL_R> s9;
		/**
		 * DBC連携 s10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_RPL_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_STK_RPL_R> s10;
		/**
		 * DBC連携 s11<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALT_ITM_R> s11;
		/**
		 * DBC連携 s12<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_WG__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_WG__R> s12;
		/**
		 * DBC連携 s13<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_DTL__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_DTL__R> s13;
		/**
		 * DBC連携 s14<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_OPER_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_OPER_R> s14;
		/**
		 * DBC連携 s15<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> s15;
		/**
		 * DBC連携 s16<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> s16;
		/**
		 * DBC連携 s17<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_WK_COST_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_OPER_WK_COST_R> s17;
		/**
		 * DBC連携 s18<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_INSP_PTN_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_INSP_PTN_R> s18;
		/**
		 * DBC連携 s19<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_INSP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_INSP_R> s19;
		/**
		 * DBC連携 s20<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_SPEC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_INSP_SPEC_R> s20;
		/**
		 * DBC連携 s21<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SITE_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SITE_R> s21;
		/**
		 * DBC連携 s22<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_VER_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_VER_R> s22;
		/**
		 * DBC連携 s23<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> s23;
		/**
		 * DBC連携 s24<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> s24;
		/**
		 * DBC連携 s25<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_R> s25;
		/**
		 * DBC連携 s26<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_DESC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_DESC_R> s26;
		/**
		 * DBC連携 s27<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_R> s27;
		/**
		 * DBC連携 s28<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_R> s28;
		/**
		 * DBC連携 s29<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_ITM__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_MPS_ITM__R> s29;
		/**
		 * DBC連携 s30<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPLN_ITM_CONF_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SPLN_ITM_CONF_R> s30;
		/**
		 * DBC連携 s31<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PURC_DDLV_LT_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PURC_DDLV_LT_R> s31;
		/**
		 * DBC連携 s32<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_BP_ITM_R> s32;
		/**
		 * DBC連携 s33<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PROC_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PROC_UPRI__R> s33;
		/**
		 * DBC連携 s34<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PROV_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PROV_UPRI__R> s34;
		/**
		 * DBC連携 s35<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PURC_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PURC_UPRI__R> s35;
		/**
		 * DBC連携 s36<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> s36;
		/**
		 * DBC連携 s37<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SLS_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SLS_UPRI__R> s37;
		/**
		 * DBC連携 s38<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CST_SLS_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_CST_SLS_UPRI__R> s38;
		/**
		 * DBC連携 s39<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SET_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SET_ITM_R> s39;
		/**
		 * DBC連携 s40<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SET_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SET_ITM_R> s40;
		/**
		 * DBC連携 s41<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_X_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_IF_X_R> s41;
		/**
		 * DBC連携 s42<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_CONFIG_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_CTG_CONFIG_R> s42;
		/**
		 * DBC連携 s43<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_R> s43;
		/**
		 * DBC連携 s44<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COEF_CONFIG_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_COEF_CONFIG_R> s44;
		/**
		 * DBC連携 s45<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_EXPNS_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALC_EXPNS_R> s45;
		/**
		 * DBC連携 s46<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_INPT_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALC_INPT_R> s46;
		/**
		 * DBC連携 s47<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_ITM_OUT_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_COST_ITM_OUT_R> s47;
		/**
		 * DBC連携 s48<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_XPNS_PURC_ALC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_XPNS_PURC_ALC_R> s48;
		/**
		 * DBC連携 s49<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_LG_GRP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_LG_GRP_R> s49;
		/**
		 * DBC連携 s50<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STR_LN_R> s50;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0870.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0870.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM__R.create("T1"));
			s0 = MCController.create(MAM_ITM__R.create("T1"));
			s1 = MCController.create(MAM_ITM_SUB_R.create("T1"));
			s2 = MCController.create(MAM_ITM_UNIT__R.create("T1"));
			s3 = MCController.create(MAM_ATTACH_INFO_R.create("T1"));
			s4 = MCController.create(MAM_ITM_STOP_R.create("T1"));
			s5 = MCController.create(MAM_ITM_NOT_FIX_R.create("T1"));
			s6 = MCController.create(MAM_STDCOST__R.create("T1"));
			s7 = MCController.create(MAM_SUNDRY_ITM_R.create("T1"));
			s8 = MCController.create(MAM_ITM_STRG_R.create("T1"));
			s9 = MCController.create(MAM_ALLOC_CTL_R.create("T1"));
			s10 = MCController.create(MAM_STK_RPL_R.create("T1"));
			s11 = MCController.create(MAM_ALT_ITM_R.create("T1"));
			s12 = MCController.create(MAM_ITM_WG__R.create("T1"));
			s13 = MCController.create(MAM_ITM_DTL__R.create("T1"));
			s14 = MCController.create(MAM_ITM_OPER_R.create("T1"));
			s15 = MCController.create(MAM_BOM_R.create("T1"));
			s16 = MCController.create(MAM_BOM_R.create("T1"));
			s17 = MCController.create(MAM_OPER_WK_COST_R.create("T1"));
			s18 = MCController.create(MAM_ITM_INSP_PTN_R.create("T1"));
			s19 = MCController.create(MAM_ITM_INSP_R.create("T1"));
			s20 = MCController.create(MAM_INSP_SPEC_R.create("T1"));
			s21 = MCController.create(MAM_ITM_SITE_R.create("T1"));
			s22 = MCController.create(MAM_ITM_VER_R.create("T1"));
			s23 = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			s24 = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			s25 = MCController.create(MAM_ITM_SPEC_R.create("T1"));
			s26 = MCController.create(MAM_ITM_SPEC_DESC_R.create("T1"));
			s27 = MCController.create(MAM_ITM_COMP_R.create("T1"));
			s28 = MCController.create(MAM_ITM_COMP_R.create("T1"));
			s29 = MCController.create(MAM_MPS_ITM__R.create("T1"));
			s30 = MCController.create(MAM_SPLN_ITM_CONF_R.create("T1"));
			s31 = MCController.create(MAM_PURC_DDLV_LT_R.create("T1"));
			s32 = MCController.create(MAM_BP_ITM_R.create("T1"));
			s33 = MCController.create(MAM_PROC_UPRI__R.create("T1"));
			s34 = MCController.create(MAM_PROV_UPRI__R.create("T1"));
			s35 = MCController.create(MAM_PURC_UPRI__R.create("T1"));
			s36 = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			s37 = MCController.create(MAM_ITM_SLS_UPRI__R.create("T1"));
			s38 = MCController.create(MAM_CST_SLS_UPRI__R.create("T1"));
			s39 = MCController.create(MAM_SET_ITM_R.create("T1"));
			s40 = MCController.create(MAM_SET_ITM_R.create("T1"));
			s41 = MCController.create(MAM_IF_X_R.create("T1"));
			s42 = MCController.create(MAM_CTG_CONFIG_R.create("T1"));
			s43 = MCController.create(MAM_JNL_PTN_R.create("T1"));
			s44 = MCController.create(MAM_COEF_CONFIG_R.create("T1"));
			s45 = MCController.create(MAM_ALC_EXPNS_R.create("T1"));
			s46 = MCController.create(MAM_ALC_INPT_R.create("T1"));
			s47 = MCController.create(MAM_COST_ITM_OUT_R.create("T1"));
			s48 = MCController.create(MAM_XPNS_PURC_ALC_R.create("T1"));
			s49 = MCController.create(MAM_ITM_LG_GRP_R.create("T1"));
			s50 = MCController.create(MAM_ITM_STR_LN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ITM__R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(PI, s0);
			appendOpe(PI, s1);
			appendOpe(PI, s2);
			appendOpe(PI, s3);
			appendOpe(PI, s4);
			appendOpe(PI, s5);
			appendOpe(PI, s6);
			appendOpe(PI, s7);
			appendOpe(PI, s8);
			appendOpe(PI, s9);
			appendOpe(PI, s10);
			appendOpe(PI, s11);
			appendOpe(PI, s12);
			appendOpe(PI, s13);
			appendOpe(PI, s14);
			appendOpe(PI, s15);
			appendOpe(PI, s16);
			appendOpe(PI, s17);
			appendOpe(PI, s18);
			appendOpe(PI, s19);
			appendOpe(PI, s20);
			appendOpe(PI, s21);
			appendOpe(PI, s22);
			appendOpe(PI, s23);
			appendOpe(PI, s24);
			appendOpe(PI, s25);
			appendOpe(PI, s26);
			appendOpe(PI, s27);
			appendOpe(PI, s28);
			appendOpe(PI, s29);
			appendOpe(PI, s30);
			appendOpe(PI, s31);
			appendOpe(PI, s32);
			appendOpe(PI, s33);
			appendOpe(PI, s34);
			appendOpe(PI, s35);
			appendOpe(PI, s36);
			appendOpe(PI, s37);
			appendOpe(PI, s38);
			appendOpe(PI, s39);
			appendOpe(PI, s40);
			appendOpe(PI, s41);
			appendOpe(PI, s42);
			appendOpe(PI, s43);
			appendOpe(PI, s44);
			appendOpe(PI, s45);
			appendOpe(PI, s46);
			appendOpe(PI, s47);
			appendOpe(PI, s48);
			appendOpe(PI, s49);
			appendOpe(PI, s50);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * PI<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(PI)) {
				up_PI();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ITM__R&gt;（{@link #c0_down0}）=> down0()<br>
		 * PI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(PI)) {
				down_PI();
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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0870.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0870.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_off</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_nm</td></tr>
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
		 * @see mcframe.serverMABC.MABCL0870.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0870.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_cnt</td></tr>
		 * 	<tr><td><br></td><td>attach_info_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_cnt</td></tr>
		 * 	<tr><td><br></td><td>stdcost_cnt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_cnt</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_cnt</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_cnt</td></tr>
		 * 	<tr><td><br></td><td>bom_par_cnt</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_cnt</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_cnt</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_site_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_cnt</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_cnt</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_cnt</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_cnt</td></tr>
		 * 	<tr><td><br></td><td>if_x_cnt</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_cnt</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cnt</td></tr>
		 * 	<tr><td><br></td><td>coef_config_cnt</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_cnt</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_cnt</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_cnt</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------PI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループPIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_PI(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0870.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_ITM__R> src0_0){
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("base_itm_nm", "base_itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("chng_no", "chng_no");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0870.Srch01_RsltR r_dest, MAM_ITM__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0870.Srch01_RsltR> dest, MCList<MAM_ITM__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM__R r_src : src){
				mcframe.serverMABC.MABCL0870.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------PI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループPIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_PI(){
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目系マスタ（参照品目）の検索を行います。<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0870.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0870.Srch02_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM__R> c0_down0;
		/**
		 * 連携情報 PI<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #s0}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SUB_R&gt; （{@link #s1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_UNIT__R&gt; （{@link #s2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ATTACH_INFO_R&gt; （{@link #s3}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STOP_R&gt; （{@link #s4}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_NOT_FIX_R&gt; （{@link #s5}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STDCOST__R&gt; （{@link #s6}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SUNDRY_ITM_R&gt; （{@link #s7}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STRG_R&gt; （{@link #s8}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALLOC_CTL_R&gt; （{@link #s9}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STK_RPL_R&gt; （{@link #s10}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_ITM_R&gt; （{@link #s11}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_WG__R&gt; （{@link #s12}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_DTL__R&gt; （{@link #s13}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_OPER_R&gt; （{@link #s14}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #s15}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #s16}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_WK_COST_R&gt; （{@link #s17}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_INSP_PTN_R&gt; （{@link #s18}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_INSP_R&gt; （{@link #s19}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_SPEC_R&gt; （{@link #s20}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SITE_R&gt; （{@link #s21}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_VER_R&gt; （{@link #s22}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #s23}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #s24}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_R&gt; （{@link #s25}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_DESC_R&gt; （{@link #s26}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_R&gt; （{@link #s27}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_R&gt; （{@link #s28}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_ITM__R&gt; （{@link #s29}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SPLN_ITM_CONF_R&gt; （{@link #s30}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PURC_DDLV_LT_R&gt; （{@link #s31}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BP_ITM_R&gt; （{@link #s32}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PROC_UPRI__R&gt; （{@link #s33}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PROV_UPRI__R&gt; （{@link #s34}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PURC_UPRI__R&gt; （{@link #s35}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #s36}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SLS_UPRI__R&gt; （{@link #s37}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CST_SLS_UPRI__R&gt; （{@link #s38}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SET_ITM_R&gt; （{@link #s39}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SET_ITM_R&gt; （{@link #s40}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_IF_X_R&gt; （{@link #s41}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_CONFIG_R&gt; （{@link #s42}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_R&gt; （{@link #s43}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COEF_CONFIG_R&gt; （{@link #s44}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_EXPNS_R&gt; （{@link #s45}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_INPT_R&gt; （{@link #s46}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COST_ITM_OUT_R&gt; （{@link #s47}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_XPNS_PURC_ALC_R&gt; （{@link #s48}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_LG_GRP_R&gt; （{@link #s49}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt; （{@link #s50}）<br>
		 */
		public final String PI = "PI";

		/**
		 * DBC連携 s0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> s0;
		/**
		 * DBC連携 s1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SUB_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SUB_R> s1;
		/**
		 * DBC連携 s2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_UNIT__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_UNIT__R> s2;
		/**
		 * DBC連携 s3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ATTACH_INFO_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ATTACH_INFO_R> s3;
		/**
		 * DBC連携 s4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STOP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STOP_R> s4;
		/**
		 * DBC連携 s5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_NOT_FIX_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_NOT_FIX_R> s5;
		/**
		 * DBC連携 s6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STDCOST__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_STDCOST__R> s6;
		/**
		 * DBC連携 s7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SUNDRY_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SUNDRY_ITM_R> s7;
		/**
		 * DBC連携 s8<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STRG_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STRG_R> s8;
		/**
		 * DBC連携 s9<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALLOC_CTL_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALLOC_CTL_R> s9;
		/**
		 * DBC連携 s10<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_RPL_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_STK_RPL_R> s10;
		/**
		 * DBC連携 s11<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALT_ITM_R> s11;
		/**
		 * DBC連携 s12<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_WG__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_WG__R> s12;
		/**
		 * DBC連携 s13<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_DTL__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_DTL__R> s13;
		/**
		 * DBC連携 s14<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_OPER_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_OPER_R> s14;
		/**
		 * DBC連携 s15<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> s15;
		/**
		 * DBC連携 s16<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> s16;
		/**
		 * DBC連携 s17<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_WK_COST_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_OPER_WK_COST_R> s17;
		/**
		 * DBC連携 s18<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_INSP_PTN_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_INSP_PTN_R> s18;
		/**
		 * DBC連携 s19<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_INSP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_INSP_R> s19;
		/**
		 * DBC連携 s20<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_SPEC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_INSP_SPEC_R> s20;
		/**
		 * DBC連携 s21<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SITE_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SITE_R> s21;
		/**
		 * DBC連携 s22<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_VER_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_VER_R> s22;
		/**
		 * DBC連携 s23<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> s23;
		/**
		 * DBC連携 s24<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> s24;
		/**
		 * DBC連携 s25<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_R> s25;
		/**
		 * DBC連携 s26<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_DESC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_DESC_R> s26;
		/**
		 * DBC連携 s27<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_R> s27;
		/**
		 * DBC連携 s28<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_R> s28;
		/**
		 * DBC連携 s29<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_ITM__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_MPS_ITM__R> s29;
		/**
		 * DBC連携 s30<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPLN_ITM_CONF_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SPLN_ITM_CONF_R> s30;
		/**
		 * DBC連携 s31<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PURC_DDLV_LT_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PURC_DDLV_LT_R> s31;
		/**
		 * DBC連携 s32<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_BP_ITM_R> s32;
		/**
		 * DBC連携 s33<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PROC_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PROC_UPRI__R> s33;
		/**
		 * DBC連携 s34<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PROV_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PROV_UPRI__R> s34;
		/**
		 * DBC連携 s35<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PURC_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_PURC_UPRI__R> s35;
		/**
		 * DBC連携 s36<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> s36;
		/**
		 * DBC連携 s37<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SLS_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SLS_UPRI__R> s37;
		/**
		 * DBC連携 s38<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CST_SLS_UPRI__R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_CST_SLS_UPRI__R> s38;
		/**
		 * DBC連携 s39<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SET_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SET_ITM_R> s39;
		/**
		 * DBC連携 s40<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SET_ITM_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_SET_ITM_R> s40;
		/**
		 * DBC連携 s41<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_X_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_IF_X_R> s41;
		/**
		 * DBC連携 s42<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_CONFIG_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_CTG_CONFIG_R> s42;
		/**
		 * DBC連携 s43<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_R> s43;
		/**
		 * DBC連携 s44<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COEF_CONFIG_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_COEF_CONFIG_R> s44;
		/**
		 * DBC連携 s45<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_EXPNS_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALC_EXPNS_R> s45;
		/**
		 * DBC連携 s46<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_INPT_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ALC_INPT_R> s46;
		/**
		 * DBC連携 s47<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_ITM_OUT_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_COST_ITM_OUT_R> s47;
		/**
		 * DBC連携 s48<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_XPNS_PURC_ALC_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_XPNS_PURC_ALC_R> s48;
		/**
		 * DBC連携 s49<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_LG_GRP_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_LG_GRP_R> s49;
		/**
		 * DBC連携 s50<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt;<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STR_LN_R> s50;
		// 連携ロジック上り
		// 連携ロジック下り
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0870.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0870.Srch02_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM__R.create("T1"));
			s0 = MCController.create(MAM_ITM__R.create("T1"));
			s1 = MCController.create(MAM_ITM_SUB_R.create("T1"));
			s2 = MCController.create(MAM_ITM_UNIT__R.create("T1"));
			s3 = MCController.create(MAM_ATTACH_INFO_R.create("T1"));
			s4 = MCController.create(MAM_ITM_STOP_R.create("T1"));
			s5 = MCController.create(MAM_ITM_NOT_FIX_R.create("T1"));
			s6 = MCController.create(MAM_STDCOST__R.create("T1"));
			s7 = MCController.create(MAM_SUNDRY_ITM_R.create("T1"));
			s8 = MCController.create(MAM_ITM_STRG_R.create("T1"));
			s9 = MCController.create(MAM_ALLOC_CTL_R.create("T1"));
			s10 = MCController.create(MAM_STK_RPL_R.create("T1"));
			s11 = MCController.create(MAM_ALT_ITM_R.create("T1"));
			s12 = MCController.create(MAM_ITM_WG__R.create("T1"));
			s13 = MCController.create(MAM_ITM_DTL__R.create("T1"));
			s14 = MCController.create(MAM_ITM_OPER_R.create("T1"));
			s15 = MCController.create(MAM_BOM_R.create("T1"));
			s16 = MCController.create(MAM_BOM_R.create("T1"));
			s17 = MCController.create(MAM_OPER_WK_COST_R.create("T1"));
			s18 = MCController.create(MAM_ITM_INSP_PTN_R.create("T1"));
			s19 = MCController.create(MAM_ITM_INSP_R.create("T1"));
			s20 = MCController.create(MAM_INSP_SPEC_R.create("T1"));
			s21 = MCController.create(MAM_ITM_SITE_R.create("T1"));
			s22 = MCController.create(MAM_ITM_VER_R.create("T1"));
			s23 = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			s24 = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			s25 = MCController.create(MAM_ITM_SPEC_R.create("T1"));
			s26 = MCController.create(MAM_ITM_SPEC_DESC_R.create("T1"));
			s27 = MCController.create(MAM_ITM_COMP_R.create("T1"));
			s28 = MCController.create(MAM_ITM_COMP_R.create("T1"));
			s29 = MCController.create(MAM_MPS_ITM__R.create("T1"));
			s30 = MCController.create(MAM_SPLN_ITM_CONF_R.create("T1"));
			s31 = MCController.create(MAM_PURC_DDLV_LT_R.create("T1"));
			s32 = MCController.create(MAM_BP_ITM_R.create("T1"));
			s33 = MCController.create(MAM_PROC_UPRI__R.create("T1"));
			s34 = MCController.create(MAM_PROV_UPRI__R.create("T1"));
			s35 = MCController.create(MAM_PURC_UPRI__R.create("T1"));
			s36 = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			s37 = MCController.create(MAM_ITM_SLS_UPRI__R.create("T1"));
			s38 = MCController.create(MAM_CST_SLS_UPRI__R.create("T1"));
			s39 = MCController.create(MAM_SET_ITM_R.create("T1"));
			s40 = MCController.create(MAM_SET_ITM_R.create("T1"));
			s41 = MCController.create(MAM_IF_X_R.create("T1"));
			s42 = MCController.create(MAM_CTG_CONFIG_R.create("T1"));
			s43 = MCController.create(MAM_JNL_PTN_R.create("T1"));
			s44 = MCController.create(MAM_COEF_CONFIG_R.create("T1"));
			s45 = MCController.create(MAM_ALC_EXPNS_R.create("T1"));
			s46 = MCController.create(MAM_ALC_INPT_R.create("T1"));
			s47 = MCController.create(MAM_COST_ITM_OUT_R.create("T1"));
			s48 = MCController.create(MAM_XPNS_PURC_ALC_R.create("T1"));
			s49 = MCController.create(MAM_ITM_LG_GRP_R.create("T1"));
			s50 = MCController.create(MAM_ITM_STR_LN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ITM__R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(PI, s0);
			appendOpe(PI, s1);
			appendOpe(PI, s2);
			appendOpe(PI, s3);
			appendOpe(PI, s4);
			appendOpe(PI, s5);
			appendOpe(PI, s6);
			appendOpe(PI, s7);
			appendOpe(PI, s8);
			appendOpe(PI, s9);
			appendOpe(PI, s10);
			appendOpe(PI, s11);
			appendOpe(PI, s12);
			appendOpe(PI, s13);
			appendOpe(PI, s14);
			appendOpe(PI, s15);
			appendOpe(PI, s16);
			appendOpe(PI, s17);
			appendOpe(PI, s18);
			appendOpe(PI, s19);
			appendOpe(PI, s20);
			appendOpe(PI, s21);
			appendOpe(PI, s22);
			appendOpe(PI, s23);
			appendOpe(PI, s24);
			appendOpe(PI, s25);
			appendOpe(PI, s26);
			appendOpe(PI, s27);
			appendOpe(PI, s28);
			appendOpe(PI, s29);
			appendOpe(PI, s30);
			appendOpe(PI, s31);
			appendOpe(PI, s32);
			appendOpe(PI, s33);
			appendOpe(PI, s34);
			appendOpe(PI, s35);
			appendOpe(PI, s36);
			appendOpe(PI, s37);
			appendOpe(PI, s38);
			appendOpe(PI, s39);
			appendOpe(PI, s40);
			appendOpe(PI, s41);
			appendOpe(PI, s42);
			appendOpe(PI, s43);
			appendOpe(PI, s44);
			appendOpe(PI, s45);
			appendOpe(PI, s46);
			appendOpe(PI, s47);
			appendOpe(PI, s48);
			appendOpe(PI, s49);
			appendOpe(PI, s50);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * PI<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(PI)) {
				up_PI();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ITM__R&gt;（{@link #c0_down0}）=> down0()<br>
		 * PI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(PI)) {
				down_PI();
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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMABC.MABCL0870.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.Srch02_RsltR createSrch02_RsltR(){
			return mcframe.serverMABC.MABCL0870.Srch02_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.Srch02_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg_on</td></tr>
		 * 	<tr><td><br></td><td>release_flg_off</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_nm</td></tr>
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
		 * @see mcframe.serverMABC.MABCL0870.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0870.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ref_del_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ref_base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_cnt</td></tr>
		 * 	<tr><td><br></td><td>attach_info_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_cnt</td></tr>
		 * 	<tr><td><br></td><td>stdcost_cnt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_cnt</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_cnt</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_cnt</td></tr>
		 * 	<tr><td><br></td><td>bom_par_cnt</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_cnt</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_cnt</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_site_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_cnt</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_cnt</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_cnt</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cnt</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_cnt</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_cnt</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_cnt</td></tr>
		 * 	<tr><td><br></td><td>if_x_cnt</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_cnt</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cnt</td></tr>
		 * 	<tr><td><br></td><td>coef_config_cnt</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_cnt</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_cnt</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_cnt</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_cnt</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------PI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループPIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_PI(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0870.Srch02_RsltR> dest_Srch02_Rslt, MCList<MAM_ITM__R> src0_0){
			down_SELECT_c0_0(dest_Srch02_Rslt, src0_0);
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
				addColumnPathMap("ref_del_flg", "ref_del_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ref_itm_nm", "ref_itm_nm");
				addColumnPathMap("ref_base_itm_nm", "ref_base_itm_nm");
				addColumnPathMap("ref_itm_typ", "ref_itm_typ");
				addColumnPathMap("ref_itm_typ_d_cd", "ref_itm_typ_d_cd");
				addColumnPathMap("ref_itm_typ_d_nm", "ref_itm_typ_d_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0870.Srch02_RsltR r_dest, MAM_ITM__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0870.Srch02_RsltR> dest, MCList<MAM_ITM__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM__R r_src : src){
				mcframe.serverMABC.MABCL0870.Srch02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------PI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループPIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_PI(){
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目系マスタのコピー登録を行います。（マスタ画面用）<br>
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
		private final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR （{@link #chk01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR （{@link #upd01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> chk01_up0;
		public final mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR chk01_up1;
		public final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> upd01_up0;
		public final mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR upd01_up1;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.crtItmCopy_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.crtItmCopy_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR>)chk01.up(0);
			chk01_up1 = (mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR)chk01.up(1);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR>)upd01.up(0);
			upd01_up1 = (mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR)upd01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up1() => mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR （{@link #chk01_up1}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * up1() => mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR （{@link #upd01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, chk01_up1, upd01_up0, upd01_up1, up0(), up1());
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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR createUpd01_CndR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR.create();
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
		 * 	<tr><td><br></td><td>dest_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dest_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ex_on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>ex_past_end_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> dest0_0, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR dest0_1, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> dest1_0, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR dest1_1, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> src_Upd01_Dtl, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR src_Upd01_Cnd){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_chk01_1(dest0_1, src_Upd01_Cnd);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl);
			up_CALL_OPE01_upd01_1(dest1_1, src_Upd01_Cnd);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("dest_itm_cd", "dest_itm_cd");
				addColumnPathMap("dest_itm_sub1", "dest_itm_sub1");
				addColumnPathMap("dest_itm_sub2", "dest_itm_sub2");
				addColumnPathMap("dest_itm_sub3", "dest_itm_sub3");
				addColumnPathMap("dest_itm_nm", "dest_itm_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("itm_flg", "itm_flg");
				addColumnPathMap("itm_sub_flg", "itm_sub_flg");
				addColumnPathMap("itm_unit_flg", "itm_unit_flg");
				addColumnPathMap("attach_info_flg", "attach_info_flg");
				addColumnPathMap("itm_stop_flg", "itm_stop_flg");
				addColumnPathMap("itm_not_fix_flg", "itm_not_fix_flg");
				addColumnPathMap("stdcost_flg", "stdcost_flg");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_strg_flg", "itm_strg_flg");
				addColumnPathMap("alloc_ctl_flg", "alloc_ctl_flg");
				addColumnPathMap("stk_rpl_flg", "stk_rpl_flg");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("itm_wg_flg", "itm_wg_flg");
				addColumnPathMap("itm_dtl_flg", "itm_dtl_flg");
				addColumnPathMap("itm_oper_flg", "itm_oper_flg");
				addColumnPathMap("bom_par_flg", "bom_par_flg");
				addColumnPathMap("bom_chd_flg", "bom_chd_flg");
				addColumnPathMap("oper_wk_cost_flg", "oper_wk_cost_flg");
				addColumnPathMap("itm_insp_ptn_flg", "itm_insp_ptn_flg");
				addColumnPathMap("itm_insp_flg", "itm_insp_flg");
				addColumnPathMap("insp_spec_flg", "insp_spec_flg");
				addColumnPathMap("itm_site_flg", "itm_site_flg");
				addColumnPathMap("itm_ver_flg", "itm_ver_flg");
				addColumnPathMap("lot_inh_dest_flg", "lot_inh_dest_flg");
				addColumnPathMap("lot_inh_src_flg", "lot_inh_src_flg");
				addColumnPathMap("itm_spec_flg", "itm_spec_flg");
				addColumnPathMap("itm_spec_desc_flg", "itm_spec_desc_flg");
				addColumnPathMap("itm_comp_core_flg", "itm_comp_core_flg");
				addColumnPathMap("itm_comp_comp_flg", "itm_comp_comp_flg");
				addColumnPathMap("mps_itm_flg", "mps_itm_flg");
				addColumnPathMap("spln_itm_conf_flg", "spln_itm_conf_flg");
				addColumnPathMap("purc_ddlv_lt_flg", "purc_ddlv_lt_flg");
				addColumnPathMap("bp_itm_flg", "bp_itm_flg");
				addColumnPathMap("proc_upri_flg", "proc_upri_flg");
				addColumnPathMap("prov_upri_flg", "prov_upri_flg");
				addColumnPathMap("purc_upri_flg", "purc_upri_flg");
				addColumnPathMap("std_sls_upri_flg", "std_sls_upri_flg");
				addColumnPathMap("itm_sls_upri_flg", "itm_sls_upri_flg");
				addColumnPathMap("cst_sls_upri_flg", "cst_sls_upri_flg");
				addColumnPathMap("set_itm_main_flg", "set_itm_main_flg");
				addColumnPathMap("set_itm_set_flg", "set_itm_set_flg");
				addColumnPathMap("if_x_flg", "if_x_flg");
				addColumnPathMap("ctg_config_flg", "ctg_config_flg");
				addColumnPathMap("jnl_ptn_flg", "jnl_ptn_flg");
				addColumnPathMap("coef_config_flg", "coef_config_flg");
				addColumnPathMap("alc_expns_flg", "alc_expns_flg");
				addColumnPathMap("alc_inpt_flg", "alc_inpt_flg");
				addColumnPathMap("cost_itm_out_flg", "cost_itm_out_flg");
				addColumnPathMap("xpns_purc_alc_flg", "xpns_purc_alc_flg");
				addColumnPathMap("itm_lg_grp_flg", "itm_lg_grp_flg");
				addColumnPathMap("itm_str_ln_flg", "itm_str_ln_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
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
				addColumnPathMap("ex_on_del_flg", "ex_on_del_flg");
				addColumnPathMap("ex_past_end_dt", "ex_past_end_dt");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_1(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR dest, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR src) {
			createMap_up_CALL_OPE01_chk01_1().copy(dest, src);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("dest_itm_cd", "dest_itm_cd");
				addColumnPathMap("dest_itm_sub1", "dest_itm_sub1");
				addColumnPathMap("dest_itm_sub2", "dest_itm_sub2");
				addColumnPathMap("dest_itm_sub3", "dest_itm_sub3");
				addColumnPathMap("dest_itm_nm", "dest_itm_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("itm_flg", "itm_flg");
				addColumnPathMap("itm_sub_flg", "itm_sub_flg");
				addColumnPathMap("itm_unit_flg", "itm_unit_flg");
				addColumnPathMap("attach_info_flg", "attach_info_flg");
				addColumnPathMap("itm_stop_flg", "itm_stop_flg");
				addColumnPathMap("itm_not_fix_flg", "itm_not_fix_flg");
				addColumnPathMap("stdcost_flg", "stdcost_flg");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_strg_flg", "itm_strg_flg");
				addColumnPathMap("alloc_ctl_flg", "alloc_ctl_flg");
				addColumnPathMap("stk_rpl_flg", "stk_rpl_flg");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("itm_wg_flg", "itm_wg_flg");
				addColumnPathMap("itm_dtl_flg", "itm_dtl_flg");
				addColumnPathMap("itm_oper_flg", "itm_oper_flg");
				addColumnPathMap("bom_par_flg", "bom_par_flg");
				addColumnPathMap("bom_chd_flg", "bom_chd_flg");
				addColumnPathMap("oper_wk_cost_flg", "oper_wk_cost_flg");
				addColumnPathMap("itm_insp_ptn_flg", "itm_insp_ptn_flg");
				addColumnPathMap("itm_insp_flg", "itm_insp_flg");
				addColumnPathMap("insp_spec_flg", "insp_spec_flg");
				addColumnPathMap("itm_site_flg", "itm_site_flg");
				addColumnPathMap("itm_ver_flg", "itm_ver_flg");
				addColumnPathMap("lot_inh_dest_flg", "lot_inh_dest_flg");
				addColumnPathMap("lot_inh_src_flg", "lot_inh_src_flg");
				addColumnPathMap("itm_spec_flg", "itm_spec_flg");
				addColumnPathMap("itm_spec_desc_flg", "itm_spec_desc_flg");
				addColumnPathMap("itm_comp_core_flg", "itm_comp_core_flg");
				addColumnPathMap("itm_comp_comp_flg", "itm_comp_comp_flg");
				addColumnPathMap("mps_itm_flg", "mps_itm_flg");
				addColumnPathMap("spln_itm_conf_flg", "spln_itm_conf_flg");
				addColumnPathMap("purc_ddlv_lt_flg", "purc_ddlv_lt_flg");
				addColumnPathMap("bp_itm_flg", "bp_itm_flg");
				addColumnPathMap("proc_upri_flg", "proc_upri_flg");
				addColumnPathMap("prov_upri_flg", "prov_upri_flg");
				addColumnPathMap("purc_upri_flg", "purc_upri_flg");
				addColumnPathMap("std_sls_upri_flg", "std_sls_upri_flg");
				addColumnPathMap("itm_sls_upri_flg", "itm_sls_upri_flg");
				addColumnPathMap("cst_sls_upri_flg", "cst_sls_upri_flg");
				addColumnPathMap("set_itm_main_flg", "set_itm_main_flg");
				addColumnPathMap("set_itm_set_flg", "set_itm_set_flg");
				addColumnPathMap("if_x_flg", "if_x_flg");
				addColumnPathMap("ctg_config_flg", "ctg_config_flg");
				addColumnPathMap("jnl_ptn_flg", "jnl_ptn_flg");
				addColumnPathMap("coef_config_flg", "coef_config_flg");
				addColumnPathMap("alc_expns_flg", "alc_expns_flg");
				addColumnPathMap("alc_inpt_flg", "alc_inpt_flg");
				addColumnPathMap("cost_itm_out_flg", "cost_itm_out_flg");
				addColumnPathMap("xpns_purc_alc_flg", "xpns_purc_alc_flg");
				addColumnPathMap("itm_lg_grp_flg", "itm_lg_grp_flg");
				addColumnPathMap("itm_str_ln_flg", "itm_str_ln_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ex_on_del_flg", "ex_on_del_flg");
				addColumnPathMap("ex_past_end_dt", "ex_past_end_dt");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_1(mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR dest, mcframe.serverMABC.MABCL0870.ItmCopy_UpdChk01_CndR src) {
			createMap_up_CALL_OPE01_upd01_1().copy(dest, src);
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
	 * 品目系マスタの削除を行います。（マスタ画面用）<br>
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
		private final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.ItmCopy_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.crtItmCopy_DelChk01();
			del01 = mcframe.serverMABC.MABCL0870.MABCL_ItmCopyReg.crtItmCopy_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sub_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>attach_info_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>stdcost_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_strg_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_rpl_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_par_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_chd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_wk_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_site_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_dest_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_src_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_desc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_core_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_conf_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_lt_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_main_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_set_flg</td></tr>
		 * 	<tr><td><br></td><td>if_x_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_config_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>coef_config_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_expns_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_itm_out_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_alc_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_lg_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_str_ln_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmCopyReg)MABCL_ItmCopyReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> src_Del01_Dtl){
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_flg", "itm_flg");
				addColumnPathMap("itm_sub_flg", "itm_sub_flg");
				addColumnPathMap("itm_unit_flg", "itm_unit_flg");
				addColumnPathMap("attach_info_flg", "attach_info_flg");
				addColumnPathMap("itm_stop_flg", "itm_stop_flg");
				addColumnPathMap("itm_not_fix_flg", "itm_not_fix_flg");
				addColumnPathMap("stdcost_flg", "stdcost_flg");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_strg_flg", "itm_strg_flg");
				addColumnPathMap("alloc_ctl_flg", "alloc_ctl_flg");
				addColumnPathMap("stk_rpl_flg", "stk_rpl_flg");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("itm_wg_flg", "itm_wg_flg");
				addColumnPathMap("itm_dtl_flg", "itm_dtl_flg");
				addColumnPathMap("itm_oper_flg", "itm_oper_flg");
				addColumnPathMap("bom_par_flg", "bom_par_flg");
				addColumnPathMap("bom_chd_flg", "bom_chd_flg");
				addColumnPathMap("oper_wk_cost_flg", "oper_wk_cost_flg");
				addColumnPathMap("itm_insp_ptn_flg", "itm_insp_ptn_flg");
				addColumnPathMap("itm_insp_flg", "itm_insp_flg");
				addColumnPathMap("insp_spec_flg", "insp_spec_flg");
				addColumnPathMap("itm_site_flg", "itm_site_flg");
				addColumnPathMap("itm_ver_flg", "itm_ver_flg");
				addColumnPathMap("lot_inh_dest_flg", "lot_inh_dest_flg");
				addColumnPathMap("lot_inh_src_flg", "lot_inh_src_flg");
				addColumnPathMap("itm_spec_flg", "itm_spec_flg");
				addColumnPathMap("itm_spec_desc_flg", "itm_spec_desc_flg");
				addColumnPathMap("itm_comp_core_flg", "itm_comp_core_flg");
				addColumnPathMap("itm_comp_comp_flg", "itm_comp_comp_flg");
				addColumnPathMap("mps_itm_flg", "mps_itm_flg");
				addColumnPathMap("spln_itm_conf_flg", "spln_itm_conf_flg");
				addColumnPathMap("purc_ddlv_lt_flg", "purc_ddlv_lt_flg");
				addColumnPathMap("bp_itm_flg", "bp_itm_flg");
				addColumnPathMap("proc_upri_flg", "proc_upri_flg");
				addColumnPathMap("prov_upri_flg", "prov_upri_flg");
				addColumnPathMap("purc_upri_flg", "purc_upri_flg");
				addColumnPathMap("std_sls_upri_flg", "std_sls_upri_flg");
				addColumnPathMap("itm_sls_upri_flg", "itm_sls_upri_flg");
				addColumnPathMap("cst_sls_upri_flg", "cst_sls_upri_flg");
				addColumnPathMap("set_itm_main_flg", "set_itm_main_flg");
				addColumnPathMap("set_itm_set_flg", "set_itm_set_flg");
				addColumnPathMap("if_x_flg", "if_x_flg");
				addColumnPathMap("ctg_config_flg", "ctg_config_flg");
				addColumnPathMap("jnl_ptn_flg", "jnl_ptn_flg");
				addColumnPathMap("coef_config_flg", "coef_config_flg");
				addColumnPathMap("alc_expns_flg", "alc_expns_flg");
				addColumnPathMap("alc_inpt_flg", "alc_inpt_flg");
				addColumnPathMap("cost_itm_out_flg", "cost_itm_out_flg");
				addColumnPathMap("xpns_purc_alc_flg", "xpns_purc_alc_flg");
				addColumnPathMap("itm_lg_grp_flg", "itm_lg_grp_flg");
				addColumnPathMap("itm_str_ln_flg", "itm_str_ln_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_flg", "itm_flg");
				addColumnPathMap("itm_sub_flg", "itm_sub_flg");
				addColumnPathMap("itm_unit_flg", "itm_unit_flg");
				addColumnPathMap("attach_info_flg", "attach_info_flg");
				addColumnPathMap("itm_stop_flg", "itm_stop_flg");
				addColumnPathMap("itm_not_fix_flg", "itm_not_fix_flg");
				addColumnPathMap("stdcost_flg", "stdcost_flg");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_strg_flg", "itm_strg_flg");
				addColumnPathMap("alloc_ctl_flg", "alloc_ctl_flg");
				addColumnPathMap("stk_rpl_flg", "stk_rpl_flg");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("itm_wg_flg", "itm_wg_flg");
				addColumnPathMap("itm_dtl_flg", "itm_dtl_flg");
				addColumnPathMap("itm_oper_flg", "itm_oper_flg");
				addColumnPathMap("bom_par_flg", "bom_par_flg");
				addColumnPathMap("bom_chd_flg", "bom_chd_flg");
				addColumnPathMap("oper_wk_cost_flg", "oper_wk_cost_flg");
				addColumnPathMap("itm_insp_ptn_flg", "itm_insp_ptn_flg");
				addColumnPathMap("itm_insp_flg", "itm_insp_flg");
				addColumnPathMap("insp_spec_flg", "insp_spec_flg");
				addColumnPathMap("itm_site_flg", "itm_site_flg");
				addColumnPathMap("itm_ver_flg", "itm_ver_flg");
				addColumnPathMap("lot_inh_dest_flg", "lot_inh_dest_flg");
				addColumnPathMap("lot_inh_src_flg", "lot_inh_src_flg");
				addColumnPathMap("itm_spec_flg", "itm_spec_flg");
				addColumnPathMap("itm_spec_desc_flg", "itm_spec_desc_flg");
				addColumnPathMap("itm_comp_core_flg", "itm_comp_core_flg");
				addColumnPathMap("itm_comp_comp_flg", "itm_comp_comp_flg");
				addColumnPathMap("mps_itm_flg", "mps_itm_flg");
				addColumnPathMap("spln_itm_conf_flg", "spln_itm_conf_flg");
				addColumnPathMap("purc_ddlv_lt_flg", "purc_ddlv_lt_flg");
				addColumnPathMap("bp_itm_flg", "bp_itm_flg");
				addColumnPathMap("proc_upri_flg", "proc_upri_flg");
				addColumnPathMap("prov_upri_flg", "prov_upri_flg");
				addColumnPathMap("purc_upri_flg", "purc_upri_flg");
				addColumnPathMap("std_sls_upri_flg", "std_sls_upri_flg");
				addColumnPathMap("itm_sls_upri_flg", "itm_sls_upri_flg");
				addColumnPathMap("cst_sls_upri_flg", "cst_sls_upri_flg");
				addColumnPathMap("set_itm_main_flg", "set_itm_main_flg");
				addColumnPathMap("set_itm_set_flg", "set_itm_set_flg");
				addColumnPathMap("if_x_flg", "if_x_flg");
				addColumnPathMap("ctg_config_flg", "ctg_config_flg");
				addColumnPathMap("jnl_ptn_flg", "jnl_ptn_flg");
				addColumnPathMap("coef_config_flg", "coef_config_flg");
				addColumnPathMap("alc_expns_flg", "alc_expns_flg");
				addColumnPathMap("alc_inpt_flg", "alc_inpt_flg");
				addColumnPathMap("cost_itm_out_flg", "cost_itm_out_flg");
				addColumnPathMap("xpns_purc_alc_flg", "xpns_purc_alc_flg");
				addColumnPathMap("itm_lg_grp_flg", "itm_lg_grp_flg");
				addColumnPathMap("itm_str_ln_flg", "itm_str_ln_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0870.ItmCopy_DelChk01_DtlR r_dest = dest.createRow();
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