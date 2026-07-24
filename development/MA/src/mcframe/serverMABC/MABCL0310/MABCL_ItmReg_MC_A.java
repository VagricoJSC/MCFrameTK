package mcframe.serverMABC.MABCL0310;

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
 * "MABCL_ItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_ItmReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0310";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_ItmReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0310_Srch01_INFO;
		this.aSrch01 = ((MABCL_ItmReg)this).new Srch01();
	}

	public static MABCL_ItmReg.Srch01 crtSrch01() {
		MABCL_ItmReg lgc = new MABCL_ItmReg();
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
		p.addDownBlock(aSrch01.down3());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0310.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0310.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Srch01_Rslt1R createSrch01_RsltR(){
		return mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_SubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0320.Srch01_RsltR createSrch01_SubR(){
		return mcframe.serverMABC.MABCL0320.Srch01_RsltR.create();
	}

	/**
	 * Srch01_SubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> createSrch01_SubL(){
		return MCList.create(mcframe.serverMABC.MABCL0320.Srch01_RsltR.class);
	}

	/**
	 * Srch01_UnitブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0330.Srch01_RsltR createSrch01_UnitR(){
		return mcframe.serverMABC.MABCL0330.Srch01_RsltR.create();
	}

	/**
	 * Srch01_UnitブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> createSrch01_UnitL(){
		return MCList.create(mcframe.serverMABC.MABCL0330.Srch01_RsltR.class);
	}

	/**
	 * Srch01_LclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0380.Srch01_RsltR createSrch01_LclR(){
		return mcframe.serverMABC.MABCL0380.Srch01_RsltR.create();
	}

	/**
	 * Srch01_LclブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> createSrch01_LclL(){
		return MCList.create(mcframe.serverMABC.MABCL0380.Srch01_RsltR.class);
	}
	protected MABCL_ItmReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0310_Upd01_INFO;
		this.aUpd01 = ((MABCL_ItmReg)this).new Upd01();
	}

	public static MABCL_ItmReg.Upd01 crtUpd01() {
		MABCL_ItmReg lgc = new MABCL_ItmReg();
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
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Upd01_Dtl1R createUpd01_DtlR(){
		return mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0390.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMABC.MABCL0390.Upd01_CndR.create();
	}

	/**
	 * Upd01_SubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR createUpd01_SubR(){
		return mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_SubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> createUpd01_SubL(){
		return MCList.create(mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_UnitブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR createUpd01_UnitR(){
		return mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_UnitブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> createUpd01_UnitL(){
		return MCList.create(mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_LclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR createUpd01_LclR(){
		return mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_LclブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> createUpd01_LclL(){
		return MCList.create(mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目マスタの検索を行います。<br>
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
		private final mcframe.serverMABC.MABCL0310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> down3;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0390.MABCL_ItmLst.Srch01 （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * 連携オペレーション c0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0390.MABCL_ItmLst.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0390.Srch01_CndR （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0390.Srch01_Rslt1R&gt; （{@link #c0_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0390.MABCL_ItmLst.Srch01 c0;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0390.Srch01_CndR c0_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.Srch01 （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * 連携オペレーション c1<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0320.Srch01_CndR （{@link #c1_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0320.Srch01_RsltR&gt; （{@link #c1_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.Srch01 c1;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0320.Srch01_CndR c1_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.Srch01 （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * 連携オペレーション c2<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0330.Srch01_CndR （{@link #c2_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0330.Srch01_RsltR&gt; （{@link #c2_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.Srch01 c2;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0330.Srch01_CndR c2_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.Srch01 （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * 連携オペレーション c3<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL0380.Srch01_CndR （{@link #c3_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0380.Srch01_RsltR&gt; （{@link #c3_down0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.Srch01 c3;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL0380.Srch01_CndR c3_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> c3_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0310.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0320.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0330.Srch01_RsltR.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL0380.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = mcframe.serverMABC.MABCL0390.MABCL_ItmLst.crtSrch01();
			c1 = mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.crtSrch01();
			c2 = mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.crtSrch01();
			c3 = mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.crtSrch01();
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (mcframe.serverMABC.MABCL0390.Srch01_CndR)c0.up(0);
			c0_down0 = (MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R>)c0.down(0);
			c1_up0 = (mcframe.serverMABC.MABCL0320.Srch01_CndR)c1.up(0);
			c1_down0 = (MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR>)c1.down(0);
			c2_up0 = (mcframe.serverMABC.MABCL0330.Srch01_CndR)c2.up(0);
			c2_down0 = (MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR>)c2.down(0);
			c3_up0 = (mcframe.serverMABC.MABCL0380.Srch01_CndR)c3.up(0);
			c3_down0 = (MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR>)c3.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => mcframe.serverMABC.MABCL0390.Srch01_CndR （{@link #c0_up0}）<br>
		 * SELECT_SUB1<br>
		 * up0() => mcframe.serverMABC.MABCL0320.Srch01_CndR （{@link #c1_up0}）<br>
		 * SELECT_SUB2<br>
		 * up0() => mcframe.serverMABC.MABCL0330.Srch01_CndR （{@link #c2_up0}）<br>
		 * SELECT_SUB3<br>
		 * up0() => mcframe.serverMABC.MABCL0380.Srch01_CndR （{@link #c3_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1(c1_up0, up0());
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2(c2_up0, up0());
			}
			if (key.equals(SELECT_SUB3)) {
				up_SELECT_SUB3(c3_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0390.Srch01_Rslt1R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0320.Srch01_RsltR&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0330.Srch01_RsltR&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;mcframe.serverMABC.MABCL0380.Srch01_RsltR&gt;（{@link #c3_down0}）=> down3()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down2(), c2_down0);
			}
			if (key.equals(SELECT_SUB3)) {
				down_SELECT_SUB3(down3(), c3_down0);
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
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ItmReg)MABCL_ItmReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0310.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0310.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Srch01_Rslt1R createSrch01_RsltR(){
			return mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_SubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0320.Srch01_RsltR createSrch01_SubR(){
			return mcframe.serverMABC.MABCL0320.Srch01_RsltR.create();
		}

		/**
		 * Srch01_SubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> createSrch01_SubL(){
			return MCList.create(mcframe.serverMABC.MABCL0320.Srch01_RsltR.class);
		}

		/**
		 * Srch01_UnitブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0330.Srch01_RsltR createSrch01_UnitR(){
			return mcframe.serverMABC.MABCL0330.Srch01_RsltR.create();
		}

		/**
		 * Srch01_UnitブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> createSrch01_UnitL(){
			return MCList.create(mcframe.serverMABC.MABCL0330.Srch01_RsltR.class);
		}

		/**
		 * Srch01_LclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0380.Srch01_RsltR createSrch01_LclR(){
			return mcframe.serverMABC.MABCL0380.Srch01_RsltR.create();
		}

		/**
		 * Srch01_LclブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> createSrch01_LclL(){
			return MCList.create(mcframe.serverMABC.MABCL0380.Srch01_RsltR.class);
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
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0310.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0310.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>base_itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>conts_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_nm</td></tr>
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
		 * 	<tr><td><br></td><td>hs_cd</td></tr>
		 * 	<tr><td><br></td><td>hs_nm</td></tr>
		 * 	<tr><td><br></td><td>jan_typ</td></tr>
		 * 	<tr><td><br></td><td>jan_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>jan_cd</td></tr>
		 * 	<tr><td><br></td><td>itf_cd</td></tr>
		 * 	<tr><td><br></td><td>gtin_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_ts_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no_c</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_nm</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_itm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>release_usr_nm</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>pckg_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm_std</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm4</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmReg)MABCL_ItmReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(mcframe.serverMABC.MABCL0390.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0310.Srch01_CndR src_Srch01_Cnd){
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("th_image_flg", "th_image_flg");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(mcframe.serverMABC.MABCL0390.Srch01_CndR dest, mcframe.serverMABC.MABCL0310.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(mcframe.serverMABC.MABCL0320.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0310.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB1_c1_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_up_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0320.Srch01_CndR dest, mcframe.serverMABC.MABCL0310.Srch01_CndR src) {
			createMap_up_SELECT_SUB1_c1_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(mcframe.serverMABC.MABCL0330.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0310.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB2_c2_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_up_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0330.Srch01_CndR dest, mcframe.serverMABC.MABCL0310.Srch01_CndR src) {
			createMap_up_SELECT_SUB2_c2_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB3(mcframe.serverMABC.MABCL0380.Srch01_CndR dest0_0, mcframe.serverMABC.MABCL0310.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB3_c3_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_up_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("reg_flg", "reg_flg");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB3_c3_0(mcframe.serverMABC.MABCL0380.Srch01_CndR dest, mcframe.serverMABC.MABCL0310.Srch01_CndR src) {
			createMap_up_SELECT_SUB3_c3_0().copy(dest, src);
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> dest_Srch01_Rslt, MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> src0_0){
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
				addColumnPathMap("base_itm_alt_nm1", "base_itm_alt_nm1");
				addColumnPathMap("base_itm_alt_nm2", "base_itm_alt_nm2");
				addColumnPathMap("base_itm_alt_nm3", "base_itm_alt_nm3");
				addColumnPathMap("base_itm_alt_nm4", "base_itm_alt_nm4");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("stk_mng_typ_nm", "stk_mng_typ_nm");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("asset_mng_typ_nm", "asset_mng_typ_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("rnd_typ_nm", "rnd_typ_nm");
				addColumnPathMap("dim_unit_cd", "dim_unit_cd");
				addColumnPathMap("dim_unit_nm", "dim_unit_nm");
				addColumnPathMap("dim", "dim");
				addColumnPathMap("wt_unit_cd", "wt_unit_cd");
				addColumnPathMap("wt_unit_nm", "wt_unit_nm");
				addColumnPathMap("wt", "wt");
				addColumnPathMap("conts_unit_cd", "conts_unit_cd");
				addColumnPathMap("conts_unit_nm", "conts_unit_nm");
				addColumnPathMap("conts_qty", "conts_qty");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("sls_itm_grp_nm", "sls_itm_grp_nm");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
				addColumnPathMap("hs_cd", "hs_cd");
				addColumnPathMap("hs_nm", "hs_nm");
				addColumnPathMap("jan_typ", "jan_typ");
				addColumnPathMap("jan_typ_nm", "jan_typ_nm");
				addColumnPathMap("jan_cd", "jan_cd");
				addColumnPathMap("itf_cd", "itf_cd");
				addColumnPathMap("gtin_cd", "gtin_cd");
				addColumnPathMap("memo1_c", "memo1_c");
				addColumnPathMap("memo2_c", "memo2_c");
				addColumnPathMap("memo3_c", "memo3_c");
				addColumnPathMap("ins_usr_id_c", "ins_usr_id_c");
				addColumnPathMap("ins_usr_nm_c", "ins_usr_nm_c");
				addColumnPathMap("ins_ts_c", "ins_ts_c");
				addColumnPathMap("ins_func_id_c", "ins_func_id_c");
				addColumnPathMap("ins_func_nm_c", "ins_func_nm_c");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_usr_id_c", "upd_usr_id_c");
				addColumnPathMap("upd_usr_nm_c", "upd_usr_nm_c");
				addColumnPathMap("upd_ts_c", "upd_ts_c");
				addColumnPathMap("upd_func_id_c", "upd_func_id_c");
				addColumnPathMap("upd_func_nm_c", "upd_func_nm_c");
				addColumnPathMap("upd_srv_req_no_c", "upd_srv_req_no_c");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("itm_jnl_nm", "itm_jnl_nm");
				addColumnPathMap("ac_itm_grp_cd", "ac_itm_grp_cd");
				addColumnPathMap("ac_itm_grp_nm", "ac_itm_grp_nm");
				addColumnPathMap("minus_stk_flg", "minus_stk_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("gi_alloc_flg", "gi_alloc_flg");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ship_unit_cd", "ship_unit_cd");
				addColumnPathMap("ship_unit_nm", "ship_unit_nm");
				addColumnPathMap("mfg_unit_cd", "mfg_unit_cd");
				addColumnPathMap("mfg_unit_nm", "mfg_unit_nm");
				addColumnPathMap("purc_unit_cd", "purc_unit_cd");
				addColumnPathMap("purc_unit_nm", "purc_unit_nm");
				addColumnPathMap("pckg_unit_cd", "pckg_unit_cd");
				addColumnPathMap("pckg_unit_nm", "pckg_unit_nm");
				addColumnPathMap("pack_alloc_flg", "pack_alloc_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_mng_typ_nm", "lot_mng_typ_nm");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_typ_nm", "lot_no_typ_nm");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("lot_no_ptn_nm", "lot_no_ptn_nm");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_mng_typ_nm", "sublot_mng_typ_nm");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_typ_nm", "sublot_no_typ_nm");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("sublot_no_ptn_nm", "sublot_no_ptn_nm");
				addColumnPathMap("bp_lot_flg", "bp_lot_flg");
				addColumnPathMap("insp_bind_typ", "insp_bind_typ");
				addColumnPathMap("insp_bind_typ_nm", "insp_bind_typ_nm");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("mrkt_judg_flg", "mrkt_judg_flg");
				addColumnPathMap("mrkt_judg_role_cd", "mrkt_judg_role_cd");
				addColumnPathMap("mrkt_judg_role_nm", "mrkt_judg_role_nm");
				addColumnPathMap("mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_cd");
				addColumnPathMap("mrkt_judg_upd_role_nm", "mrkt_judg_upd_role_nm");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("lmt_ctl_categ", "lmt_ctl_categ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_unit_nm", "cont_fctr_unit_nm");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_rnd_typ_nm", "cont_fctr_rnd_typ_nm");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno1_mng_typ_nm", "sno1_mng_typ_nm");
				addColumnPathMap("slo_sno1_flg", "slo_sno1_flg");
				addColumnPathMap("rqmt_sno1_flg", "rqmt_sno1_flg");
				addColumnPathMap("sno1_num_typ", "sno1_num_typ");
				addColumnPathMap("sno1_num_typ_nm", "sno1_num_typ_nm");
				addColumnPathMap("sno1_ptn_cd", "sno1_ptn_cd");
				addColumnPathMap("sno1_ptn_nm", "sno1_ptn_nm");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno2_mng_typ_nm", "sno2_mng_typ_nm");
				addColumnPathMap("slo_sno2_flg", "slo_sno2_flg");
				addColumnPathMap("rqmt_sno2_flg", "rqmt_sno2_flg");
				addColumnPathMap("sno2_num_typ", "sno2_num_typ");
				addColumnPathMap("sno2_num_typ_nm", "sno2_num_typ_nm");
				addColumnPathMap("sno2_ptn_cd", "sno2_ptn_cd");
				addColumnPathMap("sno2_ptn_nm", "sno2_ptn_nm");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno3_mng_typ_nm", "sno3_mng_typ_nm");
				addColumnPathMap("slo_sno3_flg", "slo_sno3_flg");
				addColumnPathMap("rqmt_sno3_flg", "rqmt_sno3_flg");
				addColumnPathMap("sno3_num_typ", "sno3_num_typ");
				addColumnPathMap("sno3_num_typ_nm", "sno3_num_typ_nm");
				addColumnPathMap("sno3_ptn_cd", "sno3_ptn_cd");
				addColumnPathMap("sno3_ptn_nm", "sno3_ptn_nm");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno4_mng_typ_nm", "sno4_mng_typ_nm");
				addColumnPathMap("slo_sno4_flg", "slo_sno4_flg");
				addColumnPathMap("rqmt_sno4_flg", "rqmt_sno4_flg");
				addColumnPathMap("sno4_num_typ", "sno4_num_typ");
				addColumnPathMap("sno4_num_typ_nm", "sno4_num_typ_nm");
				addColumnPathMap("sno4_ptn_cd", "sno4_ptn_cd");
				addColumnPathMap("sno4_ptn_nm", "sno4_ptn_nm");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mfg_inst_unit_typ_nm", "mfg_inst_unit_typ_nm");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("mrp_proc_typ_nm", "mrp_proc_typ_nm");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("rqmt_typ_nm", "rqmt_typ_nm");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("prod_pln_typ_nm", "prod_pln_typ_nm");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("cntry_org_nm", "cntry_org_nm");
				addColumnPathMap("comp_spec_typ", "comp_spec_typ");
				addColumnPathMap("comp_spec_typ_nm", "comp_spec_typ_nm");
				addColumnPathMap("comp_rev_at_slo_flg", "comp_rev_at_slo_flg");
				addColumnPathMap("comp_core_itm_flg", "comp_core_itm_flg");
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("itm_spec_grp_nm", "itm_spec_grp_nm");
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("sls_upri_grp_nm", "sls_upri_grp_nm");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slo_proc_flg", "slo_proc_flg");
				addColumnPathMap("slo_proc_typ", "slo_proc_typ");
				addColumnPathMap("slo_proc_typ_nm", "slo_proc_typ_nm");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_inst_typ_nm", "ship_inst_typ_nm");
				addColumnPathMap("ship_lot_back_stop_flg", "ship_lot_back_stop_flg");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("itm_ship_grp_nm", "itm_ship_grp_nm");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
				addColumnPathMap("arr_skip_flg", "arr_skip_flg");
				addColumnPathMap("purc_dlv_slip_flg", "purc_dlv_slip_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_term_nm", "ship_term_nm");
				addColumnPathMap("exim_xpns_typ", "exim_xpns_typ");
				addColumnPathMap("exim_xpns_typ_nm", "exim_xpns_typ_nm");
				addColumnPathMap("stk_lst_flg", "stk_lst_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ref_itm_nm", "ref_itm_nm");
				addColumnPathMap("ext_sys_no_itm", "ext_sys_no_itm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("calc_ptn_cd", "calc_ptn_cd");
				addColumnPathMap("calc_ptn_nm", "calc_ptn_nm");
				addColumnPathMap("cost_std_qty", "cost_std_qty");
				addColumnPathMap("itm_alc_grp", "itm_alc_grp");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("release_usr_nm", "release_usr_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R r_dest, mcframe.serverMABC.MABCL0390.Srch01_Rslt1R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> dest, MCList<mcframe.serverMABC.MABCL0390.Srch01_Rslt1R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(mcframe.serverMABC.MABCL0390.Srch01_Rslt1R r_src : src){
				mcframe.serverMABC.MABCL0390.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> dest_Srch01_Sub, MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch01_Sub, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("sls_itm_grp_nm", "sls_itm_grp_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0320.Srch01_RsltR r_dest, mcframe.serverMABC.MABCL0320.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> dest, MCList<mcframe.serverMABC.MABCL0320.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(mcframe.serverMABC.MABCL0320.Srch01_RsltR r_src : src){
				mcframe.serverMABC.MABCL0320.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> dest_Srch01_Unit, MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch01_Unit, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("rnd_typ_nm", "rnd_typ_nm");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("pckg_flg", "pckg_flg");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0330.Srch01_RsltR r_dest, mcframe.serverMABC.MABCL0330.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> dest, MCList<mcframe.serverMABC.MABCL0330.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(mcframe.serverMABC.MABCL0330.Srch01_RsltR r_src : src){
				mcframe.serverMABC.MABCL0330.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> dest_Srch01_Lcl, MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> src0_0){
			down_SELECT_SUB3_c3_0(dest_Srch01_Lcl, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm_std", "itm_nm_std");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("lcl_nm", "lcl_nm");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_alt_nm1", "itm_alt_nm1");
				addColumnPathMap("itm_alt_nm2", "itm_alt_nm2");
				addColumnPathMap("itm_alt_nm3", "itm_alt_nm3");
				addColumnPathMap("itm_alt_nm4", "itm_alt_nm4");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABC.MABCL0380.Srch01_RsltR r_dest, mcframe.serverMABC.MABCL0380.Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> dest, MCList<mcframe.serverMABC.MABCL0380.Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(mcframe.serverMABC.MABCL0380.Srch01_RsltR r_src : src){
				mcframe.serverMABC.MABCL0380.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目マスタの登録を行います。<br>
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
		private final MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0390.Upd01_CndR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> up4;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0390.MABCL_ItmLst.Upd01 （{@link #ope01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション ope01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0390.MABCL_ItmLst.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0390.Upd01_Dtl1R&gt; （{@link #ope01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABC.MABCL0390.Upd01_CndR （{@link #ope01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL0390.MABCL_ItmLst.Upd01 ope01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> ope01_up0;
		public final mcframe.serverMABC.MABCL0390.Upd01_CndR ope01_up1;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.Upd01 （{@link #ope02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション ope02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR&gt; （{@link #ope02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.Upd01 ope02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> ope02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.Upd01 （{@link #ope03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション ope03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR&gt; （{@link #ope03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.Upd01 ope03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> ope03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.Upd01 （{@link #ope04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション ope04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR&gt; （{@link #ope04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.Upd01 ope04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> ope04_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.class);
			up1 = mcframe.serverMABC.MABCL0390.Upd01_CndR.create();
			up2 = MCList.create(mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			ope01 = mcframe.serverMABC.MABCL0390.MABCL_ItmLst.crtUpd01();
			ope02 = mcframe.serverMABC.MABCL0320.MABCL_ItmSubReg.crtUpd01();
			ope03 = mcframe.serverMABC.MABCL0330.MABCL_ItmUnitReg.crtUpd01();
			ope04 = mcframe.serverMABC.MABCL0380.MABCL_ItmLclReg.crtUpd01();
			
			// 連携オペレーションのコンテナ取得
			ope01_up0 = (MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R>)ope01.up(0);
			ope01_up1 = (mcframe.serverMABC.MABCL0390.Upd01_CndR)ope01.up(1);
			ope02_up0 = (MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR>)ope02.up(0);
			ope03_up0 = (MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR>)ope03.up(0);
			ope04_up0 = (MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR>)ope04.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, ope01);
			appendOpe(CALL_OPE02, ope02);
			appendOpe(CALL_OPE03, ope03);
			appendOpe(CALL_OPE04, ope04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0390.Upd01_Dtl1R&gt; （{@link #ope01_up0}）<br>
		 * up1() => mcframe.serverMABC.MABCL0390.Upd01_CndR （{@link #ope01_up1}）<br>
		 * CALL_OPE02<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR&gt; （{@link #ope02_up0}）<br>
		 * CALL_OPE03<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR&gt; （{@link #ope03_up0}）<br>
		 * CALL_OPE04<br>
		 * up4() => MCList&lt;mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR&gt; （{@link #ope04_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(ope01_up0, ope01_up1, up0(), up1());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(ope02_up0, up2());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(ope03_up0, up3());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(ope04_up0, up4());
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
		 * CALL_OPE04<br>
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
			if (key.equals(CALL_OPE04)) {
				down_CALL_OPE04();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ItmReg)MABCL_ItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Upd01_Dtl1R createUpd01_DtlR(){
			return mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0390.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMABC.MABCL0390.Upd01_CndR.create();
		}

		/**
		 * Upd01_SubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR createUpd01_SubR(){
			return mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_SubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> createUpd01_SubL(){
			return MCList.create(mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_UnitブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR createUpd01_UnitR(){
			return mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_UnitブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> createUpd01_UnitL(){
			return MCList.create(mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_LclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR createUpd01_LclR(){
			return mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_LclブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> createUpd01_LclL(){
			return MCList.create(mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dim_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dim</td></tr>
		 * 	<tr><td><br></td><td>wt_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>conts_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>conts_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>hs_cd</td></tr>
		 * 	<tr><td><br></td><td>jan_typ</td></tr>
		 * 	<tr><td><br></td><td>jan_cd</td></tr>
		 * 	<tr><td><br></td><td>itf_cd</td></tr>
		 * 	<tr><td><br></td><td>gtin_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1_c</td></tr>
		 * 	<tr><td><br></td><td>memo2_c</td></tr>
		 * 	<tr><td><br></td><td>memo3_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ship_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_rstr_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ref_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_itm</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_std_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_input_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_input_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_input_flg</td></tr>
		 * 	<tr><td><br></td><td>release_flg</td></tr>
		 * 	<tr><td><br></td><td>release_tm</td></tr>
		 * 	<tr><td><br></td><td>release_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_only_com_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0390.Upd01_CndR
		 */
		public mcframe.serverMABC.MABCL0390.Upd01_CndR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>pckg_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> up4() {
			return up4;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmReg)MABCL_ItmReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> dest0_0, mcframe.serverMABC.MABCL0390.Upd01_CndR dest0_1, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src_Upd01_Dtl, mcframe.serverMABC.MABCL0390.Upd01_CndR src_Upd01_Cnd){
			up_CALL_OPE01_ope01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_ope01_1(dest0_1, src_Upd01_Cnd);
		}
		
		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_ope01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_ope01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_ope01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("base_itm_nm", "base_itm_nm");
				addColumnPathMap("base_itm_alt_nm1", "base_itm_alt_nm1");
				addColumnPathMap("base_itm_alt_nm2", "base_itm_alt_nm2");
				addColumnPathMap("base_itm_alt_nm3", "base_itm_alt_nm3");
				addColumnPathMap("base_itm_alt_nm4", "base_itm_alt_nm4");
				addColumnPathMap("th_image_flg", "th_image_flg");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("dim_unit_cd", "dim_unit_cd");
				addColumnPathMap("dim", "dim");
				addColumnPathMap("wt_unit_cd", "wt_unit_cd");
				addColumnPathMap("wt", "wt");
				addColumnPathMap("conts_unit_cd", "conts_unit_cd");
				addColumnPathMap("conts_qty", "conts_qty");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("hs_cd", "hs_cd");
				addColumnPathMap("jan_typ", "jan_typ");
				addColumnPathMap("jan_cd", "jan_cd");
				addColumnPathMap("itf_cd", "itf_cd");
				addColumnPathMap("gtin_cd", "gtin_cd");
				addColumnPathMap("memo1_c", "memo1_c");
				addColumnPathMap("memo2_c", "memo2_c");
				addColumnPathMap("memo3_c", "memo3_c");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("co_cd", "co_cd");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("ac_itm_grp_cd", "ac_itm_grp_cd");
				addColumnPathMap("minus_stk_flg", "minus_stk_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("gi_alloc_flg", "gi_alloc_flg");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("ship_unit_cd", "ship_unit_cd");
				addColumnPathMap("mfg_unit_cd", "mfg_unit_cd");
				addColumnPathMap("purc_unit_cd", "purc_unit_cd");
				addColumnPathMap("pckg_unit_cd", "pckg_unit_cd");
				addColumnPathMap("pack_alloc_flg", "pack_alloc_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("bp_lot_flg", "bp_lot_flg");
				addColumnPathMap("insp_bind_typ", "insp_bind_typ");
				addColumnPathMap("skip_chk_ship_flg", "skip_chk_ship_flg");
				addColumnPathMap("mrkt_judg_flg", "mrkt_judg_flg");
				addColumnPathMap("mrkt_judg_role_cd", "mrkt_judg_role_cd");
				addColumnPathMap("mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_cd");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("lmt_ctl_categ", "lmt_ctl_categ");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("slo_sno1_flg", "slo_sno1_flg");
				addColumnPathMap("rqmt_sno1_flg", "rqmt_sno1_flg");
				addColumnPathMap("sno1_num_typ", "sno1_num_typ");
				addColumnPathMap("sno1_ptn_cd", "sno1_ptn_cd");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("slo_sno2_flg", "slo_sno2_flg");
				addColumnPathMap("rqmt_sno2_flg", "rqmt_sno2_flg");
				addColumnPathMap("sno2_num_typ", "sno2_num_typ");
				addColumnPathMap("sno2_ptn_cd", "sno2_ptn_cd");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("slo_sno3_flg", "slo_sno3_flg");
				addColumnPathMap("rqmt_sno3_flg", "rqmt_sno3_flg");
				addColumnPathMap("sno3_num_typ", "sno3_num_typ");
				addColumnPathMap("sno3_ptn_cd", "sno3_ptn_cd");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("slo_sno4_flg", "slo_sno4_flg");
				addColumnPathMap("rqmt_sno4_flg", "rqmt_sno4_flg");
				addColumnPathMap("sno4_num_typ", "sno4_num_typ");
				addColumnPathMap("sno4_ptn_cd", "sno4_ptn_cd");
				addColumnPathMap("def_bom_ptn", "def_bom_ptn");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_rstr_qty", "rqmt_rstr_qty");
				addColumnPathMap("inpt_itm_add_flg", "inpt_itm_add_flg");
				addColumnPathMap("inpt_itm_del_flg", "inpt_itm_del_flg");
				addColumnPathMap("sch_flg", "sch_flg");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("comp_spec_typ", "comp_spec_typ");
				addColumnPathMap("comp_rev_at_slo_flg", "comp_rev_at_slo_flg");
				addColumnPathMap("comp_core_itm_flg", "comp_core_itm_flg");
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slo_proc_flg", "slo_proc_flg");
				addColumnPathMap("slo_proc_typ", "slo_proc_typ");
				addColumnPathMap("ship_inst_typ", "ship_inst_typ");
				addColumnPathMap("ship_lot_back_stop_flg", "ship_lot_back_stop_flg");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("arr_skip_flg", "arr_skip_flg");
				addColumnPathMap("purc_dlv_slip_flg", "purc_dlv_slip_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("exim_xpns_typ", "exim_xpns_typ");
				addColumnPathMap("stk_lst_flg", "stk_lst_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("ref_itm_cd", "ref_itm_cd");
				addColumnPathMap("ref_itm_sub1", "ref_itm_sub1");
				addColumnPathMap("ref_itm_sub2", "ref_itm_sub2");
				addColumnPathMap("ref_itm_sub3", "ref_itm_sub3");
				addColumnPathMap("ext_sys_no_itm", "ext_sys_no_itm");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("calc_ptn_cd", "calc_ptn_cd");
				addColumnPathMap("cost_std_qty", "cost_std_qty");
				addColumnPathMap("itm_alc_grp", "itm_alc_grp");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("mfg_input_flg", "mfg_input_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("purc_input_flg", "purc_input_flg");
				addColumnPathMap("insp_flg", "insp_flg");
				addColumnPathMap("insp_input_flg", "insp_input_flg");
				addColumnPathMap("release_flg", "release_flg");
				addColumnPathMap("release_tm", "release_tm");
				addColumnPathMap("release_usr_cd", "release_usr_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_ope01_0(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_dest, mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_ope01_0(MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> dest, MCList<mcframe.serverMABC.MABCL0390.Upd01_Dtl1R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_ope01_0();
			for(mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_src : src){
				mcframe.serverMABC.MABCL0390.Upd01_Dtl1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_ope01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_ope01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_ope01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_ope01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_only_com_flg", "upd_only_com_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_ope01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_ope01_1(mcframe.serverMABC.MABCL0390.Upd01_CndR dest, mcframe.serverMABC.MABCL0390.Upd01_CndR src) {
			createMap_up_CALL_OPE01_ope01_1().copy(dest, src);
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> src_Upd01_Sub){
			up_CALL_OPE02_ope02_0(dest0_0, src_Upd01_Sub);
		}
		
		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_ope02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_ope02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_ope02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("sls_itm_grp_cd", "sls_itm_grp_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_ope02_0(mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_ope02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_ope02_0(MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_ope02_0();
			for(mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0320.ItmSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_ope02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> src_Upd01_Unit){
			up_CALL_OPE03_ope03_0(dest0_0, src_Upd01_Unit);
		}
		
		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_ope03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_ope03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_ope03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("pckg_flg", "pckg_flg");
				addColumnPathMap("unit_dim", "unit_dim");
				addColumnPathMap("unit_wt", "unit_wt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_ope03_0(mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_ope03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_ope03_0(MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_ope03_0();
			for(mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0330.ItmUnit_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_ope03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> src_Upd01_Lcl){
			up_CALL_OPE04_ope04_0(dest0_0, src_Upd01_Lcl);
		}
		
		/**
		 * 連携処理CALL_OPE04_ope04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_ope04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_ope04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_ope04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_ope04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_alt_nm1", "itm_alt_nm1");
				addColumnPathMap("itm_alt_nm2", "itm_alt_nm2");
				addColumnPathMap("itm_alt_nm3", "itm_alt_nm3");
				addColumnPathMap("itm_alt_nm4", "itm_alt_nm4");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_ope04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_ope04_0(mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_ope04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_ope04_0(MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_ope04_0();
			for(mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0380.ItmLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_ope04_0(r_dest, r_src);
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
		//-----------------------CALL_OPE04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE04(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}